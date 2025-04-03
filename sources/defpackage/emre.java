package defpackage;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emre {
    public static final Map a;

    static {
        HashMap hashMap = new HashMap();
        a = hashMap;
        hashMap.put(Locale.KOREAN, new emrd());
        emrg emrgVar = new emrg();
        hashMap.put(Locale.FRENCH, emrgVar);
        emrgVar.b("|de Les|", "des");
        emrgVar.b("|de les|", "des");
        emrgVar.b("|De Les|", "Des");
        emrgVar.b("|De les|", "Des");
        emrgVar.b("|de Le|", "du");
        emrgVar.b("|de le|", "du");
        emrgVar.b("|De Le|", "Du");
        emrgVar.b("|De le|", "Du");
        emrgVar.b("|à Les|", "aux");
        emrgVar.b("|à les|", "aux");
        emrgVar.b("|À Les|", "Aux");
        emrgVar.b("|À les|", "Aux");
        emrgVar.b("|à Le|", "au");
        emrgVar.b("|à le|", "au");
        emrgVar.b("|À Le|", "Au");
        emrgVar.b("|À le|", "Au");
        String[] strArr = {"de", "la", "le"};
        char[] charArray = "aeéèêioôy".toCharArray();
        int length = charArray.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = 1;
            if (i2 >= length) {
                break;
            }
            char c = charArray[i2];
            int i4 = i;
            while (i4 < 3) {
                String str = strArr[i4];
                char charAt = str.charAt(i);
                Character valueOf = Character.valueOf(c);
                Object[] objArr = new Object[2];
                objArr[i] = str;
                objArr[i3] = valueOf;
                String format = String.format("|%s %c", objArr);
                Character valueOf2 = Character.valueOf(charAt);
                int i5 = i;
                Object[] objArr2 = new Object[2];
                objArr2[i5] = valueOf2;
                objArr2[i3] = valueOf;
                int i6 = i3;
                emrgVar.b(format, String.format("%c'%c", objArr2));
                Character valueOf3 = Character.valueOf(Character.toTitleCase(c));
                Object[] objArr3 = new Object[2];
                objArr3[i5] = str;
                objArr3[i6] = valueOf3;
                String format2 = String.format("|%s %c", objArr3);
                Character valueOf4 = Character.valueOf(Character.toTitleCase(c));
                String[] strArr2 = strArr;
                Object[] objArr4 = new Object[2];
                objArr4[i5] = valueOf2;
                objArr4[i6] = valueOf4;
                emrgVar.b(format2, String.format("%c'%c", objArr4));
                Character valueOf5 = Character.valueOf(Character.toTitleCase(charAt));
                String substring = str.substring(i6);
                Object[] objArr5 = new Object[2];
                objArr5[i5] = valueOf5;
                objArr5[i6] = substring;
                String format3 = String.format("%c%s", objArr5);
                Object[] objArr6 = new Object[2];
                objArr6[i5] = format3;
                objArr6[i6] = valueOf;
                String format4 = String.format("|%s %c", objArr6);
                Object[] objArr7 = new Object[2];
                objArr7[i5] = valueOf5;
                objArr7[i6] = valueOf;
                emrgVar.b(format4, String.format("%c'%c", objArr7));
                Character valueOf6 = Character.valueOf(Character.toTitleCase(c));
                Object[] objArr8 = new Object[2];
                objArr8[i5] = format3;
                objArr8[i6] = valueOf6;
                String format5 = String.format("|%s %c", objArr8);
                Character valueOf7 = Character.valueOf(Character.toTitleCase(c));
                Object[] objArr9 = new Object[2];
                objArr9[i5] = valueOf5;
                objArr9[i6] = valueOf7;
                emrgVar.b(format5, String.format("%c'%c", objArr9));
                i4++;
                i = i5;
                strArr = strArr2;
                i3 = 1;
            }
            i2++;
        }
        int i7 = i;
        emrgVar.b(". la|", ". La");
        emrgVar.b("! la|", "! La");
        emrgVar.b("? la|", "? La");
        emrgVar.b(". le|", ". Le");
        emrgVar.b("! le|", "! Le");
        emrgVar.b("? le|", "? Le");
        emrgVar.b(". les|", ". Les");
        emrgVar.b("! les|", "! Les");
        emrgVar.b("? les|", "? Les");
        emrg emrgVar2 = new emrg();
        Locale locale = new Locale("be");
        Map map = a;
        map.put(locale, emrgVar2);
        emrgVar2.b("а у", "а ў");
        emrgVar2.b("э у", "э ў");
        emrgVar2.b("о у", "о ў");
        emrgVar2.b("у у", "у ў");
        emrgVar2.b("і у", "і ў");
        emrgVar2.b("я у", "я ў");
        emrgVar2.b("е у", "е ў");
        emrgVar2.b("ё у", "ё ў");
        emrgVar2.b("ю у", "ю ў");
        emrgVar2.b("ы у", "ы ў");
        emrg emrgVar3 = new emrg();
        map.put(Locale.ITALIAN, emrgVar3);
        emrgVar3.b("|a a", "ad a");
        emrgVar3.b("|a A", "ad A");
        emrgVar3.b("|e e", "ed e");
        emrgVar3.b("|e E", "ed E");
        emrgVar3.b("|o o", "od o");
        emrgVar3.b("|o O", "od O");
        String[] strArr3 = {"a il:al", "a lo:allo", "a la:alla", "a l':all'", "a i:ai", "a gli:agli", "a le:alle", "con il:col", "con i:coi", "da il:dal", "da lo:dallo", "da la:dalla", "da l':dall'", "da i:dai", "da gli:dagli", "da le:dalle", "di il:del", "di lo:dello", "di la:della", "di l':dell'", "di i:del", "di gli:degli", "di le:delle", "in il:nel", "in lo:nello", "in la:nella", "in l':nell'", "in i:nei", "in gli:negli", "in le:nelle", "su il:sul", "su lo:sullo", "su la:sulla", "su l':sull'", "su i:sui", "su gli:sugli", "su le:sulle"};
        while (i < 37) {
            String[] split = strArr3[i].split(":");
            Object[] objArr10 = new Object[1];
            objArr10[i7] = split[i7];
            emrgVar3.b(String.format("|%s|", objArr10), split[1]);
            i++;
        }
        emrgVar3.b("|il gn", "lo gn");
        emrgVar3.b("|il pn", "lo pn");
        emrgVar3.b("|il ps", "lo ps");
        emrgVar3.b("|il pt", "lo pt");
        char[] charArray2 = "bcdfghjklmnpqrstvwxyz".toCharArray();
        int length2 = charArray2.length;
        for (int i8 = i7; i8 < length2; i8++) {
            Character valueOf8 = Character.valueOf(charArray2[i8]);
            Object[] objArr11 = new Object[1];
            objArr11[i7] = valueOf8;
            String format6 = String.format("|il s%c", objArr11);
            Object[] objArr12 = new Object[1];
            objArr12[i7] = valueOf8;
            emrgVar3.b(format6, String.format("lo s%c", objArr12));
        }
        emrgVar3.b("|il x", "lo x");
        emrgVar3.b("|il z", "lo z");
        char[] charArray3 = "éóíúàèìòùîaeiou".toCharArray();
        int length3 = charArray3.length;
        for (int i9 = i7; i9 < length3; i9++) {
            Character valueOf9 = Character.valueOf(charArray3[i9]);
            Object[] objArr13 = new Object[1];
            objArr13[i7] = valueOf9;
            String format7 = String.format("|il %c", objArr13);
            Object[] objArr14 = new Object[1];
            objArr14[i7] = valueOf9;
            emrgVar3.b(format7, String.format("l'%c", objArr14));
            Object[] objArr15 = new Object[1];
            objArr15[i7] = valueOf9;
            String format8 = String.format("|il h%c", objArr15);
            Object[] objArr16 = new Object[1];
            objArr16[i7] = valueOf9;
            emrgVar3.b(format8, String.format("l'h%c", objArr16));
            Object[] objArr17 = new Object[1];
            objArr17[i7] = valueOf9;
            String format9 = String.format("|la %c", objArr17);
            Object[] objArr18 = new Object[1];
            objArr18[i7] = valueOf9;
            emrgVar3.b(format9, String.format("l'%c", objArr18));
            Object[] objArr19 = new Object[1];
            objArr19[i7] = valueOf9;
            String format10 = String.format("|la h%c", objArr19);
            Object[] objArr20 = new Object[1];
            objArr20[i7] = valueOf9;
            emrgVar3.b(format10, String.format("l'h%c", objArr20));
            Object[] objArr21 = new Object[1];
            objArr21[i7] = valueOf9;
            String format11 = String.format("|i %c", objArr21);
            Object[] objArr22 = new Object[1];
            objArr22[i7] = valueOf9;
            emrgVar3.b(format11, String.format("gli %c", objArr22));
            Object[] objArr23 = new Object[1];
            objArr23[i7] = valueOf9;
            String format12 = String.format("|i h%c", objArr23);
            Object[] objArr24 = new Object[1];
            objArr24[i7] = valueOf9;
            emrgVar3.b(format12, String.format("gli h%c", objArr24));
        }
        emrgVar3.b("|il domenica|", "la domenica");
        emrg emrgVar4 = new emrg();
        Locale locale2 = new Locale("es");
        Map map2 = a;
        map2.put(locale2, emrgVar4);
        emrgVar4.b("|a el|", "al");
        emrgVar4.b("|de el|", "del");
        emrgVar4.b("|A el|", "Al");
        emrgVar4.b("|De el|", "Del");
        emrgVar4.b("|y i", "e i");
        emrgVar4.b("|y I", "e I");
        emrgVar4.b("|Y I", "E I");
        emrgVar4.b("|o o", "u o");
        emrgVar4.b("|o O", "u O");
        emrgVar4.b("|O O", "U O");
        emrg emrgVar5 = new emrg();
        Locale locale3 = new Locale("pt");
        map2.put(locale3, emrgVar5);
        String[] strArr4 = {"em a:na", "de a:da", "a a:à", "pra a:pra", "em as:nas", "de as:das", "a as:às", "por as:pelas", "pra as:pras", "em o:no", "de o:do", "a o:ao", "pra o:pro", "em os:nos", "de os:dos", "a os:aos", "por os:pelos", "pra os:pros", "em este:neste", "em esse:nesse", "de este:deste", "de esse:desse", "em estes:nestes", "em esses:nesses", "de estes:destes", "de esses:desses", "em esta:nesta", "em essa:nessa", "de esta:desta", "de essa:dessa", "em estas:nestas", "em essas:nessas", "de estas:destas", "de essas:dessas", "em isto:nisto", "em isso:nisso", "de isto:disto", "de isso:disso", "em aquele:naquele", "de aquele:daquele", "a aquele:àquele", "em aqueles:naqueles", "de aqueles:daqueles", "a aqueles:àqueles", "em aquela:naquela", "de aquela:daquela", "a aquela:àquela", "em aquelas:naquelas", "de aquelas:daquelas", "a aquelas:àquelas", "em aquilo:naquilo", "de aquilo:daquilo", "a aquilo:àquilo", "em ele:nele", "de ele:dele", "em eles:neles", "de eles:deles", "em ela:nela", "de ela:dela", "em elas:nelas", "de elas:delas", "a onde:aonde", "de aqui:daqui", "de ali:dali", "de ai:dai"};
        for (int i10 = i7; i10 < 65; i10++) {
            String[] split2 = strArr4[i10].split(":");
            Object[] objArr25 = new Object[1];
            objArr25[i7] = split2[i7];
            emrgVar5.b(String.format("|%s|", objArr25), split2[1]);
            Object[] objArr26 = new Object[1];
            objArr26[i7] = split2[i7].toUpperCase(locale3);
            emrgVar5.b(String.format("|%s|", objArr26), split2[1].toUpperCase(locale3));
            Character valueOf10 = Character.valueOf(Character.toTitleCase(split2[i7].charAt(i7)));
            String substring2 = split2[i7].substring(1);
            Object[] objArr27 = new Object[2];
            objArr27[i7] = valueOf10;
            objArr27[1] = substring2;
            String format13 = String.format("|%c%s|", objArr27);
            Character valueOf11 = Character.valueOf(Character.toTitleCase(split2[1].charAt(i7)));
            String substring3 = split2[1].substring(1);
            Object[] objArr28 = new Object[2];
            objArr28[i7] = valueOf11;
            objArr28[1] = substring3;
            emrgVar5.b(format13, String.format("%c%s", objArr28));
        }
    }

    public static void a(emrg emrgVar, StringBuilder sb, String str) {
        if (str.length() == 0) {
            return;
        }
        emrf a2 = emrgVar.a(sb, str);
        if (a2 == null) {
            sb.append(str);
            return;
        }
        String str2 = a2.e;
        int indexOf = str2.indexOf(32);
        if (indexOf != -1) {
            CharSequence subSequence = sb.subSequence(a2.a, sb.length());
            sb.setLength(a2.c + 1);
            sb.append((CharSequence) str2, 0, indexOf);
            sb.append(subSequence);
            sb.append((CharSequence) str, 0, a2.b);
            sb.append((CharSequence) str2, indexOf + 1, str2.length());
        } else {
            sb.replace(a2.c + 1, sb.length(), str2);
        }
        sb.append((CharSequence) str, a2.d, str.length());
    }
}
