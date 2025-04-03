package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cybu implements sry {
    public final Context a;
    public final ffsk b;
    public final ConversationId c;
    public final cyco d;
    public final aigz e;
    public final crnx f;
    public final ffbr g;
    public boolean h;
    public final ssm i;
    private final ffhd j;
    private final boolean k;
    private final tac l;

    public cybu(Context context, ffhd ffhdVar, ffsk ffskVar, ConversationId conversationId, cyco cycoVar, aigz aigzVar, crnx crnxVar, ffbr ffbrVar, tac tacVar, ssm ssmVar) {
        context.getClass();
        ffhdVar.getClass();
        ffskVar.getClass();
        conversationId.getClass();
        aigzVar.getClass();
        crnxVar.getClass();
        ffbrVar.getClass();
        tacVar.getClass();
        ssmVar.getClass();
        this.a = context;
        this.j = ffhdVar;
        this.b = ffskVar;
        this.c = conversationId;
        this.d = cycoVar;
        this.e = aigzVar;
        this.f = crnxVar;
        this.g = ffbrVar;
        this.l = tacVar;
        this.i = ssmVar;
        Object e = cybw.c.e();
        e.getClass();
        this.k = ((Boolean) e).booleanValue();
    }

    public static final boolean f(aqkj aqkjVar) {
        String str;
        return (aqkjVar == null || (str = ((cjvk) aqkjVar).g.e) == null || str.length() == 0) ? false : true;
    }

    @Override // defpackage.sry
    public final fgdj a() {
        ekzz f = eleg.f("AddContactBanner2DataServiceImpl#getAddContactBanner2LoadedDataFlow");
        cyco cycoVar = this.d;
        try {
            fgch fgchVar = new fgch(((cycu) cycoVar).c, ((cycu) cycoVar).d, new cycq((cycu) cycoVar, null));
            ffig.a(f, null);
            return ejso.a(ffyo.b(fgchVar, this.j), this.b, new cybq(this));
        } finally {
        }
    }

    @Override // defpackage.sry
    public final boolean b() {
        return this.k;
    }

    public final void c() {
        axol.k(this.b, this.j, new cybs(this, null), 2);
    }

    public final void d() {
        axol.k(this.b, this.j, new cybt(this, null), 2);
    }

    public final void e(ResolvedRecipient resolvedRecipient, ConversationId conversationId) {
        this.l.a(new tad(resolvedRecipient, conversationId, 2, 14));
    }
}
