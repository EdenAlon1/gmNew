package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnih {
    final cnid c;
    public final List b = new ArrayList();
    public final Executor a = new ersb(erpp.a);

    public cnih(cnid cnidVar) {
        this.c = cnidVar;
    }

    public final void a(cniz cnizVar) {
        if (this.b.remove(cnizVar) && this.b.isEmpty()) {
            final cnid cnidVar = this.c;
            axnw.h(elfo.f(new Runnable() { // from class: cnib
                @Override // java.lang.Runnable
                public final void run() {
                    cnid cnidVar2 = cnid.this;
                    cnidVar2.c = false;
                    if (cnidVar2.d) {
                        return;
                    }
                    ((cnjq) cnidVar2.a.b()).a();
                }
            }, cnidVar.b));
        }
    }
}
