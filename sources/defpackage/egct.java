package defpackage;

import com.google.android.gms.auth.UserRecoverableAuthException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egct {
    private final egaa a;

    public egct(egaa egaaVar) {
        this.a = egaaVar;
    }

    public static boolean b(Throwable th) {
        return (th instanceof UserRecoverableAuthException) || (th instanceof dfal);
    }

    public final egdp a(Throwable th) {
        return !this.a.a() ? egdp.OFFLINE : b(th) ? egdp.RETRYABLE : egdp.NON_RETRYABLE;
    }
}
