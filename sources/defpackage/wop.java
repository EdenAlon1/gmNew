package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wop extends ffhv implements ffjm {
    int a;
    final /* synthetic */ wor b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wop(ffgu ffguVar, wor worVar) {
        super(2, ffguVar);
        this.b = worVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((wop) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        emmt emmtVar = (emmt) this.b.a.b();
        wor worVar = this.b;
        emhu emhuVar = (emhu) emhv.a.createBuilder();
        emhuVar.getClass();
        emhw emhwVar = (emhw) emhx.a.createBuilder();
        emhwVar.getClass();
        emhy.b((String) worVar.b.b(), emhwVar);
        emhy.c((String) worVar.c.b(), emhwVar);
        emht.b(emhy.a(emhwVar), emhuVar);
        erph b = emmtVar.b(emht.a(emhuVar));
        final won wonVar = won.a;
        erqc g = b.e(new erow() { // from class: wom
            @Override // defpackage.erow
            public final /* synthetic */ Object a(erpc erpcVar, Object obj2) {
                return ffjm.this.a(erpcVar, obj2);
            }
        }, (Executor) this.b.e.b()).g();
        wor worVar2 = this.b;
        final woo wooVar = new woo(worVar2);
        ListenableFuture f = ernq.f(g, IOException.class, new emwl() { // from class: wol
            @Override // defpackage.emwl
            public final /* synthetic */ Object apply(Object obj2) {
                return ffji.this.invoke(obj2);
            }
        }, (Executor) worVar2.d.b());
        this.a = 1;
        Object c = fgfz.c(f, this);
        return c == ffhhVar ? ffhhVar : c;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        wop wopVar = new wop(ffguVar, this.b);
        wopVar.c = obj;
        return wopVar;
    }
}
