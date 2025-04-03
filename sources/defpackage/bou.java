package defpackage;

import android.graphics.Rect;
import android.util.Size;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class bou {
    public static bou i(bnr bnrVar) {
        return j(bnrVar.f, bnrVar.a, bnrVar.d, bix.h(bnrVar.d, bnrVar.i), bnrVar.i, bnrVar.e);
    }

    public static bou j(int i, int i2, Rect rect, Size size, int i3, boolean z) {
        return k(i, i2, rect, size, i3, z, false);
    }

    public static bou k(int i, int i2, Rect rect, Size size, int i3, boolean z, boolean z2) {
        return new boj(UUID.randomUUID(), i, i2, rect, size, i3, z, z2);
    }

    public abstract int a();

    public abstract int b();

    public abstract int c();

    public abstract Rect d();

    public abstract Size e();

    public abstract UUID f();

    public abstract boolean g();

    public abstract boolean h();
}
