package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cjfn extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cjfw b;
    final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjfn(cjfw cjfwVar, boolean z, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cjfwVar;
        this.c = z;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cjfn) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        cjfw cjfwVar = this.b;
        cjfm cjfmVar = new cjfm(this.c, null);
        this.a = 1;
        Object a = cjfwVar.d.a(cjfmVar, this);
        return a == ffhhVar ? ffhhVar : a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cjfn(this.b, this.c, ffguVar);
    }
}
