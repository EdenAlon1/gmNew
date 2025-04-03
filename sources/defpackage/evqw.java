package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evqw {
    private static evqw c;
    public final evru a;
    public final evrs b;
    private final evrj d = new evrj();
    private final evqe e;

    private evqw(Context context) {
        evrh evrhVar = new evrh(context.getAssets());
        this.e = evrhVar;
        this.b = new evrs(new evrt("Metadata"), evrhVar);
        this.a = new evrv(new evrt("ShortNums"), evrhVar);
        new evrk(evrhVar, evrp.c());
    }

    public static evqw a() {
        evqw evqwVar = c;
        if (evqwVar != null) {
            return evqwVar;
        }
        throw new IllegalStateException("Context not configured");
    }

    public static synchronized void b(Context context) {
        synchronized (evqw.class) {
            if (c != null) {
                throw new IllegalStateException("Context already configured");
            }
            c = new evqw(context);
        }
    }
}
