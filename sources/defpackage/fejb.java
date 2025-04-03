package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fejb implements fetw {
    public static final Logger a = Logger.getLogger(fejb.class.getName());
    public final ScheduledExecutorService b;
    public final feds c;
    public fedr d;
    public feml e;

    public fejb(ScheduledExecutorService scheduledExecutorService, feds fedsVar) {
        this.b = scheduledExecutorService;
        this.c = fedsVar;
    }

    @Override // defpackage.fetw
    public final void a() {
        this.c.d();
        this.c.execute(new Runnable() { // from class: feja
            @Override // java.lang.Runnable
            public final void run() {
                fejb fejbVar = fejb.this;
                fedr fedrVar = fejbVar.d;
                if (fedrVar != null && fedrVar.b()) {
                    fedrVar.a();
                }
                fejbVar.e = null;
            }
        });
    }
}
