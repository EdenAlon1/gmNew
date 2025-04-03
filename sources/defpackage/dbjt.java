package defpackage;

import android.database.Cursor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbjt extends ffhv implements ffjm {
    final /* synthetic */ dbjv a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbjt(ffgu ffguVar, dbjv dbjvVar) {
        super(2, ffguVar);
        this.a = dbjvVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dbjt) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        final cavj cavjVar = this.a.d;
        if (((Boolean) cavjVar.d.get()).booleanValue()) {
            throw new RuntimeException("Cannot do maintenance while holding a transaction");
        }
        ensk j = cavj.a.j();
        j.Y(ente.a, "BugleDatabase");
        ((enrr) j.h("com/google/android/apps/messaging/shared/datamodel/layer/DatabaseMaintenancePlugin", "runWalCheckpoint", 128, "DatabaseMaintenancePlugin.kt")).q("Blocking new DB operations for maintenance");
        cavjVar.g(new ffix() { // from class: cavc
            @Override // defpackage.ffix
            public final Object invoke() {
                final cavj cavjVar2 = cavj.this;
                long f = cavjVar2.f(new ffix() { // from class: cava
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        ensk h = cavj.a.h();
                        h.Y(ente.a, "BugleDatabase");
                        ((enrr) h.h("com/google/android/apps/messaging/shared/datamodel/layer/DatabaseMaintenancePlugin", "checkpointWal$lambda$5", 150, "DatabaseMaintenancePlugin.kt")).q("Checkpointing the Write Ahead Log");
                        Cursor g = ((dtve) cavj.this.b.b()).g("pragma wal_checkpoint(FULL)", null);
                        g.moveToFirst();
                        if (g.getInt(0) == 1) {
                            ensk i = cavj.a.i();
                            i.Y(ente.a, "BugleDatabase");
                            ((enrr) i.h("com/google/android/apps/messaging/shared/datamodel/layer/DatabaseMaintenancePlugin", "checkpointWal$lambda$5", 157, "DatabaseMaintenancePlugin.kt")).q("DB was busy during checkpoint.");
                        }
                        return ffcu.a;
                    }
                });
                ensk h = cavj.a.h();
                h.Y(ente.a, "BugleDatabase");
                ((enrr) h.h("com/google/android/apps/messaging/shared/datamodel/layer/DatabaseMaintenancePlugin", "checkpointWal", 160, "DatabaseMaintenancePlugin.kt")).s("Checkpoint completed in %dms.", f);
                return ffcu.a;
            }
        });
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        dbjt dbjtVar = new dbjt(ffguVar, this.a);
        dbjtVar.b = obj;
        return dbjtVar;
    }
}
