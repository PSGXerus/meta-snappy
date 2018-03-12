SUMMARY = "Fixtures, reusable state for writing clean tests and more."
HOMEPAGE = "https://launchpad.net/python-fixtures"

LICENSE = "BSD & Apache-2.0"
LIC_FILES_CHKSUM = "file://COPYING;md5=239e2f4698b85aad5ed39bae5d2ef226"

SRC_URI[md5sum] = "cd6345b497a62fad739efee66346c2e0"
SRC_URI[sha256sum] = "fcf0d60234f1544da717a9738325812de1f42c2fa085e2d9252d8fff5712b2ef"

S = "${WORKDIR}/fixtures-${PV}"

DEPENDS += "	python3-pbr-native (>=0.11) \
		python3-six-native \
		python3-testtools-native (>=0.9.22) \
"

inherit setuptools3 pypi native

