package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public enum febr {
    UNARY,
    CLIENT_STREAMING,
    SERVER_STREAMING,
    BIDI_STREAMING,
    UNKNOWN;

    public final boolean a() {
        return this == UNARY || this == SERVER_STREAMING;
    }

    public final boolean b() {
        return this == UNARY || this == CLIENT_STREAMING;
    }
}
