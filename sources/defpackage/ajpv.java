package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ajpv extends ajpo {
    private final Optional r;

    public ajpv(Context context, cine cineVar, cthp cthpVar, ctia ctiaVar, cthz cthzVar, ffbr ffbrVar, cuxh cuxhVar, Optional optional, Optional optional2, Optional optional3, cins cinsVar, cwmm cwmmVar, List list) {
        super(context, cthpVar, cinsVar, ctiaVar, cthzVar, ffbrVar, optional, optional2, list, cineVar, cwmmVar, "Single Reminder Notification");
        emxf.b(list.size() == 1, "SingleReminderNotification should have exactly 1 ReminderNotificationInfo.");
        ajpn ajpnVar = (ajpn) list.get(0);
        this.m = context.getResources().getString(R.string.reminder_notification_title_prefix, cuxhVar.c(ajpnVar.d()));
        String string = ajpnVar.i() ? context.getResources().getString(R.string.reminder_notification_self_sender_name) : ajpnVar.h() ? ajpnVar.f() : null;
        String g = ajpnVar.g();
        String c = ajpnVar.c();
        if (!TextUtils.isEmpty(g)) {
            this.n = TextUtils.isEmpty(string) ? g : context.getResources().getString(R.string.reminder_notification_body, string, g);
        } else if (!TextUtils.isEmpty(c)) {
            this.n = ctiaVar.b(string, c);
        }
        this.o = ajpnVar.e();
        this.r = optional3;
    }

    @Override // defpackage.cims, defpackage.cink
    public final String d() {
        return (String) this.r.map(new Function() { // from class: ajpq
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                ajpv ajpvVar = ajpv.this;
                return ddjt.a(ajpvVar.b, ajpvVar.o);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(null);
    }

    @Override // defpackage.ajpo
    protected final List e() {
        ArrayList arrayList = new ArrayList();
        String str = this.o;
        if (str != null) {
            arrayList.add(str);
        }
        return arrayList;
    }

    @Override // defpackage.ajpo
    protected final void f() {
        this.h.ifPresent(new Consumer() { // from class: ajps
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ajpv ajpvVar = ajpv.this;
                klz klzVar = new klz(R.drawable.ic_check_circle_gray, ajpvVar.b.getString(R.string.reminder_notification_action_done), ((cnla) obj).m(((ajpn) ajpvVar.k.get(0)).e()));
                klzVar.d = false;
                ajpvVar.l.e(klzVar.a());
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        this.h.ifPresent(new Consumer() { // from class: ajpu
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ajpv ajpvVar = ajpv.this;
                PendingIntent o = ((cnla) obj).o(ajpvVar.b, ((ajpn) ajpvVar.k.get(0)).b(), ((ajpn) ajpvVar.k.get(0)).e());
                if (o != null) {
                    klz klzVar = new klz(R.drawable.quantum_ic_comment_grey600_24, ajpvVar.b.getString(R.string.reminder_notification_action_view), o);
                    klzVar.d = false;
                    ajpvVar.l.e(klzVar.a());
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        this.h.ifPresent(new Consumer() { // from class: ajpr
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ajpv ajpvVar = ajpv.this;
                klz klzVar = new klz(R.drawable.quantum_ic_alarm_grey600_24, ajpvVar.b.getString(R.string.reminder_notification_action_reminder_in_predefined_time), ((cnla) obj).n(((ajpn) ajpvVar.k.get(0)).b(), ((ajpn) ajpvVar.k.get(0)).e()));
                klzVar.d = false;
                ajpvVar.l.e(klzVar.a());
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    @Override // defpackage.ajpo
    protected final void g() {
        final ajpn ajpnVar = (ajpn) this.k.get(0);
        this.h.ifPresent(new Consumer() { // from class: ajpt
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ajpv ajpvVar = ajpv.this;
                Context context = ajpvVar.b;
                ajpn ajpnVar2 = ajpnVar;
                ajpvVar.l.g = ((cnla) obj).o(context, ajpnVar2.b(), ajpnVar2.e());
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    @Override // defpackage.ajpo
    protected final void h() {
        this.l.l();
        this.l.u = "reminder_notification_group_key";
    }

    @Override // defpackage.ajpo
    protected final void i() {
        ajpn ajpnVar = (ajpn) this.k.get(0);
        CharSequence a = this.d.a(this.m, ajpnVar.g(), ajpnVar.c());
        kml kmlVar = this.l;
        kmlVar.i(this.m);
        kmlVar.h(this.n);
        kmlVar.w(a);
        kmlVar.y(ajpnVar.a());
        kmlVar.u(new kme());
    }

    @Override // defpackage.ajpo
    protected final boolean j() {
        return ((carb) this.g.b()).f(((ajpn) this.k.get(0)).b());
    }
}
