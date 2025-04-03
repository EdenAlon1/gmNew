package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctis {
    private static final Object a = new Object();
    private final cskc b = cskc.g("Bugle", "HobbesTfLiteLoader");
    private boolean c = false;
    private boolean d = false;

    public final boolean a() {
        synchronized (a) {
            if (this.c) {
                return !this.d;
            }
            try {
                csli.b("hobbes_jni");
                csli.b("tflite_jni");
                this.c = true;
                return true;
            } catch (UnsatisfiedLinkError e) {
                if (!Thread.currentThread().isInterrupted()) {
                    this.c = true;
                }
                this.b.s("Problem linking Smart Reply JNIs.", e);
                this.d = true;
                return false;
            } catch (Throwable th) {
                if (!Thread.currentThread().isInterrupted()) {
                    this.c = true;
                }
                this.b.s("Problem loading Smart Reply JNIs.", th);
                this.d = true;
                return false;
            }
        }
    }
}
