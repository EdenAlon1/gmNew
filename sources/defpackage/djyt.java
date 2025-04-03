package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djyt {
    public final String e = "ProvisioningStateMachine";
    public final Map f;
    public final Map g;
    public final ffsk h;
    public final ffhd i;
    public final Map j;
    public final Deque k;
    public final Deque l;
    public final ArrayList m;
    public final ArrayList n;
    public final Deque o;
    public final AtomicReference p;
    public final AtomicBoolean q;
    public final fgjb r;
    public final emar s;
    public Object t;
    public final ArrayList u;
    public final AtomicBoolean v;
    public List w;
    public List x;
    private final ffbz z;
    public static final diyy a = diyv.b("enable_state_machine_v2");
    public static final diyy b = diyv.b("crash_on_unhandled_state_machine_message");
    public static final diyy c = diyv.b("is_state_machine_v2_executing");
    private static final diyy y = diyv.b("crash_on_multiple_transitioning_requests");
    public static final enru d = enru.c("com/google/android/ims/provisioning/engine/statemachine/StateMachineV2");

    public djyt(Map map, Map map2, ffsk ffskVar, ffhd ffhdVar) {
        this.f = map;
        this.g = map2;
        this.h = ffskVar;
        this.i = ffhdVar;
        enip<Map.Entry> entrySet = ((enhk) map).entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(ffmk.f(ffew.a(ffdx.n(entrySet, 10)), 16));
        for (Map.Entry entry : entrySet) {
            ffcf ffcfVar = new ffcf(entry.getKey(), new djyk(entry.getKey(), (djyg) entry.getValue()));
            linkedHashMap.put(ffcfVar.a, ffcfVar.b);
        }
        this.j = linkedHashMap;
        this.k = new ConcurrentLinkedDeque();
        this.l = new ConcurrentLinkedDeque();
        this.m = new ArrayList();
        this.n = new ArrayList();
        this.o = new ConcurrentLinkedDeque();
        this.p = new AtomicReference(djyi.a);
        this.q = new AtomicBoolean(false);
        this.r = new fgjf();
        this.s = new emar();
        this.u = new ArrayList();
        this.v = new AtomicBoolean(false);
        this.w = new ArrayList();
        this.x = new ArrayList();
        this.z = ffca.a(new ffix() { // from class: djyh
            @Override // defpackage.ffix
            public final Object invoke() {
                return (((Boolean) djyt.a.a()).booleanValue() && ((Boolean) djyt.c.a()).booleanValue()) ? djyj.a : (!((Boolean) djyt.a.a()).booleanValue() || ((Boolean) djyt.c.a()).booleanValue()) ? djyj.c : djyj.b;
            }
        });
    }

    private final djyj n() {
        return (djyj) this.z.a();
    }

    public final djyg a() {
        djyk b2 = b();
        if (b2 != null) {
            return b2.b;
        }
        return null;
    }

    public final djyk b() {
        return (djyk) this.k.peekLast();
    }

    public final ListenableFuture c(Object obj, Object obj2) {
        obj.getClass();
        return fgfz.a(emau.a(this.h, this.s, new djyn(this, obj, obj2, null)));
    }

    public final ListenableFuture d(Object obj) {
        obj.getClass();
        this.o.add(new ffcf(e(), obj));
        if (this.o.size() > 1) {
            if (this.v.get() && ((Boolean) y.a()).booleanValue()) {
                throw new IllegalStateException("Current state " + e() + " and its parents requested to transition to more than 1 state. Requests: " + this.o);
            }
            ((enrr) d.j().h("com/google/android/ims/provisioning/engine/statemachine/StateMachineV2", "transitionToAsync", 253, "StateMachineV2.kt")).D("Current state %s and its parents requested to transition to more than 1 state. Requests: %s", e(), this.o);
        }
        return fgfz.a(emau.a(this.h, this.s, new djys(this, obj, null)));
    }

    public final Object e() {
        djyk b2 = b();
        if (b2 != null) {
            return b2.a;
        }
        return null;
    }

    public final Object f(Object obj, Object obj2, ffgu ffguVar) {
        Object a2 = ffra.a(ekxi.a(this.i), new djym(null, this, obj, obj2), ffguVar);
        return a2 == ffhh.a ? a2 : ffcu.a;
    }

    public final Object g(Object obj, ffgu ffguVar) {
        Object a2 = ffra.a(ekxi.a(this.i), new djyr(null, this, obj), ffguVar);
        return a2 == ffhh.a ? a2 : ffcu.a;
    }

    public final void h(Object obj, Object obj2) {
        obj.getClass();
        this.l.addLast(new ffcf(obj, obj2));
        ((enrr) d.h().h("com/google/android/ims/provisioning/engine/statemachine/StateMachineV2", "deferMessage", 343, "StateMachineV2.kt")).t("Added deferred %s", obj);
    }

    public final boolean i() {
        return this.q.get();
    }

    public final boolean j() {
        return n() == djyj.b;
    }

    public final boolean k() {
        return j() || n() == djyj.c;
    }

    public final boolean l() {
        return j() || m();
    }

    public final boolean m() {
        return n() == djyj.a;
    }

    public final String toString() {
        djyi djyiVar = (djyi) this.p.get();
        if (djyiVar != null) {
            int ordinal = djyiVar.ordinal();
            if (ordinal == 1) {
                return "name=" + this.e + " state=initializing";
            }
            if (ordinal == 2) {
                return "name=" + this.e + " state=" + e();
            }
        }
        return "name=" + this.e + " state=not_initialized";
    }
}
