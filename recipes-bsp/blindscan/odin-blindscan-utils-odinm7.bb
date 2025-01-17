SRC_URI = "http://source.mynonpublic.com/download/odin-blindscan-utils-odinm7-${PV}-${SRC}.tar.gz"

PACKAGES = "odin-blindscan-dvbs-utils-odinm7 odin-blindscan-dvbc-utils-odinm7"

RPROVIDES_odin-blindscan-dvbc-utils-odinm7 += "virtual/blindscan-dvbc"
RPROVIDES_odin-blindscan-dvbs-utils-odinm7 += "virtual/blindscan-dvbs"

FILES_odin-blindscan-dvbc-utils-odinm7 = "${bindir}/tda1002x"
FILES_odin-blindscan-dvbs-utils-odinm7 = "${bindir}/${BLINDSCAN_BINARY}"

require odin-blindscan-utils.inc

SRC_URI[md5sum] = "ad68cc1977fb9566f77e1b16d907b849"
SRC_URI[sha256sum] = "559c14be8db4a0174932d0415ee4275944f6809690e65c64050c9a878a680b09"
