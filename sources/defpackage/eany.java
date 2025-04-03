package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eany {
    /* JADX WARN: Type inference failed for: r1v6, types: [eatm, java.lang.Object] */
    public static final eatm a(emxc emxcVar, emxc emxcVar2, eagp eagpVar, ffbr ffbrVar) {
        eagpVar.getClass();
        if (eagpVar.a()) {
            if (!((Boolean) ffbrVar.b()).booleanValue()) {
                throw new IllegalStateException("GnpRegistrationDataProvider must be provided for non-unified FCM registrations");
            }
        } else {
            if (!eagpVar.b()) {
                throw new IllegalStateException("Unsupported targetType for RegistrationDataProviderHelper");
            }
            emxcVar = emxcVar2;
        }
        return ((emxn) emxcVar).a;
    }
}
