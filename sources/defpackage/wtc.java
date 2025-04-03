package defpackage;

import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wtc extends ffhv implements ffjn {
    /* synthetic */ Object a;
    /* synthetic */ boolean b;
    final /* synthetic */ wte c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wtc(wte wteVar, ffgu ffguVar) {
        super(3, ffguVar);
        this.c = wteVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        wtc wtcVar = new wtc(this.c, (ffgu) obj3);
        wtcVar.a = (alxj) obj;
        wtcVar.b = booleanValue;
        return wtcVar.b(ffcu.a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [alxj, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ?? r1 = this.a;
        final boolean z = this.b;
        final ConversationId c = r1.c();
        if (r1.u()) {
            return null;
        }
        final wte wteVar = this.c;
        c.getClass();
        String string = wteVar.a.getString(R.string.action_delete);
        string.getClass();
        return new dlsr(string, null, false, true, true, false, null, false, null, new ffix() { // from class: wsw
            @Override // defpackage.ffix
            public final Object invoke() {
                final wte wteVar2 = wte.this;
                if (wteVar2.d.c(wteVar2.a)) {
                    final ConversationId conversationId = c;
                    if (!((aspy) wteVar2.i.b()).a() && z && ((Optional) wteVar2.j.b()).isPresent()) {
                        final cjdk cjdkVar = (cjdk) ((Optional) wteVar2.j.b()).get();
                        ajjc ajjcVar = wteVar2.c;
                        String q = cjdkVar.q();
                        String p = cjdkVar.p();
                        String uri = cjdkVar.d().toString();
                        uri.getClass();
                        List b = ffdx.b(new dltp(uri, ffpc.Q(cjdkVar.p(), cjdkVar.j(), 0, false, 6), ffpc.Q(cjdkVar.p(), cjdkVar.j(), 0, false, 6) + cjdkVar.j().length(), new ffji() { // from class: wsx
                            @Override // defpackage.ffji
                            public final Object invoke(Object obj2) {
                                wteVar2.h.h(new aile(cjdk.this.d()));
                                return true;
                            }
                        }, 24));
                        String string2 = wteVar2.a.getString(R.string.delete_conversation_confirmation_button);
                        string2.getClass();
                        doas doasVar = new doas(string2, new ffix() { // from class: wsy
                            @Override // defpackage.ffix
                            public final Object invoke() {
                                wte wteVar3 = wte.this;
                                ConversationId conversationId2 = conversationId;
                                ekzm b2 = wteVar3.g.b("DeleteConversationActionPlugin: Delete Conversation");
                                try {
                                    wteVar3.c(conversationId2);
                                    ffig.a(b2, null);
                                    return ffcu.a;
                                } finally {
                                }
                            }
                        });
                        String string3 = wteVar2.a.getString(R.string.delete_conversation_decline_button);
                        string3.getClass();
                        ajjcVar.c(new dmve(p, b, null, q, false, false, doasVar, new doas(string3, new ffix() { // from class: wsz
                            @Override // defpackage.ffix
                            public final Object invoke() {
                                return ffcu.a;
                            }
                        }), null, 308), true);
                        return ffcu.a;
                    }
                    ajjc ajjcVar2 = wteVar2.c;
                    String quantityString = wteVar2.a.getResources().getQuantityString(R.plurals.delete_conversations_confirmation_dialog_title, 1, 1);
                    String string4 = wteVar2.a.getString(R.string.delete_message_confirmation_dialog_text);
                    string4.getClass();
                    String string5 = wteVar2.a.getString(R.string.delete_conversation_confirmation_button);
                    string5.getClass();
                    doas doasVar2 = new doas(string5, new ffix() { // from class: wta
                        @Override // defpackage.ffix
                        public final Object invoke() {
                            wte wteVar3 = wte.this;
                            ConversationId conversationId2 = conversationId;
                            ekzm b2 = wteVar3.g.b("DeleteConversationActionPlugin: Delete Conversation");
                            try {
                                wteVar3.c(conversationId2);
                                ffig.a(b2, null);
                                return ffcu.a;
                            } finally {
                            }
                        }
                    });
                    String string6 = wteVar2.a.getString(R.string.delete_conversation_decline_button);
                    string6.getClass();
                    ajjcVar2.c(new dmve(string4, null, null, quantityString, false, false, doasVar2, new doas(string6, new ffix() { // from class: wtb
                        @Override // defpackage.ffix
                        public final Object invoke() {
                            return ffcu.a;
                        }
                    }), null, 310), true);
                } else {
                    wteVar2.f.a();
                }
                return ffcu.a;
            }
        }, 998);
    }
}
