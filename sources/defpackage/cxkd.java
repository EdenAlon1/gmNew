package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cxkd extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cxkk b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxkd(cxkk cxkkVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cxkkVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cxkd) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        cxkk cxkkVar = this.b;
        this.a = 1;
        Object d = cxkkVar.d(this);
        return d == ffhhVar ? ffhhVar : d;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cxkd(this.b, ffguVar);
    }
}
