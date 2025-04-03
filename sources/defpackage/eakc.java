package defpackage;

import java.io.ByteArrayInputStream;
import java.util.zip.InflaterInputStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eakc implements eakb {
    private static final entd a = entd.c("GnpSdk");

    @Override // defpackage.eakb
    public final eafl a(byte[] bArr) {
        bArr.getClass();
        try {
            return new eafo(ffif.a(new InflaterInputStream(new ByteArrayInputStream(bArr))));
        } catch (Exception e) {
            ((ensz) ((ensz) a.i()).g(e)).q("Failed to decompress the decrypted bytes.");
            return new eafi(e);
        }
    }
}
