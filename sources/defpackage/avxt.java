package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avxt implements awgn {
    private final ffbr a;

    public avxt(ffbr ffbrVar) {
        this.a = ffbrVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0073, code lost:
    
        if (true != ((java.lang.Boolean) r8.a.b()).booleanValue()) goto L26;
     */
    @Override // defpackage.awgn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.epyh a(defpackage.avvd r9) {
        /*
            r8 = this;
            avuq r9 = (defpackage.avuq) r9
            enhk r0 = r9.c
            java.lang.String r1 = "Retry-After"
            boolean r0 = r0.containsKey(r1)
            r2 = 0
            if (r0 != 0) goto Lf
            goto L4c
        Lf:
            enhk r0 = r9.c
            java.lang.Object r0 = r0.get(r1)
            java.util.List r0 = (java.util.List) r0
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto L1e
            goto L4c
        L1e:
            r4 = 0
            java.lang.Object r0 = r0.get(r4)     // Catch: java.lang.NumberFormatException -> L2a
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.NumberFormatException -> L2a
            long r2 = java.lang.Long.parseLong(r0)     // Catch: java.lang.NumberFormatException -> L2a
            goto L4c
        L2a:
            r0 = move-exception
            entd r4 = defpackage.avvd.f
            ensk r4 = r4.j()
            ensz r4 = (defpackage.ensz) r4
            ensk r0 = r4.g(r0)
            ensz r0 = (defpackage.ensz) r0
            java.lang.String r4 = "getRetryAfterValue"
            r5 = 146(0x92, float:2.05E-43)
            java.lang.String r6 = "com/google/android/apps/messaging/shared/chatapi/filetransfer/FileTransferFailure"
            java.lang.String r7 = "FileTransferFailure.java"
            ensk r0 = r0.h(r6, r4, r5, r7)
            ensz r0 = (defpackage.ensz) r0
            java.lang.String r4 = "Failed to parse %s header. Retrying immediately."
            r0.t(r4, r1)
        L4c:
            int r9 = r9.b
            r0 = 401(0x191, float:5.62E-43)
            r1 = 1
            r4 = 4
            r5 = 2
            if (r9 == r0) goto L76
            r0 = 410(0x19a, float:5.75E-43)
            if (r9 == r0) goto L75
            r0 = 422(0x1a6, float:5.91E-43)
            if (r9 == r0) goto L76
            r0 = 403(0x193, float:5.65E-43)
            if (r9 == r0) goto L67
            r0 = 404(0x194, float:5.66E-43)
            if (r9 == r0) goto L75
            r4 = 3
            goto L76
        L67:
            ffbr r9 = r8.a
            java.lang.Object r9 = r9.b()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r1 == r9) goto L76
        L75:
            r4 = r5
        L76:
            epyh r9 = defpackage.epyh.a
            eyfq r9 = r9.createBuilder()
            epye r9 = (defpackage.epye) r9
            r9.copyOnWrite()
            MessageType extends eyfy<MessageType, BuilderType> r0 = r9.instance
            epyh r0 = (defpackage.epyh) r0
            int r4 = r4 + (-1)
            r0.c = r4
            int r4 = r0.b
            r1 = r1 | r4
            r0.b = r1
            r9.copyOnWrite()
            MessageType extends eyfy<MessageType, BuilderType> r0 = r9.instance
            epyh r0 = (defpackage.epyh) r0
            int r1 = r0.b
            r1 = r1 | r5
            r0.b = r1
            r0.d = r2
            eyfy r9 = r9.build()
            epyh r9 = (defpackage.epyh) r9
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avxt.a(avvd):epyh");
    }
}
