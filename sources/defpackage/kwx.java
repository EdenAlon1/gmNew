package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import j$.util.Objects;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
class kwx extends kxd {
    private static boolean d = false;
    private static Method e;
    private static Class h;
    private static Field i;
    private static Field j;
    final WindowInsets a;
    kpt b;
    int c;
    private kpt[] k;
    private kpt l;
    private kxh m;

    public kwx(kxh kxhVar, WindowInsets windowInsets) {
        super(kxhVar);
        this.l = null;
        this.a = windowInsets;
    }

    private kpt A(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!d) {
            B();
        }
        Method method = e;
        if (method != null && h != null && i != null) {
            try {
                Object invoke = method.invoke(view, new Object[0]);
                if (invoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) i.get(j.get(invoke));
                if (rect != null) {
                    return kpt.c(rect);
                }
                return null;
            } catch (ReflectiveOperationException e2) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). ".concat(String.valueOf(e2.getMessage())), e2);
            }
        }
        return null;
    }

    private static void B() {
        try {
            e = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            h = cls;
            i = cls.getDeclaredField("mVisibleInsets");
            j = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            i.setAccessible(true);
            j.setAccessible(true);
        } catch (ReflectiveOperationException e2) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). ".concat(String.valueOf(e2.getMessage())), e2);
        }
        d = true;
    }

    static boolean n(int i2, int i3) {
        return (i2 & 6) == (i3 & 6);
    }

    private kpt y(int i2, boolean z) {
        kpt kptVar = kpt.a;
        for (int i3 = 1; i3 <= 512; i3 += i3) {
            if ((i2 & i3) != 0) {
                kptVar = kpt.b(kptVar, b(i3, z));
            }
        }
        return kptVar;
    }

    private kpt z() {
        kxh kxhVar = this.m;
        return kxhVar != null ? kxhVar.h() : kpt.a;
    }

    @Override // defpackage.kxd
    public kpt a(int i2) {
        return y(i2, false);
    }

    protected kpt b(int i2, boolean z) {
        kpt h2;
        kpt kptVar;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 8) {
                    kpt[] kptVarArr = this.k;
                    h2 = kptVarArr != null ? kptVarArr[kxe.a(8)] : null;
                    if (h2 != null) {
                        return h2;
                    }
                    kpt d2 = d();
                    kpt z2 = z();
                    int i3 = d2.e;
                    if (i3 > z2.e || ((kptVar = this.b) != null && !kptVar.equals(kpt.a) && (i3 = this.b.e) > z2.e)) {
                        return kpt.d(0, 0, 0, i3);
                    }
                } else {
                    if (i2 == 16) {
                        return w();
                    }
                    if (i2 == 32) {
                        return v();
                    }
                    if (i2 == 64) {
                        return x();
                    }
                    if (i2 == 128) {
                        kxh kxhVar = this.m;
                        ktp j2 = kxhVar != null ? kxhVar.j() : t();
                        if (j2 != null) {
                            return kpt.d(Build.VERSION.SDK_INT >= 28 ? j2.a.getSafeInsetLeft() : 0, Build.VERSION.SDK_INT >= 28 ? j2.a.getSafeInsetTop() : 0, Build.VERSION.SDK_INT >= 28 ? j2.a.getSafeInsetRight() : 0, Build.VERSION.SDK_INT >= 28 ? j2.a.getSafeInsetBottom() : 0);
                        }
                    }
                }
            } else {
                if (z) {
                    kpt z3 = z();
                    kpt o = o();
                    return kpt.d(Math.max(z3.b, o.b), 0, Math.max(z3.d, o.d), Math.max(z3.e, o.e));
                }
                if ((this.c & 2) == 0) {
                    kpt d3 = d();
                    kxh kxhVar2 = this.m;
                    h2 = kxhVar2 != null ? kxhVar2.h() : null;
                    int i4 = d3.e;
                    if (h2 != null) {
                        i4 = Math.min(i4, h2.e);
                    }
                    return kpt.d(d3.b, 0, d3.d, i4);
                }
            }
        } else {
            if (z) {
                return kpt.d(0, Math.max(z().c, d().c), 0, 0);
            }
            if ((this.c & 4) == 0) {
                return kpt.d(0, d().c, 0, 0);
            }
        }
        return kpt.a;
    }

    @Override // defpackage.kxd
    public kpt c(int i2) {
        return y(i2, true);
    }

    @Override // defpackage.kxd
    public final kpt d() {
        if (this.l == null) {
            WindowInsets windowInsets = this.a;
            this.l = kpt.d(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.l;
    }

    @Override // defpackage.kxd
    public kxh e(int i2, int i3, int i4, int i5) {
        kxh o = kxh.o(this.a);
        kww kwvVar = Build.VERSION.SDK_INT >= 34 ? new kwv(o) : Build.VERSION.SDK_INT >= 30 ? new kwu(o) : Build.VERSION.SDK_INT >= 29 ? new kwt(o) : new kws(o);
        kwvVar.c(kxh.i(d(), i2, i3, i4, i5));
        kwvVar.b(kxh.i(o(), i2, i3, i4, i5));
        return kwvVar.a();
    }

    @Override // defpackage.kxd
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        kwx kwxVar = (kwx) obj;
        return Objects.equals(this.b, kwxVar.b) && n(this.c, kwxVar.c);
    }

    @Override // defpackage.kxd
    public void f(View view) {
        kpt A = A(view);
        if (A == null) {
            A = kpt.a;
        }
        h(A);
    }

    @Override // defpackage.kxd
    public void g(kpt[] kptVarArr) {
        this.k = kptVarArr;
    }

    public void h(kpt kptVar) {
        this.b = kptVar;
    }

    @Override // defpackage.kxd
    public void i(kxh kxhVar) {
        this.m = kxhVar;
    }

    @Override // defpackage.kxd
    public void j(int i2) {
        this.c = i2;
    }

    @Override // defpackage.kxd
    public boolean k() {
        return this.a.isRound();
    }

    protected boolean l(int i2) {
        if (i2 != 1 && i2 != 2) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 8 && i2 != 128) {
                return true;
            }
        }
        return !b(i2, false).equals(kpt.a);
    }

    @Override // defpackage.kxd
    public boolean m(int i2) {
        for (int i3 = 1; i3 <= 512; i3 += i3) {
            if ((i2 & i3) != 0 && !l(i3)) {
                return false;
            }
        }
        return true;
    }
}
