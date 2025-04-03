package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbjr extends ffhv implements ffjm {
    final /* synthetic */ dbjv a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbjr(ffgu ffguVar, dbjv dbjvVar) {
        super(2, ffguVar);
        this.a = dbjvVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dbjr) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
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
        ((enrr) j.h("com/google/android/apps/messaging/shared/datamodel/layer/DatabaseMaintenancePlugin", "runAnalyze", 144, "DatabaseMaintenancePlugin.kt")).q("Blocking new DB operations for maintenance");
        cavjVar.g(new ffix() { // from class: cavb
            @Override // defpackage.ffix
            public final Object invoke() {
                ensk h = cavj.a.h();
                h.Y(ente.a, "BugleDatabase");
                ((enrr) h.h("com/google/android/apps/messaging/shared/datamodel/layer/DatabaseMaintenancePlugin", "analyze", 164, "DatabaseMaintenancePlugin.kt")).q("Analyzing the database");
                final cavj cavjVar2 = cavj.this;
                long f = cavjVar2.f(new ffix() { // from class: cavf
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        ((dtve) cavj.this.b.b()).y("ANALYZE");
                        return ffcu.a;
                    }
                });
                ensk h2 = cavj.a.h();
                h2.Y(ente.a, "BugleDatabase");
                ((enrr) h2.h("com/google/android/apps/messaging/shared/datamodel/layer/DatabaseMaintenancePlugin", "analyze", 166, "DatabaseMaintenancePlugin.kt")).s("sqlite_stat1 updated in %dms.", f);
                ((dtve) cavjVar2.b.b()).y("DROP TABLE IF EXISTS foo_for_testing");
                ((dtve) cavjVar2.b.b()).y("CREATE TABLE foo_for_testing (foo, bar)");
                ((dtve) cavjVar2.b.b()).y("ANALYZE foo_for_testing");
                ((dtve) cavjVar2.b.b()).y("DROP TABLE IF EXISTS foo_for_testing");
                return ffcu.a;
            }
        });
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        dbjr dbjrVar = new dbjr(ffguVar, this.a);
        dbjrVar.b = obj;
        return dbjrVar;
    }
}
