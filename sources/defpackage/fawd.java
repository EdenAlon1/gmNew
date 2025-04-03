package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class fawd implements fawj {
    public final String a;
    public final String b;
    public final favs c;
    public final String d;
    public final favp e;
    public final favq f;
    public final emxc g;
    public fawj h;
    public fawn i;
    public int j;
    public int k;
    private int l;

    public fawd(String str, favs favsVar, favp favpVar, String str2, favq favqVar, fawp fawpVar) {
        str.getClass();
        favpVar.getClass();
        this.a = str;
        this.b = "POST";
        this.c = favsVar == null ? new favs() : favsVar;
        this.d = emxe.b(str2);
        this.f = favqVar;
        this.e = favpVar;
        this.l = 1;
        this.g = fawpVar.c;
    }

    @Override // defpackage.fawj
    public final long a() {
        return this.e.d();
    }

    @Override // defpackage.fawj
    public final ListenableFuture b() {
        Callable callable = new Callable() { // from class: fawb
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                fawm fawmVar;
                ListenableFuture b;
                fawd fawdVar = fawd.this;
                try {
                } catch (fawl e) {
                    fawmVar = new fawm(e);
                } catch (Throwable th) {
                    fawmVar = new fawm(new fawl(fawk.UNKNOWN, th));
                }
                synchronized (fawdVar) {
                    fawdVar.c();
                    Random random = new Random();
                    StringBuilder sb = new StringBuilder();
                    for (int i = 0; i < 70; i++) {
                        sb.append("0123456789abcdefghijklmnopqrstuvwxyz".charAt(random.nextInt(36)));
                    }
                    String sb2 = sb.toString();
                    favs favsVar = new favs();
                    favs favsVar2 = new favs();
                    for (String str : fawdVar.c.c()) {
                        if (emuz.c(str).startsWith("content-")) {
                            favsVar.e(str, fawdVar.c.a(str));
                        } else {
                            favsVar2.e(str, fawdVar.c.a(str));
                        }
                    }
                    fawa fawaVar = new fawa(sb2, fawdVar.d, favsVar, fawdVar.e);
                    favsVar2.e("X-Goog-Upload-Protocol", "multipart");
                    favsVar2.e(fhpi.a, "multipart/related; boundary=".concat(sb2));
                    fawj a = fawdVar.f.a(fawdVar.a, fawdVar.b, favsVar2, fawaVar);
                    if (fawdVar.i != null) {
                        synchronized (fawdVar) {
                            a.e(new fawc(fawdVar, fawdVar.i), fawdVar.j, fawdVar.k);
                        }
                    }
                    synchronized (fawdVar) {
                        fawdVar.h = a;
                        b = a.b();
                    }
                    try {
                        fawm fawmVar2 = (fawm) b.get();
                        if (fawmVar2.b()) {
                            if (fawmVar2.a.a != fawk.CANCELED) {
                                throw fawmVar2.a;
                            }
                            fawdVar.c();
                        }
                        fawmVar = new fawm(fawmVar2.b);
                        synchronized (fawdVar) {
                        }
                    } catch (InterruptedException e2) {
                        e = e2;
                        throw new RuntimeException("Unexpected error occurred: ".concat(String.valueOf(e.getMessage())));
                    } catch (ExecutionException e3) {
                        e = e3;
                        throw new RuntimeException("Unexpected error occurred: ".concat(String.valueOf(e.getMessage())));
                    }
                }
                return fawmVar;
            }
        };
        ersf ersfVar = new ersf();
        ersfVar.d("Scotty-Uploader-MultipartTransfer-%d");
        errl a = errs.a(Executors.newSingleThreadExecutor(ersf.b(ersfVar)));
        ListenableFuture submit = a.submit(callable);
        a.shutdown();
        return submit;
    }

    public final synchronized void c() {
        int i;
        while (true) {
            i = this.l;
            if (i != 2) {
                break;
            } else {
                try {
                    wait();
                } catch (InterruptedException unused) {
                }
            }
        }
        if (i == 3) {
            throw new fawl(fawk.CANCELED, "");
        }
        emyw.a(i == 1);
    }

    @Override // defpackage.fawj
    public final String d() {
        return null;
    }

    @Override // defpackage.fawj
    public final synchronized void e(fawn fawnVar, int i, int i2) {
        boolean z = true;
        emxf.b(i > 0, "Progress threshold (bytes) must be greater than 0");
        if (i2 < 0) {
            z = false;
        }
        emxf.b(z, "Progress threshold (millis) must be greater or equal to 0");
        this.i = fawnVar;
        this.j = i;
        this.k = i2;
    }

    @Override // defpackage.fawj
    public final void f() {
        synchronized (this) {
            fawj fawjVar = this.h;
            if (fawjVar != null) {
                fawjVar.f();
            }
            this.l = 3;
            notifyAll();
        }
    }
}
