package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class exp {
    public static final float a(jpg jpgVar, int i) {
        if (i < 0 || jpgVar.a.a.a() == 0) {
            return 0.0f;
        }
        jlz jlzVar = jpgVar.b;
        jlz jlzVar2 = jpgVar.b;
        int min = Math.min(jlzVar.f(i), Math.min(jlzVar2.b - 1, jlzVar2.f - 1));
        if (i <= jpgVar.b.e(min, false)) {
            return jpgVar.b.b(min);
        }
        return 0.0f;
    }
}
