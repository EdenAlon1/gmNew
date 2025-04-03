package defpackage;

import io.grpc.Status;
import j$.util.DesugarCollections;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class feoi implements fdzu, fevu {
    public final feob a;
    public final ScheduledExecutorService b;
    public final fdzq c;
    public final fdxm d;
    public final boolean e;
    public final List f;
    public final feds g;
    public final feoc h;
    public volatile List i;
    public final emyg j;
    public fedr k;
    public fedr l;
    public feqr m;
    public fekh p;
    public volatile feqr q;
    public Status s;
    public volatile fdxd t;
    public feml u;
    private final fdzv v;
    private final String w;
    private final String x;
    private final fejx y;
    private final fejg z;
    public final Collection n = new ArrayList();
    public final fenk o = new fenq(this);
    public volatile fdyd r = fdyd.a(fdyc.IDLE);

    public feoi(feaf feafVar, String str, String str2, fejx fejxVar, ScheduledExecutorService scheduledExecutorService, feds fedsVar, feob feobVar, fdzq fdzqVar, fejg fejgVar, fdzv fdzvVar, fdxm fdxmVar, List list) {
        Object obj;
        List list2 = feafVar.a;
        emxf.b(!list2.isEmpty(), "addressGroups is empty");
        j(list2);
        List unmodifiableList = DesugarCollections.unmodifiableList(new ArrayList(list2));
        this.i = unmodifiableList;
        this.h = new feoc(unmodifiableList);
        this.w = str;
        this.x = str2;
        this.y = fejxVar;
        this.b = scheduledExecutorService;
        this.j = new emyg();
        this.g = fedsVar;
        this.a = feobVar;
        this.c = fdzqVar;
        this.z = fejgVar;
        this.v = fdzvVar;
        this.d = fdxmVar;
        this.f = list;
        feae feaeVar = feaq.c;
        int i = 0;
        while (true) {
            Object[][] objArr = feafVar.c;
            if (i >= objArr.length) {
                obj = feaeVar.a;
                break;
            } else {
                if (feaeVar.equals(objArr[i][0])) {
                    obj = feafVar.c[i][1];
                    break;
                }
                i++;
            }
        }
        this.e = ((Boolean) obj).booleanValue();
    }

    public static void j(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            it.next().getClass();
        }
    }

    public static final String k(Status status) {
        StringBuilder sb = new StringBuilder();
        sb.append(status.getCode());
        if (status.getDescription() != null) {
            sb.append("(");
            sb.append(status.getDescription());
            sb.append(")");
        }
        if (status.t != null) {
            sb.append("[");
            sb.append(status.t);
            sb.append("]");
        }
        return sb.toString();
    }

    @Override // defpackage.fevu
    public final fejv a() {
        feqr feqrVar = this.q;
        if (feqrVar != null) {
            return feqrVar;
        }
        this.g.execute(new fens(this));
        return null;
    }

    public final void b(fdyc fdycVar) {
        this.g.d();
        d(fdyd.a(fdycVar));
    }

    @Override // defpackage.feab
    public final fdzv c() {
        return this.v;
    }

    public final void d(fdyd fdydVar) {
        this.g.d();
        if (this.r.a != fdydVar.a) {
            emxf.m(this.r.a != fdyc.SHUTDOWN, "Cannot transition out of SHUTDOWN to ".concat(fdydVar.toString()));
            if (this.e && fdydVar.a == fdyc.TRANSIENT_FAILURE) {
                this.r = fdyd.a(fdyc.IDLE);
            } else {
                this.r = fdydVar;
            }
            feob feobVar = this.a;
            emxf.m(true, "listener is null");
            ((fepy) feobVar).a.a(fdydVar);
        }
    }

    public final void e() {
        this.g.execute(new fenw(this));
    }

    public final void f(fekh fekhVar, boolean z) {
        this.g.execute(new fenx(this, fekhVar, z));
    }

    public final void g(Status status) {
        this.g.execute(new fenv(this, status));
    }

    public final void h() {
        fdzl fdzlVar;
        this.g.d();
        emxf.m(this.k == null, "Should have no reconnectTask scheduled");
        feoc feocVar = this.h;
        if (feocVar.b == 0 && feocVar.c == 0) {
            emyg emygVar = this.j;
            emygVar.e();
            emygVar.f();
        }
        SocketAddress b = this.h.b();
        if (b instanceof fdzl) {
            fdzl fdzlVar2 = (fdzl) b;
            fdzlVar = fdzlVar2;
            b = fdzlVar2.b;
        } else {
            fdzlVar = null;
        }
        fdxd a = this.h.a();
        String str = (String) a.a(fdyw.a);
        fejw fejwVar = new fejw();
        if (str == null) {
            str = this.w;
        }
        str.getClass();
        fejwVar.a = str;
        fejwVar.b = a;
        fejwVar.c = this.x;
        fejwVar.d = fdzlVar;
        feoh feohVar = new feoh();
        feohVar.a = this.v;
        feoa feoaVar = new feoa(this.y.a(b, fejwVar, feohVar), this.z);
        feohVar.a = feoaVar.c();
        fdzq.b(this.c.f, feoaVar);
        this.p = feoaVar;
        this.n.add(feoaVar);
        Runnable e = feoaVar.e(new feog(this, feoaVar));
        if (e != null) {
            this.g.c(e);
        }
        this.d.b(2, "Started transport {0}", feohVar.a);
    }

    public final String toString() {
        emwz b = emxa.b(this);
        b.g("logId", this.v.a);
        b.b("addressGroups", this.i);
        return b.toString();
    }
}
