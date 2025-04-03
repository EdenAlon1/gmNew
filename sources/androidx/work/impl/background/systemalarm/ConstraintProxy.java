package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.ppt;
import defpackage.puk;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ConstraintProxy extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;
    private static final String b = ppt.d("ConstraintProxy");

    /* compiled from: PG */
    public static class BatteryChargingProxy extends ConstraintProxy {
    }

    /* compiled from: PG */
    public static class BatteryNotLowProxy extends ConstraintProxy {
    }

    /* compiled from: PG */
    public static class NetworkStateProxy extends ConstraintProxy {
    }

    /* compiled from: PG */
    public static class StorageNotLowProxy extends ConstraintProxy {
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        ppt c = ppt.c();
        String str = b;
        Objects.toString(intent);
        c.a(str, "onReceive : ".concat(String.valueOf(intent)));
        context.startService(puk.b(context));
    }
}
