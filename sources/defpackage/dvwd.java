package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvwd implements dvwe {
    public final errl a;
    public final Set b;

    public dvwd(errl errlVar, Set set) {
        this.a = errlVar;
        this.b = set;
    }

    @Override // defpackage.dvwe
    public final ListenableFuture a(final dvwk dvwkVar) {
        return erqt.n(eldl.c(new erog() { // from class: dvwb
            @Override // defpackage.erog
            public final ListenableFuture a() {
                dvwd dvwdVar = dvwd.this;
                final ArrayList arrayList = new ArrayList(dvwdVar.b.size());
                Iterator it = dvwdVar.b.iterator();
                while (it.hasNext()) {
                    arrayList.add(((dvwe) it.next()).a(dvwkVar));
                }
                return erqt.c(arrayList).a(new Callable() { // from class: dvwc
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        Iterator it2 = arrayList.iterator();
                        dvvz dvvzVar = null;
                        while (it2.hasNext()) {
                            dvvz dvvzVar2 = (dvvz) erqt.q((ListenableFuture) it2.next());
                            if (dvvzVar2 != null) {
                                emxf.m(dvvzVar == null, "More than one auth provider provided result.");
                                dvvzVar = dvvzVar2;
                            }
                        }
                        if (dvvzVar != null) {
                            return dvvzVar;
                        }
                        throw new UnsupportedOperationException("Unknown LogAuthSpec or Missing Module.");
                    }
                }, dvwdVar.a);
            }
        }), this.a);
    }
}
