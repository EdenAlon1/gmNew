package defpackage;

import android.view.Surface;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class awt implements bev {
    public final bev d;
    public auf e;
    private final Surface f;
    public final Object a = new Object();
    public int b = 0;
    public boolean c = false;
    private final auf g = new auf() { // from class: aws
        @Override // defpackage.auf
        public final void k(avr avrVar) {
            auf aufVar;
            awt awtVar = awt.this;
            synchronized (awtVar.a) {
                int i = awtVar.b - 1;
                awtVar.b = i;
                if (awtVar.c && i == 0) {
                    awtVar.i();
                }
                aufVar = awtVar.e;
            }
            if (aufVar != null) {
                aufVar.k(avrVar);
            }
        }
    };

    public awt(bev bevVar) {
        this.d = bevVar;
        this.f = bevVar.e();
    }

    private final avr l(avr avrVar) {
        if (avrVar == null) {
            return null;
        }
        this.b++;
        awv awvVar = new awv(avrVar);
        awvVar.g(this.g);
        return awvVar;
    }

    @Override // defpackage.bev
    public final int a() {
        int a;
        synchronized (this.a) {
            a = this.d.a();
        }
        return a;
    }

    @Override // defpackage.bev
    public final int b() {
        int b;
        synchronized (this.a) {
            b = this.d.b();
        }
        return b;
    }

    @Override // defpackage.bev
    public final int c() {
        int c;
        synchronized (this.a) {
            c = this.d.c();
        }
        return c;
    }

    @Override // defpackage.bev
    public final int d() {
        int d;
        synchronized (this.a) {
            d = this.d.d();
        }
        return d;
    }

    @Override // defpackage.bev
    public final Surface e() {
        Surface e;
        synchronized (this.a) {
            e = this.d.e();
        }
        return e;
    }

    @Override // defpackage.bev
    public final avr f() {
        avr l;
        synchronized (this.a) {
            l = l(this.d.f());
        }
        return l;
    }

    @Override // defpackage.bev
    public final avr g() {
        avr l;
        synchronized (this.a) {
            l = l(this.d.g());
        }
        return l;
    }

    @Override // defpackage.bev
    public final void h() {
        synchronized (this.a) {
            this.d.h();
        }
    }

    @Override // defpackage.bev
    public final void i() {
        synchronized (this.a) {
            Surface surface = this.f;
            if (surface != null) {
                surface.release();
            }
            this.d.i();
        }
    }

    @Override // defpackage.bev
    public final void j(final beu beuVar, Executor executor) {
        synchronized (this.a) {
            this.d.j(new beu() { // from class: awr
                @Override // defpackage.beu
                public final void a(bev bevVar) {
                    beuVar.a(awt.this);
                }
            }, executor);
        }
    }

    public final void k() {
        synchronized (this.a) {
            this.c = true;
            this.d.h();
            if (this.b == 0) {
                i();
            }
        }
    }
}
