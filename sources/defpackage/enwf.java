package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class enwf {
    protected enwf() {
    }

    public static void b(enwd enwdVar, boolean z) {
        try {
            enwdVar.close();
        } catch (RuntimeException e) {
            if (z) {
                return;
            }
            if (!(e instanceof enwc)) {
                throw new enwc(e);
            }
        }
    }

    public abstract enwb a();
}
