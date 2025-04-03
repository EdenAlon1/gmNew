package defpackage;

import android.hardware.camera2.CameraDevice;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akf {
    public static CameraDevice.StateCallback a(List list) {
        return list.isEmpty() ? new ake() : list.size() == 1 ? (CameraDevice.StateCallback) list.get(0) : new akd(list);
    }
}
