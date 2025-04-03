package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvho extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dvhp b;
    final /* synthetic */ dvdp c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dvho(dvhp dvhpVar, dvdp dvdpVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dvhpVar;
        this.c = dvdpVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dvho) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        dvhp dvhpVar = this.b;
        dvdp dvdpVar = this.c;
        this.a = 1;
        Object a = ffra.a(((fggf) ffsl.c()).a, new dvhw((dvhx) dvhpVar.a, dvdpVar, null), this);
        return a == ffhhVar ? ffhhVar : a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dvho(this.b, this.c, ffguVar);
    }
}
