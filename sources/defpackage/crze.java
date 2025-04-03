package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crze {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/util/cloudstore/CmsFeedbackLogger");

    public static final void a(String str) {
        enrr enrrVar = (enrr) a.i();
        enrrVar.aa(ensy.FULL);
        ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/util/cloudstore/CmsFeedbackLogger", "logCmsError", 32, "CmsFeedbackLogger.kt")).q(str);
    }

    public static final void b(String str, Throwable th) {
        th.getClass();
        ((enrr) ((enrr) a.i()).g(th).h("com/google/android/apps/messaging/shared/util/cloudstore/CmsFeedbackLogger", "logCmsErrorWithThrowable", 22, "CmsFeedbackLogger.kt")).q(str);
    }

    public static final void c(String str, Throwable th) {
        th.getClass();
        ((enrr) ((enrr) a.j()).g(th).h("com/google/android/apps/messaging/shared/util/cloudstore/CmsFeedbackLogger", "logCmsWarningWithThrowable", 43, "CmsFeedbackLogger.kt")).q(str);
    }
}
