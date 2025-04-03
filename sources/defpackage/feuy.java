package defpackage;

import io.grpc.Status;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class feuy extends fecr implements fdzu {
    public static final Logger b = Logger.getLogger(feuy.class.getName());
    public static final fevd c = new feup();
    public Executor d;
    public final fdzj e;
    public final fdzj f;
    public final List g;
    public final fecw[] h;
    public final long i;
    public Status j;
    public boolean k;
    public boolean m;
    public final fdyn o;
    public final fdyv p;
    public final fdzq q;
    public final fejg r;
    public final fdyr s;
    private final fdzv t;
    private final ferd u;
    private boolean v;
    private boolean w;
    private boolean x;
    private final fenp y;
    public final Object l = new Object();
    public final Set n = new HashSet();

    public feuy(feva fevaVar, fenp fenpVar, fdyn fdynVar) {
        List unmodifiableList;
        ferd ferdVar = fevaVar.i;
        ferdVar.getClass();
        this.u = ferdVar;
        fenn fennVar = fevaVar.d;
        HashMap hashMap = new HashMap();
        Iterator it = fennVar.a.values().iterator();
        while (it.hasNext()) {
            for (fecz feczVar : ((fedb) it.next()).a()) {
                hashMap.put(feczVar.a.b, feczVar);
            }
        }
        DesugarCollections.unmodifiableList(new ArrayList(fennVar.a.values()));
        this.e = new feno(DesugarCollections.unmodifiableMap(hashMap));
        fdzj fdzjVar = fevaVar.h;
        fdzjVar.getClass();
        this.f = fdzjVar;
        this.y = fenpVar;
        synchronized (this.l) {
            unmodifiableList = DesugarCollections.unmodifiableList(engw.r(((fefl) fenpVar).b));
        }
        this.t = fdzv.b("Server", String.valueOf(unmodifiableList));
        fdynVar.getClass();
        this.o = new fdyn(fdynVar.f, fdynVar.g + 1);
        this.p = fevaVar.j;
        this.g = DesugarCollections.unmodifiableList(new ArrayList(fevaVar.e));
        List list = fevaVar.f;
        this.h = (fecw[]) list.toArray(new fecw[list.size()]);
        this.i = fevaVar.l;
        fdzq fdzqVar = fevaVar.r;
        this.q = fdzqVar;
        this.r = new fejg(fevs.a);
        fdyr fdyrVar = fevaVar.m;
        fdyrVar.getClass();
        this.s = fdyrVar;
        fdzq.b(fdzqVar.c, this);
    }

    @Override // defpackage.fecr
    public final /* bridge */ /* synthetic */ void a() {
        synchronized (this.l) {
            if (!this.w) {
                this.w = true;
                boolean z = this.v;
                if (!z) {
                    this.m = true;
                    d();
                }
                if (z) {
                    this.y.c();
                }
            }
        }
        Status withDescription = Status.p.withDescription("Server shutdownNow invoked");
        synchronized (this.l) {
            if (this.j != null) {
                return;
            }
            this.j = withDescription;
            ArrayList arrayList = new ArrayList(this.n);
            boolean z2 = this.k;
            if (z2) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((feve) arrayList.get(i)).g(withDescription);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.fecr
    public final /* bridge */ /* synthetic */ void b() {
        synchronized (this.l) {
            emxf.m(!this.v, "Already started");
            emxf.m(!this.w, "Shutting down");
            this.y.d(new feuq(this));
            ?? a = this.u.a();
            a.getClass();
            this.d = a;
            this.v = true;
        }
    }

    @Override // defpackage.feab
    public final fdzv c() {
        return this.t;
    }

    public final void d() {
        synchronized (this.l) {
            if (this.w && this.n.isEmpty() && this.m) {
                if (this.x) {
                    throw new AssertionError("Server already terminated");
                }
                this.x = true;
                fdzq fdzqVar = this.q;
                fdzq.c(fdzqVar.c, this);
                Executor executor = this.d;
                if (executor != null) {
                    this.u.b(executor);
                    this.d = null;
                }
                this.l.notifyAll();
            }
        }
    }

    public final String toString() {
        emwz b2 = emxa.b(this);
        b2.g("logId", this.t.a);
        b2.b("transportServer", this.y);
        return b2.toString();
    }
}
