package defpackage;

import j$.util.function.Consumer$CC;
import java.util.Locale;
import java.util.Set;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class diza implements diyy {
    public final ecwj a;

    protected diza(ecwj ecwjVar) {
        this.a = ecwjVar;
    }

    @Override // defpackage.diyy
    public final Object a() {
        dizc.c.ifPresent(new Consumer() { // from class: diyz
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((Set) obj).add(diza.this.a.d());
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        try {
            return this.a.b();
        } catch (IllegalStateException | NullPointerException unused) {
            ecwj.f(((dizb) dipp.a(dizb.class)).y().a);
            return this.a.b();
        }
    }

    @Override // defpackage.diyy
    public final String b() {
        return this.a.d();
    }

    public final String toString() {
        return String.format(Locale.US, "%s: %s", b(), a());
    }
}
