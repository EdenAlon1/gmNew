package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public abstract class gd extends pco {
    public final fr a;
    public gg b = null;
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public ea e = null;
    private boolean h;

    public gd(fr frVar) {
        this.a = frVar;
    }

    @Override // defpackage.pco
    public final Parcelable a() {
        Bundle bundle;
        if (this.c.size() > 0) {
            bundle = new Bundle();
            dz[] dzVarArr = new dz[this.c.size()];
            this.c.toArray(dzVarArr);
            bundle.putParcelableArray("states", dzVarArr);
        } else {
            bundle = null;
        }
        for (int i = 0; i < this.d.size(); i++) {
            ea eaVar = (ea) this.d.get(i);
            if (eaVar != null && eaVar.aF()) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                this.a.T(bundle, a.h(i, "f"), eaVar);
            }
        }
        return bundle;
    }

    public abstract ea b(int i);

    @Override // defpackage.pco
    public final Object c(ViewGroup viewGroup, int i) {
        dz dzVar;
        ea eaVar;
        if (this.d.size() > i && (eaVar = (ea) this.d.get(i)) != null) {
            return eaVar;
        }
        if (this.b == null) {
            this.b = new cg(this.a);
        }
        ea b = b(i);
        if (this.c.size() > i && (dzVar = (dz) this.c.get(i)) != null) {
            b.aw(dzVar);
        }
        while (this.d.size() <= i) {
            this.d.add(null);
        }
        b.ax(false);
        this.d.set(i, b);
        this.b.s(viewGroup.getId(), b);
        this.b.o(b, lkj.STARTED);
        return b;
    }

    @Override // defpackage.pco
    public final void e(Parcelable parcelable, ClassLoader classLoader) {
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            this.c.clear();
            this.d.clear();
            if (parcelableArray != null) {
                for (Parcelable parcelable2 : parcelableArray) {
                    this.c.add((dz) parcelable2);
                }
            }
            for (String str : bundle.keySet()) {
                if (str.startsWith("f")) {
                    int parseInt = Integer.parseInt(str.substring(1));
                    ea j = this.a.j(bundle, str);
                    if (j != null) {
                        while (this.d.size() <= parseInt) {
                            this.d.add(null);
                        }
                        j.ax(false);
                        this.d.set(parseInt, j);
                    } else {
                        Log.w("FragmentStatePagerAdapt", "Bad fragment at key ".concat(String.valueOf(str)));
                    }
                }
            }
        }
    }

    @Override // defpackage.pco
    public final void f(ViewGroup viewGroup, int i, Object obj) {
        ea eaVar = (ea) obj;
        ea eaVar2 = this.e;
        if (eaVar != eaVar2) {
            if (eaVar2 != null) {
                eaVar2.ax(false);
                if (this.b == null) {
                    this.b = new cg(this.a);
                }
                this.b.o(this.e, lkj.STARTED);
            }
            eaVar.ax(true);
            if (this.b == null) {
                this.b = new cg(this.a);
            }
            this.b.o(eaVar, lkj.RESUMED);
            this.e = eaVar;
        }
    }

    @Override // defpackage.pco
    public final void g(ViewGroup viewGroup) {
        if (viewGroup.getId() == -1) {
            throw new IllegalStateException(a.i(this, "ViewPager with adapter ", " requires a view id"));
        }
    }

    @Override // defpackage.pco
    public final boolean h(View view, Object obj) {
        return ((ea) obj).Q == view;
    }

    @Override // defpackage.pco
    public final void i() {
        gg ggVar = this.b;
        if (ggVar != null) {
            if (!this.h) {
                try {
                    this.h = true;
                    ggVar.d();
                } finally {
                    this.h = false;
                }
            }
            this.b = null;
        }
    }
}
