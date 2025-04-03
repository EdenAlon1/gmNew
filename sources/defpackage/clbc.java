package defpackage;

import j$.net.URLDecoder;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clbc {
    private static final entd a = entd.c("BugleGroupManagement");
    private final cuwz b;

    public clbc(cuwz cuwzVar) {
        this.b = cuwzVar;
    }

    private static boolean c(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.matches()) {
            return false;
        }
        try {
            URLDecoder.decode(emxe.b(matcher.group(1)), StandardCharsets.UTF_8.name());
            return true;
        } catch (UnsupportedEncodingException | IllegalArgumentException unused) {
            return false;
        }
    }

    public final clax a(String str) {
        if (!b(str)) {
            ((ensz) ((ensz) a.j()).h("com/google/android/apps/messaging/shared/rcs/groups/telephony/RcsGroupTelephonyRecipientNameParser", "parseTelephonyRecipientName", 55, "RcsGroupTelephonyRecipientNameParser.java")).q("Attempting to parse a RcsGroupTelephonyData  out of a non RCS group Telephony recipient.");
            return null;
        }
        String b = emxe.b(this.b.c(str));
        int length = b.length();
        int i = length - 15;
        int i2 = length - 16;
        int lastIndexOf = b.lastIndexOf(31, i2);
        int lastIndexOf2 = b.lastIndexOf(31, lastIndexOf - 1);
        if (lastIndexOf == -1) {
            lastIndexOf = b.lastIndexOf(45, i2);
            lastIndexOf2 = b.lastIndexOf(45, lastIndexOf - 1);
        }
        try {
            String decode = URLDecoder.decode(b.substring(0, lastIndexOf2), StandardCharsets.UTF_8.name());
            String substring = b.substring(lastIndexOf2 + 1, lastIndexOf);
            String substring2 = b.substring(lastIndexOf + 1, i);
            ensk n = a.n();
            n.Y(csux.J, substring2);
            n.Y(csux.F, decode);
            ((ensz) n.h("com/google/android/apps/messaging/shared/rcs/groups/telephony/RcsGroupTelephonyRecipientNameParser", "parseTelephonyRecipientName", 89, "RcsGroupTelephonyRecipientNameParser.java")).t("Parsed out RcsGroupTelephonyData from Telephony recipient: %s", str);
            if (decode == null) {
                throw new NullPointerException("Null groupName");
            }
            if (substring == null) {
                throw new NullPointerException("Null selfRcsMsisdn");
            }
            if (substring2 != null) {
                return new clat(decode, substring, substring2);
            }
            throw new NullPointerException("Null rcsGroupId");
        } catch (UnsupportedEncodingException e) {
            ((ensz) ((ensz) ((ensz) a.j()).g(e)).h("com/google/android/apps/messaging/shared/rcs/groups/telephony/RcsGroupTelephonyRecipientNameParser", "parseTelephonyRecipientName", 'c', "RcsGroupTelephonyRecipientNameParser.java")).q("Failed to decode RCS group telephony recipient name.");
            return null;
        }
    }

    public final boolean b(String str) {
        String c = this.b.c(str);
        if (c == null) {
            return false;
        }
        return c(c, claw.b) || c(c, claw.a);
    }
}
