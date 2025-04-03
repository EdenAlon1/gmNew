package defpackage;

import android.text.SpannableStringBuilder;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nlt {
    public final String a;
    public final String b;
    public final boolean c;
    public final long d;
    public final long e;
    public final nlz f;
    public final String[] g;
    public final String h;
    public final String i;
    public final nlt j;
    private final HashMap k;
    private final HashMap l;
    private List m;

    public nlt(String str, String str2, long j, long j2, nlz nlzVar, String[] strArr, String str3, String str4, nlt nltVar) {
        this.a = str;
        this.b = str2;
        this.i = str4;
        this.f = nlzVar;
        this.g = strArr;
        this.c = str2 != null;
        this.d = j;
        this.e = j2;
        lti.f(str3);
        this.h = str3;
        this.j = nltVar;
        this.k = new HashMap();
        this.l = new HashMap();
    }

    private static SpannableStringBuilder i(String str, Map map) {
        if (!map.containsKey(str)) {
            lsy lsyVar = new lsy();
            lsyVar.a = new SpannableStringBuilder();
            map.put(str, lsyVar);
        }
        CharSequence charSequence = ((lsy) map.get(str)).a;
        lti.f(charSequence);
        return (SpannableStringBuilder) charSequence;
    }

    public final int a() {
        List list = this.m;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public final nlt b(int i) {
        List list = this.m;
        if (list != null) {
            return (nlt) list.get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    public final void c(nlt nltVar) {
        if (this.m == null) {
            this.m = new ArrayList();
        }
        this.m.add(nltVar);
    }

    public final void d(TreeSet treeSet, boolean z) {
        String str = this.a;
        boolean equals = "p".equals(str);
        boolean equals2 = "div".equals(str);
        if (z || equals || (equals2 && this.i != null)) {
            long j = this.d;
            if (j != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j));
            }
            long j2 = this.e;
            if (j2 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j2));
            }
        }
        if (this.m != null) {
            for (int i = 0; i < this.m.size(); i++) {
                nlt nltVar = (nlt) this.m.get(i);
                boolean z2 = true;
                if (!z && !equals) {
                    z2 = false;
                }
                nltVar.d(treeSet, z2);
            }
        }
    }

    public final void e(long j, String str, List list) {
        String str2;
        if (!"".equals(this.h)) {
            str = this.h;
        }
        if (h(j) && "div".equals(this.a) && (str2 = this.i) != null) {
            list.add(new Pair(str, str2));
            return;
        }
        for (int i = 0; i < a(); i++) {
            b(i).e(j, str, list);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0261  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(long r19, java.util.Map r21, java.util.Map r22, java.lang.String r23, java.util.Map r24) {
        /*
            Method dump skipped, instructions count: 675
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nlt.f(long, java.util.Map, java.util.Map, java.lang.String, java.util.Map):void");
    }

    public final void g(long j, boolean z, String str, Map map) {
        Map map2;
        boolean z2;
        long j2;
        this.k.clear();
        this.l.clear();
        if ("metadata".equals(this.a)) {
            return;
        }
        if (!"".equals(this.h)) {
            str = this.h;
        }
        String str2 = str;
        if (this.c && z) {
            SpannableStringBuilder i = i(str2, map);
            String str3 = this.b;
            lti.f(str3);
            i.append((CharSequence) str3);
            return;
        }
        if ("br".equals(this.a) && z) {
            i(str2, map).append('\n');
            return;
        }
        if (h(j)) {
            for (Map.Entry entry : map.entrySet()) {
                HashMap hashMap = this.k;
                String str4 = (String) entry.getKey();
                CharSequence charSequence = ((lsy) entry.getValue()).a;
                lti.f(charSequence);
                hashMap.put(str4, Integer.valueOf(charSequence.length()));
            }
            boolean equals = "p".equals(this.a);
            int i2 = 0;
            while (i2 < a()) {
                nlt b = b(i2);
                if (z || equals) {
                    map2 = map;
                    z2 = true;
                    j2 = j;
                } else {
                    j2 = j;
                    map2 = map;
                    z2 = false;
                }
                b.g(j2, z2, str2, map2);
                i2++;
                j = j2;
                map = map2;
            }
            Map map3 = map;
            if (equals) {
                SpannableStringBuilder i3 = i(str2, map3);
                int length = i3.length();
                do {
                    length--;
                    if (length < 0) {
                        break;
                    }
                } while (i3.charAt(length) == ' ');
                if (length >= 0 && i3.charAt(length) != '\n') {
                    i3.append('\n');
                }
            }
            for (Map.Entry entry2 : map3.entrySet()) {
                HashMap hashMap2 = this.l;
                String str5 = (String) entry2.getKey();
                CharSequence charSequence2 = ((lsy) entry2.getValue()).a;
                lti.f(charSequence2);
                hashMap2.put(str5, Integer.valueOf(charSequence2.length()));
            }
        }
    }

    public final boolean h(long j) {
        long j2 = this.d;
        if (j2 == -9223372036854775807L) {
            if (this.e == -9223372036854775807L) {
                return true;
            }
            j2 = -9223372036854775807L;
        }
        if (j2 <= j && this.e == -9223372036854775807L) {
            return true;
        }
        if (j2 != -9223372036854775807L || j >= this.e) {
            return j2 <= j && j < this.e;
        }
        return true;
    }
}
