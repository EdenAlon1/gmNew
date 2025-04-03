package defpackage;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctwh {
    public static final cskc a = cskc.g("Bugle", "SubscriptionNameHelper");
    public final Context b;
    public final ctud c;

    public ctwh(Context context, ctud ctudVar) {
        this.b = context;
        this.c = ctudVar;
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(str.getBytes(StandardCharsets.UTF_8.name()));
            byte[] digest = messageDigest.digest();
            StringBuilder sb = new StringBuilder(digest.length);
            for (byte b : digest) {
                String hexString = Integer.toHexString(b & 255);
                if (hexString.length() == 1) {
                    sb.append("0");
                    sb.append(hexString);
                } else {
                    sb.append(hexString);
                }
            }
            return sb.toString();
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException unused) {
            a.n("Error while encoding subscription id");
            return null;
        }
    }

    public static String b(TelephonyManager telephonyManager, int i) {
        TelephonyManager createForSubscriptionId;
        createForSubscriptionId = telephonyManager.createForSubscriptionId(i);
        String simOperatorName = createForSubscriptionId.getSimOperatorName();
        cskc cskcVar = a;
        csjb d = cskcVar.d();
        d.I("Fell back to SIM operator name:");
        d.I(simOperatorName);
        d.r();
        if (!c(simOperatorName)) {
            return simOperatorName;
        }
        String networkOperatorName = createForSubscriptionId.getNetworkOperatorName();
        csjb d2 = cskcVar.d();
        d2.I("Fell back to network operator name:");
        d2.I(networkOperatorName);
        d2.r();
        return networkOperatorName;
    }

    public static boolean c(CharSequence charSequence) {
        return TextUtils.isEmpty(charSequence) || charSequence.toString().matches("CARD(\\s*)[0-9]");
    }
}
