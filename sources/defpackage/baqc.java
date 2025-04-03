package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class baqc extends ffhv implements ffjm {
    final /* synthetic */ bara a;
    final /* synthetic */ int b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public baqc(ffgu ffguVar, bara baraVar, int i) {
        super(2, ffguVar);
        this.a = baraVar;
        this.b = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((baqc) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return Boolean.valueOf(this.a.l.c(this.b));
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        baqc baqcVar = new baqc(ffguVar, this.a, this.b);
        baqcVar.c = obj;
        return baqcVar;
    }
}
