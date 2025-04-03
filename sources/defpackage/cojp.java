package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cojp extends ffhv implements ffjm {
    final /* synthetic */ cojr a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cojp(cojr cojrVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = cojrVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cojp) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        final cojr cojrVar = this.a;
        ekzz f = eleg.f("ScreenDetectionListener.registerDisplayListener");
        try {
            ffig.a(f, null);
            this.a.a();
            return ffcu.a;
        } finally {
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cojp(this.a, ffguVar);
    }
}
