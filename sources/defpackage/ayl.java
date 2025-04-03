package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ayl extends bax {
    private final Executor b;
    private final avf c;
    private final avg d;
    private final Rect e;
    private final Matrix f;
    private final int g;
    private final int h;
    private final int i;
    private final List j;

    public ayl(Executor executor, avf avfVar, avg avgVar, Rect rect, Matrix matrix, int i, int i2, int i3, List list) {
        this.b = executor;
        this.c = avfVar;
        this.d = avgVar;
        this.e = rect;
        if (matrix == null) {
            throw new NullPointerException("Null sensorToBufferTransform");
        }
        this.f = matrix;
        this.g = i;
        this.h = i2;
        this.i = i3;
        if (list == null) {
            throw new NullPointerException("Null sessionConfigCameraCaptureCallbacks");
        }
        this.j = list;
    }

    @Override // defpackage.bax
    public final int a() {
        return this.i;
    }

    @Override // defpackage.bax
    public final int b() {
        return this.h;
    }

    @Override // defpackage.bax
    public final int c() {
        return this.g;
    }

    @Override // defpackage.bax
    public final Matrix d() {
        return this.f;
    }

    @Override // defpackage.bax
    public final Rect e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bax) {
            bax baxVar = (bax) obj;
            if (this.b.equals(baxVar.i())) {
                baxVar.j();
                if (this.c.equals(baxVar.f()) && this.d.equals(baxVar.g())) {
                    baxVar.k();
                    if (this.e.equals(baxVar.e()) && this.f.equals(baxVar.d()) && this.g == baxVar.c() && this.h == baxVar.b() && this.i == baxVar.a()) {
                        baxVar.l();
                        if (this.j.equals(baxVar.h())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.bax
    public final avf f() {
        return this.c;
    }

    @Override // defpackage.bax
    public final avg g() {
        return this.d;
    }

    @Override // defpackage.bax
    public final List h() {
        return this.j;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.b.hashCode() ^ 1000003) * (-721379959)) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * (-721379959)) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g) * 1000003) ^ this.h) * 1000003) ^ this.i) * 1000003) ^ 1237) * 1000003) ^ this.j.hashCode();
    }

    @Override // defpackage.bax
    public final Executor i() {
        return this.b;
    }

    public final String toString() {
        return "TakePictureRequest{appExecutor=" + this.b + ", inMemoryCallback=null, onDiskCallback=" + this.c + ", outputFileOptions=" + this.d + ", secondaryOutputFileOptions=null, cropRect=" + this.e + ", sensorToBufferTransform=" + this.f + ", rotationDegrees=" + this.g + ", jpegQuality=" + this.h + ", captureMode=" + this.i + ", simultaneousCapture=false, sessionConfigCameraCaptureCallbacks=" + this.j + "}";
    }

    @Override // defpackage.bax
    public final void j() {
    }

    @Override // defpackage.bax
    public final void k() {
    }

    @Override // defpackage.bax
    public final void l() {
    }
}
