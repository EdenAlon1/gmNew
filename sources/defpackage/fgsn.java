package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgsn implements fgsd {
    private int a = -1;

    @Override // defpackage.fgsd
    public final List a() {
        return Collections.singletonList("com.oppo.launcher");
    }

    @Override // defpackage.fgsd
    public final void b(Context context, ComponentName componentName, int i) {
        if (this.a == i) {
            return;
        }
        this.a = i;
        Bundle bundle = new Bundle();
        bundle.putInt("app_badge_count", i);
        context.getContentResolver().call(Uri.parse("content://com.android.badge/badge"), "setAppBadgeCount", (String) null, bundle);
    }
}
