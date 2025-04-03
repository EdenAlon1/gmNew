package defpackage;

import android.os.IBinder;
import com.google.android.ims.events.EventHubProxy;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dipw implements IBinder.DeathRecipient {
    final /* synthetic */ EventHubProxy a;

    public dipw(EventHubProxy eventHubProxy) {
        this.a = eventHubProxy;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        String str;
        str = this.a.b;
        dkty.c("Process has died: %s", str);
        this.a.j = null;
        this.a.c = false;
    }
}
