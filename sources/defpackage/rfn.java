package defpackage;

import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rfn {
    public final qxf a;
    public final qxd b;

    public rfn(qxf qxfVar, qxd qxdVar) {
        this.a = qxfVar;
        this.b = qxdVar;
    }

    public final void a(Bitmap bitmap) {
        this.a.d(bitmap);
    }

    public final void b(byte[] bArr) {
        qxd qxdVar = this.b;
        if (qxdVar == null) {
            return;
        }
        qxdVar.c(bArr);
    }

    public final byte[] c(int i) {
        qxd qxdVar = this.b;
        return qxdVar == null ? new byte[i] : (byte[]) qxdVar.a(i, byte[].class);
    }
}
