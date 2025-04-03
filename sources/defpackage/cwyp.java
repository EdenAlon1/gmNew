package defpackage;

import androidx.preference.SwitchPreferenceCompat;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwyp {
    public final ffbr a;
    public final ffbr b;
    public final ffbr c;
    public final ffbr d;
    public final ffbr e;
    public Optional f = Optional.empty();
    public Optional g = Optional.empty();
    public final ejwd h = new ejwd<ctsx>() { // from class: cwyp.1
        @Override // defpackage.ejwd
        public final void a(Throwable th) {
            cwyp.this.f.ifPresent(new Consumer() { // from class: cwyn
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    ((SwitchPreferenceCompat) obj).G(true);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            cwyp.this.g.ifPresent(new Consumer() { // from class: cwyo
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    ((SwitchPreferenceCompat) obj).G(true);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }

        @Override // defpackage.ejwd
        public final /* bridge */ /* synthetic */ void b(Object obj) {
            final ctsx ctsxVar = (ctsx) obj;
            cwyp.this.f.ifPresent(new Consumer() { // from class: cwyj
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj2) {
                    SwitchPreferenceCompat switchPreferenceCompat = (SwitchPreferenceCompat) obj2;
                    switchPreferenceCompat.k(ctsx.this.c);
                    switchPreferenceCompat.G(true);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            cwyp.this.g.ifPresent(new Consumer() { // from class: cwyk
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj2) {
                    SwitchPreferenceCompat switchPreferenceCompat = (SwitchPreferenceCompat) obj2;
                    switchPreferenceCompat.k(ctsx.this.e);
                    switchPreferenceCompat.G(true);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }

        @Override // defpackage.ejwd
        public final void hB() {
            cwyp.this.f.ifPresent(new Consumer() { // from class: cwyl
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    ((SwitchPreferenceCompat) obj).G(false);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            cwyp.this.g.ifPresent(new Consumer() { // from class: cwym
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    ((SwitchPreferenceCompat) obj).G(false);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
    };
    public final ejlr i = new ejlr<Boolean, Void>() { // from class: cwyp.2
        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void b(Object obj) {
            final Boolean bool = (Boolean) obj;
            cwyp.this.f.ifPresent(new Consumer() { // from class: cwys
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj2) {
                    SwitchPreferenceCompat switchPreferenceCompat = (SwitchPreferenceCompat) obj2;
                    switchPreferenceCompat.G(false);
                    switchPreferenceCompat.k(bool.booleanValue());
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }

        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            cwyp.this.f.ifPresent(new Consumer() { // from class: cwyr
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj3) {
                    ((SwitchPreferenceCompat) obj3).G(true);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }

        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void m(Object obj, Throwable th) {
            final Boolean bool = (Boolean) obj;
            cwyp.this.f.ifPresent(new Consumer() { // from class: cwyq
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj2) {
                    SwitchPreferenceCompat switchPreferenceCompat = (SwitchPreferenceCompat) obj2;
                    switchPreferenceCompat.k(!bool.booleanValue());
                    switchPreferenceCompat.G(true);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
    };
    public final ejlr j = new ejlr<Boolean, Void>() { // from class: cwyp.3
        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void b(Object obj) {
            final Boolean bool = (Boolean) obj;
            cwyp.this.g.ifPresent(new Consumer() { // from class: cwyv
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj2) {
                    SwitchPreferenceCompat switchPreferenceCompat = (SwitchPreferenceCompat) obj2;
                    switchPreferenceCompat.G(false);
                    switchPreferenceCompat.k(bool.booleanValue());
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }

        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            cwyp.this.g.ifPresent(new Consumer() { // from class: cwyu
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj3) {
                    ((SwitchPreferenceCompat) obj3).G(true);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }

        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void m(Object obj, Throwable th) {
            final Boolean bool = (Boolean) obj;
            cwyp.this.g.ifPresent(new Consumer() { // from class: cwyt
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj2) {
                    SwitchPreferenceCompat switchPreferenceCompat = (SwitchPreferenceCompat) obj2;
                    switchPreferenceCompat.k(!bool.booleanValue());
                    switchPreferenceCompat.G(true);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
    };

    public cwyp(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5) {
        this.a = ffbrVar;
        this.b = ffbrVar2;
        this.c = ffbrVar3;
        this.d = ffbrVar4;
        this.e = ffbrVar5;
    }

    public static boolean b() {
        return stl.a() && ((Boolean) ((cfup) stl.c.get()).e()).booleanValue();
    }

    public final Optional a(int i) {
        return Optional.ofNullable(((cwyb) this.a.b()).a(((cwyb) this.a.b()).Y(i)));
    }
}
