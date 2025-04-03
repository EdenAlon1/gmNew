package defpackage;

import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fiwi {
    public static int a(int i) {
        if (i == 1) {
            return 4;
        }
        if (i == 2) {
            return 16;
        }
        throw new IllegalArgumentException("unknown address family");
    }

    public static int b(InetAddress inetAddress) {
        if (inetAddress instanceof Inet4Address) {
            return 1;
        }
        if (inetAddress instanceof Inet6Address) {
            return 2;
        }
        throw new IllegalArgumentException("unknown address family");
    }

    public static String c(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(bArr[0] & 255);
        stringBuffer.append(".");
        stringBuffer.append(bArr[1] & 255);
        stringBuffer.append(".");
        stringBuffer.append(bArr[2] & 255);
        stringBuffer.append(".");
        stringBuffer.append(bArr[3] & 255);
        return stringBuffer.toString();
    }

    public static InetAddress d(InetAddress inetAddress, int i) {
        int i2;
        int a = a(b(inetAddress)) * 8;
        if (i > a) {
            throw new IllegalArgumentException("invalid mask length");
        }
        if (i == a) {
            return inetAddress;
        }
        byte[] address = inetAddress.getAddress();
        int i3 = i >> 3;
        int i4 = i3 + 1;
        while (true) {
            if (i4 >= address.length) {
                break;
            }
            address[i4] = 0;
            i4++;
        }
        int i5 = 0;
        for (i2 = 0; i2 < (i & 7); i2++) {
            i5 |= 1 << (7 - i2);
        }
        address[i3] = (byte) (address[i3] & i5);
        try {
            return InetAddress.getByAddress(address);
        } catch (UnknownHostException unused) {
            throw new IllegalArgumentException("invalid address");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0104, code lost:
    
        if (r7 < 0) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0106, code lost:
    
        r13 = (16 - r6) + r7;
        java.lang.System.arraycopy(r5, r7, r5, r13, r6 - r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x010d, code lost:
    
        if (r7 >= r13) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x010f, code lost:
    
        r5[r7] = 0;
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0114, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0085, code lost:
    
        if (r13[r8].length() == 0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x00ff, code lost:
    
        if (r6 >= 16) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0101, code lost:
    
        if (r7 >= 0) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0103, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] e(java.lang.String r13, int r14) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fiwi.e(java.lang.String, int):byte[]");
    }

    public static InetAddress[] f(String str) {
        InetAddress byAddress;
        try {
            try {
                byte[] e = e(str, 1);
                if (e != null) {
                    byAddress = InetAddress.getByAddress(str, e);
                } else {
                    byte[] e2 = e(str, 2);
                    if (e2 == null) {
                        StringBuffer stringBuffer = new StringBuffer("Invalid address: ");
                        stringBuffer.append(str);
                        throw new UnknownHostException(stringBuffer.toString());
                    }
                    byAddress = InetAddress.getByAddress(str, e2);
                }
                return new InetAddress[]{byAddress};
            } catch (UnknownHostException unused) {
                fixz fixzVar = new fixz(str, 1);
                fizg[] e3 = fixzVar.e();
                if (e3 != null) {
                    fizg[] e4 = new fixz(str, 28).e();
                    if (e4 != null) {
                        int length = e3.length;
                        int length2 = e4.length;
                        fizg[] fizgVarArr = new fizg[length + length2];
                        System.arraycopy(e3, 0, fizgVarArr, 0, length);
                        System.arraycopy(e4, 0, fizgVarArr, length, length2);
                        e3 = fizgVarArr;
                    }
                } else if (fixzVar.a() != 4 || (e3 = new fixz(str, 28).e()) == null) {
                    throw new UnknownHostException("unknown host");
                }
                InetAddress[] inetAddressArr = new InetAddress[e3.length];
                for (int i = 0; i < e3.length; i++) {
                    fizg fizgVar = e3[i];
                    inetAddressArr[i] = InetAddress.getByAddress(str, (fizgVar instanceof fiwh ? ((fiwh) fizgVar).e() : ((fiwd) fizgVar).e()).getAddress());
                }
                return inetAddressArr;
            }
        } catch (fjad unused2) {
            throw new UnknownHostException("invalid name");
        }
    }
}
