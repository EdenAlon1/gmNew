package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mb {
    private static final Object b = new Object();
    private static Executor c;
    public Executor a;
    private final mr d;

    public mb(mr mrVar) {
        this.d = mrVar;
    }

    public final mc a() {
        if (this.a == null) {
            synchronized (b) {
                if (c == null) {
                    c = Executors.newFixedThreadPool(2);
                }
            }
            this.a = c;
        }
        return new mc(this.a, this.d);
    }
}
