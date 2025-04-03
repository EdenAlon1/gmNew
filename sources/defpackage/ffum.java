package defpackage;

import java.util.ArrayList;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffum implements fftx {
    public final ffuv a;
    private final ffqn c;
    public final ffqk b = new ffqk(false, ffqo.a);
    private final ffqn d = new ffqn(null, ffqo.a);

    public ffum(ffuv ffuvVar, Throwable th) {
        this.a = ffuvVar;
        this.c = new ffqn(th, ffqo.a);
    }

    public final Object c() {
        return this.d.a;
    }

    public final Throwable d() {
        return (Throwable) this.c.a;
    }

    public final void e(Throwable th) {
        Throwable d = d();
        if (d == null) {
            this.c.c(th);
            return;
        }
        if (th == d) {
            return;
        }
        Object c = c();
        if (c == null) {
            f(th);
            return;
        }
        if (!(c instanceof Throwable)) {
            if (c instanceof ArrayList) {
                ((ArrayList) c).add(th);
                return;
            } else {
                Objects.toString(c);
                throw new IllegalStateException("State is ".concat(c.toString()));
            }
        }
        if (th != c) {
            ArrayList arrayList = new ArrayList(4);
            arrayList.add(c);
            arrayList.add(th);
            f(arrayList);
        }
    }

    public final void f(Object obj) {
        this.d.c(obj);
    }

    public final boolean g() {
        return d() != null;
    }

    public final boolean h() {
        return this.b.a();
    }

    @Override // defpackage.fftx
    public final ffuv hN() {
        return this.a;
    }

    @Override // defpackage.fftx
    public final boolean hP() {
        return d() == null;
    }

    public final String toString() {
        return "Finishing[cancelling=" + g() + ", completing=" + h() + ", rootCause=" + d() + ", exceptions=" + c() + ", list=" + this.a + "]";
    }
}
