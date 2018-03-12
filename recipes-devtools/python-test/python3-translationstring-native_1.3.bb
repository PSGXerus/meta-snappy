SUMMARY = "Utility library for i18n relied on by various Repoze and Pyramid packages"
HOMEPAGE = "http://pylonsproject.org"

LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=2b9c5a7e3979930ff2a19f1cb309bb7e \
                    file://COPYRIGHT.txt;md5=449584db8cda6485cdff4f6cee4a08d8"

SRC_URI[md5sum] = "a4b62e0f3c189c783a1685b3027f7c90"
SRC_URI[sha256sum] = "4ee44cfa58c52ade8910ea0ebc3d2d84bdcad9fa0422405b1801ec9b9a65b72d"

do_install_append(){
	install -m 0644 ${S}/LICENSE.txt ${D}/${PYTHON_SITEPACKAGES_DIR}/translationstring
	install -m 0644 ${S}/COPYRIGHT.txt ${D}/${PYTHON_SITEPACKAGES_DIR}/translationstring
}

inherit setuptools3 pypi python3-dir native

