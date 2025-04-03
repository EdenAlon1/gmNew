package defpackage;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejqy {
    private final emxc a;

    public ejqy(emxc emxcVar) {
        this.a = emxcVar;
    }

    public final ffhd a(ScheduledExecutorService scheduledExecutorService) {
        ffhd plus;
        Boolean bool = true;
        bool.getClass();
        if (((Boolean) this.a.e(false)).booleanValue()) {
            plus = new fftt(new ejrq(scheduledExecutorService)).plus(ejrk.a);
        } else {
            ejrh ejrhVar = new ejrh(scheduledExecutorService);
            plus = new fftt(ejrhVar).plus(ejrhVar);
        }
        return plus.plus(elee.b(null, 3));
    }
}
