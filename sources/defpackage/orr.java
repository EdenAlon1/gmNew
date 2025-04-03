package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class orr {
    protected abstract String a();

    protected abstract void b(oxf oxfVar, Object obj);

    public final int c(ouz ouzVar, Iterable iterable) {
        ouzVar.getClass();
        ovi a = ouzVar.a(a());
        try {
            int i = 0;
            for (Object obj : iterable) {
                if (obj != null) {
                    b(a, obj);
                    a.j();
                    a.h();
                    i += owb.a(ouzVar);
                }
            }
            ffit.a(a, null);
            return i;
        } finally {
        }
    }

    public final void d(ouz ouzVar, Object obj) {
        ouzVar.getClass();
        if (obj == null) {
            return;
        }
        ovi a = ouzVar.a(a());
        try {
            b(a, obj);
            a.j();
            ffit.a(a, null);
            owb.a(ouzVar);
        } finally {
        }
    }
}
