package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class baqi extends ffhv implements ffjm {
    final /* synthetic */ bara a;
    final /* synthetic */ long b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public baqi(ffgu ffguVar, bara baraVar, long j) {
        super(2, ffguVar);
        this.a = baraVar;
        this.b = j;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((baqi) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ((coxg) this.a.y.b()).i(this.b);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        baqi baqiVar = new baqi(ffguVar, this.a, this.b);
        baqiVar.c = obj;
        return baqiVar;
    }
}
