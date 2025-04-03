package defpackage;

import java.net.InetAddress;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fixq extends fizg {
    private static final long serialVersionUID = 3050449702765909687L;
    private int a;
    private int b;
    private int c;
    private Object d;
    private byte[] e;

    @Override // defpackage.fizg
    public final String a() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.a);
        stringBuffer.append(" ");
        stringBuffer.append(this.b);
        stringBuffer.append(" ");
        stringBuffer.append(this.c);
        stringBuffer.append(" ");
        int i = this.b;
        if (i == 0) {
            stringBuffer.append(".");
        } else if (i == 1 || i == 2) {
            stringBuffer.append(((InetAddress) this.d).getHostAddress());
        } else if (i == 3) {
            stringBuffer.append(this.d);
        }
        if (this.e != null) {
            stringBuffer.append(" ");
            stringBuffer.append(fjav.a(this.e));
        }
        return stringBuffer.toString();
    }

    @Override // defpackage.fizg
    public final fizg b() {
        return new fixq();
    }

    @Override // defpackage.fizg
    public final void c(fixb fixbVar) {
        this.a = fixbVar.c();
        this.b = fixbVar.c();
        this.c = fixbVar.c();
        int i = this.b;
        if (i == 0) {
            this.d = null;
        } else if (i == 1) {
            this.d = InetAddress.getByAddress(fixbVar.i(4));
        } else if (i == 2) {
            this.d = InetAddress.getByAddress(fixbVar.i(16));
        } else {
            if (i != 3) {
                throw new fjan("invalid gateway type");
            }
            this.d = new fiyt(fixbVar);
        }
        if (fixbVar.d() > 0) {
            this.e = fixbVar.h();
        }
    }

    @Override // defpackage.fizg
    public final void d(fixd fixdVar, fiwv fiwvVar, boolean z) {
        fixdVar.g(this.a);
        fixdVar.g(this.b);
        fixdVar.g(this.c);
        int i = this.b;
        if (i == 1 || i == 2) {
            fixdVar.a(((InetAddress) this.d).getAddress());
        } else if (i == 3) {
            ((fiyt) this.d).h(fixdVar, null, z);
        }
        byte[] bArr = this.e;
        if (bArr != null) {
            fixdVar.a(bArr);
        }
    }
}
