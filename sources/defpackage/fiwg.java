package defpackage;

import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fiwg extends fizg {
    private static final long serialVersionUID = -1348173791712935864L;
    private List a;

    public static boolean e(int i, int i2) {
        if (i == 1) {
            if (i2 > 32) {
                return false;
            }
        } else if (i == 2 && i2 > 128) {
            return false;
        }
        return true;
    }

    @Override // defpackage.fizg
    public final String a() {
        StringBuffer stringBuffer = new StringBuffer();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            stringBuffer.append((fiwf) it.next());
            if (it.hasNext()) {
                stringBuffer.append(" ");
            }
        }
        return stringBuffer.toString();
    }

    @Override // defpackage.fizg
    public final fizg b() {
        return new fiwg();
    }

    @Override // defpackage.fizg
    public final void c(fixb fixbVar) {
        fiwf fiwfVar;
        this.a = new ArrayList(1);
        while (fixbVar.d() != 0) {
            int b = fixbVar.b();
            int c = fixbVar.c();
            int c2 = fixbVar.c();
            boolean z = (c2 & 128) != 0;
            byte[] i = fixbVar.i(c2 & (-129));
            if (!e(b, c)) {
                throw new fjan("invalid prefix length");
            }
            if (b == 1 || b == 2) {
                int length = i.length;
                int a = fiwi.a(b);
                if (length > a) {
                    throw new fjan("invalid address length");
                }
                if (length != a) {
                    byte[] bArr = new byte[a];
                    System.arraycopy(i, 0, bArr, 0, length);
                    i = bArr;
                }
                InetAddress byAddress = InetAddress.getByAddress(i);
                fiwfVar = new fiwf(fiwi.b(byAddress), z, byAddress, c);
            } else {
                fiwfVar = new fiwf(b, z, i, c);
            }
            this.a.add(fiwfVar);
        }
    }

    @Override // defpackage.fizg
    public final void d(fixd fixdVar, fiwv fiwvVar, boolean z) {
        byte[] address;
        int i;
        for (fiwf fiwfVar : this.a) {
            int i2 = fiwfVar.a;
            if (i2 == 1 || i2 == 2) {
                address = ((InetAddress) fiwfVar.d).getAddress();
                int length = address.length;
                while (true) {
                    length--;
                    if (length >= 0) {
                        if (address[length] != 0) {
                            i = length + 1;
                            break;
                        }
                    } else {
                        i = 0;
                        break;
                    }
                }
            } else {
                address = (byte[]) fiwfVar.d;
                i = address.length;
            }
            int i3 = fiwfVar.b ? i | 128 : i;
            fixdVar.d(fiwfVar.a);
            fixdVar.g(fiwfVar.c);
            fixdVar.g(i3);
            fixdVar.b(address, 0, i);
        }
    }
}
