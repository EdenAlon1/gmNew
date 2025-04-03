package defpackage;

import android.app.Application;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eknr {
    public final eflf a;
    private final efle b;
    private final emyl c = emys.a(new emyl() { // from class: eknp
        @Override // defpackage.emyl
        public final Object get() {
            efkw c = eknr.this.a.c("/client_streamz/tiktok/sync/synclet/count", new efla("app_package", String.class), new efla("synclet_key_name", String.class), new efla("status", String.class));
            c.c();
            return c;
        }
    });
    private final emyl d = emys.a(new emyl() { // from class: eknq
        @Override // defpackage.emyl
        public final Object get() {
            efky d = eknr.this.a.d("/client_streamz/tiktok/sync/synclet/duration", new efla("app_package", String.class), new efla("synclet_key_name", String.class), new efla("status", String.class));
            d.c();
            return d;
        }
    });

    public eknr(ScheduledExecutorService scheduledExecutorService, efkv efkvVar, Application application) {
        eflf e = eflf.e("tiktok");
        this.a = e;
        efle efleVar = e.c;
        if (efleVar == null) {
            this.b = efli.c(efkvVar, scheduledExecutorService, e, application);
        } else {
            this.b = efleVar;
            ((efli) efleVar).f = efkvVar;
        }
    }

    public final void a(String str, String str2, String str3) {
        ((efkw) this.c.get()).a(str, str2, str3);
    }

    public final void b(double d, String str, String str2, String str3) {
        ((efky) this.d.get()).b(d, str, str2, str3);
    }
}
