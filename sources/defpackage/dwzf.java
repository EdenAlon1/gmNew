package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwzf extends lml {
    public final Executor a;
    public final dwyh b;
    public final AtomicReference c = new AtomicReference(null);
    public String d = "";

    public dwzf(dwyh dwyhVar, Executor executor) {
        this.b = dwyhVar;
        this.a = executor;
    }

    public final ListenableFuture a() {
        return elfr.j(this.b.c(this.d), new emwl() { // from class: dwzd
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                llg llgVar = (llg) dwzf.this.c.get();
                llgVar.getClass();
                llgVar.j(engw.n((engw) obj));
                return null;
            }
        }, this.a);
    }
}
