package defpackage;

import android.content.Context;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneId;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class diky {
    private final Context a;
    private LocalDate b;
    private double c;

    public diky(Context context) {
        this.a = context;
    }

    public final double a() {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            long b = digu.b(this.a.getContentResolver(), "android_id", 0L);
            LocalDate b2 = Instant.ofEpochMilli(dkvj.a().longValue()).atZone(ZoneId.systemDefault()).b();
            if (b2.equals(this.b)) {
                return this.c;
            }
            messageDigest.update(ermr.f(b));
            messageDigest.update(b2.toString().getBytes());
            double nextDouble = new Random(ermr.c(messageDigest.digest())).nextDouble() * 100.0d;
            this.b = b2;
            this.c = nextDouble;
            return nextDouble;
        } catch (NoSuchAlgorithmException unused) {
            return eobe.a;
        }
    }
}
