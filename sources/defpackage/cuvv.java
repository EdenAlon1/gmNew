package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuvv extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cuwf b;
    final /* synthetic */ boolean c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cuvv(ffgu ffguVar, cuwf cuwfVar, boolean z) {
        super(2, ffguVar);
        this.b = cuwfVar;
        this.c = z;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cuvv) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        cuwf cuwfVar = this.b;
        boolean z = this.c;
        this.a = 1;
        Object g = cuwfVar.g(z, this);
        return g == ffhhVar ? ffhhVar : g;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cuvv cuvvVar = new cuvv(ffguVar, this.b, this.c);
        cuvvVar.d = obj;
        return cuvvVar;
    }
}
