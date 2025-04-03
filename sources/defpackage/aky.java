package defpackage;

import android.hardware.camera2.CameraDevice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aky {
    final Executor a;
    final Object b = new Object();
    final Set c = new LinkedHashSet();
    final Set d = new LinkedHashSet();
    final Set e = new LinkedHashSet();
    public final CameraDevice.StateCallback f = new akx(this);

    public aky(Executor executor) {
        this.a = executor;
    }

    final List a() {
        ArrayList arrayList;
        synchronized (this.b) {
            arrayList = new ArrayList(this.c);
        }
        return arrayList;
    }

    final List b() {
        ArrayList arrayList;
        synchronized (this.b) {
            arrayList = new ArrayList(this.e);
        }
        return arrayList;
    }

    final List c() {
        ArrayList arrayList;
        synchronized (this.b) {
            arrayList = new ArrayList();
            arrayList.addAll(a());
            arrayList.addAll(b());
        }
        return arrayList;
    }

    public final void d(amt amtVar) {
        amt amtVar2;
        Iterator it = c().iterator();
        while (it.hasNext() && (amtVar2 = (amt) it.next()) != amtVar) {
            amtVar2.o();
        }
    }

    final void e(amt amtVar) {
        d(amtVar);
        synchronized (this.b) {
            this.e.remove(amtVar);
        }
    }
}
