package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zao implements zab {
    public static final enru a = enru.c("com/google/android/apps/messaging/conversation2/bottomcontent/stickytoolstone/scam/PenpalScamAlertCardUiAdapterImpl");
    public final Context b;
    public final ffsk c;
    public final ConversationId d;
    public final ffxx e;
    public final ffbr f;
    public final ffbr g;
    public final aqfk h;
    public final String i;
    public final ffbz j;
    private final yzu k;
    private final ffbr l;

    public zao(Context context, ffsk ffskVar, ConversationId conversationId, ffxx ffxxVar, yzu yzuVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, aqfk aqfkVar) {
        context.getClass();
        ffskVar.getClass();
        conversationId.getClass();
        ffxxVar.getClass();
        yzuVar.getClass();
        ffbrVar3.getClass();
        this.b = context;
        this.c = ffskVar;
        this.d = conversationId;
        this.e = ffxxVar;
        this.k = yzuVar;
        this.f = ffbrVar;
        this.g = ffbrVar2;
        this.l = ffbrVar3;
        this.h = aqfkVar;
        this.i = (String) ctjd.bF.e();
        this.j = ffca.a(new ffix() { // from class: zad
            @Override // defpackage.ffix
            public final Object invoke() {
                final zao zaoVar = zao.this;
                String string = zaoVar.b.getString(R.string.suspected_messages_toolstone_card_text);
                string.getClass();
                String string2 = zaoVar.b.getString(R.string.suspected_messages_toolstone_link_pattern);
                string2.getClass();
                String string3 = zaoVar.b.getString(R.string.suspected_messages_toolstone_title);
                string3.getClass();
                String string4 = zaoVar.b.getString(R.string.suspected_messages_toolstone_description);
                string4.getClass();
                String string5 = zaoVar.b.getString(R.string.suspected_messages_toolstone_primary_button);
                string5.getClass();
                String string6 = zaoVar.b.getString(R.string.suspected_messages_toolstone_secondary_button);
                string6.getClass();
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                dmzz dmzzVar = dmzz.dv;
                String spannableStringBuilder2 = spannableStringBuilder.toString();
                String str = zaoVar.i;
                str.getClass();
                return new dogx(dmzzVar, string3, spannableStringBuilder2, string4, ffdx.b(new dltp(str, ffpc.Q(string4, string2, 0, false, 6), ffpc.Q(string4, string2, 0, false, 6) + string2.length(), new ffji() { // from class: zac
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        eqkr eqkrVar = (eqkr) eqkt.a.createBuilder();
                        eqkrVar.getClass();
                        erbf.c(eqkrVar);
                        erbf.b(5, eqkrVar);
                        eqkt a2 = erbf.a(eqkrVar);
                        zao zaoVar2 = zao.this;
                        zaoVar2.h.a(a2);
                        String str2 = zaoVar2.i;
                        if (str2 != null && !ffpc.J(str2)) {
                            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(zaoVar2.i));
                            intent.setFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
                            eldl.p(zaoVar2.b, intent);
                        }
                        return true;
                    }
                }, 24)), new dogf(string5, new zae(zaoVar)), new dogf(string6, new zaf(zaoVar)), new zag(zaoVar));
            }
        });
    }

    @Override // defpackage.zab
    public final fgdj a() {
        zaj zajVar = new zaj(this.k.a(), this);
        int i = fgcz.a;
        return fgbn.b(zajVar, this.c, fgcy.b, null);
    }

    public final Object b(ResolvedRecipient resolvedRecipient, erfe erfeVar, ffgu ffguVar) {
        crsd a2;
        crrt crrtVar = (crrt) this.l.b();
        a2 = crsc.a(1 == (r26 & 1) ? null : null, (r26 & 2) != 0 ? null : false, (r26 & 4) != 0 ? cukx.b : null, (r26 & 8) != 0 ? null : null, (r26 & 16) != 0 ? null : this.d, null, (r26 & 64) != 0 ? null : resolvedRecipient, (!((r26 & 128) == 0)) | false, (r26 & 256) != 0 ? null : eoko.CONVERSATION_FROM_UNSPAM_ACTION, 3, 9, (r26 & 2048) != 0 ? 2 : 0, (r26 & 4096) != 0 ? null : erfeVar);
        Object c = crrtVar.c(a2, ffguVar);
        return c == ffhh.a ? c : ffcu.a;
    }

    public final void c() {
        ensk h = a.h();
        h.Y(ente.a, "BugleSpam");
        ((enrr) h.h("com/google/android/apps/messaging/conversation2/bottomcontent/stickytoolstone/scam/PenpalScamAlertCardUiAdapterImpl", "dismissAlertCard", 184, "PenpalScamAlertCardUiAdapterImpl.kt")).q("Penpal alert card dismissed.");
        if (this.d instanceof BugleConversationId) {
            axol.m(this.c, new zak(this, null));
        }
    }
}
