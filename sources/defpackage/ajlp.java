package defpackage;

import androidx.preference.TwoStatePreference;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajlp {
    public static final cskc a = cskc.g("Bugle", "PrivacySettingsFragmentPeer");
    public final ajlj b;
    public final ejwl c;
    public final ejlq d;
    public final elhk e;
    public final ffbr f;
    public Optional g;
    public final ejwd h = new ejwd<Boolean>() { // from class: ajlp.1
        @Override // defpackage.ejwd
        public final void a(Throwable th) {
            ajlp.this.g.ifPresent(new Consumer() { // from class: ajln
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    ((TwoStatePreference) obj).G(true);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            ajlp.a.o("Failed to load etouffee setting data", th);
        }

        @Override // defpackage.ejwd
        public final /* bridge */ /* synthetic */ void b(Object obj) {
            final Boolean bool = (Boolean) obj;
            ajlp.this.g.ifPresent(new Consumer() { // from class: ajlm
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj2) {
                    TwoStatePreference twoStatePreference = (TwoStatePreference) obj2;
                    twoStatePreference.k(bool.booleanValue());
                    twoStatePreference.G(true);
                    twoStatePreference.N(true);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }

        @Override // defpackage.ejwd
        public final void hB() {
            ajlp.this.g.ifPresent(new Consumer() { // from class: ajlo
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
    public final ejlr i = new ejlr<Boolean, Void>() { // from class: ajlp.2
        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void b(Object obj) {
            ajlp.this.g.ifPresent(new Consumer() { // from class: ajlq
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
            ajlp.this.g.ifPresent(new Consumer() { // from class: ajls
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
            ajlp.this.g.ifPresent(new Consumer() { // from class: ajlr
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj2) {
                    TwoStatePreference twoStatePreference = (TwoStatePreference) obj2;
                    twoStatePreference.k(!bool.booleanValue());
                    twoStatePreference.G(true);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            ajlp.a.o("Failed to save etouffee setting data", th);
        }
    };

    public ajlp(ajlj ajljVar, ejwl ejwlVar, ejlq ejlqVar, elhk elhkVar, ffbr ffbrVar) {
        this.b = ajljVar;
        this.c = ejwlVar;
        this.d = ejlqVar;
        this.e = elhkVar;
        this.f = ffbrVar;
    }
}
