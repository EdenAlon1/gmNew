package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class dzwu {
    private emxc a;
    public final Handler e;
    protected final Set f;

    public dzwu() {
        this.e = new Handler(Looper.getMainLooper());
        this.f = new HashSet();
        this.a = emux.a;
    }

    private final synchronized void d(int i) {
        int size = this.f.size() - i;
        if (size != 0) {
            if (this.f.size() == size) {
                a();
            } else if (this.f.isEmpty()) {
                b();
            }
        }
    }

    protected synchronized void a() {
    }

    protected synchronized void b() {
    }

    protected synchronized void c(Object obj) {
        if (this.a.g() && obj.equals(this.a.c())) {
            return;
        }
        this.a = emxc.j(obj);
        h(obj);
    }

    public final synchronized emxc e() {
        return this.a;
    }

    protected final synchronized void f() {
        this.a = emux.a;
    }

    public final void g() {
        j(new dzws(this));
    }

    protected final synchronized void h(final Object obj) {
        final enip o = enip.o(this.f);
        i(new Runnable() { // from class: dzwq
            @Override // java.lang.Runnable
            public final void run() {
                enqu listIterator = enip.this.listIterator();
                while (listIterator.hasNext()) {
                    ((dzwt) listIterator.next()).a(obj);
                }
            }
        });
    }

    protected final void i(Runnable runnable) {
        this.e.post(runnable);
    }

    public final synchronized void j(final dzwt dzwtVar) {
        Set set = this.f;
        int size = set.size();
        set.add(dzwtVar);
        if (this.a.g()) {
            final Object c = this.a.c();
            i(new Runnable() { // from class: dzwp
                @Override // java.lang.Runnable
                public final void run() {
                    dzwt.this.a(c);
                }
            });
        }
        d(size);
    }

    public final void k(dzwt dzwtVar) {
        j(new dzwr(this, dzwtVar));
    }

    public final synchronized void l(dzwt dzwtVar) {
        Set set = this.f;
        int size = set.size();
        set.remove(dzwtVar);
        d(size);
    }

    public dzwu(Object obj) {
        this.e = new Handler(Looper.getMainLooper());
        this.f = new HashSet();
        this.a = emxc.j(obj);
    }
}
