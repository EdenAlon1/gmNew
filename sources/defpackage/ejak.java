package defpackage;

import android.content.Intent;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejak implements ekoq, ekoh {
    private static final enru a = enru.c("com/google/apps/tiktok/account/data/device/DeviceAccountsChangedReceiver");
    private final ejaj b;

    public ejak(ejaj ejajVar) {
        this.b = ejajVar;
    }

    @Override // defpackage.ekoq
    public final ListenableFuture a(Intent intent) {
        ((enrr) ((enrr) a.h()).h("com/google/apps/tiktok/account/data/device/DeviceAccountsChangedReceiver", "onReceive", 40, "DeviceAccountsChangedReceiver.java")).q("DeviceAccountsChangedReceiver#onReceive");
        if (this.b.c()) {
            return erqt.i(null);
        }
        this.b.b();
        return this.b.a();
    }

    @Override // defpackage.ekoh
    public final long b() {
        return -1L;
    }

    @Override // defpackage.ekoh
    public final /* synthetic */ long c() {
        return -1L;
    }
}
