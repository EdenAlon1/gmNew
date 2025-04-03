package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cigw implements cigv {
    private static final cskc a = cskc.g("BugleNetwork", "UserDataInboxMessageHandler");
    private final Map b;

    public cigw(Map map) {
        this.b = map;
        for (fgts fgtsVar : ((enhk) map).keySet()) {
            csjb d = a.d();
            d.I("Registered UserData InboxMessageHandler");
            d.A(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, fgtsVar.name());
            d.r();
        }
    }

    @Override // defpackage.cigv
    public final elfl a(fbzt fbztVar) {
        fbzs b = fbzs.b(fbztVar.d);
        if (b == null) {
            b = fbzs.UNRECOGNIZED;
        }
        if (b.equals(fbzs.USERDATA)) {
            try {
                fcdo fcdoVar = (fcdo) eyfy.parseFrom(fcdo.a, fbztVar.e, eyfc.a());
                Map map = this.b;
                fgts b2 = fgts.b(fcdoVar.d);
                if (b2 == null) {
                    b2 = fgts.UNRECOGNIZED;
                }
                cigv cigvVar = (cigv) map.get(b2);
                if (cigvVar != null) {
                    return cigvVar.a(fbztVar);
                }
                csjb e = a.e();
                e.I("Got UserData InboxMessage with unhandled type ");
                fgts b3 = fgts.b(fcdoVar.d);
                if (b3 == null) {
                    b3 = fgts.UNRECOGNIZED;
                }
                e.I(b3.name());
                e.A("messageId", fbztVar.c);
                e.r();
                return elfo.e(true);
            } catch (eygu e2) {
                csjb e3 = a.e();
                e3.I("Failed to parse UserDataMessage");
                e3.A("messageId", fbztVar.c);
                e3.s(e2);
            }
        }
        csjb e4 = a.e();
        e4.I("Ignoring non UserData InboxMessage or invalid UserData InboxMessage");
        fbzs b4 = fbzs.b(fbztVar.d);
        if (b4 == null) {
            b4 = fbzs.UNRECOGNIZED;
        }
        e4.A("messageType", b4);
        e4.A("messageId", fbztVar.c);
        e4.r();
        return elfo.e(true);
    }
}
