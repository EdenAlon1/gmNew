package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyhk {
    public static boolean a(Context context) {
        return (context.getApplicationInfo().flags & 4194304) == 4194304 && context.getResources().getConfiguration().getLayoutDirection() == 1;
    }
}
