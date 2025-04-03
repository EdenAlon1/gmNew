package defpackage;

import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ang extends ams {
    private final List a;

    public ang(List list) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        arrayList.addAll(list);
    }

    @Override // defpackage.ams
    public final void a(amt amtVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ams) it.next()).a(amtVar);
        }
    }

    @Override // defpackage.ams
    public final void b(amt amtVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ams) it.next()).b(amtVar);
        }
    }

    @Override // defpackage.ams
    public final void c(amt amtVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ams) it.next()).c(amtVar);
        }
    }

    @Override // defpackage.ams
    public final void d(amt amtVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ams) it.next()).d(amtVar);
        }
    }

    @Override // defpackage.ams
    public final void f(amt amtVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ams) it.next()).f(amtVar);
        }
    }

    @Override // defpackage.ams
    public final void g(amt amtVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ams) it.next()).g(amtVar);
        }
    }

    @Override // defpackage.ams
    public final void h(amt amtVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ams) it.next()).h(amtVar);
        }
    }

    @Override // defpackage.ams
    public final void i(amt amtVar, Surface surface) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ams) it.next()).i(amtVar, surface);
        }
    }
}
