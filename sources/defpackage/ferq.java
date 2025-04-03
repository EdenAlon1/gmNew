package defpackage;

import io.grpc.Status;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ferq extends feaq {
    public static final Logger f = Logger.getLogger(ferq.class.getName());
    public final feai g;
    public final Map h;
    public final ferk i;
    public int j;
    public boolean k;
    public fedr l;
    public fdyc m;
    public fdyc n;
    public boolean o;
    public fedr p;
    public feml q;
    private final boolean r;
    private final boolean s;

    public ferq(feai feaiVar) {
        boolean z;
        if (!j()) {
            int i = ferx.b;
            if (fend.i("GRPC_PF_USE_HAPPY_EYEBALLS", false)) {
                z = true;
                this.r = z;
                this.h = new HashMap();
                int i2 = engw.d;
                this.i = new ferk(enou.a, z);
                this.j = 0;
                this.k = true;
                this.l = null;
                fdyc fdycVar = fdyc.IDLE;
                this.m = fdycVar;
                this.n = fdycVar;
                this.o = true;
                this.p = null;
                this.s = j();
                this.g = feaiVar;
            }
        }
        z = false;
        this.r = z;
        this.h = new HashMap();
        int i22 = engw.d;
        this.i = new ferk(enou.a, z);
        this.j = 0;
        this.k = true;
        this.l = null;
        fdyc fdycVar2 = fdyc.IDLE;
        this.m = fdycVar2;
        this.n = fdycVar2;
        this.o = true;
        this.p = null;
        this.s = j();
        this.g = feaiVar;
    }

    static boolean j() {
        return fend.i("GRPC_SERIALIZE_RETRIES", false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001a, code lost:
    
        if (r3.size() == 1) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.net.SocketAddress k(defpackage.fean r3) {
        /*
            feqa r3 = (defpackage.feqa) r3
            feqc r0 = r3.j
            feds r0 = r0.m
            r0.d()
            boolean r0 = r3.g
            java.lang.String r1 = "not started"
            defpackage.emxf.m(r0, r1)
            java.util.List r3 = r3.e
            r0 = 0
            if (r3 == 0) goto L1d
            int r1 = r3.size()
            r2 = 1
            if (r1 != r2) goto L1d
            goto L1e
        L1d:
            r2 = r0
        L1e:
            java.lang.String r1 = "%s does not have exactly one group"
            defpackage.emxf.p(r2, r1, r3)
            java.lang.Object r3 = r3.get(r0)
            fdyw r3 = (defpackage.fdyw) r3
            java.util.List r3 = r3.b
            java.lang.Object r3 = r3.get(r0)
            java.net.SocketAddress r3 = (java.net.SocketAddress) r3
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ferq.k(fean):java.net.SocketAddress");
    }

    private final void l() {
        if (this.r) {
            fedr fedrVar = this.l;
            if (fedrVar == null || !fedrVar.b()) {
                feai feaiVar = this.g;
                this.l = feaiVar.c().a(new ferh(this), 250L, TimeUnit.MILLISECONDS, feaiVar.d());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean m(engw engwVar) {
        HashSet<SocketAddress> hashSet = new HashSet(this.h.keySet());
        HashSet hashSet2 = new HashSet();
        for (int i = 0; i < ((enou) engwVar).c; i++) {
            hashSet2.addAll(((fdyw) engwVar.get(i)).b);
        }
        for (SocketAddress socketAddress : hashSet) {
            if (!hashSet2.contains(socketAddress)) {
                ((ferp) this.h.remove(socketAddress)).a.b();
            }
        }
        return hashSet.isEmpty();
    }

    @Override // defpackage.feaq
    public final Status a(feam feamVar) {
        ferl ferlVar;
        Boolean bool;
        if (this.m == fdyc.SHUTDOWN) {
            return Status.l.withDescription("Already shut down");
        }
        Boolean bool2 = (Boolean) feamVar.b.a(e);
        this.o = bool2 == null || !bool2.booleanValue();
        List<fdyw> list = feamVar.a;
        if (list.isEmpty()) {
            List list2 = feamVar.a;
            Status withDescription = Status.p.withDescription("NameResolver returned no usable address. addrs=" + String.valueOf(list2) + ", attrs=" + feamVar.b.toString());
            b(withDescription);
            return withDescription;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((fdyw) it.next()) == null) {
                List list3 = feamVar.a;
                Status withDescription2 = Status.p.withDescription("NameResolver returned address list with null endpoint. addrs=" + String.valueOf(list3) + ", attrs=" + feamVar.b.toString());
                b(withDescription2);
                return withDescription2;
            }
        }
        this.k = true;
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (fdyw fdywVar : list) {
            ArrayList arrayList2 = new ArrayList();
            for (SocketAddress socketAddress : fdywVar.b) {
                if (hashSet.add(socketAddress)) {
                    arrayList2.add(socketAddress);
                }
            }
            if (!arrayList2.isEmpty()) {
                arrayList.add(new fdyw(arrayList2, fdywVar.c));
            }
        }
        Object obj = feamVar.c;
        if ((obj instanceof ferl) && (bool = (ferlVar = (ferl) obj).a) != null && bool.booleanValue()) {
            Long l = ferlVar.b;
            Collections.shuffle(arrayList, new Random());
        }
        int i = engw.d;
        engr engrVar = new engr();
        engrVar.j(arrayList);
        engw g = engrVar.g();
        fdyc fdycVar = this.m;
        if (fdycVar == fdyc.READY || fdycVar == fdyc.CONNECTING) {
            ferk ferkVar = this.i;
            SocketAddress b = ferkVar.b();
            ferkVar.d(g);
            if (this.i.g(b)) {
                fean feanVar = ((ferp) this.h.get(b)).a;
                ferk ferkVar2 = this.i;
                if (!ferkVar2.f()) {
                    throw new IllegalStateException("Index is past the end of the address group list");
                }
                ferj ferjVar = (ferj) ferkVar2.a.get(ferkVar2.b);
                feanVar.d(Collections.singletonList(new fdyw(ferjVar.b, ferjVar.a)));
                m(g);
                return Status.b;
            }
        } else {
            this.i.d(g);
        }
        if (m(g)) {
            fdyc fdycVar2 = fdyc.CONNECTING;
            this.m = fdycVar2;
            h(fdycVar2, new ferm(feak.a));
        }
        fdyc fdycVar3 = this.m;
        if (fdycVar3 == fdyc.READY) {
            fdyc fdycVar4 = fdyc.IDLE;
            this.m = fdycVar4;
            h(fdycVar4, new fero(this, this));
        } else if (fdycVar3 == fdyc.CONNECTING || fdycVar3 == fdyc.TRANSIENT_FAILURE) {
            f();
            d();
        }
        return Status.b;
    }

    @Override // defpackage.feaq
    public final void b(Status status) {
        if (this.m == fdyc.SHUTDOWN) {
            return;
        }
        Iterator it = this.h.values().iterator();
        while (it.hasNext()) {
            ((ferp) it.next()).a.b();
        }
        this.h.clear();
        ferk ferkVar = this.i;
        int i = engw.d;
        ferkVar.d(enou.a);
        fdyc fdycVar = fdyc.TRANSIENT_FAILURE;
        this.m = fdycVar;
        h(fdycVar, new ferm(feak.b(status)));
    }

    @Override // defpackage.feaq
    public final void d() {
        if (!this.i.f() || this.m == fdyc.SHUTDOWN) {
            return;
        }
        ferk ferkVar = this.i;
        Map map = this.h;
        SocketAddress b = ferkVar.b();
        ferp ferpVar = (ferp) map.get(b);
        if (ferpVar == null) {
            ferk ferkVar2 = this.i;
            if (!ferkVar2.f()) {
                throw new IllegalStateException("Index is off the end of the address group list");
            }
            fdxd fdxdVar = ((ferj) ferkVar2.a.get(ferkVar2.b)).a;
            feri feriVar = new feri(this);
            feai feaiVar = this.g;
            fead feadVar = new fead();
            feadVar.c(enkr.c(new fdyw(b, fdxdVar)));
            feadVar.b(b, feriVar);
            feadVar.b(feaq.c, Boolean.valueOf(this.s));
            fean b2 = feaiVar.b(feadVar.a());
            final ferp ferpVar2 = new ferp(b2, fdyc.IDLE);
            feriVar.a = ferpVar2;
            this.h.put(b, ferpVar2);
            feaf feafVar = ((feqa) b2).a;
            if (this.o || feafVar.b.a(feaq.d) == null) {
                ferpVar2.d = fdyd.a(fdyc.READY);
            }
            b2.c(new feap() { // from class: ferf
                @Override // defpackage.feap
                public final void a(fdyd fdydVar) {
                    fdyc fdycVar;
                    ferq ferqVar = ferq.this;
                    Map map2 = ferqVar.h;
                    ferp ferpVar3 = ferpVar2;
                    if (ferpVar3 == map2.get(ferq.k(ferpVar3.a)) && (fdycVar = fdydVar.a) != fdyc.SHUTDOWN) {
                        if (fdycVar == fdyc.IDLE && ferpVar3.b == fdyc.READY) {
                            ferqVar.g.e();
                        }
                        ferpVar3.b(fdycVar);
                        fdyc fdycVar2 = ferqVar.m;
                        fdyc fdycVar3 = fdyc.TRANSIENT_FAILURE;
                        if (fdycVar2 == fdycVar3 || ferqVar.n == fdycVar3) {
                            if (fdycVar == fdyc.CONNECTING) {
                                return;
                            }
                            if (fdycVar == fdyc.IDLE) {
                                ferqVar.d();
                                return;
                            }
                        }
                        int ordinal = fdycVar.ordinal();
                        if (ordinal == 0) {
                            fdyc fdycVar4 = fdyc.CONNECTING;
                            ferqVar.m = fdycVar4;
                            ferqVar.h(fdycVar4, new ferm(feak.a));
                            return;
                        }
                        if (ordinal == 1) {
                            fedr fedrVar = ferqVar.p;
                            if (fedrVar != null) {
                                fedrVar.a();
                                ferqVar.p = null;
                            }
                            ferqVar.q = null;
                            ferqVar.f();
                            for (ferp ferpVar4 : ferqVar.h.values()) {
                                if (!ferpVar4.a.equals(ferpVar3.a)) {
                                    ferpVar4.a.b();
                                }
                            }
                            ferqVar.h.clear();
                            ferpVar3.b(fdyc.READY);
                            ferqVar.h.put(ferq.k(ferpVar3.a), ferpVar3);
                            ferqVar.i.g(ferq.k(ferpVar3.a));
                            ferqVar.m = fdyc.READY;
                            ferqVar.i(ferpVar3);
                            return;
                        }
                        if (ordinal != 2) {
                            if (ordinal != 3) {
                                throw new IllegalArgumentException("Unsupported state:".concat(fdycVar.toString()));
                            }
                            ferqVar.i.c();
                            fdyc fdycVar5 = fdyc.IDLE;
                            ferqVar.m = fdycVar5;
                            ferqVar.h(fdycVar5, new fero(ferqVar, ferqVar));
                            return;
                        }
                        if (ferqVar.i.f() && ferqVar.h.get(ferqVar.i.b()) == ferpVar3) {
                            if (ferqVar.i.e()) {
                                ferqVar.f();
                                ferqVar.d();
                            } else if (ferqVar.h.size() >= ferqVar.i.a()) {
                                ferqVar.g();
                            } else {
                                ferqVar.i.c();
                                ferqVar.d();
                            }
                        }
                        if (ferqVar.h.size() >= ferqVar.i.a()) {
                            Iterator it = ferqVar.h.values().iterator();
                            while (it.hasNext()) {
                                if (!((ferp) it.next()).c) {
                                    return;
                                }
                            }
                            fdyc fdycVar6 = fdyc.TRANSIENT_FAILURE;
                            ferqVar.m = fdycVar6;
                            ferqVar.h(fdycVar6, new ferm(feak.b(fdydVar.b)));
                            int i = ferqVar.j + 1;
                            ferqVar.j = i;
                            if (i >= ferqVar.i.a() || ferqVar.k) {
                                ferqVar.k = false;
                                ferqVar.j = 0;
                                ferqVar.g.e();
                            }
                        }
                    }
                }
            });
            ferpVar = ferpVar2;
        }
        int ordinal = ferpVar.b.ordinal();
        if (ordinal == 0) {
            l();
            return;
        }
        if (ordinal != 2) {
            if (ordinal != 3) {
                return;
            }
            ferpVar.a.a();
            ferpVar.b(fdyc.CONNECTING);
            l();
            return;
        }
        if (!this.s) {
            this.i.e();
            d();
        } else if (!this.i.f()) {
            g();
        } else {
            ferpVar.a.a();
            ferpVar.b(fdyc.CONNECTING);
        }
    }

    @Override // defpackage.feaq
    public final void e() {
        f.logp(Level.FINE, "io.grpc.internal.PickFirstLeafLoadBalancer", "shutdown", "Shutting down, currently have {} subchannels created", Integer.valueOf(this.h.size()));
        fdyc fdycVar = fdyc.SHUTDOWN;
        this.m = fdycVar;
        this.n = fdycVar;
        f();
        fedr fedrVar = this.p;
        if (fedrVar != null) {
            fedrVar.a();
            this.p = null;
        }
        this.q = null;
        Iterator it = this.h.values().iterator();
        while (it.hasNext()) {
            ((ferp) it.next()).a.b();
        }
        this.h.clear();
    }

    public final void f() {
        fedr fedrVar = this.l;
        if (fedrVar != null) {
            fedrVar.a();
            this.l = null;
        }
    }

    public final void g() {
        if (this.s && this.p == null) {
            if (this.q == null) {
                this.q = new feml();
            }
            long a = this.q.a();
            feai feaiVar = this.g;
            this.p = feaiVar.c().a(new ferg(this), a, TimeUnit.NANOSECONDS, feaiVar.d());
        }
    }

    public final void h(fdyc fdycVar, feao feaoVar) {
        if (fdycVar == this.n && (fdycVar == fdyc.IDLE || fdycVar == fdyc.CONNECTING)) {
            return;
        }
        this.n = fdycVar;
        this.g.f(fdycVar, feaoVar);
    }

    public final void i(ferp ferpVar) {
        if (ferpVar.b != fdyc.READY) {
            return;
        }
        if (this.o || ferpVar.a() == fdyc.READY) {
            h(fdyc.READY, new feah(feak.c(ferpVar.a)));
            return;
        }
        fdyc a = ferpVar.a();
        fdyc fdycVar = fdyc.TRANSIENT_FAILURE;
        if (a == fdycVar) {
            h(fdycVar, new ferm(feak.b(ferpVar.d.b)));
        } else if (this.n != fdycVar) {
            h(ferpVar.a(), new ferm(feak.a));
        }
    }
}
