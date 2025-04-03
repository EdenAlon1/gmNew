package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axpc {
    public final Object a = new Object();
    public final HashMap b = new HashMap();
    public final errl c;
    public final Function d;

    public axpc(errl errlVar, Function function) {
        this.c = errlVar;
        this.d = function;
    }

    public final elfl a(final Object obj) {
        synchronized (this.a) {
            if (this.b.containsKey(obj)) {
                return (elfl) this.b.get(obj);
            }
            elfl h = elfj.e(new eros() { // from class: axpa
                @Override // defpackage.eros
                public final erph a(erpc erpcVar) {
                    Object apply;
                    final axpc axpcVar = axpc.this;
                    final Object obj2 = obj;
                    erpcVar.a(new AutoCloseable() { // from class: axpb
                        @Override // java.lang.AutoCloseable
                        public final void close() {
                            axpc axpcVar2 = axpc.this;
                            Object obj3 = axpcVar2.a;
                            Object obj4 = obj2;
                            synchronized (obj3) {
                                axpcVar2.b.remove(obj4);
                            }
                        }
                    }, axpcVar.c);
                    apply = axpcVar.d.apply(obj2);
                    return elfj.c((ListenableFuture) apply).a;
                }
            }, this.c).h();
            this.b.put(obj, h);
            return h;
        }
    }
}
