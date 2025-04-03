package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cjew extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cjfw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjew(cjfw cjfwVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cjfwVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cjew) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        if (!((Boolean) ((cfup) ctjd.ak.get()).e()).booleanValue()) {
            return true;
        }
        cjfw cjfwVar = this.b;
        this.a = 1;
        Object f = cjfwVar.f(this);
        return f == ffhhVar ? ffhhVar : f;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cjew(this.b, ffguVar);
    }
}
