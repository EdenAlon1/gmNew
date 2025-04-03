package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.IBinder;
import com.google.android.libraries.subscriptions.restore.IG1Restore;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class daum implements ServiceConnection {
    final /* synthetic */ Activity a;

    public daum(Activity activity) {
        this.a = activity;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            ((IG1Restore.Stub) iBinder).requestRestore(Uri.EMPTY, Uri.EMPTY, Uri.EMPTY);
        } catch (Exception e) {
            ensk j = dauv.c.j();
            j.Y(ente.a, "Bugle");
            ((enrr) ((enrr) ((enrr) j).g(e)).h("com/google/android/apps/messaging/ui/debug/DebugUtilsImpl$7", "onServiceConnected", (char) 5732, "DebugUtilsImpl.java")).q("Failed IG1 Request restore");
        }
        this.a.unbindService(this);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
