package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahzl extends ffhv implements ffjn {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    final /* synthetic */ ahzo c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahzl(ahzo ahzoVar, ffgu ffguVar) {
        super(3, ffguVar);
        this.c = ahzoVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ahzl ahzlVar = new ahzl(this.c, (ffgu) obj3);
        ahzlVar.a = (ojf) obj;
        ahzlVar.b = (ahut) obj2;
        return ahzlVar.b(ffcu.a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ahut, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return ojz.a((ojf) this.a, new ahzk(this.c, this.b, null));
    }
}
