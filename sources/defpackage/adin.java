package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adin implements eivv {
    public static final cskc a = cskc.g("BugleGaia", "AccountChangedLoggingCallbacks");
    public final ffbr b;
    public final ffbr c;
    private final ffbr d;
    private final ffbr e;
    private final ffbr f;
    private final ffbr g;
    private Optional h = Optional.empty();

    public adin(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6) {
        this.d = ffbrVar;
        this.b = ffbrVar2;
        this.e = ffbrVar3;
        this.c = ffbrVar4;
        this.f = ffbrVar5;
        this.g = ffbrVar6;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00b8  */
    @Override // defpackage.eivv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void aa(final defpackage.eivt r7) {
        /*
            r6 = this;
            java.lang.String r0 = r7.b()
            j$.util.Optional r1 = r6.h
            boolean r1 = r1.isPresent()
            java.lang.String r2 = "google"
            if (r1 == 0) goto L59
            j$.util.Optional r1 = r6.h
            java.lang.Object r1 = r1.get()
            eivt r1 = (defpackage.eivt) r1
            java.lang.String r1 = r1.b()
            boolean r3 = r1.equals(r0)
            if (r3 == 0) goto L22
            goto Lb2
        L22:
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L59
            ffbr r1 = r6.c
            java.lang.Object r1 = r1.b()
            cgfd r1 = (defpackage.cgfd) r1
            comc r3 = r1.c
            cgep r4 = new cgep
            r4.<init>()
            elfl r3 = r3.j(r4)
            cgeq r4 = new cgeq
            r4.<init>()
            errl r1 = r1.d
            elfl r1 = r3.h(r4, r1)
            defpackage.axnw.h(r1)
            ffbr r1 = r6.c
            java.lang.Object r1 = r1.b()
            cgfd r1 = (defpackage.cgfd) r1
            r3 = 0
            elfl r1 = r1.c(r3)
            defpackage.axnw.h(r1)
        L59:
            boolean r0 = r0.equals(r2)
            ffbr r1 = r6.d
            java.lang.Object r1 = r1.b()
            cqoh r1 = (defpackage.cqoh) r1
            j$.time.Instant r1 = r1.f()
            long r1 = r1.toEpochMilli()
            ffbr r3 = r6.c
            java.lang.Object r3 = r3.b()
            cgfd r3 = (defpackage.cgfd) r3
            comc r4 = r3.c
            cger r5 = new cger
            r5.<init>()
            elfl r0 = r4.j(r5)
            cges r4 = new cges
            r4.<init>()
            errl r3 = r3.d
            elfl r0 = r0.h(r4, r3)
            adik r3 = new adik
            r3.<init>()
            ffbr r1 = r6.g
            java.lang.Object r1 = r1.b()
            java.util.concurrent.Executor r1 = (java.util.concurrent.Executor) r1
            elfl r0 = r0.i(r3, r1)
            adil r1 = new adil
            r1.<init>()
            ffbr r2 = r6.f
            java.lang.Object r2 = r2.b()
            java.util.concurrent.Executor r2 = (java.util.concurrent.Executor) r2
            java.lang.Class<java.lang.Exception> r3 = java.lang.Exception.class
            elfl r0 = r0.e(r3, r1, r2)
            defpackage.axnw.h(r0)
        Lb2:
            boolean r0 = defpackage.adhu.a()
            if (r0 == 0) goto Lc8
            j$.util.Optional r0 = r6.h
            adim r1 = new adim
            r1.<init>()
            r0.ifPresent(r1)
            j$.util.Optional r7 = j$.util.Optional.of(r7)
            r6.h = r7
        Lc8:
            ffbr r7 = r6.e
            java.lang.Object r7 = r7.b()
            akzt r7 = (defpackage.akzt) r7
            java.lang.String r0 = "Bugle.Account.Changed.Count"
            r7.c(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adin.aa(eivt):void");
    }

    @Override // defpackage.eivv
    public final void ab() {
        ((akzt) this.e.b()).c("Bugle.Account.Loading.Count");
    }

    @Override // defpackage.eivv
    public final void ac(eiup eiupVar) {
        ((akzt) this.e.b()).c("Bugle.Account.Error.Count");
    }

    @Override // defpackage.eivv
    public final /* synthetic */ void d() {
    }
}
