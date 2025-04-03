package defpackage;

import android.content.pm.Signature;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dufw {
    public static final enru a = enru.c("com/google/android/libraries/geller/gellersync/util/GrpcMetadataUtil");

    public static emxc a(Signature signature) {
        try {
            return emxc.i(eoeg.h.f().j(MessageDigest.getInstance("SHA1").digest(signature.toByteArray())));
        } catch (NoSuchAlgorithmException e) {
            ((enrr) ((enrr) ((enrr) a.i()).g(e)).h("com/google/android/libraries/geller/gellersync/util/GrpcMetadataUtil", "signatureDigest", (char) 160, "GrpcMetadataUtil.java")).q("Failed to parse a signature");
            return emux.a;
        }
    }
}
