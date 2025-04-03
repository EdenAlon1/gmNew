package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ort {
    public abstract String a();

    public abstract void b(oxf oxfVar, Object obj);

    public final void c(ouz ouzVar, Iterable iterable) {
        ouzVar.getClass();
        if (iterable == null) {
            return;
        }
        ovi a = ouzVar.a(a());
        try {
            enqv it = ((engw) iterable).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next != null) {
                    b(a, next);
                    a.j();
                    a.h();
                }
            }
            ffit.a(a, null);
        } finally {
        }
    }
}
