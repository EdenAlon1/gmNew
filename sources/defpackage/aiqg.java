package defpackage;

import android.app.NotificationChannel;
import android.content.Intent;
import androidx.preference.TwoStatePreference;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aiqg {
    public static final cskc a = cskc.g("Bugle", "NotificationSettingsFragmentPeer");
    public final aipz b;
    public final ejwl c;
    public final ejlq d;
    public final elhk e;
    public final Optional f;
    public final altk g;
    public final ctia h;
    public final cthp i;
    public final ctyz j;
    public final ejwd k = new ejwd<Boolean>() { // from class: aiqg.1
        @Override // defpackage.ejwd
        public final void a(Throwable th) {
            aiqg.this.n.ifPresent(new Consumer() { // from class: aiqd
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    ((TwoStatePreference) obj).G(true);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            aiqg.a.n("Failed to load reminder setting data");
        }

        @Override // defpackage.ejwd
        public final /* bridge */ /* synthetic */ void b(Object obj) {
            final Boolean bool = (Boolean) obj;
            aiqg.this.n.ifPresent(new Consumer() { // from class: aiqe
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj2) {
                    TwoStatePreference twoStatePreference = (TwoStatePreference) obj2;
                    twoStatePreference.G(true);
                    twoStatePreference.k(bool.booleanValue());
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }

        @Override // defpackage.ejwd
        public final void hB() {
            aiqg.this.n.ifPresent(new Consumer() { // from class: aiqf
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    ((TwoStatePreference) obj).G(false);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
    };
    public final ejlr l = new ejlr<Boolean, Void>() { // from class: aiqg.2
        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void b(Object obj) {
            aiqg.this.n.ifPresent(new Consumer() { // from class: aiqk
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj2) {
                    ((TwoStatePreference) obj2).G(false);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }

        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            aiqg.this.n.ifPresent(new Consumer() { // from class: aiqj
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj3) {
                    ((TwoStatePreference) obj3).G(true);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }

        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void m(Object obj, Throwable th) {
            final Boolean bool = (Boolean) obj;
            aiqg.this.n.ifPresent(new Consumer() { // from class: aiqh
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj2) {
                    ((TwoStatePreference) obj2).k(!bool.booleanValue());
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            aiqg.this.n.ifPresent(new Consumer() { // from class: aiqi
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj2) {
                    ((TwoStatePreference) obj2).G(true);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            aiqg.a.n("Failed to save reminder action setting");
        }
    };
    public final ejlr m = new ejlr<Void, Void>() { // from class: aiqg.3
        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void b(Object obj) {
        }

        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            Intent intent = new Intent("android.settings.APP_NOTIFICATION_SETTINGS");
            intent.putExtra("android.provider.extra.APP_PACKAGE", aiqg.this.h.a.getPackageName());
            aiqg aiqgVar = aiqg.this;
            aiqgVar.o = aiqgVar.i.f();
            aiqg.this.b.startActivityForResult(intent, 1001);
        }

        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void m(Object obj, Throwable th) {
            aiqg.a.n("Failed to enable default notification");
        }
    };
    public Optional n;
    public NotificationChannel o;

    public aiqg(aipz aipzVar, ejwl ejwlVar, ejlq ejlqVar, elhk elhkVar, Optional optional, altk altkVar, ctia ctiaVar, cthp cthpVar, ctyz ctyzVar) {
        this.b = aipzVar;
        this.c = ejwlVar;
        this.d = ejlqVar;
        this.e = elhkVar;
        this.g = altkVar;
        this.h = ctiaVar;
        this.i = cthpVar;
        this.f = optional;
        this.j = ctyzVar;
    }

    public final Optional a(int i) {
        aipz aipzVar = this.b;
        return Optional.ofNullable(aipzVar.a(aipzVar.Y(i)));
    }
}
