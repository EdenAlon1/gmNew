package defpackage;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;

/* compiled from: PG */
/* loaded from: classes.dex */
class aqp extends aqn {
    public aqp(Surface surface) {
        super(new aqo(new OutputConfiguration(-1, surface)));
    }

    @Override // defpackage.aqn, defpackage.aqt
    public Object b() {
        ksw.a(this.a instanceof aqo);
        return ((aqo) this.a).a;
    }

    @Override // defpackage.aqt
    public String c() {
        return ((aqo) this.a).b;
    }

    @Override // defpackage.aqt
    public final void d(Surface surface) {
        afg$$ExternalSyntheticApiModelOutline0.m(b()).addSurface(surface);
    }

    @Override // defpackage.aqt
    public final void e() {
        afg$$ExternalSyntheticApiModelOutline0.m(b()).enableSurfaceSharing();
    }

    @Override // defpackage.aqt
    public void f(long j) {
        ((aqo) this.a).c = j;
    }

    @Override // defpackage.aqt
    public void g(String str) {
        ((aqo) this.a).b = str;
    }

    public aqp(Object obj) {
        super(obj);
    }
}
