package defpackage;

import android.text.TextUtils;
import android.util.Base64;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfye {
    private static final cskc a = cskc.g("BugleNetwork", "ReceiverIdParser");

    public static fcek a(String str) {
        if (TextUtils.isEmpty(str)) {
            a.n("Empty receiver ID in firebase tickle.");
            return null;
        }
        try {
            byte[] decode = Base64.decode(str, 0);
            try {
                fcek fcekVar = (fcek) eyfy.parseFrom(fcek.a, decode, eyfc.a());
                csjb c = a.c();
                c.I("Extracted receiver id from firebase tickle");
                c.M("receiverId", fcekVar.c);
                fgtg b = fgtg.b(fcekVar.b);
                if (b == null) {
                    b = fgtg.UNRECOGNIZED;
                }
                c.A(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, b);
                c.r();
                return fcekVar;
            } catch (eygu unused) {
                a.n("Could not decode receiver ID. Invalid protobuf.");
                return null;
            }
        } catch (IllegalArgumentException unused2) {
            a.n("Could not decode receiver ID. Invalid base64.");
            return null;
        }
    }
}
