SUMMARY = "A library for deferring decorator actions"
HOMEPAGE = "http://pylonsproject.org"

LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=2c33cdbc6bc9ae6e5d64152fdb754292 \
                    file://COPYRIGHT.txt;md5=449584db8cda6485cdff4f6cee4a08d8"

SRC_URI[md5sum] = "56bc5e6756e4bda37bcdb94f74a72b8f"
SRC_URI[sha256sum] = "9902e492c71a89a241a18b2f9950bea7e41d025cc8f3af1ea8d8201346f8577d"

do_install_append(){
	install -m 0644 ${S}/LICENSE.txt ${D}/${PYTHON_SITEPACKAGES_DIR}/venusian
	install -m 0644 ${S}/COPYRIGHT.txt ${D}/${PYTHON_SITEPACKAGES_DIR}/venusian
}

inherit setuptools3 pypi python3-dir native

