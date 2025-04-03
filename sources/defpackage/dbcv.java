package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dbcv extends ffhr {
    long a;
    Object b;
    int c;
    int d;
    /* synthetic */ Object e;
    final /* synthetic */ dbcd f;
    int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbcv(dbcd dbcdVar, ffgu ffguVar) {
        super(ffguVar);
        this.f = dbcdVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.a(0, 0L, null, this);
    }
}
