package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
abstract class eyjc {
    private static volatile int a = 100;

    public abstract Object a(Object obj);

    public abstract Object b();

    public abstract void c(Object obj, int i, int i2);

    public abstract void d(Object obj, int i, long j);

    public abstract void e(Object obj, int i, Object obj2);

    public abstract void f(Object obj, int i, eyee eyeeVar);

    public abstract void g(Object obj, int i, long j);

    public abstract void h(Object obj);

    final boolean i(Object obj, eyie eyieVar, int i) {
        eyem eyemVar = (eyem) eyieVar;
        int i2 = eyemVar.b;
        int a2 = eyjt.a(i2);
        int b = eyjt.b(i2);
        if (b == 0) {
            g(obj, a2, eyieVar.k());
            return true;
        }
        if (b == 1) {
            d(obj, a2, eyieVar.j());
            return true;
        }
        if (b == 2) {
            f(obj, a2, eyieVar.o());
            return true;
        }
        if (b != 3) {
            if (b == 4) {
                if (i != 0) {
                    return false;
                }
                throw new eygu("Protocol message end-group tag did not match expected tag.");
            }
            if (b != 5) {
                throw new eygt();
            }
            c(obj, a2, eyieVar.e());
            return true;
        }
        Object b2 = b();
        int c = eyjt.c(a2, 4);
        int i3 = i + 1;
        if (i3 >= a) {
            throw new eygu("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (eyieVar.c() != Integer.MAX_VALUE && i(b2, eyieVar, i3)) {
        }
        if (c != eyemVar.b) {
            throw new eygu("Protocol message end-group tag did not match expected tag.");
        }
        j(b2);
        e(obj, a2, b2);
        return true;
    }

    public abstract void j(Object obj);
}
