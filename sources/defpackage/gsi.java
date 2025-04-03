package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gsi extends ffkk implements ffix {
    final /* synthetic */ ffsk a;
    final /* synthetic */ ftb b;
    final /* synthetic */ float c;
    final /* synthetic */ boolean d;
    final /* synthetic */ hho e;
    final /* synthetic */ hho f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gsi(ffsk ffskVar, ftb ftbVar, float f, boolean z, hho hhoVar, hho hhoVar2) {
        super(0);
        this.a = ffskVar;
        this.b = ftbVar;
        this.c = f;
        this.d = z;
        this.e = hhoVar;
        this.f = hhoVar2;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        ffqy.d(this.a, null, null, new gsh(this.b, this.c, this.d, this.e, this.f, null), 3);
        return true;
    }
}
