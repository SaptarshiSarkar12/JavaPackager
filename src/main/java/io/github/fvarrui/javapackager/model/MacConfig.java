package io.github.fvarrui.javapackager.model;

import static io.github.fvarrui.javapackager.utils.NumberUtils.defaultIfNull;

import java.io.File;

import io.github.fvarrui.javapackager.packagers.Packager;

public class MacConfig {

	private File backgroundImage;
	private Integer windowWidth;
	private Integer windowHeight;
	private Integer windowX;
	private Integer windowY;
	private Integer iconSize;
	private Integer textSize;
	private Integer iconX;
	private Integer iconY;
	private Integer appsLinkIconX;
	private Integer appsLinkIconY;
	private File volumeIcon;
	private String volumeName;
	private boolean generateDmg = true;
	private boolean generatePkg = true;

	public File getBackgroundImage() {
		return backgroundImage;
	}

	public void setBackgroundImage(File backgroundImage) {
		this.backgroundImage = backgroundImage;
	}

	public Integer getWindowWidth() {
		return windowWidth;
	}

	public void setWindowWidth(Integer windowWidth) {
		this.windowWidth = windowWidth;
	}

	public Integer getWindowHeight() {
		return windowHeight;
	}

	public void setWindowHeight(Integer windowHeight) {
		this.windowHeight = windowHeight;
	}

	public Integer getWindowX() {
		return windowX;
	}

	public void setWindowX(Integer windowX) {
		this.windowX = windowX;
	}

	public Integer getWindowY() {
		return windowY;
	}

	public void setWindowY(Integer windowY) {
		this.windowY = windowY;
	}

	public Integer getIconSize() {
		return iconSize;
	}

	public void setIconSize(Integer iconSize) {
		this.iconSize = iconSize;
	}

	public Integer getTextSize() {
		return textSize;
	}

	public void setTextSize(Integer textSize) {
		this.textSize = textSize;
	}

	public Integer getIconX() {
		return iconX;
	}

	public void setIconX(Integer iconX) {
		this.iconX = iconX;
	}

	public Integer getIconY() {
		return iconY;
	}

	public void setIconY(Integer iconY) {
		this.iconY = iconY;
	}

	public Integer getAppsLinkIconX() {
		return appsLinkIconX;
	}

	public void setAppsLinkIconX(Integer appsLinkIconX) {
		this.appsLinkIconX = appsLinkIconX;
	}

	public Integer getAppsLinkIconY() {
		return appsLinkIconY;
	}

	public void setAppsLinkIconY(Integer appsLinkIconY) {
		this.appsLinkIconY = appsLinkIconY;
	}

	public File getVolumeIcon() {
		return volumeIcon;
	}

	public void setVolumeIcon(File volumeIcon) {
		this.volumeIcon = volumeIcon;
	}

	public String getVolumeName() {
		return volumeName;
	}

	public void setVolumeName(String volumeName) {
		this.volumeName = volumeName;
	}

	public boolean isGenerateDmg() {
		return generateDmg;
	}

	public void setGenerateDmg(boolean generateDmg) {
		this.generateDmg = generateDmg;
	}

	public boolean isGeneratePkg() {
		return generatePkg;
	}

	public void setGeneratePkg(boolean generatePkg) {
		this.generatePkg = generatePkg;
	}



	@Override
	public String toString() {
		return "[backgroundImage=" + backgroundImage + ", windowWidth=" + windowWidth + ", windowHeight="
				+ windowHeight + ", windowX=" + windowX + ", windowY=" + windowY + ", iconSize=" + iconSize
				+ ", textSize=" + textSize + ", iconX=" + iconX + ", iconY=" + iconY + ", appsLinkIconX="
				+ appsLinkIconX + ", appsLinkIconY=" + appsLinkIconY + ", volumeIcon=" + volumeIcon + ", volumeName="
				+ volumeName + ", generateDmg=" + generateDmg + ", generatePkg=" + generatePkg + "]";
	}

	/**
	 * Tests Mac OS X specific config and set defaults if not specified
	 * 
	 * @param packager
	 */
	public void setDefaults(Packager packager) {
		this.setWindowX(defaultIfNull(this.getWindowX(), 10));
		this.setWindowY(defaultIfNull(this.getWindowY(), 60));
		this.setWindowWidth(defaultIfNull(this.getWindowWidth(), 540));
		this.setWindowHeight(defaultIfNull(this.getWindowHeight(), 360));
		this.setIconSize(defaultIfNull(this.getIconSize(), 128));
		this.setTextSize(defaultIfNull(this.getTextSize(), 16));
		this.setIconX(defaultIfNull(this.getIconX(), 52));
		this.setIconY(defaultIfNull(this.getIconY(), 116));
		this.setAppsLinkIconX(defaultIfNull(this.getAppsLinkIconX(), 360));
		this.setAppsLinkIconY(defaultIfNull(this.getAppsLinkIconY(), 116));
	}

}