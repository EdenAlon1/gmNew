package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drtd extends ffhr {
    /* synthetic */ Object a;
    final /* synthetic */ drte b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public drtd(drte drteVar, ffgu ffguVar) {
        super(ffguVar);
        this.b = drteVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, this);
    }
}
