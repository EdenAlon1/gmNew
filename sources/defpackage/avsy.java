package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avsy implements avtc {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/onlinestatus/OnlineStatusLoggingInterceptor");
    private final avtc b;
    private final errl c;

    public avsy(avtc avtcVar, errl errlVar) {
        this.b = avtcVar;
        this.c = errlVar;
    }

    @Override // defpackage.avtc
    public final elfl c(awui awuiVar) {
        elfl c = this.b.c(awuiVar);
        c.k(new avsx(awuiVar), this.c);
        return c;
    }
}
