package defpackage;

import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wrz extends ffhv implements ffjn {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    final /* synthetic */ wsa c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wrz(wsa wsaVar, ffgu ffguVar) {
        super(3, ffguVar);
        this.c = wsaVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        wrz wrzVar = new wrz(this.c, (ffgu) obj3);
        wrzVar.a = (engw) obj;
        wrzVar.b = (alxj) obj2;
        return wrzVar.b(ffcu.a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [alxj, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        aoku g;
        ffci.b(obj);
        ?? r1 = this.a;
        final ?? r5 = this.b;
        final ResolvedRecipient resolvedRecipient = r5.b() == alxi.GROUP ? null : (ResolvedRecipient) ffdx.M(r1);
        int i = r5.b() == alxi.GROUP ? 3 : r5.b() == alxi.RBM ? 4 : (resolvedRecipient == null || !resolvedRecipient.z()) ? 1 : 2;
        if (((Boolean) ((cfup) ctjd.ak.get()).e()).booleanValue() && resolvedRecipient != null && (g = resolvedRecipient.g()) != null && g.A()) {
            return null;
        }
        boolean z = i != 3 ? !(resolvedRecipient == null || (resolvedRecipient.z() && resolvedRecipient.H().d())) : !r5.g().g();
        String string = (i == 2 || i == 3) ? this.c.b.getString(R.string.report_spam_action_title) : (resolvedRecipient == null || !resolvedRecipient.H().d()) ? this.c.b.getString(R.string.block_and_report_spam) : this.c.b.getString(R.string.block_action_title);
        string.getClass();
        dmzz dmzzVar = (i == 2 || i == 3) ? dmzz.db : dmzz.D;
        final wsa wsaVar = this.c;
        final int i2 = i;
        final boolean z2 = z;
        return new dlsr(string, dmzzVar, false, true, z, false, null, false, null, new ffix() { // from class: wry
            @Override // defpackage.ffix
            public final Object invoke() {
                cfup cfupVar = cubs.a;
                if (cubs.i().booleanValue() && !z2) {
                    ensk j = wsa.a.j();
                    j.Y(ente.a, "BugleSpam");
                    ((enrr) j.h("com/google/android/apps/messaging/conversation2/actions/blockandreportspam/BlockAndReportSpamActionPlugin$actionFlow$1", "invokeSuspend$lambda$0", 99, "BlockAndReportSpamActionPlugin.kt")).q("BlockAndReportSpamActionPlugin: plugin invoked when invisible.");
                    return ffcu.a;
                }
                ResolvedRecipient resolvedRecipient2 = resolvedRecipient;
                int i3 = i2;
                ConversationId c = r5.c();
                c.getClass();
                if (i3 == 3) {
                    if (resolvedRecipient2 != null) {
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                    resolvedRecipient2 = null;
                } else if (resolvedRecipient2 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                wsa wsaVar2 = wsaVar;
                wsaVar2.e.a(new tad(resolvedRecipient2, c, i3, wsaVar2.f));
                return ffcu.a;
            }
        }, 996);
    }
}
