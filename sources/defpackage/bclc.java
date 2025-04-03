package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bclc implements bcjz {
    public static final bclc a = new bclc();
    private static final enru b = enru.c("com/google/android/apps/messaging/shared/datamodel/backup/restore/conversations/CombinedConversationsWriterWorkflowSteps");

    private bclc() {
    }

    @Override // defpackage.bcjz
    public final int a() {
        return bclp.a.a();
    }

    @Override // defpackage.bcjz
    public final void b(dtyx dtyxVar) {
        bclp.a.b(null);
        bclm.a.b(null);
        bclh.a.b(null);
        bclk.a.b(null);
    }

    @Override // defpackage.bcjz
    public final void c() {
        int b2;
        bclp.a.c();
        b2 = bcjs.b(bclo.a, 5);
        ensk e = b.e();
        e.Y(ente.a, "BugleBackup");
        ((enrr) e.h("com/google/android/apps/messaging/shared/datamodel/backup/restore/conversations/CombinedConversationsWriterWorkflowSteps", "findAndMarkDuplicates", 87, "BatchedConversationsRestoreTableWriter.kt")).r("[conversations] found %d duplicate non-RCS-Group conversations by participants.", b2);
        bclm.a.c();
        bclh.a.c();
        bclk.a.c();
    }

    @Override // defpackage.bcjz
    public final void d() {
        bclp.a.d();
        bclm.a.d();
        bclh.a.d();
        bclk.a.d();
    }

    @Override // defpackage.bcjz
    public final void f() {
        bclp.a.f();
        bclm.a.f();
        bclh.a.f();
        bclk.a.f();
    }

    @Override // defpackage.bcjz
    public final void g(int i, dtzj dtzjVar) {
        bclp.a.g(i, null);
        bbkb a2 = bbke.a();
        bbjk bbjkVar = bbke.c;
        bclm.a.g(i, bckf.a(a2, bbjkVar.b, bbjkVar.a, bckf.a, bckf.f));
        bbkb a3 = bbke.a();
        bbjk bbjkVar2 = bbke.c;
        bclh.a.g(i, bckf.a(a3, bbjkVar2.b, bbjkVar2.a, bckf.a, bckf.e));
        String[] strArr = bbln.a;
        bblk bblkVar = new bblk(bbln.a);
        bbkw bbkwVar = bbln.c;
        bclk.a.g(i, bckf.a(bblkVar, bbkwVar.b, bbkwVar.a, bckf.a, bckf.h));
    }

    @Override // defpackage.bcjz
    public final /* synthetic */ void e() {
    }
}
