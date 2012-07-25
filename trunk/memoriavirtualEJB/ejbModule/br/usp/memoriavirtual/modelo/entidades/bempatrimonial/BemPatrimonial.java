package br.usp.memoriavirtual.modelo.entidades.bempatrimonial;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

import br.usp.memoriavirtual.modelo.entidades.Autoria;
import br.usp.memoriavirtual.modelo.entidades.EntidadeComMidia;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class BemPatrimonial extends EntidadeComMidia implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3790813768470746267L;

	/**
	 * 
	 */
	public BemPatrimonial() {
		super();
		this.descritores = new TreeSet<String>();
		this.fontesInformacao = new TreeSet<String>();
		this.titulos = new ArrayList<Titulo>();
		this.autorias = new ArrayList<Autoria>();
		this.intervencoes = new ArrayList<Intervencao>();
		this.pesquisadores = new ArrayList<Pesquisador>();
		this.bensrelacionados = new ArrayList<BemPatrimonial>();
	}

	protected boolean externo;
	protected String tipoDoBemPatrimonial;
	protected String numeroDeRegistro;
	protected String colecao;
	protected String localizacaoFisica;
	protected String latitude;
	protected String longitude;
	protected String caracteristicasFisTecExec;
	protected String conteudo;
	protected String meioDeAcesso;

	@ElementCollection(fetch = FetchType.EAGER)
	@CollectionTable(name = "BEMPATRIMONIAL_DESCRITORES", joinColumns = @JoinColumn(name = "BEMPATRIMONIAL_ID"))
	protected Set<String> descritores;

	@ElementCollection(fetch = FetchType.EAGER)
	@CollectionTable(name = "BEMPATRIMONIAL_FONTESINFORMACAO", joinColumns = @JoinColumn(name = "BEMPATRIMONIAL_ID"))
	protected Set<String> fontesInformacao;

	@ElementCollection(fetch = FetchType.EAGER)
	@Embedded
	@CollectionTable(name = "BEMPATRIMONIAL_TITULOS", joinColumns = @JoinColumn(name = "BEMPATRIMONIAL_ID"))
	protected List<Titulo> titulos;

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "bemPatrimonial", cascade = CascadeType.ALL)
	protected List<Autoria> autorias;

	@Embedded
	protected Producao producao;

	@Embedded
	protected DisponibilidadeUsoProtecao disponibilidadeUsoProtecao;

	@Embedded
	protected HistoricoProcedencia histtoricoProcedencia;

	@Embedded
	protected Diagnostico diagnostico;

	@ElementCollection
	@Embedded
	@CollectionTable(name = "BEMPATRIMONIAL_INTERVENCOES", joinColumns = @JoinColumn(name = "BEMPATRIMONIAL_ID"))
	protected List<Intervencao> intervencoes;

	@ElementCollection
	@Embedded
	@CollectionTable(name = "BEMPATRIMONIAL_PESQUISADORES", joinColumns = @JoinColumn(name = "BEMPATRIMONIAL_ID"))
	protected List<Pesquisador> pesquisadores;

	@OneToMany
	@JoinTable(name = "BEMPATRIMONIAL_BENSRELACIONADOS", inverseJoinColumns = @JoinColumn(name = "BENSRELACIONADOS_ID"), joinColumns = @JoinColumn(name = "BEMPATRIMONIAL_ID"))
	protected List<BemPatrimonial> bensrelacionados;

	/**
	 * @return the externo
	 */
	public boolean isExterno() {
		return externo;
	}

	/**
	 * @param externo
	 *            the externo to set
	 */
	public void setExterno(boolean externo) {
		this.externo = externo;
	}

	/**
	 * @return the tipoDoBemPatrimonial
	 */
	public String getTipoDoBemPatrimonial() {
		return tipoDoBemPatrimonial;
	}

	/**
	 * @param tipoDoBemPatrimonial
	 *            the tipoDoBemPatrimonial to set
	 */
	public void setTipoDoBemPatrimonial(String tipoDoBemPatrimonial) {
		this.tipoDoBemPatrimonial = tipoDoBemPatrimonial;
	}

	/**
	 * @return the numeroDeRegistro
	 */
	public String getNumeroDeRegistro() {
		return numeroDeRegistro;
	}

	/**
	 * @param numeroDeRegistro
	 *            the numeroDeRegistro to set
	 */
	public void setNumeroDeRegistro(String numeroDeRegistro) {
		this.numeroDeRegistro = numeroDeRegistro;
	}

	/**
	 * @return the colecao
	 */
	public String getColecao() {
		return colecao;
	}

	/**
	 * @param colecao
	 *            the colecao to set
	 */
	public void setColecao(String colecao) {
		this.colecao = colecao;
	}

	/**
	 * @return the localizacaoFisica
	 */
	public String getLocalizacaoFisica() {
		return localizacaoFisica;
	}

	/**
	 * @param localizacaoFisica
	 *            the localizacaoFisica to set
	 */
	public void setLocalizacaoFisica(String localizacaoFisica) {
		this.localizacaoFisica = localizacaoFisica;
	}

	/**
	 * @return the latitude
	 */
	public String getLatitude() {
		return latitude;
	}

	/**
	 * @param latitude
	 *            the latitude to set
	 */
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	/**
	 * @return the longitude
	 */
	public String getLongitude() {
		return longitude;
	}

	/**
	 * @param longitude
	 *            the longitude to set
	 */
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	/**
	 * @return the caracteristicasFisTecExec
	 */
	public String getCaracteristicasFisTecExec() {
		return caracteristicasFisTecExec;
	}

	/**
	 * @param caracteristicasFisTecExec
	 *            the caracteristicasFisTecExec to set
	 */
	public void setCaracteristicasFisTecExec(String caracteristicasFisTecExec) {
		this.caracteristicasFisTecExec = caracteristicasFisTecExec;
	}

	/**
	 * @return the conteudo
	 */
	public String getConteudo() {
		return conteudo;
	}

	/**
	 * @param conteudo
	 *            the conteudo to set
	 */
	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	/**
	 * @return the meioDeAcesso
	 */
	public String getMeioDeAcesso() {
		return meioDeAcesso;
	}

	/**
	 * @param meioDeAcesso
	 *            the meioDeAcesso to set
	 */
	public void setMeioDeAcesso(String meioDeAcesso) {
		this.meioDeAcesso = meioDeAcesso;
	}

	/**
	 * @return the fontesInformacao
	 */
	public Set<String> getFontesInformacao() {
		return fontesInformacao;
	}

	/**
	 * @return the autorias
	 */
	public List<Autoria> getAutorias() {
		return autorias;
	}

	/**
	 * @param autorias
	 *            the autorias to set
	 */
	public void setAutorias(List<Autoria> autorias) {
		this.autorias = autorias;
	}

	/**
	 * @return the producao
	 */
	public Producao getProducao() {
		return producao;
	}

	/**
	 * @param producao
	 *            the producao to set
	 */
	public void setProducao(Producao producao) {
		this.producao = producao;
	}

	/**
	 * @return the disponibilidadeUsoProtecao
	 */
	public DisponibilidadeUsoProtecao getDisponibilidadeUsoProtecao() {
		return disponibilidadeUsoProtecao;
	}

	/**
	 * @param disponibilidadeUsoProtecao
	 *            the disponibilidadeUsoProtecao to set
	 */
	public void setDisponibilidadeUsoProtecao(
			DisponibilidadeUsoProtecao disponibilidadeUsoProtecao) {
		this.disponibilidadeUsoProtecao = disponibilidadeUsoProtecao;
	}

	/**
	 * @return the histtoricoProcedencia
	 */
	public HistoricoProcedencia getHisttoricoProcedencia() {
		return histtoricoProcedencia;
	}

	/**
	 * @param histtoricoProcedencia
	 *            the histtoricoProcedencia to set
	 */
	public void setHisttoricoProcedencia(
			HistoricoProcedencia histtoricoProcedencia) {
		this.histtoricoProcedencia = histtoricoProcedencia;
	}

	/**
	 * @return the diagnostico
	 */
	public Diagnostico getDiagnostico() {
		return diagnostico;
	}

	/**
	 * @param diagnostico
	 *            the diagnostico to set
	 */
	public void setDiagnostico(Diagnostico diagnostico) {
		this.diagnostico = diagnostico;
	}

	/**
	 * @return the descritores
	 */
	public Set<String> getDescritores() {
		return descritores;
	}

	/**
	 * @return the titulos
	 */
	public List<Titulo> getTitulos() {
		return titulos;
	}

	/**
	 * @return the intervencoes
	 */
	public List<Intervencao> getIntervencoes() {
		return intervencoes;
	}

	/**
	 * @return the pesquisadores
	 */
	public List<Pesquisador> getPesquisadores() {
		return pesquisadores;
	}

	/**
	 * @return the bensrelacionados
	 */
	public List<BemPatrimonial> getBensrelacionados() {
		return bensrelacionados;
	}
}
