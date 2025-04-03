package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class chxe {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/net/handler/NormalizedPhoneNumberDiscrepancyLogger");
    private final ffbr b;
    private final ffbr c;

    public chxe(ffbr ffbrVar, ffbr ffbrVar2) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        this.b = ffbrVar;
        this.c = ffbrVar2;
    }

    private static final void b(String str) {
        ensk j = a.j();
        j.Y(ente.a, "BugleRcs");
        ((enrr) ((enrr) j).g(new chxd()).h("com/google/android/apps/messaging/shared/net/handler/NormalizedPhoneNumberDiscrepancyLogger", "logPrimesWarningWithStackTrace", 51, "NormalizedPhoneNumberDiscrepancyLogger.kt")).q(str);
    }

    public final void a(String str, int i) {
        str.getClass();
        if (ffpc.J(str)) {
            b("Non E164 phone number");
            ((akzt) this.c.b()).e("Bugle.Dsdr.EmptyPhoneNumber.Count", i);
        } else {
            if (((ctvb) this.b.b()).I(str)) {
                return;
            }
            b("Unexpected empty phone number instead of E164");
            ((akzt) this.c.b()).e("Bugle.Dsdr.NonE164PhoneNumber.Count", i);
        }
    }
}
