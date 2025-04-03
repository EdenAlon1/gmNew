package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpud extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dpui b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpud(dpui dpuiVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dpuiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dpud) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            dpui dpuiVar = this.b;
            drlx a = drjy.a(dpui.a);
            this.a = 1;
            uig uigVar = (uig) dpuiVar.d.b;
            obj = ffra.a(ekxi.a(uigVar.a), new uif(null, a, uigVar.b), this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        if (obj != null) {
            return obj;
        }
        throw new IllegalArgumentException("Error getting output URI for image capture.");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dpud(this.b, ffguVar);
    }
}
