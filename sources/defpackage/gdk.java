package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gdk extends ffkk implements ffji {
    final /* synthetic */ float a;
    final /* synthetic */ long b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gdk(float f, long j) {
        super(1);
        this.a = f;
        this.b = j;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ifr ifrVar = (ifr) obj;
        float em = ifrVar.em(this.a);
        ifq.m(ifrVar, this.b, ial.a(0.0f, ifrVar.em(this.a) / 2.0f), ial.a(iar.c(ifrVar.b()), ifrVar.em(this.a) / 2.0f), em, 0, 496);
        return ffcu.a;
    }
}
