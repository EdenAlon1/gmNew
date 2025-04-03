package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fcd extends ffkk implements ffji {
    final /* synthetic */ fcu a;
    final /* synthetic */ boolean b;
    final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fcd(fcu fcuVar, boolean z, boolean z2) {
        super(1);
        this.a = fcuVar;
        this.b = z;
        this.c = z2;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        jkv jkvVar = (jkv) obj;
        long a = this.a.a();
        jkvVar.e(fem.a, new fel(this.b ? euf.b : euf.c, a, true != this.c ? 3 : 1, (9223372034707292159L & a) != 9205357640488583168L));
        return ffcu.a;
    }
}
