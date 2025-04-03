package defpackage;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aqs extends aqr {
    public aqs(Surface surface) {
        super(new OutputConfiguration(-1, surface));
    }

    @Override // defpackage.aqr, defpackage.aqp, defpackage.aqn, defpackage.aqt
    public final Object b() {
        ksw.a(afg$$ExternalSyntheticApiModelOutline0.m112m(this.a));
        return this.a;
    }

    @Override // defpackage.aqr, defpackage.aqp, defpackage.aqt
    public final /* bridge */ /* synthetic */ String c() {
        return null;
    }

    @Override // defpackage.aqr, defpackage.aqp, defpackage.aqt
    public final void f(long j) {
        afg$$ExternalSyntheticApiModelOutline0.m(b()).setDynamicRangeProfile(j);
    }

    @Override // defpackage.aqt
    public final void h(int i) {
        afg$$ExternalSyntheticApiModelOutline0.m(b()).setMirrorMode(i);
    }

    @Override // defpackage.aqt
    public final void i(long j) {
        if (j == -1) {
            return;
        }
        afg$$ExternalSyntheticApiModelOutline0.m(b()).setStreamUseCase(j);
    }

    public aqs(Object obj) {
        super(obj);
    }
}
