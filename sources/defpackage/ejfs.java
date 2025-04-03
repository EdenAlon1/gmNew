package defpackage;

import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class ejfs implements qtp {
    public static final /* synthetic */ int b = 0;

    @Override // defpackage.qtp
    public final void a(MessageDigest messageDigest) {
        if ((b().b & 32) != 0) {
            messageDigest.update(b().h.getBytes(a));
        } else {
            messageDigest.update(b().c.getBytes(a));
        }
    }

    public abstract eixz b();
}
