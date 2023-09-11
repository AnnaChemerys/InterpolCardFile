USE `interpol_directory`;
DROP TABLE IF EXISTS `nationalities`;
CREATE TABLE `nationalities` (
  `id` int(3) NOT NULL AUTO_INCREMENT,
  `alpha_2_code` varchar(2) DEFAULT NULL,
  `alpha_3_code` varchar(3) DEFAULT NULL,
  `en_short_name` varchar(52) DEFAULT NULL,
  `nationality` varchar(39) DEFAULT NULL,
  `country_id` int(11) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`),
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=249;
INSERT INTO `countries` (`id`, `alpha_2_code`, `alpha_3_code`, `en_short_name`, `nationality`, `country_id`) VALUES
(1, 'AF', 'AFG', 'Afghanistan', 'Afghan', 1),
(2, 'AL', 'ALB', 'Albania', 'Albanian', 2),
(3, 'DZ', 'DZA', 'Algeria', 'Algerian', 3),
(4, 'AS', 'ASM', 'American Samoa', 'American Samoan', 4),
(5, 'AD', 'AND', 'Andorra', 'Andorran', 5),
(6, 'AO', 'AGO', 'Angola', 'Angolan', 6),
(7, 'AI', 'AIA', 'Anguilla', 'Anguillan', 7),
(8, 'AQ', 'ATA', 'Antarctica', 'Antarctic', 8),
(9, 'AG', 'ATG', 'Antigua and Barbuda', 'Antiguan or Barbudan', 9),
(10, 'AR', 'ARG', 'Argentina', 'Argentine', 10),
(11, 'AM', 'ARM', 'Armenia', 'Armenian', 11),
(12, 'AW', 'ABW', 'Aruba', 'Aruban', 12),
(13, 'AU', 'AUS', 'Australia', 'Australian', 13),
(14, 'AT', 'AUT', 'Austria', 'Austrian', 14),
(15, 'AZ', 'AZE', 'Azerbaijan', 'Azerbaijani, Azeri', 15),
(16, 'BS', 'BHS', 'Bahamas', 'Bahamian', 16),
(17, 'BH', 'BHR', 'Bahrain', 'Bahraini', 17),
(18, 'BD', 'BGD', 'Bangladesh', 'Bangladeshi', 18),
(19, 'BB', 'BRB', 'Barbados', 'Barbadian', 19),
(20, 'BY', 'BLR', 'Belarus', 'Belarusian', 20),
(21, 'BE', 'BEL', 'Belgium', 'Belgian', 21),
(22, 'BZ', 'BLZ', 'Belize', 'Belizean', 22),
(23, 'BJ', 'BEN', 'Benin', 'Beninese, Beninois', 23),
(24, 'BM', 'BMU', 'Bermuda', 'Bermudian, Bermudan', 24),
(25, 'BT', 'BTN', 'Bhutan', 'Bhutanese', 25),
(26, 'BO', 'BOL', 'Bolivia (Plurinational State of)', 'Bolivian', 26),
(27, 'BA', 'BIH', 'Bosnia and Herzegovina', 'Bosnian or Herzegovinian', 27),
(28, 'BW', 'BWA', 'Botswana', 'Motswana, Botswanan', 28),
(29, 'BV', 'BVT', 'Bouvet Island', 'Bouvet Island', 29),
(30, 'BR', 'BRA', 'Brazil', 'Brazilian', 30),
(31, 'IO', 'IOT', 'British Indian Ocean Territory', 'BIOT', 31),
(32, 'BN', 'BRN', 'Brunei Darussalam', 'Bruneian', 32),
(33, 'BG', 'BGR', 'Bulgaria', 'Bulgarian', 33),
(34, 'BF', 'BFA', 'Burkina Faso', 'Burkinabé', 34),
(35, 'BI', 'BDI', 'Burundi', 'Burundian', 35),
(36, 'KH', 'KHM', 'Cambodia', 'Cambodian', 36),
(37, 'CM', 'CMR', 'Cameroon', 'Cameroonian', 37),
(38, 'CA', 'CAN', 'Canada', 'Canadian', 38),
(39, 'CV', 'CPV', 'Cape Verde', 'Cape Verdean', 39),
(40, 'KY', 'CYM', 'Cayman Islands', 'Caymanian', 40),
(41, 'CF', 'CAF', 'Central African Republic', 'Central African', 41),
(42, 'TD', 'TCD', 'Chad', 'Chadian', 42),
(43, 'CL', 'CHL', 'Chile', 'Chilean', 43),
(44, 'CN', 'CHN', 'China', 'Chinese', 44),
(45, 'CX', 'CXR', 'Christmas Island', 'Christmas Island', 45),
(46, 'CC', 'CCK', 'Cocos (Keeling) Islands', 'Cocos Island', 46),
(47, 'CO', 'COL', 'Colombia', 'Colombian', 47),
(48, 'KM', 'COM', 'Comoros', 'Comoran, Comorian', 48),
(49, 'CG', 'COG', 'Congo (Republic of the)', 'Congolese', 49),
(50, 'CD', 'COD', 'Congo (Democratic Republic of the)', 'Congolese', 50),
(51, 'CK', 'COK', 'Cook Islands', 'Cook Island', 51),
(52, 'CR', 'CRI', 'Costa Rica', 'Costa Rican', 52),
(53, 'CI', 'CIV', 'Côte d'Ivoire', 'Ivorian', 53),
(54, 'HR', 'HRV', 'Croatia', 'Croatian', 54),
(55, 'CU', 'CUB', 'Cuba', 'Cuban', 55),
(56, 'CY', 'CYP', 'Cyprus', 'Cypriot', 56),
(57, 'CZ', 'CZE', 'Czech Republic', 'Czech', 57),
(58, 'DK', 'DNK', 'Denmark', 'Danish', 58),
(59, 'DJ', 'DJI', 'Djibouti', 'Djiboutian', 59),
(60, 'DM', 'DMA', 'Dominica', 'Dominican', 60),
(61, 'DO', 'DOM', 'Dominican Republic', 'Dominican', 61),
(62, 'TL', 'TLS', 'East Timor', 'East Timorese', 62);
(63, 'EC', 'ECU', 'Ecuador', 'Ecuadorian', 63),
(64, 'EG', 'EGY', 'Egypt', 'Egyptian', 64),
(65, 'SV', 'SLV', 'El Salvador', 'Salvadoran', 65),
(66, 'GQ', 'GNQ', 'Equatorial Guinea', 'Equatorial Guinean, Equatoguinean', 66),
(67, 'ER', 'ERI', 'Eritrea', 'Eritrean', 67),
(68, 'EE', 'EST', 'Estonia', 'Estonian', 68),
(69, 'ET', 'ETH', 'Ethiopia', 'Ethiopian', 69),
(70, 'XA', 'XAA', 'External Territories of Australia', Australian', 70),
(71, 'FK', 'FLK', 'Falkland Islands (Malvinas)', 'Falkland Island', 71),
(72, 'FO', 'FRO', 'Faroe Islands', 'Faroese', 72),
(73, 'FJ', 'FJI', 'Fiji', 'Fijian', 73),
(74, 'FI', 'FIN', 'Finland', 'Finnish', 74),
(75, 'FR', 'FRA', 'France', 'French', 75),
(76, 'GF', 'GUF', 'French Guiana', 'French Guianese', 76),
(77, 'PF', 'PYF', 'French Polynesia', 'French Polynesian', 77),
(78, 'TF', 'ATF', 'French Southern Territories', 'French Southern Territories', 78),
(79, 'GA', 'GAB', 'Gabon', 'Gabonese', 79),
(80, 'GM', 'GMB', 'Gambia', 'Gambian' 80),
(81, 'GE', 'GEO', 'Georgia', 'Georgian' 81),
(82, 'DE', 'DEU', 'Germany', 'German', 82),
(83, 'GH', 'GHA', 'Ghana', 'Ghanaian', 83),
(84, 'GI', 'GIB', 'Gibraltar', 'Gibraltar', 84),
(85, 'GR', 'GRC', 'Greece', 'Greek, Hellenic', 85),
(86, 'GL', 'GRL', 'Greenland', 'Greenlandic', 86),
(87, 'GD', 'GRD', 'Grenada', 'Grenadian', 87),
(88, 'GP', 'GLP', 'Guadeloupe', 'Guadeloupe', 88),
(89, 'GU', 'GUM', 'Guam', 'Guamanian, Guambat', 89),
(90, 'GT', 'GTM', 'Guatemala', 'Guatemalan', 90),
(91, 'GG', 'GGY', 'Guernsey', 'Channel Island', 91),
(92, 'GN', 'GIN', 'Guinea', 'Guinean', 92),
(93, 'GW', 'GNB', 'Guinea-Bissau', 'Bissau-Guinean', 93),
(94, 'GY', 'GUY', 'Guyana', 'Guyanese', 94),
(95, 'HT', 'HTI', 'Haiti', 'Haitian', 95),
(96, 'HM', 'HMD', 'Heard Island and McDonald Islands', 'Heard Island or McDonald Islands', 96),
(97, 'HN', 'HND', 'Honduras', 'Honduran', 97),
(98, 'HK', 'HKG', 'Hong Kong', 'Hong Kong, Hong Kongese', 98),
(99, 'HU', 'HUN', 'Hungary', 'Hungarian, Magyar', 99),
(100, 'IS', 'ISL', 'Iceland', 'Icelandic', 100),
(101, 'IN', 'IND', 'India', 'Indian', 101),
(102, 'ID', 'IDN', 'Indonesia', 'Indonesian', 102),
(103, 'IR', 'IRN', 'Iran', 'Iranian, Persian', 103),
(104, 'IQ', 'IRQ', 'Iraq', 'Iraqi', 104),
(105, 'IE', 'IRL', 'Ireland', 'Irish', 105),
(106, 'IL', 'ISR', 'Israel', 'Israeli', 106),
(107, 'IT', 'ITA', 'Italy', 'Italian', 107),
(108, 'JM', 'JAM', 'Jamaica', 'Jamaican', 108),
(109, 'JP', 'JPN', 'Japan', 'Japanese', 109),
(110, 'JE', 'JEY', 'Jersey', 'Channel Island', 110),
(111, 'JO', 'JOR', 'Jordan', 'Jordanian', 111),
(112, 'KZ', 'KAZ', 'Kazakhstan', 'Kazakhstani, Kazakh', 112),
(113, 'KE', 'KEN', 'Kenya', 'Kenyan', 113),
(114, 'KI', 'KIR', 'Kiribati', 'I-Kiribati', 114),
(115, 'KP', 'PRK', 'Korea (Democratic People's Republic of)', 'North Korean', 115),
(116, 'KR', 'KOR', 'Korea (Republic of)', 'South Korean', 116),
(117, 'KW', 'KWT', 'Kuwait', 'Kuwaiti', 117),
(118, 'KG', 'KGZ', 'Kyrgyzstan', 'Kyrgyzstani, Kyrgyz, Kirgiz, Kirghiz', 118),
(119, 'LA', 'LAO', 'Lao People's Democratic Republic', 'Lao, Laotian', 119),
(120, 'LV', 'LVA', 'Latvia', 'Latvian', 120),
(121, 'LB', 'LBN', 'Lebanon', 'Lebanese', 121),
(122, 'LS', 'LSO', 'Lesotho', 'Basotho', 122),
(123, 'LR', 'LBR', 'Liberia', 'Liberian', 123),
(124, 'LY', 'LBY', 'Libya', 'Libyan', 124),
(125, 'LI', 'LIE', 'Liechtenstein', 'Liechtenstein', 125),
(126, 'LT', 'LTU', 'Lithuania', 'Lithuanian', 126),
(127, 'LU', 'LUX', 'Luxembourg', 'Luxembourg, Luxembourgish', 127),
(128, 'MO', 'MAC', 'Macao', 'Macanese, Chinese', 128),
(129, 'MK', 'MKD', 'Macedonia (the former Yugoslav Republic of)', 'Macedonian', 129),
(130, 'MG', 'MDG', 'Madagascar', 'Malagasy', 130),
(131, 'MW', 'MWI', 'Malawi', 'Malawian', 131),
(132, 'MY', 'MYS', 'Malaysia', 'Malaysian', 132),
(133, 'MV', 'MDV', 'Maldives', 'Maldivian', 133),
(134, 'ML', 'MLI', 'Mali', 'Malian, Malinese', 134),
(135, 'MT', 'MLT', 'Malta', 'Maltese', 135),
(136, 'IM', 'IMN', 'Isle of Man', 'Manx', 136),
(137, 'MH', 'MHL', 'Marshall Islands', 'Marshallese', 137),
(138, 'MQ', 'MTQ', 'Martinique', 'Martiniquais, Martinican', 138),
(139, 'MR', 'MRT', 'Mauritania', 'Mauritanian', 139),
(140, 'MU', 'MUS', 'Mauritius', 'Mauritian', 140),
(141, 'YT', 'MYT', 'Mayotte', 'Mahoran', 141),
(142, 'MX', 'MEX', 'Mexico', 'Mexican', 142),
(143, 'FM', 'FSM', 'Micronesia (Federated States of)', 'Micronesian', 143),
(144, 'MD', 'MDA', 'Moldova (Republic of)', 'Moldovan', 144),
(145, 'MC', 'MCO', 'Monaco', 'Monégasque, Monacan', 145),
(146, 'MN', 'MNG', 'Mongolia', 'Mongolian', 146),
(147, 'MS', 'MSR', 'Montserrat', 'Montserratian', 147),
(148, 'MA', 'MAR', 'Morocco', 'Moroccan', 148),
(149, 'MZ', 'MOZ', 'Mozambique', 'Mozambican', 149),
(150, 'MM', 'MMR', 'Myanmar', 'Burmese', 150),
(151, 'NA', 'NAM', 'Namibia', 'Namibian', 151),
(152, 'NR', 'NRU', 'Nauru', 'Nauruan', 152),
(153, 'NP', 'NPL', 'Nepal', 'Nepali, Nepalese', 153),
(154, 'AN', 'NLD', 'Netherlands Antilles', 'Netherlands Antillean', 154),
(155, 'NL', 'NLD', 'Netherlands', 'Dutch, Netherlandic', 155),
(156, 'NC', 'NCL', 'New Caledonia', 'New Caledonian', 156),
(157, 'NZ', 'NZL', 'New Zealand', 'New Zealand, NZ', 157),
(158, 'NI', 'NIC', 'Nicaragua', 'Nicaraguan', 158),
(159, 'NE', 'NER', 'Niger', 'Nigerien', 159),
(160, 'NG', 'NGA', 'Nigeria', 'Nigerian', 160),
(161, 'NU', 'NIU', 'Niue', 'Niuean', 161),
(162, 'NF', 'NFK', 'Norfolk Island', 'Norfolk Island', 162),
(163, 'MP', 'MNP', 'Northern Mariana Islands', 'Northern Marianan', 163),
(164, 'NO', 'NOR', 'Norway', 'Norwegian', 164),
(165, 'OM', 'OMN', 'Oman', 'Omani', 165),
(166, 'PK', 'PAK', 'Pakistan', 'Pakistani', 166),
(167, 'PW', 'PLW', 'Palau', 'Palauan', 167),
(168, 'PS', 'PSE', 'Palestine, State of', 'Palestinian', 168),
(169, 'PA', 'PAN', 'Panama', 'Panamanian', 169),
(170, 'PG', 'PNG', 'Papua New Guinea', 'Papua New Guinean, Papuan', 170),
(171, 'PY', 'PRY', 'Paraguay', 'Paraguayan', 171),
(172, 'PE', 'PER', 'Peru', 'Peruvian', 172),
(173, 'PH', 'PHL', 'Philippines', 'Philippine, Filipino', 173),
(174, 'PN', 'PCN', 'Pitcairn', 'Pitcairn Island', 174),
(175, 'PL', 'POL', 'Poland', 'Polish', 175),
(176, 'PT', 'PRT', 'Portugal', 'Portuguese', 176),
(177, 'PR', 'PRI', 'Puerto Rico', 'Puerto Rican', 177),
(178, 'QA', 'QAT', 'Qatar', 'Qatari', 178),
(179, 'RE', 'REU', 'Réunion', 'Réunionese, Réunionnais', 179),
(180, 'RO', 'ROU', 'Romania', 'Romanian', 180),
(181, 'RU', 'RUS', 'Russian Federation', 'Russian', 181),
(182, 'RW', 'RWA', 'Rwanda', 'Rwandan', 182),
(183, 'SH', 'SHN', 'Saint Helena, Ascension and Tristan da Cunha', 'Saint Helenian', 183),
(184, 'KN', 'KNA', 'Saint Kitts and Nevis', 'Kittitian or Nevisian', 184),
(185, 'LC', 'LCA', 'Saint Lucia', 'Saint Lucian', 185),
(186, 'PM', 'SPM', 'Saint Pierre and Miquelon', 'Saint-Pierrais or Miquelonnais', 186),
(187, 'VC', 'VCT', 'Saint Vincent and the Grenadines', 'Saint Vincentian, Vincentian', 187),
(188, 'WS', 'WSM', 'Samoa', 'Samoan', 188),
(189, 'SM', 'SMR', 'San Marino', 'Sammarinese', 189),
(190, 'ST', 'STP', 'Sao Tome and Principe', 'São Toméan', 190),
(191, 'SA', 'SAU', 'Saudi Arabia', 'Saudi, Saudi Arabian', 191),
(192, 'SN', 'SEN', 'Senegal', 'Senegalese', 192),
(193, 'RS', 'SRB', 'Serbia', 'Serbian', 193),
(194, 'SC', 'SYC', 'Seychelles', 'Seychellois', 194),
(195, 'SL', 'SLE', 'Sierra Leone', 'Sierra Leonean', 195),
(196, 'SG', 'SGP', 'Singapore', 'Singaporean', 196),
(197, 'SK', 'SVK', 'Slovakia', 'Slovak', 197),
(198, 'SI', 'SVN', 'Slovenia', 'Slovenian, Slovene', 198),
(199, 'XG', 'XGA' 'Smaller Territories of the UK', 'British', 199),
(200, 'SB', 'SLB', 'Solomon Islands', 'Solomon Island', 200),
(201, 'SO', 'SOM', 'Somalia', 'Somali, Somalian', 201),
(202, 'ZA', 'ZAF', 'South Africa', 'South African', 202),
(203, 'GS', 'SGS', 'South Georgia and the South Sandwich Islands', 'South Georgia or South Sandwich Islands', 203),
(204, 'SS', 'SSD', 'South Sudan', 'South Sudanese', 204),
(205, 'ES', 'ESP', 'Spain', 'Spanish', 205),
(206, 'LK', 'LKA', 'Sri Lanka', 'Sri Lankan', 206),
(207, 'SD', 'SDN', 'Sudan', 'Sudanese', 207),
(208, 'SR', 'SUR', 'Suriname', 'Surinamese', 208),
(209, 'SJ', 'SJM', 'Svalbard and Jan Mayen', 'Svalbard', 209),
(210, 'SZ', 'SWZ', 'Swaziland', 'Swazi', 210),
(211, 'SE', 'SWE', 'Sweden', 'Swedish', 211),
(212, 'CH', 'CHE', 'Switzerland', 'Swiss', 212),
(213, 'SY', 'SYR', 'Syrian Arab Republic', 'Syrian', 213),
(214, 'TW', 'TWN', 'Taiwan', 'Taiwanese', 214),
(215, 'TJ', 'TJK', 'Tajikistan', 'Tajikistani', 215),
(216, 'TZ', 'TZA', 'Tanzania, United Republic of', 'Tanzanian', 216),
(217, 'TH', 'THA', 'Thailand', 'Thai', 217),
(218, 'TG', 'TGO', 'Togo', 'Togolese', 218),
(219, 'TK', 'TKL', 'Tokelau', 'Tokelauan', 219),
(220, 'TO', 'TON', 'Tonga', 'Tongan', 220),
(221, 'TT', 'TTO', 'Trinidad and Tobago', 'Trinidadian or Tobagonian', 221),
(222, 'TN', 'TUN', 'Tunisia', 'Tunisian', 222),
(223, 'TR', 'TUR', 'Turkey', 'Turkish', 223),
(224, 'TM', 'TKM', 'Turkmenistan', 'Turkmen', 224),
(225, 'TC', 'TCA', 'Turks and Caicos Islands', 'Turks and Caicos Island', 225),
(226, 'TV', 'TUV', 'Tuvalu', 'Tuvaluan', 226),
(227, 'UG', 'UGA', 'Uganda', 'Ugandan', 227),
(228, 'UA', 'UKR', 'Ukraine', 'Ukrainian', 228),
(229, 'AE', 'ARE', 'United Arab Emirates', 'Emirati, Emirian, Emiri', 229),
(230, 'GB', 'GBR', 'United Kingdom of Great Britain and Northern Ireland', 'British, UK', 230),
(231, 'US', 'USA', 'United States of America', 'American', 231),
(232, 'UM', 'UMI', 'United States Minor Outlying Islands', 'American', 232),
(233, 'UY', 'URY', 'Uruguay', 'Uruguayan', 233),
(234, 'UZ', 'UZB', 'Uzbekistan', 'Uzbekistani, Uzbek', 234),
(235, 'VU', 'VUT', 'Vanuatu', 'Ni-Vanuatu, Vanuatuan', 235),
(236, 'VA', 'VAT', 'Vatican City State', 'Vatican', 236),
(237, 'VE', 'VEN', 'Venezuela (Bolivarian Republic of)', 'Venezuelan', 237),
(238, 'VN', 'VNM', 'Vietnam', 'Vietnamese', 238),
(239, 'VG', 'VGB', 'Virgin Islands (British)', 'British Virgin Island', 239),
(240, 'VI', 'VIR', 'Virgin Islands (U.S.)', 'U.S. Virgin Island', 240),
(241, 'WF', 'WLF', 'Wallis and Futuna', 'Wallis and Futuna, Wallisian or Futunan', 241),
(242, 'EH', 'ESH', 'Western Sahara', 'Sahrawi, Sahrawian, Sahraouian', 242),
(243, 'YE', 'YEM', 'Yemen', 'Yemeni', 243),
(244, "ME", "MNE", "Montenegro", "Montenegrin", 244),
(245, 'ZM', 'ZMB', 'Zambia', 'Zambian', 245),
(246, 'ZW', 'ZWE', 'Zimbabwe', 'Zimbabwean', 246)