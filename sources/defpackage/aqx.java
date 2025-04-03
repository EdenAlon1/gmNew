package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aqx {
    public final aqw a;

    public aqx(List list, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
        if (Build.VERSION.SDK_INT < 28) {
            this.a = new aqv(list, executor, stateCallback);
        } else {
            this.a = new aqu(list, executor, stateCallback);
        }
    }

    public static List c(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(afg$$ExternalSyntheticApiModelOutline0.m(((aql) it.next()).a.b()));
        }
        return arrayList;
    }

    public final CameraCaptureSession.StateCallback a() {
        return this.a.b();
    }

    public final List b() {
        return this.a.e();
    }

    public final Executor d() {
        return this.a.f();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aqx) {
            return this.a.equals(((aqx) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
