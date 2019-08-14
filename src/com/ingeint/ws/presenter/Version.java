package com.ingeint.ws.presenter;

import com.ingeint.base.BundleInfo;

public class Version {

	private String id;
	private String name;
	private String version;
	private String vendor;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public Version(String name, String id, String version, String vendor) {
		this.name = name;
		this.id = id;
		this.version = version;
		this.vendor = vendor;
	}

	public static Version copy(BundleInfo info) {
		return new Version(info.getBundleName(), info.getBundleID(), info.getBundleVersion(), info.getBundleVendor());
	}

}
