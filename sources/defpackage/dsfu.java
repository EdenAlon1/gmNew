package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dsfu extends ffhv implements ffjn {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    final /* synthetic */ dsfv c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsfu(dsfv dsfvVar, ffgu ffguVar) {
        super(3, ffguVar);
        this.c = dsfvVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        dsfu dsfuVar = new dsfu(this.c, (ffgu) obj3);
        dsfuVar.a = (dtbv) obj;
        dsfuVar.b = (dszr) obj2;
        return dsfuVar.b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        Object obj2 = this.a;
        Object obj3 = this.b;
        return (obj3 == null || !(obj2 instanceof dtbt)) ? (this.c.e.o && (obj2 instanceof dtbn)) ? dtbi.a : obj2 : dtbt.a((dtbt) obj2, null, (dszr) obj3, 13);
    }
}
