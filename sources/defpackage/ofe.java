package defpackage;

import java.util.List;

/* compiled from: PG */
@ffbs
/* loaded from: classes.dex */
public abstract class ofe extends ody {
    public ofe() {
        super(3);
    }

    @Override // defpackage.ody
    public final Object a(Object obj) {
        return d(obj);
    }

    @Override // defpackage.ody
    public final Object b(odv odvVar, ffgu ffguVar) {
        int ordinal = odvVar.a.ordinal();
        if (ordinal == 0) {
            ofa ofaVar = new ofa(odvVar.b, odvVar.c);
            ffrh ffrhVar = new ffrh(ffhi.c(ffguVar), 1);
            ffrhVar.B();
            i(ofaVar, new ofd(ffrhVar, this));
            return ffrhVar.m();
        }
        if (ordinal == 1) {
            Object obj = odvVar.b;
            obj.getClass();
            ofb ofbVar = new ofb(obj, odvVar.d);
            ffrh ffrhVar2 = new ffrh(ffhi.c(ffguVar), 1);
            ffrhVar2.B();
            h(ofbVar, new ofc(ffrhVar2, this));
            return ffrhVar2.m();
        }
        if (ordinal != 2) {
            throw new ffcd();
        }
        Object obj2 = odvVar.b;
        obj2.getClass();
        ofb ofbVar2 = new ofb(obj2, odvVar.d);
        ffrh ffrhVar3 = new ffrh(ffhi.c(ffguVar), 1);
        ffrhVar3.B();
        g(ofbVar2, new ofc(ffrhVar3, this));
        return ffrhVar3.m();
    }

    public abstract Object d(Object obj);

    public final Object e(List list) {
        Object Q = ffdx.Q(list);
        if (Q != null) {
            return d(Q);
        }
        return null;
    }

    public final Object f(List list) {
        Object M = ffdx.M(list);
        if (M != null) {
            return d(M);
        }
        return null;
    }

    public abstract void g(ofb ofbVar, oey oeyVar);

    public abstract void h(ofb ofbVar, oey oeyVar);

    public abstract void i(ofa ofaVar, oez oezVar);
}
