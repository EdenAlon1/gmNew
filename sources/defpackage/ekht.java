package defpackage;

import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final /* synthetic */ class ekht {
    public static boolean a(Intent intent, Context context) {
        return intent.getPackage() != null && intent.getPackage().equals(context.getPackageName());
    }
}
