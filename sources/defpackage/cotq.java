package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cotq {
    private static final entd a = entd.c("BugleBCM");

    public final void a(cotp cotpVar) {
        if (!((Boolean) ayhv.a.e()).booleanValue() || cotpVar.a()) {
            return;
        }
        if (((Boolean) ayhv.f.e()).booleanValue()) {
            ensz enszVar = (ensz) a.i();
            enszVar.aa(ensy.FULL);
            ((ensz) enszVar.h("com/google/android/apps/messaging/shared/sms/CallerApiAccessChecker", "checkApiAccess", 30, "CallerApiAccessChecker.java")).q("BCM is used, but legacy access to telephony was performed.");
            throw new cotr();
        }
        ensz enszVar2 = (ensz) a.i();
        enszVar2.aa(ensy.FULL);
        ((ensz) enszVar2.h("com/google/android/apps/messaging/shared/sms/CallerApiAccessChecker", "checkApiAccess", 36, "CallerApiAccessChecker.java")).q("BCM is used, but legacy access to telephony was performed. Calling getOrCreateThreadId when BCM is used is not allowed");
    }
}
