package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class edcv {
    public static final Pattern a;
    public static final Pattern b;
    public static final Pattern c;
    public static final Pattern d;
    public static final Pattern e;
    public static final Pattern f;
    public static final Pattern g;
    private static final Logger k = Logger.getLogger(edcv.class.getName());
    private static final Map l;
    private static final Map m;
    private static final String n;
    private static final Pattern o;
    private static final Pattern p;
    private static final String q;
    private static final String r;
    private static final String s;
    private static final String t;
    private static final String u;
    private static final String v;
    private static final Pattern w;
    private static edcv x;
    public final Map h;
    public final eddr j;
    private final eddc B = new eddc();
    private final Set y = new HashSet(35);
    private final eddf z = new eddf();
    private final Set A = new HashSet(320);
    public final Set i = new HashSet();

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(54, "9");
        DesugarCollections.unmodifiableMap(hashMap);
        HashSet hashSet = new HashSet();
        hashSet.add(86);
        DesugarCollections.unmodifiableSet(hashSet);
        HashSet hashSet2 = new HashSet();
        hashSet2.add(52);
        DesugarCollections.unmodifiableSet(hashSet2);
        HashSet hashSet3 = new HashSet();
        hashSet3.add(52);
        hashSet3.add(54);
        hashSet3.add(55);
        hashSet3.add(62);
        hashSet3.addAll(hashSet);
        DesugarCollections.unmodifiableSet(hashSet3);
        HashMap hashMap2 = new HashMap();
        hashMap2.put('0', '0');
        hashMap2.put('1', '1');
        hashMap2.put('2', '2');
        hashMap2.put('3', '3');
        hashMap2.put('4', '4');
        hashMap2.put('5', '5');
        hashMap2.put('6', '6');
        hashMap2.put('7', '7');
        hashMap2.put('8', '8');
        hashMap2.put('9', '9');
        HashMap hashMap3 = new HashMap(40);
        hashMap3.put('A', '2');
        hashMap3.put('B', '2');
        hashMap3.put('C', '2');
        hashMap3.put('D', '3');
        hashMap3.put('E', '3');
        hashMap3.put('F', '3');
        hashMap3.put('G', '4');
        hashMap3.put('H', '4');
        hashMap3.put('I', '4');
        hashMap3.put('J', '5');
        hashMap3.put('K', '5');
        hashMap3.put('L', '5');
        hashMap3.put('M', '6');
        hashMap3.put('N', '6');
        hashMap3.put('O', '6');
        hashMap3.put('P', '7');
        hashMap3.put('Q', '7');
        hashMap3.put('R', '7');
        hashMap3.put('S', '7');
        hashMap3.put('T', '8');
        hashMap3.put('U', '8');
        hashMap3.put('V', '8');
        hashMap3.put('W', '9');
        hashMap3.put('X', '9');
        hashMap3.put('Y', '9');
        hashMap3.put('Z', '9');
        Map unmodifiableMap = DesugarCollections.unmodifiableMap(hashMap3);
        l = unmodifiableMap;
        HashMap hashMap4 = new HashMap(100);
        hashMap4.putAll(unmodifiableMap);
        hashMap4.putAll(hashMap2);
        m = DesugarCollections.unmodifiableMap(hashMap4);
        HashMap hashMap5 = new HashMap();
        hashMap5.putAll(hashMap2);
        hashMap5.put('+', '+');
        hashMap5.put('*', '*');
        hashMap5.put('#', '#');
        DesugarCollections.unmodifiableMap(hashMap5);
        HashMap hashMap6 = new HashMap();
        for (Character ch : unmodifiableMap.keySet()) {
            hashMap6.put(Character.valueOf(Character.toLowerCase(ch.charValue())), ch);
            hashMap6.put(ch, ch);
        }
        hashMap6.putAll(hashMap2);
        hashMap6.put('-', '-');
        hashMap6.put((char) 65293, '-');
        hashMap6.put((char) 8208, '-');
        hashMap6.put((char) 8209, '-');
        hashMap6.put((char) 8210, '-');
        hashMap6.put((char) 8211, '-');
        hashMap6.put((char) 8212, '-');
        hashMap6.put((char) 8213, '-');
        hashMap6.put((char) 8722, '-');
        hashMap6.put('/', '/');
        hashMap6.put((char) 65295, '/');
        hashMap6.put(' ', ' ');
        hashMap6.put((char) 12288, ' ');
        hashMap6.put((char) 8288, ' ');
        hashMap6.put('.', '.');
        hashMap6.put((char) 65294, '.');
        DesugarCollections.unmodifiableMap(hashMap6);
        Pattern.compile("[\\d]+(?:[~⁓∼～][\\d]+)?");
        Map map = l;
        String concat = String.valueOf(Arrays.toString(map.keySet().toArray()).replaceAll("[, \\[\\]]", "")).concat(String.valueOf(Arrays.toString(map.keySet().toArray()).toLowerCase().replaceAll("[, \\[\\]]", "")));
        n = concat;
        a = Pattern.compile("[+＋]+");
        Pattern.compile("[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～]+");
        o = Pattern.compile("(\\p{Nd})");
        b = Pattern.compile("[+＋\\p{Nd}]");
        c = Pattern.compile("[\\\\/] *x");
        d = Pattern.compile("[[\\P{N}&&\\P{L}]&&[^#]]+$");
        p = Pattern.compile("(?:.*?[A-Za-z]){3}.*");
        String str = "\\p{Nd}{2}|[+＋]*+(?:[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～*]*\\p{Nd}){3,}[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～*" + concat + "\\p{Nd}]*";
        q = str;
        String m2 = m(true);
        r = m2;
        m(false);
        e = Pattern.compile("^\\+(\\p{Nd}|[\\-\\.\\(\\)]?)*\\p{Nd}(\\p{Nd}|[\\-\\.\\(\\)]?)*$");
        String concat2 = String.valueOf(concat).concat("\\p{Nd}");
        s = concat2;
        String A = a.A("[", "]+((\\-)*[", concat2, concat2, "])*");
        t = A;
        String A2 = a.A("[", "]+((\\-)*[", concat, concat2, "])*");
        u = A2;
        String A3 = a.A("^(", "\\.)*", A, A2, "\\.?$");
        v = A3;
        f = Pattern.compile(A3);
        g = Pattern.compile("(?:" + m2 + ")$", 66);
        w = Pattern.compile(str + "(?:" + m2 + ")?", 66);
        Pattern.compile("(\\D+)");
        Pattern.compile("(\\$\\d)");
        Pattern.compile("\\(?\\$1\\)?");
        x = null;
    }

    public edcv(eddr eddrVar, Map map) {
        this.j = eddrVar;
        this.h = map;
        for (Map.Entry entry : map.entrySet()) {
            List list = (List) entry.getValue();
            if (list.size() == 1 && "001".equals(list.get(0))) {
                this.i.add(entry.getKey());
            } else {
                this.A.addAll(list);
            }
        }
        if (this.A.remove("001")) {
            k.log(Level.WARNING, "invalid metadata (country calling code was mapped to the non-geo entity as well as specific region(s))");
        }
        this.y.addAll((Collection) map.get(1));
    }

    public static synchronized edcv a() {
        edcv edcvVar;
        synchronized (edcv.class) {
            if (x == null) {
                eddg eddgVar = eddg.a;
                edcs edcsVar = eddgVar.c;
                edds eddsVar = eddgVar.d;
                eddi eddiVar = eddg.a.b;
                e(new edcv(new eddr(eddsVar), edcr.a()));
            }
            edcvVar = x;
        }
        return edcvVar;
    }

    public static String c(CharSequence charSequence) {
        StringBuilder sb = new StringBuilder(charSequence.length());
        for (int i = 0; i < charSequence.length(); i++) {
            int digit = Character.digit(charSequence.charAt(i), 10);
            if (digit != -1) {
                sb.append(digit);
            }
        }
        return sb.toString();
    }

    public static void d(edcx edcxVar, String str) {
        if (edcxVar == null) {
            throw new edct(str);
        }
    }

    static synchronized void e(edcv edcvVar) {
        synchronized (edcv.class) {
            x = edcvVar;
        }
    }

    public static boolean g(CharSequence charSequence) {
        if (charSequence.length() < 2) {
            return false;
        }
        return w.matcher(charSequence).matches();
    }

    static final edcz i(edcx edcxVar, int i) {
        switch (i - 1) {
            case 0:
            case 2:
                return edcxVar.b;
            case 1:
                return edcxVar.c;
            case 3:
                return edcxVar.d;
            case 4:
                return edcxVar.e;
            case 5:
                return edcxVar.f;
            case 6:
                return edcxVar.h;
            case 7:
                return edcxVar.g;
            case 8:
                return edcxVar.i;
            case 9:
                return edcxVar.j;
            case 10:
                return edcxVar.k;
            default:
                return edcxVar.a;
        }
    }

    public static void l(StringBuilder sb) {
        if (!p.matcher(sb).matches()) {
            sb.replace(0, sb.length(), c(sb));
            return;
        }
        int length = sb.length();
        Map map = m;
        StringBuilder sb2 = new StringBuilder(sb.length());
        for (int i = 0; i < sb.length(); i++) {
            Character ch = (Character) map.get(Character.valueOf(Character.toUpperCase(sb.charAt(i))));
            if (ch != null) {
                sb2.append(ch);
            }
        }
        sb.replace(0, length, sb2.toString());
    }

    private static String m(boolean z) {
        String n2 = n(20);
        String str = ";ext=".concat(n2) + "|" + ("[  \\t,]*(?:e?xt(?:ensi(?:ó?|ó))?n?|ｅ?ｘｔｎ?|доб|anexo)[:\\.．]?[  \\t,-]*" + n(20) + "#?") + "|" + ("[  \\t,]*(?:[xｘ#＃~～]|int|ｉｎｔ)[:\\.．]?[  \\t,-]*" + n(9) + "#?") + "|" + ("[- ]+" + n(6) + "#");
        if (!z) {
            return str;
        }
        return str + "|" + ("[  \\t]*(?:,{2}|;)[:\\.．]?[  \\t,-]*" + n(15) + "#?") + "|" + ("[  \\t]*(?:,)+[:\\.．]?[  \\t,-]*" + n(9) + "#?");
    }

    private static String n(int i) {
        return a.f(i, "(\\p{Nd}{1,", "})");
    }

    private static boolean o(edcz edczVar) {
        return (edczVar.a() == 1 && ((Integer) edczVar.b.get(0)).intValue() == -1) ? false : true;
    }

    private final int p(CharSequence charSequence, edcx edcxVar, int i) {
        edcz i2 = i(edcxVar, i);
        List list = i2.b.isEmpty() ? edcxVar.a.b : i2.b;
        List list2 = i2.c;
        if (i == 3) {
            if (!o(i(edcxVar, 1))) {
                return p(charSequence, edcxVar, 2);
            }
            edcz i3 = i(edcxVar, 2);
            if (o(i3)) {
                ArrayList arrayList = new ArrayList(list);
                arrayList.addAll(i3.a() == 0 ? edcxVar.a.b : i3.b);
                Collections.sort(arrayList);
                if (list2.isEmpty()) {
                    list2 = i3.c;
                } else {
                    ArrayList arrayList2 = new ArrayList(list2);
                    arrayList2.addAll(i3.c);
                    Collections.sort(arrayList2);
                    list2 = arrayList2;
                }
                list = arrayList;
            }
        }
        if (((Integer) list.get(0)).intValue() == -1) {
            return 5;
        }
        int length = charSequence.length();
        Integer valueOf = Integer.valueOf(length);
        if (list2.contains(valueOf)) {
            return 2;
        }
        int intValue = ((Integer) list.get(0)).intValue();
        if (intValue == length) {
            return 1;
        }
        if (intValue > length) {
            return 4;
        }
        if (((Integer) list.get(list.size() - 1)).intValue() < length) {
            return 6;
        }
        return list.subList(1, list.size()).contains(valueOf) ? 1 : 5;
    }

    public final edcx b(String str) {
        if (!f(str)) {
            return null;
        }
        eddr eddrVar = this.j;
        if (!eddb.a(str)) {
            throw new IllegalArgumentException(String.valueOf(str).concat(" region code is a non-geo entity"));
        }
        edcx b2 = ((eddk) eddrVar.a.a(eddrVar.b.a(str))).b.b(str);
        d(b2, "Missing metadata for region code ".concat(String.valueOf(str)));
        return b2;
    }

    public final boolean f(String str) {
        return str != null && this.A.contains(str);
    }

    public final int h(CharSequence charSequence, edcx edcxVar) {
        return p(charSequence, edcxVar, 12);
    }

    public final int j(CharSequence charSequence, edcx edcxVar, StringBuilder sb, edda eddaVar) {
        int i = 0;
        if (charSequence.length() == 0) {
            return 0;
        }
        StringBuilder sb2 = new StringBuilder(charSequence);
        String str = edcxVar != null ? edcxVar.n : "NonMatch";
        if (sb2.length() != 0) {
            Matcher matcher = a.matcher(sb2);
            if (matcher.lookingAt()) {
                sb2.delete(0, matcher.end());
                l(sb2);
            } else {
                Pattern a2 = this.z.a(str);
                l(sb2);
                Matcher matcher2 = a2.matcher(sb2);
                if (matcher2.lookingAt()) {
                    int end = matcher2.end();
                    Matcher matcher3 = o.matcher(sb2.substring(end));
                    if (!matcher3.find() || !c(matcher3.group(1)).equals("0")) {
                        sb2.delete(0, end);
                    }
                }
            }
            if (sb2.length() <= 2) {
                throw new edcu(3, "Phone number had an IDD, but after this was not long enough to be a viable phone number.");
            }
            if (sb2.length() != 0 && sb2.charAt(0) != '0') {
                int length = sb2.length();
                int i2 = 1;
                while (true) {
                    if (i2 > 3 || i2 > length) {
                        break;
                    }
                    int parseInt = Integer.parseInt(sb2.substring(0, i2));
                    if (this.h.containsKey(Integer.valueOf(parseInt))) {
                        sb.append(sb2.substring(i2));
                        i = parseInt;
                        break;
                    }
                    i2++;
                }
            }
            if (i == 0) {
                throw new edcu(1, "Country calling code supplied was not recognised.");
            }
            eddaVar.a(i);
            return i;
        }
        if (edcxVar != null) {
            int i3 = edcxVar.m;
            String valueOf = String.valueOf(i3);
            String sb3 = sb2.toString();
            if (sb3.startsWith(valueOf)) {
                StringBuilder sb4 = new StringBuilder(sb3.substring(valueOf.length()));
                edcz edczVar = edcxVar.a;
                k(sb4, edcxVar, null);
                if ((!this.B.a(sb2, edczVar) && this.B.a(sb4, edczVar)) || h(sb2, edcxVar) == 6) {
                    sb.append((CharSequence) sb4);
                    eddaVar.a(i3);
                    return i3;
                }
            }
        }
        eddaVar.a(0);
        return 0;
    }

    public final void k(StringBuilder sb, edcx edcxVar, StringBuilder sb2) {
        int length = sb.length();
        String str = edcxVar.q;
        if (length == 0 || str.length() == 0) {
            return;
        }
        Matcher matcher = this.z.a(str).matcher(sb);
        if (matcher.lookingAt()) {
            edcz edczVar = edcxVar.a;
            boolean a2 = this.B.a(sb, edczVar);
            int groupCount = matcher.groupCount();
            String str2 = edcxVar.r;
            if (str2 == null || str2.length() == 0 || matcher.group(groupCount) == null) {
                if (!a2 || this.B.a(sb.substring(matcher.end()), edczVar)) {
                    if (sb2 != null && groupCount > 0 && matcher.group(groupCount) != null) {
                        sb2.append(matcher.group(1));
                    }
                    sb.delete(0, matcher.end());
                    return;
                }
                return;
            }
            StringBuilder sb3 = new StringBuilder(sb);
            sb3.replace(0, length, matcher.replaceFirst(str2));
            if (!a2 || this.B.a(sb3.toString(), edczVar)) {
                if (sb2 != null && groupCount > 1) {
                    sb2.append(matcher.group(1));
                }
                sb.replace(0, sb.length(), sb3.toString());
            }
        }
    }
}
