package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class her extends ffkk implements ffji {
    final /* synthetic */ hes a;
    final /* synthetic */ heq b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public her(hes hesVar, heq heqVar) {
        super(1);
        this.a = hesVar;
        this.b = heqVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        hes hesVar = this.a;
        Object obj2 = hesVar.a;
        heq heqVar = this.b;
        synchronized (obj2) {
            hesVar.b.remove(heqVar);
            if (hesVar.b.isEmpty()) {
                hesVar.d.set(0);
            }
        }
        return ffcu.a;
    }
}
