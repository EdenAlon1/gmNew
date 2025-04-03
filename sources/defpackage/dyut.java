package defpackage;

import android.content.ContentValues;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyut {
    public static ContentValues a(dzja dzjaVar, dzjq dzjqVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("tachyon_app_name", dzjaVar.f());
        dzii dziiVar = (dzii) dzjaVar;
        contentValues.put("server_registration_id", dziiVar.c.I());
        contentValues.put("server_registration_status", Integer.valueOf(dziiVar.d.c));
        dzmi dzmiVar = (dzmi) dzjqVar;
        contentValues.put("tachyon_auth_token", erme.c(dzmiVar.a));
        contentValues.put("auth_token_expire_at_timestamp_ms", dzmiVar.b);
        contentValues.put("auth_token_refreshed_at_timestamp_ms", dzmiVar.c);
        dzpf dzpfVar = dzpf.UNKNOWN;
        if (dzjqVar.g() - 1 != 1) {
            contentValues.put("identity_key_type", (Integer) 0);
            return contentValues;
        }
        contentValues.put("identity_key_type", (Integer) 1);
        contentValues.put("identity_key_private", dzjqVar.f().getPrivate().getEncoded());
        contentValues.put("identity_key_public", dzjqVar.f().getPublic().getEncoded());
        return contentValues;
    }

    public static emxc b(byte[] bArr, byte[] bArr2) {
        if (bArr != null && bArr2 != null) {
            try {
                KeyFactory keyFactory = KeyFactory.getInstance("EC");
                return emxc.j(new KeyPair(keyFactory.generatePublic(new X509EncodedKeySpec(bArr)), keyFactory.generatePrivate(new PKCS8EncodedKeySpec(bArr2))));
            } catch (NoSuchAlgorithmException | InvalidKeySpecException unused) {
            }
        }
        return emux.a;
    }

    public static emxc c(byte[] bArr) {
        try {
            HashMap g = dyhu.g(bArr);
            dznt dzntVar = new dznt();
            if (g.containsKey("last_reported_capabilities")) {
                dzntVar.c(engw.n((ArrayList) g.get("last_reported_capabilities")));
            }
            if (g.containsKey("last_reported_capabilities_time_ms")) {
                dzntVar.b(((Long) g.get("last_reported_capabilities_time_ms")).longValue());
            }
            return emxc.j(dzntVar.a());
        } catch (Exception unused) {
            dyhr.c("RegCursors", "Failed to de-serialize registration properties");
            return emux.a;
        }
    }
}
