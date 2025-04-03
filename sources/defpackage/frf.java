package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class frf extends fsa implements frt {
    private frs a;
    private frw j;

    public frf(dwn dwnVar, boolean z, float f, ibz ibzVar, ffix ffixVar) {
        super(dwnVar, z, f, ibzVar, ffixVar);
    }

    private final void l(frw frwVar) {
        this.j = frwVar;
        ith.a(this);
    }

    @Override // defpackage.fsa
    public final void a(dwp dwpVar, long j, float f) {
        frs frsVar = this.a;
        if (frsVar == null) {
            Object obj = (View) isv.a(this, AndroidCompositionLocals_androidKt.g);
            int i = fsd.a;
            while (!(obj instanceof ViewGroup)) {
                Object parent = ((View) obj).getParent();
                if (!(parent instanceof View)) {
                    throw new IllegalArgumentException("Couldn't find a valid parent for " + obj + ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?");
                }
                obj = parent;
            }
            ViewGroup viewGroup = (ViewGroup) obj;
            int childCount = viewGroup.getChildCount();
            int i2 = 0;
            while (true) {
                if (i2 >= childCount) {
                    frs frsVar2 = new frs(viewGroup.getContext());
                    viewGroup.addView(frsVar2);
                    frsVar = frsVar2;
                    break;
                } else {
                    View childAt = viewGroup.getChildAt(i2);
                    if (childAt instanceof frs) {
                        frsVar = (frs) childAt;
                        break;
                    }
                    i2++;
                }
            }
            this.a = frsVar;
            frsVar.getClass();
        }
        frw a = frsVar.d.a(this);
        if (a == null) {
            List list = frsVar.c;
            list.getClass();
            a = (frw) (list.isEmpty() ? null : list.remove(0));
            if (a == null) {
                if (frsVar.e > ffdx.e(frsVar.b)) {
                    a = new frw(frsVar.getContext());
                    frsVar.addView(a);
                    frsVar.b.add(a);
                } else {
                    a = (frw) frsVar.b.get(frsVar.e);
                    frt frtVar = (frt) frsVar.d.b.get(a);
                    if (frtVar != null) {
                        frtVar.f();
                        frsVar.d.b(frtVar);
                        a.a();
                    }
                }
                int i3 = frsVar.e;
                if (i3 < frsVar.a - 1) {
                    frsVar.e = i3 + 1;
                } else {
                    frsVar.e = 0;
                }
            }
            fru fruVar = frsVar.d;
            fruVar.a.put(this, a);
            fruVar.b.put(a, this);
        }
        frw frwVar = a;
        boolean z = ((fsa) this).b;
        int b = ffln.b(f);
        long j2 = j();
        float f2 = ((frj) ((fsa) this).c.invoke()).d;
        fre freVar = new fre(this);
        if (frwVar.b == null || !ffkj.e(Boolean.valueOf(z), frwVar.c)) {
            fsh fshVar = new fsh(z);
            frwVar.setBackground(fshVar);
            frwVar.b = fshVar;
            frwVar.c = Boolean.valueOf(z);
        }
        fsh fshVar2 = frwVar.b;
        fshVar2.getClass();
        frwVar.e = freVar;
        frwVar.b(j, b, j2, f2);
        if (z) {
            fshVar2.setHotspot(iak.b(dwpVar.a), iak.c(dwpVar.a));
        } else {
            fshVar2.setHotspot(fshVar2.getBounds().centerX(), fshVar2.getBounds().centerY());
        }
        frwVar.c(true);
        l(frwVar);
    }

    @Override // defpackage.fsa
    public final void b(ifr ifrVar) {
        ibt b = ifrVar.t().b();
        frw frwVar = this.j;
        if (frwVar != null) {
            frwVar.b(this.f, ffln.b(this.e), j(), ((frj) ((fsa) this).c.invoke()).d);
            frwVar.draw(iav.a(b));
        }
    }

    @Override // defpackage.frt
    public final void f() {
        l(null);
    }

    @Override // defpackage.fsa
    public final void g(dwp dwpVar) {
        frw frwVar = this.j;
        if (frwVar != null) {
            frwVar.c(false);
        }
    }

    @Override // defpackage.hvh
    public final void t() {
        frs frsVar = this.a;
        if (frsVar != null) {
            f();
            frw a = frsVar.d.a(this);
            if (a != null) {
                a.a();
                frsVar.d.b(this);
                frsVar.c.add(a);
            }
        }
    }
}
