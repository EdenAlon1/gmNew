package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fgz extends ffhv implements ffjm {
    final /* synthetic */ fhi a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fgz(fhi fhiVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = fhiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fgz) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        this.a.B(true);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new fgz(this.a, ffguVar);
    }
}
