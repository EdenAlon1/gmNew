package defpackage;

import android.net.LocalServerSocket;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.BindException;
import java.net.SocketException;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rpj {
    public final String b;
    private final rpq c;
    private LocalServerSocket e;
    private final AtomicInteger d = new AtomicInteger();
    public final String a = "main";

    public rpj(String str, rpq rpqVar) {
        this.b = str;
        this.c = rpqVar;
    }

    private static LocalServerSocket b(String str) {
        BindException bindException = null;
        int i = 2;
        while (true) {
            try {
                if (roi.f(3)) {
                    String t = a.t(str, "Trying to bind to @");
                    if (roi.f(3)) {
                        roh.c(3, t);
                    }
                }
                return new LocalServerSocket(str);
            } catch (BindException e) {
                roi.e(e, "Binding error, sleep 1000 ms...");
                if (bindException == null) {
                    bindException = e;
                }
                long currentTimeMillis = System.currentTimeMillis();
                long j = 1000;
                do {
                    try {
                        Thread.sleep(j);
                        break;
                    } catch (InterruptedException unused) {
                        j -= System.currentTimeMillis() - currentTimeMillis;
                        if (j > 0) {
                        }
                    }
                } while (j > 0);
                int i2 = i - 1;
                if (i <= 0) {
                    throw bindException;
                }
                i = i2;
            }
        }
    }

    public final void a(String str) {
        this.e = b(str);
        roi.c("Listening on @".concat(str));
        while (!Thread.interrupted()) {
            try {
                rpi rpiVar = new rpi(this.e.accept(), this.c);
                rpiVar.setName("StethoWorker-" + this.a + "-" + this.d.incrementAndGet());
                rpiVar.setDaemon(true);
                rpiVar.start();
            } catch (InterruptedIOException unused) {
            } catch (SocketException e) {
                if (Thread.interrupted()) {
                    break;
                } else {
                    roi.e(e, "I/O error");
                }
            } catch (IOException e2) {
                roi.e(e2, "I/O error initialising connection thread");
            }
        }
        roi.c("Server shutdown on @".concat(str));
    }
}
