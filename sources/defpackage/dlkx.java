package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlkx {
    public static final /* synthetic */ int a = 0;

    static {
        Object a2;
        try {
            System.loadLibrary("tartarus");
        } catch (UnsatisfiedLinkError e) {
            try {
                a2 = Class.forName("android.app.Application", false, null);
            } catch (Throwable th) {
                a2 = ffci.a(th);
            }
            if (ffch.d(a2)) {
                throw e;
            }
        }
    }
}
