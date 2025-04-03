package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ogb extends ffhv implements ffjn {
    final /* synthetic */ ogd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ogb(ogd ogdVar, ffgu ffguVar) {
        super(3, ffguVar);
        this.a = ogdVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        return new ogb(this.a, (ffgu) obj3).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return ffcu.a;
    }
}
