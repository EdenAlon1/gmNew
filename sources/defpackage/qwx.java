package defpackage;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qwx implements qtp {
    private static final rkc b = new rkc(50);
    private final qxd c;
    private final qtp d;
    private final qtp e;
    private final int f;
    private final int g;
    private final Class h;
    private final qtu i;
    private final qty j;

    public qwx(qxd qxdVar, qtp qtpVar, qtp qtpVar2, int i, int i2, qty qtyVar, Class cls, qtu qtuVar) {
        this.c = qxdVar;
        this.d = qtpVar;
        this.e = qtpVar2;
        this.f = i;
        this.g = i2;
        this.j = qtyVar;
        this.h = cls;
        this.i = qtuVar;
    }

    @Override // defpackage.qtp
    public final void a(MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.c.e(byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.f).putInt(this.g).array();
        this.e.a(messageDigest);
        this.d.a(messageDigest);
        messageDigest.update(bArr);
        qty qtyVar = this.j;
        if (qtyVar != null) {
            qtyVar.a(messageDigest);
        }
        this.i.a(messageDigest);
        Class cls = this.h;
        rkc rkcVar = b;
        byte[] bArr2 = (byte[]) rkcVar.h(cls);
        if (bArr2 == null) {
            bArr2 = this.h.getName().getBytes(a);
            rkcVar.i(this.h, bArr2);
        }
        messageDigest.update(bArr2);
        this.c.c(bArr);
    }

    @Override // defpackage.qtp
    public final boolean equals(Object obj) {
        if (obj instanceof qwx) {
            qwx qwxVar = (qwx) obj;
            if (this.g == qwxVar.g && this.f == qwxVar.f && rkh.l(this.j, qwxVar.j) && this.h.equals(qwxVar.h) && this.d.equals(qwxVar.d) && this.e.equals(qwxVar.e) && this.i.equals(qwxVar.i)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.qtp
    public final int hashCode() {
        int hashCode = (this.d.hashCode() * 31) + this.e.hashCode();
        qty qtyVar = this.j;
        int i = (((hashCode * 31) + this.f) * 31) + this.g;
        if (qtyVar != null) {
            i = (i * 31) + qtyVar.hashCode();
        }
        return (((i * 31) + this.h.hashCode()) * 31) + this.i.hashCode();
    }

    public final String toString() {
        qtu qtuVar = this.i;
        qty qtyVar = this.j;
        Class cls = this.h;
        qtp qtpVar = this.e;
        return "ResourceCacheKey{sourceKey=" + String.valueOf(this.d) + ", signature=" + String.valueOf(qtpVar) + ", width=" + this.f + ", height=" + this.g + ", decodedResourceClass=" + String.valueOf(cls) + ", transformation='" + String.valueOf(qtyVar) + "', options=" + String.valueOf(qtuVar) + "}";
    }
}
