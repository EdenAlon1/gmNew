package defpackage;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qyk implements rkl {
    public static final qyl b() {
        try {
            return new qyl(MessageDigest.getInstance("SHA-256"));
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // defpackage.rkl
    public final /* bridge */ /* synthetic */ Object a() {
        return b();
    }
}
