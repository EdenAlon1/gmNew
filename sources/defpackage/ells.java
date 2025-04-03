package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ells {
    private final cpn a = new cpn();

    public final elli a(ellf ellfVar) {
        if (!this.a.isEmpty()) {
            Class<?> cls = ellfVar.getClass();
            int i = 0;
            while (true) {
                cpn cpnVar = this.a;
                if (i >= cpnVar.d) {
                    break;
                }
                Class cls2 = (Class) cpnVar.d(i);
                ellh ellhVar = (ellh) this.a.g(i);
                if (cls2.isAssignableFrom(cls)) {
                    return ellhVar.a(ellfVar);
                }
                i++;
            }
        }
        return elli.b;
    }

    public final void b(Class cls, ellh ellhVar) {
        int i = 0;
        while (true) {
            cpn cpnVar = this.a;
            if (i >= cpnVar.d) {
                cpnVar.put(cls, ellhVar);
                return;
            }
            Class<?> cls2 = (Class) cpnVar.d(i);
            emxf.f(!cls.equals(cls2), "Class %s is already registered as a listener. Are you adding the same listener twice?", cls.getSimpleName());
            emxf.i(!cls.isAssignableFrom(cls2), "For class %s, a listener is already registered as a subtype: %s", cls.getSimpleName(), cls2.getSimpleName());
            emxf.i(!cls2.isAssignableFrom(cls), "For class %s, a listener is already registered as a supertype: %s", cls.getSimpleName(), cls2.getSimpleName());
            i++;
        }
    }
}
