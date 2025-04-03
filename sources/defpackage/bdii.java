package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bdii {
    public final enhk a;
    public final errl b;
    public final errl c;
    public final Map d;
    public final cpn e = new cpn();
    private final Executor f;

    public bdii(Map map, errl errlVar, errl errlVar2, Map map2) {
        this.a = enhk.j(map);
        this.b = errlVar;
        this.c = errlVar2;
        this.d = map2;
        this.f = new ersb(errlVar);
    }

    public final elfl a(final byys byysVar, final eroh erohVar) {
        return elfo.g(new Callable() { // from class: bdhz
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Set set = (Set) bdii.this.e.get(byysVar);
                return set == null ? new cmj() : new cmj(set);
            }
        }, this.f).i(new eroh() { // from class: bdia
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                bdii bdiiVar = bdii.this;
                Map map = bdiiVar.d;
                byys byysVar2 = byysVar;
                cmj cmjVar = (cmj) obj;
                elfl e = elfo.e(null);
                ffbr ffbrVar = (ffbr) map.get(byysVar2);
                final eroh erohVar2 = erohVar;
                if (ffbrVar != null) {
                    for (final bdih bdihVar : (Set) ffbrVar.b()) {
                        e = e.i(new eroh() { // from class: bdic
                            @Override // defpackage.eroh
                            public final ListenableFuture a(Object obj2) {
                                return eroh.this.a(bdihVar);
                            }
                        }, bdiiVar.b);
                    }
                }
                cmi cmiVar = new cmi(cmjVar);
                while (cmiVar.hasNext()) {
                    final bdih bdihVar2 = (bdih) cmiVar.next();
                    e = e.i(new eroh() { // from class: bdid
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj2) {
                            return eroh.this.a(bdihVar2);
                        }
                    }, bdiiVar.b);
                }
                return e;
            }
        }, this.b);
    }
}
