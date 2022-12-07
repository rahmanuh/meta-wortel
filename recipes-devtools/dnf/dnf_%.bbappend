FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRC_URI += " file://wortel.repo "

FILES:${PN} += " ${sysconfdir}/yum.repos.d/wortel.repo "

do_install:append() {
    install -d ${D}${sysconfdir}/yum.repos.d
    install -m 0644 ${WORKDIR}/wortel.repo ${D}${sysconfdir}/yum.repos.d
}
