package defpackage;

import java.net.InetAddress;
import java.net.UnknownHostException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fiws extends fixg {
    private int a;
    private int b;
    private int c;
    private InetAddress d;

    public fiws() {
        super(8);
    }

    @Override // defpackage.fixg
    public final String a() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.d.getHostAddress());
        stringBuffer.append("/");
        stringBuffer.append(this.b);
        stringBuffer.append(", scope netmask ");
        stringBuffer.append(this.c);
        return stringBuffer.toString();
    }

    @Override // defpackage.fixg
    public final void b(fixb fixbVar) {
        int b = fixbVar.b();
        this.a = b;
        if (b != 1 && b != 2) {
            throw new fjan("unknown address family");
        }
        int c = fixbVar.c();
        this.b = c;
        if (c > fiwi.a(this.a) * 8) {
            throw new fjan("invalid source netmask");
        }
        int c2 = fixbVar.c();
        this.c = c2;
        if (c2 > fiwi.a(this.a) * 8) {
            throw new fjan("invalid scope netmask");
        }
        byte[] h = fixbVar.h();
        int length = h.length;
        if (length != ((this.b + 7) >> 3)) {
            throw new fjan("invalid address");
        }
        byte[] bArr = new byte[fiwi.a(this.a)];
        System.arraycopy(h, 0, bArr, 0, length);
        try {
            InetAddress byAddress = InetAddress.getByAddress(bArr);
            this.d = byAddress;
            if (!fiwi.d(byAddress, this.b).equals(this.d)) {
                throw new fjan("invalid padding");
            }
        } catch (UnknownHostException e) {
            throw new fjan(e);
        }
    }

    @Override // defpackage.fixg
    public final void c(fixd fixdVar) {
        fixdVar.d(this.a);
        fixdVar.g(this.b);
        fixdVar.g(this.c);
        fixdVar.b(this.d.getAddress(), 0, (this.b + 7) >> 3);
    }
}
