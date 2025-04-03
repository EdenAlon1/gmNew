package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cews implements cetu {
    int a = 0;

    @Override // defpackage.cetu
    public final cett a() {
        this.a += 3;
        return new cett() { // from class: cewr
            @Override // defpackage.cett, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                cews cewsVar = cews.this;
                cewsVar.a -= 3;
            }
        };
    }

    @Override // defpackage.cetu
    public final void b(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = this.a; i > 0; i--) {
            sb.append(' ');
        }
        ensk h = cewv.a.h();
        h.Y(ente.a, "pwq_state");
        ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/datamodel/workqueue/WorkQueueDebugger$1", "emitLine", 238, "WorkQueueDebugger.java")).D("%s%s", sb, str);
    }

    @Override // defpackage.cetu
    public final void c() {
    }

    @Override // defpackage.cetu
    public final /* synthetic */ void d(String str) {
    }
}
