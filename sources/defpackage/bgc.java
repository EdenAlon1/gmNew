package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.util.Range;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bgc extends bgb {
    public static bgc a(bhh bhhVar, Size size) {
        bgf w = bhhVar.w();
        if (w == null) {
            throw new IllegalStateException("Implementation is missing option unpacker for ".concat(String.valueOf(bhhVar.p(bhhVar.toString()))));
        }
        bgc bgcVar = new bgc();
        w.a(size, bhhVar, bgcVar);
        return bgcVar;
    }

    public final bgk b() {
        return new bgk(new ArrayList(this.a), new ArrayList(this.c), new ArrayList(this.d), new ArrayList(this.e), this.b.b(), this.f, this.g, this.h);
    }

    public final void c(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            g((CameraDevice.StateCallback) it.next());
        }
    }

    public final void d(Collection collection) {
        this.b.c(collection);
    }

    public final void e(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            l((CameraCaptureSession.StateCallback) it.next());
        }
    }

    public final void f(bbt bbtVar) {
        this.b.d(bbtVar);
        if (this.e.contains(bbtVar)) {
            return;
        }
        this.e.add(bbtVar);
    }

    public final void g(CameraDevice.StateCallback stateCallback) {
        if (this.c.contains(stateCallback)) {
            return;
        }
        this.c.add(stateCallback);
    }

    public final void h(bdp bdpVar) {
        this.b.f(bdpVar);
    }

    public final void i(bdy bdyVar) {
        j(bdyVar, aua.b);
    }

    public final void j(bdy bdyVar, aua auaVar) {
        bgg g = bgh.g(bdyVar);
        g.b(auaVar);
        this.a.add(g.a());
    }

    public final void k(bbt bbtVar) {
        this.b.d(bbtVar);
    }

    public final void l(CameraCaptureSession.StateCallback stateCallback) {
        if (this.d.contains(stateCallback)) {
            return;
        }
        this.d.add(stateCallback);
    }

    public final void m(bdy bdyVar) {
        n(bdyVar, aua.b, -1);
    }

    public final void n(bdy bdyVar, aua auaVar, int i) {
        bgg g = bgh.g(bdyVar);
        g.b(auaVar);
        g.c(i);
        this.a.add(g.a());
        this.b.g(bdyVar);
    }

    public final void o(String str, Object obj) {
        this.b.h(str, obj);
    }

    public final void p(bbt bbtVar) {
        this.b.d.remove(bbtVar);
        this.e.remove(bbtVar);
    }

    public final void q(Range range) {
        this.b.j(range);
    }

    public final void r(bdp bdpVar) {
        this.b.k(bdpVar);
    }

    public final void s(int i) {
        if (i != 0) {
            this.b.l(i);
        }
    }

    public final void t(int i) {
        this.b.b = i;
    }

    public final void u(int i) {
        if (i != 0) {
            this.b.m(i);
        }
    }
}
