package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dukb {
    public static volatile dukb e;

    public static dukb c() {
        if (e == null) {
            synchronized (dukb.class) {
                if (e == null) {
                    try {
                        Class.forName("duka");
                        if (e == null) {
                            throw new IllegalStateException("HatsModule is not initialized.");
                        }
                    } catch (ClassNotFoundException e2) {
                        throw new IllegalStateException("Failed to initialize HatsModule", e2);
                    }
                }
            }
        }
        return e;
    }

    public abstract dujb a();

    public abstract duki b();
}
