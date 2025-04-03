package defpackage;

import android.content.Context;
import android.content.res.Configuration;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eipm {
    public static boolean a(Context context) {
        Configuration configuration = context.getResources().getConfiguration();
        return (configuration.keyboard == 1 || configuration.hardKeyboardHidden == 2) ? false : true;
    }
}
