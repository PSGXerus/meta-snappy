SUMMARY = "Testscenarios, a pyunit extension for dependency injection"
HOMEPAGE = "https://launchpad.net/testscenarios"

LICENSE = "BSD & Apache-2.0"
LIC_FILES_CHKSUM = "file://COPYING;md5=70aaa9556bb750f9f517b5ad33b42fe4"

SRC_URI[md5sum] = "859073d9e7b049aee2e6704c51f6001a"
SRC_URI[sha256sum] = "c257cb6b90ea7e6f8fef3158121d430543412c9a87df30b5dde6ec8b9b57a2b6"

S = "${WORKDIR}/testscenarios-${PV}"

DEPENDS += "	python3-pbr-native (>=0.11) \
		python3-testtools-native \
"

inherit setuptools3 pypi native


