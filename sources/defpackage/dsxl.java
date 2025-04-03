package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsxl {
    public static final void a(dsxk dsxkVar, fr frVar, boolean z, ffji ffjiVar) {
        dsxkVar.getClass();
        if (dsxkVar.f) {
            cg cgVar = new cg(frVar);
            ffjiVar.invoke(cgVar);
            if (z) {
                cgVar.d();
                return;
            } else {
                cgVar.c();
                return;
            }
        }
        cg cgVar2 = new cg(frVar);
        ffjiVar.invoke(cgVar2);
        if (z) {
            cgVar2.k();
        } else {
            cgVar2.j();
        }
    }
}
