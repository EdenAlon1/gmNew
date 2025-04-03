package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class coyp {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/sms/TelephonyRetryWrapperInterfaceImpl");

    public static final Optional b(ffix ffixVar, ffji ffjiVar) {
        try {
            return Optional.ofNullable(ffixVar.invoke());
        } catch (Exception e) {
            return (Optional) ffjiVar.invoke(e);
        }
    }

    public final Optional a(final ffix ffixVar) {
        return b(ffixVar, new ffji() { // from class: coyo
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                Exception exc = (Exception) obj;
                exc.getClass();
                ((enrr) ((enrr) coyp.a.j()).g(exc).h("com/google/android/apps/messaging/shared/sms/TelephonyRetryWrapperInterfaceImpl", "telephonyCallWithRetry$lambda$1", 25, "TelephonyRetryWrapperInterfaceImpl.kt")).q("Initial Telephony call failed. Attempting retry");
                return coyp.b(ffix.this, new ffji() { // from class: coyn
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj2) {
                        Exception exc2 = (Exception) obj2;
                        exc2.getClass();
                        ((enrr) ((enrr) coyp.a.j()).g(exc2).h("com/google/android/apps/messaging/shared/sms/TelephonyRetryWrapperInterfaceImpl", "telephonyCallWithRetry$lambda$1$lambda$0", 28, "TelephonyRetryWrapperInterfaceImpl.kt")).q("Retry failed. Returning empty optional");
                        return Optional.empty();
                    }
                });
            }
        });
    }
}
