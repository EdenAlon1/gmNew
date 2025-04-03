package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class eakz extends ffhv implements ffjm {
    final /* synthetic */ eala a;
    final /* synthetic */ eakw b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eakz(eala ealaVar, eakw eakwVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = ealaVar;
        this.b = eakwVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((eakz) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object obj2;
        eakx e;
        ffci.b(obj);
        eala ealaVar = this.a;
        eakw eakwVar = this.b;
        try {
            try {
                synchronized (ealaVar.b) {
                    eakx eakxVar = (eakx) ealaVar.b.get(eakwVar);
                    if (eakxVar != null) {
                        if (!ealaVar.g(eakxVar)) {
                            ealaVar.f(eakxVar);
                        }
                        ealaVar.f(eakxVar);
                        e = ealaVar.e(eakwVar);
                        eala.a.o().J("Refreshed oauth token for [%s, %s] expiration %s", eakwVar.a, eakwVar.b, e.c);
                    }
                    eakxVar = ealaVar.e(eakwVar);
                    ealaVar.f(eakxVar);
                    e = ealaVar.e(eakwVar);
                    eala.a.o().J("Refreshed oauth token for [%s, %s] expiration %s", eakwVar.a, eakwVar.b, e.c);
                }
                synchronized (ealaVar.c) {
                }
                obj2 = e;
            } catch (Throwable th) {
                synchronized (ealaVar.c) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            obj2 = ffci.a(th2);
        }
        return new ffch(obj2);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        eakz eakzVar = new eakz(this.a, this.b, ffguVar);
        eakzVar.c = obj;
        return eakzVar;
    }
}
