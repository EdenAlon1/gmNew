package defpackage;

import com.android.vcard.VCardConstants;
import java.text.DecimalFormat;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cap {
    public static final String a(long j) {
        String[] strArr = {VCardConstants.PARAM_ENCODING_B, "KB", "MB", "GB", "TB"};
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        double d = j;
        double d2 = d;
        int i = 0;
        while (d2 >= 1024.0d && i < 4) {
            d2 /= 1024.0d;
            i++;
        }
        if (i == 0) {
            return decimalFormat.format(d2) + ' ' + strArr[0];
        }
        StringBuilder sb = new StringBuilder();
        while (i >= 0) {
            double pow = Math.pow(1024.0d, i);
            double floor = Math.floor(d / pow);
            if (floor > eobe.a) {
                sb.append(decimalFormat.format(floor));
                sb.append(" ");
                sb.append(strArr[i]);
                sb.append(" ");
                d -= floor * pow;
            }
            i--;
        }
        return ffpc.x(sb).toString();
    }
}
