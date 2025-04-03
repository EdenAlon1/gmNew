package defpackage;

import android.content.BroadcastReceiver;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eail {
    private static final entd a = entd.c("GnpSdk");
    private final BroadcastReceiver.PendingResult b;
    private final boolean c;
    private final int d;
    private boolean e;

    public eail(BroadcastReceiver.PendingResult pendingResult, boolean z, int i) {
        this.b = pendingResult;
        this.c = z;
        this.d = i;
    }

    public final synchronized void a() {
        if (this.e) {
            ((ensz) a.o().h("com/google/android/libraries/notifications/platform/executor/BroadcastAsyncOperation", "finish", 29, "BroadcastAsyncOperation.java")).r("Already finished BroadcastAsyncOperation [%d]", this.d);
            return;
        }
        if (this.c) {
            this.b.setResultCode(-1);
        }
        this.b.finish();
        this.e = true;
        ((ensz) a.o().h("com/google/android/libraries/notifications/platform/executor/BroadcastAsyncOperation", "finish", 41, "BroadcastAsyncOperation.java")).r("Finished BroadcastAsyncOperation [%d]", this.d);
    }

    public final String toString() {
        return "BroadcastAsyncOperation{executionId=" + this.d + "}";
    }
}
