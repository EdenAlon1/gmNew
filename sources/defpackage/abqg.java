package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abqg extends ffhv implements ffjp {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;

    public abqg(ffgu ffguVar) {
        super(5, ffguVar);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return new ffcl(this.a, this.b, this.c);
    }

    @Override // defpackage.ffjp
    public final /* bridge */ /* synthetic */ Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        abqg abqgVar = new abqg((ffgu) obj5);
        abqgVar.a = (alxj) obj2;
        abqgVar.b = (engw) obj3;
        abqgVar.c = (alxg) obj4;
        return abqgVar.b(ffcu.a);
    }
}
