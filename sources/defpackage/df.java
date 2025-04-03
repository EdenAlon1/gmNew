package defpackage;

import android.transition.Transition;

/* compiled from: PG */
/* loaded from: classes.dex */
final class df extends cs {
    public final Object b;
    public final boolean c;
    public final Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public df(hi hiVar, boolean z, boolean z2) {
        super(hiVar);
        Object W;
        dv dvVar;
        Object obj;
        hiVar.getClass();
        boolean z3 = false;
        Object obj2 = null;
        if (hiVar.h == 2) {
            if (z) {
                ea eaVar = hiVar.a;
                dv dvVar2 = eaVar.T;
                if (dvVar2 != null) {
                    W = dvVar2.l;
                    if (W == ea.f) {
                        W = eaVar.W();
                    }
                    z3 = true;
                }
                W = null;
                z3 = true;
            } else {
                W = hiVar.a.V();
            }
        } else if (z) {
            ea eaVar2 = hiVar.a;
            dv dvVar3 = eaVar2.T;
            if (dvVar3 != null) {
                W = dvVar3.j;
                if (W == ea.f) {
                    W = eaVar2.V();
                }
                z3 = true;
            }
            W = null;
            z3 = true;
        } else {
            W = hiVar.a.W();
        }
        this.b = W;
        this.c = true;
        if (z2 && z3 && (dvVar = hiVar.a.T) != null && (obj = dvVar.m) != ea.f) {
            obj2 = obj;
        }
        this.d = obj2;
    }

    private final gp d(Object obj) {
        if (obj == null) {
            return null;
        }
        gp gpVar = gh.a;
        if (obj instanceof Transition) {
            return gh.a;
        }
        gp gpVar2 = gh.b;
        if (gpVar2 != null && gpVar2.l(obj)) {
            return gh.b;
        }
        throw new IllegalArgumentException("Transition " + obj + " for fragment " + this.a.a + " is not a valid framework Transition or AndroidX Transition");
    }

    public final gp a() {
        Object obj = this.d;
        gp d = d(this.b);
        gp d2 = d(obj);
        if (d == null || d2 == null || d == d2) {
            return d == null ? d2 : d;
        }
        throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + this.a.a + " returned Transition " + this.b + " which uses a different Transition  type than its shared element transition " + this.d);
    }

    public final boolean c() {
        return this.d != null;
    }
}
