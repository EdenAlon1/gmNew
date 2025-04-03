package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gsg extends ffkk implements ffji {
    final /* synthetic */ hho a;
    final /* synthetic */ hho b;
    final /* synthetic */ hho c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gsg(hho hhoVar, hho hhoVar2, hho hhoVar3) {
        super(1);
        this.a = hhoVar;
        this.b = hhoVar2;
        this.c = hhoVar3;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ioc iocVar = (ioc) obj;
        ioc o = iocVar.o();
        long b = o != null ? kag.b(o.g()) : 0L;
        hho hhoVar = this.a;
        float f = guj.a;
        hhoVar.b(new kaa(b));
        this.b.b(iod.c(iocVar));
        this.c.b(new iak(guj.e(this.b).a()));
        return ffcu.a;
    }
}
