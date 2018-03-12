SUMMARY = "A utility library for mocking out the `requests` Python library."
HOMEPAGE = "https://github.com/getsentry/responses"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0e601511a8517f4daf688a8eb95be7a2"

SRC_URI[md5sum] = "59717ee0c134ce4a58af349ed624a63c"
SRC_URI[sha256sum] = "a64029dbc6bed7133e2c971ee52153f30e779434ad55a5abf40322bcff91d029"

DEPENDS += "	python3-six-native \
		python3-requests-native (>=2.0) \
		python3-cookies-native \
"

inherit setuptools3 pypi native


