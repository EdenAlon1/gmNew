package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejvo {
    public final List a = DesugarCollections.synchronizedList(new ArrayList());
    public final ejvp b;

    public ejvo(ejvp ejvpVar) {
        this.b = ejvpVar;
    }

    public final ListenableFuture a(final ejvj ejvjVar) {
        ejtw ejtwVar = (ejtw) ejvjVar;
        final emwl emwlVar = ejtwVar.c;
        if (emwlVar != null) {
            this.a.add(emwlVar);
            this.b.a(erqt.i(null), ejtwVar.b);
        }
        ListenableFuture listenableFuture = ejtwVar.a;
        listenableFuture.b(eldl.l(new Runnable() { // from class: ejvk
            @Override // java.lang.Runnable
            public final void run() {
                emwl emwlVar2 = emwlVar;
                ejvo ejvoVar = ejvo.this;
                if (emwlVar2 != null) {
                    ejvoVar.a.remove(emwlVar2);
                }
                ejvoVar.b.a(erqt.i(null), ((ejtw) ejvjVar).b);
            }
        }), erpp.a);
        return listenableFuture;
    }
}
