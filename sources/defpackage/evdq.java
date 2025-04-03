package defpackage;

import java.util.ArrayDeque;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class evdq extends fdxo {
    public final Object a = new Object();
    public final Queue b = new ArrayDeque();
    public fdxo c;
    final /* synthetic */ fdxk d;
    final /* synthetic */ febs e;
    final /* synthetic */ fdxj f;

    public evdq(fdxk fdxkVar, febs febsVar, fdxj fdxjVar) {
        this.d = fdxkVar;
        this.e = febsVar;
        this.f = fdxjVar;
        this.c = fdxkVar.a(febsVar, fdxjVar);
    }

    @Override // defpackage.fdxo
    public final void a(final fdxn fdxnVar, febo feboVar) {
        synchronized (this.a) {
            final febo feboVar2 = new febo();
            feboVar2.f(feboVar);
            this.b.add(new Runnable() { // from class: evdo
                @Override // java.lang.Runnable
                public final void run() {
                    evdq.this.b().a(fdxnVar, feboVar2);
                }
            });
            b().a(new evdp(this, fdxnVar), feboVar);
        }
    }

    public final fdxo b() {
        fdxo fdxoVar;
        synchronized (this.a) {
            fdxoVar = this.c;
        }
        return fdxoVar;
    }

    @Override // defpackage.fdxo
    public final void c(final String str, final Throwable th) {
        synchronized (this.a) {
            this.b.add(new Runnable() { // from class: evdm
                @Override // java.lang.Runnable
                public final void run() {
                    evdq.this.b().c(str, th);
                }
            });
            b().c(str, th);
        }
    }

    @Override // defpackage.fdxo
    public final void d() {
        synchronized (this.a) {
            this.b.add(new Runnable() { // from class: evdk
                @Override // java.lang.Runnable
                public final void run() {
                    evdq.this.b().d();
                }
            });
            b().d();
        }
    }

    @Override // defpackage.fdxo
    public final void e(final int i) {
        synchronized (this.a) {
            this.b.add(new Runnable() { // from class: evdl
                @Override // java.lang.Runnable
                public final void run() {
                    evdq.this.b().e(i);
                }
            });
            b().e(i);
        }
    }

    @Override // defpackage.fdxo
    public final void f(final Object obj) {
        synchronized (this.a) {
            this.b.add(new Runnable() { // from class: evdn
                @Override // java.lang.Runnable
                public final void run() {
                    evdq.this.b().f(obj);
                }
            });
            b().f(obj);
        }
    }
}
