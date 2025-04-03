package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class emxy extends emyc {
    final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public emxy(emye emyeVar, CharSequence charSequence, String str) {
        super(emyeVar, charSequence);
        this.b = str;
    }

    @Override // defpackage.emyc
    public final int b(int i) {
        return i + this.b.length();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
    
        r7 = r7 + 1;
     */
    @Override // defpackage.emyc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int c(int r7) {
        /*
            r6 = this;
            java.lang.CharSequence r0 = r6.c
            java.lang.String r1 = r6.b
            int r1 = r1.length()
            int r0 = r0.length()
            int r0 = r0 - r1
        Ld:
            if (r7 > r0) goto L29
            r2 = 0
        L10:
            if (r2 >= r1) goto L28
            java.lang.CharSequence r3 = r6.c
            int r4 = r2 + r7
            java.lang.String r5 = r6.b
            char r3 = r3.charAt(r4)
            char r4 = r5.charAt(r2)
            if (r3 == r4) goto L25
            int r7 = r7 + 1
            goto Ld
        L25:
            int r2 = r2 + 1
            goto L10
        L28:
            return r7
        L29:
            r7 = -1
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.emxy.c(int):int");
    }
}
