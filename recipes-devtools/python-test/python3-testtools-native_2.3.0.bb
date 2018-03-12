SUMMARY = "Extensions to the Python standard library unit testing framework"
HOMEPAGE = "https://github.com/testing-cabal/testtools"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e2c9d3e8ba7141c83bfef190e0b9379a"

SRC_URI[md5sum] = "0f0feb915497816cb99e39437494217e"
SRC_URI[sha256sum] = "5827ec6cf8233e0f29f51025addd713ca010061204fdea77484a2934690a0559"

DEPENDS += "	python3-pbr-native (>=0.11) \
		python3-extras-native (>=1.0.0) \
		python3-python-mimeparse-native \
		python3-unittest2-native (>=1.0.0) \
		python3-traceback2-native \
		python3-six-native (>=1.4.0) \
"

inherit setuptools3 pypi native


