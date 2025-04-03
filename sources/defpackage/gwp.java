package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gwp extends ffkk implements ffji {
    final /* synthetic */ iqk a;
    final /* synthetic */ float b;
    final /* synthetic */ gxa c;
    final /* synthetic */ gxo d;
    final /* synthetic */ int e;
    final /* synthetic */ boolean f;
    final /* synthetic */ gwb g;
    final /* synthetic */ idh h;
    final /* synthetic */ boolean i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gwp(iqk iqkVar, float f, gxa gxaVar, gxo gxoVar, int i, boolean z, gwb gwbVar, idh idhVar, boolean z2) {
        super(1);
        this.a = iqkVar;
        this.b = f;
        this.c = gxaVar;
        this.d = gxoVar;
        this.e = i;
        this.f = z;
        this.g = gwbVar;
        this.h = idhVar;
        this.i = z2;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ((iqj) obj).g(this.a, 0, 0, this.b, new gwo(this.c, this.d, this.e, this.f, this.g, this.h, this.i));
        return ffcu.a;
    }
}
