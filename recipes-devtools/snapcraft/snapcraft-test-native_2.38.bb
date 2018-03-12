require snapcraft.inc

SRC_URI += "file://0003-don-t-use-hardcoded-xdelta3-path.patch"

S = "${WORKDIR}/snapcraft-${PV}"
GLIBC_DIR_YOCTO = "${COMPONENTS_DIR}/${TUNE_ARCH}/glibc"
OE_TERMINAL_EXPORTS += "GLIBC_DIR_YOCTO"
EXTRANATIVEPATH += "python3-native"

DEPENDS += " 	python3-codespell-native (=1.11.0) \
		python3-coverage-native (=4.1) \
		python3-flake8-native (=3.5.0) \
		python3-pyflakes-native (=1.6.0) \
		python3-fixtures-native (=3.0.0) \
		python3-mccabe-native (=0.6.1) \
		python3-mypy-native (=0.540) \
		python3-testscenarios-native (=0.5.0) \
		python3-pexpect-native (=4.2.0) \
		python3-pyftpdlib-native (=1.4.0) \
		python3-pyramid-native (=1.6) \
		xdelta3-native \
"

inherit python3native pythonnative
