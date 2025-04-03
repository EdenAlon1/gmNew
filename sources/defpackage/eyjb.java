package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eyjb extends RuntimeException {
    private static final long serialVersionUID = -7466929953374883507L;

    public eyjb() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final eygu a() {
        return new eygu(getMessage());
    }
}
