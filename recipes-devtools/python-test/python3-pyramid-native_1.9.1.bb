SUMMARY = "The Pyramid Web Framework, a Pylons project"
HOMEPAGE = "https://trypyramid.com"

LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=7bed6eadf4f2a84bda01adb5b515982b \
                    file://COPYRIGHT.txt;md5=c3604981a77a52f671450dd6b3ec3544"

SRC_URI[md5sum] = "0163e19c58c2d12976a3b6fdb57e052d"
SRC_URI[sha256sum] = "840f4bbd5994609340de35079da0d1dd94f79942e27818d5d8566f8009fb0b36"

DEPENDS += "	python3-zopeinterface-native (>=3.8.0) \
		python3-zopedeprecation-native (>=3.5.0) \
		python3-venusian-native (>=1.0a3) \
		python3-translationstring-native (>=0.4) \
		python3-setuptools-native \
		python3-repoze-lru-native (>=0.4) \
		python3-plaster-pastedeploy-native \
		python3-plaster-native \
		python3-hupper-native \
		python3-webob-native (>=1.7.0rc2) \
		python3-pastedeploy-native (>=1.5.0)\
"

do_install_append(){
	install -m 0644 ${S}/LICENSE.txt ${D}/${PYTHON_SITEPACKAGES_DIR}/pyramid
	install -m 0644 ${S}/COPYRIGHT.txt ${D}/${PYTHON_SITEPACKAGES_DIR}/pyramid
}

inherit setuptools3 pypi python3-dir native
