package defpackage;

import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cly {
    public static final float b(clx clxVar) {
        return ((clz) clxVar.a).b;
    }

    public static final float c(clx clxVar) {
        return ((clz) clxVar.a).a;
    }

    public static final void d(clx clxVar) {
        if (!clxVar.c()) {
            clxVar.a(0, 0, 0, 0);
            return;
        }
        float b = b(clxVar);
        float c = c(clxVar);
        int ceil = (int) Math.ceil(cma.a(b, c, clxVar.b()));
        int ceil2 = (int) Math.ceil(cma.b(b, c, clxVar.b()));
        clxVar.a(ceil, ceil2, ceil, ceil2);
    }

    public final void a(clx clxVar, float f) {
        Drawable drawable = clxVar.a;
        boolean c = clxVar.c();
        boolean b = clxVar.b();
        clz clzVar = (clz) drawable;
        if (f != clzVar.b || clzVar.c != c || clzVar.d != b) {
            clzVar.b = f;
            clzVar.c = c;
            clzVar.d = b;
            clzVar.b(null);
            clzVar.invalidateSelf();
        }
        d(clxVar);
    }
}
