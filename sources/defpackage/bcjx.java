package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bcjx {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/datamodel/backup/restore/BatchedRestoreTableWriter");
    public final String b;
    public final ffbr c;
    public final bcjz d;

    public bcjx(String str, ffbr ffbrVar, bcjz bcjzVar) {
        this.b = str;
        this.c = ffbrVar;
        this.d = bcjzVar;
    }

    public final void a(String str, long j) {
        ensk g = a.g();
        g.Y(ente.a, "BugleBackup");
        ((enrr) g.h("com/google/android/apps/messaging/shared/datamodel/backup/restore/BatchedRestoreTableWriter", "logDuration-HG0u8IE", 92, "BatchedRestoreTableWriter.kt")).J("[%s] [%s] duration [%s]ms", this.b, str, Long.valueOf(ffpw.g(j)));
    }

    public final void b() {
        ((dtuu) this.c.b()).d("BatchedRestoreTableWriter.preRestore", new Runnable() { // from class: bcjv
            @Override // java.lang.Runnable
            public final void run() {
                bcjx.this.d.b(null);
            }
        });
    }

    public final void c(final int i) {
        int a2 = this.d.a();
        final int i2 = 1;
        int i3 = (a2 / i) + (a2 % i > 0 ? 1 : 0);
        if (i3 <= 0) {
            return;
        }
        while (true) {
            enru enruVar = a;
            ensk h = enruVar.h();
            h.Y(ente.a, "BugleBackup");
            ((enrr) h.h("com/google/android/apps/messaging/shared/datamodel/backup/restore/BatchedRestoreTableWriter", "restoreTable", 58, "BatchedRestoreTableWriter.kt")).J("[%s] Processing batch [%s]/[%s]", this.b, Integer.valueOf(i2), Integer.valueOf(i3));
            a(a.f(i2, "batch ", " txn time"), bbhj.c("BatchedRestoreTableWriter::restoreTable#txnTime", new ffix() { // from class: bcju
                @Override // defpackage.ffix
                public final Object invoke() {
                    final bcjx bcjxVar = bcjx.this;
                    dtuu dtuuVar = (dtuu) bcjxVar.c.b();
                    final int i4 = i2;
                    final int i5 = i;
                    dtuuVar.d("BatchedRestoreTableWriter.restoreTable", new Runnable() { // from class: bcjw
                        @Override // java.lang.Runnable
                        public final void run() {
                            final bcjx bcjxVar2 = bcjx.this;
                            final int i6 = i4;
                            final int i7 = i5;
                            bcjxVar2.a(a.f(i6, "batch ", " inner time"), bbhj.c("BatchedRestoreTableWriter::restoreTable#innerTime", new ffix() { // from class: bcjt
                                @Override // defpackage.ffix
                                public final Object invoke() {
                                    int i8 = ffqe.a;
                                    bcjx bcjxVar3 = bcjx.this;
                                    bcjz bcjzVar = bcjxVar3.d;
                                    long b = ffqe.b();
                                    bcjzVar.g(i7, null);
                                    bcjxVar3.a("updateNextBatchStatusToPreparing", ffqf.b(b));
                                    ensk h2 = bcjx.a.h();
                                    h2.Y(ente.a, "BugleBackup");
                                    ((enrr) h2.h("com/google/android/apps/messaging/shared/datamodel/backup/restore/BatchedRestoreTableWriter", "restoreTable$lambda$12$lambda$11$lambda$9", 70, "BatchedRestoreTableWriter.kt")).t("[%s] Checking for duplicates", bcjxVar3.b);
                                    bcjz bcjzVar2 = bcjxVar3.d;
                                    long b2 = ffqe.b();
                                    bcjzVar2.c();
                                    bcjxVar3.a("findAndMarkDuplicates", ffqf.b(b2));
                                    ensk h3 = bcjx.a.h();
                                    h3.Y(ente.a, "BugleBackup");
                                    ((enrr) h3.h("com/google/android/apps/messaging/shared/datamodel/backup/restore/BatchedRestoreTableWriter", "restoreTable$lambda$12$lambda$11$lambda$9", 74, "BatchedRestoreTableWriter.kt")).t("[%s] Inserting to Bugle", bcjxVar3.b);
                                    bcjz bcjzVar3 = bcjxVar3.d;
                                    long b3 = ffqe.b();
                                    bcjzVar3.d();
                                    bcjxVar3.a("performBugleInsert", ffqf.b(b3));
                                    ensk h4 = bcjx.a.h();
                                    h4.Y(ente.a, "BugleBackup");
                                    ((enrr) h4.h("com/google/android/apps/messaging/shared/datamodel/backup/restore/BatchedRestoreTableWriter", "restoreTable$lambda$12$lambda$11$lambda$9", 78, "BatchedRestoreTableWriter.kt")).B("[%s] Finalizing batch [%s]", bcjxVar3.b, i6);
                                    bcjz bcjzVar4 = bcjxVar3.d;
                                    long b4 = ffqe.b();
                                    bcjzVar4.f();
                                    bcjxVar3.a("updateBatchStatusToWritten", ffqf.b(b4));
                                    return ffcu.a;
                                }
                            }));
                        }
                    });
                    return ffcu.a;
                }
            }));
            ensk h2 = enruVar.h();
            h2.Y(ente.a, "BugleBackup");
            ((enrr) h2.h("com/google/android/apps/messaging/shared/datamodel/backup/restore/BatchedRestoreTableWriter", "restoreTable", 86, "BatchedRestoreTableWriter.kt")).B("[%s] Executing post batch work [%s]", this.b, i2);
            int i4 = ffqe.a;
            bcjz bcjzVar = this.d;
            long b = ffqe.b();
            bcjzVar.e();
            a("postBatchWork", ffqf.b(b));
            if (i2 == i3) {
                return;
            } else {
                i2++;
            }
        }
    }
}
