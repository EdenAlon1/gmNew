package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejuw implements ejuh {
    final /* synthetic */ ejuh a;
    final /* synthetic */ eroh b;
    final /* synthetic */ Executor c;

    public ejuw(ejuh ejuhVar, eroh erohVar, Executor executor) {
        this.a = ejuhVar;
        this.b = erohVar;
        this.c = executor;
    }

    @Override // defpackage.ejuh
    public final erph a() {
        erph a = this.a.a();
        final eroh erohVar = this.b;
        final Executor executor = this.c;
        return a.f(eldl.e(new erot() { // from class: ejuv
            @Override // defpackage.erot
            public final erph a(erpc erpcVar, Object obj) {
                ListenableFuture f;
                final ejug ejugVar = (ejug) obj;
                ejug ejugVar2 = ejug.a;
                if (ejugVar == ejugVar2) {
                    f = erqt.i(ejugVar2);
                } else {
                    f = erny.f(eroh.this.a(ejugVar.e()), new emwl() { // from class: ejue
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            ejug ejugVar3 = ejug.this;
                            return ejugVar3.g() ? ejug.a(obj2, ejugVar3.d()) : ejug.b(obj2);
                        }
                    }, executor);
                }
                return new erph(f);
            }
        }), this.c);
    }

    @Override // defpackage.ejuh
    public final ListenableFuture b() {
        return erre.a;
    }

    @Override // defpackage.ejuh
    public final Object c() {
        return ((ejuy) this.a).b;
    }

    public final String toString() {
        eroh erohVar = this.b;
        return "DataSources.transform(" + this.a.toString() + ", " + erohVar.toString() + ")";
    }
}
