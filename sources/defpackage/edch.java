package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.util.Log;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class edch {
    public static final Object a = new Object();
    public static final Object b = new Object();
    public final emyl c;
    public final emyl d;
    public final emyl e;
    public final emyl f;
    public final Uri g;
    public volatile ecxx h;
    public final Uri i;
    public volatile ecya j;
    private final Context k;
    private final emyl l;

    public edch(Context context, final emyl emylVar, emyl emylVar2, emyl emylVar3) {
        this.k = context;
        this.d = emylVar;
        this.c = emylVar3;
        this.e = emylVar2;
        Pattern pattern = efbs.a;
        efbr efbrVar = new efbr(context);
        efbrVar.f("phenotype_storage_info");
        efbrVar.g("storage-info.pb");
        this.g = efbrVar.a();
        efbr efbrVar2 = new efbr(context);
        efbrVar2.f("phenotype_storage_info");
        efbrVar2.g("device-encrypted-storage-info.pb");
        int i = dubc.a;
        efbrVar2.d();
        this.i = efbrVar2.a();
        this.f = emys.a(new emyl() { // from class: edce
            @Override // defpackage.emyl
            public final Object get() {
                final edch edchVar = edch.this;
                errm errmVar = (errm) edchVar.d.get();
                errmVar.getClass();
                ecxc ecxcVar = (ecxc) edchVar.c.get();
                ecxcVar.getClass();
                final ListenableFuture f = erny.f(ernq.f(erqc.o(ecxcVar.e()), ecxd.class, new emwl() { // from class: edca
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        ecxd ecxdVar = (ecxd) obj;
                        if (ecxdVar.a != 29514) {
                            throw ecxdVar;
                        }
                        ecyd ecydVar = (ecyd) ecye.a.createBuilder();
                        ecxw ecxwVar = (ecxw) ecxx.b.createBuilder();
                        long currentTimeMillis = System.currentTimeMillis();
                        ecxwVar.copyOnWrite();
                        ecxx ecxxVar = (ecxx) ecxwVar.instance;
                        ecxxVar.c |= 8;
                        ecxxVar.g = currentTimeMillis;
                        ecydVar.copyOnWrite();
                        ecye ecyeVar = (ecye) ecydVar.instance;
                        ecxx ecxxVar2 = (ecxx) ecxwVar.build();
                        ecxxVar2.getClass();
                        ecyeVar.c = ecxxVar2;
                        ecyeVar.b |= 1;
                        return (ecye) ecydVar.build();
                    }
                }, errmVar), new emwl() { // from class: edcb
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        ecye ecyeVar = (ecye) obj;
                        efcf efcfVar = new efcf();
                        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskWrites().build());
                        edch edchVar2 = edch.this;
                        try {
                            try {
                                synchronized (edch.a) {
                                    efbm efbmVar = (efbm) edchVar2.e.get();
                                    Uri uri = edchVar2.g;
                                    ecxx ecxxVar = ecyeVar.c;
                                    if (ecxxVar == null) {
                                        ecxxVar = ecxx.b;
                                    }
                                    efec efecVar = new efec(ecxxVar);
                                    efecVar.a = new efcf[]{efcfVar};
                                    efbmVar.c(uri, efecVar);
                                    ecxx ecxxVar2 = ecyeVar.c;
                                    if (ecxxVar2 == null) {
                                        ecxxVar2 = ecxx.b;
                                    }
                                    edchVar2.h = ecxxVar2;
                                }
                                synchronized (edch.b) {
                                    efbm efbmVar2 = (efbm) edchVar2.e.get();
                                    Uri uri2 = edchVar2.i;
                                    ecya ecyaVar = ecyeVar.d;
                                    if (ecyaVar == null) {
                                        ecyaVar = ecya.b;
                                    }
                                    efec efecVar2 = new efec(ecyaVar);
                                    efecVar2.a = new efcf[]{efcfVar};
                                    efbmVar2.c(uri2, efecVar2);
                                    ecya ecyaVar2 = ecyeVar.d;
                                    if (ecyaVar2 == null) {
                                        ecyaVar2 = ecya.b;
                                    }
                                    edchVar2.j = ecyaVar2;
                                }
                                StrictMode.setThreadPolicy(threadPolicy);
                                return null;
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                        } catch (Throwable th) {
                            StrictMode.setThreadPolicy(threadPolicy);
                            throw th;
                        }
                    }
                }, errmVar);
                f.b(new Runnable() { // from class: edcc
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            erqt.q(ListenableFuture.this);
                        } catch (Exception e) {
                            if (Log.isLoggable("StorageInfoHandler", 3)) {
                                Log.d("StorageInfoHandler", "Failed to get storage info from GMS", e);
                            }
                        }
                    }
                }, errmVar);
                return f;
            }
        });
        this.l = emys.a(new emyl() { // from class: edcf
            @Override // defpackage.emyl
            public final Object get() {
                errm errmVar = (errm) emyl.this.get();
                errmVar.getClass();
                return errmVar.schedule(new Callable() { // from class: edcg
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return null;
                    }
                }, 10000L, TimeUnit.MILLISECONDS);
            }
        });
    }

    private final ecxx d() {
        ecxx ecxxVar;
        ecxx ecxxVar2 = this.h;
        if (ecxxVar2 != null) {
            return ecxxVar2;
        }
        synchronized (a) {
            ecxxVar = this.h;
            if (ecxxVar == null) {
                ecxxVar = ecxx.b;
                efdx b2 = efdx.b(ecxxVar);
                StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().build());
                try {
                    try {
                        ecxx ecxxVar3 = (ecxx) ((efbm) this.e.get()).c(this.g, b2);
                        StrictMode.setThreadPolicy(threadPolicy);
                        ecxxVar = ecxxVar3;
                    } catch (IOException unused) {
                    }
                    this.h = ecxxVar;
                } finally {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
            }
        }
        return ecxxVar;
    }

    private final ListenableFuture e(boolean z) {
        errm errmVar = (errm) this.d.get();
        errmVar.getClass();
        return erny.g(erqc.o(z ? erqt.j((ListenableFuture) this.l.get()) : erre.a), new eroh() { // from class: edcd
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return erqt.j((ListenableFuture) edch.this.f.get());
            }
        }, errmVar);
    }

    public final edbo a(boolean z) {
        boolean z2;
        engw n;
        eyee eyeeVar;
        String str;
        engw n2;
        engw n3;
        int i;
        boolean z3;
        boolean z4;
        String str2 = "";
        if (z) {
            ecya ecyaVar = this.j;
            if (ecyaVar == null) {
                synchronized (b) {
                    ecyaVar = this.j;
                    if (ecyaVar == null) {
                        ecyaVar = ecya.b;
                        efdx b2 = efdx.b(ecyaVar);
                        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().build());
                        try {
                            ecya ecyaVar2 = (ecya) ((efbm) this.e.get()).c(this.i, b2);
                            StrictMode.setThreadPolicy(threadPolicy);
                            ecyaVar = ecyaVar2;
                        } catch (IOException unused) {
                            StrictMode.setThreadPolicy(threadPolicy);
                        } catch (Throwable th) {
                            StrictMode.setThreadPolicy(threadPolicy);
                            throw th;
                        }
                        this.j = ecyaVar;
                    }
                }
            }
            z2 = ecyaVar.e;
            n = engw.n(new eygk(ecyaVar.i, ecya.a));
            eyeeVar = ecyaVar.d;
            str = ecyaVar.f;
            n2 = engw.n(ecyaVar.g);
            n3 = engw.n(ecyaVar.h);
            if ((ecyaVar.c & 8) != 0) {
                ecyc ecycVar = ecyaVar.j;
                if (ecycVar == null) {
                    ecycVar = ecyc.a;
                }
                if (ecycVar.c == Build.VERSION.SDK_INT) {
                    ecyc ecycVar2 = ecyaVar.j;
                    if (ecycVar2 == null) {
                        ecycVar2 = ecyc.a;
                    }
                    str2 = ecycVar2.b;
                }
            }
            i = ecyaVar.c & 1;
            z3 = ecyaVar.l;
            z4 = ecyaVar.k;
        } else {
            ecxx d = d();
            z2 = d.e;
            n = engw.n(new eygk(d.j, ecxx.a));
            eyeeVar = d.d;
            str = d.f;
            n2 = engw.n(d.h);
            n3 = engw.n(d.i);
            if ((d.c & 16) != 0) {
                ecyc ecycVar3 = d.k;
                if (ecycVar3 == null) {
                    ecycVar3 = ecyc.a;
                }
                if (ecycVar3.c == Build.VERSION.SDK_INT) {
                    ecyc ecycVar4 = d.k;
                    if (ecycVar4 == null) {
                        ecycVar4 = ecyc.a;
                    }
                    str2 = ecycVar4.b;
                }
            }
            i = d.c & 1;
            z3 = d.m;
            z4 = d.l;
        }
        return new edbo(z2, n, eyeeVar, str, str2, n2, n3, 1 == i, z3, z4);
    }

    public final ListenableFuture b() {
        return e(false);
    }

    public final void c() {
        if (!dubc.d(this.k) && d().g + TimeUnit.HOURS.toMillis(24L) < System.currentTimeMillis()) {
            e(true);
        } else {
            ListenableFuture listenableFuture = erre.a;
        }
    }
}
