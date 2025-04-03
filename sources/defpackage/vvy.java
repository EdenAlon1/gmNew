package defpackage;

import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vvy implements ellh {
    final /* synthetic */ vvn a;

    public vvy(vvn vvnVar) {
        this.a = vvnVar;
    }

    @Override // defpackage.ellh
    public final /* bridge */ /* synthetic */ elli a(ellf ellfVar) {
        final wlx wlxVar = (wlx) ellfVar;
        if (ctjd.c()) {
            vvn vvnVar = this.a;
            if (!vvnVar.h.isEmpty() && !vvnVar.bO.isEmpty()) {
                if (vvnVar.N.aJ()) {
                    return elli.a;
                }
                ((ecrj) vvnVar.ca.b()).e(new ecda("RequestMagicRewrite"));
                elfl a = ((wly) vvnVar.bQ.get()).a(wlxVar.a, wlxVar.b);
                ((wiw) vvnVar.bO.get()).b(a);
                vvnVar.aL.g(ejlp.a(a), (ejlr) vvnVar.h.get());
                ((Optional) vvnVar.bW.b()).ifPresent(new Consumer() { // from class: voy
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        enru enruVar = vvn.a;
                        ((wmf) obj).g(wlx.this.b);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                return elli.a;
            }
        }
        return elli.a;
    }
}
