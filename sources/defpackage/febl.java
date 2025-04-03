package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class febl {
    private final febi a;
    private final Object b;
    private volatile byte[] c;

    public febl(febi febiVar, Object obj) {
        this.a = febiVar;
        this.b = obj;
    }

    public static febi a(febj febjVar) {
        return (febi) (febi.class.isInstance(febjVar.c) ? febi.class.cast(febjVar.c) : null);
    }

    public final InputStream b() {
        return this.a.a(this.b);
    }

    final byte[] c() {
        if (this.c == null) {
            synchronized (this) {
                if (this.c == null) {
                    this.c = febo.k(b());
                }
            }
        }
        return this.c;
    }
}
