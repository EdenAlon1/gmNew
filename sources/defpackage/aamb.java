package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aamb implements aalv {
    public final Context a;
    public final ffxx b;
    public final ffbr c;
    public final ffsk d;
    public final aaxh e;
    public final ffbr f;
    public final Conversation g;
    private final ffbr h;
    private final alxs i;

    public aamb(Context context, ffxx ffxxVar, ffbr ffbrVar, ffsk ffskVar, aaxh aaxhVar, ffbr ffbrVar2, ffbr ffbrVar3, Conversation conversation, alxs alxsVar) {
        context.getClass();
        ffxxVar.getClass();
        ffskVar.getClass();
        ffbrVar3.getClass();
        conversation.getClass();
        alxsVar.getClass();
        this.a = context;
        this.b = ffxxVar;
        this.c = ffbrVar;
        this.d = ffskVar;
        this.e = aaxhVar;
        this.f = ffbrVar2;
        this.h = ffbrVar3;
        this.g = conversation;
        this.i = alxsVar;
    }

    @Override // defpackage.aalv
    public final dnsj a(final appu appuVar, final MessageId messageId) {
        if (appuVar instanceof aqdp) {
            Context context = this.a;
            dmzz dmzzVar = dmzz.O;
            String string = context.getString(R.string.conversation_suggestion_launch_calendar_action);
            string.getClass();
            return new dnsj(2, dmzzVar, string, new ffix() { // from class: aalw
                @Override // defpackage.ffix
                public final Object invoke() {
                    appu appuVar2 = appuVar;
                    long j = ((aqdp) appuVar2).a;
                    aamb aambVar = aamb.this;
                    Context context2 = aambVar.a;
                    aambVar.e.a(Long.valueOf(j), null, null, null, context2.getString(R.string.calendar_suggestion_event_description), new aalz(aambVar, appuVar2));
                    aambVar.b(appuVar2.a());
                    return ffcu.a;
                }
            });
        }
        int b = appuVar.b() - 1;
        if (b == 2) {
            Context context2 = this.a;
            dmzz dmzzVar2 = dmzz.eo;
            String string2 = context2.getString(R.string.p2p_conversation_suggestion_duo_call_action_text);
            string2.getClass();
            final String a = appuVar.a();
            return new dnsj(3, dmzzVar2, string2, new ffix() { // from class: aaly
                @Override // defpackage.ffix
                public final Object invoke() {
                    aamb aambVar = aamb.this;
                    axol.m(aambVar.d, new aama(aambVar, null));
                    aambVar.b(a);
                    return ffcu.a;
                }
            });
        }
        if (b != 3) {
            return null;
        }
        Context context3 = this.a;
        dmzz dmzzVar3 = dmzz.dG;
        String string3 = context3.getString(R.string.conversation_suggestion_star_action);
        string3.getClass();
        return new dnsj(4, dmzzVar3, string3, new ffix() { // from class: aalx
            @Override // defpackage.ffix
            public final Object invoke() {
                aamb aambVar = aamb.this;
                ((alye) aambVar.c.b()).O(messageId, 6);
                aambVar.b(appuVar.a());
                return ffcu.a;
            }
        });
    }

    public final void b(String str) {
        this.i.i(str, null, null, ((dede) this.h.b()).b, true);
    }
}
