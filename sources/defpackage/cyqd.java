package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyqd implements cypv {
    private static final enru g = enru.c("com/google/android/apps/messaging/ui/conversation/details/encryption/EncryptionUiAdapterImpl");
    public final ffsk a;
    public final ffxx b;
    public final ConversationId c;
    public final ffbr d;
    public final ffbr e;
    public final ffji f;
    private final Context h;
    private final ffxx i;
    private final ffxx j;
    private final ffxx k;
    private final ffbr l;
    private final ffbr m;

    public cyqd(Context context, ffsk ffskVar, ffxx ffxxVar, ffxx ffxxVar2, ConversationId conversationId, ffxx ffxxVar3, ffxx ffxxVar4, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4) {
        ffji a;
        context.getClass();
        ffskVar.getClass();
        ffxxVar.getClass();
        ffxxVar2.getClass();
        conversationId.getClass();
        ffxxVar4.getClass();
        ffbrVar2.getClass();
        this.h = context;
        this.a = ffskVar;
        this.i = ffxxVar;
        this.b = ffxxVar2;
        this.c = conversationId;
        this.j = ffxxVar3;
        this.k = ffxxVar4;
        this.d = ffbrVar;
        this.e = ffbrVar2;
        this.l = ffbrVar3;
        this.m = ffbrVar4;
        a = axqa.a(new cyqc(this), 1000L, ffskVar);
        this.f = a;
    }

    @Override // defpackage.cypv
    public final fgdj a() {
        ffxx e = axsp.e(axrb.a(this.i, "ConversationProperties"), axrb.a(this.k, "IsPenpalConversation"), axrb.a(((wyd) this.l.b()).b, "RcsLearnMoreAction"), axrb.a(((cyqk) this.m.b()).a(), "E2eeStatusUiData"), axrb.a(this.j, "SelfIdentity"), this.b, this.a, new cypz(this, null));
        int i = fgcz.a;
        return fgbn.b(e, this.a, fgcy.a(0L, 3), null);
    }

    @Override // defpackage.cypv
    public final fgdj b() {
        ffxx f = axsp.f(axrb.a(this.i, "ConversationProperties"), axrb.a(((wyd) this.l.b()).b, "RcsLearnMoreAction"), axrb.a(((cyqk) this.m.b()).a(), "E2eeStatusUiData"), axrb.a(this.j, "SelfIdentity"), this.b, this.a, new cyqa(this, null));
        int i = fgcz.a;
        return fgbn.b(f, this.a, fgcy.a(0L, 3), null);
    }

    public final cyqe c(alxj alxjVar, boolean z, final dlsr dlsrVar, cyqq cyqqVar, final aqux aquxVar, engw engwVar) {
        Context context;
        int i;
        if (z) {
            ensk h = g.h();
            h.Y(ente.a, "BugleCdp");
            ((enrr) h.h("com/google/android/apps/messaging/ui/conversation/details/encryption/EncryptionUiAdapterImpl", "internalCreateUiData", 134, "EncryptionUiAdapterImpl.kt")).q("Conversation is penpal. Action list will be empty");
            int i2 = engw.d;
            engw engwVar2 = enou.a;
            engwVar2.getClass();
            return new cyqe(engwVar2);
        }
        boolean z2 = cyqqVar != null && cyqqVar.b == 1;
        if (z2) {
            context = this.h;
            i = R.string.on_text;
        } else {
            context = this.h;
            i = R.string.off_text;
        }
        String string = context.getString(i);
        string.getClass();
        String string2 = this.h.getString(R.string.e2e_encryption, string);
        string2.getClass();
        String string3 = this.h.getString(R.string.more_about_rcs_chats);
        string3.getClass();
        String str = cyqqVar != null ? cyqqVar.a : null;
        if (str == null || aquxVar == null) {
            ensk h2 = g.h();
            h2.Y(ente.a, "BugleCdp");
            ((enrr) h2.h("com/google/android/apps/messaging/ui/conversation/details/encryption/EncryptionUiAdapterImpl", "internalCreateUiData", 149, "EncryptionUiAdapterImpl.kt")).q("E2eeStatusUiAdapter returned empty status text or active self identity is empty.");
            int i3 = engw.d;
            engw engwVar3 = enou.a;
            engwVar3.getClass();
            return new cyqe(engwVar3);
        }
        fffs fffsVar = new fffs((byte[]) null);
        dlus dlusVar = z2 ? dlus.m : dlus.l;
        int Q = ffpc.Q(string2, string, 0, false, 6);
        int Q2 = ffpc.Q(str, string3, 0, false, 6);
        engw s = engw.s(new dlto(dlusVar, Q, Q + string.length(), (ffji) null, 24), new dlto(dlus.d, Q, Q + string.length(), (ffji) null, 24));
        s.getClass();
        fffsVar.add(new dnld(1, s));
        engw r = engw.r(new dltp(string3, Q2, Q2 + string3.length(), new ffji() { // from class: cypw
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                dlsr.this.k.invoke();
                return false;
            }
        }, 24));
        r.getClass();
        fffsVar.add(new dnld(2, r));
        engw a = engq.a(ffdx.a(fffsVar));
        fffs fffsVar2 = new fffs((byte[]) null);
        fffsVar2.add(new dnlz(string2, str, null, a, null, new dnlf(z2 ? dmzz.bZ : dmzz.cb), null, new ffix() { // from class: cypx
            @Override // defpackage.ffix
            public final Object invoke() {
                return ffcu.a;
            }
        }, 84));
        String o = engwVar.size() == 1 ? ((ResolvedRecipient) ffdx.K(engwVar)).g().o() : null;
        if (alxjVar.b() != alxi.GROUP && z2 && o != null && o.length() != 0) {
            String string4 = this.h.getString(R.string.verify_encryption);
            string4.getClass();
            fffsVar2.add(new dnlz(string4, null, null, null, null, new dnlf(dmzz.aU), null, new ffix() { // from class: cypy
                @Override // defpackage.ffix
                public final Object invoke() {
                    cyqd.this.f.invoke(aquxVar);
                    return ffcu.a;
                }
            }, 94));
        }
        return new cyqe(engq.a(ffdx.a(fffsVar2)));
    }
}
