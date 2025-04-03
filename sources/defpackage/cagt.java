package defpackage;

import com.google.communication.synapse.security.scytale.Scope;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cagt extends ceut {
    public static final cskc a = cskc.g("BugleEtouffee", "EncryptedMessageDeletionWorkHandler");
    public final ffbr b;
    private final ffbr c;
    private final fazb d;
    private final ffsk e;

    public cagt(ffbr ffbrVar, ffbr ffbrVar2, fazb fazbVar, ffsk ffskVar) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        fazbVar.getClass();
        ffskVar.getClass();
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = fazbVar;
        this.e = ffskVar;
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("EncryptedMessageDeletionWorkHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        eyhz parserForType = cagq.a.getParserForType();
        parserForType.getClass();
        return parserForType;
    }

    @Override // defpackage.ceut
    public final /* bridge */ /* synthetic */ elfl j(ceuw ceuwVar, eyhs eyhsVar) {
        elfl c;
        cagq cagqVar = (cagq) eyhsVar;
        cagqVar.getClass();
        this.d.b();
        c = axol.c(this.e, ffhe.a, ffsm.a, new cags(cagqVar, this, Scope.create(((cafi) this.c.b()).b()), null));
        return c;
    }
}
