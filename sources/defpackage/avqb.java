package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avqb implements avrk {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/CapabilitiesLoggingInterceptor");
    private final avrk b;
    private final errl c;

    public avqb(avrk avrkVar, errl errlVar) {
        this.b = avrkVar;
        this.c = errlVar;
    }

    @Override // defpackage.avrk
    public final elfl a(Iterable iterable) {
        elfl a2 = this.b.a(iterable);
        a2.k(new avpz(), this.c);
        return a2;
    }

    @Override // defpackage.avrk
    public final elfl b(awui awuiVar) {
        elfl b = this.b.b(awuiVar);
        b.k(new avqa(awuiVar), this.c);
        return b;
    }
}
