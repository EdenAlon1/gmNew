package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class egdx {
    public static egdx e(Object obj) {
        emxc j = emxc.j(obj);
        emux emuxVar = emux.a;
        int i = engw.d;
        return new egdo(3, j, emuxVar, enou.a);
    }

    public static egdx f(egdp egdpVar, engw engwVar) {
        return new egdo(5, emux.a, emxc.j(egdpVar), engwVar);
    }

    public static egdx g() {
        emux emuxVar = emux.a;
        int i = engw.d;
        return new egdo(1, emuxVar, emuxVar, enou.a);
    }

    public static egdx h() {
        emux emuxVar = emux.a;
        int i = engw.d;
        return new egdo(2, emuxVar, emuxVar, enou.a);
    }

    public static egdx i(Object obj, engw engwVar) {
        return new egdo(4, emxc.j(obj), emux.a, engwVar);
    }

    public abstract emxc a();

    public abstract emxc b();

    public abstract engw c();

    public abstract int d();
}
