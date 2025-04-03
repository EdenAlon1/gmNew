package defpackage;

import j$.util.DesugarCollections;
import java.io.Serializable;
import java.text.ParseException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class al implements Serializable {
    public static final al a;
    static final Pattern b;
    static final Pattern c;
    static final Pattern d;
    static final Pattern e;
    static final Pattern f;
    static final Pattern g;
    private static final ac i;
    private static final aj j;
    private static final long serialVersionUID = 1;
    public final ak h;

    static {
        z zVar = new z();
        i = zVar;
        aj ajVar = new aj("other", zVar, null, null);
        j = ajVar;
        ak akVar = new ak();
        akVar.a(ajVar);
        a = new al(akVar);
        b = Pattern.compile("\\s*\\Q\\E@\\s*");
        c = Pattern.compile("\\s*or\\s*");
        d = Pattern.compile("\\s*and\\s*");
        e = Pattern.compile("\\s*,\\s*");
        Pattern.compile("\\s*\\Q..\\E\\s*");
        f = Pattern.compile("\\s*~\\s*");
        g = Pattern.compile("\\s*;\\s*");
    }

    public al(ak akVar) {
        this.h = akVar;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = akVar.b.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((aj) it.next()).a);
        }
        DesugarCollections.unmodifiableSet(linkedHashSet);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0403 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:211:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x01e5 A[PHI: r8
      0x01e5: PHI (r8v3 int) = (r8v2 int), (r8v9 int) binds: [B:108:0x01d9, B:109:0x01e0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:238:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x01dc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.aj a(java.lang.String r39) {
        /*
            Method dump skipped, instructions count: 1222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.al.a(java.lang.String):aj");
    }

    public static void b(StringBuilder sb, double d2, double d3, boolean z) {
        if (z) {
            sb.append(",");
        }
        if (d2 == d3) {
            sb.append(c(d2));
            return;
        }
        sb.append(c(d2) + ".." + c(d3));
    }

    private static String c(double d2) {
        long j2 = (long) d2;
        return d2 == ((double) j2) ? String.valueOf(j2) : String.valueOf(d2);
    }

    private static String d(String[] strArr, int i2, String str) {
        if (i2 < strArr.length) {
            return strArr[i2];
        }
        throw new ParseException(a.a(str, "missing token at end of '", "'"), -1);
    }

    private static ParseException e(String str, String str2) {
        return new ParseException(a.d(str2, str, "unexpected token '", "' in '", "'"), -1);
    }

    public final boolean equals(Object obj) {
        al alVar;
        return (obj instanceof al) && (alVar = (al) obj) != null && toString().equals(alVar.toString());
    }

    @Deprecated
    public final int hashCode() {
        return this.h.hashCode();
    }

    public final String toString() {
        return this.h.toString();
    }
}
