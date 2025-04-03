package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cahv extends ffhv implements ffjm {
    final /* synthetic */ caia a;
    final /* synthetic */ awui b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cahv(caia caiaVar, awui awuiVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = caiaVar;
        this.b = awuiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cahv) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        djrv djrvVar = (djrv) this.a.b.b();
        djrk djrkVar = (djrk) this.a.c.b();
        String str = this.b.d;
        str.getClass();
        return Boolean.valueOf(djrvVar.v(djrkVar.a(str)));
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cahv(this.a, this.b, ffguVar);
    }
}
