package defpackage;

import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class effr implements efie {
    public final String a;
    public final ListenableFuture b;
    public final efge c;
    public final Executor d;
    public final efbm e;
    public final ekyr f;
    public final efeu g = new effp(this);
    public final erqa h = new erqa();
    private final emxc i;

    public effr(String str, ListenableFuture listenableFuture, efge efgeVar, Executor executor, efbm efbmVar, emxc emxcVar, ekyr ekyrVar) {
        this.a = str;
        this.b = erqt.j(listenableFuture);
        this.c = efgeVar;
        this.d = executor;
        this.e = efbmVar;
        this.i = emxcVar;
        this.f = ekyrVar;
    }

    public static ListenableFuture b(final ListenableFuture listenableFuture, final Closeable closeable) {
        return erqt.b(listenableFuture).a(new Callable() { // from class: effn
            @Override // java.util.concurrent.Callable
            public final Object call() {
                closeable.close();
                return erqt.q(listenableFuture);
            }
        }, erpp.a);
    }

    public static boolean g(IOException iOException) {
        return (iOException instanceof efci) || (iOException.getCause() instanceof efci);
    }

    @Override // defpackage.efie
    public final erog a() {
        return new erog() { // from class: effh
            @Override // defpackage.erog
            public final ListenableFuture a() {
                return erqt.j(efih.a(effr.this.b));
            }
        };
    }

    public final ListenableFuture c(final Uri uri, effq effqVar) {
        try {
            return erqt.i(e(uri));
        } catch (IOException e) {
            return !this.i.g() ? erqt.h(e) : g(e) ? erqt.h(e) : erny.g(effqVar.a(e, (efet) this.i.c()), eldl.d(new eroh() { // from class: effm
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    return erqt.i(effr.this.e(uri));
                }
            }), this.d);
        }
    }

    public final ListenableFuture d(ListenableFuture listenableFuture) {
        return erny.g(listenableFuture, eldl.d(new eroh() { // from class: effj
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                effr effrVar = effr.this;
                eyhs eyhsVar = (eyhs) obj;
                Uri uri = (Uri) erqt.q(effrVar.b);
                Uri a = efii.a(uri, ".tmp");
                try {
                    ekzz b = effrVar.f.b("Write " + effrVar.a);
                    try {
                        efcf efcfVar = new efcf();
                        try {
                            efbm efbmVar = effrVar.e;
                            efed efedVar = new efed();
                            efedVar.a = new efcf[]{efcfVar};
                            OutputStream outputStream = (OutputStream) efbmVar.c(a, efedVar);
                            try {
                                effrVar.c.a(eyhsVar, outputStream);
                                efcfVar.b();
                                if (outputStream != null) {
                                    outputStream.close();
                                }
                                b.close();
                                effrVar.e.g(a, uri);
                                return erqt.i(eyhsVar);
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
                            throw efig.a(effrVar.e, uri, e, effrVar.a);
                        }
                    } finally {
                    }
                } catch (IOException e2) {
                    if (effrVar.e.h(a)) {
                        try {
                            effrVar.e.f(a);
                        } catch (IOException e3) {
                            e2.addSuppressed(e3);
                        }
                    }
                    throw e2;
                }
            }
        }), this.d);
    }

    public final eyhs e(Uri uri) {
        InputStream inputStream;
        try {
            try {
                ekzz b = this.f.b("Read " + this.a);
                try {
                    inputStream = (InputStream) this.e.c(uri, new efdy());
                    try {
                        eyhs d = ((efio) this.c).d(inputStream);
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
                throw efig.a(this.e, uri, e, this.a);
            }
        } catch (FileNotFoundException unused) {
            if (!this.e.h(uri)) {
                return ((efin) this.c).a;
            }
            inputStream = (InputStream) this.e.c(uri, new efdy());
            try {
                eyhs d2 = ((efio) this.c).d(inputStream);
                if (inputStream != null) {
                    inputStream.close();
                }
                return d2;
            } finally {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
            }
        }
    }

    @Override // defpackage.efie
    public final String f() {
        return this.a;
    }

    @Override // defpackage.efie
    public final ListenableFuture h(final eroh erohVar, final Executor executor) {
        return this.h.b(eldl.c(new erog() { // from class: efff
            @Override // defpackage.erog
            public final ListenableFuture a() {
                final effr effrVar = effr.this;
                Uri uri = (Uri) erqt.q(effrVar.b);
                efcw efcwVar = new efcw((Closeable) effrVar.e.c(uri, new efdr(false, false)));
                eroh erohVar2 = erohVar;
                Executor executor2 = executor;
                try {
                    final ListenableFuture c = effrVar.c(uri, new effq() { // from class: effk
                        @Override // defpackage.effq
                        public final ListenableFuture a(IOException iOException, efet efetVar) {
                            return efetVar.a(iOException, effr.this.g);
                        }
                    });
                    final ListenableFuture g = erny.g(c, erohVar2, executor2);
                    ListenableFuture b = effr.b(erny.g(g, eldl.d(new eroh() { // from class: effl
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj) {
                            eyhs eyhsVar = (eyhs) erqt.q(c);
                            ListenableFuture listenableFuture = g;
                            return eyhsVar.equals(erqt.q(listenableFuture)) ? listenableFuture : effr.this.d(listenableFuture);
                        }
                    }), erpp.a), efcwVar.a());
                    efcwVar.close();
                    return b;
                } catch (Throwable th) {
                    try {
                        efcwVar.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        }), this.d);
    }

    @Override // defpackage.efie
    public final ListenableFuture i() {
        return erqt.j(erqt.n(eldl.c(new erog() { // from class: effi
            @Override // defpackage.erog
            public final ListenableFuture a() {
                final effr effrVar = effr.this;
                return effrVar.c((Uri) erqt.q(effrVar.b), new effq() { // from class: effg
                    @Override // defpackage.effq
                    public final ListenableFuture a(IOException iOException, final efet efetVar) {
                        final effr effrVar2 = effr.this;
                        return effrVar2.h.b(eldl.c(new erog() { // from class: effe
                            @Override // defpackage.erog
                            public final ListenableFuture a() {
                                ListenableFuture h;
                                effr effrVar3 = effr.this;
                                Uri uri = (Uri) erqt.q(effrVar3.b);
                                efcw efcwVar = new efcw((Closeable) effrVar3.e.c(uri, new efdr(false, false)));
                                efet efetVar2 = efetVar;
                                try {
                                    try {
                                        effrVar3.e(uri);
                                        h = erre.a;
                                    } catch (IOException e) {
                                        h = effr.g(e) ? erqt.h(e) : efetVar2.a(e, effrVar3.g);
                                    }
                                    ListenableFuture b = effr.b(h, efcwVar.a());
                                    efcwVar.close();
                                    return b;
                                } catch (Throwable th) {
                                    try {
                                        efcwVar.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                    throw th;
                                }
                            }
                        }), effrVar2.d);
                    }
                });
            }
        }), this.d));
    }
}
