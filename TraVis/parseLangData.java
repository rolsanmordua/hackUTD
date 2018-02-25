import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
public class parseLangData 
{
	public static void main(String[] args) 
	{

	}
	
	public static Map<String, ArrayList<String>> countryToLang()
	{
		String countryData = "      <td><a href/country/afghanistan\">Afghanistan</a></td>\n"+"      <td>Dari Persian, Pashtu (both official), other Turkic and minor languages</td>\n"+"      <td><a href/country/albania\">Albania</a></td>\n"+"      <td>Albanian (Tosk is the official dialect), Greek</td>\n"+"      <td><a href/country/algeria\">Algeria</a></td>\n"+"      <td>Arabic (official), French, Berber dialects</td>\n"+"      <td><a href/country/andorra\">Andorra</a></td>\n"+"      <td>Catalán (official), French, Castilian, Portuguese</td>\n"+"      <td><a href/country/angola\">Angola</a></td>\n"+"      <td>Portuguese (official), Bantu and other African languages</td>\n"+"      <td><a href/country/antigua-and-barbuda\">Antigua and Barbuda</a></td>\n"+"      <td>English (official), local dialects</td>\n"+"      <td><a href/country/argentina\">Argentina</a></td>\n"+"      <td>Spanish (official), English, Italian, German, French</td>\n"+"      <td><a href/country/armenia\">Armenia</a></td>\n"+"      <td>Armenian 98%, Yezidi, Russian</td>\n"+"      <td><a href/country/australia\">Australia</a></td>\n"+"      <td>English 79%, native and other languages</td>\n"+"      <td><a href/country/austria\">Austria</a></td>\n"+"      <td>German (official nationwide), Slovene, Croatian, Hungarian (each official in one region)</td>\n"+"      <td><a href/country/azerbaijan\">Azerbaijan</a></td>\n"+"      <td>Azerbaijani Turkic 89%, Russian 3%, Armenian 2%, other 6% (1995 est.)</td>\n"+"      <td><a href/country/bahamas\">Bahamas</a></td>\n"+"      <td>English (official), Creole (among Haitian immigrants)</td>\n"+"      <td><a href/country/bahrain\">Bahrain</a></td>\n"+"      <td>Arabic, English, Farsi, Urdu</td>\n"+"      <td><a href/country/bangladesh\">Bangladesh</a></td>\n"+"      <td>Bangla (official), English</td>\n"+"      <td><a href/country/barbados\">Barbados</a></td>\n"+"      <td>English</td>\n"+"      <td><a href/country/belarus\">Belarus</a></td>\n"+"      <td>Belorussian (White Russian), Russian, other</td>\n"+"      <td><a href/country/belgium\">Belgium</a></td>\n"+"      <td>Dutch (Flemish) 60%, French 40%, German less than 1% (all official)</td>\n"+"      <td><a href/country/belize\">Belize</a></td>\n"+"      <td>English (official), Spanish, Mayan, Garifuna (Carib), Creole</td>\n"+"      <td><a href/country/benin\">Benin</a></td>\n"+"      <td>French (official), Fon, Yoruba, tribal languages</td>\n"+"      <td><a href/country/bhutan\">Bhutan</a></td>\n"+"      <td>Dzongkha (official), Tibetan dialects (among Bhotes), Nepalese dialects (among Nepalese)</td>\n"+"      <td><a href/country/bolivia\">Bolivia</a></td>\n"+"      <td>Spanish, Quechua, Aymara (all official)</td>\n"+"      <td><a href/country/bosnia-and-herzegovina\">Bosnia and Herzegovina</a></td>\n"+"      <td>Bosnian, Croatian, Serbian</td>\n"+"      <td><a href/country/botswana\">Botswana</a></td>\n"+"      <td>English 2% (official), Setswana 78%, Kalanga 8%, Sekgalagadi 3%, other (2001)</td>\n"+"      <td><a href/country/brazil\">Brazil</a></td>\n"+"      <td>Portuguese (official), Spanish, English, French</td>\n"+"      <td><a href/country/brunei\">Brunei</a></td>\n"+"      <td>Malay (official), English, Chinese</td>\n"+"      <td><a href/country/bulgaria\">Bulgaria</a></td>\n"+"      <td>Bulgarian 85%, Turkish 10%, Roma 4%</td>\n"+"      <td><a href/country/burkina-faso\">Burkina Faso</a></td>\n"+"      <td>French (official), native African (Sudanic) languages 90%</td>\n"+"      <td><a href/country/burundi\">Burundi</a></td>\n"+"      <td>Kirundi and French (official), Swahili</td>\n"+"      <td><a href/country/cambodia\">Cambodia</a></td>\n"+"      <td>Khmer 95% (official), French, English</td>\n"+"      <td><a href/country/cameroon\">Cameroon</a></td>\n"+"      <td>French, English (both official), 24 major African language groups</td>\n"+"      <td><a href/country/canada\">Canada</a></td>\n"+"      <td>English 59.3%, French 23.2% (both official), other 17.5%</td>\n"+"      <td><a href/country/cape-verde\">Cape Verde</a></td>\n"+"      <td>Portuguese, Criuolo</td>\n"+"      <td><a href/country/central-african-republic\">Central African Republic</a></td>\n"+"      <td>French (official), Sangho (lingua franca, national), tribal languages</td>\n"+"      <td><a href/country/chad\">Chad</a></td>\n"+"      <td>French, Arabic (both official), Sara, more than 120 languages and dialects</td>\n"+"      <td><a href/country/chile\">Chile</a></td>\n"+"      <td>Spanish</td>\n"+"      <td><a href/country/china\">China</a></td>\n"+"      <td>Standard Chinese (Mandarin/Putonghua), Yue (Cantonese), Wu (Shanghaiese), Minbei (Fuzhou), Minnan (Hokkien-Taiwanese), Xiang, Gan, Hakka dialects, minority languages</td>\n"+"      <td><a href/country/colombia\">Colombia</a></td>\n"+"      <td>Spanish</td>\n"+"      <td><a href/country/comoros\">Comoros</a></td>\n"+"      <td>Arabic and French (both official), Shikomoro (Swahili/Arabic blend)</td>\n"+"      <td><a href/country/congo-democratic-republic\">Congo, Democratic Republic of the </a></td>\n"+"      <td>French (official), Lingala, Kingwana, Kikongo, Tshiluba</td>\n"+"      <td><a href/country/congo-republic\">Congo, Republic of</a></td>\n"+"      <td>French (official), Lingala, Monokutuba, Kikongo, many local languages and dialects</td>\n"+"      <td><a href/country/costa-rica\">Costa Rica</a></td>\n"+"      <td>Spanish (official), English</td>\n"+"      <td><a href/encyclopedia/places/africa/cote-divoire-political-geography/cote-divoire\">Côte d'Ivoire</a></td>\n"+"      <td>French (official) and African languages (Dioula esp.)</td>\n"+"      <td><a href/country/croatia\">Croatia</a></td>\n"+"      <td>Croatian 96% (official), other 4% (including Italian, Hungarian, Czech, Slovak, German)</td>\n"+"      <td><a href/country/cuba\">Cuba</a></td>\n"+"      <td>Spanish</td>\n"+"      <td><a href/country/cyprus\">Cyprus</a></td>\n"+"      <td>Greek, Turkish (both official), English</td>\n"+"      <td><a href/country/czech-republic\">Czech Republic</a></td>\n"+"      <td>Czech</td>\n"+"      <td><a href/country/denmark\">Denmark</a></td>\n"+"      <td>Danish, Faroese, Greenlandic (Inuit dialect), German, English is the predominant second language</td>\n"+"      <td><a href/country/djibouti\">Djibouti</a></td>\n"+"      <td>French and Arabic (both official), Somali, Afar</td>\n"+"      <td><a href/country/dominica\">Dominica</a></td>\n"+"      <td>English (official) and French patois</td>\n"+"      <td><a href/country/dominican-republic\">Dominican Republic</a></td>\n"+"      <td>Spanish</td>\n"+"      <td><a href/country/east-timor\">East Timor</a></td>\n"+"      <td>Tetum, Portuguese (official), Bahasa Indonesia, English, other indigenous languages, including Tetum, Galole, Mambae, and Kemak</td>\n"+"      <td><a href/country/ecuador\">Ecuador</a></td>\n"+"      <td>Spanish (official), Quechua, other Amerindian languages</td>\n"+"      <td><a href/country/egypt\">Egypt</a></td>\n"+"      <td>Arabic (official), English and French widely understood by educated classes</td>\n"+"      <td><a href/country/el-salvador\">El Salvador</a></td>\n"+"      <td>Spanish, Nahua (among some Amerindians)</td>\n"+"      <td><a href/country/equatorial-guinea\">Equatorial Guinea</a></td>\n"+"      <td>Spanish, French (both official), Pidgin English, Fang, Bubi, Ibo</td>\n"+"      <td><a href/country/eritrea\">Eritrea</a></td>\n"+"      <td>Afar, Arabic, Tigre and Kunama, Tigrinya, other Cushitic languages</td>\n"+"      <td><a href/country/estonia\">Estonia</a></td>\n"+"      <td>Estonian 67% (official), Russian 30%, other (2000)</td>\n"+"      <td><a href/country/ethiopia\">Ethiopia</a></td>\n"+"      <td>Amharic, Tigrigna, Orominga, Guaragigna, Somali, Arabic, English, over 70 others</td>\n"+"      <td><a href/country/fiji\">Fiji</a></td>\n"+"      <td>English (official), Fijian, Hindustani</td>\n"+"      <td><a href/country/finland\">Finland</a></td>\n"+"      <td>Finnish 92%, Swedish 6% (both official), small Sami- (Lapp) and Russian-speaking minorities</td>\n"+"      <td><a href/country/france\">France</a></td>\n"+"      <td>French 100%, rapidly declining regional dialects (Provençal, Breton, Alsatian, Corsican, Catalan, Basque, Flemish)</td>\n"+"      <td><a href/country/gabon\">Gabon</a></td>\n"+"      <td>French (official), Fang, Myene, Nzebi, Bapounou/Eschira, Bandjabi</td>\n"+"      <td><a href/country/gambia\">Gambia</a></td>\n"+"      <td>English (official), Mandinka, Wolof, Fula, other indigenous</td>\n"+"      <td><a href/people/who2-biography/river-phoenix\">Georgia</a></td>\n"+"      <td>Georgian 71% (official), Russian 9%, Armenian 7%, Azerbaijani 6%, other 7% (Abkhaz is the official language in Abkhazia)</td>\n"+"      <td><a href/country/germany\">Germany</a></td>\n"+"      <td>German</td>\n"+"      <td><a href/country/ghana\">Ghana</a></td>\n"+"      <td>English (official), African languages (including Akan, Moshi-Dagomba, Ewe, and Ga)</td>\n"+"      <td><a href/country/greece\">Greece</a></td>\n"+"      <td>Greek 99% (official), English, French</td>\n"+"      <td><a href/country/grenada\">Grenada</a></td>\n"+"      <td>English (official), French patois</td>\n"+"      <td><a href/country/guatemala\">Guatemala</a></td>\n"+"      <td>Spanish 60%, Amerindian languages 40% (23 officially recognized Amerindian languages, including Quiche, Cakchiquel, Kekchi, Mam, Garifuna, and Xinca)</td>\n"+"      <td><a href/country/guinea\">Guinea</a></td>\n"+"      <td>French (official), native tongues (Malinké, Susu, Fulani)</td>\n"+"      <td><a href/country/guinea-bissau\">Guinea-Bissau</a></td>\n"+"      <td>Portuguese (official), Criolo, African languages</td>\n"+"      <td><a href/country/guyana\">Guyana</a></td>\n"+"      <td>English (official), Amerindian dialects, Creole, Hindi, Urdu</td>\n"+"      <td><a href/country/haiti\">Haiti</a></td>\n"+"      <td>Creole and French (both official)</td>\n"+"      <td><a href/country/honduras\">Honduras</a></td>\n"+"      <td>Spanish (official), Amerindian dialects, English widely spoken in business</td>\n"+"      <td><a href/country/hungary\">Hungary</a></td>\n"+"      <td>Magyar (Hungarian) 94%, other 6%</td>\n"+"      <td><a href/country/iceland\">Iceland</a></td>\n"+"      <td>Icelandic, English, Nordic languages, German widely spoken</td>\n"+"      <td><a href/country/india\">India</a></td>\n"+"      <td>Hindi 30%, English, Bengali, Gujarati, Kashmiri, Malayalam, Marathi, Oriya, Punjabi, Tamil, Telugu, Urdu, Kannada, Assamese, Sanskrit, Sindhi (all official), Hindi/Urdu, 1,600+ dialects</td>\n"+"      <td><a href/country/indonesia\">Indonesia</a></td>\n"+"      <td>Bahasa Indonesia (official), English, Dutch, Javanese, and more than 580 other languages and dialects</td>\n"+"      <td><a href/country/iran\">Iran</a></td>\n"+"      <td>Persian and Persian dialects 58%, Turkic and Turkic dialects 26%, Kurdish 9%, Luri 2%, Balochi 1%, Arabic 1%, Turkish 1%, other 2%</td>\n"+"      <td><a href/country/iraq\">Iraq</a></td>\n"+"      <td>Arabic (official), Kurdish (official in Kurdish regions), Assyrian, Armenian</td>\n"+"      <td><a href/country/ireland\">Ireland</a></td>\n"+"      <td>English, Irish (Gaelic) (both official)</td>\n"+"      <td><a href/country/israel\">Israel</a></td>\n"+"      <td>Hebrew (official), Arabic, English</td>\n"+"      <td><a href/people/who2-biography/river-phoenix\">Italy</a></td>\n"+"      <td>Italian (official), German-, French-, and Slovene-speaking minorities</td>\n"+"      <td><a href/country/jamaica\">Jamaica</a></td>\n"+"      <td>English, Jamaican Creole</td>\n"+"      <td><a href/country/japan\">Japan</a></td>\n"+"      <td>Japanese</td>\n"+"      <td><a href/country/jordan\">Jordan</a></td>\n"+"      <td>Arabic (official), English</td>\n"+"      <td><a href/country/kazakhstan\">Kazakhstan</a></td>\n"+"      <td>Kazak (Qazaq, state language) 64%, Russian (official,used in everyday business) 95% (2001 est.)</td>\n"+"      <td><a href/country/kenya\">Kenya</a></td>\n"+"      <td>English (official), Swahili (national), and numerous indigenous languages</td>\n"+"      <td><a href/country/kiribati\">Kiribati</a></td>\n"+"      <td>English (official), I-Kiribati (Gilbertese)</td>\n"+"      <td><a href/country/korea-north\">Korea, North</a></td>\n"+"      <td>Korean</td>\n"+"      <td><a href/country/korea-south\">Korea, South</a></td>\n"+"      <td>Korean, English widely taught</td>\n"+"      <td><a href/world/countries-world/kosovo\">Kosovo</a></td>\n"+"      <td>Albanian (official), Serbian (official), Bosnian, Turkish, Roma</td>\n"+"      <td><a href/country/kuwait\">Kuwait</a></td>\n"+"      <td>Arabic (official), English</td>\n"+"      <td><a href/country/kyrgyzstan\">Kyrgyzstan</a></td>\n"+"      <td>Kyrgyz, Russian (both official)</td>\n"+"      <td><a href/country/laos\">Laos</a></td>\n"+"      <td>Lao (official), French, English, various ethnic languages</td>\n"+"      <td><a href/country/latvia\">Latvia</a></td>\n"+"      <td>Latvian 58% (official), Russian 38%, Lithuanian, other (2000)</td>\n"+"      <td><a href/country/lebanon\">Lebanon</a></td>\n"+"      <td>Arabic (official), French, English, Armenian</td>\n"+"      <td><a href/country/lesotho\">Lesotho</a></td>\n"+"      <td>English, Sesotho (both official), Zulu, Xhosa</td>\n"+"      <td><a href/country/liberia\">Liberia</a></td>\n"+"      <td>English 20% (official), some 20 ethnic-group languages</td>\n"+"      <td><a href/country/libya\">Libya</a></td>\n"+"      <td>Arabic, Italian, and English widely understood in major cities</td>\n"+"      <td><a href/country/liechtenstein\">Liechtenstein</a></td>\n"+"      <td>German (official), Alemannic dialect</td>\n"+"      <td><a href/country/lithuania\">Lithuania</a></td>\n"+"      <td>Lithuanian 82% (official), Russian 8%, Polish 6% (2001)</td>\n"+"      <td><a href/country/luxembourg\">Luxembourg</a></td>\n"+"      <td>Luxermbourgish (national) French, German (both administrative)</td>\n"+"      <td><a href/country/macedonia\">Macedonia </a></td>\n"+"      <td>Macedonian 67%, Albanian 25% (both official), Turkish 4%, Roma 2%, Serbian 1% (2002)</td>\n"+"      <td><a href/country/madagascar\">Madagascar</a></td>\n"+"      <td>Malagasy and French (both official)</td>\n"+"      <td><a href/country/malawi\">Malawi</a></td>\n"+"      <td>Chichewa 57.2% (official), Chinyanja 12.8%, Chiyao 10.1%, Chitumbuka 9.5%, Chisena 2.7%, Chilomwe 2.4%, Chitonga 1.7%, other 3.6% (1998)</td>\n"+"      <td><a href/country/malaysia\">Malaysia</a></td>\n"+"      <td>Bahasa Melayu (Malay, official), English, Chinese dialects (Cantonese, Mandarin, Hokkien, Hakka, Hainan, Foochow), Tamil, Telugu, Malayalam, Panjabi, Thai, several indigenous languages (including Iban, Kadazan) in East Malaysia</td>\n"+"      <td><a href/country/maldives\">Maldives</a></td>\n"+"      <td>Maldivian Dhivehi (official), English spoken by most government officials</td>\n"+"      <td><a href/country/mali\">Mali</a></td>\n"+"      <td>French (official), Bambara 80%, numerous African languages</td>\n"+"      <td><a href/country/malta\">Malta</a></td>\n"+"      <td>Maltese and English (both official)</td>\n"+"      <td><a href/country/marshall-islands\">Marshall Islands</a></td>\n"+"      <td>Marshallese 98% (two major dialects from the Malayo-Polynesian family), English widely spoken as a second language (both official), Japanese</td>\n"+"      <td><a href/country/mauritania\">Mauritania</a></td>\n"+"      <td>Hassaniya Arabic (official), Pulaar, Soninke, French, Wolof</td>\n"+"      <td><a href/country/mauritius\">Mauritius</a></td>\n"+"      <td>English less than 1% (official), Creole 81%, Bojpoori 12%, French 3% (2000)</td>\n"+"      <td><a href/country/mexico\">Mexico</a></td>\n"+"      <td>Spanish, various Mayan, Nahuatl, and other regional indigenous languages</td>\n"+"      <td><a href/country/micronesia\">Micronesia</a></td>\n"+"      <td>English (official,common), Chukese, Pohnpeian, Yapase, Kosrean, Ulithian, Woleaian, Nukuoro, Kapingamarangi</td>\n"+"      <td><a href/country/moldova\">Moldova</a></td>\n"+"      <td>Moldovan (official,virtually the same as Romanian), Russian, Gagauz (a Turkish dialect)</td>\n"+"      <td><a href/country/monaco\">Monaco</a></td>\n"+"      <td>French (official), English, Italian, Monégasque</td>\n"+"      <td><a href/country/mongolia\">Mongolia</a></td>\n"+"      <td>Mongolian, 90%, also Turkic and Russian (1999)</td>\n"+"      <td><a href/country/montenegro\">Montenegro</a></td>\n"+"      <td>Serbian/Montenegrin (Ijekavian dialect—official)</td>\n"+"      <td><a href/country/morocco\">Morocco</a></td>\n"+"      <td>Arabic (official), Berber dialects, French often used for business, government, and diplomacy</td>\n"+"      <td><a href/country/mozambique\">Mozambique</a></td>\n"+"      <td>Portuguese 9% (official,second language of 27%), Emakhuwa 26%, Xichangana 11%, Elomwe 8%, Cisena 7%, Echuwabo 6%, other Mozambican languages 32% (1997)</td>\n"+"      <td><a href/country/myanmar\">Myanmar</a></td>\n"+"      <td>Burmese, minority languages</td>\n"+"      <td><a href/country/namibia\">Namibia</a></td>\n"+"      <td>English 7% (official), Afrikaans is common language of most of the population and of about 60% of the white population, German 32%, indigenous languages: Oshivambo, Herero, Nama</td>\n"+"      <td><a href/country/nauru\">Nauru</a></td>\n"+"      <td>Nauruan (official), English</td>\n"+"      <td><a href/country/nepal\">Nepal</a></td>\n"+"      <td>Nepali 48% (official), Maithali 12%, Bhojpuri 7%, Tharu 6%, Tamang 5%, others. English spoken by many in government and business (2001)</td>\n"+"      <td><a href/country/netherlands\">Netherlands</a></td>\n"+"      <td>Dutch, Frisian (both official)</td>\n"+"      <td><a href/country/new-zealand\">New Zealand</a></td>\n"+"      <td>English, Maori (both official)</td>\n"+"      <td><a href/country/nicaragua\">Nicaragua</a></td>\n"+"      <td>Spanish 98% (official), English and indigenous languages on Atlantic coast (1995)</td>\n"+"      <td><a href/people/who2-biography/river-phoenix\">Niger</a></td>\n"+"      <td>French (official), Hausa, Djerma</td>\n"+"      <td><a href/country/nigeria\">Nigeria</a></td>\n"+"      <td>English (official), Hausa, Yoruba, Ibo, Fulani, and more than 200 others</td>\n"+"      <td><a href/country/norway\">Norway</a></td>\n"+"      <td>Bokmål Norwegian, Nynorsk Norwegian (both official), small Sami- and Finnish-speaking minorities (Sami is official in six municipalities)</td>\n"+"      <td><a href/country/oman\">Oman</a></td>\n"+"      <td>Arabic (official), English, Baluchi, Urdu, Indian dialects</td>\n"+"      <td><a href/country/pakistan\">Pakistan</a></td>\n"+"      <td>Urdu 8%, English (both official), Punjabi 48%, Sindhi 12%, Siraiki (a Punjabi variant) 10%, Pashtu 8%, Balochi 3%, Hindko 2%, Brahui 1%, Burushaski, and others 8%</td>\n"+"      <td><a href/country/palau\">Palau</a></td>\n"+"      <td>Palauan 64.7%, English 9.4%, Sonsoralese, Tobi, Angaur (each official on some islands), Filipino 13.5%, Chinese 5.7%, Carolinian 1.5%, Japanese 1.5%, other Asian 2.3%, other languages 1.5% (2000)</td>\n"+"      <td><a href/country/palestinian-state-proposed\">Palestinian State</a></td>\n"+"      <td>Arabic, Hebrew, English</td>\n"+"      <td><a href/country/panama\">Panama</a></td>\n"+"      <td>Spanish (official), English 14%, many bilingual</td>\n"+"      <td><a href/country/papua-new-guinea\">Papua New Guinea</a></td>\n"+"      <td>Tok Pisin (Melanesian Pidgin, the lingua franca), Hiri Motu (in Papua region), English 1%–2%, 715 indigenous languages</td>\n"+"      <td><a href/country/paraguay\">Paraguay</a></td>\n"+"      <td>Spanish, Guaraní (both official)</td>\n"+"      <td><a href/country/peru\">Peru</a></td>\n"+"      <td>Spanish, Quéchua (both official), Aymara, many minor Amazonian languages</td>\n"+"      <td><a href/country/philippines\">Philippines</a></td>\n"+"      <td>Filipino (based on Tagalog), English (both official), eight major dialects: Tagalog, Cebuano, Ilocano, Hiligaynon or Ilonggo, Bicol, Waray, Pampango, and Pangasinense</td>\n"+"      <td><a href/country/poland\">Poland</a></td>\n"+"      <td>Polish 98% (2002)</td>\n"+"      <td><a href/country/portugal\">Portugal</a></td>\n"+"      <td>Portuguese (official), Mirandese (official,but locally used)</td>\n"+"      <td><a href/country/qatar\">Qatar</a></td>\n"+"      <td>Arabic (official), English a common second language</td>\n"+"      <td><a href/country/romania\">Romania</a></td>\n"+"      <td>Romanian (official), Hungarian, German</td>\n"+"      <td><a href/country/russia\">Russia</a></td>\n"+"      <td>Russian, others</td>\n"+"      <td><a href/country/rwanda\">Rwanda</a></td>\n"+"      <td>Kinyarwanda, French, and English (all official), Kiswahili in commercial centers</td>\n"+"      <td><a href/country/st-kitts-and-nevis\">St. Kitts and Nevis</a></td>\n"+"      <td>English</td>\n"+"      <td><a href/country/st-lucia\">St. Lucia</a></td>\n"+"      <td>English (official), French patois</td>\n"+"      <td><a href/country/st-vincent-and-grenadines\">St. Vincent and the Grenadines</a></td>\n"+"      <td>English, French patois</td>\n"+"      <td><a href/country/samoa\">Samoa</a></td>\n"+"      <td>Samoan, English</td>\n"+"      <td><a href/country/san-marino\">San Marino</a></td>\n"+"      <td>Italian</td>\n"+"      <td><a href/people/who2-biography/river-phoenix\">São Tomé and Príncipe</a></td>\n"+"      <td>Portuguese (official)</td>\n"+"      <td><a href/country/saudi-arabia\">Saudi Arabia</a></td>\n"+"      <td>Arabic</td>\n"+"      <td><a href/country/senegal\">Senegal</a></td>\n"+"      <td>French (official), Wolof, Pulaar, Jola, Mandinka</td>\n"+"      <td><a href/country/serbia\">Serbia</a></td>\n"+"      <td>Serbian (official), Romanian, Hungarian, Slovak, and Croatian (all official in Vojvodina), Albanian (official in Kosovo)</td>\n"+"      <td><a href/country/seychelles\">Seychelles</a></td>\n"+"      <td>Seselwa Creole 92%, English 5%, French (all official) (2002)</td>\n"+"      <td><a href/country/sierra-leone\">Sierra Leone</a></td>\n"+"      <td>English (official), Mende (southern vernacular), Temne (northern vernacular), Krio (lingua franca)</td>\n"+"      <td><a href/country/singapore\">Singapore</a></td>\n"+"      <td>Mandarin 35%, English 23%, Malay 14.1%, Hokkien 11.4%, Cantonese 5.7%, Teochew 4.9%, Tamil 3.2%, other Chinese dialects 1.8%, other 0.9% (2000)</td>\n"+"      <td><a href/country/slovakia\">Slovakia</a></td>\n"+"      <td>Slovak 84% (official), Hungarian 11%, Roma 2%, Ukrainian 1% (2001)</td>\n"+"      <td><a href/country/slovenia\">Slovenia</a></td>\n"+"      <td>Slovenian 91%, Serbo-Croatian 5% (2002)</td>\n"+"      <td><a href/country/solomon-islands\">Solomon Islands</a></td>\n"+"      <td>English 1%–2% (official), Melanesian Pidgin (lingua franca), 120 indigenous languages</td>\n"+"      <td><a href/country/somalia\">Somalia</a></td>\n"+"      <td>Somali (official), Arabic, English, Italian</td>\n"+"      <td><a href/country/south-africa\">South Africa</a></td>\n"+"      <td>IsiZulu 23.8%, IsiXhosa 17.6%, Afrikaans 13.3%, Sepedi 9.4%, English 8.2%, Setswana 8.2%, Sesotho 7.9%, Xitsonga 4.4%, other 7.2%</td>\n"+"      <td><a href/world/countries-world/south-sudan\">South Sudan</a></td>\n"+"      <td>English (official), Arabic (includes Juba and Sudanese variants) (official), regional languages include Dinka, Nuer, Bari, Zande, Shilluk</td>\n"+"      <td><a href/country/spain\">Spain</a></td>\n"+"      <td>Castilian Spanish 74% (official nationwide), Catalan 17%, Galician 7%, Basque 2% (each official regionally)</td>\n"+"      <td><a href/country/sri-lanka\">Sri Lanka</a></td>\n"+"      <td>Sinhala 74% (official and national), Tamil 18% (national), other 8%, English is commonly used in government and spoken competently by about 10%</td>\n"+"      <td><a href/country/sudan\">Sudan</a></td>\n"+"      <td>Arabic (official), Nubian, Ta Bedawie, diverse dialects of Nilotic, Nilo-Hamitic, Sudanic languages, English</td>\n"+"      <td><a href/country/suriname\">Suriname</a></td>\n"+"      <td>Dutch (official), Surinamese (lingua franca), English widely spoken, Hindustani, Javanese</td>\n"+"      <td><a href/country/swaziland\">Swaziland</a></td>\n"+"      <td>English, SiSwati (both official)</td>\n"+"      <td><a href/country/sweden\">Sweden</a></td>\n"+"      <td>Swedish, small Sami- and Finnish-speaking minorities</td>\n"+"      <td><a href/country/switzerland\">Switzerland</a></td>\n"+"      <td>German 64%, French 20%, Italian 7% (all official), Romansch 0.5% (national)</td>\n"+"      <td><a href/country/syria\">Syria</a></td>\n"+"      <td>Arabic (official), Kurdish, Armenian, Aramaic, Circassian widely understood, French, English somewhat understood</td>\n"+"      <td><a href/country/taiwan\">Taiwan</a></td>\n"+"      <td>Chinese (Mandarin, official), Taiwanese (Min), Hakka dialects</td>\n"+"      <td><a href/country/tajikistan\">Tajikistan</a></td>\n"+"      <td>Tajik (official), Russian widely used in government and business</td>\n"+"      <td><a href/country/tanzania\">Tanzania</a></td>\n"+"      <td>Swahili, English (both official), Arabic, many local languages</td>\n"+"      <td><a href/country/thailand\">Thailand</a></td>\n"+"      <td>Thai (Siamese), English (secondary language of the elite), ethnic and regional dialects</td>\n"+"      <td><a href/country/togo\">Togo</a></td>\n"+"      <td>French (official, commerce), Ewé, Mina (south), Kabyé, Dagomba (north), and many dialects</td>\n"+"      <td><a href/country/tonga\">Tonga</a></td>\n"+"      <td>Tongan (an Austronesian language), English</td>\n"+"      <td><a href/country/trinidad-and-tobago\">Trinidad and Tobago</a></td>\n"+"      <td>English (official), Hindi, French, Spanish, Chinese</td>\n"+"      <td><a href/country/tunisia\">Tunisia</a></td>\n"+"      <td>Arabic (official,commerce), French (commerce)</td>\n"+"      <td><a href/country/turkey\">Turkey</a></td>\n"+"      <td>Turkish (official), Kurdish, Dimli, Azeri, Kabardian</td>\n"+"      <td><a href/country/turkmenistan\">Turkmenistan</a></td>\n"+"      <td>Turkmen 72%, Russian 12%, Uzbek 9%, other 7%</td>\n"+"      <td><a href/country/tuvalu\">Tuvalu</a></td>\n"+"      <td>Tuvaluan, English, Samoan, Kiribati (on the island of Nui)</td>\n"+"      <td><a href/country/uganda\">Uganda</a></td>\n"+"      <td>English (official), Ganda or Luganda, other Niger-Congo languages, Nilo-Saharan languages, Swahili, Arabic</td>\n"+"      <td><a href/country/ukraine\">Ukraine</a></td>\n"+"      <td>Ukrainian 67%, Russian 24%, Romanian, Polish, Hungarian</td>\n"+"      <td><a href/country/united-arab-emirates\">United Arab Emirates</a></td>\n"+"      <td>Arabic (official), Persian, English, Hindi, Urdu</td>\n"+"      <td><a href/country/united-kingdom\">United Kingdom</a></td>\n"+"      <td>English, Welsh, Scots Gaelic</td>\n"+"      <td><a href/country/united-states\">United States</a></td>\n"+"      <td>English 82%, Spanish 11% (2000)</td>\n"+"      <td><a href/country/uruguay\">Uruguay</a></td>\n"+"      <td>Spanish, Portunol, or Brazilero</td>\n"+"      <td><a href/country/uzbekistan\">Uzbekistan</a></td>\n"+"      <td>Uzbek 74.3%, Russian 14.2%, Tajik 4.4%, other 7.1%</td>\n"+"      <td><a href/country/vanuatu\">Vanuatu</a></td>\n"+"      <td>Bislama 23% (a Melanesian Pidgin English), English 2%, French 1% (all 3 official), more than 100 local languages 73%</td>\n"+"      <td><a href/country/vatican-city-holy-see\">Vatican City</a></td>\n"+"      <td>Italian, Latin, French, various other languages</td>\n"+"      <td><a href/country/venezuela\">Venezuela</a></td>\n"+"      <td>Spanish (official), numerous indigenous dialects</td>\n"+"      <td><a href/country/vietnam\">Vietnam</a></td>\n"+"      <td>Vietnamese (official), English (increasingly favored as a second language), some French, Chinese, Khmer, mountain area languages (Mon-Khmer and Malayo-Polynesian)</td>\n"+"      <td><a href/country/western-sahara-proposed-state\">Western Sahara</a></td>\n"+"      <td>Hassaniya Arabic, Moroccan Arabic</td>\n"+"      <td><a href/country/yemen\">Yemen</a></td>\n"+"      <td>Arabic</td>\n"+"      <td><a href/country/zambia\">Zambia</a></td>\n"+"      <td>English (official), major vernaculars: Bemba, Kaonda, Lozi, Lunda, Luvale, Nyanja, Tonga, about 70 other indigenous languages</td>\n"+"      <td><a href/country/zimbabwe\">Zimbabwe</a></td>\n"+"      <td>English (official), Shona, Ndebele (Sindebele), numerous minor tribal dialects</td>";
		Scanner scan = new Scanner(countryData);
		String langData = "Afrikaans\n"+"Albanian\n"+"Amharic\n"+"Arabic\n"+"Armenian\n"+"Azerbaijani\n"+"Basque\n"+"Belarusian\n"+"Bengali\n"+"Bosnian\n"+"Bulgarian\n"+"Catalan\n"+"Cebuano\n"+"Chinese\n"+"Corsican\n"+"Croatian\n"+"Czech\n"+"Danish\n"+"Dutch\n"+"English\n"+"Esperanto\n"+"Estonian\n"+"Finnish\n"+"French\n"+"Frisian\n"+"Galician\n"+"Georgian\n"+"German\n"+"Greek\n"+"Gujarati\n"+"Haitian Creole\n"+"Hausa\n"+"Hawaiian\n"+"Hebrew\n"+"Hindi\n"+"Hmong\n"+"Hungarian\n"+"Icelandic\n"+"Igbo\n"+"Indonesian\n"+"Irish\n"+"Italian\n"+"Japanese\n"+"Javanese\n"+"Kannada\n"+"Kazakh\n"+"Khmer\n"+"Korean\n"+"Kurdish\n"+"Kyrgyz\n"+"Lao\n"+"Latin\n"+"Latvian\n"+"Lithuanian\n"+"Luxembourgish\n"+"Macedonian\n"+"Malagasy\n"+"Malay\n"+"Malayalam\n"+"Maltese\n"+"Maori\n"+"Marathi\n"+"Mongolian\n"+"Myanmar\n"+"Nepali\n"+"Norwegian\n"+"Nyanja\n"+"Pashto\n"+"Persian\n"+"Polish\n"+"Portuguese\n"+"Punjabi\n"+"Romanian\n"+"Russian\n"+"Samoan\n"+"Scots Gaelic\n"+"Serbian\n"+"Sesotho\n"+"Shona\n"+"Sindhi\n"+"Sinhala\n"+"Slovak\n"+"Slovenian\n"+"Somali\n"+"Spanish\n"+"Sundanese\n"+"Swahili\n"+"Swedish\n"+"Tagalog\n"+"Tajik\n"+"Tamil\n"+"Telugu\n"+"Thai\n"+"Turkish\n"+"Ukrainian\n"+"Urdu\n"+"Uzbek\n"+"Vietnamese\n"+"Welsh\n"+"Xhosa\n"+"Yiddish\n"+"Yoruba\n"+"Zulu";
		Scanner sc = new Scanner(langData);
		ArrayList<String> validLangs = new ArrayList<String>();		
		while(sc.hasNextLine())
			validLangs.add(sc.nextLine().split("\\s+")[0]);
		sc.close();

		Map<String, ArrayList<String>> langs = new TreeMap<String, ArrayList<String>>();
		while (scan.hasNextLine())
		{
			String s = scan.nextLine();
			String name = s.substring(s.indexOf("\">") + 2, s.indexOf("</a"));
			String list = scan.nextLine();
			list = list.substring(list.indexOf(">") + 1, list.indexOf("</"));
			String[] langList = list.split(", (?![a-z])");
			ArrayList<String> elements = new ArrayList<>();
			for (int i = 0; i < langList.length; i++)
			{
				String[] arr = langList[i].split(" ");
				if (arr[0].contains(","))
				{
					if (validLangs.contains((arr[0].substring(0, arr[0].length()-1))))
						elements.add(arr[0].substring(0, arr[0].length()-1));
				}
				else{
					for (int j = 0; j < arr.length; j++)
					{
						if (validLangs.contains(arr[j]))
							elements.add(arr[j]);
						else if (arr[j].contains("/"))
							if (validLangs.contains(arr[j].substring(0, arr[j].indexOf("/"))))
								elements.add(arr[j].substring(0, arr[j].indexOf("/")));
					}	
				}
			}			
			if (elements.size() > 0)
				langs.put(name, elements);
		}
		for (String name: langs.keySet()){

            String key = name.toString();
            String value = langs.get(name).toString();  
            System.out.println(key + " " + value);  
		} 
		return langs;
	}
}
