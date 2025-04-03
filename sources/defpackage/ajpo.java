package defpackage;

import android.app.Notification;
import android.app.NotificationChannel;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.SystemClock;
import android.util.Size;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import com.google.android.apps.messaging.R;
import com.google.common.util.concurrent.SettableFuture;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class ajpo extends cims implements cipz {
    public static final entd a = entd.c("BugleNotifications");
    protected final Context b;
    protected final cins c;
    protected final ctia d;
    protected final cthp e;
    protected final cthz f;
    protected final ffbr g;
    protected final Optional h;
    protected final Optional i;
    protected final cwmm j;
    final List k;
    kml l;
    protected String m;
    protected CharSequence n;
    protected String o;

    public ajpo(Context context, final cthp cthpVar, cins cinsVar, ctia ctiaVar, cthz cthzVar, ffbr ffbrVar, Optional optional, Optional optional2, List list, cine cineVar, cwmm cwmmVar, String str) {
        super(cineVar.b(cinj.REMINDER, str, new cipf() { // from class: ajpl
            @Override // defpackage.cipf
            public final NotificationChannel a() {
                entd entdVar = ajpo.a;
                return cthp.this.h();
            }
        }));
        this.m = null;
        this.n = null;
        this.o = null;
        this.b = context;
        this.c = cinsVar;
        this.d = ctiaVar;
        this.e = cthpVar;
        this.f = cthzVar;
        this.g = ffbrVar;
        this.h = optional;
        this.i = optional2;
        this.k = list;
        this.j = cwmmVar;
    }

    @Override // defpackage.cims, defpackage.cink
    public final Notification b() {
        return this.l.a();
    }

    protected abstract List e();

    protected abstract void f();

    protected abstract void g();

    protected abstract void h();

    protected abstract void i();

    protected abstract boolean j();

    final Uri k() {
        Uri sound;
        NotificationChannel h = this.e.h();
        if (h == null) {
            return null;
        }
        sound = h.getSound();
        return sound;
    }

    final void l() {
        if (j()) {
            Uri k = k();
            if (k != null) {
                final cthz cthzVar = this.f;
                if (cthzVar.e.getRingerMode() != 2) {
                    ((ensz) ((ensz) cthz.a.h()).h("com/google/android/apps/messaging/shared/util/notifications/NotificationSoundUtil", "playNotificationSound", 178, "NotificationSoundUtil.java")).q("Ringer mode silenced: notification sound not played");
                } else if (((Boolean) cthz.b.e()).booleanValue()) {
                    ctcp ctcpVar = new ctcp();
                    ctcpVar.a = new ctcl(k);
                    ctcpVar.d(0.25f);
                    ctcpVar.b(new AudioAttributes.Builder().setUsage(8).build());
                    ctcpVar.c(new ctcr());
                    axnw.h(cthzVar.d.a(ctcpVar.a()).j(5L, TimeUnit.SECONDS, cthzVar.g).h(new emwl() { // from class: cthw
                        @Override // defpackage.emwl
                        public final Object apply(Object obj) {
                            ctck ctckVar = (ctck) obj;
                            ((ensz) ((ensz) cthz.a.h()).h("com/google/android/apps/messaging/shared/util/notifications/NotificationSoundUtil", "playWithBugleAudioPlayer", 288, "NotificationSoundUtil.java")).V(ctckVar);
                            return ctckVar;
                        }
                    }, erpp.a).e(TimeoutException.class, new emwl() { // from class: cthx
                        @Override // defpackage.emwl
                        public final Object apply(Object obj) {
                            ((ensz) ((ensz) cthz.a.h()).h("com/google/android/apps/messaging/shared/util/notifications/NotificationSoundUtil", "playWithBugleAudioPlayer", 295, "NotificationSoundUtil.java")).s("Playback didn't finish within: %d seconds", 5L);
                            return ctck.c(3);
                        }
                    }, erpp.a).e(ctcz.class, new emwl() { // from class: cthy
                        @Override // defpackage.emwl
                        public final Object apply(Object obj) {
                            ((ensz) ((ensz) ((ensz) cthz.a.j()).g((ctcz) obj)).h("com/google/android/apps/messaging/shared/util/notifications/NotificationSoundUtil", "playWithBugleAudioPlayer", 303, "NotificationSoundUtil.java")).q("Failed to play notification sound");
                            return ctck.c(2);
                        }
                    }, erpp.a));
                } else {
                    cqoh cqohVar = cthzVar.f;
                    AtomicLong atomicLong = cthzVar.h;
                    final long b = cqohVar.b();
                    atomicLong.set(b);
                    ctht cthtVar = cthzVar.c;
                    cthr cthrVar = new cthr();
                    cthrVar.d = SystemClock.elapsedRealtime();
                    cthrVar.a = 1;
                    cthrVar.b = k;
                    cthrVar.c = 0.25f;
                    cthrVar.e = SettableFuture.create();
                    synchronized (cthtVar.b) {
                        cthtVar.a(cthrVar);
                        cthtVar.j = 1;
                    }
                    elfl.g(cthrVar.e);
                    elfr.l(cthzVar.g.schedule(new Callable() { // from class: cthu
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            cthz cthzVar2 = cthz.this;
                            if (cthzVar2.h.get() != b) {
                                return false;
                            }
                            ctht cthtVar2 = cthzVar2.c;
                            synchronized (cthtVar2.b) {
                                if (cthtVar2.j != 2) {
                                    cthr cthrVar2 = new cthr();
                                    cthrVar2.d = SystemClock.elapsedRealtime();
                                    cthrVar2.a = 2;
                                    cthtVar2.a(cthrVar2);
                                    cthtVar2.j = 2;
                                }
                            }
                            return true;
                        }
                    }, 5L, TimeUnit.SECONDS), axnw.c(new Consumer() { // from class: cthv
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void o(Object obj) {
                            ((ensz) cthz.a.o().h("com/google/android/apps/messaging/shared/util/notifications/NotificationSoundUtil", "playNotificationSound", 213, "NotificationSoundUtil.java")).t("Notification sound playback stop %s", true != ((Boolean) obj).booleanValue() ? "not requested" : "requested");
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    }), erpp.a);
                }
            }
            String str = this.o;
            if (str != null) {
                final String[] strArr = {str};
                this.h.ifPresent(new Consumer() { // from class: ajpj
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        entd entdVar = ajpo.a;
                        csvs.c(((cnla) obj).c(strArr), "BugleNotifications", "Failed to dismiss reminders");
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
            ((ensz) a.o().h("com/google/android/apps/messaging/reminder/notification/ReminderNotification", "processAndPost", 189, "ReminderNotification.java")).q("Skip reminder notification as conversation is focused.");
            return;
        }
        kml kmlVar = new kml(this.b, o());
        this.l = kmlVar;
        kmlVar.r(R.drawable.notification_icon);
        kmlVar.C = this.b.getColor(R.color.primary_brand_non_icon_color);
        kmlVar.l = 4;
        kmlVar.t(k());
        kmlVar.g(true);
        Context context = this.b;
        cins cinsVar = this.c;
        Resources resources = context.getResources();
        Size size = ((cimw) cinsVar.e()).a;
        cins cinsVar2 = this.c;
        int width = size.getWidth();
        int height = ((cimw) cinsVar2.e()).a.getHeight();
        TypedValue typedValue = new TypedValue();
        resources.getValue(R.dimen.reminder_notification_large_icon_offset_percentage, typedValue, true);
        float f = typedValue.getFloat();
        float f2 = width;
        float f3 = height;
        int round = Math.round(f2 * f);
        int round2 = Math.round(f * f3);
        Bitmap decodeResource = BitmapFactory.decodeResource(resources, true != ddjr.c() ? R.drawable.quantum_ic_alarm_on_googblue_48 : R.drawable.quantum_ic_alarm_googblue_48);
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        if (!ddjr.c()) {
            Paint paint = new Paint(1);
            paint.setColor(this.b.getColor(R.color.reminder_notification_large_icon_border_color));
            float dimension = resources.getDimension(R.dimen.reminder_notification_large_icon_stroke_width);
            paint.setStrokeWidth(dimension);
            paint.setStyle(Paint.Style.STROKE);
            canvas.drawCircle(f2 / 2.0f, f3 / 2.0f, (Math.min(width, height) / 2.0f) - (dimension / 2.0f), paint);
        }
        Paint paint2 = new Paint(2);
        if (ddjr.c()) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(this.b, R.style.Theme_GoogleMaterial3_DayNight);
            Optional a2 = this.j.a();
            if (a2.isPresent()) {
                contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, ((Integer) a2.get()).intValue());
            }
            paint2.setColorFilter(new PorterDuffColorFilter(ehdr.d(contextThemeWrapper, R.attr.colorPrimary, "ReminderNotification"), PorterDuff.Mode.SRC_IN));
        }
        canvas.drawBitmap(decodeResource, new Rect(0, 0, decodeResource.getWidth(), decodeResource.getHeight()), new Rect(round, round2, width - round, height - round2), paint2);
        if (createBitmap != null) {
            this.l.m(createBitmap);
        }
        this.h.ifPresent(new Consumer() { // from class: ajpk
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ajpo ajpoVar = ajpo.this;
                ajpoVar.l.k(((cnla) obj).l(ajpoVar.n()));
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        g();
        f();
        h();
        i();
        synchronized (this.c) {
            this.c.I(this);
        }
    }

    @Override // defpackage.cipz
    public final void m() {
        final List e = e();
        this.i.ifPresent(new Consumer() { // from class: ajpi
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ddjq ddjqVar = (ddjq) obj;
                elfr.l(ddjqVar.a(), new ajpm(ajpo.this), erpp.a);
                ddjqVar.b(e);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        l();
    }

    public final String[] n() {
        return (String[]) Collection.EL.stream(this.k).map(new Function() { // from class: ajpg
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((ajpn) obj).e();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).toArray(new IntFunction() { // from class: ajph
            @Override // java.util.function.IntFunction
            public final Object apply(int i) {
                entd entdVar = ajpo.a;
                return new String[i];
            }
        });
    }
}
