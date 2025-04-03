package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewym {
    private final ewzv d;
    public List b = new ArrayList();
    public List c = new ArrayList();
    public errl a = null;

    public ewym(ewzv ewzvVar) {
        this.d = ewzvVar;
    }

    public final ListenableFuture a() {
        SettableFuture create = SettableFuture.create();
        synchronized (this) {
            if (!this.c.isEmpty()) {
                this.b.add(create);
                return create;
            }
            this.c.add(create);
            this.a = errs.a(Executors.newSingleThreadExecutor());
            b();
            return create;
        }
    }

    public final void b() {
        final ListenableFuture h = this.d.a.h(this.a);
        h.b(new Runnable() { // from class: ewyl
            @Override // java.lang.Runnable
            public final void run() {
                List<SettableFuture> list;
                errl errlVar;
                boolean z;
                ewym ewymVar = ewym.this;
                ListenableFuture listenableFuture = h;
                synchronized (ewymVar) {
                    list = ewymVar.c;
                    ewymVar.c = ewymVar.b;
                    ewymVar.b = new ArrayList();
                    errlVar = null;
                    if (ewymVar.c.isEmpty()) {
                        errl errlVar2 = ewymVar.a;
                        ewymVar.a = null;
                        errlVar = errlVar2;
                        z = false;
                    } else {
                        z = true;
                    }
                }
                for (SettableFuture settableFuture : list) {
                    try {
                        settableFuture.set(listenableFuture.get());
                    } catch (Throwable th) {
                        settableFuture.setException(th);
                    }
                }
                if (z) {
                    ewymVar.b();
                }
                if (errlVar != null) {
                    errlVar.shutdown();
                }
            }
        }, this.a);
    }
}
