package net.smktarunabhakti.penjualan.domain;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import antlr.collections.List;

@Entity
@Table(name="trx_jual_detail")
public class PenjualanDetail implements Serializable{
	@Id
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid")
	private String id;

	@ManyToOne
	private Penjualan header;

	@ManyToOne
	private Barang barang;

	@Column(name="jumlah_barang")
	private int jumlah;

	@Column(name="total_harga")
	private BigDecimal totalHarga;

}