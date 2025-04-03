package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
abstract class ejwe {
    public static final ejwd f = new ejwd<Object>() { // from class: ejwe.1
        @Override // defpackage.ejwd
        public final void a(Throwable th) {
            throw new IllegalStateException("Empty callbacks received a callback.");
        }

        @Override // defpackage.ejwd
        public final void b(Object obj) {
            throw new IllegalStateException("Empty callbacks received a callback.");
        }

        @Override // defpackage.ejwd
        public final void hB() {
            throw new IllegalStateException("Empty callbacks received a callback.");
        }
    };

    public abstract long a();

    public abstract ejwd b();

    public abstract emxc c();

    public abstract emxc d();

    public abstract boolean e();

    final ejwe f(ejvg ejvgVar) {
        return new ejuc(a(), b(), e(), emxc.j(ejvgVar), emxc.j(ejvgVar));
    }

    final ejwe g(boolean z) {
        emxf.m(b() instanceof ejud, "Non-BackgroundFetchCallbacks shouldn't be mutating around background fetch callbacks.");
        emxf.m(z != e(), "Double-open or double-close on background fetch callbacks.");
        return new ejuc(a(), b(), z, d(), c());
    }
}
