package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvsl {
    public static int a(evxu evxuVar, Context context) {
        int a = evxp.a(evxuVar.l);
        if (a == 0) {
            a = 1;
        }
        if (a - 1 != 1) {
            return -1;
        }
        return (int) context.getResources().getDimension(R.dimen.growthkit_gm3_icon_size);
    }

    public static int b(evxu evxuVar, Context context) {
        int a = evxp.a(evxuVar.l);
        if (a == 0) {
            a = 1;
        }
        int i = a - 1;
        if (i == 1) {
            return (int) context.getResources().getDimension(R.dimen.growthkit_gm3_icon_size);
        }
        if (i != 2) {
            return -1;
        }
        return context.getResources().getDimensionPixelOffset(R.dimen.growthkit_gm3_dialog_max_width);
    }
}
