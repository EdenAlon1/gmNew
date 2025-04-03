package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmdk implements ffxy {
    final /* synthetic */ dmck a;
    final /* synthetic */ hho b;

    public dmdk(dmck dmckVar, hho hhoVar) {
        this.a = dmckVar;
        this.b = hhoVar;
    }

    @Override // defpackage.ffxy
    public final /* bridge */ /* synthetic */ Object fQ(Object obj, ffgu ffguVar) {
        gpj gpjVar = (gpj) obj;
        if (gpjVar == gpj.a || gpjVar == gpj.b) {
            ffix ffixVar = this.a.f;
            if (ffixVar != null) {
                ffixVar.invoke();
            }
            this.b.b(true);
        }
        return ffcu.a;
    }
}
