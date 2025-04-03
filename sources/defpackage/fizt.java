package defpackage;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import org.xbill.DNS2.ResolverConfig;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fizt implements fizj {
    private static int d;
    public InetSocketAddress a;
    public InetSocketAddress b;
    public boolean c;
    private long e;

    public fizt() {
        this(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x022c, code lost:
    
        return r11;
     */
    @Override // defpackage.fizj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.fiyh a(defpackage.fiyh r18) {
        /*
            Method dump skipped, instructions count: 615
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fizt.a(fiyh):fiyh");
    }

    @Override // defpackage.fizj
    public final void b(int i) {
        this.e = i * 1000;
    }

    @Override // defpackage.fizj
    public final Object c(fiyh fiyhVar, fixi fixiVar) {
        Integer num;
        synchronized (this) {
            int i = d;
            d = i + 1;
            num = new Integer(i);
        }
        fizg c = fiyhVar.c();
        String fiytVar = c != null ? c.f.toString() : "(none)";
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(getClass());
        stringBuffer.append(": ");
        stringBuffer.append(fiytVar);
        String stringBuffer2 = stringBuffer.toString();
        fizi fiziVar = new fizi(this, fiyhVar, num, fixiVar);
        fiziVar.setName(stringBuffer2);
        fiziVar.setDaemon(true);
        fiziVar.start();
        return num;
    }

    public fizt(String str) {
        this.e = 10000L;
        if (str == null) {
            String[] strArr = ResolverConfig.b().servers;
            str = strArr == null ? null : strArr[0];
            if (str == null) {
                str = "localhost";
            }
        }
        this.a = new InetSocketAddress(str.equals("0") ? InetAddress.getLocalHost() : InetAddress.getByName(str), 53);
    }
}
