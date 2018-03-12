# This append is only for Yocto rocko. The change is planned for Sumo.

python do_install_append () {
    bb.build.exec_func('do_install_include', d)
}

do_install_include(){
	install -d ${D}${includedir}/apt-pkg
	for h in `find ${S}/apt-pkg ${S}/apt-inst -name '*.h'`
	do
		install -m 0644 $h ${D}${includedir}/apt-pkg
	done
}

