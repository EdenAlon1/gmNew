package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqpp implements ffji {
    final /* synthetic */ ffji a;

    public dqpp(ffji ffjiVar) {
        this.a = ffjiVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        dqre dqreVar;
        dqrj dqrjVar = (dqrj) obj;
        if (dqrjVar == null || (dqreVar = (dqre) dqrjVar.toBuilder()) == null) {
            return null;
        }
        this.a.invoke(dqreVar);
        return (dqrj) dqreVar.build();
    }
}
