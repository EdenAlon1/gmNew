package defpackage;

import j$.net.URLEncoder;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clbb {
    private static final entd a = entd.c("BugleGroupManagement");
    private final cuwz b;

    public clbb(cuwz cuwzVar) {
        this.b = cuwzVar;
    }

    public final String a(String str, String str2, String str3) {
        if (str3 != null) {
            try {
                str3 = URLEncoder.encode(str3, StandardCharsets.UTF_8.name());
            } catch (UnsupportedEncodingException e) {
                throw new IllegalArgumentException(String.format("Unsupported encoding. Group name: %s", str3), e);
            }
        } else {
            str3 = "";
        }
        String str4 = str3 + "\u001f" + str + "\u001f" + str2 + "@rcs.google.com";
        ensk n = a.n();
        n.Y(csux.F, str3);
        n.Y(csux.E, str);
        n.Y(csux.J, str2);
        ((ensz) n.h("com/google/android/apps/messaging/shared/rcs/groups/telephony/RcsGroupTelephonyRecipientNameBuilder", "buildTelephonyRecipientName", 68, "RcsGroupTelephonyRecipientNameBuilder.java")).t("Created group backup contact name %s", cskt.b(str4));
        return this.b.d(str4);
    }
}
