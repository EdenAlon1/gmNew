package defpackage;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class clu {
    public static final clu a = new clu(null, new HashMap(), true);
    public final Map b;
    public final boolean c;
    public final Map d = new HashMap();
    public final PackageManager e;

    public clu(PackageManager packageManager, Map map, boolean z) {
        this.e = packageManager;
        this.b = map;
        this.c = z;
    }

    private static MessageDigest b() {
        try {
            return MessageDigest.getInstance("SHA256");
        } catch (NoSuchAlgorithmException e) {
            Log.e("CarApp.Val", "Could not find SHA256 hash algorithm", e);
            return null;
        }
    }

    public final String a(Signature signature) {
        byte[] byteArray = signature.toByteArray();
        MessageDigest b = b();
        if (b == null) {
            return null;
        }
        b.update(byteArray);
        byte[] digest = b.digest();
        StringBuilder sb = new StringBuilder((r1 * 3) - 1);
        for (byte b2 : digest) {
            sb.append(String.format("%02x", Byte.valueOf(b2)));
        }
        return sb.toString();
    }
}
