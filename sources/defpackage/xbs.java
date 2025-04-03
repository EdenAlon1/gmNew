package defpackage;

import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import com.google.android.apps.messaging.shared.conversation.draft.IncomingDraft;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xbs extends ffhv implements ffjm {
    int a;
    final /* synthetic */ xbu b;
    final /* synthetic */ ResolvedRecipient c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xbs(xbu xbuVar, ResolvedRecipient resolvedRecipient, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = xbuVar;
        this.c = resolvedRecipient;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xbs) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object c;
        boolean I;
        Object a;
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            this.b.c.b(9);
            cvfd cvfdVar = (cvfd) this.b.d.b();
            ResolvedRecipient resolvedRecipient = this.c;
            this.a = 1;
            c = cvfdVar.c(resolvedRecipient, this);
            if (c == ffhhVar) {
                return ffhhVar;
            }
        } else {
            if (i != 1) {
                a = obj;
                ((Boolean) a).booleanValue();
                return ffcu.a;
            }
            c = obj;
        }
        String str = (String) c;
        if (str == null) {
            return ffcu.a;
        }
        I = ffpc.I(str, "meet.google.com", false);
        int i2 = true != I ? R.string.duokit_invite_template : R.string.meet_invite_template;
        ygy ygyVar = (ygy) this.b.e.b();
        IncomingDraft incomingDraft = new IncomingDraft(aygq.f, this.b.a.getString(i2, str), null, null, false, null, null, false, 252, null);
        xbr xbrVar = new xbr(null);
        this.a = 2;
        a = ygyVar.a(incomingDraft, xbrVar, this);
        if (a == ffhhVar) {
            return ffhhVar;
        }
        ((Boolean) a).booleanValue();
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new xbs(this.b, this.c, ffguVar);
    }
}
