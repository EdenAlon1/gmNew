package defpackage;

import java.io.File;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bclz extends ffhv implements ffjm {
    int a;
    final /* synthetic */ bcmc b;
    final /* synthetic */ File c;
    final /* synthetic */ bckh d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bclz(ffgu ffguVar, bcmc bcmcVar, File file, bckh bckhVar) {
        super(2, ffguVar);
        this.b = bcmcVar;
        this.c = file;
        this.d = bckhVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bclz) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        fgjb fgjbVar;
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            fgjbVar = (fgjb) this.e;
            ffci.b(obj);
        } else {
            ffci.b(obj);
            fgjb fgjbVar2 = this.b.h.a() ? this.b.g.a : bcmc.b;
            this.e = fgjbVar2;
            this.a = 1;
            if (fgjbVar2.a(null, this) == ffhhVar) {
                return ffhhVar;
            }
            fgjbVar = fgjbVar2;
        }
        try {
            long c = bbhj.c("DatabaseRestorerImpl::runWithSpecifiedBackupDatabase", new bcmb(this.b, this.c, this.d));
            ensk h = bcmc.a.h();
            h.Y(ente.a, "BugleBackup");
            ((enrr) h.h("com/google/android/apps/messaging/shared/datamodel/backup/restore/impl/DatabaseRestorerImpl$restoreFromBackupDatabase$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 93, "DatabaseRestorerImpl.kt")).s("Finished restoreFromBackupDatabase, elapsed time [%s]ms", ffpw.g(c));
            return new ffpw(c);
        } finally {
            fgjbVar.b(null);
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        bclz bclzVar = new bclz(ffguVar, this.b, this.c, this.d);
        bclzVar.e = obj;
        return bclzVar;
    }
}
