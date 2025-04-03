package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.dittosatellite.impl.DittoWebActivity;
import com.google.android.apps.messaging.dittosatellite.intent.DittoAttachment;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acxj implements acio {
    public static final enru a = enru.c("com/google/android/apps/messaging/dittosatellite/switcher/SatelliteExtensions");
    public final Context b;
    public final ffbr c;
    public final ffbr d;
    public final acxk e;
    public final ffbr f;
    public final ffbr g;
    public adg h;
    public adg i;
    public Intent j;
    private final ffbr k;
    private final ffbr l;
    private final ejwd n = new ejwd<Integer>() { // from class: acxj.1
        @Override // defpackage.ejwd
        public final void a(Throwable th) {
            ensk j = acxj.a.j();
            j.Y(ente.a, "DittoSatellite");
            ((enrr) ((enrr) ((enrr) j).g(th)).h("com/google/android/apps/messaging/dittosatellite/switcher/SatelliteExtensions$1", "onError", (char) 136, "SatelliteExtensions.java")).q("Failed to determine the TabletMode");
        }

        @Override // defpackage.ejwd
        public final /* bridge */ /* synthetic */ void b(Object obj) {
            Intent intent;
            Integer num = (Integer) obj;
            acxj acxjVar = acxj.this;
            acxk acxkVar = acxjVar.e;
            if (acxkVar != null && acxjVar.f != null && acxjVar.g != null) {
                if (!acxkVar.c()) {
                    ensk e = acxj.a.e();
                    e.Y(ente.a, "DittoSatellite");
                    ((enrr) ((enrr) e).h("com/google/android/apps/messaging/dittosatellite/switcher/SatelliteExtensions", "logSmsStatusOnTablet", 322, "SatelliteExtensions.java")).q("No read phone state permission, skip logging");
                } else if (!((ctvs) acxjVar.f.b()).e()) {
                    ensk e2 = acxj.a.e();
                    e2.Y(ente.a, "DittoSatellite");
                    ((enrr) ((enrr) e2).h("com/google/android/apps/messaging/dittosatellite/switcher/SatelliteExtensions", "logSmsStatusOnTablet", 326, "SatelliteExtensions.java")).q("This is a WiFi tablet.");
                } else if (acxjVar.e.b()) {
                    ((akzt) acxjVar.g.b()).e("Bugle.Satellite.Lte.Sim.Status.Counts", 1);
                } else if (acxjVar.e.d()) {
                    ((akzt) acxjVar.g.b()).e("Bugle.Satellite.Lte.Sim.Status.Counts", 2);
                } else {
                    ((akzt) acxjVar.g.b()).e("Bugle.Satellite.Lte.Sim.Status.Counts", 3);
                }
            }
            ensk h = acxj.a.h();
            h.Y(ente.a, "DittoSatellite");
            ((enrr) ((enrr) h).h("com/google/android/apps/messaging/dittosatellite/switcher/SatelliteExtensions$1", "onNewData", 72, "SatelliteExtensions.java")).t("onboarding tabletMode: %s", num);
            if (num.intValue() == 2) {
                ensk h2 = acxj.a.h();
                h2.Y(ente.a, "DittoSatellite");
                ((enrr) ((enrr) h2).h("com/google/android/apps/messaging/dittosatellite/switcher/SatelliteExtensions$1", "onNewData", 74, "SatelliteExtensions.java")).q("Stay in bugle by stored user choice");
                return;
            }
            acxj acxjVar2 = acxj.this;
            if (acxjVar2.e == null) {
                ensk j = acxj.a.j();
                j.Y(ente.a, "DittoSatellite");
                ((enrr) ((enrr) j).h("com/google/android/apps/messaging/dittosatellite/switcher/SatelliteExtensions$1", "onNewData", 78, "SatelliteExtensions.java")).q("satelliteUtils is null.");
                return;
            }
            if (acxjVar2.c == null) {
                ensk j2 = acxj.a.j();
                j2.Y(ente.a, "DittoSatellite");
                ((enrr) ((enrr) j2).h("com/google/android/apps/messaging/dittosatellite/switcher/SatelliteExtensions$1", "onNewData", 82, "SatelliteExtensions.java")).q("switcherDialogProvider is null.");
                return;
            }
            ffbr ffbrVar = acxjVar2.d;
            if (ffbrVar == null || ((Optional) ffbrVar.b()).isEmpty()) {
                ensk j3 = acxj.a.j();
                j3.Y(ente.a, "DittoSatellite");
                ((enrr) ((enrr) j3).h("com/google/android/apps/messaging/dittosatellite/switcher/SatelliteExtensions$1", "onNewData", 87, "SatelliteExtensions.java")).q("satelliteDataServiceProvider is null.");
                return;
            }
            acxj acxjVar3 = acxj.this;
            Context context = acxjVar3.b;
            if (context == null) {
                ensk j4 = acxj.a.j();
                j4.Y(ente.a, "DittoSatellite");
                ((enrr) ((enrr) j4).h("com/google/android/apps/messaging/dittosatellite/switcher/SatelliteExtensions$1", "onNewData", 91, "SatelliteExtensions.java")).q("context is null.");
                return;
            }
            if (acxjVar3.h == null) {
                ensk j5 = acxj.a.j();
                j5.Y(ente.a, "DittoSatellite");
                ((enrr) ((enrr) j5).h("com/google/android/apps/messaging/dittosatellite/switcher/SatelliteExtensions$1", "onNewData", 95, "SatelliteExtensions.java")).q("launcher is null.");
                return;
            }
            Intent intent2 = new Intent(context, (Class<?>) DittoWebActivity.class);
            intent2.addFlags(65536);
            if (num.intValue() != 0) {
                if (num.intValue() == 1) {
                    ensk h3 = acxj.a.h();
                    h3.Y(ente.a, "DittoSatellite");
                    ((enrr) ((enrr) h3).h("com/google/android/apps/messaging/dittosatellite/switcher/SatelliteExtensions$1", "onNewData", 129, "SatelliteExtensions.java")).q("Launch Ditto by stored user choice");
                }
                acxj.this.h.c(intent2);
                return;
            }
            if (!acxj.this.e.c()) {
                ensk h4 = acxj.a.h();
                h4.Y(ente.a, "DittoSatellite");
                ((enrr) ((enrr) h4).h("com/google/android/apps/messaging/dittosatellite/switcher/SatelliteExtensions$1", "onNewData", 122, "SatelliteExtensions.java")).q("Request permission");
                acxj acxjVar4 = acxj.this;
                adg adgVar = acxjVar4.i;
                if (adgVar == null || (intent = acxjVar4.j) == null) {
                    return;
                }
                adgVar.c(intent);
                return;
            }
            if (acxj.this.e.b()) {
                ensk h5 = acxj.a.h();
                h5.Y(ente.a, "DittoSatellite");
                ((enrr) ((enrr) h5).h("com/google/android/apps/messaging/dittosatellite/switcher/SatelliteExtensions$1", "onNewData", 103, "SatelliteExtensions.java")).q("Hide switcher since there is phone number.");
                if (((Optional) acxj.this.d.b()).isPresent()) {
                    ensk e3 = acxj.a.e();
                    e3.Y(ente.a, "DittoSatellite");
                    ((enrr) ((enrr) e3).h("com/google/android/apps/messaging/dittosatellite/switcher/SatelliteExtensions$1", "onNewData", 105, "SatelliteExtensions.java")).q("set STANDALONE in datastore");
                    ((acls) ((Optional) acxj.this.d.b()).get()).c(acmd.STANDALONE).k(axnw.b(), erpp.a);
                    return;
                }
                return;
            }
            ensk h6 = acxj.a.h();
            h6.Y(ente.a, "DittoSatellite");
            ((enrr) ((enrr) h6).h("com/google/android/apps/messaging/dittosatellite/switcher/SatelliteExtensions$1", "onNewData", 114, "SatelliteExtensions.java")).q("No phone number.");
            ffbr ffbrVar2 = acxj.this.f;
            if (ffbrVar2 == null || ((ctvs) ffbrVar2.b()).e()) {
                return;
            }
            ensk h7 = acxj.a.h();
            h7.Y(ente.a, "DittoSatellite");
            ((enrr) ((enrr) h7).h("com/google/android/apps/messaging/dittosatellite/switcher/SatelliteExtensions$1", "onNewData", 116, "SatelliteExtensions.java")).q("Launch Satellite on Wifi");
            acxj.o(acxj.this.b);
        }

        @Override // defpackage.ejwd
        public final /* synthetic */ void hB() {
        }
    };
    private final adf m = new adf() { // from class: acxh
        @Override // defpackage.adf
        public final void a(Object obj) {
            int i = ((ade) obj).a;
            acxj acxjVar = acxj.this;
            if (i != -1) {
                ensk h = acxj.a.h();
                h.Y(ente.a, "DittoSatellite");
                ((enrr) ((enrr) h).h("com/google/android/apps/messaging/dittosatellite/switcher/SatelliteExtensions", "getDefaultSmsAppCallback", 376, "SatelliteExtensions.java")).q("User denied to set as default sms.");
                ffbr ffbrVar = acxjVar.f;
                if (ffbrVar != null && !((ctvs) ffbrVar.b()).e()) {
                    ensk h2 = acxj.a.h();
                    h2.Y(ente.a, "DittoSatellite");
                    ((enrr) ((enrr) h2).h("com/google/android/apps/messaging/dittosatellite/switcher/SatelliteExtensions", "getDefaultSmsAppCallback", 378, "SatelliteExtensions.java")).q("getDefaultSmsAppCallback: Launch Satellite on Wifi");
                    acxj.o(acxjVar.b);
                    return;
                }
                ensk h3 = acxj.a.h();
                h3.Y(ente.a, "DittoSatellite");
                ((enrr) ((enrr) h3).h("com/google/android/apps/messaging/dittosatellite/switcher/SatelliteExtensions", "getDefaultSmsAppCallback", 381, "SatelliteExtensions.java")).q("getDefaultSmsAppCallback: Show switcher on LTE.");
                ffbr ffbrVar2 = acxjVar.c;
                if (ffbrVar2 != null) {
                    ((acxo) ffbrVar2.b()).b(acmd.STANDALONE, true);
                    return;
                }
                return;
            }
            ensk h4 = acxj.a.h();
            h4.Y(ente.a, "DittoSatellite");
            ((enrr) ((enrr) h4).h("com/google/android/apps/messaging/dittosatellite/switcher/SatelliteExtensions", "getDefaultSmsAppCallback", 350, "SatelliteExtensions.java")).q("successfully set as default sms");
            acxk acxkVar = acxjVar.e;
            if (acxkVar != null && acxkVar.b()) {
                ensk h5 = acxj.a.h();
                h5.Y(ente.a, "DittoSatellite");
                ((enrr) ((enrr) h5).h("com/google/android/apps/messaging/dittosatellite/switcher/SatelliteExtensions", "getDefaultSmsAppCallback", 352, "SatelliteExtensions.java")).q("Hide switcher since there is phone number.");
                ffbr ffbrVar3 = acxjVar.d;
                if (ffbrVar3 == null || !((Optional) ffbrVar3.b()).isPresent()) {
                    return;
                }
                ensk h6 = acxj.a.h();
                h6.Y(ente.a, "DittoSatellite");
                ((enrr) ((enrr) h6).h("com/google/android/apps/messaging/dittosatellite/switcher/SatelliteExtensions", "getDefaultSmsAppCallback", 355, "SatelliteExtensions.java")).q("set STANDALONE in datastore");
                ((acls) ((Optional) acxjVar.d.b()).get()).c(acmd.STANDALONE).k(axnw.b(), erpp.a);
                return;
            }
            ensk h7 = acxj.a.h();
            h7.Y(ente.a, "DittoSatellite");
            ((enrr) ((enrr) h7).h("com/google/android/apps/messaging/dittosatellite/switcher/SatelliteExtensions", "getDefaultSmsAppCallback", 363, "SatelliteExtensions.java")).q("getDefaultSmsAppCallback: No phone number.");
            ffbr ffbrVar4 = acxjVar.f;
            if (ffbrVar4 != null && !((ctvs) ffbrVar4.b()).e()) {
                ensk h8 = acxj.a.h();
                h8.Y(ente.a, "DittoSatellite");
                ((enrr) ((enrr) h8).h("com/google/android/apps/messaging/dittosatellite/switcher/SatelliteExtensions", "getDefaultSmsAppCallback", 365, "SatelliteExtensions.java")).q("getDefaultSmsAppCallback: Launch Satellite on Wifi");
                acxj.o(acxjVar.b);
                return;
            }
            ensk h9 = acxj.a.h();
            h9.Y(ente.a, "DittoSatellite");
            ((enrr) ((enrr) h9).h("com/google/android/apps/messaging/dittosatellite/switcher/SatelliteExtensions", "getDefaultSmsAppCallback", 368, "SatelliteExtensions.java")).q("getDefaultSmsAppCallback: Show switcher on LTE.");
            ffbr ffbrVar5 = acxjVar.c;
            if (ffbrVar5 != null) {
                ((acxo) ffbrVar5.b()).b(acmd.STANDALONE, true);
            }
        }
    };

    public acxj(Context context, ffbr ffbrVar, ffbr ffbrVar2, acxk acxkVar, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6) {
        this.b = context;
        this.c = ffbrVar;
        this.d = ffbrVar2;
        this.e = acxkVar;
        this.f = ffbrVar3;
        this.k = ffbrVar4;
        this.l = ffbrVar5;
        this.g = ffbrVar6;
    }

    public static void o(Context context) {
        if (context == null) {
            ensk j = a.j();
            j.Y(ente.a, "DittoSatellite");
            ((enrr) ((enrr) j).h("com/google/android/apps/messaging/dittosatellite/switcher/SatelliteExtensions", "launchDitto", 302, "SatelliteExtensions.java")).q("context is null.");
        } else {
            Intent intent = new Intent(context, (Class<?>) DittoWebActivity.class);
            intent.addFlags(65536);
            intent.addFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
            eldl.p(context, intent);
        }
    }

    @Override // defpackage.acio
    public final elfl a() {
        return ((acls) ((Optional) this.d.b()).get()).b().h(new emwl() { // from class: acxi
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ffbr ffbrVar;
                if (((acmd) obj) != acmd.UNKNOWN) {
                    return false;
                }
                acxj acxjVar = acxj.this;
                if (!acxjVar.e.c() || acxjVar.e.b() || ((ffbrVar = acxjVar.f) != null && !((ctvs) ffbrVar.b()).e())) {
                    return false;
                }
                ensk h = acxj.a.h();
                h.Y(ente.a, "DittoSatellite");
                ((enrr) ((enrr) h).h("com/google/android/apps/messaging/dittosatellite/switcher/SatelliteExtensions", "wantsToShowSwitcher", 181, "SatelliteExtensions.java")).q("wants to show switcher on LTE device.");
                return true;
            }
        }, erpp.a);
    }

    @Override // defpackage.acio
    public final Optional b(Activity activity) {
        return Optional.of(((akvg) this.k.b()).l(activity));
    }

    @Override // defpackage.acio
    public final void c() {
        Intent intent = new Intent(this.b, (Class<?>) DittoWebActivity.class);
        intent.addFlags(65536);
        intent.addFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
        this.b.startActivity(intent);
    }

    @Override // defpackage.acio
    public final void d(final Intent intent) {
        Optional empty;
        engw r;
        final acso acsoVar = (acso) this.l.b();
        if (intent == null || !("android.intent.action.SENDTO".equals(intent.getAction()) || "android.intent.action.SEND".equals(intent.getAction()) || "android.intent.action.SEND_MULTIPLE".equals(intent.getAction()))) {
            acso.a.r("Invalid or unsupported intent");
            if (intent != null && intent.getAction() != null) {
                acso.a.r("unsupported intent action: ".concat(String.valueOf(intent.getAction())));
            }
            empty = Optional.empty();
        } else {
            Optional a2 = ctbd.a(intent);
            Optional b = ((ctbd) acsoVar.b.b()).b(intent);
            final Intent intent2 = new Intent("ForwardDraftIntentToDittoAction");
            b.ifPresent(new Consumer() { // from class: acsf
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    intent2.putExtra("DittoDraftIntentRecipients", (String[]) obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            a2.ifPresent(new Consumer() { // from class: acsg
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    intent2.putExtra("DittoDraftIntentBody", (String) obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            if ("android.intent.action.SEND".equals(intent.getAction()) || "android.intent.action.SENDTO".equals(intent.getAction()) || "android.intent.action.VIEW".equals(intent.getAction())) {
                Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.STREAM");
                if (uri != null) {
                    r = engw.r(uri);
                    intent2.putParcelableArrayListExtra("DittoDraftIntentAttachments", (ArrayList) Collection.EL.stream(r).map(new Function() { // from class: acsh
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return Optional.ofNullable(((csum) acso.this.c.b()).b((Uri) obj));
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).filter(new Predicate() { // from class: acsi
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
                            return ((Optional) obj).isPresent();
                        }
                    }).map(new Function() { // from class: acsj
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return (Uri) ((Optional) obj).get();
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).filter(new Predicate() { // from class: acsk
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
                            Uri uri2 = (Uri) obj;
                            String path = uri2.getPath();
                            if (path == null || !csuu.v(uri2)) {
                                return true;
                            }
                            acso acsoVar2 = acso.this;
                            if (!((csum) acsoVar2.c.b()).e(new File(path))) {
                                return true;
                            }
                            ((akzt) acsoVar2.d.b()).c("Bugle.Share.InternalDataFile.AttachAborted");
                            return false;
                        }
                    }).map(new Function() { // from class: acsl
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            Optional ofNullable;
                            final Uri uri2 = (Uri) obj;
                            String type = intent.getType();
                            ctbd ctbdVar = (ctbd) acso.this.b.b();
                            if (le.x(type)) {
                                ofNullable = Optional.ofNullable(le.b(type));
                            } else if (uri2 == null || !((csuu) ctbdVar.e.b()).s(type)) {
                                ofNullable = Optional.ofNullable(type);
                            } else {
                                String type2 = ctbdVar.c.getContentResolver().getType(uri2);
                                if (type2 != null) {
                                    ofNullable = Optional.of(type2);
                                } else {
                                    ctee cteeVar = (ctee) ctbdVar.d.b();
                                    try {
                                        try {
                                            cteeVar.c(uri2);
                                            String e = cteeVar.e();
                                            if (e != null) {
                                                ofNullable = Optional.of(e);
                                            }
                                        } catch (IOException e2) {
                                            ensk h = ctbd.a.h();
                                            h.Y(ente.a, "Bugle");
                                            ((enrr) ((enrr) ((enrr) h).g(e2)).h("com/google/android/apps/messaging/shared/util/intent/IntentExtractor", "extractContentType", 228, "IntentExtractor.java")).t("Could not determine type of %s", uri2);
                                        }
                                        cteeVar.b();
                                        ofNullable = Optional.ofNullable(type);
                                    } finally {
                                        cteeVar.b();
                                    }
                                }
                            }
                            return ofNullable.map(new Function() { // from class: acse
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    return new acsd(uri2, (String) obj2);
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).filter(new Predicate() { // from class: acsi
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
                            return ((Optional) obj).isPresent();
                        }
                    }).map(new Function() { // from class: acsm
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return (DittoAttachment) ((Optional) obj).get();
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).collect(Collectors.toCollection(new Supplier() { // from class: acsn
                        @Override // java.util.function.Supplier
                        public final Object get() {
                            return new ArrayList();
                        }
                    })));
                    empty = Optional.of(intent2);
                } else {
                    ctbd.b.r("SEND or SENDTO actions do not have Uri");
                    int i = engw.d;
                    r = enou.a;
                    intent2.putParcelableArrayListExtra("DittoDraftIntentAttachments", (ArrayList) Collection.EL.stream(r).map(new Function() { // from class: acsh
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return Optional.ofNullable(((csum) acso.this.c.b()).b((Uri) obj));
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).filter(new Predicate() { // from class: acsi
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
                            return ((Optional) obj).isPresent();
                        }
                    }).map(new Function() { // from class: acsj
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return (Uri) ((Optional) obj).get();
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).filter(new Predicate() { // from class: acsk
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
                            Uri uri2 = (Uri) obj;
                            String path = uri2.getPath();
                            if (path == null || !csuu.v(uri2)) {
                                return true;
                            }
                            acso acsoVar2 = acso.this;
                            if (!((csum) acsoVar2.c.b()).e(new File(path))) {
                                return true;
                            }
                            ((akzt) acsoVar2.d.b()).c("Bugle.Share.InternalDataFile.AttachAborted");
                            return false;
                        }
                    }).map(new Function() { // from class: acsl
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            Optional ofNullable;
                            final Uri uri2 = (Uri) obj;
                            String type = intent.getType();
                            ctbd ctbdVar = (ctbd) acso.this.b.b();
                            if (le.x(type)) {
                                ofNullable = Optional.ofNullable(le.b(type));
                            } else if (uri2 == null || !((csuu) ctbdVar.e.b()).s(type)) {
                                ofNullable = Optional.ofNullable(type);
                            } else {
                                String type2 = ctbdVar.c.getContentResolver().getType(uri2);
                                if (type2 != null) {
                                    ofNullable = Optional.of(type2);
                                } else {
                                    ctee cteeVar = (ctee) ctbdVar.d.b();
                                    try {
                                        try {
                                            cteeVar.c(uri2);
                                            String e = cteeVar.e();
                                            if (e != null) {
                                                ofNullable = Optional.of(e);
                                            }
                                        } catch (IOException e2) {
                                            ensk h = ctbd.a.h();
                                            h.Y(ente.a, "Bugle");
                                            ((enrr) ((enrr) ((enrr) h).g(e2)).h("com/google/android/apps/messaging/shared/util/intent/IntentExtractor", "extractContentType", 228, "IntentExtractor.java")).t("Could not determine type of %s", uri2);
                                        }
                                        cteeVar.b();
                                        ofNullable = Optional.ofNullable(type);
                                    } finally {
                                        cteeVar.b();
                                    }
                                }
                            }
                            return ofNullable.map(new Function() { // from class: acse
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    return new acsd(uri2, (String) obj2);
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).filter(new Predicate() { // from class: acsi
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
                            return ((Optional) obj).isPresent();
                        }
                    }).map(new Function() { // from class: acsm
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return (DittoAttachment) ((Optional) obj).get();
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).collect(Collectors.toCollection(new Supplier() { // from class: acsn
                        @Override // java.util.function.Supplier
                        public final Object get() {
                            return new ArrayList();
                        }
                    })));
                    empty = Optional.of(intent2);
                }
            } else {
                if ("android.intent.action.SEND_MULTIPLE".equals(intent.getAction())) {
                    ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("android.intent.extra.STREAM");
                    if (parcelableArrayListExtra != null) {
                        Stream filter = Collection.EL.stream(parcelableArrayListExtra).filter(new Predicate() { // from class: ctbb
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
                                return Objects.nonNull((Uri) obj);
                            }
                        });
                        int i2 = engw.d;
                        r = (engw) filter.collect(endq.a);
                        intent2.putParcelableArrayListExtra("DittoDraftIntentAttachments", (ArrayList) Collection.EL.stream(r).map(new Function() { // from class: acsh
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                return Optional.ofNullable(((csum) acso.this.c.b()).b((Uri) obj));
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }).filter(new Predicate() { // from class: acsi
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
                                return ((Optional) obj).isPresent();
                            }
                        }).map(new Function() { // from class: acsj
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                return (Uri) ((Optional) obj).get();
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }).filter(new Predicate() { // from class: acsk
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
                                Uri uri2 = (Uri) obj;
                                String path = uri2.getPath();
                                if (path == null || !csuu.v(uri2)) {
                                    return true;
                                }
                                acso acsoVar2 = acso.this;
                                if (!((csum) acsoVar2.c.b()).e(new File(path))) {
                                    return true;
                                }
                                ((akzt) acsoVar2.d.b()).c("Bugle.Share.InternalDataFile.AttachAborted");
                                return false;
                            }
                        }).map(new Function() { // from class: acsl
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                Optional ofNullable;
                                final Uri uri2 = (Uri) obj;
                                String type = intent.getType();
                                ctbd ctbdVar = (ctbd) acso.this.b.b();
                                if (le.x(type)) {
                                    ofNullable = Optional.ofNullable(le.b(type));
                                } else if (uri2 == null || !((csuu) ctbdVar.e.b()).s(type)) {
                                    ofNullable = Optional.ofNullable(type);
                                } else {
                                    String type2 = ctbdVar.c.getContentResolver().getType(uri2);
                                    if (type2 != null) {
                                        ofNullable = Optional.of(type2);
                                    } else {
                                        ctee cteeVar = (ctee) ctbdVar.d.b();
                                        try {
                                            try {
                                                cteeVar.c(uri2);
                                                String e = cteeVar.e();
                                                if (e != null) {
                                                    ofNullable = Optional.of(e);
                                                }
                                            } catch (IOException e2) {
                                                ensk h = ctbd.a.h();
                                                h.Y(ente.a, "Bugle");
                                                ((enrr) ((enrr) ((enrr) h).g(e2)).h("com/google/android/apps/messaging/shared/util/intent/IntentExtractor", "extractContentType", 228, "IntentExtractor.java")).t("Could not determine type of %s", uri2);
                                            }
                                            cteeVar.b();
                                            ofNullable = Optional.ofNullable(type);
                                        } finally {
                                            cteeVar.b();
                                        }
                                    }
                                }
                                return ofNullable.map(new Function() { // from class: acse
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo448andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj2) {
                                        return new acsd(uri2, (String) obj2);
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                });
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }).filter(new Predicate() { // from class: acsi
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
                                return ((Optional) obj).isPresent();
                            }
                        }).map(new Function() { // from class: acsm
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                return (DittoAttachment) ((Optional) obj).get();
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }).collect(Collectors.toCollection(new Supplier() { // from class: acsn
                            @Override // java.util.function.Supplier
                            public final Object get() {
                                return new ArrayList();
                            }
                        })));
                        empty = Optional.of(intent2);
                    } else {
                        ctbd.b.r("SEND_MULTIPLE action does not have Uris");
                    }
                } else {
                    ctbd.b.r("Unsupported action type for extracting attachment uri: ".concat(String.valueOf(intent.getAction())));
                }
                int i3 = engw.d;
                r = enou.a;
                intent2.putParcelableArrayListExtra("DittoDraftIntentAttachments", (ArrayList) Collection.EL.stream(r).map(new Function() { // from class: acsh
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return Optional.ofNullable(((csum) acso.this.c.b()).b((Uri) obj));
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).filter(new Predicate() { // from class: acsi
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
                        return ((Optional) obj).isPresent();
                    }
                }).map(new Function() { // from class: acsj
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return (Uri) ((Optional) obj).get();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).filter(new Predicate() { // from class: acsk
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
                        Uri uri2 = (Uri) obj;
                        String path = uri2.getPath();
                        if (path == null || !csuu.v(uri2)) {
                            return true;
                        }
                        acso acsoVar2 = acso.this;
                        if (!((csum) acsoVar2.c.b()).e(new File(path))) {
                            return true;
                        }
                        ((akzt) acsoVar2.d.b()).c("Bugle.Share.InternalDataFile.AttachAborted");
                        return false;
                    }
                }).map(new Function() { // from class: acsl
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        Optional ofNullable;
                        final Uri uri2 = (Uri) obj;
                        String type = intent.getType();
                        ctbd ctbdVar = (ctbd) acso.this.b.b();
                        if (le.x(type)) {
                            ofNullable = Optional.ofNullable(le.b(type));
                        } else if (uri2 == null || !((csuu) ctbdVar.e.b()).s(type)) {
                            ofNullable = Optional.ofNullable(type);
                        } else {
                            String type2 = ctbdVar.c.getContentResolver().getType(uri2);
                            if (type2 != null) {
                                ofNullable = Optional.of(type2);
                            } else {
                                ctee cteeVar = (ctee) ctbdVar.d.b();
                                try {
                                    try {
                                        cteeVar.c(uri2);
                                        String e = cteeVar.e();
                                        if (e != null) {
                                            ofNullable = Optional.of(e);
                                        }
                                    } catch (IOException e2) {
                                        ensk h = ctbd.a.h();
                                        h.Y(ente.a, "Bugle");
                                        ((enrr) ((enrr) ((enrr) h).g(e2)).h("com/google/android/apps/messaging/shared/util/intent/IntentExtractor", "extractContentType", 228, "IntentExtractor.java")).t("Could not determine type of %s", uri2);
                                    }
                                    cteeVar.b();
                                    ofNullable = Optional.ofNullable(type);
                                } finally {
                                    cteeVar.b();
                                }
                            }
                        }
                        return ofNullable.map(new Function() { // from class: acse
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                return new acsd(uri2, (String) obj2);
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).filter(new Predicate() { // from class: acsi
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
                        return ((Optional) obj).isPresent();
                    }
                }).map(new Function() { // from class: acsm
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return (DittoAttachment) ((Optional) obj).get();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).collect(Collectors.toCollection(new Supplier() { // from class: acsn
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return new ArrayList();
                    }
                })));
                empty = Optional.of(intent2);
            }
        }
        if (!empty.isPresent()) {
            c();
            return;
        }
        ((Intent) empty.get()).setClass(this.b, DittoWebActivity.class);
        ((Intent) empty.get()).addFlags(65536);
        ((Intent) empty.get()).addFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
        eldl.p(this.b, (Intent) empty.get());
    }

    @Override // defpackage.acio
    public final void e(Intent intent, ea eaVar) {
        this.i = eaVar.O(new ael(), this.m);
        this.j = intent;
    }

    @Override // defpackage.acio
    public final void f(ejwl ejwlVar, adg adgVar) {
        this.h = adgVar;
        if (((Optional) this.d.b()).isPresent()) {
            ejwlVar.b(((acls) ((Optional) this.d.b()).get()).a(), this.n);
            return;
        }
        ensk j = a.j();
        j.Y(ente.a, "DittoSatellite");
        ((enrr) ((enrr) j).h("com/google/android/apps/messaging/dittosatellite/switcher/SatelliteExtensions", "registerSubscriptionMixin", 230, "SatelliteExtensions.java")).q("SatelliteDataService is empty, cannot get shouldLaunchSwitcher.");
    }

    @Override // defpackage.acio
    public final void g(acmd acmdVar) {
        ((acxo) this.c.b()).a(acmdVar);
    }

    @Override // defpackage.acio
    public final void h(boolean z) {
        if (z) {
            ensk h = a.h();
            h.Y(ente.a, "DittoSatellite");
            ((enrr) ((enrr) h).h("com/google/android/apps/messaging/dittosatellite/switcher/SatelliteExtensions", "showSwitcherOnDittoSatelliteIfNeeded", 256, "SatelliteExtensions.java")).q("show switcher on DittoSatellite");
            ((acxo) this.c.b()).b(acmd.REMOTE, true);
        }
    }

    @Override // defpackage.acio
    public final void i() {
        ensk h = a.h();
        h.Y(ente.a, "DittoSatellite");
        ((enrr) ((enrr) h).h("com/google/android/apps/messaging/dittosatellite/switcher/SatelliteExtensions", "showSwitcherOnHome", 248, "SatelliteExtensions.java")).q("show switcher on Bugle HomeActivity");
        ((acxo) this.c.b()).b(acmd.STANDALONE, true);
    }

    @Override // defpackage.acio
    public final void j(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(R.menu.ditto_home_menu, menu);
    }

    @Override // defpackage.acio
    public final void k(Toolbar toolbar) {
        toolbar.o(R.menu.ditto_home_menu);
    }

    @Override // defpackage.acio
    public final boolean l() {
        return this.e.b();
    }

    @Override // defpackage.acio
    public final boolean m() {
        return true;
    }

    @Override // defpackage.acio
    public final boolean n(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.action_choose_texting_mode) {
            return false;
        }
        ((acxo) this.c.b()).a(acmd.STANDALONE);
        return true;
    }
}
