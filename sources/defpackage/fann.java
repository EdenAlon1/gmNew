package defpackage;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fann {
    public final Deque a = new ArrayDeque(16);

    public static final void f(String str) {
        throw new IOException(str);
    }

    public static final void g(String str, Object... objArr) {
        f(String.format(str, objArr));
    }

    public final long a() {
        if (this.a.isEmpty()) {
            return 0L;
        }
        return ((Long) this.a.peek()).longValue();
    }

    public final void b() {
        if (this.a.isEmpty()) {
            return;
        }
        g("data item not completed, stackSize: %s scope: %s", Integer.valueOf(this.a.size()), Long.valueOf(a()));
    }

    public final void c(long j) {
        long a = a();
        if (a != j) {
            if (a != -1) {
                if (a != -2) {
                    return;
                } else {
                    a = -2;
                }
            }
            g("expected non-string scope or scope %s but found %s", Long.valueOf(j), Long.valueOf(a));
        }
    }

    public final void d(long j) {
        this.a.push(Long.valueOf(j));
    }

    public final void e(long j) {
        this.a.pop();
        this.a.push(Long.valueOf(j));
    }
}
