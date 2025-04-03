package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class anvh extends ffhv implements ffjm {
    final /* synthetic */ anvl a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public anvh(anvl anvlVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = anvlVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((anvh) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        engw y = anvl.d(this.a.c.a).y();
        bduq bduqVar = new bduq();
        bduqVar.d(y);
        return engq.a(bduqVar.c());
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new anvh(this.a, ffguVar);
    }
}
