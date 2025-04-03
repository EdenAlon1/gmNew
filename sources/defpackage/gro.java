package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gro extends ffkk implements ffji {
    final /* synthetic */ iqk a;
    final /* synthetic */ grr b;
    final /* synthetic */ float c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gro(iqk iqkVar, grr grrVar, float f) {
        super(1);
        this.a = iqkVar;
        this.b = grrVar;
        this.c = f;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        iqj iqjVar = (iqj) obj;
        cxj cxjVar = this.b.d;
        iqj.m(iqjVar, this.a, (int) (cxjVar != null ? ((Number) cxjVar.d()).floatValue() : this.c), 0);
        return ffcu.a;
    }
}
