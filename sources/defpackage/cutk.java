package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cutk extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cutp b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cutk(ffgu ffguVar, cutp cutpVar) {
        super(2, ffguVar);
        this.b = cutpVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cutk) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        try {
            if (this.a != 0) {
                ffci.b(obj);
            } else {
                ffci.b(obj);
                long j = ffpw.a;
                Object e = cubs.E.e();
                e.getClass();
                long e2 = ffpy.e(((Number) e).longValue(), ffpz.d);
                cutl cutlVar = new cutl(this.b, null);
                this.a = 1;
                if (ffvm.b(e2, cutlVar, this) == ffhhVar) {
                    return ffhhVar;
                }
            }
            return true;
        } catch (Exception e3) {
            ensk j2 = cutp.a.j();
            j2.Y(ente.a, "BugleSpam");
            enrr enrrVar = (enrr) ((enrr) j2).g(e3);
            enrrVar.aa(ensy.FULL);
            ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/util/spam/spatula/HaasProxyImpl$isAvailable$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 80, "HaasProxyImpl.kt")).q("SafetyCore prewarm failed.");
            return false;
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cutk cutkVar = new cutk(ffguVar, this.b);
        cutkVar.c = obj;
        return cutkVar;
    }
}
