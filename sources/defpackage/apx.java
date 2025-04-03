package defpackage;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class apx extends apw {
    public apx(Context context) {
        super(context);
    }

    @Override // defpackage.apz, defpackage.apt
    public final Set b() {
        Set concurrentCameraIds;
        try {
            concurrentCameraIds = this.a.getConcurrentCameraIds();
            return concurrentCameraIds;
        } catch (CameraAccessException e) {
            throw new aog(e);
        }
    }
}
