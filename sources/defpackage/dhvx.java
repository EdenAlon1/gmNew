package defpackage;

import android.hardware.Camera;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhvx {
    public final dfvd a;
    public dfvd b;

    public dhvx(Camera.Size size, Camera.Size size2) {
        this.a = new dfvd(size.width, size.height);
        if (size2 != null) {
            this.b = new dfvd(size2.width, size2.height);
        }
    }
}
