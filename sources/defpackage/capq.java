package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class capq extends Exception {
    private final String a;

    public capq(String str) {
        this.a = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.a;
    }
}
