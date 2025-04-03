package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class dtur {
    public static void a(dtuu dtuuVar, final dtut dtutVar, String str, final Runnable runnable, dtuz dtuzVar) {
        ((dtve) ((cbwo) dtuuVar).a.b()).Y(str, new Runnable() { // from class: cbwl
            @Override // java.lang.Runnable
            public final void run() {
                Runnable runnable2 = runnable;
                ekzz a = dtut.this.a();
                try {
                    runnable2.run();
                    a.close();
                } catch (Throwable th) {
                    try {
                        a.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        }, dtuzVar);
    }
}
