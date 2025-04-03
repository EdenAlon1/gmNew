package defpackage;

import android.os.Looper;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dftp<L> {
    public volatile Object a;
    public volatile dftn b;
    private final Executor c;

    public dftp(Looper looper, Object obj, String str) {
        this.c = new dfzd(looper);
        dfwv.o(obj, "Listener must not be null");
        this.a = obj;
        dfwv.l(str);
        this.b = new dftn(obj, str);
    }

    public final void a() {
        this.a = null;
        this.b = null;
    }

    public final void b(final dfto dftoVar) {
        this.c.execute(new Runnable() { // from class: dftm
            @Override // java.lang.Runnable
            public final void run() {
                dfto dftoVar2 = dftoVar;
                Object obj = dftp.this.a;
                if (obj == null) {
                    dftoVar2.b();
                    return;
                }
                try {
                    dftoVar2.a(obj);
                } catch (RuntimeException e) {
                    dftoVar2.b();
                    throw e;
                }
            }
        });
    }

    public dftp(Executor executor, Object obj, String str) {
        dfwv.o(executor, "Executor must not be null");
        this.c = executor;
        dfwv.o(obj, "Listener must not be null");
        this.a = obj;
        dfwv.l(str);
        this.b = new dftn(obj, str);
    }
}
