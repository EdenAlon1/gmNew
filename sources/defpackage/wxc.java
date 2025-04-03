package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wxc extends ffhv implements ffjn {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    final /* synthetic */ wxd c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wxc(wxd wxdVar, ffgu ffguVar) {
        super(3, ffguVar);
        this.c = wxdVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        wxc wxcVar = new wxc(this.c, (ffgu) obj3);
        wxcVar.a = (engw) obj;
        wxcVar.b = (alxj) obj2;
        return wxcVar.b(ffcu.a);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [alxj, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        Context context = this.c.a;
        Object obj2 = this.a;
        final ?? r3 = this.b;
        String string = context.getString(R.string.notifications);
        string.getClass();
        dmzz dmzzVar = dmzz.cv;
        final wxd wxdVar = this.c;
        final engw engwVar = (engw) obj2;
        return new dlsr(string, dmzzVar, false, false, false, false, null, false, null, new ffix() { // from class: wxb
            @Override // defpackage.ffix
            public final Object invoke() {
                alxj alxjVar = r3;
                ConversationId c = alxjVar.c();
                String i = alxjVar.i();
                i.getClass();
                byyt g = alxjVar.g();
                c.getClass();
                ResolvedRecipient resolvedRecipient = alxjVar.b() != alxi.GROUP ? (ResolvedRecipient) ffdx.K(engwVar) : null;
                wxd.this.b.h(new ails(c, i, resolvedRecipient, g));
                return ffcu.a;
            }
        }, 996);
    }
}
