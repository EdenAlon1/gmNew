package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qym {
    private final rkc a = new rkc(1000);
    private final kst b = rkp.a(10, new qyk());

    public final String a(qtp qtpVar) {
        String str;
        synchronized (this.a) {
            str = (String) this.a.h(qtpVar);
        }
        if (str == null) {
            qyl qylVar = (qyl) this.b.a();
            rkf.f(qylVar);
            try {
                qtpVar.a(qylVar.a);
                byte[] digest = qylVar.a.digest();
                synchronized (rkh.b) {
                    char[] cArr = rkh.b;
                    for (int i = 0; i < digest.length; i++) {
                        byte b = digest[i];
                        int i2 = i + i;
                        char[] cArr2 = rkh.a;
                        cArr[i2] = cArr2[(b & 255) >>> 4];
                        cArr[i2 + 1] = cArr2[b & 15];
                    }
                    str = new String(cArr);
                }
            } finally {
                this.b.b(qylVar);
            }
        }
        synchronized (this.a) {
            this.a.i(qtpVar, str);
        }
        return str;
    }
}
