package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class edai {
    private final emyl b;
    private final emyl c;
    private volatile int d = 0;
    public final CopyOnWriteArrayList a = new CopyOnWriteArrayList();
    private final Object e = new Object();
    private volatile ListenableFuture f = null;

    public edai(emyl emylVar, emyl emylVar2) {
        this.b = emylVar;
        this.c = emylVar2;
    }

    public final ListenableFuture a(eull eullVar, boolean z, edag edagVar) {
        ListenableFuture listenableFuture;
        edav edavVar = (edav) this.b.get();
        if (edavVar == null && !z) {
            return erre.a;
        }
        int i = eullVar.h;
        emxf.a(true);
        int i2 = 1 << i;
        if ((this.d & i2) == 0) {
            synchronized (this.a) {
                int i3 = this.d;
                if ((i3 & i2) == 0) {
                    this.a.add(edagVar);
                    this.d = i2 | i3;
                }
            }
        }
        ListenableFuture listenableFuture2 = this.f;
        if (listenableFuture2 != null) {
            return listenableFuture2;
        }
        synchronized (this.e) {
            listenableFuture = this.f;
            if (listenableFuture == null) {
                if (edavVar == null) {
                    edavVar = new edav() { // from class: edaf
                        @Override // defpackage.edav
                        public final void a() {
                        }
                    };
                }
                listenableFuture = ((ecxc) this.c.get()).j(new edah(this, edavVar));
                this.f = listenableFuture;
            }
        }
        return listenableFuture;
    }
}
