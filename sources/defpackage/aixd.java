package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aixd {
    private static final Object a = new Object();
    private final cskc b = cskc.g("Bugle", "P13nLoader");
    private boolean c = false;
    private boolean d = false;

    public final boolean a() {
        synchronized (a) {
            if (this.c) {
                return !this.d;
            }
            try {
                csli.b("tflite_jni");
                this.c = true;
                return true;
            } catch (UnsatisfiedLinkError e) {
                if (!Thread.currentThread().isInterrupted()) {
                    this.c = true;
                }
                this.b.s("Problem linking Smart Reply P13n JNIs.", e);
                this.d = true;
                return false;
            } catch (Throwable th) {
                if (!Thread.currentThread().isInterrupted()) {
                    this.c = true;
                }
                this.b.s("Problem loading Smart Reply P13n JNIs.", th);
                this.d = true;
                return false;
            }
        }
    }
}
