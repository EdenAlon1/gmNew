package defpackage;

import androidx.core.widget.NestedScrollView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kyz implements kto {
    final /* synthetic */ NestedScrollView a;

    public kyz(NestedScrollView nestedScrollView) {
        this.a = nestedScrollView;
    }

    @Override // defpackage.kto
    public final float a() {
        return -this.a.a();
    }

    @Override // defpackage.kto
    public final void b() {
        this.a.a.abortAnimation();
    }

    @Override // defpackage.kto
    public final boolean c(float f) {
        if (f == 0.0f) {
            return false;
        }
        b();
        this.a.j((int) f);
        return true;
    }
}
