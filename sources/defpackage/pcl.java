package defpackage;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class pcl {
    final cpn a;
    final cpn b;
    final cpn c;

    public pcl(cpn cpnVar, cpn cpnVar2, cpn cpnVar3) {
        this.a = cpnVar;
        this.b = cpnVar2;
        this.c = cpnVar3;
    }

    private final Class E(Class cls) {
        Class cls2 = (Class) this.c.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
        this.c.put(cls.getName(), cls3);
        return cls3;
    }

    public abstract boolean A(int i);

    public abstract byte[] B();

    public final pcn C(pcn pcnVar) {
        return !A(1) ? pcnVar : f();
    }

    public final void D(pcn pcnVar) {
        l(1);
        x(pcnVar);
    }

    protected abstract int a();

    public final int b(int i, int i2) {
        return !A(i2) ? i : a();
    }

    protected abstract Parcelable c();

    public final Parcelable d(Parcelable parcelable, int i) {
        return !A(i) ? parcelable : c();
    }

    protected abstract pcl e();

    public final pcn f() {
        String i = i();
        if (i == null) {
            return null;
        }
        pcl e = e();
        try {
            Method method = (Method) this.a.get(i);
            if (method == null) {
                method = Class.forName(i, false, pcl.class.getClassLoader()).getDeclaredMethod("read", pcl.class);
                this.a.put(i, method);
            }
            return (pcn) method.invoke(null, e);
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException(e2);
        } catch (IllegalAccessException e3) {
            throw new RuntimeException(e3);
        } catch (NoSuchMethodException e4) {
            throw new RuntimeException(e4);
        } catch (InvocationTargetException e5) {
            Throwable cause = e5.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException(e5);
        }
    }

    protected abstract CharSequence g();

    public final CharSequence h(CharSequence charSequence, int i) {
        return !A(i) ? charSequence : g();
    }

    protected abstract String i();

    public final String j(String str, int i) {
        return !A(i) ? str : i();
    }

    protected abstract void k();

    public abstract void l(int i);

    protected abstract void m(boolean z);

    public final void n(boolean z, int i) {
        l(i);
        m(z);
    }

    public abstract void o(byte[] bArr);

    protected abstract void p(CharSequence charSequence);

    public final void q(CharSequence charSequence, int i) {
        l(i);
        p(charSequence);
    }

    protected abstract void r(int i);

    public final void s(int i, int i2) {
        l(i2);
        r(i);
    }

    protected abstract void t(Parcelable parcelable);

    public final void u(Parcelable parcelable, int i) {
        l(i);
        t(parcelable);
    }

    protected abstract void v(String str);

    public final void w(String str, int i) {
        l(i);
        v(str);
    }

    public final void x(pcn pcnVar) {
        if (pcnVar == null) {
            v(null);
            return;
        }
        try {
            v(E(pcnVar.getClass()).getName());
            pcl e = e();
            try {
                Class<?> cls = pcnVar.getClass();
                Method method = (Method) this.b.get(cls.getName());
                if (method == null) {
                    method = E(cls).getDeclaredMethod("write", cls, pcl.class);
                    this.b.put(cls.getName(), method);
                }
                method.invoke(null, pcnVar, e);
                e.k();
            } catch (ClassNotFoundException e2) {
                throw new RuntimeException(e2);
            } catch (IllegalAccessException e3) {
                throw new RuntimeException(e3);
            } catch (NoSuchMethodException e4) {
                throw new RuntimeException(e4);
            } catch (InvocationTargetException e5) {
                Throwable cause = e5.getCause();
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                if (!(cause instanceof Error)) {
                    throw new RuntimeException(e5);
                }
                throw ((Error) cause);
            }
        } catch (ClassNotFoundException e6) {
            throw new RuntimeException(String.valueOf(pcnVar.getClass().getSimpleName()).concat(" does not have a Parcelizer"), e6);
        }
    }

    protected abstract boolean y();

    public final boolean z(boolean z, int i) {
        return !A(i) ? z : y();
    }
}
