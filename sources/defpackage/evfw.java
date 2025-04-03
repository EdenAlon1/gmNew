package defpackage;

import io.grpc.Status;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Queue;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class evfw extends fdzb {
    public final LinkedHashMap a;
    public final LinkedHashMap b;
    public boolean c;
    public Status d;
    public febo e;
    private final engw g;
    private final Queue h;
    private final Set i;
    private int j;
    private boolean k;
    private boolean l;
    private febo m;

    public evfw(fdxn fdxnVar, engw engwVar, Set set) {
        super(fdxnVar);
        this.a = new LinkedHashMap();
        this.h = new ArrayDeque();
        this.b = new LinkedHashMap();
        this.g = engwVar;
        this.j = ((enou) engwVar).c;
        this.i = set;
    }

    private final void i() {
        if (g() || !this.h.isEmpty() || !this.l || this.c) {
            return;
        }
        f();
    }

    @Override // defpackage.fech, defpackage.fdxn
    public final void a(Status status, febo feboVar) {
        this.d = status;
        this.e = feboVar;
        this.l = true;
        i();
    }

    @Override // defpackage.fech, defpackage.fdxn
    public final void b(febo feboVar) {
        this.m = feboVar;
        new eveu(feboVar);
        Iterator it = enkr.f(this.g.subList(0, this.j)).iterator();
        while (it.hasNext()) {
            this.j--;
            for (evew evewVar : enkr.f((List) it.next())) {
                if (this.i.contains(evewVar)) {
                    try {
                        evewVar.f();
                    } catch (Throwable th) {
                        this.d = Status.c(th);
                        this.e = new febo();
                        f();
                        return;
                    }
                }
            }
            if (g()) {
                return;
            }
        }
        this.f.b(this.m);
        this.k = true;
        e();
    }

    @Override // defpackage.fdzc, defpackage.fdxn
    public final void c(Object obj) {
        this.h.add(new evfv(obj, ((enou) this.g).c));
        e();
    }

    public final void e() {
        if (this.k) {
            for (evfv evfvVar : this.h) {
                Iterator it = enkr.f(this.g.subList(0, evfvVar.c)).iterator();
                while (it.hasNext()) {
                    for (evew evewVar : enkr.f((List) it.next())) {
                        if (this.i.contains(evewVar)) {
                            new evev(evfvVar.a);
                            try {
                                evewVar.g();
                            } catch (Throwable th) {
                                this.d = Status.c(th);
                                this.e = new febo();
                                f();
                                this.c = true;
                                return;
                            }
                        }
                    }
                    if (evfvVar.a()) {
                        return;
                    } else {
                        evfvVar.c--;
                    }
                }
            }
            while (!this.h.isEmpty()) {
                evfv evfvVar2 = (evfv) this.h.peek();
                if (evfvVar2.a() || evfvVar2.c != 0) {
                    break;
                } else {
                    this.f.c(((evfv) this.h.poll()).a);
                }
            }
            i();
        }
    }

    public final void f() {
        Iterator it = enkr.f(this.g).iterator();
        while (it.hasNext()) {
            for (evew evewVar : enkr.f((List) it.next())) {
                ever everVar = new ever(this.d, this.e);
                if (this.i.contains(evewVar)) {
                    try {
                        evewVar.d(everVar);
                    } catch (Throwable th) {
                        this.d = Status.c(th);
                        this.e = new febo();
                    }
                }
            }
        }
        if (this.b.isEmpty()) {
            this.f.a(this.d, this.e);
        }
    }

    public final boolean g() {
        return !this.a.isEmpty();
    }
}
