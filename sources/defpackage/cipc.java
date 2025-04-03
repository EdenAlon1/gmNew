package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.InvalidConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.receiver.NotificationReceiver;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cipc extends cims implements ciow {
    public static final /* synthetic */ int c = 0;
    private static final entd d = entd.c("BugleNotifications");
    ConversationId b;
    private final Context e;
    private final bcsq f;
    private final cins g;
    private final ffbr h;
    private final ffbr i;
    private final akzt j;
    private final cqoh k;
    private final ayfg l;
    private final cipe m;
    private final ames n;
    private final ffbr o;
    private final atky r;
    private int s;
    private csjd t;
    private final ArrayList u;
    private String v;
    private String w;
    private boolean x;
    private int y;
    private int z;

    public cipc(Context context, cine cineVar, ffbr ffbrVar, ffbr ffbrVar2, akzt akztVar, cqoh cqohVar, ayfg ayfgVar, cipe cipeVar, bcsq bcsqVar, cins cinsVar, ames amesVar, ffbr ffbrVar3, atky atkyVar) {
        super(cineVar.a(cinj.MESSAGE_FAILURE));
        this.y = 1;
        this.t = new csjd();
        this.u = new ArrayList();
        this.b = InvalidConversationId.a;
        this.e = context;
        this.h = ffbrVar2;
        this.i = ffbrVar;
        this.j = akztVar;
        this.k = cqohVar;
        this.f = bcsqVar;
        this.g = cinsVar;
        this.l = ayfgVar;
        this.m = cipeVar;
        this.n = amesVar;
        this.o = ffbrVar3;
        this.r = atkyVar;
    }

    private final void f() {
        int size = this.u.size();
        if (size > 0 || this.s > 0) {
            ensz enszVar = (ensz) d.h();
            enszVar.Y(cird.a, Integer.valueOf(size));
            enszVar.Y(cird.b, Integer.valueOf(this.s));
            ((ensz) enszVar.h("com/google/android/apps/messaging/shared/notification/MessageFailureNotificationImpl", "logFailedMessageCounts", 589, "MessageFailureNotificationImpl.java")).q("Found failed messages.");
        }
    }

    private static int g(int i) {
        if (((Boolean) a.e()).booleanValue() && i == 17) {
            return 3;
        }
        return (i == 106 || i == 107 || i == 111 || i == 112) ? 2 : 1;
    }

    @Override // defpackage.cims, defpackage.cink
    public final Notification b() {
        PendingIntent b;
        ephv ephvVar;
        ciox c2 = ciox.c(this.e.getResources(), this.w, this.v, this.t.size(), this.s, this.y);
        csjd csjdVar = this.t;
        if (csjdVar.size() == 1) {
            bseh r = ((bczy) this.o.b()).r(csjdVar.a());
            ConversationId a = this.n.a(csjdVar.a(), r == null ? null : r.aa(), this.x);
            this.b = a;
            b = this.l.p(this.e, a, this.x);
        } else {
            b = this.l.b(this.e);
        }
        kml kmlVar = new kml(this.e, o());
        cimx cimxVar = (cimx) c2;
        kmlVar.i(cimxVar.a);
        kmlVar.w(cimxVar.a);
        kmlVar.h(cimxVar.b);
        kmlVar.y(this.k.f().toEpochMilli());
        kmlVar.r(R.drawable.notification_icon);
        kmlVar.g = b;
        kmlVar.t(csuu.g(this.e, "raw", "message_failure"));
        kmlVar.l = 4;
        if (((Boolean) cnnd.a.e()).booleanValue()) {
            cipe cipeVar = this.m;
            int i = this.y;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            if (i2 == 0) {
                ephvVar = ephv.MESSAGE_SENDING_FAILURE;
            } else if (i2 == 1) {
                ephvVar = ephv.MESSAGE_DOWNLOAD_FAILURE;
            } else {
                if (i2 != 2) {
                    throw new AssertionError("Unexpected failure type: ".concat(ciov.a(i)));
                }
                ephvVar = ephv.MESSAGE_DELIVERY_FAILURE_RECIPIENT_LOST_RCS;
            }
            kmlVar.e(cipeVar.a(ephvVar));
        }
        Context context = this.e;
        akuv c3 = akuv.c(context, NotificationReceiver.class, "android.intent.action.VIEW");
        c3.f(context.getPackageName());
        Intent a2 = c3.a();
        a2.setAction("com.google.android.apps.messaging.reset_failed_message_notification");
        a2.putParcelableArrayListExtra("failed_messages", (ArrayList) Collection.EL.stream(this.u).map(new Function() { // from class: cipa
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                ciou ciouVar = (ciou) obj;
                int i3 = cipc.c;
                ContentValues contentValues = new ContentValues();
                contentValues.put("conv_id", ciouVar.b().toString());
                contentValues.put("message_id", ciouVar.c().b());
                return contentValues;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.toCollection(new Supplier() { // from class: cipb
            @Override // java.util.function.Supplier
            public final Object get() {
                return new ArrayList();
            }
        })));
        PendingIntent d2 = eepf.d(this.e, 1, a2, ctie.a(VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS));
        d2.getClass();
        kmlVar.k(d2);
        return kmlVar.a();
    }

    @Override // defpackage.ciow
    public final void e(boolean z) {
        Throwable th;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        String str = z ? "null_debug" : null;
        if (z) {
            i4 = this.z;
            th = null;
            i = 0;
            i2 = 3;
            i3 = 2;
        } else {
            th = null;
            i = 0;
            int i6 = -1;
            if (this.r.a()) {
                carb carbVar = (carb) this.i.b();
                enin eninVar = new enin();
                i2 = 3;
                i3 = 2;
                eninVar.i(8, 18, 19, 106, 112, 21);
                if (((Boolean) ciow.a.e()).booleanValue()) {
                    eninVar.c(17);
                }
                final enip g = eninVar.g();
                buxo d2 = MessagesTable.d();
                d2.z("buildMessageFailuresQuery");
                buum buumVar = MessagesTable.c;
                d2.c(buumVar.a, buumVar.b, buumVar.x, buumVar.k, buumVar.j, buumVar.w);
                bsob e = bsom.e();
                e.c(bsom.c.R);
                d2.F(dtvz.i(e.b(), bsom.c.a, MessagesTable.c.b));
                d2.h(new Function() { // from class: cioz
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        buxz buxzVar = (buxz) obj;
                        int i7 = cipc.c;
                        buxzVar.ai(enip.this);
                        buxzVar.F();
                        return buxzVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                d2.d(new buxl(MessagesTable.c.g, true));
                buuo buuoVar = (buuo) d2.b().o();
                try {
                    buuoVar.moveToPosition(-1);
                    while (buuoVar.moveToNext()) {
                        ConversationIdType p = buuoVar.p();
                        MessageIdType q = buuoVar.q();
                        int e2 = buuoVar.e();
                        int g2 = g(buuoVar.i());
                        this.u.add(new cimy(p, q, e2, g2));
                        if (!carbVar.g(p)) {
                            i6 = buuoVar.getPosition();
                            this.s++;
                            this.t.add(p);
                            bseh bsehVar = (bseh) ((MessagesTable.BindData) buuoVar.cO()).av("conversations", bseh.class);
                            bsehVar.getClass();
                            this.x = bsehVar.am();
                            this.y = g2;
                        }
                    }
                    f();
                    if (this.s == 0) {
                        buuoVar.close();
                        i4 = 1;
                    } else {
                        buuoVar.moveToPosition(i6);
                        buuoVar.c();
                        this.w = buuoVar.F();
                        bcyk a = ((azwh) this.h.b()).a(buuoVar.p());
                        this.v = a != null ? a.t() : "";
                        buuoVar.close();
                        i4 = i3;
                    }
                } finally {
                }
            } else {
                i2 = 3;
                i3 = 2;
                carb carbVar2 = (carb) this.i.b();
                bcsq bcsqVar = this.f;
                final ArrayList c2 = enkr.c(8, 18, 19, 106, 112);
                if (((Boolean) ciow.a.e()).booleanValue()) {
                    c2.add(17);
                }
                c2.add(21);
                bjji a2 = bcsqVar.a.a();
                a2.d(new Function() { // from class: bcsp
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bjjb bjjbVar = (bjjb) obj;
                        return new bjjc[]{bjjbVar.a, bjjbVar.b, bjjbVar.e, bjjbVar.h, bjjbVar.f, bjjbVar.i, bjjbVar.l};
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                a2.f(new Function() { // from class: bcsh
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bjjm bjjmVar = (bjjm) obj;
                        bjjmVar.f(c2);
                        bjjmVar.aq(new dtwe("messages.seen", 1, 0));
                        return bjjmVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                a2.v(bjjn.c.a);
                a2.c(new bjjf(bjjn.c.c, true));
                bjjd bjjdVar = (bjjd) a2.b().o();
                try {
                    bjjdVar.moveToPosition(-1);
                    while (bjjdVar.moveToNext()) {
                        ConversationIdType i7 = bjjdVar.i();
                        MessageIdType j = bjjdVar.j();
                        int d3 = bjjdVar.d();
                        int g3 = g(bjjdVar.e());
                        this.u.add(new cimy(i7, j, d3, g3));
                        if (!carbVar2.g(i7)) {
                            i6 = bjjdVar.getPosition();
                            this.s++;
                            this.t.add(i7);
                            this.x = bjjdVar.s();
                            this.y = g3;
                        }
                    }
                    f();
                    if (this.s == 0) {
                        i4 = 1;
                    } else {
                        bjjdVar.moveToPosition(i6);
                        bjjdVar.c();
                        this.w = bjjdVar.o();
                        bcyk a3 = ((azwh) this.h.b()).a(bjjdVar.i());
                        this.v = a3 != null ? a3.t() : "";
                        i4 = i3;
                    }
                } finally {
                    bjjdVar.close();
                }
            }
        }
        int i8 = i4 - 1;
        if (i4 == 0) {
            throw th;
        }
        if (i8 != 0) {
            if (i8 == 1) {
                this.g.I(this);
                int i9 = this.y;
                if (i9 == 0) {
                    throw th;
                }
                if (i9 == 1) {
                    this.j.e("Bugle.Connectivity.ZeroConnectivity.Timeout.Notification.Sent", this.s);
                } else if (i9 == i3) {
                    this.j.e("Bugle.Notification.Mms.DownloadFailure.Count", csjc.a.x);
                }
            }
        } else if (str != null) {
            this.g.k(str, c());
        } else {
            this.g.j(c());
        }
        ArrayList arrayList = this.u;
        int size = arrayList.size();
        int i10 = i;
        while (i10 < size) {
            ciou ciouVar = (ciou) arrayList.get(i10);
            if (ciouVar.d() == 1) {
                this.j.c(ciouVar.a() == 10004 ? "Bugle.Message.Fallback.Send.Timeout.Notification.Count" : "Bugle.Message.Fallback.Send.Failed.Notification.Count");
                i5 = i2;
            } else {
                i5 = i2;
                if (ciouVar.d() == i5) {
                    this.j.c("Bugle.Rcs.Delivery.Failure.Notification.Count");
                }
            }
            i10++;
            i2 = i5;
        }
    }

    @Override // defpackage.cipz
    public final void m() {
        e(false);
    }

    public cipc(Context context, cine cineVar, ffbr ffbrVar, ffbr ffbrVar2, akzt akztVar, cqoh cqohVar, ayfg ayfgVar, cipe cipeVar, bcsq bcsqVar, cins cinsVar, int i, int i2, int i3, ArrayList arrayList, csjd csjdVar, ames amesVar, ffbr ffbrVar3, atky atkyVar) {
        super(cineVar.a(cinj.MESSAGE_FAILURE));
        this.y = 1;
        this.t = new csjd();
        new ArrayList();
        this.b = InvalidConversationId.a;
        this.e = context;
        this.h = ffbrVar2;
        this.i = ffbrVar;
        this.j = akztVar;
        this.k = cqohVar;
        this.f = bcsqVar;
        this.g = cinsVar;
        this.l = ayfgVar;
        this.m = cipeVar;
        this.z = i;
        this.y = i2;
        this.s = i3;
        this.u = arrayList;
        this.t = csjdVar;
        this.v = "My Conversation Name";
        this.w = "My MMS Failure Text";
        this.n = amesVar;
        this.o = ffbrVar3;
        this.r = atkyVar;
    }
}
