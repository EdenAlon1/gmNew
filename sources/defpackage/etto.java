package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etto extends RuntimeException {
    public etto(String str) {
        super(str);
    }

    public static Object a(ettn ettnVar) {
        try {
            return ettnVar.a();
        } catch (Exception e) {
            throw new etto(e);
        }
    }

    public etto(String str, Throwable th) {
        super(str, th);
    }

    public etto(Throwable th) {
        super(th);
    }
}
