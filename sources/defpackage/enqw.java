package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enqw {
    private static final emvz d = emvz.l(" \t\n\r\f\u000b\u0085\u2028\u2029\u200d\uffef�\ufffe\uffff").j();
    private static final emvz e = new emvu(new emvx(new emvx(new emvo(0, 31), new emvp(127)), emvz.l(" @,:<>"))).n();
    private static final emvz f = new emvu(new emvx(new emvx(new emvo(0, 31), new emvp(127)), emvz.l(" @,:<>+%"))).n();
    public final String a;
    public final String b;
    public final boolean c;

    /* JADX WARN: Code restructure failed: missing block: B:71:0x00f2, code lost:
    
        if (defpackage.emvk.a.h(r10) == false) goto L77;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public enqw(java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.enqw.<init>(java.lang.String):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof enqw) {
            enqw enqwVar = (enqw) obj;
            if (emxb.a(this.a, enqwVar.a) && emxb.a(this.b, enqwVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        return this.a + "@" + this.b;
    }
}
