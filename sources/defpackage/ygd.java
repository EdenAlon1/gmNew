package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ygd implements ffxy {
    final /* synthetic */ ygi a;

    public ygd(ygi ygiVar) {
        this.a = ygiVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @Override // defpackage.ffxy
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fQ(defpackage.yfw r10, defpackage.ffgu r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.ygc
            if (r0 == 0) goto L13
            r0 = r11
            ygc r0 = (defpackage.ygc) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ygc r0 = new ygc
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            java.lang.String r4 = "emit"
            java.lang.String r5 = "com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/encryption/DraftEncryptor$start$1$4"
            java.lang.String r6 = "DraftEncryptor.kt"
            java.lang.String r7 = "BugleComposeRow2"
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            ygd r10 = r0.d
            defpackage.ffci.b(r11)
            goto L97
        L31:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L39:
            defpackage.ffci.b(r11)
            boolean r11 = r10.a
            boolean r10 = r10.b
            enru r2 = defpackage.ygi.a
            ensk r2 = r2.e()
            ensn r8 = defpackage.ente.a
            r2.Y(r8, r7)
            r8 = 45
            ensk r2 = r2.h(r5, r4, r8, r6)
            enrr r2 = (defpackage.enrr) r2
            java.lang.String r8 = "DraftEncryptor isModified %b, isEncrypted %b"
            r2.I(r8, r11, r10)
            if (r11 != 0) goto L81
            if (r10 == 0) goto Lbd
            enru r10 = defpackage.ygi.a
            ensk r10 = r10.h()
            ensn r11 = defpackage.ente.a
            r10.Y(r11, r7)
            r11 = 48
            ensk r10 = r10.h(r5, r4, r11, r6)
            enrr r10 = (defpackage.enrr) r10
            java.lang.String r11 = "Draft isn't modified but is encrypted: removing encryption"
            r10.q(r11)
            ygi r10 = r9.a
            yfx r11 = new yfx
            r11.<init>()
            ydb r10 = r10.c
            r10.c(r11)
            goto Lbd
        L81:
            if (r10 != 0) goto Lbd
            ygi r10 = r9.a
            ygb r11 = new ygb
            fgcq r10 = r10.d
            r11.<init>(r10)
            r0.d = r9
            r0.c = r3
            java.lang.Object r10 = defpackage.fgbj.a(r11, r0)
            if (r10 == r1) goto Lbc
            r10 = r9
        L97:
            enru r11 = defpackage.ygi.a
            ensk r11 = r11.h()
            ensn r0 = defpackage.ente.a
            r11.Y(r0, r7)
            r0 = 57
            ensk r11 = r11.h(r5, r4, r0, r6)
            enrr r11 = (defpackage.enrr) r11
            java.lang.String r0 = "Draft is modified, not encrypted, and encryption is supported: adding encryption"
            r11.q(r0)
            ygi r10 = r10.a
            ydb r10 = r10.c
            yfy r11 = new yfy
            r11.<init>()
            r10.c(r11)
            goto Lbd
        Lbc:
            return r1
        Lbd:
            ffcu r10 = defpackage.ffcu.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ygd.fQ(yfw, ffgu):java.lang.Object");
    }
}
