# This append installs the native python file-magic module
# matching the current version of file.

do_install_append_class-native(){
	install -d ${D}/${libdir}/${PYTHON_DIR}/site-packages
	install -m 0755 ${S}/python/magic.py ${D}/${libdir}/${PYTHON_DIR}/site-packages
	sed -i "/    def load(self, filename=None):/c\    def load(self, filename='${COMPONENTS_DIR}/${BUILD_ARCH}/${PN}/usr/share/misc/magic.mgc'):" ${D}/${libdir}/${PYTHON_DIR}/site-packages/magic.py
}

inherit python3-dir
