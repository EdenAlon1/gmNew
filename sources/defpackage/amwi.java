package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.penpal.PenpalBotConversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.penpal.PenpalBotConversationId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amwi implements amev {
    public final amvq a;
    public final ffbr b;
    private final errl c;

    public amwi(errl errlVar, amvq amvqVar, ffbr ffbrVar) {
        this.c = errlVar;
        this.a = amvqVar;
        this.b = ffbrVar;
    }

    @Override // defpackage.alxl
    public final elfl A(ConversationId conversationId, Uri uri) {
        return elfo.d(new UnsupportedOperationException("Icon update not supported for penpal conversation"));
    }

    @Override // defpackage.alxl
    public final elfl B(ConversationId conversationId) {
        return elfo.d(new UnsupportedOperationException("upgradeConversation not supported for penpal bot conversation"));
    }

    @Override // defpackage.alxl
    public final elfl C(ConversationId conversationId, eoko eokoVar) {
        ekzz f = eleg.f("PenpalBotConversationRepository#deleteConversation");
        try {
            emxf.a(conversationId instanceof PenpalBotConversationId);
            elfl C = ((amhs) this.b.b()).C(((PenpalBotConversationId) conversationId).b, eokoVar);
            f.close();
            return C;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.alxl
    public final aqge D(int i) {
        return ((amhs) this.b.b()).D(i);
    }

    @Override // defpackage.alxl
    public final elfl E(engw engwVar, int i) {
        amhs amhsVar = (amhs) this.b.b();
        Stream map = Collection.EL.stream(engwVar).map(new Function() { // from class: amwg
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                ConversationId conversationId = (ConversationId) obj;
                emxf.a(conversationId instanceof PenpalBotConversationId);
                return ((PenpalBotConversationId) conversationId).b;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i2 = engw.d;
        return amhsVar.E((engw) map.collect(endq.a), i);
    }

    @Override // defpackage.alxl
    public final elfl F(engw engwVar, int i) {
        amhs amhsVar = (amhs) this.b.b();
        Stream map = Collection.EL.stream(engwVar).map(new Function() { // from class: amwe
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                ConversationId conversationId = (ConversationId) obj;
                emxf.a(conversationId instanceof PenpalBotConversationId);
                return ((PenpalBotConversationId) conversationId).b;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i2 = engw.d;
        return amhsVar.F((engw) map.collect(endq.a), i);
    }

    @Override // defpackage.amev
    public final ConversationId G(amwl amwlVar) {
        amwk b = amwk.b(amwlVar.b);
        if (b == null) {
            b = amwk.UNRECOGNIZED;
        }
        emxf.a(b == amwk.PENPAL_BOT);
        return PenpalBotConversationId.d(amwlVar.c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [com.google.android.apps.messaging.shared.api.messaging.Conversation, com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation] */
    @Override // defpackage.alxl
    public final Conversation a(ConversationId conversationId, alxk alxkVar) {
        ekzz f = eleg.f("PenpalBotConversationRepository#openConversation");
        try {
            emxf.a(conversationId instanceof PenpalBotConversationId);
            PenpalBotConversation a = this.a.a(((amhs) this.b.b()).a(((PenpalBotConversationId) conversationId).b, alxkVar), (alxl) this.b.b());
            f.close();
            return a;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.alxl
    public final /* synthetic */ ConversationId b(amwl amwlVar) {
        return ameu.a();
    }

    @Override // defpackage.alxl
    public final /* synthetic */ ConversationId c(byte[] bArr) {
        return ameu.b();
    }

    @Override // defpackage.alxl
    public final aqge d(ConversationId conversationId) {
        emxf.a(false);
        return ((amhs) this.b.b()).d(((PenpalBotConversationId) conversationId).b);
    }

    @Override // defpackage.alxl
    public final elfl e(ConversationId conversationId, eoko eokoVar) {
        emxf.a(conversationId instanceof PenpalBotConversationId);
        return ((amhs) this.b.b()).e(((PenpalBotConversationId) conversationId).b, eokoVar);
    }

    @Override // defpackage.alxl
    public final elfl f(ConversationId conversationId) {
        emxf.a(conversationId instanceof PenpalBotConversationId);
        return ((amhs) this.b.b()).f(((PenpalBotConversationId) conversationId).b);
    }

    @Override // defpackage.alxl
    public final elfl g(anvc anvcVar) {
        engw engwVar = anvcVar.a;
        return (engwVar.size() == 1 && ((Recipient) engwVar.get(0)).g().A()) ? ((amhs) this.b.b()).g(anvcVar).h(new emwl() { // from class: amwh
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                Stream map = Collection.EL.stream((engw) obj).map(new Function() { // from class: amwf
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return new PenpalBotConversationId(((BugleConversationId) ((ConversationId) obj2)).a);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                int i = engw.d;
                return (engw) map.collect(endq.a);
            }
        }, this.c) : elfo.d(new IllegalArgumentException("Recipients don't contain exactly penpal bot"));
    }

    @Override // defpackage.alxl
    public final elfl h(azcr azcrVar) {
        return ((amhs) this.b.b()).h(azcrVar).h(new emwl() { // from class: amwd
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ConversationId conversationId = (ConversationId) obj;
                if (conversationId == null) {
                    return null;
                }
                return PenpalBotConversationId.d(conversationId.b());
            }
        }, this.c);
    }

    @Override // defpackage.alxl
    public final elfl i(engw engwVar) {
        return (((enou) engwVar).c == 1 && ((Recipient) engwVar.get(0)).g().A()) ? ((amhs) this.b.b()).i(engwVar).h(new emwl() { // from class: amwa
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return ((Optional) obj).map(new Function() { // from class: amwb
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return new PenpalBotConversationId(((BugleConversationId) ((ConversationId) obj2)).a);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
            }
        }, this.c) : elfo.d(new IllegalArgumentException("Recipients don't contain exactly penpal bot"));
    }

    @Override // defpackage.alxl
    public final elfl j() {
        int i = engw.d;
        return elfo.e(enou.a);
    }

    @Override // defpackage.alxl
    public final elfl k(engw engwVar, String str) {
        return m(Optional.empty(), engwVar, str);
    }

    @Override // defpackage.alxl
    public final elfl l(azcr azcrVar, aqux aquxVar, amer amerVar) {
        return ((amhs) this.b.b()).l(azcrVar, aquxVar, amerVar).h(new emwl() { // from class: amwc
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return PenpalBotConversationId.d(((ConversationId) obj).b());
            }
        }, this.c);
    }

    @Override // defpackage.alxl
    public final elfl m(Optional optional, engw engwVar, String str) {
        return (engwVar.size() == 1 && ((Recipient) engwVar.get(0)).g().A()) ? ((amhs) this.b.b()).m(optional, engwVar, str).h(new emwl() { // from class: amvz
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                amwi amwiVar = amwi.this;
                alxl alxlVar = (alxl) amwiVar.b.b();
                return amwiVar.a.a((BugleConversation) ((Conversation) obj), alxlVar);
            }
        }, this.c) : elfo.d(new IllegalArgumentException("Recipients don't contain exactly penpal bot"));
    }

    @Override // defpackage.alxl
    public final elfl n(ConversationId conversationId, ampp amppVar, Recipient recipient) {
        emxf.a(false);
        return ((amhs) this.b.b()).n(((PenpalBotConversationId) conversationId).b, amppVar, recipient);
    }

    @Override // defpackage.alxl
    public final elfl o(ConversationId conversationId) {
        return elfo.d(new UnsupportedOperationException("Leave not supported for penpal bot conversation"));
    }

    @Override // defpackage.alxl
    public final elfl p(engw engwVar) {
        return elfo.d(new UnsupportedOperationException("Leave not supported for penpal bot conversation"));
    }

    @Override // defpackage.alxl
    public final elfl q(ConversationId conversationId, ampp amppVar) {
        emxf.a(conversationId instanceof PenpalBotConversationId);
        return ((amhs) this.b.b()).q(((PenpalBotConversationId) conversationId).b, amppVar);
    }

    @Override // defpackage.alxl
    public final elfl r(Recipient recipient) {
        return elfo.d(new UnsupportedOperationException("refreshAllConversationIconsForRecipient not supported for penpal bot conversation"));
    }

    @Override // defpackage.alxl
    public final elfl s(ConversationId conversationId, String str) {
        return elfo.d(new UnsupportedOperationException("Rename not supported for penpal conversation"));
    }

    @Override // defpackage.alxl
    public final elfl t(ConversationId conversationId, aqux aquxVar) {
        ekzz f = eleg.f("PenpalBotConversationRepository#setActiveSelfIdentity");
        try {
            emxf.a(conversationId instanceof PenpalBotConversationId);
            elfl t = ((amhs) this.b.b()).t(((PenpalBotConversationId) conversationId).b, aquxVar);
            f.close();
            return t;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.alxl
    public final elfl u(ConversationId conversationId, String str, String str2, apmq apmqVar) {
        emxf.a(conversationId instanceof PenpalBotConversationId);
        return ((amhs) this.b.b()).u(((PenpalBotConversationId) conversationId).b, str, str2, apmqVar);
    }

    @Override // defpackage.alxl
    public final elfl v(ConversationId conversationId, String str, Uri uri) {
        emxf.a(conversationId instanceof PenpalBotConversationId);
        return ((amhs) this.b.b()).v(((PenpalBotConversationId) conversationId).b, str, uri);
    }

    @Override // defpackage.alxl
    public final elfl w(ConversationId conversationId, amny amnyVar) {
        return elfo.d(new UnsupportedOperationException("setParentalApprovalStatusLocally not supported for penpal bot conversation"));
    }

    @Override // defpackage.alxl
    public final elfl x(ConversationId conversationId, cuea cueaVar) {
        return ((amhs) this.b.b()).x(conversationId, cueaVar);
    }

    @Override // defpackage.alxl
    public final elfl y(ConversationId conversationId, eoko eokoVar) {
        emxf.a(conversationId instanceof PenpalBotConversationId);
        return ((amhs) this.b.b()).y(((PenpalBotConversationId) conversationId).b, eokoVar);
    }

    @Override // defpackage.alxl
    public final elfl z(ConversationId conversationId, cuex cuexVar, String str, boolean z, cuea cueaVar) {
        return ((amhs) this.b.b()).z(conversationId, cuexVar, str, false, cueaVar);
    }
}
