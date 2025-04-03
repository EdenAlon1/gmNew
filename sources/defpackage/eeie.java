package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum eeie {
    ABORTED("transaction aborted"),
    TRANSPORT_ERROR("transport error");

    public final String c;

    eeie(String str) {
        this.c = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.c;
    }
}
