package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dccy implements csmx {
    final /* synthetic */ dccz a;

    public dccy(dccz dcczVar) {
        this.a = dcczVar;
    }

    @Override // defpackage.csmx
    public final void y() {
        if (this.a.e()) {
            this.a.d();
        } else {
            final dccz dcczVar = this.a;
            elfo.h(new erog() { // from class: dccv
                @Override // defpackage.erog
                public final ListenableFuture a() {
                    dccz dcczVar2 = dccz.this;
                    if (dcczVar2.e()) {
                        return elfo.c();
                    }
                    dcczVar2.e = true;
                    return elfl.g(((csmz) dcczVar2.b.a()).i());
                }
            }, dcczVar.c).h(new emwl() { // from class: dccw
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    dccz dcczVar2 = dccz.this;
                    Boolean bool = (Boolean) obj;
                    if (!dcczVar2.e() && bool.booleanValue()) {
                        dcczVar2.d();
                        dcczVar2.c();
                    }
                    dcczVar2.e = false;
                    return true;
                }
            }, dcczVar.c).k(axnw.b(), dcczVar.d);
        }
    }
}
