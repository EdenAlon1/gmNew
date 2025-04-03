package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alel extends ffhv implements ffjm {
    int a;
    final /* synthetic */ aleo b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alel(ffgu ffguVar, aleo aleoVar) {
        super(2, ffguVar);
        this.b = aleoVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((alel) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            ffci.b(obj);
        } else {
            ffci.b(obj);
            dhre b = this.b.b.b();
            this.a = 1;
            obj = fgju.a(b, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        return Boolean.valueOf(((dhvh) obj).a());
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        alel alelVar = new alel(ffguVar, this.b);
        alelVar.c = obj;
        return alelVar;
    }
}
