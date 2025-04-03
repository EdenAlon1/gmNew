package defpackage;

import j$.util.Objects;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fawp {
    public final long a;
    public final long b;
    public final emxc c;
    private final MessageDigest d = null;
    private final boolean e = false;

    public fawp(fawo fawoVar) {
        this.a = fawoVar.a;
        this.b = fawoVar.b;
        this.c = fawoVar.c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fawp)) {
            return false;
        }
        fawp fawpVar = (fawp) obj;
        if (this.a != fawpVar.a || this.b != fawpVar.b) {
            return false;
        }
        MessageDigest messageDigest = fawpVar.d;
        if (!Objects.equals(null, null) || !this.c.equals(fawpVar.c)) {
            return false;
        }
        boolean z = fawpVar.e;
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Long.valueOf(this.b), null, this.c, false});
    }

    public final String toString() {
        return String.format(Locale.US, "TransferOptions[idleTimeout %d sec, resumableTransferThreshold=%d, digest=%s, crc32c=%s, forceMultipart=%s]", Long.valueOf(this.a), Long.valueOf(this.b), null, emux.a, false);
    }
}
