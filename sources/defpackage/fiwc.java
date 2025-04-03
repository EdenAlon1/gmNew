package defpackage;

import java.net.InetAddress;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fiwc extends fizg {
    private static final long serialVersionUID = -8815026887337346789L;
    private int a;
    private InetAddress b;
    private fiyt c;

    @Override // defpackage.fizg
    public final String a() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.a);
        if (this.b != null) {
            stringBuffer.append(" ");
            stringBuffer.append(this.b.getHostAddress());
        }
        if (this.c != null) {
            stringBuffer.append(" ");
            stringBuffer.append(this.c);
        }
        return stringBuffer.toString();
    }

    @Override // defpackage.fizg
    public final fizg b() {
        return new fiwc();
    }

    @Override // defpackage.fizg
    public final void c(fixb fixbVar) {
        int c = fixbVar.c();
        this.a = c;
        if (c < 128) {
            byte[] bArr = new byte[16];
            int i = (135 - c) / 8;
            fixbVar.f(bArr, 16 - i, i);
            this.b = InetAddress.getByAddress(bArr);
        }
        if (this.a > 0) {
            this.c = new fiyt(fixbVar);
        }
    }

    @Override // defpackage.fizg
    public final void d(fixd fixdVar, fiwv fiwvVar, boolean z) {
        fixdVar.g(this.a);
        InetAddress inetAddress = this.b;
        if (inetAddress != null) {
            int i = (135 - this.a) / 8;
            fixdVar.b(inetAddress.getAddress(), 16 - i, i);
        }
        fiyt fiytVar = this.c;
        if (fiytVar != null) {
            fiytVar.h(fixdVar, null, z);
        }
    }
}
