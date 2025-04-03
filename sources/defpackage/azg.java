package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.DngCreator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class azg implements bnd {
    public final DngCreator a;

    public azg(CameraCharacteristics cameraCharacteristics, CaptureResult captureResult) {
        this.a = new DngCreator(cameraCharacteristics, captureResult);
    }

    @Override // defpackage.bnd
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        throw null;
    }
}
