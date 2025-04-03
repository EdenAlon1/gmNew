package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxzx {
    public final Executor a;
    public final dxzv b;

    public dxzx(dxzw dxzwVar) {
        this.b = dxzwVar.b;
        this.a = dxzwVar.a;
    }

    public final ListenableFuture a(emxc emxcVar) {
        return elfr.i(new erog() { // from class: dxzt
            @Override // defpackage.erog
            public final ListenableFuture a() {
                dxzx dxzxVar = dxzx.this;
                dybr dybrVar = dxzxVar.b.a;
                dwrm dwrmVar = (dwrm) dwro.a.createBuilder();
                String a = cgoh.b.a();
                dwrmVar.copyOnWrite();
                dwro dwroVar = (dwro) dwrmVar.instance;
                a.getClass();
                dwroVar.b |= 64;
                dwroVar.f = a;
                String a2 = cgoh.a.a();
                dwrmVar.copyOnWrite();
                dwro dwroVar2 = (dwro) dwrmVar.instance;
                a2.getClass();
                dwroVar2.b |= 32;
                dwroVar2.e = a2;
                String a3 = cgoh.c.a();
                dwrmVar.copyOnWrite();
                dwro dwroVar3 = (dwro) dwrmVar.instance;
                a3.getClass();
                dwroVar3.b |= 128;
                dwroVar3.g = a3;
                String str = cvdd.a(((cgog) dybrVar).a).a;
                dwrmVar.copyOnWrite();
                dwro dwroVar4 = (dwro) dwrmVar.instance;
                str.getClass();
                dwroVar4.b |= 2;
                dwroVar4.d = str;
                final ListenableFuture j = elfr.j(elfo.e((dwro) dwrmVar.build()), new emwl() { // from class: dxzu
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        return engw.r((dwro) obj);
                    }
                }, erpp.a);
                return dycd.e(j).g(new eroh() { // from class: dxzr
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        return ((engw) obj).isEmpty() ? erqt.i(dwro.a) : erqt.i(dwro.a);
                    }
                }, dxzxVar.a).g(new eroh() { // from class: dxzs
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        dwro dwroVar5 = (dwro) obj;
                        int i = engw.d;
                        engr engrVar = new engr();
                        engw engwVar = (engw) erqt.q(ListenableFuture.this);
                        int size = engwVar.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            dwrm dwrmVar2 = (dwrm) ((dwro) engwVar.get(i2)).toBuilder();
                            dwrmVar2.mergeFrom((dwrm) dwroVar5);
                            engrVar.h((dwro) dwrmVar2.build());
                        }
                        return erqt.i(engrVar.g());
                    }
                }, dxzxVar.a);
            }
        }, this.a);
    }
}
