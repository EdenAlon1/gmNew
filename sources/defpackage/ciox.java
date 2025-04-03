package defpackage;

import android.content.res.Resources;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes7.dex */
public abstract class ciox {
    public static ciox c(Resources resources, String str, String str2, int i, int i2, int i3) {
        String string;
        int i4;
        String string2;
        String string3;
        int i5 = i3 - 1;
        if (i2 != 1) {
            if (i3 == 0) {
                throw null;
            }
            if (i5 == 0) {
                string = resources.getString(R.string.notification_waiting_for_connection_timeout_line1_plural);
                i4 = R.plurals.notification_waiting_for_connection_timeout_line2_plural;
            } else if (i5 == 1) {
                string = resources.getString(R.string.notification_download_failures_line1_plural);
                i4 = R.plurals.notification_download_failures;
            } else {
                if (i5 != 2) {
                    throw new AssertionError("Unexpected failure type: ".concat(ciov.a(i3)));
                }
                string = resources.getString(R.string.notification_delivery_failures_line1_plural);
                i4 = R.plurals.notification_delivery_failures_line2_plural;
            }
            return new cimx(string, i == 1 ? resources.getQuantityString(i4, 1, Integer.valueOf(i2), 1, str2) : resources.getQuantityString(i4, i, Integer.valueOf(i2), Integer.valueOf(i)));
        }
        if (i3 == 0) {
            throw null;
        }
        if (i5 == 0) {
            string2 = resources.getString(R.string.notification_waiting_for_connection_timeout_line1_singular);
            string3 = resources.getString(R.string.notification_waiting_for_connection_timeout_line2_singular, str2);
        } else if (i5 == 1) {
            String string4 = resources.getString(R.string.notification_download_failures_line1_singular, str2);
            String b = emxe.b(str);
            string2 = string4;
            string3 = b;
        } else {
            if (i5 != 2) {
                throw new AssertionError("Unexpected failure type: ".concat(ciov.a(i3)));
            }
            string2 = resources.getString(R.string.notification_delivery_failures_line1_singular);
            string3 = resources.getString(R.string.notification_delivery_failures_line2_singular, str2);
        }
        return new cimx(string2, string3);
    }

    public abstract String a();

    public abstract String b();
}
