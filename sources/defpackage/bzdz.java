package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzdz {
    public static final cskc a = cskc.g("BugleNetwork", "SettingsUpdate");
    public final ffbr b;
    public final ffbr c;
    public final chww d;
    private final errl e;
    private final cgzv f;
    private final Optional g;
    private final ctud h;

    public bzdz(errl errlVar, cgzv cgzvVar, Optional optional, ffbr ffbrVar, ctud ctudVar, chww chwwVar, ffbr ffbrVar2) {
        this.e = errlVar;
        this.f = cgzvVar;
        this.g = optional;
        this.b = ffbrVar;
        this.h = ctudVar;
        this.d = chwwVar;
        this.c = ffbrVar2;
    }

    public final elfl a(final fcek fcekVar, final Optional optional, final String str) {
        if (!((Boolean) cful.i.e()).booleanValue()) {
            return elfo.e(fbzx.a);
        }
        if (!this.h.l()) {
            a.r("Skip settings update due to missing READ_PHONE_STATE permission.");
            return elfo.e(fbzx.a);
        }
        if (!this.g.isEmpty()) {
            return this.f.c().i(new eroh() { // from class: bzdy
                /* JADX WARN: Removed duplicated region for block: B:11:0x00ad  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x009c  */
                @Override // defpackage.eroh
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final com.google.common.util.concurrent.ListenableFuture a(java.lang.Object r8) {
                    /*
                        r7 = this;
                        escg r8 = (defpackage.escg) r8
                        cskc r0 = defpackage.bzdz.a
                        csjb r0 = r0.d()
                        java.lang.String r1 = "Settings"
                        r0.A(r1, r8)
                        r0.r()
                        bzdz r0 = defpackage.bzdz.this
                        ffbr r1 = r0.c
                        java.lang.Object r1 = r1.b()
                        cgcu r1 = (defpackage.cgcu) r1
                        boolean r1 = r1.a()
                        java.lang.String r2 = r3
                        r3 = 5
                        if (r1 == 0) goto L5d
                        j$.util.Optional r1 = r2
                        boolean r4 = r1.isPresent()
                        if (r4 == 0) goto L5d
                        chww r4 = r0.d
                        java.lang.Object r1 = r1.get()
                        esaa r5 = defpackage.esaa.GET_UPDATES
                        bzge r1 = (defpackage.bzge) r1
                        chwu r1 = r4.a(r1, r5)
                        r1.c = r2
                        erxi r2 = defpackage.erxi.a
                        eyfq r2 = r2.createBuilder()
                        erxg r2 = (defpackage.erxg) r2
                        r2.copyOnWrite()
                        MessageType extends eyfy<MessageType, BuilderType> r4 = r2.instance
                        erxi r4 = (defpackage.erxi) r4
                        r8.getClass()
                        r4.c = r8
                        r4.b = r3
                        eyfy r8 = r2.build()
                        r1.b(r8)
                        chwv r8 = r1.a()
                        goto L8e
                    L5d:
                        fcek r1 = r4
                        chww r4 = r0.d
                        j$.util.Optional r5 = j$.util.Optional.empty()
                        esaa r6 = defpackage.esaa.GET_UPDATES
                        chwu r1 = r4.c(r1, r5, r6)
                        r1.c = r2
                        erxi r2 = defpackage.erxi.a
                        eyfq r2 = r2.createBuilder()
                        erxg r2 = (defpackage.erxg) r2
                        r2.copyOnWrite()
                        MessageType extends eyfy<MessageType, BuilderType> r4 = r2.instance
                        erxi r4 = (defpackage.erxi) r4
                        r8.getClass()
                        r4.c = r8
                        r4.b = r3
                        eyfy r8 = r2.build()
                        r1.b(r8)
                        chwv r8 = r1.a()
                    L8e:
                        ffbr r1 = r0.b
                        java.lang.Object r1 = r1.b()
                        j$.util.Optional r1 = (j$.util.Optional) r1
                        boolean r1 = r1.isEmpty()
                        if (r1 == 0) goto Lad
                        cskc r8 = defpackage.bzdz.a
                        java.lang.String r0 = "DittoRetryExecutor is not available on this device."
                        r8.r(r0)
                        java.lang.UnsupportedOperationException r8 = new java.lang.UnsupportedOperationException
                        r8.<init>(r0)
                        elfl r8 = defpackage.elfo.d(r8)
                        return r8
                    Lad:
                        ffbr r0 = r0.b
                        java.lang.Object r0 = r0.b()
                        j$.util.Optional r0 = (j$.util.Optional) r0
                        java.lang.Object r0 = r0.get()
                        cikg r0 = (defpackage.cikg) r0
                        elfl r0 = r0.a(r8)
                        r8.q(r0)
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.bzdy.a(java.lang.Object):com.google.common.util.concurrent.ListenableFuture");
                }
            }, this.e);
        }
        a.r("Skip settings update due to missing ditto foreground service");
        return elfo.e(fbzx.a);
    }
}
