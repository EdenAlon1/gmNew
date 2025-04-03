package defpackage;

import android.text.TextUtils;
import j$.net.URLDecoder;
import j$.net.URLEncoder;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckdo implements ckdn {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/rcs/RcsTelephonyStringsImpl");
    private static final Pattern b = Pattern.compile("^(.*)_;_(.*)_;_#(?:[0-9a-fA-F]){6}@bot.rcs.google.com$");
    private final ffbr c;

    public ckdo(ffbr ffbrVar) {
        this.c = ffbrVar;
    }

    @Override // defpackage.ckdn
    public final cpay a(String str) {
        if (e(str)) {
            String c = ((cuwz) this.c.b()).c(str);
            if (c == null) {
                ensk e = a.e();
                e.Y(ente.a, "Bugle");
                ((enrr) ((enrr) e).h("com/google/android/apps/messaging/shared/rcs/RcsTelephonyStringsImpl", "getDecodedRbmBotThreadInfo", 184, "RcsTelephonyStringsImpl.java")).q("decodedBackupContactName is null");
                return null;
            }
            List i = emye.d("_;_").i(c.substring(0, c.length() - 19));
            if (i.size() == 3 && !TextUtils.isEmpty((CharSequence) i.get(0))) {
                return new cpay(((String) i.get(0)).replace("__AT__", "@"), (String) i.get(1), (String) i.get(2));
            }
        }
        return null;
    }

    @Override // defpackage.ckdn
    public final String b(cpay cpayVar) {
        return c(cpayVar.a, cpayVar.b, cpayVar.c);
    }

    @Override // defpackage.ckdn
    public final String c(String str, String str2, String str3) {
        String format = String.format("%s_;_%s_;_%s@bot.rcs.google.com", str != null ? URLEncoder.encode(str.replace("@", "__AT__")) : "", str2, str3.toUpperCase(Locale.US));
        ensk h = a.h();
        h.Y(ente.a, "Bugle");
        ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/rcs/RcsTelephonyStringsImpl", "buildRbmBotBackupContactName", 153, "RcsTelephonyStringsImpl.java")).t("Created contact name %s", format);
        return ((cuwz) this.c.b()).d(format);
    }

    @Override // defpackage.ckdn
    public final String d(String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        if (str2 != null) {
            String encode = URLEncoder.encode(str2);
            sb.replace(0, encode.length(), encode);
        }
        return sb.toString();
    }

    @Override // defpackage.ckdn
    public final boolean e(String str) {
        return g(str, b);
    }

    @Override // defpackage.ckdn
    public final boolean f(String str) {
        return g(str, claw.b) || g(str, claw.a);
    }

    final boolean g(String str, Pattern pattern) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String c = ((cuwz) this.c.b()).c(str);
        if (c == null) {
            ensk e = a.e();
            e.Y(ente.a, "Bugle");
            ((enrr) ((enrr) e).h("com/google/android/apps/messaging/shared/rcs/RcsTelephonyStringsImpl", "isBackupContact", 112, "RcsTelephonyStringsImpl.java")).q("isBackupContact() returning false because decodedAddress is null");
            return false;
        }
        Matcher matcher = pattern.matcher(c);
        if (!matcher.matches()) {
            return false;
        }
        try {
            URLDecoder.decode(emxe.b(matcher.group(1)));
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }
}
