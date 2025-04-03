package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvnp {
    public static final boolean a(cvni cvniVar) {
        byyt byytVar;
        return cvniVar != null && cvniVar.b && (byytVar = cvniVar.a) != null && byytVar.g();
    }

    public static final boolean b(cvni cvniVar) {
        if (cvniVar == null || !cvniVar.b) {
            return false;
        }
        byyt byytVar = cvniVar.a;
        return byytVar == null || !byytVar.g();
    }
}
