package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cigm implements cifg {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/net/handler/ditto/UnlinkIdentityDelegate");
    private final ffsk b;
    private final ffsk c;
    private final Optional d;
    private final ffbr e;

    public cigm(ffsk ffskVar, ffsk ffskVar2, Optional optional, ffbr ffbrVar) {
        ffskVar.getClass();
        ffskVar2.getClass();
        optional.getClass();
        ffbrVar.getClass();
        this.b = ffskVar;
        this.c = ffskVar2;
        this.d = optional;
        this.e = ffbrVar;
    }

    @Override // defpackage.cifg
    public final /* synthetic */ elfl a(ciff ciffVar) {
        return cife.a(this, ciffVar);
    }

    @Override // defpackage.cifg
    public final /* bridge */ /* synthetic */ elfl b(ciff ciffVar, eyhs eyhsVar) {
        elfl c;
        elfl c2;
        ((esdi) eyhsVar).getClass();
        if (((Boolean) cfma.a.e()).booleanValue()) {
            c = axol.c(this.c, ffhe.a, ffsm.a, new cigk(this, null));
            return c;
        }
        ensk j = a.j();
        j.Y(ente.a, "BugleDittoRcs");
        ((enrr) j.h("com/google/android/apps/messaging/shared/net/handler/ditto/UnlinkIdentityDelegate", "handleRequestInternal", 45, "UnlinkIdentityDelegate.kt")).q("Ditto RCS is not enabled.");
        c2 = axol.c(this.b, ffhe.a, ffsm.a, new cigj(null));
        return c2;
    }

    @Override // defpackage.cifg
    public final /* bridge */ /* synthetic */ eyhs c(eyee eyeeVar) {
        esdi esdiVar = (esdi) eyfy.parseFrom(esdi.a, eyeeVar, eyfc.a());
        esdiVar.getClass();
        return esdiVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.ffgu r8) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cigm.d(ffgu):java.lang.Object");
    }
}
