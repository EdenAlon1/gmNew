package defpackage;

import android.content.Context;
import android.text.TextUtils;
import j$.util.Objects;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkvb {
    public static synchronized String a(Context context, String str, int i) {
        String c;
        synchronized (dkvb.class) {
            dkty.c("Generating client ID of type %s subId %d", str, Integer.valueOf(i));
            if ("1".equals(str)) {
                return c();
            }
            String str2 = (String) dizi.a().a.e.a();
            if (d(str2)) {
                dkty.k("Overriding Imei, should be only done for emulator testing!", new Object[0]);
            } else {
                str2 = null;
                try {
                    dkvt f = dkvt.g(context).f(i);
                    if (f != null) {
                        try {
                            str2 = f.a.getImei();
                        } catch (SecurityException e) {
                            throw new dkvd("READ_PRIVILEGED_PHONE_STATE permission is missing.", e);
                        }
                    }
                } catch (dkvd e2) {
                    dkty.s(e2, "Failed to get device id.", new Object[0]);
                }
            }
            if (Objects.isNull(str2) || !d(str2)) {
                dkty.q("Unable to retrieve IMEI from device. Falling back to UUID!", new Object[0]);
                c = c();
            } else {
                c = b(str2);
            }
            return c;
        }
    }

    public static String b(String str) {
        String substring = str.substring(0, 8);
        String substring2 = str.substring(8, 14);
        String substring3 = str.substring(14, str.length());
        if (str.indexOf(45) > 1) {
            return "urn:gsma:imei:".concat(String.valueOf(str));
        }
        StringBuilder sb = new StringBuilder("urn:gsma:imei:");
        sb.append(substring);
        sb.append("-");
        sb.append(substring2);
        sb.append("-");
        if (substring3.length() == 1) {
            sb.append("0");
        } else {
            sb.append(substring3);
        }
        return sb.toString();
    }

    private static String c() {
        return "urn:uuid:".concat(String.valueOf(UUID.randomUUID().toString()));
    }

    private static boolean d(String str) {
        return !TextUtils.isEmpty(str) && str.length() >= 14 && str.length() <= 16;
    }
}
