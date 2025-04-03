package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lkv extends lkk {
    private final WeakReference d;
    private int e;
    private boolean f;
    private boolean g;
    public aev b = new aev();
    public lkj c = lkj.INITIALIZED;
    private final ArrayList h = new ArrayList();
    private final fgcm i = fgdm.a(lkj.INITIALIZED);

    public lkv(lkr lkrVar) {
        this.d = new WeakReference(lkrVar);
    }

    public static final void g(String str) {
        if (!aer.a().c()) {
            throw new IllegalStateException(a.a(str, "Method ", " must be called on the main thread"));
        }
    }

    private final lkj h(lkq lkqVar) {
        aev aevVar = this.b;
        lkj lkjVar = null;
        aey aeyVar = aevVar.c(lkqVar) ? ((aey) aevVar.a.get(lkqVar)).d : null;
        lkj lkjVar2 = aeyVar != null ? ((lku) aeyVar.b).a : null;
        if (!this.h.isEmpty()) {
            lkjVar = (lkj) this.h.get(r0.size() - 1);
        }
        return lkt.a(lkt.a(this.c, lkjVar2), lkjVar);
    }

    private final void i(lkj lkjVar) {
        if (this.c == lkjVar) {
            return;
        }
        lkr lkrVar = (lkr) this.d.get();
        lkj lkjVar2 = this.c;
        lkjVar2.getClass();
        lkjVar.getClass();
        if (lkjVar2 == lkj.INITIALIZED && lkjVar == lkj.DESTROYED) {
            throw new IllegalStateException("State must be at least '" + lkj.CREATED + "' to be moved to '" + lkjVar + "' in component " + lkrVar);
        }
        if (lkjVar2 == lkj.DESTROYED && lkjVar2 != lkjVar) {
            throw new IllegalStateException("State is '" + lkj.DESTROYED + "' and cannot be moved to `" + lkjVar + "` in component " + lkrVar);
        }
        this.c = lkjVar;
        if (this.f || this.e != 0) {
            this.g = true;
            return;
        }
        this.f = true;
        l();
        this.f = false;
        if (this.c == lkj.DESTROYED) {
            this.b = new aev();
        }
    }

    private final void j() {
        this.h.remove(r0.size() - 1);
    }

    private final void k(lkj lkjVar) {
        this.h.add(lkjVar);
    }

    private final void l() {
        lkr lkrVar = (lkr) this.d.get();
        if (lkrVar == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            aev aevVar = this.b;
            if (aevVar.e != 0) {
                aey aeyVar = aevVar.b;
                aeyVar.getClass();
                lkj lkjVar = ((lku) aeyVar.b).a;
                aey aeyVar2 = aevVar.c;
                aeyVar2.getClass();
                lkj lkjVar2 = ((lku) aeyVar2.b).a;
                if (lkjVar == lkjVar2 && this.c == lkjVar2) {
                    break;
                }
                this.g = false;
                lkj lkjVar3 = this.c;
                aeyVar.getClass();
                if (lkjVar3.compareTo(lkjVar) < 0) {
                    aev aevVar2 = this.b;
                    aex aexVar = new aex(aevVar2.c, aevVar2.b);
                    aevVar2.d.put(aexVar, false);
                    while (aexVar.hasNext() && !this.g) {
                        Map.Entry next = aexVar.next();
                        next.getClass();
                        aey aeyVar3 = (aey) next;
                        Object obj = aeyVar3.b;
                        lkq lkqVar = (lkq) aeyVar3.a;
                        lku lkuVar = (lku) obj;
                        while (lkuVar.a.compareTo(this.c) > 0 && !this.g && this.b.c(lkqVar)) {
                            lki a = lkh.a(lkuVar.a);
                            if (a == null) {
                                lkj lkjVar4 = lkuVar.a;
                                Objects.toString(lkjVar4);
                                throw new IllegalStateException("no event down from ".concat(String.valueOf(lkjVar4)));
                            }
                            k(a.a());
                            lkuVar.a(lkrVar, a);
                            j();
                        }
                    }
                }
                aey aeyVar4 = this.b.c;
                if (!this.g && aeyVar4 != null && this.c.compareTo(((lku) aeyVar4.b).a) > 0) {
                    aez e = this.b.e();
                    while (e.hasNext() && !this.g) {
                        aey aeyVar5 = (aey) e.next();
                        lkq lkqVar2 = (lkq) aeyVar5.a;
                        lku lkuVar2 = (lku) aeyVar5.b;
                        while (lkuVar2.a.compareTo(this.c) < 0 && !this.g && this.b.c(lkqVar2)) {
                            k(lkuVar2.a);
                            lki b = lkh.b(lkuVar2.a);
                            if (b == null) {
                                lkj lkjVar5 = lkuVar2.a;
                                Objects.toString(lkjVar5);
                                throw new IllegalStateException("no event up from ".concat(String.valueOf(lkjVar5)));
                            }
                            lkuVar2.a(lkrVar, b);
                            j();
                        }
                    }
                }
            } else {
                break;
            }
        }
        this.g = false;
        this.i.f(this.c);
    }

    @Override // defpackage.lkk
    public final lkj a() {
        return this.c;
    }

    @Override // defpackage.lkk
    public final fgdj b() {
        return new fgco(this.i);
    }

    @Override // defpackage.lkk
    public final void c(lkq lkqVar) {
        Object obj;
        lkr lkrVar;
        lkqVar.getClass();
        g("addObserver");
        lkj lkjVar = this.c;
        lkj lkjVar2 = lkj.DESTROYED;
        if (lkjVar != lkjVar2) {
            lkjVar2 = lkj.INITIALIZED;
        }
        lku lkuVar = new lku(lkqVar, lkjVar2);
        aev aevVar = this.b;
        aey a = aevVar.a(lkqVar);
        if (a != null) {
            obj = a.b;
        } else {
            aevVar.a.put(lkqVar, aevVar.d(lkqVar, lkuVar));
            obj = null;
        }
        if (((lku) obj) == null && (lkrVar = (lkr) this.d.get()) != null) {
            boolean z = this.e != 0 || this.f;
            lkj h = h(lkqVar);
            this.e++;
            while (lkuVar.a.compareTo(h) < 0 && this.b.c(lkqVar)) {
                k(lkuVar.a);
                lki b = lkh.b(lkuVar.a);
                if (b == null) {
                    lkj lkjVar3 = lkuVar.a;
                    Objects.toString(lkjVar3);
                    throw new IllegalStateException("no event up from ".concat(String.valueOf(lkjVar3)));
                }
                lkuVar.a(lkrVar, b);
                j();
                h = h(lkqVar);
            }
            if (!z) {
                l();
            }
            this.e--;
        }
    }

    @Override // defpackage.lkk
    public final void d(lkq lkqVar) {
        lkqVar.getClass();
        g("removeObserver");
        this.b.b(lkqVar);
    }

    public void e(lki lkiVar) {
        lkiVar.getClass();
        g("handleLifecycleEvent");
        i(lkiVar.a());
    }

    public final void f(lkj lkjVar) {
        lkjVar.getClass();
        g("setCurrentState");
        i(lkjVar);
    }
}
