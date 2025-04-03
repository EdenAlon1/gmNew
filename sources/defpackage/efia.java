package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class efia implements erog {
    public List a;
    final /* synthetic */ efid b;

    public efia(efid efidVar) {
        this.b = efidVar;
    }

    @Override // defpackage.erog
    public final ListenableFuture a() {
        efid efidVar = this.b;
        ekzz b = efidVar.e.b("Initialize ".concat(String.valueOf(efidVar.a)));
        try {
            synchronized (this.b.d) {
                if (this.a == null) {
                    efid efidVar2 = this.b;
                    this.a = efidVar2.f;
                    efidVar2.f = Collections.EMPTY_LIST;
                }
            }
            ArrayList arrayList = new ArrayList(this.a.size());
            efic eficVar = new efic(this.b);
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                try {
                    arrayList.add(((eroh) it.next()).a(eficVar));
                } catch (Exception e) {
                    arrayList.add(erqt.h(e));
                }
            }
            ListenableFuture a = erqt.c(arrayList).a(new Callable() { // from class: efhz
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    efia efiaVar = efia.this;
                    synchronized (efiaVar.b.d) {
                        efiaVar.a = null;
                    }
                    return null;
                }
            }, erpp.a);
            b.b(a);
            b.close();
            return a;
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
