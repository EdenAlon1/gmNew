package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum fawk {
    BAD_URL(false),
    CANCELED(false),
    REQUEST_BODY_READ_ERROR(false),
    CONNECTION_ERROR(true),
    SERVER_ERROR(true),
    UNKNOWN(false);

    public final boolean g;

    fawk(boolean z) {
        this.g = z;
    }
}
