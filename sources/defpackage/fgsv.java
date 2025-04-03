package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgsv implements fgsd {
    private final Uri a = Uri.parse("content://com.android.badge/badge");

    @Override // defpackage.fgsd
    public final List a() {
        return Collections.singletonList("com.zui.launcher");
    }

    @Override // defpackage.fgsd
    public final void b(Context context, ComponentName componentName, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("app_badge_count", i);
        context.getContentResolver().call(this.a, "setAppBadgeCount", (String) null, bundle);
    }
}
