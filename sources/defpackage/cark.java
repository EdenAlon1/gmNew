package defpackage;

import android.net.Uri;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cark extends ejte {
    private static final cskc b = cskc.g("BugleDataModel", "TelephonyMessagesObserver");
    public final ffbr a;
    private final ffbr c;

    public cark(ffbr ffbrVar, ffbr ffbrVar2, elbx elbxVar, errl errlVar) {
        super(elbxVar, "TelephonyMessagesObserver", errlVar);
        this.c = ffbrVar;
        this.a = ffbrVar2;
    }

    @Override // defpackage.ejte
    public final void a(boolean z, Uri uri) {
        csjb a = b.a();
        a.I("Sms/Mms DB changed");
        a.A(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, uri);
        a.r();
        if (((coxg) this.c.b()).v()) {
            return;
        }
        if (((Boolean) ((cfup) coxg.a.get()).e()).booleanValue()) {
            ((coxg) this.c.b()).l(eqqh.TELEPHONY_MESSAGES_OBSERVER);
        } else {
            ((coxg) this.c.b()).h();
        }
    }
}
