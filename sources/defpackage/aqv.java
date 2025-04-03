package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aqv implements aqw {
    private final List a;
    private final CameraCaptureSession.StateCallback b;
    private final Executor c;
    private aqk e = null;
    private CaptureRequest f = null;
    private final int d = 0;

    public aqv(List list, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
        this.a = DesugarCollections.unmodifiableList(new ArrayList(list));
        this.b = stateCallback;
        this.c = executor;
    }

    @Override // defpackage.aqw
    public final int a() {
        return 0;
    }

    @Override // defpackage.aqw
    public final CameraCaptureSession.StateCallback b() {
        return this.b;
    }

    @Override // defpackage.aqw
    public final aqk c() {
        return this.e;
    }

    @Override // defpackage.aqw
    public final Object d() {
        return null;
    }

    @Override // defpackage.aqw
    public final List e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aqv) {
            aqv aqvVar = (aqv) obj;
            if (Objects.equals(this.e, aqvVar.e)) {
                int i = aqvVar.d;
                if (this.a.size() == aqvVar.a.size()) {
                    for (int i2 = 0; i2 < this.a.size(); i2++) {
                        if (!((aql) this.a.get(i2)).equals(aqvVar.a.get(i2))) {
                            return false;
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.aqw
    public final Executor f() {
        return this.c;
    }

    @Override // defpackage.aqw
    public final void g(aqk aqkVar) {
        this.e = aqkVar;
    }

    @Override // defpackage.aqw
    public final void h(CaptureRequest captureRequest) {
        this.f = captureRequest;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 31;
        aqk aqkVar = this.e;
        int hashCode2 = ((hashCode << 5) - hashCode) ^ (aqkVar == null ? 0 : aqkVar.hashCode());
        return (hashCode2 << 5) - hashCode2;
    }
}
