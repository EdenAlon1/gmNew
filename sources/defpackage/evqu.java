package defpackage;

import com.android.vcard.VCardConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evqu {
    public static final Logger a = Logger.getLogger(evqu.class.getName());
    public static final enhk b;
    public static final Pattern c;
    static final Pattern d;
    static final Pattern e;
    static final Pattern f;
    public static final evpx g;
    private static final enip h;
    private static final Pattern i;
    private static final Pattern j;
    private static final Pattern k;
    private static final String l;
    private static final String m;
    private static final Pattern n;
    private static final Pattern o;
    private static final Pattern p;
    private static evqu q;
    private final evqm r;
    private final Map s;
    private final Set t = EnumSet.noneOf(evpx.class);
    private final evrb u = new evrb();
    private final Set v = new HashSet(320);
    private final Set w = new HashSet();
    private final evrs x;

    static {
        enhk.l(54, "9");
        enin eninVar = new enin();
        eninVar.c(86);
        enip g2 = eninVar.g();
        h = g2;
        new enpx(52);
        enin eninVar2 = new enin();
        eninVar2.c(52);
        eninVar2.c(54);
        eninVar2.c(55);
        eninVar2.c(62);
        eninVar2.j(g2);
        eninVar2.g();
        enhd enhdVar = new enhd();
        enhdVar.g(evqc.a);
        enhdVar.k('+', '+');
        enhdVar.k('*', '*');
        enhdVar.k('#', '#');
        enhdVar.c();
        HashMap hashMap = new HashMap();
        enqu listIterator = evqc.b.keySet().listIterator();
        while (listIterator.hasNext()) {
            Character ch = (Character) listIterator.next();
            hashMap.put(Character.valueOf(emuz.a(ch.charValue())), ch);
            hashMap.put(ch, ch);
        }
        enhd enhdVar2 = new enhd();
        enhdVar2.g(evqc.a);
        enhdVar2.g(hashMap);
        enhdVar2.k('-', '-');
        enhdVar2.k((char) 65293, '-');
        enhdVar2.k((char) 8208, '-');
        enhdVar2.k((char) 8209, '-');
        enhdVar2.k((char) 8210, '-');
        enhdVar2.k((char) 8211, '-');
        enhdVar2.k((char) 8212, '-');
        enhdVar2.k((char) 8213, '-');
        enhdVar2.k((char) 8722, '-');
        enhdVar2.k('/', '/');
        enhdVar2.k((char) 65295, '/');
        enhdVar2.k(' ', ' ');
        enhdVar2.k((char) 12288, ' ');
        enhdVar2.k((char) 8288, ' ');
        enhdVar2.k('.', '.');
        enhdVar2.k((char) 65294, '.');
        b = enhdVar2.c();
        c = Pattern.compile("[\\d]+(?:[~⁓∼～][\\d]+)?");
        d = Pattern.compile("[+＋]+");
        i = Pattern.compile("[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～]+");
        j = Pattern.compile("(\\p{Nd})");
        k = Pattern.compile("[+＋\\p{Nd}]");
        e = Pattern.compile("[\\\\/] *x");
        f = Pattern.compile("[[\\P{N}&&\\P{L}]&&[^#]]+$");
        String str = "\\p{Nd}{2}|[+＋]*+(?:[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～*]*\\p{Nd}){3,}[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～*" + evqc.d + "\\p{Nd}]*";
        l = str;
        String H = H(true);
        m = H;
        H(false);
        n = Pattern.compile("(?:" + H + ")$", 66);
        o = Pattern.compile(str + "(?:" + H + ")?", 66);
        Pattern.compile("(\\D+)");
        p = Pattern.compile("(\\$\\d)");
        Pattern.compile("\\(?\\$1\\)?");
        q = null;
        g = evqy.a;
    }

    public evqu(evrs evrsVar, Map map) {
        this.r = new evqm(map.keySet());
        this.x = evrsVar;
        this.s = map;
        for (Map.Entry entry : map.entrySet()) {
            List list = (List) entry.getValue();
            if (list.size() == 1 && g.equals(list.get(0))) {
                this.w.add((Integer) entry.getKey());
            } else {
                this.v.addAll(list);
            }
        }
        if (this.v.remove(g)) {
            a.logp(Level.WARNING, "com.google.i18n.phonenumbers.PhoneNumberUtil", "<init>", "invalid metadata (country calling code was mapped to the non-geo entity as well as specific region(s))");
        }
        this.t.addAll((Collection) map.get(1));
    }

    static void D(StringBuilder sb) {
        if (evqc.e.matcher(sb).matches()) {
            sb.replace(0, sb.length(), E(sb, evqc.c));
        } else {
            sb.replace(0, sb.length(), evqt.a(sb));
        }
    }

    public static String E(CharSequence charSequence, Map map) {
        StringBuilder sb = new StringBuilder(charSequence.length());
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            Character ch = (Character) map.get(Character.valueOf(emuz.b(charSequence.charAt(i2))));
            if (ch != null) {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    static final boolean F(String str, evqs evqsVar) {
        eygi eygiVar = evqsVar.d;
        return (eygiVar.isEmpty() || eygiVar.contains(Integer.valueOf(str.length()))) && evqx.a(str, evqsVar) == 1;
    }

    private static evrw G(evrz evrzVar) {
        evrw evrwVar = (evrw) evrz.a.createBuilder();
        int i2 = evrzVar.c;
        evrwVar.copyOnWrite();
        evrz evrzVar2 = (evrz) evrwVar.instance;
        evrzVar2.b |= 1;
        evrzVar2.c = i2;
        long j2 = evrzVar.d;
        evrwVar.copyOnWrite();
        evrz evrzVar3 = (evrz) evrwVar.instance;
        evrzVar3.b |= 2;
        evrzVar3.d = j2;
        if (evrzVar.e.length() > 0) {
            String str = evrzVar.e;
            evrwVar.copyOnWrite();
            evrz evrzVar4 = (evrz) evrwVar.instance;
            str.getClass();
            evrzVar4.b |= 4;
            evrzVar4.e = str;
        }
        if (evrzVar.f) {
            evrwVar.copyOnWrite();
            evrz.a((evrz) evrwVar.instance);
            int i3 = evrzVar.g;
            evrwVar.copyOnWrite();
            evrz evrzVar5 = (evrz) evrwVar.instance;
            evrzVar5.b |= 16;
            evrzVar5.g = i3;
        }
        return evrwVar;
    }

    private static String H(boolean z) {
        String I = I(20);
        String str = ";ext=".concat(I) + "|" + ("[  \\t,]*(?:e?xt(?:ensi(?:ó?|ó))?n?|ｅ?ｘｔｎ?|доб|anexo)[:\\.．]?[  \\t,-]*" + I(20) + "#?") + "|" + ("[  \\t,]*(?:[xｘ#＃~～]|int|ｉｎｔ)[:\\.．]?[  \\t,-]*" + I(9) + "#?") + "|" + ("[- ]+" + I(6) + "#");
        if (!z) {
            return str;
        }
        return str + "|" + ("[  \\t]*(?:,{2}|;)[:\\.．]?[  \\t,-]*" + I(15) + "#?") + "|" + ("[  \\t]*(?:,)+[:\\.．]?[  \\t,-]*" + I(9) + "#?");
    }

    private static String I(int i2) {
        return a.f(i2, "(\\p{Nd}{1,", "})");
    }

    private static void J(evqo evqoVar, String str) {
        if (evqoVar == null) {
            throw new evqf(str);
        }
    }

    private static boolean K(evqs evqsVar) {
        return (evqsVar.d.size() == 1 && evqsVar.d.d(0) == -1) ? false : true;
    }

    private static evqs L(evqo evqoVar, int i2) {
        switch (i2 - 1) {
            case 0:
            case 2:
                evqs evqsVar = evqoVar.d;
                if (evqsVar == null) {
                    break;
                }
                break;
            case 1:
                evqs evqsVar2 = evqoVar.e;
                if (evqsVar2 == null) {
                    break;
                }
                break;
            case 3:
                evqs evqsVar3 = evqoVar.f;
                if (evqsVar3 == null) {
                    break;
                }
                break;
            case 4:
                evqs evqsVar4 = evqoVar.g;
                if (evqsVar4 == null) {
                    break;
                }
                break;
            case 5:
                evqs evqsVar5 = evqoVar.h;
                if (evqsVar5 == null) {
                    break;
                }
                break;
            case 6:
                evqs evqsVar6 = evqoVar.j;
                if (evqsVar6 == null) {
                    break;
                }
                break;
            case 7:
                evqs evqsVar7 = evqoVar.i;
                if (evqsVar7 == null) {
                    break;
                }
                break;
            case 8:
                evqs evqsVar8 = evqoVar.k;
                if (evqsVar8 == null) {
                    break;
                }
                break;
            case 9:
                evqs evqsVar9 = evqoVar.l;
                if (evqsVar9 == null) {
                    break;
                }
                break;
            case 10:
                evqs evqsVar10 = evqoVar.m;
                if (evqsVar10 == null) {
                    break;
                }
                break;
            default:
                evqs evqsVar11 = evqoVar.c;
                if (evqsVar11 == null) {
                    break;
                }
                break;
        }
        return evqs.a;
    }

    private final int M(CharSequence charSequence, evqo evqoVar) {
        return N(charSequence, evqoVar, 12);
    }

    private final int N(CharSequence charSequence, evqo evqoVar, int i2) {
        List list;
        eygi eygiVar;
        evqs L = L(evqoVar, i2);
        if (L.d.size() == 0) {
            evqs evqsVar = evqoVar.c;
            if (evqsVar == null) {
                evqsVar = evqs.a;
            }
            list = evqsVar.d;
        } else {
            list = L.d;
        }
        List list2 = L.e;
        if (i2 == 3) {
            if (!K(L(evqoVar, 1))) {
                return N(charSequence, evqoVar, 2);
            }
            evqs L2 = L(evqoVar, 2);
            if (K(L2)) {
                List arrayList = new ArrayList(list);
                if (L2.d.size() == 0) {
                    evqs evqsVar2 = evqoVar.c;
                    if (evqsVar2 == null) {
                        evqsVar2 = evqs.a;
                    }
                    eygiVar = evqsVar2.d;
                } else {
                    eygiVar = L2.d;
                }
                arrayList.addAll(eygiVar);
                Collections.sort(arrayList);
                if (list2.isEmpty()) {
                    list2 = L2.e;
                } else {
                    List arrayList2 = new ArrayList(list2);
                    arrayList2.addAll(L2.e);
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
        Object valueOf = Integer.valueOf(length);
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

    private static final boolean O(evrz evrzVar, evrz evrzVar2) {
        String valueOf = String.valueOf(evrzVar.d);
        String valueOf2 = String.valueOf(evrzVar2.d);
        return valueOf.endsWith(valueOf2) || valueOf2.endsWith(valueOf);
    }

    public static synchronized evqu h() {
        evqu evquVar;
        synchronized (evqu.class) {
            if (q == null) {
                n(new evqu(evqw.a().b, evqd.a));
            }
            evquVar = q;
        }
        return evquVar;
    }

    static synchronized void n(evqu evquVar) {
        synchronized (evqu.class) {
            q = evquVar;
        }
    }

    static boolean s(CharSequence charSequence) {
        if (charSequence.length() < 2) {
            return false;
        }
        return o.matcher(charSequence).matches();
    }

    public final void A(int i2, int i3, StringBuilder sb) {
        int i4 = i3 - 1;
        if (i4 == 0) {
            sb.insert(0, i2).insert(0, '+');
        } else if (i4 == 1) {
            sb.insert(0, " ").insert(0, i2).insert(0, '+');
        } else {
            if (i4 != 3) {
                return;
            }
            sb.insert(0, "-").insert(0, i2).insert(0, '+').insert(0, "tel:");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String B(java.lang.String r4, defpackage.evqh r5, int r6) {
        /*
            r3 = this;
            evrb r0 = r3.u
            java.lang.String r1 = r5.d
            java.lang.String r2 = r5.c
            java.util.regex.Pattern r0 = r0.a(r2)
            java.util.regex.Matcher r4 = r0.matcher(r4)
            java.lang.String r5 = r5.f
            r0 = 3
            if (r6 != r0) goto L29
            int r6 = r5.length()
            if (r6 <= 0) goto L28
            java.util.regex.Pattern r6 = defpackage.evqu.p
            java.util.regex.Matcher r6 = r6.matcher(r1)
            java.lang.String r5 = r6.replaceFirst(r5)
            java.lang.String r4 = r4.replaceAll(r5)
            goto L2e
        L28:
            r6 = r0
        L29:
            java.lang.String r4 = r4.replaceAll(r1)
            r0 = r6
        L2e:
            r5 = 4
            if (r0 != r5) goto L4d
            java.util.regex.Pattern r5 = defpackage.evqu.i
            java.util.regex.Matcher r5 = r5.matcher(r4)
            boolean r6 = r5.lookingAt()
            if (r6 == 0) goto L43
            java.lang.String r4 = ""
            java.lang.String r4 = r5.replaceFirst(r4)
        L43:
            java.util.regex.Matcher r4 = r5.reset(r4)
            java.lang.String r5 = "-"
            java.lang.String r4 = r4.replaceAll(r5)
        L4d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.evqu.B(java.lang.String, evqh, int):java.lang.String");
    }

    final void C(StringBuilder sb, evqo evqoVar, StringBuilder sb2) {
        int length = sb.length();
        String str = evqoVar.s;
        if (length == 0 || str.length() == 0) {
            return;
        }
        Matcher matcher = this.u.a(str).matcher(sb);
        if (matcher.lookingAt()) {
            evqs evqsVar = evqoVar.c;
            if (evqsVar == null) {
                evqsVar = evqs.a;
            }
            int a2 = evqx.a(sb, evqsVar);
            int groupCount = matcher.groupCount();
            String str2 = evqoVar.t;
            if (str2.length() == 0 || matcher.group(groupCount) == null) {
                if (a2 != 1 || evqx.a(sb.substring(matcher.end()), evqsVar) == 1) {
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
            if (a2 != 1 || evqx.a(sb3.toString(), evqsVar) == 1) {
                if (sb2 != null && groupCount > 1) {
                    sb2.append(matcher.group(1));
                }
                sb.replace(0, sb.length(), sb3.toString());
            }
        }
    }

    public final int a(evpx evpxVar) {
        evqo f2 = f(evpxVar);
        if (f2 != null) {
            return f2.o;
        }
        throw new IllegalArgumentException("Invalid region code: ".concat(String.valueOf(String.valueOf(evpxVar))));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final int b(java.lang.CharSequence r9, defpackage.evqo r10, java.lang.StringBuilder r11, boolean r12, defpackage.evrw r13) {
        /*
            Method dump skipped, instructions count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.evqu.b(java.lang.CharSequence, evqo, java.lang.StringBuilder, boolean, evrw):int");
    }

    public final evpx c(int i2) {
        List list = (List) this.s.get(Integer.valueOf(i2));
        return list == null ? evpx.ZZ : (evpx) list.get(0);
    }

    public final evpx d(evrz evrzVar) {
        int i2 = evrzVar.c;
        List<evpx> list = (List) this.s.get(Integer.valueOf(i2));
        if (list == null) {
            a.logp(Level.INFO, "com.google.i18n.phonenumbers.PhoneNumberUtil", "getRegionCodeForNumber", a.f(i2, "Missing/invalid country_code (", ")"));
            return null;
        }
        if (list.size() == 1) {
            return (evpx) list.get(0);
        }
        String k2 = k(evrzVar);
        for (evpx evpxVar : list) {
            evqo f2 = f(evpxVar);
            if ((f2.b & VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS) != 0) {
                if (this.u.a(f2.x).matcher(k2).lookingAt()) {
                    return evpxVar;
                }
            } else if (v(k2, f2) != 12) {
                return evpxVar;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final evqh e(List list, String str) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            evqh evqhVar = (evqh) it.next();
            int size = evqhVar.e.size();
            if (size != 0) {
                if (!this.u.a((String) evqhVar.e.get(size - 1)).matcher(str).lookingAt()) {
                    continue;
                }
            }
            if (this.u.a(evqhVar.c).matcher(str).matches()) {
                return evqhVar;
            }
        }
        return null;
    }

    public final evqo f(evpx evpxVar) {
        if (!r(evpxVar)) {
            return null;
        }
        evrs evrsVar = this.x;
        emxf.a(evqy.a(evpxVar));
        evqo b2 = ((evrl) evrsVar.a.a(evrsVar.b.a(evpxVar))).b.b(evpxVar);
        J(b2, "Missing metadata for region code ".concat(String.valueOf(String.valueOf(evpxVar))));
        return b2;
    }

    public final evqo g(int i2, evpx evpxVar) {
        if (!g.equals(evpxVar)) {
            return f(evpxVar);
        }
        Set set = this.w;
        Integer valueOf = Integer.valueOf(i2);
        if (!set.contains(valueOf)) {
            return null;
        }
        evrs evrsVar = this.x;
        evpx evpxVar2 = evqy.a;
        List list = (List) evqd.a.get(Integer.valueOf(i2));
        boolean z = false;
        if (list != null && !list.contains(evqy.a)) {
            z = true;
        }
        emxf.a(!z);
        evqo b2 = ((evrl) evrsVar.a.a(evrsVar.b.a(valueOf))).a.b(valueOf);
        J(b2, a.h(i2, "Missing metadata for country code "));
        return b2;
    }

    public final evrz i(CharSequence charSequence, evpx evpxVar) {
        evqj c2 = evqk.c();
        ((evpz) c2).a = evpxVar;
        return j(charSequence, c2.a());
    }

    public final evrz j(CharSequence charSequence, evqk evqkVar) {
        evrw evrwVar = (evrw) evrz.a.createBuilder();
        evqa evqaVar = (evqa) evqkVar;
        m(charSequence, evqaVar.a, evqaVar.b, true, evrwVar);
        return (evrz) evrwVar.build();
    }

    public final String k(evrz evrzVar) {
        int i2;
        StringBuilder sb = new StringBuilder();
        if (evrzVar.f && (i2 = evrzVar.g) > 0) {
            char[] cArr = new char[i2];
            Arrays.fill(cArr, '0');
            sb.append(new String(cArr));
        }
        sb.append(evrzVar.d);
        return sb.toString();
    }

    public final String l(StringBuilder sb) {
        Matcher matcher = n.matcher(sb);
        if (!matcher.find() || !s(sb.substring(0, matcher.start()))) {
            return "";
        }
        int groupCount = matcher.groupCount();
        for (int i2 = 1; i2 <= groupCount; i2++) {
            if (matcher.group(i2) != null) {
                String group = matcher.group(i2);
                sb.delete(matcher.start(), sb.length());
                return group;
            }
        }
        return "";
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(java.lang.CharSequence r18, defpackage.evpx r19, boolean r20, boolean r21, defpackage.evrw r22) {
        /*
            Method dump skipped, instructions count: 872
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.evqu.m(java.lang.CharSequence, evpx, boolean, boolean, evrw):void");
    }

    public final boolean o(int i2) {
        return this.s.containsKey(Integer.valueOf(i2));
    }

    public final boolean p(evpx evpxVar) {
        return this.t.contains(evpxVar);
    }

    public final boolean q(evrz evrzVar) {
        int w = w(evrzVar);
        return w == 1 || w == 2;
    }

    public final boolean r(evpx evpxVar) {
        return evpxVar != null && this.v.contains(evpxVar);
    }

    public final int t(evrz evrzVar, evrz evrzVar2) {
        evrw G = G(evrzVar);
        evrz evrzVar3 = (evrz) G.build();
        evrz evrzVar4 = (evrz) G(evrzVar2).build();
        if ((evrzVar3.b & 4) != 0 && (evrzVar4.b & 4) != 0 && !evrzVar3.e.equals(evrzVar4.e)) {
            return 2;
        }
        int i2 = evrzVar3.c;
        int i3 = evrzVar4.c;
        if (i2 != 0 && i3 != 0) {
            if (evrzVar3.equals(evrzVar4)) {
                return 5;
            }
            return (i2 == i3 && O(evrzVar3, evrzVar4)) ? 3 : 2;
        }
        G.copyOnWrite();
        evrz evrzVar5 = (evrz) G.instance;
        evrzVar5.b |= 1;
        evrzVar5.c = i3;
        evrz evrzVar6 = (evrz) G.build();
        if (evrzVar6.equals(evrzVar4)) {
            return 4;
        }
        return O(evrzVar6, evrzVar4) ? 3 : 2;
    }

    public final int u(evrz evrzVar, CharSequence charSequence) {
        try {
            return t(evrzVar, i(charSequence, evpx.ZZ));
        } catch (evqi e2) {
            if (e2.a == 1) {
                evpx c2 = c(evrzVar.c);
                try {
                    if (c2.equals(evpx.ZZ)) {
                        evrw evrwVar = (evrw) evrz.a.createBuilder();
                        try {
                            m(charSequence, null, false, false, evrwVar);
                            return t(evrzVar, (evrz) evrwVar.build());
                        } catch (evqi unused) {
                            return 1;
                        }
                    }
                    int t = t(evrzVar, i(charSequence, c2));
                    if (t == 5) {
                        return 4;
                    }
                    return t;
                } catch (evqi unused2) {
                    return 1;
                }
            }
            return 1;
        }
    }

    public final int v(String str, evqo evqoVar) {
        evqs evqsVar = evqoVar.c;
        if (evqsVar == null) {
            evqsVar = evqs.a;
        }
        if (!F(str, evqsVar)) {
            return 12;
        }
        evqs evqsVar2 = evqoVar.g;
        if (evqsVar2 == null) {
            evqsVar2 = evqs.a;
        }
        if (F(str, evqsVar2)) {
            return 5;
        }
        evqs evqsVar3 = evqoVar.f;
        if (evqsVar3 == null) {
            evqsVar3 = evqs.a;
        }
        if (F(str, evqsVar3)) {
            return 4;
        }
        evqs evqsVar4 = evqoVar.h;
        if (evqsVar4 == null) {
            evqsVar4 = evqs.a;
        }
        if (F(str, evqsVar4)) {
            return 6;
        }
        evqs evqsVar5 = evqoVar.j;
        if (evqsVar5 == null) {
            evqsVar5 = evqs.a;
        }
        if (F(str, evqsVar5)) {
            return 7;
        }
        evqs evqsVar6 = evqoVar.i;
        if (evqsVar6 == null) {
            evqsVar6 = evqs.a;
        }
        if (F(str, evqsVar6)) {
            return 8;
        }
        evqs evqsVar7 = evqoVar.k;
        if (evqsVar7 == null) {
            evqsVar7 = evqs.a;
        }
        if (F(str, evqsVar7)) {
            return 9;
        }
        evqs evqsVar8 = evqoVar.l;
        if (evqsVar8 == null) {
            evqsVar8 = evqs.a;
        }
        if (F(str, evqsVar8)) {
            return 10;
        }
        evqs evqsVar9 = evqoVar.m;
        if (evqsVar9 == null) {
            evqsVar9 = evqs.a;
        }
        if (F(str, evqsVar9)) {
            return 11;
        }
        evqs evqsVar10 = evqoVar.d;
        if (evqsVar10 == null) {
            evqsVar10 = evqs.a;
        }
        if (F(str, evqsVar10)) {
            if (evqoVar.u) {
                return 3;
            }
            evqs evqsVar11 = evqoVar.e;
            if (evqsVar11 == null) {
                evqsVar11 = evqs.a;
            }
            return F(str, evqsVar11) ? 3 : 1;
        }
        if (!evqoVar.u) {
            evqs evqsVar12 = evqoVar.e;
            if (evqsVar12 == null) {
                evqsVar12 = evqs.a;
            }
            if (F(str, evqsVar12)) {
                return 2;
            }
        }
        return 12;
    }

    public final int w(evrz evrzVar) {
        String k2 = k(evrzVar);
        int i2 = evrzVar.c;
        if (o(i2)) {
            return N(k2, g(i2, c(i2)), 12);
        }
        return 3;
    }

    public final String x(evrz evrzVar, int i2) {
        if (evrzVar.d == 0) {
            String str = evrzVar.h;
            if (str.length() > 0 || (evrzVar.b & 1) == 0) {
                return str;
            }
        }
        StringBuilder sb = new StringBuilder(20);
        sb.setLength(0);
        int i3 = evrzVar.c;
        String k2 = k(evrzVar);
        if (i2 == 1) {
            sb.append(k2);
            A(i3, 1, sb);
        } else if (o(i3)) {
            evqo g2 = g(i3, c(i3));
            sb.append(y(k2, g2, i2));
            z(evrzVar, g2, i2, sb);
            A(i3, i2, sb);
        } else {
            sb.append(k2);
        }
        return sb.toString();
    }

    public final String y(String str, evqo evqoVar, int i2) {
        evqh e2 = e((evqoVar.w.isEmpty() || i2 == 3) ? evqoVar.v : evqoVar.w, str);
        return e2 == null ? str : B(str, e2, i2);
    }

    public final void z(evrz evrzVar, evqo evqoVar, int i2, StringBuilder sb) {
        if ((evrzVar.b & 4) == 0 || evrzVar.e.length() <= 0) {
            return;
        }
        if (i2 == 4) {
            sb.append(";ext=");
            sb.append(evrzVar.e);
        } else if ((evqoVar.b & 4194304) != 0) {
            sb.append(evqoVar.r);
            sb.append(evrzVar.e);
        } else {
            sb.append(" ext. ");
            sb.append(evrzVar.e);
        }
    }
}
