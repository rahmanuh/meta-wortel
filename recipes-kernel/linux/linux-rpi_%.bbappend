# Include kernel configuration fragment
FILESEXTRAPATHS:prepend := "${THISDIR}//linux-rpi/files:"
SRC_URI += " file://version-fragments.cfg "

do_configure:append() {
        #this is run from
        #./tmp/work/imx6dlsabresd-poky-linux-gnueabi/linux-imx/4.1.15-r0/git
        cat ../version-fragments.cfg >> ${B}/.config
}
