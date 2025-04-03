package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffwg extends ffhr {
    /* synthetic */ Object a;
    final /* synthetic */ ffwi b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ffwg(ffwi ffwiVar, ffgu ffguVar) {
        super(ffguVar);
        this.b = ffwiVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object k = ffwi.k(this.b, this);
        return k == ffhh.a ? k : new ffws(k);
    }
}
