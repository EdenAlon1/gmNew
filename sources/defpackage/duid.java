package defpackage;

import android.net.Uri;
import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class duid implements qtp {
    private final duhq b;
    private final int c;
    private final int d;
    private final duic e;
    private String f;

    public duid(duhq duhqVar, int i, int i2, duic duicVar) {
        this.b = duhqVar;
        this.c = i;
        this.d = i2;
        this.e = duicVar;
    }

    private final synchronized String b() {
        if (this.f == null) {
            this.f = Uri.parse(this.e.a().b()).getPath();
        }
        return this.f;
    }

    @Override // defpackage.qtp
    public final void a(MessageDigest messageDigest) {
        duii duiiVar = this.b.c;
        messageDigest.update(b().getBytes(a));
    }

    @Override // defpackage.qtp
    public final boolean equals(Object obj) {
        if (obj instanceof duid) {
            duid duidVar = (duid) obj;
            if (this.b.equals(duidVar.b) && this.c == duidVar.c && this.d == duidVar.d) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.qtp
    public final int hashCode() {
        int i = this.d;
        return rkh.f(this.b, rkh.e(this.c, rkh.d(i)));
    }

    public final String toString() {
        return "FifeUrlKey{fifeModel='" + String.valueOf(this.b) + "', width='" + this.c + "', height='" + this.d + "'}";
    }
}
