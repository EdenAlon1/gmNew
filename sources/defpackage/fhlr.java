package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhlr {
    public static final byte[] a = {42};
    public static final List b = ffdx.b("*");
    public static final fhlr c = new fhlr();
    public final AtomicBoolean d = new AtomicBoolean(false);
    public final CountDownLatch e = new CountDownLatch(1);
    public byte[] f;
    public byte[] g;

    public final List a(String str) {
        List U = ffpc.U(str, new char[]{'.'});
        return ffkj.e(ffdx.P(U), "") ? ffdx.Z(U, 1) : U;
    }

    public final void b() {
        fflb fflbVar;
        fflb fflbVar2;
        InputStream resourceAsStream;
        CountDownLatch countDownLatch;
        boolean z = false;
        while (true) {
            try {
                try {
                    try {
                        fflbVar = new fflb();
                        fflbVar2 = new fflb();
                        resourceAsStream = fhlr.class.getResourceAsStream("publicsuffixes.gz");
                        break;
                    } catch (Throwable th) {
                        this.e.countDown();
                        throw th;
                    }
                } finally {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                }
            } catch (InterruptedIOException unused) {
                Thread.interrupted();
                z = true;
            } catch (IOException e) {
                fhlc.b.l("Failed to read public suffix list", 5, e);
            }
        }
        if (resourceAsStream == null) {
            countDownLatch = this.e;
        } else {
            fhnp fhnpVar = new fhnp(new fhnb(fhne.b(resourceAsStream)));
            try {
                fflbVar.a = fhnpVar.G(fhnpVar.f());
                fflbVar2.a = fhnpVar.G(fhnpVar.f());
                ffig.a(fhnpVar, null);
                synchronized (this) {
                    Object obj = fflbVar.a;
                    obj.getClass();
                    this.f = (byte[]) obj;
                    Object obj2 = fflbVar2.a;
                    obj2.getClass();
                    this.g = (byte[]) obj2;
                }
                countDownLatch = this.e;
            } finally {
            }
        }
        countDownLatch.countDown();
    }
}
