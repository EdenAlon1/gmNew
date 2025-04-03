package defpackage;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;

/* compiled from: PG */
/* loaded from: classes.dex */
class aqr extends aqp {
    public aqr(Surface surface) {
        super(new aqq(new OutputConfiguration(-1, surface)));
    }

    @Override // defpackage.aqp, defpackage.aqn, defpackage.aqt
    public Object b() {
        ksw.a(this.a instanceof aqq);
        return ((aqq) this.a).a;
    }

    @Override // defpackage.aqp, defpackage.aqt
    public String c() {
        return null;
    }

    @Override // defpackage.aqp, defpackage.aqt
    public void f(long j) {
        ((aqq) this.a).b = j;
    }

    @Override // defpackage.aqp, defpackage.aqt
    public final void g(String str) {
        afg$$ExternalSyntheticApiModelOutline0.m(b()).setPhysicalCameraId(str);
    }

    public aqr(Object obj) {
        super(obj);
    }
}
