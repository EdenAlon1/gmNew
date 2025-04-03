package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekda {
    public final String a;
    public final ecwu b;
    public final SettableFuture c = SettableFuture.create();
    public final ejlc d;
    final /* synthetic */ ekdb e;

    public ekda(final ekdb ekdbVar, String str, ecwu ecwuVar) {
        this.e = ekdbVar;
        this.a = str;
        this.b = ecwuVar;
        this.d = new ejlc(new erog() { // from class: ekcx
            @Override // defpackage.erog
            public final ListenableFuture a() {
                ekdb ekdbVar2 = ekdb.this;
                ekcs ekcsVar = ekdbVar2.e;
                edch edchVar = ekdbVar2.d.f;
                ekda ekdaVar = this;
                ListenableFuture b = edchVar.a(ekcsVar.a(ekdaVar.a)).e ? ((ecxc) ekdbVar2.a.b()).b(ekdaVar.b) : ((ecxc) ekdbVar2.a.b()).a(ekdaVar.b.c);
                final ffji ffjiVar = new ffji() { // from class: ekcy
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        ecxd ecxdVar = (ecxd) obj;
                        ecxdVar.getClass();
                        if (ecxdVar.a == 29501) {
                            return null;
                        }
                        throw ecxdVar;
                    }
                };
                return elfr.e(b, ecxd.class, new emwl() { // from class: ekcz
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        ffji.this.invoke(obj);
                        return null;
                    }
                }, erpp.a);
            }
        }, ekdbVar.c);
    }
}
