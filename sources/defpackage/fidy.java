package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Process;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fidy {
    public static Context a;

    public static Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        return c(context, broadcastReceiver, intentFilter, 0);
    }

    public static boolean b() {
        boolean isSdkSandbox;
        if (Build.VERSION.SDK_INT < 33) {
            return false;
        }
        isSdkSandbox = Process.isSdkSandbox();
        return isSdkSandbox;
    }

    public static Intent c(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i) {
        Intent registerReceiver;
        registerReceiver = context.registerReceiver(broadcastReceiver, intentFilter, null, null, i);
        return registerReceiver;
    }
}
