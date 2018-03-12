SUMMARY = "A tiny LRU cache implementation and decorator"
HOMEPAGE = "http://www.repoze.org"

LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=2c33cdbc6bc9ae6e5d64152fdb754292 \
                    file://COPYRIGHT.txt;md5=614e972bec3279f0e551a33493954b34"

SRC_URI[md5sum] = "c08cc030387e0b1fc53c5c7d964b35e2"
SRC_URI[sha256sum] = "0429a75e19380e4ed50c0694e26ac8819b4ea7851ee1fc7583c8572db80aff77"

PYPI_PACKAGE = "repoze.lru"

do_install_append(){
	install -m 0644 ${S}/LICENSE.txt ${D}/${PYTHON_SITEPACKAGES_DIR}/repoze
	install -m 0644 ${S}/COPYRIGHT.txt ${D}/${PYTHON_SITEPACKAGES_DIR}/repoze
}

inherit setuptools3 pypi python3-dir native


