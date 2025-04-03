package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class qfm {
    public static /* synthetic */ Object a(qfn qfnVar, qci qciVar, int i, float f, qgk qgkVar, float f2, qgh qghVar, ffgu ffguVar, int i2) {
        int g = (i2 & 2) != 0 ? qfnVar.g() : 0;
        if ((i2 & 4) != 0) {
            i = qfnVar.h();
        }
        int i3 = i;
        boolean p = (i2 & 8) != 0 ? qfnVar.p() : false;
        float f3 = (i2 & 16) != 0 ? qfnVar.f() : f;
        qgk k = (i2 & 32) != 0 ? qfnVar.k() : qgkVar;
        return qfnVar.b(qciVar, g, i3, p, f3, k, (i2 & 64) != 0 ? qfx.a(qciVar, k, f3) : f2, (i2 & 256) != 0 ? qgh.a : qghVar, ffguVar);
    }

    public static /* synthetic */ Object b(qfn qfnVar, qci qciVar, float f, ffgu ffguVar, int i) {
        if ((i & 1) != 0) {
            qciVar = qfnVar.j();
        }
        return qfnVar.c(qciVar, f, f != qfnVar.e(), ffguVar);
    }
}
