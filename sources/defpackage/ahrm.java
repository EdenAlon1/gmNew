package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahrm extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ahrn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahrm(ahrn ahrnVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ahrnVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ahrm) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        ahrq ahrqVar = (ahrq) this.b.b.b();
        this.a = 1;
        Object b = ahrqVar.b(this);
        return b == ffhhVar ? ffhhVar : b;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ahrm(this.b, ffguVar);
    }
}
