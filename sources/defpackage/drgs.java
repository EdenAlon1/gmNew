package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drgs extends ffhv implements ffjm {
    int a;
    final /* synthetic */ drgw b;
    final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public drgs(drgw drgwVar, String str, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = drgwVar;
        this.c = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((drgs) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        drgw drgwVar = this.b;
        String str = this.c;
        this.a = 1;
        Object a = drgwVar.l.a.a(drgwVar.c, str, this);
        return a == ffhhVar ? ffhhVar : a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new drgs(this.b, this.c, ffguVar);
    }
}
