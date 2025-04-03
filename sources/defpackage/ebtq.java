package defpackage;

import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class ebtq implements qtp {
    public static ebtq c(Object obj, eave eaveVar) {
        return new ebth(ebtg.g(obj, eaveVar));
    }

    @Override // defpackage.qtp
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(b().toString().getBytes(a));
    }

    public abstract ebtg b();

    public final String toString() {
        return "ebtq:" + super.toString();
    }
}
