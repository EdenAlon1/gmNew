package defpackage;

import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efhq implements efie {
    public final ListenableFuture a;
    public final Executor b;
    public final efbm c;
    public final emxc d;
    private final String g;
    private final efge h;
    private final ekyr i;
    public final Object e = new Object();
    private final erqa j = new erqa();
    public ListenableFuture f = null;

    public efhq(String str, ListenableFuture listenableFuture, efge efgeVar, Executor executor, efbm efbmVar, emxc emxcVar, ekyr ekyrVar) {
        this.g = str;
        this.a = erqt.j(listenableFuture);
        this.h = efgeVar;
        this.b = new ersb(executor);
        this.c = efbmVar;
        this.d = emxcVar;
        this.i = ekyrVar;
    }

    private final ListenableFuture d() {
        ListenableFuture listenableFuture;
        synchronized (this.e) {
            ListenableFuture listenableFuture2 = this.f;
            if (listenableFuture2 != null && listenableFuture2.isDone()) {
                try {
                    erqt.q(this.f);
                } catch (ExecutionException unused) {
                    this.f = null;
                }
            }
            if (this.f == null) {
                this.f = erqt.j(this.j.b(eldl.c(new erog() { // from class: efhl
                    @Override // defpackage.erog
                    public final ListenableFuture a() {
                        final efhq efhqVar = efhq.this;
                        try {
                            return erqt.i(efhqVar.b((Uri) erqt.q(efhqVar.a)));
                        } catch (IOException e) {
                            return !efhqVar.d.g() ? erqt.h(e) : ((e instanceof efci) || (e.getCause() instanceof efci)) ? erqt.h(e) : erny.g(((efet) efhqVar.d.c()).a(e, new efhp(efhqVar)), eldl.d(new eroh() { // from class: efhg
                                @Override // defpackage.eroh
                                public final ListenableFuture a(Object obj) {
                                    efhq efhqVar2 = efhq.this;
                                    return erqt.i(efhqVar2.b((Uri) erqt.q(efhqVar2.a)));
                                }
                            }), efhqVar.b);
                        }
                    }
                }), this.b));
            }
            listenableFuture = this.f;
        }
        return listenableFuture;
    }

    @Override // defpackage.efie
    public final erog a() {
        return new erog() { // from class: efhk
            @Override // defpackage.erog
            public final ListenableFuture a() {
                final efhq efhqVar = efhq.this;
                return erqt.j(erny.g(efhqVar.a, eldl.d(new eroh() { // from class: efhh
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        Uri uri = (Uri) obj;
                        Uri a = efii.a(uri, ".bak");
                        efhq efhqVar2 = efhq.this;
                        try {
                            if (efhqVar2.c.h(a)) {
                                efhqVar2.c.g(a, uri);
                            }
                            return erre.a;
                        } catch (IOException e) {
                            return erqt.h(e);
                        }
                    }
                }), efhqVar.b));
            }
        };
    }

    public final Object b(Uri uri) {
        try {
            try {
                ekzz b = this.i.b("Read " + this.g);
                try {
                    InputStream inputStream = (InputStream) this.c.c(uri, new efdy());
                    try {
                        eyhs d = ((efio) this.h).d(inputStream);
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        b.close();
                        return d;
                    } finally {
                    }
                } catch (Throwable th) {
                    try {
                        b.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e) {
                throw efig.a(this.c, uri, e, this.g);
            }
        } catch (FileNotFoundException e2) {
            if (this.c.h(uri)) {
                throw e2;
            }
            return ((efin) this.h).a;
        }
    }

    public final void c(Uri uri, Object obj) {
        Uri a = efii.a(uri, ".tmp");
        try {
            ekzz b = this.i.b("Write " + this.g);
            try {
                efcf efcfVar = new efcf();
                try {
                    efbm efbmVar = this.c;
                    efed efedVar = new efed();
                    efedVar.a = new efcf[]{efcfVar};
                    OutputStream outputStream = (OutputStream) efbmVar.c(a, efedVar);
                    try {
                        this.h.a(obj, outputStream);
                        efcfVar.b();
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        b.close();
                        this.c.g(a, uri);
                    } catch (Throwable th) {
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } catch (IOException e) {
                    throw efig.a(this.c, uri, e, this.g);
                }
            } finally {
            }
        } catch (IOException e2) {
            if (this.c.h(a)) {
                try {
                    this.c.f(a);
                } catch (IOException e3) {
                    e2.addSuppressed(e3);
                }
            }
            throw e2;
        }
    }

    @Override // defpackage.efie
    public final String f() {
        return this.g;
    }

    @Override // defpackage.efie
    public final ListenableFuture h(final eroh erohVar, final Executor executor) {
        final ListenableFuture d = d();
        return this.j.b(eldl.c(new erog() { // from class: efhm
            @Override // defpackage.erog
            public final ListenableFuture a() {
                final efhq efhqVar = efhq.this;
                final ListenableFuture g = erny.g(d, new eroh() { // from class: efhi
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        ListenableFuture listenableFuture;
                        efhq efhqVar2 = efhq.this;
                        synchronized (efhqVar2.e) {
                            listenableFuture = efhqVar2.f;
                        }
                        return listenableFuture;
                    }
                }, erpp.a);
                final ListenableFuture g2 = erny.g(g, erohVar, executor);
                return erny.g(g2, eldl.d(new eroh() { // from class: efhn
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        final ListenableFuture listenableFuture = g2;
                        if (erqt.q(g).equals(erqt.q(listenableFuture))) {
                            return erqt.i(obj);
                        }
                        final efhq efhqVar2 = efhq.this;
                        ListenableFuture g3 = erny.g(listenableFuture, eldl.d(new eroh() { // from class: efhj
                            @Override // defpackage.eroh
                            public final ListenableFuture a(Object obj2) {
                                efhq efhqVar3 = efhq.this;
                                efhqVar3.c((Uri) erqt.q(efhqVar3.a), obj2);
                                ListenableFuture listenableFuture2 = listenableFuture;
                                synchronized (efhqVar3.e) {
                                    efhqVar3.f = listenableFuture2;
                                }
                                return erqt.i(obj2);
                            }
                        }), efhqVar2.b);
                        synchronized (efhqVar2.e) {
                        }
                        return g3;
                    }
                }), erpp.a);
            }
        }), erpp.a);
    }

    @Override // defpackage.efie
    public final ListenableFuture i() {
        return d();
    }
}
