package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jhg extends ffhv implements ffjm {
    int a;
    final /* synthetic */ jhk b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jhg(jhk jhkVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = jhkVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((jhg) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            jhk jhkVar = this.b;
            this.a = 1;
            Object h = jhkVar.a.n.h(this);
            if (h != ffhh.a) {
                h = ffcu.a;
            }
            if (h == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new jhg(this.b, ffguVar);
    }
}
