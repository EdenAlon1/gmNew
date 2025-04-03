package androidx.compose.ui.platform;

import defpackage.ffkj;
import defpackage.hvh;
import defpackage.ivp;
import defpackage.jfx;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class TestTagElement extends ivp<jfx> {
    private final String a;

    public TestTagElement(String str) {
        this.a = str;
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ hvh d() {
        return new jfx(this.a);
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ void e(hvh hvhVar) {
        ((jfx) hvhVar).a = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TestTagElement) {
            return ffkj.e(this.a, ((TestTagElement) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
