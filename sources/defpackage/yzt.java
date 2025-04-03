package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.penpal.PenpalBotConversationId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yzt implements yzn {
    public static final enru a = enru.c("com/google/android/apps/messaging/conversation2/bottomcontent/stickytoolstone/satellite/SatelliteStickyToolstoneAdapterImpl");
    public final Context b;
    public final ffsk c;
    public final cnoc d;
    public final fgdj e;
    public final ffbz f;
    private final ffsk g;
    private final ConversationId h;
    private final ffxx i;

    public yzt(Context context, ffsk ffskVar, ffsk ffskVar2, ffxx ffxxVar, cnpd cnpdVar, ConversationId conversationId, cnoc cnocVar, ffxx ffxxVar2, ffbr ffbrVar) {
        context.getClass();
        ffskVar.getClass();
        ffskVar2.getClass();
        ffxxVar.getClass();
        cnpdVar.getClass();
        conversationId.getClass();
        cnocVar.getClass();
        ffxxVar2.getClass();
        ffbrVar.getClass();
        this.b = context;
        this.c = ffskVar;
        this.g = ffskVar2;
        this.h = conversationId;
        this.d = cnocVar;
        ffxxVar2 = ((aspy) ffbrVar.b()).a() ? fgdm.a(Boolean.valueOf(conversationId instanceof PenpalBotConversationId)) : ffxxVar2;
        this.i = ffxxVar2;
        ffxx a2 = fgck.a(ffyy.a(ffxxVar), cnpdVar.h(), ffxxVar2, new yzq(this, null));
        int i = fgcz.a;
        this.e = fgbn.b(a2, ffskVar2, fgcy.a(0L, 3), null);
        this.f = ffca.a(new ffix() { // from class: yzp
            @Override // defpackage.ffix
            public final Object invoke() {
                final yzt yztVar = yzt.this;
                String string = yztVar.b.getString(R.string.satellite_toolstone_connect);
                string.getClass();
                String string2 = yztVar.b.getString(R.string.satellite_toolstone_connect_link);
                string2.getClass();
                return new doqo("SatelliteManualConnectToolstone", string, dmzz.o, ffdx.b(new dlto(dlus.h, 0, string2.length(), string, new ffji() { // from class: yzo
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        ensk h = yzt.a.h();
                        h.Y(ente.a, "BugleSatellite");
                        ((enrr) h.h("com/google/android/apps/messaging/conversation2/bottomcontent/stickytoolstone/satellite/SatelliteStickyToolstoneAdapterImpl", "toolstoneUiData_delegate$lambda$1$lambda$0", 100, "SatelliteStickyToolstoneAdapterImpl.kt")).q("Handling click on connect to satellite link.");
                        yzt yztVar2 = yzt.this;
                        axol.m(yztVar2.c, new yzs(yztVar2, null));
                        return true;
                    }
                })), null, 16);
            }
        });
    }
}
