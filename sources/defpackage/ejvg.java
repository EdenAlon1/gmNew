package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ejvg {
    public final Object a = new Object();
    public erpf b;
    private erph c;

    public ejvg(erph erphVar) {
        efbd.c();
        this.c = erphVar;
    }

    private final void d() {
        synchronized (this.a) {
            emxf.l(this.c.h().isDone());
            this.c.m(new erpg() { // from class: ejvf
                @Override // defpackage.erpg
                public final void a(erpf erpfVar) {
                    ejvg ejvgVar = ejvg.this;
                    synchronized (ejvgVar.a) {
                        ejvgVar.b = erpfVar;
                    }
                }
            }, erpp.a);
            this.c = null;
        }
    }

    final ejug a() {
        ejug ejugVar;
        synchronized (this.a) {
            if (this.c != null) {
                d();
            }
            try {
                ejugVar = (ejug) this.b.a();
            } catch (ExecutionException e) {
                throw new ejwf(e.getCause());
            }
        }
        return ejugVar;
    }

    final ListenableFuture b() {
        synchronized (this.a) {
            erph erphVar = this.c;
            if (erphVar != null) {
                return erphVar.h();
            }
            return erqt.i(null);
        }
    }

    final void c() {
        synchronized (this.a) {
            erph erphVar = this.c;
            if (erphVar != null) {
                erphVar.n();
                d();
            }
            this.b.b();
        }
    }
}
