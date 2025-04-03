package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bcma implements ffix {
    final /* synthetic */ bckh a;
    final /* synthetic */ bcmc b;

    public bcma(bckh bckhVar, bcmc bcmcVar) {
        this.a = bckhVar;
        this.b = bcmcVar;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        bbii bbiiVar;
        if (this.a.c) {
            bbii bbiiVar2 = this.b.c;
            dtve b = bbiiVar2.b();
            dtve a = bbiiVar2.a();
            try {
                bbiiVar2.d(b, a, "backupDb");
                bbih bbihVar = new bbih(b, a);
                try {
                    try {
                        this.b.b(this.a);
                        ffit.a(bbihVar, null);
                    } catch (Exception e) {
                        throw new bbhw(e);
                    }
                } finally {
                }
            } catch (Exception e2) {
                throw new bbig(e2);
            }
        } else {
            try {
                bbii bbiiVar3 = this.b.c;
                bbiiVar3.d(bbiiVar3.b(), bbiiVar3.a(), "backupDb");
                this.b.b(this.a);
                bbiiVar = this.b.c;
            } catch (Throwable th) {
                try {
                    ensk j = bcmc.a.j();
                    j.Y(ente.a, "BugleBackup");
                    ((enrr) ((enrr) j).g(th).h("com/google/android/apps/messaging/shared/datamodel/backup/restore/impl/DatabaseRestorerImpl$restoreFromBackupDatabase$2$1$1$1", "invoke", 83, "DatabaseRestorerImpl.kt")).q("Restore from backup failed!");
                    bbiiVar = this.b.c;
                } catch (Throwable th2) {
                    this.b.c.e();
                    throw th2;
                }
            }
            bbiiVar.e();
        }
        return ffcu.a;
    }
}
