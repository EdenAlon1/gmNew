package defpackage;

import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import com.android.vcard.VCardConfig;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efhd implements efie {
    public final String a;
    public final ListenableFuture b;
    public final efge c;
    public final Executor d;
    public final efbm e;
    public final efgn f;
    public final emxc g;
    public final ekyr i;
    public Object l;
    public boolean m;
    public final efeu h = new efhc(this);
    public final Object j = new Object();
    public final erqa k = new erqa();
    private final erqa n = new erqa();

    public efhd(String str, ListenableFuture listenableFuture, efge efgeVar, Executor executor, efbm efbmVar, efgn efgnVar, emxc emxcVar, ekyr ekyrVar) {
        new erqa();
        this.l = null;
        this.a = str;
        this.b = erqt.j(listenableFuture);
        this.c = efgeVar;
        this.d = executor;
        this.e = efbmVar;
        this.f = efgnVar;
        this.g = emxcVar;
        this.i = ekyrVar;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            UUID.randomUUID().toString();
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    public static ListenableFuture b(final ListenableFuture listenableFuture, final Closeable closeable, Executor executor) {
        return erqt.b(listenableFuture).a(new Callable() { // from class: efgw
            @Override // java.util.concurrent.Callable
            public final Object call() {
                closeable.close();
                return erqt.q(listenableFuture);
            }
        }, executor);
    }

    public static boolean d(IOException iOException) {
        return (iOException instanceof efci) || (iOException.getCause() instanceof efci);
    }

    private final Closeable j(Uri uri) {
        try {
            efbm efbmVar = this.e;
            efdr efdrVar = new efdr(true, true);
            efdrVar.a = true;
            return (Closeable) efbmVar.c(uri, efdrVar);
        } catch (efcy unused) {
            return null;
        }
    }

    @Override // defpackage.efie
    public final erog a() {
        return new erog() { // from class: efgq
            @Override // defpackage.erog
            public final ListenableFuture a() {
                final efhd efhdVar = efhd.this;
                ListenableFuture j = erqt.j(efhdVar.b);
                final Runnable runnable = new Runnable() { // from class: efgx
                    @Override // java.lang.Runnable
                    public final void run() {
                        efhd efhdVar2 = efhd.this;
                        synchronized (efhdVar2.j) {
                            efhdVar2.l = null;
                            efhdVar2.m = true;
                            synchronized (efhdVar2.j) {
                            }
                        }
                    }
                };
                final effc effcVar = (effc) efhdVar.f;
                return erny.f(j, new emwl() { // from class: efev
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        Uri uri = (Uri) obj;
                        IntentFilter intentFilter = new IntentFilter();
                        intentFilter.addAction("com.google.android.libraries.storage.protostore.MULTI_APP");
                        intentFilter.addDataScheme(uri.getScheme());
                        intentFilter.addDataPath(uri.getPath(), 0);
                        intentFilter.addDataPath(effc.a(uri).getPath(), 0);
                        intentFilter.addDataAuthority("*", null);
                        Runnable runnable2 = runnable;
                        effa effaVar = new effa(runnable2);
                        int i = Build.VERSION.SDK_INT;
                        effc effcVar2 = effc.this;
                        if (i >= 33) {
                            effcVar2.b.registerReceiver(effaVar, intentFilter, effcVar2.d, effcVar2.e, 2);
                        } else {
                            effcVar2.b.registerReceiver(effaVar, intentFilter, effcVar2.d, effcVar2.e);
                        }
                        synchronized (effcVar2.j) {
                            effcVar2.i.t(uri, runnable2);
                        }
                        return null;
                    }
                }, erpp.a);
            }
        };
    }

    public final Object c(Uri uri) {
        InputStream inputStream;
        try {
            try {
                ekzz b = this.i.b("Read " + this.a);
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

    public final ListenableFuture e(final ListenableFuture listenableFuture) {
        ListenableFuture b;
        final effc effcVar = (effc) this.f;
        final Integer num = (Integer) ((emyr) effcVar.f).a;
        if (num.intValue() < 0) {
            b = erre.a;
        } else {
            final ListenableFuture listenableFuture2 = this.b;
            final ListenableFuture g = erny.g(listenableFuture2, effcVar.c, erpp.a);
            b = erqt.d(listenableFuture2, g).b(new erog() { // from class: efex
                @Override // defpackage.erog
                public final ListenableFuture a() {
                    Uri uri = (Uri) erqt.q(listenableFuture2);
                    Set set = (Set) erqt.q(g);
                    effb effbVar = new effb(set);
                    Iterator it = set.iterator();
                    while (true) {
                        effc effcVar2 = effc.this;
                        if (!it.hasNext()) {
                            effb effbVar2 = effbVar;
                            Integer num2 = num;
                            emyg c = emyg.c(emtt.a);
                            final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
                            ListenableFuture f = ernq.f(erqc.o(effbVar2.a).p(num2.intValue(), effcVar2.g, null), TimeoutException.class, new emwl() { // from class: efew
                                @Override // defpackage.emwl
                                public final Object apply(Object obj) {
                                    atomicBoolean.set(false);
                                    return null;
                                }
                            }, erpp.a);
                            erqt.r(f, new efey(effcVar2, atomicBoolean, set, c, effbVar2, num2), erpp.a);
                            return f;
                        }
                        String str = (String) it.next();
                        effb effbVar3 = effbVar;
                        Intent intent = new Intent();
                        intent.setAction("com.google.android.libraries.storage.protostore.MULTI_APP");
                        intent.setData(((Boolean) ((emyr) effcVar2.h).a).booleanValue() ? effc.a(uri) : uri);
                        intent.setPackage(str);
                        intent.setFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
                        effcVar2.b.sendOrderedBroadcast(intent, null, effbVar3, effcVar2.e, -1, null, null);
                        effbVar = effbVar3;
                    }
                }
            }, erpp.a);
        }
        return erny.g(b, eldl.d(new eroh() { // from class: efgr
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final efhd efhdVar = efhd.this;
                return erny.g(listenableFuture, eldl.d(new eroh() { // from class: efgs
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        efhd efhdVar2 = efhd.this;
                        Uri uri = (Uri) erqt.q(efhdVar2.b);
                        Uri a = efii.a(uri, ".tmp");
                        try {
                            ekzz b2 = efhdVar2.i.b("Write " + efhdVar2.a);
                            try {
                                efcf efcfVar = new efcf();
                                try {
                                    efbm efbmVar = efhdVar2.e;
                                    efed efedVar = new efed();
                                    efedVar.a = new efcf[]{efcfVar};
                                    OutputStream outputStream = (OutputStream) efbmVar.c(a, efedVar);
                                    try {
                                        efhdVar2.c.a(obj2, outputStream);
                                        efcfVar.b();
                                        if (outputStream != null) {
                                            outputStream.close();
                                        }
                                        b2.close();
                                        efhdVar2.e.g(a, uri);
                                        synchronized (efhdVar2.j) {
                                            efhdVar2.l = obj2;
                                        }
                                        return erre.a;
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
                                    throw efig.a(efhdVar2.e, uri, e, efhdVar2.a);
                                }
                            } finally {
                            }
                        } catch (IOException e2) {
                            if (efhdVar2.e.h(a)) {
                                try {
                                    efhdVar2.e.f(a);
                                } catch (IOException e3) {
                                    e2.addSuppressed(e3);
                                }
                            }
                            throw e2;
                        }
                    }
                }), efhdVar.d);
            }
        }), erpp.a);
    }

    @Override // defpackage.efie
    public final String f() {
        return this.a;
    }

    public final Object g(Uri uri) {
        Closeable j;
        synchronized (this.j) {
            Object obj = this.l;
            if (obj != null) {
                return obj;
            }
            try {
                j = j(uri);
            } catch (FileNotFoundException unused) {
                Object c = c(uri);
                synchronized (this.j) {
                    if (this.m) {
                        c = null;
                    } else {
                        this.l = c;
                    }
                    if (c != null) {
                        return c;
                    }
                    j = j(uri);
                }
            }
            try {
                Object c2 = c(uri);
                synchronized (this.j) {
                    if (j != null) {
                        this.l = c2;
                        j.close();
                    }
                }
                return c2;
            } catch (Throwable th) {
                if (j != null) {
                    try {
                        j.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
    }

    @Override // defpackage.efie
    public final ListenableFuture h(final eroh erohVar, final Executor executor) {
        return this.k.b(eldl.c(new erog() { // from class: efgu
            @Override // defpackage.erog
            public final ListenableFuture a() {
                ListenableFuture a;
                final ListenableFuture g;
                ListenableFuture h;
                final efhd efhdVar = efhd.this;
                final Uri uri = (Uri) erqt.q(efhdVar.b);
                efcw efcwVar = new efcw((Closeable) efhdVar.e.c(uri, new efdr(false, false)));
                eroh erohVar2 = erohVar;
                Executor executor2 = executor;
                try {
                    try {
                        g = erqt.i(efhdVar.c(uri));
                    } catch (IOException e) {
                        if (efhdVar.g.g()) {
                            if (efhd.d(e)) {
                                a = erqt.h(e);
                            } else {
                                a = ((efet) efhdVar.g.c()).a(e, efhdVar.h);
                            }
                            g = erny.g(a, eldl.d(new eroh() { // from class: efgz
                                @Override // defpackage.eroh
                                public final ListenableFuture a(Object obj) {
                                    return erqt.i(efhd.this.c(uri));
                                }
                            }), efhdVar.d);
                        } else {
                            h = erqt.h(e);
                        }
                    }
                    final ListenableFuture g2 = erny.g(g, erohVar2, executor2);
                    h = efhd.b(erny.g(g2, eldl.d(new eroh() { // from class: efgy
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj) {
                            final ListenableFuture listenableFuture = g2;
                            return erqt.q(g).equals(erqt.q(listenableFuture)) ? listenableFuture : erny.g(efhd.this.e(listenableFuture), eldl.d(new eroh() { // from class: efgp
                                @Override // defpackage.eroh
                                public final ListenableFuture a(Object obj2) {
                                    return ListenableFuture.this;
                                }
                            }), erpp.a);
                        }
                    }), erpp.a), efcwVar.a(), efhdVar.d);
                    efcwVar.close();
                    return h;
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
        synchronized (this.j) {
            Object obj = this.l;
            if (obj == null) {
                return erqt.j(this.n.b(eldl.c(new erog() { // from class: efgt
                    @Override // defpackage.erog
                    public final ListenableFuture a() {
                        final efhd efhdVar = efhd.this;
                        final Uri uri = (Uri) erqt.q(efhdVar.b);
                        try {
                            return erqt.i(efhdVar.g(uri));
                        } catch (IOException e) {
                            if (!efhdVar.g.g()) {
                                return erqt.h(e);
                            }
                            if (efhd.d(e)) {
                                return erqt.h(e);
                            }
                            emxc emxcVar = efhdVar.g;
                            erqa erqaVar = efhdVar.k;
                            final efet efetVar = (efet) emxcVar.c();
                            return erny.g(erqaVar.b(eldl.c(new erog() { // from class: efgv
                                @Override // defpackage.erog
                                public final ListenableFuture a() {
                                    ListenableFuture h;
                                    efhd efhdVar2 = efhd.this;
                                    Uri uri2 = (Uri) erqt.q(efhdVar2.b);
                                    efcw efcwVar = new efcw((Closeable) efhdVar2.e.c(uri2, new efdr(false, false)));
                                    efet efetVar2 = efetVar;
                                    try {
                                        try {
                                            efhdVar2.c(uri2);
                                            h = erre.a;
                                        } catch (IOException e2) {
                                            h = efhd.d(e2) ? erqt.h(e2) : efetVar2.a(e2, efhdVar2.h);
                                        }
                                        ListenableFuture b = efhd.b(h, efcwVar.a(), efhdVar2.d);
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
                            }), efhdVar.d), eldl.d(new eroh() { // from class: efha
                                @Override // defpackage.eroh
                                public final ListenableFuture a(Object obj2) {
                                    return erqt.i(efhd.this.g(uri));
                                }
                            }), efhdVar.d);
                        }
                    }
                }), this.d));
            }
            return erqt.i(obj);
        }
    }
}
