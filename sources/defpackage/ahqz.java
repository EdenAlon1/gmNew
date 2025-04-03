package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahqz implements ahpi {
    private static final enru a = enru.c("com/google/android/apps/messaging/main/RPlusLocusProxy");
    private final ffji b;

    public ahqz(ffji ffjiVar) {
        this.b = ffjiVar;
    }

    @Override // defpackage.ahpi
    public final void a(ahph ahphVar) {
        String str;
        if (ahphVar instanceof ahpf) {
            ensk h = a.h();
            h.Y(ente.a, "Bugle");
            ((enrr) h.h("com/google/android/apps/messaging/main/RPlusLocusProxy", "onUiUpdate", 50, "Locus.kt")).q("update locus context to conversation");
            str = ((ahpf) ahphVar).a;
        } else {
            ensk h2 = a.h();
            h2.Y(ente.a, "Bugle");
            ((enrr) h2.h("com/google/android/apps/messaging/main/RPlusLocusProxy", "onUiUpdate", 54, "Locus.kt")).q("update locus context to non-conversation");
            str = "NonConversationPage";
        }
        this.b.invoke(str);
    }
}
