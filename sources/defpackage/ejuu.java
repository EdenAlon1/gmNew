package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejuu implements ejuh {
    final /* synthetic */ ejuh a;
    final /* synthetic */ emwl b;
    final /* synthetic */ Executor c;

    public ejuu(ejuh ejuhVar, emwl emwlVar, Executor executor) {
        this.a = ejuhVar;
        this.b = emwlVar;
        this.c = executor;
    }

    @Override // defpackage.ejuh
    public final erph a() {
        erph a = this.a.a();
        final emwl emwlVar = this.b;
        return a.e(eldl.g(new erow() { // from class: ejut
            @Override // defpackage.erow
            public final Object a(erpc erpcVar, Object obj) {
                return ((ejug) obj).c(emwl.this);
            }
        }), this.c);
    }

    @Override // defpackage.ejuh
    public final ListenableFuture b() {
        return this.a.b();
    }

    @Override // defpackage.ejuh
    public final Object c() {
        return this.a.c();
    }

    public final String toString() {
        emwl emwlVar = this.b;
        return "DataSources.transform(" + this.a.toString() + ", " + emwlVar.toString() + ")";
    }
}
