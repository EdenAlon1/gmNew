package defpackage;

import android.R;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.TaskStackBuilder;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import android.util.Size;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.InvalidConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.notification.receiver.DismissNotificationReceiver;
import com.google.android.apps.messaging.ui.gaia.verification.GaiaPairingVerificationActivity;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ciog implements cins {
    public static final entd a = entd.c("BugleNotifications");
    public final Context b;
    public final ffbr c;
    public final ffbr d;
    Notification e = null;
    private final fazb f;
    private final ffbr g;
    private final ffbr h;
    private final ffbr i;
    private final ffbr j;
    private final errl k;
    private final ffbr l;
    private final emyl m;
    private final ffbr n;
    private final ffbr o;
    private final ffbr p;
    private final ffbr q;
    private final Optional r;
    private final Optional s;
    private final ffbr t;
    private final emyl u;
    private final fazb v;

    public ciog(final Context context, fazb fazbVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9, errl errlVar, ffbr ffbrVar10, ffbr ffbrVar11, Optional optional, Optional optional2, ffbr ffbrVar12, fazb fazbVar2) {
        this.b = context;
        this.f = fazbVar;
        this.g = ffbrVar;
        this.h = ffbrVar2;
        this.i = ffbrVar3;
        this.j = ffbrVar4;
        this.k = errlVar;
        this.c = ffbrVar10;
        this.l = ffbrVar11;
        this.t = ffbrVar12;
        this.u = new emyl() { // from class: ciob
            @Override // defpackage.emyl
            public final Object get() {
                entd entdVar = ciog.a;
                NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                rkf.f(notificationManager);
                return notificationManager;
            }
        };
        this.n = ffbrVar5;
        this.o = ffbrVar6;
        this.p = ffbrVar7;
        this.q = ffbrVar8;
        this.d = ffbrVar9;
        this.r = optional;
        this.s = optional2;
        this.v = fazbVar2;
        this.m = new emyl() { // from class: cioc
            @Override // defpackage.emyl
            public final Object get() {
                entd entdVar = ciog.a;
                Resources resources = context.getResources();
                int dimension = (int) resources.getDimension(R.dimen.notification_large_icon_height);
                return new cimw(new Size(720, 720), new Size((int) resources.getDimension(R.dimen.notification_large_icon_width), dimension));
            }
        };
    }

    private final elfl ac(final ephv ephvVar, final cink cinkVar, final long j) {
        final cnnc cnncVar = (cnnc) this.c.b();
        return (j < 0 ? elfo.d(new IllegalArgumentException("backoffTimeMs cannot be negative.")) : cnnc.a.b().i(new eroh() { // from class: cnna
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final long longValue = ((Long) obj).longValue();
                final cnnc cnncVar2 = cnnc.this;
                return elfl.g(cnncVar2.c.a.a()).h(new emwl() { // from class: cnmt
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        return Long.valueOf(((cnmr) obj2).d);
                    }
                }, erpp.a).h(new emwl() { // from class: cnmz
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        return Boolean.valueOf(cnnc.this.a((Long) obj2, longValue));
                    }
                }, cnncVar2.d);
            }
        }, cnncVar.d).i(new eroh() { // from class: cnnb
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                if (!((Boolean) obj).booleanValue()) {
                    return elfo.e(false);
                }
                final long j2 = j;
                ephv ephvVar2 = ephvVar;
                final cnnc cnncVar2 = cnnc.this;
                final String name = ephvVar2.name();
                return elfl.g(cnncVar2.c.a.a()).h(new emwl() { // from class: cnms
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        String str = name;
                        str.getClass();
                        eyhm eyhmVar = ((cnmr) obj2).c;
                        return Long.valueOf(eyhmVar.containsKey(str) ? ((Long) eyhmVar.get(str)).longValue() : 0L);
                    }
                }, erpp.a).h(new emwl() { // from class: cnmy
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        return Boolean.valueOf(cnnc.this.a((Long) obj2, j2));
                    }
                }, cnncVar2.d);
            }
        }, cnncVar.d)).i(new eroh() { // from class: ciny
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                ciog ciogVar = ciog.this;
                ephv ephvVar2 = ephvVar;
                Boolean bool = (Boolean) obj;
                if (bool == null || !bool.booleanValue()) {
                    ciogVar.ab(7, ephvVar2);
                    return elfo.e(null);
                }
                ciogVar.W(ephvVar2, cinkVar);
                cnnc cnncVar2 = (cnnc) ciogVar.c.b();
                cnmv cnmvVar = cnncVar2.c;
                final String name = ephvVar2.name();
                final long epochMilli = cnncVar2.b.f().toEpochMilli();
                return elfl.g(cnmvVar.a.b(new emwl() { // from class: cnmu
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        cnmp cnmpVar = (cnmp) ((cnmr) obj2).toBuilder();
                        String str = name;
                        str.getClass();
                        cnmpVar.copyOnWrite();
                        cnmr cnmrVar = (cnmr) cnmpVar.instance;
                        eyhm eyhmVar = cnmrVar.c;
                        if (!eyhmVar.b) {
                            cnmrVar.c = eyhmVar.a();
                        }
                        long j2 = epochMilli;
                        cnmrVar.c.put(str, Long.valueOf(j2));
                        cnmpVar.copyOnWrite();
                        cnmr cnmrVar2 = (cnmr) cnmpVar.instance;
                        cnmrVar2.b |= 1;
                        cnmrVar2.d = j2;
                        return (cnmr) cnmpVar.build();
                    }
                }, erpp.a));
            }
        }, this.k);
    }

    @Override // defpackage.cins
    public final void A(final int i, final String str) {
        final ciqi ciqiVar = (ciqi) ((cinq) this.j.b()).a.b();
        aa(ciqiVar.b.a(new ciql() { // from class: ciqh
            @Override // defpackage.ciql
            public final Notification a(String str2) {
                ciqi ciqiVar2 = ciqi.this;
                Optional a2 = ciqiVar2.c.a(ciqiVar2.a, i, str);
                if (a2.isEmpty()) {
                    return null;
                }
                Resources resources = ciqiVar2.a.getResources();
                String string = resources.getString(com.google.android.apps.messaging.R.string.sim_storage_full_text);
                kml kmlVar = new kml(ciqiVar2.a, str2);
                kmlVar.i(resources.getString(com.google.android.apps.messaging.R.string.sim_storage_full_title));
                kmlVar.h(string);
                kmlVar.r(com.google.android.apps.messaging.R.drawable.ic_warning_light);
                kme kmeVar = new kme(kmlVar);
                kmeVar.e(string);
                kmlVar.u(kmeVar);
                kmlVar.g = (PendingIntent) a2.get();
                return kmlVar.a();
            }
        }, cinj.SIM_STORAGE_FULL));
    }

    @Override // defpackage.cins
    public final void B() {
        aa(((cinq) this.j.b()).g(this));
    }

    @Override // defpackage.cins
    public final void C() {
        if (K()) {
            ((cioy) ((cinq) this.j.b()).d.b()).a(this).m();
        } else {
            ((ensz) a.o().h("com/google/android/apps/messaging/shared/notification/BugleNotificationManagerImpl", "refreshMessageFailureNotification", 171, "BugleNotificationManagerImpl.java")).q("Notifications disabled, won't refresh message failure.");
        }
    }

    @Override // defpackage.cins
    public final void D(engw engwVar) {
        if (!K()) {
            ((ensz) a.o().h("com/google/android/apps/messaging/shared/notification/BugleNotificationManagerImpl", "refreshRcsNotDeliveredNotification", BasePaymentResult.ERROR_REQUEST_TIMEOUT, "BugleNotificationManagerImpl.java")).q("Notifications disabled, cannot refresh the RCS not delivered notification.");
            return;
        }
        cipu e = ((cinq) this.j.b()).e(this);
        int size = engwVar.size();
        e.j = size;
        if (size == 0) {
            if (e.a.H(e)) {
                e.c.c("Bugle.Notification.RcsNotDelivered.AutoDismissed.Count");
            }
            e.a.k("rcs_not_delivered_notification_tag", e.c());
            return;
        }
        final engw engwVar2 = (engw) Collection.EL.stream(engwVar).map(new Function() { // from class: cipq
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                int i = cipu.l;
                return ((bted) obj).l();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(endq.a);
        buxo d = MessagesTable.d();
        d.z("+RcsNotDeliveredNotification#refresh");
        d.h(new Function() { // from class: cipr
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                buxz buxzVar = (buxz) obj;
                int i = cipu.l;
                buxzVar.u(engw.this);
                return buxzVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        enip enipVar = (enip) Collection.EL.stream(d.b().f()).collect(endq.b);
        int size2 = enipVar.size();
        e.i = size2;
        if (size2 == 1) {
            e.g = (ConversationIdType) Collection.EL.stream(enipVar).iterator2().next();
            bseh r = ((bczy) e.b.b()).r(e.g);
            r.getClass();
            e.f = Optional.ofNullable(r.X());
            e.k = r.am();
            e.h = ((ames) e.e.b()).a(e.g, r.aa(), e.k);
        }
        if (Collection.EL.stream(engwVar).anyMatch(new Predicate() { // from class: cips
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo439negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                int i = cipu.l;
                return !((bted) obj).q();
            }
        })) {
            if (e.a.H(e)) {
                e.a.O(e);
            } else if (e.a.I(e)) {
                e.c.c("Bugle.Notification.RcsNotDelivered.Posted.Count");
                e.d.d(3);
            }
        }
    }

    @Override // defpackage.cins
    public final void E(final engw engwVar) {
        if (!K()) {
            ((ensz) a.o().h("com/google/android/apps/messaging/shared/notification/BugleNotificationManagerImpl", "refreshRcsStillSendingNotification", 230, "BugleNotificationManagerImpl.java")).q("Notifications disabled, cannot refresh the RCS still sending notification.");
            return;
        }
        cipx f = ((cinq) this.j.b()).f(this);
        int size = engwVar.size();
        f.k = size;
        if (size == 0) {
            if (f.b.H(f)) {
                f.d.c("Bugle.Notification.RcsStillSending.AutoDismissed.Count");
            }
            f.b.k("rcs_still_sending_notification_tag", f.c());
            return;
        }
        buxo d = MessagesTable.d();
        d.z("+RcsStillSendingNotification.refresh");
        d.h(new Function() { // from class: cipw
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                buxz buxzVar = (buxz) obj;
                entd entdVar = cipx.a;
                buxzVar.u(engw.this);
                return buxzVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        enip o = enip.o(d.b().f());
        int size2 = o.size();
        f.j = size2;
        if (size2 == 1) {
            f.h = (ConversationIdType) Collection.EL.stream(o).iterator2().next();
            bseh r = ((bczy) f.c.b()).r(f.h);
            if (r == null) {
                ensz enszVar = (ensz) cipx.a.j();
                enszVar.Y(csux.o, f.h.toString());
                ((ensz) enszVar.h("com/google/android/apps/messaging/shared/notification/RcsStillSendingNotification", "refresh", 168, "RcsStillSendingNotification.java")).q("Skipping RCS still sending notification for missing conversation.");
                return;
            } else {
                f.g = Optional.ofNullable(r.X());
                f.l = r.am();
                f.i = ((ames) f.f.b()).a(f.h, r.aa(), f.l);
            }
        }
        if (f.b.H(f)) {
            f.b.O(f);
        } else if (f.b.I(f)) {
            f.d.c("Bugle.Notification.RcsStillSending.Posted.Count");
            f.e.d(5);
        }
    }

    @Override // defpackage.cins
    public final void F(engw engwVar) {
        if (!K()) {
            ((ensz) a.o().h("com/google/android/apps/messaging/shared/notification/BugleNotificationManagerImpl", "refreshStuckMessagesNotification", 186, "BugleNotificationManagerImpl.java")).q("Notifications disabled, won't refresh stuck messages.");
            return;
        }
        ciqw g = ((cinq) this.j.b()).g(this);
        int size = engwVar.size();
        g.h = size;
        if (size == 0) {
            if (g.d.H(g)) {
                g.d.k("stuck_messages_notification_tag", g.c());
                alsi alsiVar = (alsi) g.c.b();
                ephs ephsVar = (ephs) ephx.a.createBuilder();
                ephsVar.copyOnWrite();
                ephx ephxVar = (ephx) ephsVar.instance;
                ephxVar.c = 5;
                ephxVar.b = 1 | ephxVar.b;
                ephv ephvVar = ephv.MESSAGE_STUCK_IN_SENDING;
                ephsVar.copyOnWrite();
                ephx ephxVar2 = (ephx) ephsVar.instance;
                ephxVar2.d = ephvVar.o;
                ephxVar2.b |= 2;
                alsiVar.a((ephx) ephsVar.build());
                return;
            }
            return;
        }
        List c = ((bdjk) g.b.b()).c((List) Collection.EL.stream(engwVar).map(new Function() { // from class: ciqr
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                int i = ciqw.o;
                return ((bted) obj).l();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(endq.a));
        Set set = (Set) Collection.EL.stream(c).map(new Function() { // from class: ciqs
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((bcyh) obj).t();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.toCollection(new Supplier() { // from class: ciqt
            @Override // java.util.function.Supplier
            public final Object get() {
                return new HashSet();
            }
        }));
        g.k = Collection.EL.stream(c).filter(new Predicate() { // from class: ciqo
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo439negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                int i = ciqw.o;
                return ((bcyh) obj).c() == 0;
            }
        }).count();
        g.l = Collection.EL.stream(c).filter(new Predicate() { // from class: ciqp
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo439negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                int i = ciqw.o;
                return ((bcyh) obj).c() == 1;
            }
        }).count();
        g.m = Collection.EL.stream(c).filter(new Predicate() { // from class: ciqq
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo439negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                int i = ciqw.o;
                return ((bcyh) obj).c() == 3;
            }
        }).count();
        if (set.size() == 1) {
            ((bcyh) c.get(0)).c();
            g.f = ((bcyh) c.get(0)).t();
            bcyk a2 = ((azwh) g.a.b()).a(g.f);
            g.j = a2 != null ? a2.t() : "";
            if (a2 != null) {
                g.n = a2.W();
            }
            g.g = ((ames) g.e.b()).a(g.f, ((bcyh) c.get(0)).S(), g.n);
        }
        g.i = set.size();
        if (!Collection.EL.stream(engwVar).anyMatch(new Predicate() { // from class: ciqu
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo439negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                int i = ciqw.o;
                return !((bted) obj).q();
            }
        })) {
            g.d.O(g);
            return;
        }
        if (!g.d.H(g)) {
            alsi alsiVar2 = (alsi) g.c.b();
            ephs ephsVar2 = (ephs) ephx.a.createBuilder();
            ephsVar2.copyOnWrite();
            ephx ephxVar3 = (ephx) ephsVar2.instance;
            ephxVar3.c = 1;
            ephxVar3.b = 1 | ephxVar3.b;
            ephv ephvVar2 = ephv.MESSAGE_STUCK_IN_SENDING;
            ephsVar2.copyOnWrite();
            ephx ephxVar4 = (ephx) ephsVar2.instance;
            ephxVar4.d = ephvVar2.o;
            ephxVar4.b |= 2;
            alsiVar2.a((ephx) ephsVar2.build());
        }
        g.d.I(g);
    }

    @Override // defpackage.cins
    public final synchronized void G(csjd csjdVar) {
        csjd P = P();
        if (csjdVar.equals(P)) {
            return;
        }
        String string = this.b.getString(com.google.android.apps.messaging.R.string.notifications_group_children_key);
        String b = P.b();
        String b2 = csjdVar.b();
        ((ctyx) this.i.b()).l(string, b2);
        ((ensz) ((ensz) a.h()).h("com/google/android/apps/messaging/shared/notification/BugleNotificationManagerImpl", "updateIncomingMessageNotificationsConversationIdSet", 518, "BugleNotificationManagerImpl.java")).D("Updating notification id set: old - %s, new - %s", b, b2);
    }

    @Override // defpackage.cins
    public final boolean H(cink cinkVar) {
        return ((cinl) this.g.b()).c(cinkVar);
    }

    @Override // defpackage.cins
    public final boolean I(cink cinkVar) {
        return ((cinl) this.g.b()).d(cinkVar);
    }

    @Override // defpackage.cins
    public final boolean J() {
        if (!K()) {
            ((ensz) a.o().h("com/google/android/apps/messaging/shared/notification/BugleNotificationManagerImpl", "refreshReminderNotifications", 401, "BugleNotificationManagerImpl.java")).q("Notifications disabled, won't refresh reminder notifications.");
            V();
            return false;
        }
        cipz cipzVar = (cipz) ((Optional) ((cinq) this.j.b()).e.b()).map(new Function() { // from class: cinp
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((ciqa) obj).a(cins.this);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(null);
        if (cipzVar == null) {
            V();
            return true;
        }
        cipzVar.m();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00f9  */
    @Override // defpackage.cins
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean K() {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ciog.K():boolean");
    }

    @Override // defpackage.cins
    public final void L(final csfz csfzVar, final int i) {
        cinj cinjVar;
        final tpe tpeVar = (tpe) ((cinq) this.j.b()).i.b();
        int ordinal = csfzVar.ordinal();
        if (ordinal == 0) {
            throw new IllegalArgumentException("Cannot create a notification for an undefined CMS feature.");
        }
        if (ordinal != 1) {
            if (ordinal != 2) {
                throw new IllegalStateException("Not expected to exit out of exhaustive switch statement for CmsFeature and BoxPrimaryDeviceStatus enums");
            }
            if (i == 0) {
                throw null;
            }
            cinjVar = i == 2 ? cinj.PRIMARY_DEVICE_CHANGED_BNR : i == 3 ? cinj.BACKUP_DELETED_BNR : cinj.UNSPECIFIED_PRIMARY_DEVICE_ENFORCEMENT_BNR;
        } else {
            if (i == 0) {
                throw null;
            }
            cinjVar = i == 2 ? cinj.PRIMARY_DEVICE_CHANGED_MD : i == 3 ? cinj.BACKUP_DELETED_MD : cinj.UNSPECIFIED_PRIMARY_DEVICE_ENFORCEMENT_MD;
        }
        aa(tpeVar.d.a(new ciql() { // from class: tpd
            @Override // defpackage.ciql
            public final Notification a(String str) {
                String string;
                String string2;
                Intent a2;
                tpe tpeVar2 = tpe.this;
                csfz csfzVar2 = csfzVar;
                int i2 = i;
                if (csgj.a()) {
                    int ordinal2 = csfzVar2.ordinal();
                    if (ordinal2 == 0) {
                        throw new IllegalArgumentException("Cannot create a notification for an undefined CMS feature.");
                    }
                    if (ordinal2 != 1) {
                        if (ordinal2 != 2) {
                            throw new IllegalStateException("Not expected to exit out of exhaustive switch statement for CmsFeature and BoxPrimaryDeviceStatus enums");
                        }
                        if (i2 == 1) {
                            string = tpeVar2.a.getString(com.google.android.apps.messaging.R.string.unspecified_opt_out_bnr_notification_title);
                            i2 = 1;
                        } else {
                            string = tpeVar2.a.getString(com.google.android.apps.messaging.R.string.opt_out_bnr_notification_title);
                        }
                    } else if (i2 == 1) {
                        string = tpeVar2.a.getString(com.google.android.apps.messaging.R.string.unspecified_opt_out_multidevice_notification_title);
                        i2 = 1;
                    } else {
                        string = tpeVar2.a.getString(com.google.android.apps.messaging.R.string.opt_out_multidevice_notification_title);
                    }
                } else {
                    string = tpeVar2.a.getString(com.google.android.apps.messaging.R.string.opt_out_multidevice_notification_title_legacy);
                }
                if (csgj.a()) {
                    int ordinal3 = csfzVar2.ordinal();
                    if (ordinal3 == 0) {
                        throw new IllegalArgumentException("Cannot create a notification for an undefined CMS feature.");
                    }
                    if (ordinal3 == 1) {
                        string2 = i2 == 2 ? tpeVar2.a.getString(com.google.android.apps.messaging.R.string.primary_device_changed_multidevice_notification_body) : i2 == 3 ? tpeVar2.a.getString(com.google.android.apps.messaging.R.string.backup_deleted_multidevice_notification_body) : tpeVar2.a.getString(com.google.android.apps.messaging.R.string.unspecified_opt_out_multidevice_notification_body);
                    } else {
                        if (ordinal3 != 2) {
                            throw new IllegalStateException("Not expected to exit out of exhaustive switch statement for CmsFeature and BoxPrimaryDeviceStatus enums");
                        }
                        string2 = i2 == 2 ? tpeVar2.a.getString(com.google.android.apps.messaging.R.string.primary_device_changed_bnr_notification_body) : i2 == 3 ? tpeVar2.a.getString(com.google.android.apps.messaging.R.string.backup_deleted_bnr_notification_body) : tpeVar2.a.getString(com.google.android.apps.messaging.R.string.unspecified_opt_out_bnr_notification_body);
                    }
                } else {
                    string2 = tpeVar2.a.getString(com.google.android.apps.messaging.R.string.primary_device_changed_multidevice_notification_body_legacy);
                }
                kml kmlVar = new kml(tpeVar2.a, str);
                kmlVar.i(string);
                kmlVar.h(string2);
                kmlVar.r(com.google.android.apps.messaging.R.drawable.notification_icon);
                kmlVar.l = 0;
                kme kmeVar = new kme(kmlVar);
                kmeVar.e(string2);
                kmlVar.u(kmeVar);
                if (csgj.a()) {
                    int ordinal4 = csfzVar2.ordinal();
                    if (ordinal4 == 0) {
                        throw new IllegalArgumentException("Cannot create a notification for an undefined CMS feature.");
                    }
                    Intent intent = null;
                    if (ordinal4 != 1) {
                        if (ordinal4 == 2) {
                            intent = tpeVar2.c.d(tpeVar2.a);
                        }
                    } else if (((Boolean) csgj.q.e()).booleanValue()) {
                        intent = tpeVar2.c.d(tpeVar2.a);
                    } else if (tpeVar2.b.isPresent()) {
                        intent = tcn.a(tpeVar2.a);
                    }
                    intent.getClass();
                    knx knxVar = new knx(tpeVar2.a);
                    knxVar.e(intent);
                    PendingIntent a3 = knxVar.a(0, ctie.a(VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS));
                    a3.getClass();
                    kmlVar.g(true);
                    kmlVar.g = a3;
                } else if (tpeVar2.b.isPresent()) {
                    if (((Boolean) csgj.q.e()).booleanValue()) {
                        a2 = tpeVar2.c.d(tpeVar2.a);
                    } else {
                        a2 = tcn.a(tpeVar2.a);
                    }
                    knx knxVar2 = new knx(tpeVar2.a);
                    knxVar2.e(a2);
                    PendingIntent a4 = knxVar2.a(0, ctie.a(VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS));
                    a4.getClass();
                    kmlVar.g(true);
                    kmlVar.g = a4;
                    kmlVar.d(com.google.android.apps.messaging.R.drawable.notification_icon, tpeVar2.a.getString(com.google.android.apps.messaging.R.string.primary_device_changed_notification_action_sign_in), a4);
                }
                return kmlVar.a();
            }
        }, cinjVar));
    }

    @Override // defpackage.cins
    public final synchronized void M(ConversationIdType conversationIdType) {
        String concat = !conversationIdType.b() ? ":".concat(String.valueOf(String.valueOf(conversationIdType))) : "";
        String str = this.b.getPackageName() + ":sms" + concat;
        cing cingVar = (cing) this.l.b();
        if (ctid.d) {
            StatusBarNotification[] activeNotifications = cingVar.a.getActiveNotifications();
            int length = activeNotifications.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                StatusBarNotification statusBarNotification = activeNotifications[i];
                if (!TextUtils.equals(statusBarNotification.getTag(), str)) {
                    i++;
                } else if ((statusBarNotification.getNotification().flags & 4096) == 4096) {
                    ensz enszVar = (ensz) a.h();
                    enszVar.Y(csux.o, conversationIdType.toString());
                    ((ensz) enszVar.h("com/google/android/apps/messaging/shared/notification/BugleNotificationManagerImpl", "cancelIncomingMessageNotifications", 252, "BugleNotificationManagerImpl.java")).q("Notification bubbled, will not be canceled");
                    return;
                }
            }
        }
        k(str, cinj.INCOMING_MESSAGE);
        csjd P = P();
        if (P.isEmpty() || conversationIdType.b()) {
            return;
        }
        P.remove(conversationIdType);
        G(P);
    }

    @Override // defpackage.cins
    public final elfl N() {
        return elfo.e(null);
    }

    @Override // defpackage.cins
    public final void O(cink cinkVar) {
        ((cinl) this.g.b()).f(cinkVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
    
        r5 = r5.getNotification().getBubbleMetadata();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized defpackage.csjd P() {
        /*
            r8 = this;
            monitor-enter(r8)
            csjd r0 = new csjd     // Catch: java.lang.Throwable -> L6f
            r0.<init>()     // Catch: java.lang.Throwable -> L6f
            emyl r1 = r8.u     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> L6f
            android.app.NotificationManager r1 = (android.app.NotificationManager) r1     // Catch: java.lang.Throwable -> L6f
            android.service.notification.StatusBarNotification[] r1 = r1.getActiveNotifications()     // Catch: java.lang.Throwable -> L6f
            int r2 = r1.length     // Catch: java.lang.Throwable -> L6f
            r3 = 0
            r4 = r3
        L15:
            if (r4 >= r2) goto L6d
            r5 = r1[r4]     // Catch: java.lang.Throwable -> L6f
            int r6 = r5.getId()     // Catch: java.lang.Throwable -> L6f
            cinj r7 = defpackage.cinj.INCOMING_MESSAGE     // Catch: java.lang.Throwable -> L6f
            int r7 = r7.G     // Catch: java.lang.Throwable -> L6f
            if (r6 != r7) goto L6a
            java.lang.String r6 = r5.getTag()     // Catch: java.lang.Throwable -> L6f
            if (r6 == 0) goto L6a
            java.lang.String r6 = r5.getTag()     // Catch: java.lang.Throwable -> L6f
            java.lang.String r7 = "\\d+$"
            java.util.regex.Pattern r7 = java.util.regex.Pattern.compile(r7)     // Catch: java.lang.Throwable -> L6f
            java.util.regex.Matcher r6 = r7.matcher(r6)     // Catch: java.lang.Throwable -> L6f
            boolean r7 = r6.find()     // Catch: java.lang.Throwable -> L6f
            if (r7 == 0) goto L46
            java.lang.String r6 = r6.group()     // Catch: java.lang.Throwable -> L6f
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r6 = defpackage.bdgq.b(r6)     // Catch: java.lang.Throwable -> L6f
            goto L48
        L46:
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r6 = defpackage.bdgq.a     // Catch: java.lang.Throwable -> L6f
        L48:
            boolean r7 = defpackage.ctid.d     // Catch: java.lang.Throwable -> L6f
            if (r7 == 0) goto L5e
            android.app.Notification r5 = r5.getNotification()     // Catch: java.lang.Throwable -> L6f
            android.app.Notification$BubbleMetadata r5 = defpackage.abk$$ExternalSyntheticApiModelOutline0.m(r5)     // Catch: java.lang.Throwable -> L6f
            if (r5 == 0) goto L5e
            boolean r5 = defpackage.abk$$ExternalSyntheticApiModelOutline0.m(r5)     // Catch: java.lang.Throwable -> L6f
            if (r5 == 0) goto L5e
            r5 = 1
            goto L5f
        L5e:
            r5 = r3
        L5f:
            boolean r7 = r6.b()     // Catch: java.lang.Throwable -> L6f
            if (r7 != 0) goto L6a
            if (r5 != 0) goto L6a
            r0.add(r6)     // Catch: java.lang.Throwable -> L6f
        L6a:
            int r4 = r4 + 1
            goto L15
        L6d:
            monitor-exit(r8)
            return r0
        L6f:
            r0 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L6f
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ciog.P():csjd");
    }

    @Override // defpackage.ciqg
    public final elfl Q(Throwable th, long j) {
        ((ensz) ((ensz) ((ensz) a.h()).g(th)).h("com/google/android/apps/messaging/shared/notification/BugleNotificationManagerImpl", "postReportIssueNotification", (char) 622, "BugleNotificationManagerImpl.java")).q("Messages automatically detected an error. Showing notification");
        ffbr ffbrVar = this.j;
        ephv ephvVar = ephv.SILENT_CRASH;
        ciqf ciqfVar = (ciqf) ((cinq) ffbrVar.b()).f.b();
        ciqb e = ciqc.e();
        e.b(ephv.SILENT_CRASH);
        ((cimz) e).b = Optional.of(th);
        return ac(ephvVar, ciqfVar.a(e.a()), j);
    }

    @Override // defpackage.ciqg
    public final elfl R(ephv ephvVar, long j, String str) {
        return ac(ephvVar, ((cinq) this.j.b()).d(ephvVar, str, null), j);
    }

    @Override // defpackage.ciqg
    public final elfl S(ephv ephvVar, String str, long j, enhk enhkVar) {
        return ac(ephvVar, ((cinq) this.j.b()).d(ephvVar, str, enhkVar), j);
    }

    public final ListenableFuture T() {
        return (ListenableFuture) ((Optional) this.o.b()).map(new Function() { // from class: cioa
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((ddjq) obj).a();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(erqt.i(new ArrayList()));
    }

    public final void U(final String str) {
        k((String) ((Optional) this.p.b()).map(new Function() { // from class: cinz
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ddjt.a(ciog.this.b, str);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(null), cinj.REMINDER);
    }

    final void V() {
        elfr.l(T(), new ciod(this), erpp.a);
    }

    public final void W(ephv ephvVar, cink cinkVar) {
        Optional empty;
        Bundle bundle;
        StatusBarNotification[] activeNotifications = ((NotificationManager) this.u.get()).getActiveNotifications();
        int length = activeNotifications.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                empty = Optional.empty();
                break;
            }
            StatusBarNotification statusBarNotification = activeNotifications[i];
            if (statusBarNotification.getId() == cinj.REPORT_ISSUE.G && (bundle = statusBarNotification.getNotification().extras) != null) {
                empty = Optional.of(ephv.b(bundle.getInt("issue_type_extra")));
                break;
            }
            i++;
        }
        if (aa(cinkVar)) {
            empty.ifPresent(new Consumer() { // from class: cinw
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    ciog.this.ab(8, (ephv) obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            ab(2, ephvVar);
        }
    }

    @Override // defpackage.ciqg
    public final void X(ephv ephvVar, String str) {
        W(ephvVar, ((cinq) this.j.b()).d(ephvVar, str, null));
    }

    final void Y(final List list) {
        ((Optional) this.o.b()).ifPresent(new Consumer() { // from class: cinu
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                entd entdVar = ciog.a;
                ((ddjq) obj).b(list);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    public final boolean Z(cinj cinjVar) {
        for (StatusBarNotification statusBarNotification : ((NotificationManager) this.u.get()).getActiveNotifications()) {
            if (statusBarNotification.getId() == cinjVar.G) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cins
    public final Notification a(String str) {
        return ((cinq) this.j.b()).a(str).b();
    }

    final boolean aa(cink cinkVar) {
        if (K()) {
            return I(cinkVar);
        }
        ensz enszVar = (ensz) a.h();
        enszVar.Y(cink.p, cinkVar);
        ((ensz) enszVar.h("com/google/android/apps/messaging/shared/notification/BugleNotificationManagerImpl", "notifyIfAllowed", 421, "BugleNotificationManagerImpl.java")).q("Notifications disabled, won't notify");
        return false;
    }

    public final void ab(int i, ephv ephvVar) {
        alsi alsiVar = (alsi) this.q.b();
        ephs ephsVar = (ephs) ephx.a.createBuilder();
        ephsVar.copyOnWrite();
        ephx ephxVar = (ephx) ephsVar.instance;
        ephxVar.c = i - 1;
        ephxVar.b |= 1;
        ephsVar.copyOnWrite();
        ephx ephxVar2 = (ephx) ephsVar.instance;
        ephxVar2.d = ephvVar.o;
        ephxVar2.b |= 2;
        alsiVar.a((ephx) ephsVar.build());
    }

    @Override // defpackage.cins
    public final Notification b() {
        return c(this.b.getString(com.google.android.apps.messaging.R.string.foreground_service_notification_generic_text));
    }

    @Override // defpackage.cins
    public final Notification c(String str) {
        return ((cinq) this.j.b()).b(str).b();
    }

    @Override // defpackage.cins
    public final Notification d() {
        return this.e;
    }

    @Override // defpackage.cins
    public final cinr e() {
        return (cinr) this.m.get();
    }

    @Override // defpackage.cins
    public final cioq f() {
        return (cioq) this.f.b();
    }

    @Override // defpackage.cins
    public final /* synthetic */ void g() {
        j(cinj.AUTOMOVED_SPAM);
    }

    @Override // defpackage.cins
    public final /* synthetic */ void h() {
        j(cinj.DIAGNOSTICS_TOOL);
    }

    @Override // defpackage.cins
    public final /* synthetic */ void i() {
        j(cinj.LOW_STORAGE_SPACE);
    }

    @Override // defpackage.cins
    public final void j(cinj cinjVar) {
        k(null, cinjVar);
    }

    @Override // defpackage.cins
    public final void k(String str, cinj cinjVar) {
        ((cinl) this.g.b()).b(str, cinjVar);
    }

    @Override // defpackage.cins
    public final /* synthetic */ void l() {
        j(cinj.REPORT_ISSUE);
    }

    @Override // defpackage.cins
    public final /* synthetic */ void m() {
        j(cinj.SIM_STORAGE_FULL);
    }

    @Override // defpackage.cins
    public final void n() {
        final toy toyVar = (toy) ((cinq) this.j.b()).j.b();
        aa(toyVar.c.a(new ciql() { // from class: tox
            @Override // defpackage.ciql
            public final Notification a(String str) {
                toy toyVar2 = toy.this;
                Context context = toyVar2.a;
                String string = context.getString(com.google.android.apps.messaging.R.string.account_removed_notification_title);
                String string2 = context.getString(com.google.android.apps.messaging.R.string.account_removed_notification_body);
                kml kmlVar = new kml(context, str);
                kmlVar.i(string);
                kmlVar.h(string2);
                kmlVar.r(com.google.android.apps.messaging.R.drawable.notification_icon);
                kmlVar.l = 0;
                kme kmeVar = new kme(kmlVar);
                kmeVar.e(string2);
                kmlVar.u(kmeVar);
                if (toyVar2.b.isPresent() && !((Boolean) csgj.q.e()).booleanValue()) {
                    Context context2 = toyVar2.a;
                    Intent a2 = tcn.a(context2);
                    TaskStackBuilder create = TaskStackBuilder.create(context2);
                    create.addNextIntentWithParentStack(a2);
                    PendingIntent pendingIntent = create.getPendingIntent(0, ctie.a(VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS));
                    pendingIntent.getClass();
                    kmlVar.g(true);
                    kmlVar.g = pendingIntent;
                }
                return kmlVar.a();
            }
        }, cinj.ACCOUNT_REMOVED));
    }

    @Override // defpackage.cins
    public final void o() {
        final cinq cinqVar = (cinq) this.j.b();
        cinqVar.getClass();
        elfo.g(new Callable() { // from class: cinv
            @Override // java.util.concurrent.Callable
            public final Object call() {
                efbd.b();
                final cimv cimvVar = (cimv) cinq.this.g.b();
                efbd.b();
                efbd.b();
                int width = ((cimw) cimvVar.d.e()).a.getWidth();
                int height = ((cimw) cimvVar.d.e()).a.getHeight();
                final Bitmap a2 = cimvVar.f.a(cimvVar.a, cimvVar.e.g(null, null, ((aolr) cimvVar.h.b()).f(), null, false, true, false), width, height);
                return cimvVar.b.b(new ciql() { // from class: cimt
                    @Override // defpackage.ciql
                    public final Notification a(String str) {
                        cimv cimvVar2 = cimv.this;
                        kml kmlVar = new kml(cimvVar2.a, str);
                        PendingIntent f = DismissNotificationReceiver.f(cimvVar2.a, cinj.AUTOMOVED_SPAM);
                        Optional d = cimvVar2.g.d(cimvVar2.a);
                        if (d.isEmpty()) {
                            return null;
                        }
                        Bitmap bitmap = a2;
                        if (bitmap != null) {
                            kmlVar.m(bitmap);
                        }
                        kmlVar.i(cimvVar2.a.getString(com.google.android.apps.messaging.R.string.automoved_spam_notification_content_title));
                        kmlVar.h(cimvVar2.a.getString(com.google.android.apps.messaging.R.string.automoved_spam_notification_content_text));
                        kmlVar.l = 2;
                        kmlVar.r(com.google.android.apps.messaging.R.drawable.notification_icon);
                        kmlVar.d(com.google.android.apps.messaging.R.drawable.ic_check_circle_gray, cimvVar2.a.getString(com.google.android.apps.messaging.R.string.automoved_spam_notification_action_dismiss), f);
                        kmlVar.d(com.google.android.apps.messaging.R.drawable.quantum_ic_googleplus_reshare_googblue_24, cimvVar2.a.getString(com.google.android.apps.messaging.R.string.automoved_spam_notification_action_view), (PendingIntent) d.get());
                        kmlVar.g = (PendingIntent) d.get();
                        kmlVar.g(true);
                        kmlVar.p(true);
                        kmlVar.C = cimvVar2.a.getColor(com.google.android.apps.messaging.R.color.silent_notification_icon_color);
                        return kmlVar.a();
                    }
                }, cinj.AUTOMOVED_SPAM, new cipf() { // from class: cimu
                    @Override // defpackage.cipf
                    public final NotificationChannel a() {
                        NotificationChannel notificationChannel;
                        CharSequence name;
                        cthp cthpVar = cimv.this.c;
                        if (!cthpVar.m()) {
                            return null;
                        }
                        notificationChannel = ((NotificationManager) cthpVar.a.b()).getNotificationChannel("bugle_auto_moved_spam_channel");
                        String string = cthpVar.b.getString(com.google.android.apps.messaging.R.string.automoved_spam_notification_channel_name);
                        if (notificationChannel != null) {
                            name = notificationChannel.getName();
                            if (!TextUtils.equals(name, string)) {
                                notificationChannel.setName(string);
                            }
                            return notificationChannel;
                        }
                        cthn cthnVar = new cthn("bugle_auto_moved_spam_channel", string, 2);
                        cthnVar.b(false);
                        cthnVar.a(false);
                        cthnVar.d();
                        NotificationChannel notificationChannel2 = cthnVar.a;
                        cthpVar.n(notificationChannel2);
                        return notificationChannel2;
                    }
                });
            }
        }, this.k).k(axou.a(new ciof(this)), erpp.a);
    }

    @Override // defpackage.cins
    public final void p() {
        aa(((cinq) this.j.b()).a(this.b.getString(com.google.android.apps.messaging.R.string.foreground_service_notification_generic_text)));
    }

    @Override // defpackage.cins
    public final void q(final Intent intent) {
        if (Z(cinj.UNSPECIFIED_PRIMARY_DEVICE_ENFORCEMENT_MD) || Z(cinj.UNSPECIFIED_PRIMARY_DEVICE_ENFORCEMENT_BNR)) {
            return;
        }
        final tpa tpaVar = (tpa) ((cinq) this.j.b()).k.b();
        aa(tpaVar.b.a(new ciql() { // from class: toz
            @Override // defpackage.ciql
            public final Notification a(String str) {
                tpa tpaVar2 = tpa.this;
                knx knxVar = new knx(tpaVar2.a);
                Intent intent2 = intent;
                knxVar.e(intent2);
                PendingIntent a2 = knxVar.a(0, ctie.a(VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS));
                tpaVar2.a.getString(com.google.android.apps.messaging.R.string.cms_vital_error_notification_title);
                tpaVar2.a.getString(com.google.android.apps.messaging.R.string.cms_vital_error_notification_message);
                Context context = tpaVar2.a;
                String string = context.getString(com.google.android.apps.messaging.R.string.unspecified_opt_out_bnr_notification_title);
                String string2 = context.getString(com.google.android.apps.messaging.R.string.unspecified_opt_out_bnr_notification_body);
                if (intent2.getIntExtra("CMS_FEATURE_KEY", -1) == csfz.MULTI_DEVICE.d) {
                    Context context2 = tpaVar2.a;
                    Context context3 = tpaVar2.a;
                    string = context2.getString(com.google.android.apps.messaging.R.string.unspecified_opt_out_multidevice_notification_title);
                    string2 = context3.getString(com.google.android.apps.messaging.R.string.unspecified_opt_out_multidevice_notification_body);
                }
                kml kmlVar = new kml(tpaVar2.a, str);
                kmlVar.i(string);
                kmlVar.h(string2);
                kmlVar.r(com.google.android.apps.messaging.R.drawable.notification_icon);
                kmlVar.g(true);
                kmlVar.l = 0;
                kmlVar.g = a2;
                return kmlVar.a();
            }
        }, cinj.CMS_VITAL_ERROR));
    }

    @Override // defpackage.cins
    public final void r(final String str) {
        final tpc tpcVar = (tpc) ((cinq) this.j.b()).h.b();
        aa(tpcVar.d.a(new ciql() { // from class: tpb
            @Override // defpackage.ciql
            public final Notification a(String str2) {
                Intent a2;
                Object[] objArr = {str};
                tpc tpcVar2 = tpc.this;
                String string = tpcVar2.a.getString(com.google.android.apps.messaging.R.string.dasher_disabled_notification_title, objArr);
                Context context = tpcVar2.a;
                String string2 = context.getString(com.google.android.apps.messaging.R.string.dasher_disabled_notification_body);
                kml kmlVar = new kml(context, str2);
                kmlVar.i(string);
                kmlVar.h(string2);
                kmlVar.r(com.google.android.apps.messaging.R.drawable.notification_icon);
                kmlVar.l = 0;
                kme kmeVar = new kme(kmlVar);
                kmeVar.e(string2);
                kmlVar.u(kmeVar);
                if (tpcVar2.b.isPresent()) {
                    if (((Boolean) csgj.q.e()).booleanValue()) {
                        a2 = tpcVar2.c.d(tpcVar2.a);
                    } else {
                        a2 = tcn.a(tpcVar2.a);
                    }
                    TaskStackBuilder create = TaskStackBuilder.create(tpcVar2.a);
                    create.addNextIntentWithParentStack(a2);
                    PendingIntent pendingIntent = create.getPendingIntent(0, ctie.a(VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS));
                    pendingIntent.getClass();
                    kmlVar.g(true);
                    kmlVar.g = pendingIntent;
                }
                return kmlVar.a();
            }
        }, cinj.DASHER_DISABLED));
    }

    @Override // defpackage.cins
    public final void s() {
        final ciom ciomVar = (ciom) ((cinq) this.j.b()).b.b();
        aa(ciomVar.b.a(new ciql() { // from class: ciol
            @Override // defpackage.ciql
            public final Notification a(String str) {
                kml kmlVar = new kml(ciom.this.a, str);
                kmlVar.i("Messages In-App Diagnostics");
                kmlVar.h("Diagnosing in progress...");
                kmlVar.r(com.google.android.apps.messaging.R.drawable.ic_warning_light);
                return kmlVar.a();
            }
        }, cinj.DIAGNOSTICS_TOOL));
    }

    @Override // defpackage.cins
    public final void t() {
        aa(((cinq) this.j.b()).b(this.b.getString(com.google.android.apps.messaging.R.string.foreground_service_notification_generic_text)));
    }

    @Override // defpackage.cins
    public final void u() {
        if (Collection.EL.stream((Set) this.v.b()).allMatch(new Predicate() { // from class: cinx
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo439negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((bzhr) obj).c();
            }
        })) {
            final cidi cidiVar = (cidi) ((cinq) this.j.b()).l.b();
            aa(cidiVar.c.a(new ciql() { // from class: cidh
                @Override // defpackage.ciql
                public final Notification a(String str) {
                    cidi cidiVar2 = cidi.this;
                    String string = cidiVar2.a.getString(com.google.android.apps.messaging.R.string.gaia_pairing_verification_notification_title);
                    if (ctid.e) {
                        string = cidiVar2.a.getString(com.google.android.apps.messaging.R.string.gaia_pairing_verification_notification_short_title);
                    }
                    kml kmlVar = new kml(cidiVar2.a, str);
                    kmlVar.h(string);
                    kmlVar.C = cidiVar2.a.getColor(com.google.android.apps.messaging.R.color.primary_brand_non_icon_color);
                    kmlVar.r(com.google.android.apps.messaging.R.drawable.notification_icon);
                    kmlVar.l = 1;
                    kmlVar.g(true);
                    kmlVar.J = ((Long) bzaq.a.e()).longValue();
                    cidiVar2.b.isPresent();
                    Optional optional = cidiVar2.b;
                    Context context = cidiVar2.a;
                    Object obj = optional.get();
                    context.getClass();
                    dbvq dbvqVar = (dbvq) obj;
                    Intent d = dbvqVar.a.d(context);
                    d.setFlags(268468224);
                    knx knxVar = new knx(context);
                    knxVar.d(d);
                    Intent intent = new Intent(context, (Class<?>) GaiaPairingVerificationActivity.class);
                    intent.putExtra("prompt_launch_source", 1);
                    bznq bznqVar = (bznq) dbvqVar.c.b();
                    String str2 = (String) ((cgvp) bznqVar.b.b()).a.get();
                    if (bznqVar.d.a()) {
                        axol.c(bznqVar.e, ffhe.a, ffsm.a, new bznm(bznqVar, null));
                    } else {
                        ((bzea) bznqVar.a.b()).w(2, str2, ezlj.ATTEMPT_TO_LAUNCH_VERIFICATION_PROMPT_FROM_NOTIFICATION);
                    }
                    knxVar.e(intent);
                    ((akzt) dbvqVar.b.b()).e("Bugle.Gaia.Verification.Prompt.Launched", 1);
                    ClipData clipData = eepf.a;
                    PendingIntent a2 = knxVar.a(0, 1140850688);
                    a2.getClass();
                    kmlVar.g = a2;
                    return kmlVar.a();
                }
            }, cinj.GAIA_PAIRING_VERIFICATION));
        }
    }

    @Override // defpackage.cins
    public final void v(final ConversationId conversationId, final int i, final int i2) {
        final ciot ciotVar = (ciot) ((cinq) this.j.b()).c.b();
        String valueOf = String.valueOf(cinj.MEDIA_RESIZING.H);
        ciqn ciqnVar = ciotVar.c;
        ciql ciqlVar = new ciql() { // from class: cios
            @Override // defpackage.ciql
            public final Notification a(String str) {
                String quantityString;
                int i3 = i;
                int i4 = i2;
                ciot ciotVar2 = ciot.this;
                Resources resources = ciotVar2.a.getResources();
                if (i3 <= 0 || i4 <= 0) {
                    quantityString = (i3 <= 0 || i4 != 0) ? (i3 != 0 || i4 <= 0) ? "" : resources.getQuantityString(com.google.android.apps.messaging.R.plurals.resize_service_notification_title_video_plural, i4, Integer.valueOf(i4)) : resources.getQuantityString(com.google.android.apps.messaging.R.plurals.resize_service_notification_title_photo_plural, i3, Integer.valueOf(i3));
                } else {
                    int i5 = i3 + i4;
                    quantityString = resources.getQuantityString(com.google.android.apps.messaging.R.plurals.resize_service_notification_title_attachment_plural, i5, Integer.valueOf(i5));
                }
                ConversationId conversationId2 = conversationId;
                kml kmlVar = new kml(ciotVar2.a, str);
                kmlVar.r(com.google.android.apps.messaging.R.drawable.notification_icon);
                kmlVar.C = ciotVar2.a.getColor(com.google.android.apps.messaging.R.color.primary_brand_non_icon_color);
                kmlVar.i(quantityString);
                kmlVar.h(ciotVar2.a.getText(com.google.android.apps.messaging.R.string.resize_service_notification_text));
                kmlVar.p(true);
                kmlVar.l = 2;
                kmlVar.O = true;
                if (!(conversationId2 instanceof InvalidConversationId)) {
                    kmlVar.g = ciotVar2.b.p(ciotVar2.a, conversationId2, false);
                }
                return kmlVar.a();
            }
        };
        ffbr ffbrVar = ciqnVar.a;
        cinj cinjVar = cinj.MEDIA_RESIZING;
        cine cineVar = (cine) ffbrVar.b();
        cineVar.getClass();
        cinjVar.getClass();
        ciqm ciqmVar = new ciqm(cineVar, ciqlVar, cinjVar, valueOf.concat("[silent]"), null);
        this.e = ciqmVar.b();
        aa(ciqmVar);
    }

    @Override // defpackage.cins
    public final void w(ConversationIdType conversationIdType, aoku aokuVar) {
        cinq cinqVar = (cinq) this.j.b();
        ayfg ayfgVar = (ayfg) this.n.b();
        cfva cfvaVar = aoqm.a;
        aa(cinqVar.c(ayfgVar, conversationIdType, aokuVar.H(((Boolean) new aopu().get()).booleanValue()).toString()));
    }

    @Override // defpackage.cins
    public final void x(ConversationIdType conversationIdType, String str) {
        aa(((cinq) this.j.b()).c((ayfg) this.n.b(), conversationIdType, str));
    }

    @Override // defpackage.cins
    public final void y() {
        aa(((cinq) this.j.b()).e(this));
    }

    @Override // defpackage.cins
    public final void z() {
        aa(((cinq) this.j.b()).f(this));
    }
}
