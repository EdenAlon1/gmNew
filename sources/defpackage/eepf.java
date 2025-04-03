package defpackage;

import android.app.PendingIntent;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eepf {
    public static final ClipData a = ClipData.newIntent("", new Intent());

    public static PendingIntent a(Context context, int i, Intent intent, int i2) {
        return c(context, i, intent, i2, 0);
    }

    public static PendingIntent b(Context context, int i, Intent intent, int i2) {
        emxf.l(true);
        return PendingIntent.getActivity(context, i, intent, i2 | VCardConfig.FLAG_APPEND_TYPE_PARAM);
    }

    public static PendingIntent c(Context context, int i, Intent intent, int i2, int i3) {
        return PendingIntent.getActivity(context, i, f(intent, i2, i3), i2);
    }

    public static PendingIntent d(Context context, int i, Intent intent, int i2) {
        return e(context, i, intent, i2, 0);
    }

    public static PendingIntent e(Context context, int i, Intent intent, int i2, int i3) {
        return PendingIntent.getBroadcast(context, i, f(intent, i2, i3), i2);
    }

    public static Intent f(Intent intent, int i, int i2) {
        emxf.b((i & 88) == 0, "Cannot set any dangerous parts of intent to be mutable.");
        emxf.b((i & 1) == 0 || h(i2, 3), "Cannot use Intent.FILL_IN_ACTION unless the action is marked as mutable.");
        emxf.b((i & 2) == 0 || h(i2, 5), "Cannot use Intent.FILL_IN_DATA unless the data is marked as mutable.");
        emxf.b((i & 4) == 0 || h(i2, 9), "Cannot use Intent.FILL_IN_CATEGORIES unless the category is marked as mutable.");
        emxf.b((i & 128) == 0 || h(i2, 17), "Cannot use Intent.FILL_IN_CLIP_DATA unless the clip data is marked as mutable.");
        emxf.b(intent.getComponent() != null, "Must set component on Intent.");
        if (h(i2, 1)) {
            emxf.b(!h(i, VCardConfig.FLAG_APPEND_TYPE_PARAM), "Cannot set mutability flags if PendingIntent.FLAG_IMMUTABLE is set.");
        } else {
            emxf.b(h(i, VCardConfig.FLAG_APPEND_TYPE_PARAM), "Must set PendingIntent.FLAG_IMMUTABLE for SDK >= 23 if no parts of intent are mutable.");
        }
        Intent intent2 = new Intent(intent);
        if (!h(i, VCardConfig.FLAG_APPEND_TYPE_PARAM)) {
            if (intent2.getPackage() == null) {
                intent2.setPackage(intent2.getComponent().getPackageName());
            }
            if (!h(i2, 3) && intent2.getAction() == null) {
                intent2.setAction("");
            }
            if (!h(i2, 9) && intent2.getCategories() == null) {
                intent2.addCategory("");
            }
            if (!h(i2, 5) && intent2.getData() == null) {
                intent2.setDataAndType(Uri.EMPTY, "*/*");
            }
            if (!h(i2, 17) && intent2.getClipData() == null) {
                intent2.setClipData(a);
            }
        }
        return intent2;
    }

    public static PendingIntent g(Context context, Intent intent) {
        return PendingIntent.getService(context, 0, f(intent, 1140850688, 0), 1140850688);
    }

    private static boolean h(int i, int i2) {
        return (i & i2) == i2;
    }
}
