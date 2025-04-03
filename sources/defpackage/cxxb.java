package defpackage;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.rbm.RbmConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
class cxxb implements ejwd<Conversation> {
    final /* synthetic */ cxwp a;

    public cxxb(cxwp cxwpVar) {
        this.a = cxwpVar;
    }

    @Override // defpackage.ejwd
    public final void a(Throwable th) {
        ((ddzb) this.a.H().b.b()).k(R.string.conversation_creation_failure);
    }

    @Override // defpackage.ejwd
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        cxxc H = this.a.H();
        ConversationId d = ((Conversation) obj).d();
        Intent intent = this.a.fe().getIntent();
        Optional a = ((czoi) H.n.b()).a(intent);
        if (a.isPresent()) {
            Object obj2 = a.get();
            final ConversationIdType a2 = ((askf) H.m.b()).a() ? amic.a(d) : d instanceof RbmConversationId ? ((RbmConversationId) d).a : ((BugleConversationId) d).a;
            final avjf avjfVar = (avjf) H.c.b();
            final String str = (String) obj2;
            elfo.f(new Runnable() { // from class: avje
                @Override // java.lang.Runnable
                public final void run() {
                    String str2 = str;
                    ConversationIdType conversationIdType = a2;
                    avjf avjfVar2 = avjf.this;
                    try {
                        String[] strArr = bqfx.a;
                        bqer bqerVar = new bqer();
                        bqerVar.c(conversationIdType);
                        bqerVar.b(aven.CREATED);
                        final bqeo a3 = bqerVar.a();
                        final dtve b = bqfx.b();
                        long b2 = dtub.b(bqfx.b(), "business_conversations_metadata", a3, new Function() { // from class: bqej
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj3) {
                                return Long.valueOf(dtve.this.T("business_conversations_metadata", (ContentValues) obj3, 4));
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }, new Consumer() { // from class: bqek
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void o(Object obj3) {
                                Long l = (Long) obj3;
                                if (l.longValue() >= 0) {
                                    bqeo bqeoVar = bqeo.this;
                                    bqeoVar.a = new bqei(l).a.longValue();
                                    bqeoVar.fY(0);
                                }
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        });
                        Long.valueOf(b2).getClass();
                        if (b2 != -1) {
                            avjfVar2.k(4, str2);
                        }
                    } catch (SQLiteException unused) {
                        csjb e = avjf.a.e();
                        e.I("Conversation was deleted before business metadata could be created");
                        e.c(conversationIdType);
                        e.r();
                    }
                }
            }, avjfVar.c).k(axnw.b(), erpp.a);
            Uri data = intent.getData();
            if (!a2.b() && data != null) {
                cery ceryVar = (cery) H.e.b();
                cerw cerwVar = (cerw) cerx.a.createBuilder();
                String a3 = a2.a();
                cerwVar.copyOnWrite();
                cerx cerxVar = (cerx) cerwVar.instance;
                a3.getClass();
                cerxVar.c = a3;
                cerwVar.copyOnWrite();
                ((cerx) cerwVar.instance).d = str;
                String uri = czoh.a(data).toString();
                cerwVar.copyOnWrite();
                cerx cerxVar2 = (cerx) cerwVar.instance;
                uri.getClass();
                cerxVar2.b = uri;
                ((cevh) ceryVar.a.b()).g(ceyr.g("rbm_chatbot_directory_welcome_message", (cerx) cerwVar.build()));
            } else if (a2.b()) {
                ensk j = cxxc.a.j();
                j.Y(ente.a, "Bugle");
                ((enrr) ((enrr) j).h("com/google/android/apps/messaging/ui/conversation/LaunchConversationFragmentPeer", "processWelcomeMessage", 457, "LaunchConversationFragmentPeer.java")).q("Conversation has not been created: id is null.");
            } else {
                ensk j2 = cxxc.a.j();
                j2.Y(ente.a, "Bugle");
                ((enrr) ((enrr) j2).h("com/google/android/apps/messaging/ui/conversation/LaunchConversationFragmentPeer", "processWelcomeMessage", 459, "LaunchConversationFragmentPeer.java")).q("Data URI is absent.");
            }
            cers cersVar = (cers) H.d.b();
            cero ceroVar = (cero) cerr.a.createBuilder();
            ceroVar.copyOnWrite();
            ((cerr) ceroVar.instance).b = str;
            ceroVar.copyOnWrite();
            ((cerr) ceroVar.instance).d = cerq.a(3);
            ceroVar.copyOnWrite();
            ((cerr) ceroVar.instance).c = cerp.a(3);
            cerr cerrVar = (cerr) ceroVar.build();
            cetp cetpVar = new cetp();
            cetpVar.a = str;
            cetpVar.b = str;
            cersVar.b(cerrVar, cetpVar.a());
        }
        H.a(d, a.isPresent(), null);
    }

    @Override // defpackage.ejwd
    public final void hB() {
    }
}
