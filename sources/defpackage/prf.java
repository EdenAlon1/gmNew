package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class prf extends osz {
    @Override // defpackage.osz
    public final void a(oxi oxiVar) {
        oxiVar.d();
        try {
            oxiVar.g("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < " + (System.currentTimeMillis() - pso.a) + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
            oxiVar.h();
        } finally {
            oxiVar.f();
        }
    }
}
