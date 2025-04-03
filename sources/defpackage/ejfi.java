package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejfi {
    public final errl a;
    public final ekql b;

    public ejfi(errl errlVar, ekql ekqlVar) {
        this.a = errlVar;
        this.b = ekqlVar;
    }

    final ListenableFuture a(final File file) {
        return this.a.submit(eldl.m(new Callable() { // from class: ejfg
            @Override // java.util.concurrent.Callable
            public final Object call() {
                File file2 = file;
                if (!file2.exists()) {
                    return null;
                }
                eoci eociVar = eoeo.a;
                final eock eockVar = new eock(eociVar, eociVar);
                final enip n = enip.n(new enpx(file2));
                enqu listIterator = n.listIterator();
                while (listIterator.hasNext()) {
                    eockVar.b.b(listIterator.next());
                }
                boolean z = true;
                for (File file3 : new Iterable() { // from class: eocj
                    @Override // java.lang.Iterable
                    public final Iterator iterator() {
                        eocl eoclVar = new eocl(((eock) eoco.this).a);
                        enqu listIterator2 = n.listIterator();
                        ArrayDeque arrayDeque = new ArrayDeque();
                        ArrayDeque arrayDeque2 = new ArrayDeque();
                        arrayDeque2.add(listIterator2);
                        return new eocm(eoclVar, arrayDeque2, arrayDeque);
                    }
                }) {
                    if (!file2.equals(file3) && file3.exists()) {
                        file3.setWritable(true, true);
                        z &= file3.delete();
                    }
                }
                if (z && file2.setWritable(false, false) && file2.list().length == 0) {
                    return null;
                }
                file2.setWritable(true, true);
                throw new RuntimeException("Failed to wipe: ".concat(String.valueOf(String.valueOf(file2))));
            }
        }));
    }
}
