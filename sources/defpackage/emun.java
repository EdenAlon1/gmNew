package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emun extends lml implements emuq {
    private static volatile Handler j;
    public emtv d;
    public boolean g;
    public final String i;
    private final llv k;
    public final cpo a = new cpo();
    public final Set b = new cmj();
    public fr c = null;
    public boolean e = false;
    public boolean f = false;
    public boolean h = false;

    public emun(llv llvVar) {
        this.g = false;
        this.k = llvVar;
        this.i = emwl.class.getName() + ea.class.getName() + getClass().getName();
        if (llvVar.f()) {
            Bundle bundle = (Bundle) llvVar.b("FutureListenerState");
            this.g = true;
            l(bundle);
            Parcelable[] parcelableArray = bundle.getParcelableArray("futures");
            if (parcelableArray != null) {
                for (Parcelable parcelable : parcelableArray) {
                    this.b.add((emur) parcelable);
                }
            }
        }
        llvVar.e("FutureListenerState", new owu() { // from class: emuk
            @Override // defpackage.owu
            public final Bundle a() {
                Bundle bundle2 = new Bundle();
                emun emunVar = emun.this;
                bundle2.putString("appVersion", emunVar.i);
                int c = emunVar.a.c();
                int[] iArr = new int[c];
                for (int i = 0; i < c; i++) {
                    iArr[i] = emunVar.a.b(i);
                }
                bundle2.putIntArray("callback_ids", iArr);
                Set set = emunVar.b;
                bundle2.putParcelableArray("futures", (Parcelable[]) set.toArray(new emur[((cmj) set).c]));
                return bundle2;
            }
        });
    }

    public static final void f() {
        emxf.m(Looper.myLooper() == Looper.getMainLooper(), "Must be called from the main thread.");
    }

    private final void l(Bundle bundle) {
        String string = bundle.getString("appVersion");
        if (string == null) {
            throw new emum("Got key but not value from saved state.");
        }
        if (this.i.equals(string)) {
            return;
        }
        throw new emum("Got data from old app version: expected=" + this.i + " got=" + string);
    }

    public final void a(Runnable runnable) {
        this.h = true;
        try {
            runnable.run();
        } finally {
            this.h = false;
        }
    }

    @Override // defpackage.emuq
    public final void b(final emur emurVar, final Throwable th) {
        c(emurVar, new Runnable() { // from class: emuh
            @Override // java.lang.Runnable
            public final void run() {
                emun emunVar = emun.this;
                cpo cpoVar = emunVar.a;
                final emur emurVar2 = emurVar;
                final emtz emtzVar = (emtz) cpp.a(cpoVar, emurVar2.a);
                final Throwable th2 = th;
                emunVar.a(new Runnable() { // from class: emul
                    @Override // java.lang.Runnable
                    public final void run() {
                        emtz.this.a(emurVar2.b, th2);
                    }
                });
            }
        });
    }

    public final void c(final emur emurVar, final Runnable runnable) {
        if (this.c != null) {
            if (j == null) {
                j = new Handler(Looper.getMainLooper());
            }
            j.post(new Runnable() { // from class: emug
                @Override // java.lang.Runnable
                public final void run() {
                    emun emunVar = emun.this;
                    fr frVar = emunVar.c;
                    if (frVar != null) {
                        if (frVar.ai()) {
                            emunVar.e = true;
                        } else {
                            if (frVar.x) {
                                return;
                            }
                            if (emunVar.b.remove(emurVar)) {
                                runnable.run();
                            }
                        }
                    }
                }
            });
        }
    }

    final void e(fr frVar) {
        boolean z = true;
        emxf.a(frVar != null);
        fr frVar2 = this.c;
        emxf.l(frVar2 == null || frVar == frVar2);
        if (!this.f) {
            if (this.k.f()) {
                Bundle bundle = (Bundle) this.k.b("FutureListenerState");
                l(bundle);
                for (int i : bundle.getIntArray("callback_ids")) {
                    emxf.m(cpp.a(this.a, i) != null, "Didn't re-register callback.");
                }
            }
            this.f = true;
        }
        if (!this.e && this.c != null) {
            z = false;
        }
        if (this.c == null) {
            this.c = frVar;
        }
        if (z) {
            this.e = false;
            cmi cmiVar = new cmi((cmj) this.b);
            while (cmiVar.hasNext()) {
                emur emurVar = (emur) cmiVar.next();
                if (!emurVar.c()) {
                    k(emurVar);
                }
                emurVar.b(this);
            }
        }
    }

    @Override // defpackage.lml
    public final void fD() {
        Log.i("FutureListener", "Dropped results for " + ((cmj) this.b).c + " pending futures.");
        cmi cmiVar = new cmi((cmj) this.b);
        while (cmiVar.hasNext()) {
            final emur emurVar = (emur) cmiVar.next();
            if (((emtz) cpp.a(this.a, emurVar.a)) != null) {
                a(new Runnable() { // from class: emue
                    @Override // java.lang.Runnable
                    public final void run() {
                        emur emurVar2 = emur.this;
                        Object obj = emurVar2.b;
                        ListenableFuture listenableFuture = emurVar2.c;
                    }
                });
            }
        }
        this.b.clear();
    }

    public final void k(final emur emurVar) {
        a(new Runnable() { // from class: emuj
            @Override // java.lang.Runnable
            public final void run() {
                Object obj = emur.this.b;
            }
        });
    }
}
