package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekvt {
    public final ekvn a;
    public final ffbr b;
    private final ffbr c;

    public ekvt(ekvn ekvnVar, ffbr ffbrVar, ffbr ffbrVar2) {
        this.a = ekvnVar;
        this.c = ffbrVar;
        this.b = ffbrVar2;
    }

    public final ListenableFuture a(final ListenableFuture listenableFuture, eroh erohVar) {
        Set set = (Set) this.c.b();
        enin i = enip.i(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            i.c(new ekvr(erohVar, (ekvv) it.next()));
        }
        return this.a.a(new erog() { // from class: ekvp
            @Override // defpackage.erog
            public final ListenableFuture a() {
                return ListenableFuture.this;
            }
        }, i.g());
    }
}
