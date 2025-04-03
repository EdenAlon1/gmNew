package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgsr implements fgsd {
    @Override // defpackage.fgsd
    public final List a() {
        return Arrays.asList("com.transsion.XOSLauncher", "com.transsion.hilauncher", "com.transsion.itel.launcher");
    }

    @Override // defpackage.fgsd
    public final void b(Context context, ComponentName componentName, int i) {
        Intent intent = new Intent("com.mediatek.action.UNREAD_CHANGED");
        intent.putExtra("com.mediatek.intent.extra.UNREAD_COMPONENT", componentName);
        intent.putExtra("com.mediatek.intent.extra.UNREAD_NUMBER", i);
        context.sendBroadcast(intent);
    }
}
