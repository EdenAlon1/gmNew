package defpackage;

import j$.util.Map;
import j$.util.function.Function$CC;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class ceug {
    public static final cskc a = cskc.g("BugleWorkQueue", "ExecutionStateManager");
    public final dtuu b;
    private final ReentrantLock d = new ReentrantLock();
    final Map c = new HashMap();

    public ceug(dtuu dtuuVar) {
        this.b = dtuuVar;
    }

    final ceuc a(final ceze cezeVar) {
        return (ceuc) Map.EL.computeIfAbsent(this.c, Long.valueOf(cezeVar.l()), new Function() { // from class: ceud
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                ceuc ceucVar = new ceuc(((Long) obj).longValue());
                ceucVar.a = ceze.this.r();
                return ceucVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    final Object b(emyl emylVar) {
        this.d.lock();
        try {
            return emylVar.get();
        } finally {
            this.d.unlock();
        }
    }

    final void c(Runnable runnable) {
        this.d.lock();
        try {
            runnable.run();
        } finally {
            this.d.unlock();
        }
    }

    final void d() {
        boolean z = true;
        if (!this.b.i() && this.d.isHeldByCurrentThread()) {
            z = false;
        }
        emxf.m(z, "wrong locking order");
    }

    final void e(long j) {
        java.util.Map map = this.c;
        Long valueOf = Long.valueOf(j);
        if (map.containsKey(valueOf)) {
            this.c.remove(valueOf);
            return;
        }
        csjb b = a.b();
        b.I("trying to remove non-existent rowId");
        b.z("rowId", j);
        b.r();
        throw new ceul();
    }

    final void f(final ceze cezeVar, final ceyt ceytVar) {
        c(new Runnable() { // from class: ceue
            @Override // java.lang.Runnable
            public final void run() {
                csjb d = ceug.a.d();
                d.I("setFutureResult");
                ceze cezeVar2 = cezeVar;
                d.z("rowId", cezeVar2.l());
                final ceyt ceytVar2 = ceytVar;
                d.A("result", ceytVar2);
                d.r();
                ceug ceugVar = ceug.this;
                final ceuc a2 = ceugVar.a(cezeVar2);
                ceugVar.b.g(new dtut() { // from class: cetz
                    @Override // defpackage.dtut
                    public final ekzz a() {
                        return eleg.f("ExecutionState::runAfterCommit");
                    }
                }, null, new Runnable() { // from class: ceua
                    @Override // java.lang.Runnable
                    public final void run() {
                        ceuc.this.b.set(ceytVar2);
                    }
                });
            }
        });
    }

    final boolean g(ceze cezeVar) {
        return this.c.containsKey(Long.valueOf(cezeVar.l()));
    }
}
