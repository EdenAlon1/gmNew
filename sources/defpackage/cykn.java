package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cykn implements sry {
    public final Context a;
    public final ffhd b;
    public final ffsk c;
    public final ConversationId d;
    public final ablq e;
    public final cyku f;
    private final cskc g;

    public cykn(Context context, ffhd ffhdVar, ffsk ffskVar, ConversationId conversationId, cyku cykuVar, ablq ablqVar) {
        context.getClass();
        ffhdVar.getClass();
        ffskVar.getClass();
        conversationId.getClass();
        ablqVar.getClass();
        this.a = context;
        this.b = ffhdVar;
        this.c = ffskVar;
        this.d = conversationId;
        this.f = cykuVar;
        this.e = ablqVar;
        this.g = cskc.g("Bugle", "UnblockUnspamBanner2");
    }

    @Override // defpackage.sry
    public final fgdj a() {
        cyku cykuVar = this.f;
        return ejso.a(ffyo.b(new fgch(cykuVar.a, cykuVar.b, new cykr(cykuVar, null)), this.b), this.c, new cyke(this));
    }

    @Override // defpackage.sry
    public final boolean b() {
        return true;
    }

    public final ssg c(boolean z, final ResolvedRecipient resolvedRecipient) {
        String string;
        String string2;
        if (z) {
            Context context = this.a;
            string = context.getString(R.string.unspam_banner_title_v2);
            string2 = context.getString(R.string.unspam_banner_body_v3);
        } else {
            Context context2 = this.a;
            string = context2.getString(R.string.unspam_detected_title_v2);
            string2 = context2.getString(R.string.unspam_detected_body_v2);
        }
        String str = string2;
        ssj ssjVar = new ssj();
        String string3 = this.a.getString(R.string.unspam_banner_end_button);
        string3.getClass();
        return new ssg("unblock_unspam_banner", string, str, ssjVar, new ssc(string3, new ffix() { // from class: cykb
            @Override // defpackage.ffix
            public final Object invoke() {
                cykn cyknVar = cykn.this;
                axol.k(cyknVar.c, cyknVar.b, new cykf(cyknVar, resolvedRecipient, null), 2);
                return ffcu.a;
            }
        }), null, null, null, 1568);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r19, defpackage.ffgu r20) {
        /*
            Method dump skipped, instructions count: 419
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cykn.d(com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient, ffgu):java.lang.Object");
    }
}
