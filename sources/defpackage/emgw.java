package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emgw extends RuntimeException {
    public final emgv a;
    private final String b;
    private final Throwable c;

    public /* synthetic */ emgw(emgv emgvVar, Throwable th) {
        String emgvVar2 = emgvVar.toString();
        emgvVar.getClass();
        this.a = emgvVar;
        this.b = emgvVar2;
        this.c = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.c;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.b;
    }
}
