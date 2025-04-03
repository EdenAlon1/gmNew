package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hhb extends ffkk implements ffji {
    final /* synthetic */ hhc a;
    final /* synthetic */ ffrf b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hhb(hhc hhcVar, ffrf ffrfVar) {
        super(1);
        this.a = hhcVar;
        this.b = ffrfVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        hhc hhcVar = this.a;
        Object obj2 = hhcVar.a;
        ffrf ffrfVar = this.b;
        synchronized (obj2) {
            hhcVar.b.remove(ffrfVar);
        }
        return ffcu.a;
    }
}
