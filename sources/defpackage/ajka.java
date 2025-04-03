package defpackage;

import androidx.preference.TwoStatePreference;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajka {
    public static final cskc a = cskc.g("Bugle", "EtouffeeToggleFragmentPeer");
    public final ajju b;
    public final ffbr c;
    public final ffbr d;
    public final ffbr e;
    public final ffbr f;
    public final ffbr g;
    public Optional h = Optional.empty();
    public final ejwd i = new ejwd<Boolean>() { // from class: ajka.1
        @Override // defpackage.ejwd
        public final void a(Throwable th) {
            ajka.this.h.ifPresent(new Consumer() { // from class: ajjy
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    ((TwoStatePreference) obj).G(true);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            ajka.a.o("Failed to load etouffee setting data", th);
        }

        @Override // defpackage.ejwd
        public final /* bridge */ /* synthetic */ void b(Object obj) {
            final Boolean bool = (Boolean) obj;
            ajka.this.h.ifPresent(new Consumer() { // from class: ajjx
                @Override // java.util.function.Consumer
                public final void accept(Object obj2) {
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
            ajka.this.h.ifPresent(new Consumer() { // from class: ajjz
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    ((TwoStatePreference) obj).G(false);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
    };
    public final ejlr j = new ejlr<Boolean, Void>() { // from class: ajka.2
        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void b(Object obj) {
            ajka.this.h.ifPresent(new Consumer() { // from class: ajkd
                @Override // java.util.function.Consumer
                public final void accept(Object obj2) {
                    ((TwoStatePreference) obj2).G(false);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }

        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            ajka.this.h.ifPresent(new Consumer() { // from class: ajkb
                @Override // java.util.function.Consumer
                public final void accept(Object obj3) {
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
            ajka.this.h.ifPresent(new Consumer() { // from class: ajkc
                @Override // java.util.function.Consumer
                public final void accept(Object obj2) {
                    TwoStatePreference twoStatePreference = (TwoStatePreference) obj2;
                    twoStatePreference.k(!bool.booleanValue());
                    twoStatePreference.G(true);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            ajka.a.o("Failed to save etouffee setting data", th);
        }
    };

    public ajka(ajju ajjuVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5) {
        this.b = ajjuVar;
        this.c = ffbrVar2;
        this.d = ffbrVar3;
        this.e = ffbrVar4;
        this.f = ffbrVar;
        this.g = ffbrVar5;
    }
}
