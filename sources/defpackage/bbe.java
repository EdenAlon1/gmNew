package defpackage;

import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bbe extends bde {
    public final Executor a;
    public final Handler b;

    public bbe(Executor executor, Handler handler) {
        this.a = executor;
        if (handler == null) {
            throw new NullPointerException("Null schedulerHandler");
        }
        this.b = handler;
    }

    @Override // defpackage.bde
    public final Handler a() {
        return this.b;
    }

    @Override // defpackage.bde
    public final Executor b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bde) {
            bde bdeVar = (bde) obj;
            if (this.a.equals(bdeVar.b()) && this.b.equals(bdeVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "CameraThreadConfig{cameraExecutor=" + this.a + ", schedulerHandler=" + this.b + "}";
    }
}
