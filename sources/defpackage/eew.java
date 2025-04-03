package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eew extends ffhv implements ffjm {
    final /* synthetic */ eey a;
    final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eew(eey eeyVar, int i, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = eeyVar;
        this.b = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((eew) c((drd) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        this.a.o(this.b, 0);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new eew(this.a, this.b, ffguVar);
    }
}
