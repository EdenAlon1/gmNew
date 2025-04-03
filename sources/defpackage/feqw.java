package defpackage;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class feqw extends OutputStream {
    public final List a = new ArrayList();
    final /* synthetic */ feqz b;
    private fevx c;

    public feqw(feqz feqzVar) {
        this.b = feqzVar;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        byte b = (byte) i;
        fevx fevxVar = this.c;
        if (fevxVar == null || fevxVar.b() <= 0) {
            write(new byte[]{b}, 0, 1);
        } else {
            this.c.c(b);
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        if (this.c == null) {
            feqz feqzVar = this.b;
            fevx a = feqzVar.g.a(Math.max(4096, i2));
            this.c = a;
            this.a.add(a);
        }
        while (i2 > 0) {
            int min = Math.min(i2, this.c.b());
            if (min == 0) {
                int a2 = this.c.a();
                fevx a3 = this.b.g.a(Math.max(i2, a2 + a2));
                this.c = a3;
                this.a.add(a3);
            } else {
                this.c.d(bArr, i, min);
                i += min;
                i2 -= min;
            }
        }
    }
}
