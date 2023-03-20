SUMMARY = "A kernel recipe that uses the linux-raspberrypi and oe-core"

inherit kernel
require recipes-kernel/linux/linux-raspberrypi.inc

SRC_URI = "git://github.com/raspberrypi/linux.git;name=machine;nocheckout=1;branch=rpi-6.2.y;protocol=https"

LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

LINUX_VERSION = "6.2.6"

SRCREV_machine="9193151ffed61a9081e0b118148c4024b1edb220"

PE = ""
PV = "${LINUX_VERSION}"
S = "${WORKDIR}/git"

KERNEL_FEATURES:remove = "cfg/fs/vfat.scc"

COMPATIBLE_MACHINE = "qemuarm|wortelqarm|raspberrypi3"
