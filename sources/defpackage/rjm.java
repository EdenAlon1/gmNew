package defpackage;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rjm implements qtp {
    private final String b;
    private final long c;

    public rjm(String str, long j) {
        this.b = str == null ? "" : str;
        this.c = j;
    }

    @Override // defpackage.qtp
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(ByteBuffer.allocate(12).putLong(this.c).putInt(0).array());
        messageDigest.update(this.b.getBytes(a));
    }

    @Override // defpackage.qtp
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        rjm rjmVar = (rjm) obj;
        return this.c == rjmVar.c && this.b.equals(rjmVar.b);
    }

    @Override // defpackage.qtp
    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        long j = this.c;
        return (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
    }
}
