package com.dicoding.tokolaptop

object ProductData {
    fun getProductData(): List<Product> {

        val productData = arrayListOf<Product>()
        val dummyProduct1 = Product(
            "Acer Aspire 3",
            "Productivity",
            "Highlights :\n" +
                    "• Modern design with narrow border display.\n" +
                    "• Dual Storage Support with up to 1TB SSD/2TB HDD.\n" +
                    "• Easy to share with 180 degree Lay Flat Design.\n" +
                    "\n" +
                    "Aspire 3 Slim (A314-35)\n" +
                    "• Processor : Intel® Celeron® N5100 Processor\n" +
                    "• OS : Windows 11 Home\n" +
                    "• Memory : 4 GB DDR4, upgradeable using 1x Slot SODIMM\n" +
                    "• Storage : 1 TB HDD\n" +
                    "• Inch, Res, Ratio, Panel : 14\" HD (1366 x 768) resolution Acer ComfyView™ (nonglare)\n" +
                    "• Graphics : Intel UHD Graphics\n" +
                    "• Features : Bluelight Shield Technology",
            "https://iili.io/JKA0pP1.png",
            "Rp4,899,000",
            "New",
            "1.5 kg",
            "Acer",
            "April 2019"
        )

        val dummyProduct2 = Product(
            "Acer Aspire 5",
            "Productivity",
            "Highlights:\n" +
                    "• Selesaikan Tugas Multimedia Kini 2X Lebih Cepat dengan MX350 Graphics\n" +
                    "• 20% Performa lebih baik dibandingkan 10th Gen series (i3-1005G1).\n" +
                    "• Processor : Intel® Core™ i3-1115G4 processor\n" +
                    "• OS : Windows 11 Home\n" +
                    "• Memory : 8 GB DDR4 (Dual Channel, Replaceable 1 Slot)\n" +
                    "• Storage : 512 GB SSD NVMe Gen3\n" +
                    "• Inch, Res, Ratio, Panel : 14\" HD Acer ComfyView™ LED-backlit TFT LCD\n" +
                    "• Graphics : Nvidia GeForce MX350 Graphics (2GB GDDR5)\n" +
                    "• Features : Wifi 6, HD Camera",
            "https://iili.io/JKAVOhv.png",
            "Rp7,199,000",
            "New",
            "1.5 kg",
            "Acer",
            "April 2019"
        )

        val dummyProduct3 = Product(
            "Acer Helios 300",
            "Gaming",
            "Highlights :\n" +
                    "• FPS lebih baik dengan display yang lebih smooth dengan Intel Processor generasi ke-1• Peningkatan up to 27% dr processor generasi sebelumnya. Dan meningkat up to ±10% dengan menggunakan Predator Sense.\n" +
                    "• Performance yang lebih stabil dan durabilitas yang lebih lama dengan +55% airflow yg lebih baik menggunakan 5th gen 3D Aeroblade Fan +14.1% liquid metal.\n" +
                    "• Performa grafis yang powerful dengan (Maximum Graphics Performance (MGP) up to 150W.\n" +
                    "• Lebih stylish dengan per switch RGB keyboard.\n" +
                    "• Rasakan pengalaman 3D secara realtime tanpa perlu kacamata 3D.\n" +
                    "\n" +
                    "Predator Helios 300 SpatialLabs™ Edition (PH315-55s-93XP)\n" +
                    "• Processor : Intel® Core™ i9-12900H processor (24MB cache, up to 5.00Ghz)\n" +
                    "• OS : Windows 11 Home\n" +
                    "• Memory : 2*16GB DDR5\n" +
                    "• Storage : 1TB SSD NVMe\n" +
                    "• Inch, Res, Ratio, Panel : 15.6\" UHD LED IPS, 100% sRGB\n" +
                    "• Graphics : NVIDIA® GeForce® RTX 3080 with 8 GB GDDR6\n" +
                    "\n" +
                    "Promotions :\n" +
                    "• Free Accidental Damage Protection\n" +
                    "• Free Microsoft Home and Office 2021\n" +
                    "• Cashback up to 2jt\n" +
                    "• Free 1 (one) AAA game\n" +
                    "• Free XBOX controller",
            "https://iili.io/JKAVg2t.png",
            "Rp54,999,000",
            "New",
            "2.5 kg",
            "Acer",
            "April 2021"
        )

        val dummyProduct4 = Product(
            "Acer Nitro 5",
            "Gaming",
            "Highlights :\n" +
                    "• FPS lebih baik dengan display yang lebih smooth dengan Intel Processor 12th gen dengan peningkatan performa hingga 27%\n" +
                    "• Performance yang lebih stabil dan durabilitas yang lebih lama dengan +25% airflow yg lebih baik menggunakan Acer CoolBoost (quad exhaust fan).\n" +
                    "• Dual slot NVMe, dengan max 2TB SSD.\n" +
                    "• Lebih stylish dengan 4 zones RGB keyboard.\n" +
                    "• Smoother display 2x smoother dari 60Hz refresh rate.\n" +
                    "\n" +
                    "Nitro 5 (AN515-58-76GJ)\n" +
                    "• Processor : Intel® Core™ i7-12700H processor (24MB cache, up to 4.70Ghz)\n" +
                    "• OS : Windows 11 Home\n" +
                    "• Memory : 1*16GB DDR4\n" +
                    "• Storage : 512GB SSD NVMe\n" +
                    "• Inch, Res, Ratio, Panel : 15.6\" FHD LED IPS 144Hz\n" +
                    "• Graphics : NVIDIA® GeForce® RTX 3050Ti with 4GB of GDDR6 (95W)\n" +
                    "\n" +
                    "Promotions :\n" +
                    "• Free Accidental Damage Protection\n" +
                    "• Free Microsoft Home and Office 2021\n" +
                    "• Cashback up to 2jt",
            "https://iili.io/JKAVNTJ.png",
            "Rp18,999,000",
            "New",
            "2.5 kg",
            "Acer",
            "6 August 2021"
        )

        val dummyProduct5 = Product(
            "Acer Swift",
            "Productivity",
            "Highlights :\n" +
                    "• Hygienic with Full Antimicrobial Solutions (on screen, touchpad, and all surfaces with ISO certified)\n" +
                    "• Highly Durable & lighweight with only 1kg with Mg-Li & Mg-Al metal chassis.\n" +
                    "• Easy to carry, smaller dimension with 90% body ratio display\n" +
                    "\n" +
                    "Swift 5 Antimicrobial (SF514-55TA)\n" +
                    "• Processor : Intel® Core™ i7-1165G7 processor (Intel EVO platform)\n" +
                    "• OS : Windows 11 Home\n" +
                    "• Memory : 16 GB LPDDR4X Dual Channel memory\n" +
                    "• Storage : 1 TB SSD NVMe Gen3\n" +
                    "• Inch, Res, Ratio, Panel : 14\" Touchscreen with Corning Gorilla Glass, IPS, Full HD (1920 x 1080), high-brightness (340 nits) Acer ComfyView™ LED-backlit TFT LCD, 100% sRGB\n" +
                    "• Graphics : Intel® Iris® Xe Graphics 96 EU\n" +
                    "• Features : Thunderbolt 4™, Fingerprint, Backlight",
            "https://iili.io/JKAVjpa.webp",
            "Rp25,025,000",
            "New",
            "1.4 kg",
            "Acer",
            "Mei 2021"
        )

        val dummyProduct6 = Product(
            "Asus Flow X 13",
            "Productivity",
            "Processor: AMD Ryzen 9 5900HS\n" +
                    "RAM: 2x 8GB DDR4\n" +
                    "SSD: 512GB\n" +
                    "VGA: NVIDIA GeForce RTX 3050 4GB\n" +
                    "Ukuran Layar: 13.4 inch FHD 120Hz IPS-level 300nits Touchscreen\n" +
                    "Pen\n" +
                    "Sistem Operasi: Windows 10 Home + Office Home and Student 2019\n" +
                    "\n" +
                    "Asus ROG Flow X13 adalah laptop gaming dengan layar 13 inci paling kencang saat ini. Laptop ini hadir dengan prosesor terbaru AMD Ryzen 9 5000 series dan GPU NVIDIA GeForce RTX 3000 series. Gaming lebih nyaman berkat dukungan layar 13.4 inci Full HD dengan refresh rate 120Hz.\n" +
                    "\n" +
                    "Asus ROG Flow X13 memiliki layar yang bisa diputar 360°. Anda bisa gunakan laptop dalam posisi standar, tent, stand, atau tablet. Gunakan laptop dalam posisi stand atau tent saat main game untuk bantu menurunkan suhu prosesor hingga 8°C. Modul pendingin laptop memiliki fitur pembersihan otomatis dan Liquid Metal Thermal Grizzly agar kinerja laptop tetap stabil. Inilah semua kelebihan laptop gaming 13 inci Asus ROG Flow X13.",
            "https://iili.io/JKAVeQR.png",
            "Rp26,731,000",
            "New",
            "2.1 kg",
            "Asus",
            "Des 2018"
        )

        val dummyProduct7 = Product(
            "Asus Vivobook Flip 14",
            "Productivity",
            "Processor : Intel® Celeron® N4020 Processor 1.1 GHz (4M Cache, up to 2.8 GHz, 2 cores)\n" +
                    "OS : Windows 11 Home + Office Home Student 2021\n" +
                    "RAM : 4GB DDR4 on board\n" +
                    "Storage : 256GB M.2 NVMe™ PCIe® 3.0 SSD\n" +
                    "Display : 14\" HD (1366 x 768) 16:9 aspect ratio Touch screen 45% NTSC color gamut 200nits\n" +
                    "Screen-to-body ratio : 74%\n" +
                    "Graphic : Intel® UHD Graphics 600\n" +
                    "Expansion Slot :\n" +
                    "1x M.2 2280 PCIe 3.0x2\n" +
                    "1x M.2 2280 PCIe 3.0x4\n" +
                    "Camera : VGA camera\n" +
                    "Wireless : Wi-Fi 5(802.11ac)+Bluetooth 4.2 (Dual band) 2*2\n" +
                    "FingerPrint : YES\n" +
                    "Keyboard : Chiclet Keyboard\n" +
                    "Battery : 39WHrs, 2S1P, 2-cell Li-ion\n" +
                    "AC Adapter : ø4.0, 33W AC Adapter, Output: 19V DC, 1.75A, 33W, Input: 100-240V AC 50/60Hz universal\n" +
                    "Weight (with Battery) : 1.50 kg\n" +
                    "I/O Port :\n" +
                    "1x micro HDMI 1.4\n" +
                    "1x 3.5mm Combo Audio Jack\n" +
                    "1x DC-in//1x Micro USB 2.0\n" +
                    "1x USB 3.2 Gen 1 Type-C//2 in1 card reader SD/MMC",
            "https://iili.io/JKAVvBp.png",
            "Rp7,258,000",
            "Second",
            "1.6 kg",
            "Asus",
            "January 2022"
        )

        val dummyProduct8 = Product(
            "Asus Vivobook 14",
            "Productivity",
            "Processor: Intel Core i7-1260P\n" +
                    "RAM: 8GB\n" +
                    "SSD: 512GB\n" +
                    "VGA: Intel UHD Graphics\n" +
                    "Ukuran Layar: 14 Inch FHD (1920 x 1080)\n" +
                    "Camera\n" +
                    "Fingerprint\n" +
                    "Konektivitas: Wifi + Bluetooth\n" +
                    "Sistem Operasi: Windows 11 Home + Office Home and Student 2021\n" +
                    "Laptop ASUS dengan Performa Mulus\n" +
                    "ASUS Vivobook 14 A1402 adalah laptop ASUS terbaru dengan performa yang ditingkatkan berkat Intel Core generasi ke-12. Peningkatan performanya naik signifikan dibanding pendahulunya. Laptop ini juga didukung RAM dan SSD kapasitas besar. Bisa simpan dan proses data lebih cepat, jadi Anda tidak perlu menghabiskan waktu untuk tunggu loading.",
            "https://iili.io/JKAV8EN.png",
            "Rp13,399,000",
            "New",
            "1.6 kg",
            "Asus",
            "July 2020"
        )

        val dummyProduct9 = Product(
            "Asus Zenbook Duo UX",
            "Productivity & Content Creator",
            "Processor: Intel Core i5-1155G7; Intel® Evo™ Platform\n" +
                    "RAM: 8GB LPDDR4X\n" +
                    "SSD: 512GB\n" +
                    "VGA : Iris Xe Graphics\n" +
                    "Ukuran Layar: 14 Inch FHD\n" +
                    "Konektivitas: Wifi + Bluetooth\n" +
                    "Sistem Operasi: Windows 11 Home\n" +
                    "Office Home and Student 2021\n" +
                    "\n" +
                    "ASUS ZenBook Duo 14: Dua Layar Untuk Kreativitas Optimal\n" +
                    "ASUS ZenBook Duo 14 merupakan laptop yang tak hanya menunjang produktivitas Anda, namun juga membuat Anda menjadi lebih bergaya dan stylish. Laptop ini sangat menunjang Anda yang bekerja di bidang kreatif seperti kreator konten, desainer grafis, dan semacamnya. Kemudian, laptop ASUS ZenBook Duo 14 ini didukung oleh layar sekunder ScreenPad Plus dengan desain kemirinagn yang menawarkan ergonomi sehingga Anda bisa bekerja menjadi lebih nyaman.\n" +
                    "\n" +
                    "Selain itu, layar utamanya hadir dengan ukuran 14 inci yang mengusung resolusi Full HD. Tak hanya itu saja, layarnya hadir dengan kecerahan hingga 400 nits dan sudah tervalidasi oleh PANTONE yang menjamin akurasi warna yang tinggi. Tentu ada kelebihan lain yang ditawarkan oleh ASUS ZenBook Duo 14, apa sajakah itu?",
            "https://iili.io/JKAVS4I.png",
            "Rp17,999,000",
            "Second",
            "2.0 kg",
            "Asus",
            "April 2021"
        )

        val dummyProduct10 = Product(
            "Asus Zephyrus G14",
            "Gaming",
            "Ukuran Layar: 14 inci\n" +
                    "Resolusi Layar: FHD (1920 x 1080 piksel)/WQHD (2560 x 1440 piksel)\n" +
                    "Sistem Operasi: Windows 10 Home\n" +
                    "Prosesor: AMD Ryzen 5 4600HS/AMD Ryzen 7 4800HS/AMD Ryzen 7 5800HS/AMD Ryzen 9 5900HS\n" +
                    "Grafis: NVIDIA GeForce GTX 1650 Ti/ RTX 3050/ RTX 3050 Ti/RTX 3060\n" +
                    "Memori: 8GB DDR4\n" +
                    "Penyimpanan: 512GB/1TB\n" +
                    "\n" +
                    "ROG Zephyrus G14 GA401 adalah salah satu seri produk gaming yang dikeluarkan oleh ASUS ROG. Hadir dengan layar berukuran 14 inci, perangkat ini didesain ringkas sehingga lebih praktis dibawa ke mana-mana. Bobot ASUS ROG Zephyrus G14 ini sendiri berkisar antara 1,6 hingga 1,7 kg.\n" +
                    "\n" +
                    "Dari sisi desain, sekilas bagian back cover ASUS ROG Zephyrus G14 ini terlihat minimalis dibandingkan produk sejenisnya. Namun, tampilannya tetap terlihat menarik karena tambahan fitur AniMe Matrix berupa 1214 mini LED yang bisa dikustomisasi untuk hadirkan efek tulisan, animasi atau grafis yang diinginkan.\n" +
                    "\n" +
                    "Kamu bahkan bisa menyesuaikan grafis tersebut dengan musik yang sedang berjalan. Meskipun begitu perlu kamu ketahui ada beberapa varian ASUS ROG Zephyrus G14 yang tidak dilengkapi fitur AniMe Matrix ini ya.",
            "https://iili.io/JKAV6ps.png",
            "Rp21,985,00",
            "New",
            "2.4 kg",
            "Asus",
            "November 2021"
        )

        val dummyProduct11 = Product(
            "HP Pavilion Gaming 15",
            "Gaming",
            "Processor: Intel Core i7-10750H\n" +
                    "RAM: 8GB\n" +
                    "Storage: 512GB SSD + 32GB Optane\n" +
                    "VGA: NVIDIA GeForce GTX 1660Ti 6GB\n" +
                    "Ukuran Layar: 15.6 Inch FHD Anti Glare 144Hz\n" +
                    "Konektivitas: Bluetooth + Wifi\n" +
                    "Sistem Operasi: Windows 10 Home + OHS 2019\n" +
                    "Pavilion Gaming 15-ec1076AX\n" +
                    "Charger\n" +
                    "\n" +
                    "Pengalaman Gaming Tak Terlupakan Dari HP Pavilion Gaming 15\n" +
                    "HP Pavilion Gaming 15 adalah laptop gaming yang memiliki performa bertenaga untuk kebutuhan gaming AAA terkini. Laptop ini tak hanya cocok untuk kebutuhan para gamers, namun juga para kreator konten. Kemudian, HP Pavilion Gaming 15 dibekali dengan layar 15.6 inci dengan resolusi Full HD desain bezel tipis Micro-Edge dan juga refresh rate 144 Hz sehingga Anda bisa mendapatkan visual yang lebih luas, jernih, mulus dan juga tajam. Tak hanya itu saja, laptop gaming dari HP ini hadir dengan solusi pendingin canggih yang mampu menjaga suhu agar tetap rendah bahkan di skenario berat seperti gaming. Untuk pengalaman gaming yang lebih mendalam, laptop dari HP ini disertai juga audio dari B&O yang memberikan suara jernih dan juga luar biasa. Tentu ada kelebihan lain yang ditawarkan oleh laptop gaming HP Pavilion Gaming 15, apa sajakah itu?",
            "https://iili.io/JKAVrYX.webp",
            "Rp19,474,500",
            "New",
            "2.4 kg",
            "HP",
            "February 2021"
        )

        val dummyProduct12 = Product(
            "HP Pavilion X360",
            "Productivity",
            "HP Pavilion x360 adalah laptop 2-in-1 dengan bobot 1.4kg. Hadir dengan layar 11\" dan resolusi 1366 x 768pixels, laptop ini dilengkapi tipe penyimpanan SSD berkapasitas 512GB dan RAM 8GB. Tertarik memiliki? Langsung saja beli dan dapatkan penawaran harga HP Pavilion x360 yang termurah mulai dari IDR14319000.",
            "https://iili.io/JKAV4vn.webp",
            "Rp14,319,000",
            "Second",
            "1.8 kg",
            "HP",
            "Jun 2021"
        )

        val dummyProduct13 = Product(
            "HP Spectre X360",
            "Productivity",
            "HP Spectre x360 dirakit dengan prosesor Intel Core yang super gesit, berkapasitas 8 GB Single Channel DDR3 dan layar 13 inci LED backlit display (touchscreen) dengan resolusi 1920 x 1080 Mp. Keterangan selengkapnya ada di bawah.",
            "https://iili.io/JKAVZCl.png",
            "Rp19,299,00",
            "New",
            "1.4 kg",
            "HP",
            "Mei 2022"
        )

        val dummyProduct14 = Product(
            "HP Victus 16",
            "Gaming",
            "HP Victus 16 merupakan laptop gaming dengan layar 16.1\" dan resolusi 1920 x 1080pixels. Laptop HP ini juga didukung dengan daya tahan baterai 7h. Tertarik beli? Dapatkan harga HP Victus 16 yang termurah yakni IDR15248000.",
            "https://iili.io/JKAVsjf.png",
            "Rp19,250,000",
            "New",
            "2.6 kg",
            "HP",
            "September 2022"
        )

        val dummyProduct15 = Product(
            "Lenovo Ideapad Gaming 3",
            "Gaming",
            "Processor : AMD Ryzen 5 5600H\n" +
                    "RAM : 8GB SO-DIMM DDR4\n" +
                    "SSD : 512GB\n" +
                    "VGA : NVIDIA GeForce RTX 3050 4GB\n" +
                    "Konektivitas : LAN + Wifi + Bluetooth\n" +
                    "Ukuran Layar : 15.6 Inch FHD\n" +
                    "Sistem Operasi : Windows 11 Home\n" +
                    "Software Lain : Office Home and Student\n" +
                    "Unit Utama\n" +
                    "\n" +
                    "Gaming Lancar dengan Harga Terjangkau\n" +
                    "Lenovo IdeaPad Gaming 3 adalah laptop gaming murah dengan performa spektakuler. Laptop gaming ini ditenagai prosesor AMD Ryzen 5000 Series dan grafik diskrit NVIDIA GeForce RTX 30 yang cepat. Mainkan game AAA mulus tanpa jeda. Laptop gaming ini dibekali RAM DDR4 dan SSD yang membuat Anda bisa mainkan game di pengaturan tinggi.",
            "https://iili.io/JKAViTG.webp",
            "Rp12,999,000",
            "Second",
            "2.4 kg",
            "Lenovo",
            "August 2022"
        )

        val dummyProduct16 = Product(
            "Lenovo Ideapad Gaming 3 2022",
            "Gaming",
            "Processor : AMD Ryzen 5 6600H\n" +
                    "RAM :8GB SO-DIMM DDR5\n" +
                    "SSD :512GB\n" +
                    "VGA : NVIDIA GeForce RTX 3050 4GB\n" +
                    "Konektivitas : Wifi + Bluetooth + LAN\n" +
                    "Ukuran Layar : 15.6 Inch FHD\n" +
                    "Sistem Operasi : Windows 11 Home\n" +
                    "Software Lain : Office Home and Student\n" +
                    "Unit Utama\n" +
                    "Varian : LENOVO IdeaPad Gaming 3 15ARH7 [82SB00B8ID] - Onyx Grey, Free Product : LENOVO Legion Shirt\n" +
                    "\n" +
                    "Gaming Lancar dengan Harga Terjangkau\n" +
                    "Lenovo IdeaPad Gaming 3 adalah laptop gaming murah dengan performa spektakuler. Laptop gaming ini ditenagai prosesor AMD Ryzen 6000 Series dan grafik diskrit NVIDIA GeForce RTX 30 yang cepat. Mainkan game AAA mulus tanpa jeda. Laptop gaming ini dibekali RAM DDR4 dan SSD yang membuat Anda bisa mainkan game di pengaturan tinggi.",
            "https://iili.io/JKAVyve.png",
            "Rp15,999,00",
            "New",
            "2.4 kg",
            "Lenovo",
            "July 2021"
        )

        val dummyProduct17 = Product(
            "Lenovo Ideapad S340",
            "Productivity",
            "Layar: FHD 14 inci, 1920 x 1080 piksel\n" +
                    "Prosesor: Intel Core i5 & i7/sampai dengan AMD Ryzen 7\n" +
                    "Sistem Operasi: Windows 10 Home\n" +
                    "RAM: 8 GB (versi AMD)/16GB (8GB+8GB) DDR4 (versi intel)\n" +
                    "Memori internal: 512GB (versi AMD) dan SSD PCIE 128GB/256GB/512GB/1TB M.2 (support NVMe), HDD SATA 1TB/2TB, Hybrid: (SSD+HDD) 128GB/256GB + 1TB HDD, 16GB Optane + 1TB HDD (versi Intel)\n" +
                    "Grafis: AMD integrated/NVIDIA GeForce MX230\n" +
                    "Dimensi: 323.6 x 228 x 17.9mm\n" +
                    "Berat: 1.69kg (versi AMD)/1.55 kg (versi intel)\n" +
                    "Warna: Onyx Black, Sand Pink, Abyss Blue, Platinum Grey\n",
            "https://iili.io/JKAVtG2.webp",
            "Rp6,860,00",
            "Second",
            "1.7 kg",
            "Lenovo",
            "January 2020"
        )

        val dummyProduct18 = Product(
            "Lenovo Legion 7i",
            "Gaming",
            "Prosesor: Intel Core i5/i7\n" +
                    "Kartu grafis: Intel Iris Xe (terintegrasi)/NVIDIA GeForce MX450\n" +
                    "Sistem operasi: Windows 11\n" +
                    "Layar: 14 inch\n" +
                    "Memory: 16 GB\n" +
                    "Storage: 512GB SSD/1 TB SSD\n" +
                    "Baterai: 61 Whr Lithium-Polymer\n" +
                    "Ukuran: 14.9-16.9mm x 312.4mm x 221.4mm\n" +
                    "Berat: 1.3 kg\n" +
                    "Warna: Slate Grey, Light Silver\n" +
                    "Konektivitas: WiFi 6, Bluetooth 5.0",
            "https://iili.io/JKAVm37.png",
            "Rp16,199,000",
            "New",
            "1.3 kg",
            "Lenovo",
            "September 2021"
        )

        val dummyProduct19 = Product(
            "Lenovo Thinkpad X1 Carbon",
            "Productivity",
            "Laptop Lenovo ThinkPad X1 Carbon adalah ultrabook dengan berat 1.2kg dan layar 14\" beresolusi 1920 x 1080pixels. Laptop ini didukung dengan RAM 16GB dan tipe penyimpanan SSD berkapasitas 512GB untuk hasilkan performa maksimal. Tertarik beli? Dapatkan penawaran harga Lenovo ThinkPad X1 Carbon yang termurah mulai dari IDR20899000.",
            "https://iili.io/JKAVD4S.webp",
            "Rp20,899,000",
            "Second",
            "1.9 kg",
            "Lenovo",
            "Des 2019"
        )

        val dummyProduct20 = Product(
            "MSI Stealth 15M",
            "Gaming",
            "The Ultimate Play GeForce RTX 30 Series with NVIDIA DLSS & Ray Tracing\n" +
                    "\n" +
                    "MSI STEALTH 15M B12UE I7 1260P 16GB 1TB SSD RTX3060 6GB 15.6″ FHD IPS 144Hz W11\n" +
                    "Pn : 9S7-15B111-017\n" +
                    "\n" +
                    "Spesifikasi :\n" +
                    "\n" +
                    "* Graphics : NVIDIA GeForce RTX 3060 Laptop GPU 6GB GDDR6\n" +
                    "Up to 1332MHz Boost Clock, 75W Maximum Graphics Power with Dynamic Boost\n" +
                    "* Processor : Intel Core i7-1260P Processor 18M Cache, up to 4.70 GHz\n" +
                    "* Display : 15.6″ FHD (1920*1080), 144Hz 45%NTSC IPS-Level\n" +
                    "* Memory : DDR4 16GB (8GB x 2)\n" +
                    "* Storage : 1TB NVMe PCIe SSD Gen4x4 w/o DRAM\n" +
                    "* Keyboard : Spectrum Backlight Keyboard\n" +
                    "* Webcam : HD type (30fps@720p)\n" +
                    "* Wireless : Intel Wi-Fi 6 AX201(2*2 ax) + Bluetooth 5.2\n" +
                    "* Connectivity : 1x (4K @ 60Hz) HDMI, 1x Type-C USB3.2 Gen2, 2x Type-A USB3.2 Gen1, 1x\n" +
                    "Type-C (USB3.2 Gen2 / DP)\n" +
                    "* Battery : 52 Battery (Whr) 3-Cell , 180W adapter\n" +
                    "* OS : Windows 11 Home\n" +
                    "* Color : Core Black\n" +
                    "* Free : Stealth Trooper Backpack\n" +
                    "* 2 Year Warranty Term for Gaming & Content Creation (SEA)",
            "https://iili.io/JKAVpa9.png",
            "Rp21,148,000",
            "New",
            "2.4 kg",
            "MSI",
            "Des 2020"
        )

        productData.add(dummyProduct1)
        productData.add(dummyProduct2)
        productData.add(dummyProduct3)
        productData.add(dummyProduct4)
        productData.add(dummyProduct5)
        productData.add(dummyProduct6)
        productData.add(dummyProduct7)
        productData.add(dummyProduct8)
        productData.add(dummyProduct9)
        productData.add(dummyProduct10)
        productData.add(dummyProduct11)
        productData.add(dummyProduct12)
        productData.add(dummyProduct13)
        productData.add(dummyProduct14)
        productData.add(dummyProduct15)
        productData.add(dummyProduct16)
        productData.add(dummyProduct17)
        productData.add(dummyProduct18)
        productData.add(dummyProduct19)
        productData.add(dummyProduct20)

        return productData
    }
}