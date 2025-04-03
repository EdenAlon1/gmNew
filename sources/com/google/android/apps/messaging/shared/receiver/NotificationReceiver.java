package com.google.android.apps.messaging.shared.receiver;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.service.notification.StatusBarNotification;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.action.NoConfirmationMessageSendAction;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.receiver.NotificationReceiver;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;
import defpackage.akuv;
import defpackage.akzt;
import defpackage.alrv;
import defpackage.altk;
import defpackage.bbfh;
import defpackage.bdgq;
import defpackage.cevh;
import defpackage.ceyr;
import defpackage.cinj;
import defpackage.cinl;
import defpackage.cipm;
import defpackage.cirn;
import defpackage.ciro;
import defpackage.cirp;
import defpackage.cirs;
import defpackage.cirv;
import defpackage.cirw;
import defpackage.cnfs;
import defpackage.cpeu;
import defpackage.cpev;
import defpackage.csjb;
import defpackage.csjd;
import defpackage.cskc;
import defpackage.ctid;
import defpackage.ecda;
import defpackage.ecri;
import defpackage.efbd;
import defpackage.ekzm;
import defpackage.elbx;
import defpackage.emwl;
import defpackage.endq;
import defpackage.engw;
import defpackage.ensz;
import defpackage.entd;
import defpackage.eoqn;
import defpackage.eydl;
import defpackage.eyfy;
import defpackage.eygr;
import defpackage.ffbr;
import defpackage.kml;
import defpackage.kno;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes8.dex */
public class NotificationReceiver extends cnfs {
    public ffbr c;
    public ffbr d;
    public ffbr e;
    public ffbr f;
    public ffbr g;
    public ffbr h;
    public ffbr i;
    public ffbr j;
    public ffbr k;
    public ffbr l;
    public ffbr m;
    private static final cskc n = cskc.g("Bugle", "NotificationReceiver");
    public static final entd a = entd.c("BugleNotifications");
    public static final ecda b = new ecda("SwipeNotificationTimer");

    @Override // defpackage.cniz
    public final ekzm a() {
        return ((elbx) this.g.b()).b("NotificationReceiver Receive broadcast");
    }

    @Override // defpackage.cniz
    public final String b() {
        return "Bugle.Broadcast.Notification.Latency";
    }

    @Override // defpackage.cniz
    protected final int e() {
        return 18;
    }

