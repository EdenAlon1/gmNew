package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cryl {
    private final ffbr a;
    private final asim b;
    private final axcp c;

    public cryl(ffbr ffbrVar, asim asimVar, axcp axcpVar) {
        this.c = axcpVar;
        this.a = ffbrVar;
        this.b = asimVar;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [eyhs, java.lang.Object] */
    private static eyhs b(eyee eyeeVar, eyhs eyhsVar) {
        try {
            return eyhsVar.getParserForType().f(eyeeVar);
        } catch (eygu e) {
            throw new cryk(e, "Unable to parse ".concat(String.valueOf(eyhsVar.getClass().getName())));
        }
    }

    public final eyhs a(esij esijVar, eyhs eyhsVar) {
        byte[] a;
        try {
            ekzz f = eleg.f("CmsDecryptor#decrypt");
            try {
                int i = esijVar.c;
                if (i == -1) {
                    eyhs b = b(esijVar.b, eyhsVar);
                    f.close();
                    return b;
                }
                byte[] bArr = (byte[]) this.c.get(Integer.valueOf(i));
                if (bArr == null) {
                    throw new cryi(a.h(i, "Failed to get encryption key at keyIndex "));
                }
                byte[] I = esijVar.b.I();
                try {
                    a = crvx.a(I, bArr);
                    e = null;
                } catch (GeneralSecurityException e) {
                    e = e;
                    if (!this.b.a()) {
                        throw e;
                    }
                    a = crvx.a(I, new byte[bArr.length]);
                }
                eyhs b2 = b(eyee.x(a), eyhsVar);
                if (this.b.a() && e != null) {
                    ((akxl) this.a.b()).f("Bugle.Cms.Cloudstore.ZeroKeyFallback", 1);
                    throw new cryh(e, b2);
                }
                f.close();
                return b2;
            } catch (Throwable th) {
                try {
                    f.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (csgt e2) {
            throw e2;
        } catch (Exception e3) {
            throw new cryj(e3, "Unable to decrypt ".concat(String.valueOf(eyhsVar.getClass().getName())));
        }
    }
}
