package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejqm implements ejol {
    private final ekvn a;
    private final ffbr b;
    private final ffbr c;

    public ejqm(ekvn ekvnVar, ffbr ffbrVar, ffbr ffbrVar2) {
        this.a = ekvnVar;
        this.b = ffbrVar;
        this.c = ffbrVar2;
    }

    @Override // defpackage.ejol
    public final ListenableFuture a(ListenableFuture listenableFuture) {
        return c(listenableFuture, new eroh() { // from class: ejqi
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return ((ejod) obj).c();
            }
        });
    }

    @Override // defpackage.ejol
    public final ListenableFuture b(erog erogVar) {
        Set set = (Set) ((fbbb) this.c).a;
        enin i = enip.i(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            i.c(new ejql((ejob) it.next()));
        }
        return this.a.a(erogVar, i.g());
    }

    public final ListenableFuture c(final ListenableFuture listenableFuture, eroh erohVar) {
        Set set = (Set) ((fbbb) this.b).a;
        enin i = enip.i(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            i.c(new ejqk(erohVar, (ejod) it.next()));
        }
        return this.a.a(new erog() { // from class: ejqg
            @Override // defpackage.erog
            public final ListenableFuture a() {
                return ListenableFuture.this;
            }
        }, i.g());
    }
}
