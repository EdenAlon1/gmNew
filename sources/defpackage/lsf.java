package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lsf extends Exception {
    public lsf(String str) {
        super(str);
    }

    public static lsf a(Exception exc) {
        return exc instanceof lsf ? (lsf) exc : new lsf(exc, null);
    }

    public lsf(Throwable th) {
        super(th);
    }

    public lsf(Throwable th, byte[] bArr) {
        super(th);
    }
}
