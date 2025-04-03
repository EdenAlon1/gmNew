package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class exv extends ffhv implements ffjm {
    int a;
    final /* synthetic */ evc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public exv(evc evcVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = evcVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((exv) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object obj2 = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            evc evcVar = this.b;
            this.a = 1;
            cok cokVar = new cok((byte[]) null);
            Object g = fgct.g((fgct) evcVar.a.a, new evb(cokVar, evcVar), this);
            if (g != ffhh.a) {
                g = ffcu.a;
            }
            if (g == obj2) {
                return obj2;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new exv(this.b, ffguVar);
    }
}
