package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lrj {
    public static final lrk a(lpy lpyVar) {
        return new lrk(lpyVar.a());
    }

    public static final void b(lrk lrkVar, lpy lpyVar) {
        int i = lrk.b;
        lpz lpzVar = lrkVar.a;
        for (int i2 = 0; i2 < lpzVar.b(); i2++) {
            lpyVar.b(lpzVar.a(i2));
        }
    }

    public static final void c(int i, boolean z, lpy lpyVar) {
        if (z) {
            lpyVar.b(i);
        }
    }
}
