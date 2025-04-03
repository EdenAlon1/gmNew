package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.message.internal.CoreBugleMessageId;
import com.google.android.apps.messaging.shared.conversation.draft.EditingData;
import com.google.android.apps.messaging.shared.conversation.draft.IncomingDraft;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wvn extends ffhv implements ffjm {
    int a;
    final /* synthetic */ alxr b;
    final /* synthetic */ wvr c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wvn(alxr alxrVar, wvr wvrVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = alxrVar;
        this.c = wvrVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((wvn) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        MessageId b;
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            if (this.b.A() != null) {
                apxv A = this.b.A();
                A.getClass();
                btxp btxpVar = (btxp) ffdx.K(A.a);
                btxpVar.az(0, "message_id");
                b = new CoreBugleMessageId(btxpVar.a, -1L, btxpVar.k(), btxpVar.k());
            } else {
                b = this.b.b();
            }
            appj g = this.b.g();
            String c = g instanceof appw ? ((appw) g).c() : null;
            wvr wvrVar = this.c;
            IncomingDraft a = IncomingDraft.a(ayha.a(this.b, aygq.e), null, null, new EditingData(b, c, this.b.b()), 191);
            wvm wvmVar = new wvm(null);
            this.a = 1;
            obj = wvrVar.g.a(a, wvmVar, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        ((Boolean) obj).booleanValue();
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new wvn(this.b, this.c, ffguVar);
    }
}
