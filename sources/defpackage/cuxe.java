package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuxe {
    private static final emvz a = emvz.l(" \t\n\r\f\u000b\u0085\u2028\u2029\u200d\uffef�\ufffe\uffff");
    private static final emvz b = new emvu(new emvx(new emvx(new emvo(0, 31), new emvp(127)), emvz.l(" @,:<>")));
    private boolean c;
    private String d;
    private String e;

    /* JADX WARN: Code restructure failed: missing block: B:70:0x0114, code lost:
    
        if (defpackage.emvk.a.h(r8.d) == false) goto L80;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private cuxe(java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cuxe.<init>(java.lang.String):void");
    }

    public static boolean a(String str) {
        return new cuxe(str).c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cuxe) {
            return toString().equals(((cuxe) obj).toString());
        }
        return false;
    }

    public final int hashCode() {
        return toString().hashCode();
    }

    public final String toString() {
        return this.d + "@" + this.e;
    }
}
