package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtyy extends Exception {
    public dtyy() {
    }

    public dtyy(byte[] bArr) {
        super("Cannot set query for invalid data source.");
    }

    public dtyy(Throwable th) {
        super("db query cancelled", th);
    }
}
