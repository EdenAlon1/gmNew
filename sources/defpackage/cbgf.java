package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.Iterator;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbgf {
    public final Context b;
    public final dtuu c;
    public final ejvp d;
    public final ffbr e;
    private final Optional g;
    private final ffbr h;
    private final errl i;
    private final errl j;
    private static final enru f = enru.c("com/google/android/apps/messaging/shared/datamodel/provider/DataChangeNotifier");
    public static final emyl a = cfvl.w("use_blocking_for_ui_observers");

    public cbgf(Context context, dtuu dtuuVar, ejvp ejvpVar, Optional optional, ffbr ffbrVar, ffbr ffbrVar2, errl errlVar, errl errlVar2) {
        this.b = context;
        this.c = dtuuVar;
        this.d = ejvpVar;
        this.g = optional;
        this.e = ffbrVar;
        this.h = ffbrVar2;
        this.i = errlVar;
        this.j = errlVar2;
    }

    public final void a() {
        ekzz f2 = eleg.f("DataChangeNotifier#notifyAllMessagesChanged");
        try {
            this.c.e(bcqc.h(this.b));
            f2.close();
        } catch (Throwable th) {
            try {
                f2.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void b() {
        ekzz f2 = eleg.f("DataChangeNotifier#notifyAllParticipantsChanged");
        try {
            this.c.e(bcqc.i(this.b));
            f2.close();
        } catch (Throwable th) {
            try {
                f2.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void c() {
        ekzz f2 = eleg.f("DataChangeNotifier#notifyConversationListChanged");
        try {
            this.c.e(bcqc.j(this.b));
            this.c.g(new dtut() { // from class: cbgc
                @Override // defpackage.dtut
                public final ekzz a() {
                    emyl emylVar = cbgf.a;
                    return eleg.f("DCN::notifyConversationListChanged::runAfterCommit");
                }
            }, "UpdateUnreadCounterFromConversationList", eldl.l(new Runnable() { // from class: cbgd
                @Override // java.lang.Runnable
                public final void run() {
                    cesz ceszVar = (cesz) cbgf.this.e.b();
                    cesy cesyVar = cesy.a;
                    cetp cetpVar = new cetp();
                    cetpVar.b = "update_unread_counter_dedupe";
                    ((cevh) ceszVar.a.b()).a(ceyr.h("update_unread_counter", cesyVar, cetpVar.a()));
                }
            }));
            f2.close();
        } catch (Throwable th) {
            try {
                f2.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void d(ConversationIdType conversationIdType) {
        ekzz f2 = eleg.f("DataChangeNotifier#notifyConversationMetadataChanged");
        try {
            e(conversationIdType, false);
            f2.close();
        } catch (Throwable th) {
            try {
                f2.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void e(ConversationIdType conversationIdType, boolean z) {
        ekzz f2 = eleg.f("DataChangeNotifier#notifyConversationMetadataChanged");
        try {
            Uri e = bcqc.e(this.b, conversationIdType);
            if (z) {
                Uri.Builder buildUpon = e.buildUpon();
                buildUpon.appendQueryParameter("sendPush", "true");
                e = buildUpon.build();
            }
            this.c.e(e);
            c();
            f2.close();
        } catch (Throwable th) {
            try {
                f2.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void f(fcek fcekVar) {
        ekzz f2 = eleg.f("DataChangeNotifier#notifyDesktopDeleted");
        try {
            Uri.Builder buildUpon = bcqc.k(this.b).buildUpon();
            buildUpon.appendPath(fcekVar.c);
            this.c.e(buildUpon.build());
            f2.close();
        } catch (Throwable th) {
            try {
                f2.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void g() {
        ekzz f2 = eleg.f("DataChangeNotifier#notifyDesktopsChanged");
        try {
            this.c.e(bcqc.l(this.b));
            if (((cgcu) this.h.b()).a()) {
                this.c.g(new dtut() { // from class: cbga
                    @Override // defpackage.dtut
                    public final ekzz a() {
                        emyl emylVar = cbgf.a;
                        return eleg.f("DCN::notifyDesktopsChanged::runAfterCommit");
                    }
                }, "UpdateGaiaDesktopsList", new Runnable() { // from class: cbgb
                    @Override // java.lang.Runnable
                    public final void run() {
                        cbgf.this.d.a(elfo.e(null), bzkl.a);
                    }
                });
            }
            f2.close();
        } catch (Throwable th) {
            try {
                f2.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void h(String str) {
        ekzz f2 = eleg.f("DataChangeNotifier#notifyEverythingChanged");
        try {
            this.c.f(Uri.parse(bcqc.o(this.b)), str);
            this.g.ifPresent(new Consumer() { // from class: cbge
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    emyl emylVar = cbgf.a;
                    ((csll) ((ffbr) obj).b()).i();
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            f2.close();
        } catch (Throwable th) {
            try {
                f2.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void i(ConversationIdType conversationIdType) {
        Uri parse = Uri.parse(bcqc.o(this.b).concat("latest_message_annotations"));
        if (!conversationIdType.b()) {
            parse = bcqc.g(parse.buildUpon(), conversationIdType);
        }
        this.c.e(parse);
    }

    public final void j(final ConversationIdType conversationIdType, final MessageIdType messageIdType) {
        ekzz f2 = eleg.f("DataChangeNotifier#notifyMessagesChangedImmediatelyInBackground");
        try {
            elfl f3 = elfo.f(new Runnable() { // from class: cbfz
                @Override // java.lang.Runnable
                public final void run() {
                    Context context = cbgf.this.b;
                    context.getContentResolver().notifyChange(bcqc.c(context, conversationIdType, messageIdType, new String[0]), null);
                }
            }, ((Boolean) ((cfup) a.get()).e()).booleanValue() ? this.i : this.j);
            f2.b(f3);
            axnw.h(f3);
            f2.close();
        } catch (Throwable th) {
            try {
                f2.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void k(ConversationIdType conversationIdType) {
        ekzz f2 = eleg.f("DataChangeNotifier#notifyMessagesChanged");
        try {
            l(conversationIdType, bdhb.a, new String[0]);
            f2.close();
        } catch (Throwable th) {
            try {
                f2.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void l(ConversationIdType conversationIdType, MessageIdType messageIdType, String... strArr) {
        ekzz f2 = eleg.f("DataChangeNotifier#notifyMessagesChanged");
        try {
            this.c.e(bcqc.c(this.b, conversationIdType, messageIdType, strArr));
            c();
            i(conversationIdType);
            f2.close();
        } catch (Throwable th) {
            try {
                f2.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void m(ConversationIdType conversationIdType, Iterable iterable, String... strArr) {
        ekzz f2 = eleg.f("DataChangeNotifier#notifyMessagesChanged2");
        try {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                this.c.e(bcqc.c(this.b, conversationIdType, (MessageIdType) it.next(), strArr));
            }
            f2.close();
            c();
        } catch (Throwable th) {
            try {
                f2.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void n(ConversationIdType conversationIdType) {
        ekzz f2 = eleg.f("DataChangeNotifier#notifyParticipantsChanged");
        try {
            Uri.Builder buildUpon = bcqc.i(this.b).buildUpon();
            buildUpon.appendPath(conversationIdType.a());
            this.c.e(buildUpon.build());
            f2.close();
        } catch (Throwable th) {
            try {
                f2.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void o(ConversationIdType conversationIdType) {
        ekzz f2 = eleg.f("DataChangeNotifier#notifySuggestionsChanged");
        try {
            this.c.e(bcqc.g(Uri.parse(bcqc.o(this.b).concat("suggestions")).buildUpon(), conversationIdType));
            ensk g = f.g();
            g.Y(ente.a, "Bugle");
            ((enrr) ((enrr) g).h("com/google/android/apps/messaging/shared/datamodel/provider/DataChangeNotifier", "notifySuggestionsChanged", BasePaymentResult.ERROR_REQUEST_TIMEOUT, "DataChangeNotifier.java")).t("DataChangeNotifier.notifySuggestionsChanged conversationId=%s", conversationIdType);
            f2.close();
        } catch (Throwable th) {
            try {
                f2.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
