package defpackage;

import androidx.car.app.model.Alert;
import j$.util.function.Predicate$CC;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class eciv {
    public static eciu m() {
        ecim ecimVar = new ecim();
        ecimVar.c(false);
        ecimVar.d(false);
        ecimVar.b(0);
        ecimVar.g(false);
        ecimVar.e(Alert.DURATION_SHOW_INDEFINITELY);
        ecimVar.e = new Predicate() { // from class: ecit
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
                return true;
            }
        };
        return ecimVar;
    }

    public abstract int a();

    public abstract int b();

    public abstract ecfy c();

    public abstract Long d();

    public abstract String e();

    public abstract String f();

    public abstract Predicate g();

    public abstract fgmh h();

    public abstract fgqx i();

    public abstract boolean j();

    public abstract boolean k();

    public abstract boolean l();
}