    @Override // defpackage.cnhy
    public final String f() {
        return "Bugle.Broadcast.ForegroundService.Notification.Latency";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Type inference failed for: r10v18, types: [comc, java.lang.Object] */
    @Override // defpackage.cnhy
    public final void g(Context context, Intent intent) {
        char c;
        String stringExtra;
        StatusBarNotification a2;
        cskc cskcVar = n;
        csjb c2 = cskcVar.c();
        c2.I("onReceive.");
        c2.A("intent", intent);
        c2.r();
        String action = intent.getAction();
        if (action == null) {
            cskcVar.n("Missing action in intent");
            return;
        }
        switch (action.hashCode()) {
            case -759508139:
                if (action.equals("com.google.android.apps.messaging.notification_reply")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 881519446:
                if (action.equals("com.google.android.apps.messaging.reset_failed_message_notification")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1514506865:
                if (action.equals("com.google.android.apps.messaging.clear_bubble_metadata")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1928082713:
                if (action.equals("com.google.android.apps.messaging.reset_notifications")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            ecri a3 = ((alrv) this.k.b()).a();
            ((ensz) ((ensz) a.h()).h("com/google/android/apps/messaging/shared/receiver/NotificationReceiver", "resetNotifications", 170, "NotificationReceiver.java")).q("User swiped/cleared notification");
            String stringExtra2 = intent.getStringExtra("conversation_id_set");
            if (stringExtra2 == null) {
                cskcVar.p("marking all messages as notified.");
                cirp cirpVar = (cirp) this.c.b();
                cirn cirnVar = (cirn) ciro.a.createBuilder();
                cirnVar.copyOnWrite();
                ciro.b((ciro) cirnVar.instance);
                cirpVar.a((ciro) cirnVar.build());
            } else {
                csjd csjdVar = new csjd(bdgq.d(Arrays.asList(stringExtra2.split("\\|"))));
                cirp cirpVar2 = (cirp) this.c.b();
                cirn cirnVar2 = (cirn) ciro.a.createBuilder();
                Iterable iterable = (Iterable) Collection.EL.stream(csjdVar).map(new Function() { // from class: cngl
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        entd entdVar = NotificationReceiver.a;
                        return ((ConversationIdType) obj).a();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).collect(Collectors.toCollection(new Supplier() { // from class: cngm
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return new ArrayList();
                    }
                }));
                cirnVar2.copyOnWrite();
                ciro ciroVar = (ciro) cirnVar2.instance;
                ciroVar.a();
                eydl.addAll(iterable, ciroVar.b);
                cirnVar2.copyOnWrite();
                ciro.b((ciro) cirnVar2.instance);
                cirpVar2.a((ciro) cirnVar2.build());
                ((akzt) this.e.b()).c("Bugle.Notification.SwipeHorizontallyAway.Count");
                ((altk) this.h.b()).aE(eoqn.INCOMING_MSG_NOTIFICATION, 3, (List) Collection.EL.stream(csjdVar).collect(Collectors.toCollection(new Supplier() { // from class: cngm
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return new ArrayList();
                    }
                })));
            }
            cipm cipmVar = (cipm) this.j.b();
            if (efbd.g()) {
                ((ensz) cipm.a.n().h("com/google/android/apps/messaging/shared/notification/NotificationMetricsEventLogger", "incrementSwipeToDismissCounterOnDisk", 318, "NotificationMetricsEventLogger.java")).q("Unable to increment swipe to dismiss count because main thread");
            } else {
                cipmVar.c.get().m(new emwl() { // from class: cipj
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        eqvd eqvdVar = (eqvd) obj;
                        entd entdVar = cipm.a;
                        eqvc eqvcVar = (eqvc) eqvdVar.toBuilder();
                        int i = eqvdVar.c + 1;
                        eqvcVar.copyOnWrite();
                        eqvd eqvdVar2 = (eqvd) eqvcVar.instance;
                        eqvdVar2.b |= 4;
                        eqvdVar2.c = i;
                        return (eqvd) eqvcVar.build();
                    }
                });
            }
            if (a3 != null) {
                ((alrv) this.k.b()).h(a3, b);
                return;
            }
            return;
        }
        if (c == 1) {
            ((ensz) ((ensz) a.h()).h("com/google/android/apps/messaging/shared/receiver/NotificationReceiver", "replyViaNotification", 229, "NotificationReceiver.java")).q("Reply via notification start");
            ((cpev) this.l.b()).h(cpeu.NOTIFICATION);
            Intent a4 = akuv.c(context, NoConfirmationMessageSendAction.class, "android.intent.action.RESPOND_VIA_MESSAGE").a();
            a4.putExtras(intent);
            a4.setClipData(intent.getClipData());
            ((bbfh) this.f.b()).d(this, a4);
            return;
        }
        if (c != 2) {
            if (c != 3) {
                csjb e = cskcVar.e();
                e.I("Unexpected action");
                e.A(GroupManagementRequest.ACTION_TAG, action);
                e.r();
                return;
            }
            if (ctid.d && (a2 = ((cinl) this.i.b()).a((stringExtra = intent.getStringExtra("notification_tag")), cinj.INCOMING_MESSAGE.G)) != null) {
                kml kmlVar = new kml((Context) this.m.b(), a2.getNotification());
                kmlVar.M = null;
                new kno((Context) this.m.b()).g(stringExtra, cinj.INCOMING_MESSAGE.G, kmlVar.a());
                ((ensz) ((ensz) a.h()).h("com/google/android/apps/messaging/shared/receiver/NotificationReceiver", "clearBubbleMetadata", 165, "NotificationReceiver.java")).t("Clearing bubble metadata for tag: %s", stringExtra);
                return;
            }
            return;
        }
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("failed_messages");
        if (parcelableArrayListExtra == null) {
            cskcVar.r("No failed message info provided");
            return;
        }
        cirw cirwVar = (cirw) this.d.b();
        cirs cirsVar = (cirs) cirv.a.createBuilder();
        Stream map = Collection.EL.stream(parcelableArrayListExtra).map(new Function() { // from class: cngn
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                ContentValues contentValues = (ContentValues) obj;
                ((ensz) ((ensz) NotificationReceiver.a.h()).h("com/google/android/apps/messaging/shared/receiver/NotificationReceiver", "createFailedMessageInfo", 252, "NotificationReceiver.java")).q("Create failed message info");
                ConversationIdType b2 = bdgq.b(contentValues.getAsString("conv_id"));
                MessageIdType b3 = bdhb.b(contentValues.getAsString("message_id"));
                cirt cirtVar = (cirt) ciru.a.createBuilder();
                if (!b2.b()) {
                    String a5 = b2.a();
                    cirtVar.copyOnWrite();
                    ciru ciruVar = (ciru) cirtVar.instance;
                    a5.getClass();
                    ciruVar.b |= 1;
                    ciruVar.c = a5;
                }
                if (!b3.c()) {
                    String b4 = b3.b();
                    cirtVar.copyOnWrite();
                    ciru ciruVar2 = (ciru) cirtVar.instance;
                    b4.getClass();
                    ciruVar2.b |= 2;
                    ciruVar2.d = b4;
                }
                return (ciru) cirtVar.build();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i = engw.d;
        Iterable iterable2 = (Iterable) map.collect(endq.a);
        cirsVar.copyOnWrite();
        cirv cirvVar = (cirv) cirsVar.instance;
        eygr eygrVar = cirvVar.b;
        if (!eygrVar.c()) {
            cirvVar.b = eyfy.mutableCopy(eygrVar);
        }
        eydl.addAll(iterable2, cirvVar.b);
        ((cevh) cirwVar.a.b()).g(ceyr.g("mark_failures_as_notified", (cirv) cirsVar.build()));
    }

    @Override // defpackage.cnhy
    public final boolean i(Intent intent) {
        return true;
    }

    @Override // defpackage.cnhy
    protected final String k(Context context, Intent intent) {
        return context.getString(R.string.updating_notifications_foreground_notification_text);
    }
}
