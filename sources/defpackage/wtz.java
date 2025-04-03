package defpackage;

import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.penpal.PenpalBotConversationId;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wtz extends ffhv implements ffjp {
    /* synthetic */ boolean a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    /* synthetic */ Object d;
    final /* synthetic */ wug e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wtz(wug wugVar, ffgu ffguVar) {
        super(5, ffguVar);
        this.e = wugVar;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, xlw] */
    /* JADX WARN: Type inference failed for: r4v0, types: [aqux, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        boolean z = this.a;
        Object obj2 = this.b;
        final ?? r3 = this.c;
        final ?? r4 = this.d;
        if (!((aspy) this.e.d.b()).a() && z) {
            return null;
        }
        wug wugVar = this.e;
        if (wugVar.c instanceof PenpalBotConversationId) {
            return null;
        }
        String string = wugVar.b.getString(R.string.delete_message_action);
        string.getClass();
        final wug wugVar2 = this.e;
        final aaxe aaxeVar = (aaxe) obj2;
        return new dlsr(string, dmzz.aD, false, false, false, false, null, false, null, new ffix() { // from class: wtx
            @Override // defpackage.ffix
            public final Object invoke() {
                List list = aaxeVar.a;
                boolean z2 = false;
                if (list.size() == 1) {
                    xlw xlwVar = r3;
                    xlv xlvVar = xlwVar instanceof xlv ? (xlv) xlwVar : null;
                    if (xlvVar == null || !xlvVar.t()) {
                        ensk h = wug.a.h();
                        h.Y(ente.a, "Bugle");
                        enrr enrrVar = (enrr) h;
                        enrrVar.Y(csux.c, ((alxr) ffdx.T(list)).b());
                        ((enrr) enrrVar.h("com/google/android/apps/messaging/conversation2/actions/deletemessage/DeleteMessageActionPlugin", "isEligibleForRemoteDelete", 161, "DeleteMessageActionPlugin.kt")).q("Not remotely deletable reason: conversation does not support remote delete");
                    } else {
                        aqux aquxVar = r4;
                        if (aquxVar != null && ((alxr) ffdx.T(list)).s(aquxVar)) {
                            z2 = true;
                        }
                    }
                }
                wug wugVar3 = wug.this;
                wugVar3.e(list, z2, new wty(wugVar3.g));
                return ffcu.a;
            }
        }, 1020);
    }

    @Override // defpackage.ffjp
    public final /* bridge */ /* synthetic */ Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        wtz wtzVar = new wtz(this.e, (ffgu) obj5);
        wtzVar.a = booleanValue;
        wtzVar.b = (aaxe) obj2;
        wtzVar.c = (xlw) obj3;
        wtzVar.d = (aqux) obj4;
        return wtzVar.b(ffcu.a);
    }
}
