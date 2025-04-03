package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ouj extends ffhv implements ffjm {
    int a;
    final /* synthetic */ our b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ouj(our ourVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ourVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ouj) c((ovc) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        ovc ovcVar = (ovc) this.c;
        our ourVar = this.b;
        this.a = 1;
        Object a = ourVar.a(ovcVar, this);
        return a == ffhhVar ? ffhhVar : a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ouj oujVar = new ouj(this.b, ffguVar);
        oujVar.c = obj;
        return oujVar;
    }
}
