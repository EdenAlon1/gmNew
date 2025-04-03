package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eaok extends Exception {
    public eaok() {
        super("Failed to access GNP API");
    }

    public eaok(Throwable th) {
        super("Failed to parse the response returned from GNP API", th);
    }
}
