package defpackage;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class edxa {
    public final eflf a;
    private final efle c;
    private final emyl d = emys.a(new emyl() { // from class: edww
        @Override // defpackage.emyl
        public final Object get() {
            efkw c = edxa.this.a.c("/client_streamz/tq_cobalt/worker/log_writer/error_count", new efla("customer_id", Integer.class), new efla("project_id", Integer.class), new efla("error_type", String.class));
            c.c();
            return c;
        }
    });
    private final emyl e = emys.a(new emyl() { // from class: edwx
        @Override // defpackage.emyl
        public final Object get() {
            efkw c = edxa.this.a.c("/client_streamz/tq_cobalt/worker/log_uploader/error_count", new efla("customer_id", Integer.class), new efla("project_id", Integer.class), new efla("error_type", String.class));
            c.c();
            return c;
        }
    });
    public final emyl b = emys.a(new emyl() { // from class: edwy
        @Override // defpackage.emyl
        public final Object get() {
            efkw c = edxa.this.a.c("/client_streamz/tq_cobalt/worker/log_uploader/start", new efla("customer_id", Integer.class), new efla("project_id", Integer.class));
            c.c();
            return c;
        }
    });
    private final emyl f = emys.a(new emyl() { // from class: edwz
        @Override // defpackage.emyl
        public final Object get() {
            efkw c = edxa.this.a.c("/client_streamz/tq_cobalt/worker/log_uploader/finish", new efla("customer_id", Integer.class), new efla("project_id", Integer.class), new efla("result", String.class));
            c.c();
            return c;
        }
    });

    public edxa(ScheduledExecutorService scheduledExecutorService, efkv efkvVar) {
        eflf e = eflf.e("tq_cobalt");
        this.a = e;
        efle efleVar = e.c;
        if (efleVar == null) {
            this.c = efli.c(efkvVar, scheduledExecutorService, e, null);
        } else {
            this.c = efleVar;
            ((efli) efleVar).f = efkvVar;
        }
    }

    public final void a(int i, int i2, String str) {
        ((efkw) this.e.get()).a(Integer.valueOf(i), Integer.valueOf(i2), str);
    }

    public final void b(int i, int i2, String str) {
        ((efkw) this.f.get()).a(Integer.valueOf(i), Integer.valueOf(i2), str);
    }

    public final void c(int i, int i2, String str) {
        ((efkw) this.d.get()).a(Integer.valueOf(i), Integer.valueOf(i2), str);
    }
}
