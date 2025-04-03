package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class evfu extends fdxo {
    public final Executor a;
    public int d;
    public evft e;
    public fdxn f;
    public final evfs h;
    public fdxo j;
    private final fdxk k;
    private final febs l;
    private final engw m;
    private fdxj q;
    private int s;
    private febo t;
    public final Set b = enpw.j();
    private final LinkedHashMap n = new LinkedHashMap();
    private final Set o = enpw.j();
    public boolean g = false;
    public boolean i = false;
    public final Deque c = new ArrayDeque();
    private final Queue r = new ArrayDeque();
    private final Queue p = new ArrayDeque();

    public evfu(fdxk fdxkVar, febs febsVar, fdxj fdxjVar, engw engwVar) {
        this.k = fdxkVar;
        this.l = febsVar;
        this.q = fdxjVar;
        this.m = engwVar;
        this.e = new evft(((enou) engwVar).c, 1, 0, 0);
        Executor executor = fdxjVar.c;
        evfs evfsVar = new evfs(executor == null ? erpp.a : executor);
        this.h = evfsVar;
        final ersb ersbVar = new ersb(evfsVar);
        this.a = new Executor() { // from class: evfb
            @Override // java.util.concurrent.Executor
            public final void execute(final Runnable runnable) {
                final evfu evfuVar = evfu.this;
                ersbVar.execute(new Runnable() { // from class: evfk
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            runnable.run();
                        } catch (Throwable th) {
                            evfu evfuVar2 = evfu.this;
                            evfuVar2.i = true;
                            fdxn fdxnVar = evfuVar2.f;
                            if (fdxnVar != null) {
                                fdxnVar.a(Status.c(th), new febo());
                                fdxo fdxoVar = evfuVar2.j;
                                if (fdxoVar == null || evfuVar2.e.e != 4) {
                                    return;
                                }
                                fdxoVar.c(null, th);
                            }
                        }
                    }
                });
            }
        };
    }

    private final eves l(fdxj fdxjVar, febo feboVar, String str) {
        fdxjVar.getClass();
        feboVar.getClass();
        str.getClass();
        return new eves(this.l, fdxjVar, feboVar, str);
    }

    private final eves m(eves evesVar) {
        fdxj fdxjVar = this.q;
        return fdxjVar == evesVar.b ? evesVar : l(fdxjVar, evesVar.a, evesVar.d);
    }

    private final void n() {
        while (!this.c.isEmpty()) {
            evfr evfrVar = (evfr) this.c.peek();
            if (!evfrVar.b.isEmpty() || evfrVar.c != evfrVar.d.e.a) {
                return;
            }
            Object obj = ((evfr) this.c.poll()).a;
            if (this.e.e == 4) {
                this.j.f(obj);
            } else {
                this.p.add(obj);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void o(final evfr evfrVar, int i, int i2) {
        final evet evetVar = new evet(evfrVar.a);
        while (i < i2) {
            engw engwVar = (engw) this.m.get(i);
            int size = engwVar.size();
            int i3 = 0;
            while (i3 < size) {
                evew evewVar = (evew) engwVar.get(i3);
                evgb e = evewVar.e();
                if (e.d == 4) {
                    ListenableFuture a = e.a();
                    evfrVar.b.put(evewVar, a);
                    a.b(eldl.l(new Runnable() { // from class: evfa
                        @Override // java.lang.Runnable
                        public final void run() {
                            evfu.this.g(evetVar, evfrVar);
                        }
                    }), this.a);
                }
                i3++;
                if (q(e)) {
                    return;
                }
            }
            i++;
        }
        evfrVar.c = i2;
        if (evfrVar.b.isEmpty()) {
            n();
            h();
        }
    }

    private final void p() {
        evft evftVar;
        evft evftVar2 = this.e;
        emxf.m(!(evftVar2.e == 4), "UNDERLYING_CALL_STARTED state is terminal, cannot transition");
        int i = evftVar2.e;
        if (i == 3) {
            evftVar = new evft(evftVar2.a, 4, evftVar2.b, evftVar2.c);
        } else if (i == 1 && evftVar2.d) {
            int i2 = evftVar2.a;
            int i3 = evftVar2.b;
            evftVar = new evft(i2, 2, i3, i3);
        } else {
            int i4 = evftVar2.b;
            int i5 = i4 + 1;
            int i6 = evftVar2.a;
            int i7 = evftVar2.c;
            evftVar = i5 < i6 ? new evft(i6, 1, i5, i7) : new evft(i6, 3, i4, i7);
        }
        this.e = evftVar;
        int i8 = evftVar.e - 1;
        if (i8 == 0) {
            j(this.t);
            return;
        }
        if (i8 != 2) {
            i();
            return;
        }
        fdxo a = this.k.a(this.l, this.q);
        this.j = a;
        a.a(this.f, this.t);
        int i9 = this.d;
        if (i9 > 0) {
            this.j.e(i9);
        }
        Iterator it = this.p.iterator();
        while (it.hasNext()) {
            this.j.f(it.next());
        }
        if (this.g && this.c.isEmpty()) {
            this.j.d();
        }
        p();
    }

    private final boolean q(evgb evgbVar) {
        int i = evgbVar.d - 1;
        if (i == 0) {
            fdxj fdxjVar = evgbVar.c;
            if (fdxjVar != null) {
                if (this.e.e != 1) {
                    IllegalStateException illegalStateException = new IllegalStateException("Cannot return proceedWithCallOptions() from message processing methods");
                    this.f.a(Status.c(illegalStateException), new febo());
                    if (this.e.e == 4) {
                        this.j.c("Interceptor returned invalid outcome", illegalStateException);
                    }
                    return true;
                }
                this.q = fdxjVar;
            }
            return false;
        }
        if (i != 1) {
            if (i != 3) {
                throw null;
            }
            final ListenableFuture a = evgbVar.a();
            this.b.add(a);
            a.b(eldl.l(new Runnable() { // from class: evfe
                @Override // java.lang.Runnable
                public final void run() {
                    evfu.this.b.remove(a);
                }
            }), this.a);
            return false;
        }
        evfx evfxVar = evgbVar.b;
        this.f.a(evfxVar.a, evfxVar.b);
        if (this.e.e == 4) {
            this.j.c("Aborted RPC with exception", evfxVar.a.t);
        }
        this.i = true;
        return true;
    }

    @Override // defpackage.fdxo
    public final void a(fdxn fdxnVar, final febo feboVar) {
        this.f = new evfq(this, new evgg(new evfw(fdxnVar, this.m, this.o)));
        this.t = feboVar;
        this.a.execute(eldl.l(new Runnable() { // from class: evff
            @Override // java.lang.Runnable
            public final void run() {
                evfu.this.j(feboVar);
            }
        }));
    }

    public final void b(final eves evesVar) {
        if (this.n.isEmpty()) {
            return;
        }
        Iterator it = this.n.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!((ListenableFuture) entry.getValue()).isDone()) {
                break;
            }
            it.remove();
            evew evewVar = (evew) entry.getKey();
            evgb a = evewVar.a(m(evesVar));
            if (a.d == 4) {
                ListenableFuture a2 = a.a();
                this.n.put(evewVar, a2);
                a2.b(eldl.l(new Runnable() { // from class: evfl
                    @Override // java.lang.Runnable
                    public final void run() {
                        evfu.this.b(evesVar);
                    }
                }), this.a);
            }
            if (q(a)) {
                return;
            }
        }
        if (!this.n.isEmpty() || this.i) {
            return;
        }
        p();
    }

    @Override // defpackage.fdxo
    public final void c(final String str, final Throwable th) {
        this.a.execute(eldl.l(new Runnable() { // from class: evfg
            @Override // java.lang.Runnable
            public final void run() {
                evfu evfuVar = evfu.this;
                Iterator it = evfuVar.b.iterator();
                while (it.hasNext()) {
                    ((ListenableFuture) it.next()).cancel(true);
                }
                fdxo fdxoVar = evfuVar.j;
                if (fdxoVar != null) {
                    fdxoVar.c(str, th);
                }
            }
        }));
    }

    @Override // defpackage.fdxo
    public final void d() {
        this.a.execute(eldl.l(new Runnable() { // from class: evfc
            @Override // java.lang.Runnable
            public final void run() {
                evfu evfuVar = evfu.this;
                if (evfuVar.i) {
                    return;
                }
                evfuVar.g = true;
                evfuVar.h();
            }
        }));
    }

    @Override // defpackage.fdxo
    public final void e(final int i) {
        synchronized (this.r) {
            this.s += i;
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        synchronized (this.r) {
            if (!this.r.isEmpty()) {
                int i2 = this.s;
                for (int i3 = 0; i3 < i2; i3++) {
                    Object poll = this.r.poll();
                    if (poll != null) {
                        arrayDeque.add(poll);
                        this.s--;
                    }
                }
                boolean isEmpty = this.r.isEmpty();
                Iterator it = arrayDeque.iterator();
                while (it.hasNext()) {
                    this.f.c(it.next());
                }
                if (isEmpty) {
                    this.f.a(Status.b, null);
                }
            }
        }
        this.a.execute(eldl.l(new Runnable() { // from class: evfd
            @Override // java.lang.Runnable
            public final void run() {
                evfu evfuVar = evfu.this;
                if (evfuVar.i) {
                    return;
                }
                int i4 = i;
                if (evfuVar.e.e == 4) {
                    evfuVar.j.e(i4);
                } else {
                    evfuVar.d += i4;
                }
            }
        }));
    }

    @Override // defpackage.fdxo
    public final void f(final Object obj) {
        this.a.execute(eldl.l(new Runnable() { // from class: evfh
            @Override // java.lang.Runnable
            public final void run() {
                evfu evfuVar = evfu.this;
                evfuVar.c.add(new evfr(evfuVar, obj));
                evfuVar.i();
            }
        }));
    }

    public final void g(final evet evetVar, final evfr evfrVar) {
        Iterator it = evfrVar.b.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!((ListenableFuture) entry.getValue()).isDone()) {
                break;
            }
            it.remove();
            evew evewVar = (evew) entry.getKey();
            evgb c = evewVar.c();
            if (c.d == 4) {
                ListenableFuture a = c.a();
                evfrVar.b.put(evewVar, a);
                a.b(eldl.l(new Runnable() { // from class: evfi
                    @Override // java.lang.Runnable
                    public final void run() {
                        evfu.this.g(evetVar, evfrVar);
                    }
                }), this.a);
            }
            if (q(c)) {
                return;
            }
        }
        if (evfrVar.b.isEmpty()) {
            n();
            h();
        }
    }

    public final void h() {
        if (this.g) {
            evfr evfrVar = (evfr) this.c.peekLast();
            int i = this.e.e - 1;
            if (i != 1) {
                if (i == 3 && evfrVar == null) {
                    this.j.d();
                    return;
                }
                return;
            }
            if (evfrVar == null || (evfrVar.b.isEmpty() && evfrVar.c == evfrVar.d.e.c + 1)) {
                p();
            }
        }
    }

    public final void i() {
        int i = this.e.e - 1;
        if (i != 1) {
            if (i != 3) {
                return;
            }
            for (evfr evfrVar : this.c) {
                o(evfrVar, evfrVar.c, this.e.a);
            }
            return;
        }
        for (evfr evfrVar2 : this.c) {
            int i2 = evfrVar2.c;
            int i3 = this.e.c;
            if (i2 <= i3) {
                o(evfrVar2, i2, i3 + 1);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j(febo feboVar) {
        final eves l = l(this.q, feboVar, this.k.b());
        engw engwVar = (engw) this.m.get(this.e.b);
        int size = engwVar.size();
        for (int i = 0; i < size; i++) {
            evew evewVar = (evew) engwVar.get(i);
            evgb b = evewVar.b(m(l));
            if (b.d == 4) {
                ListenableFuture a = b.a();
                this.n.put(evewVar, a);
                a.b(eldl.l(new Runnable() { // from class: evfj
                    @Override // java.lang.Runnable
                    public final void run() {
                        evfu.this.b(l);
                    }
                }), this.a);
            }
            if (q(b)) {
                return;
            }
            this.o.add(evewVar);
        }
        if (this.n.isEmpty()) {
            p();
        }
    }
}
