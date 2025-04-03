package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import defpackage.ekgy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekan implements eivv {
    final /* synthetic */ ekgy a;

    public ekan(ekgy ekgyVar) {
        this.a = ekgyVar;
    }

    @Override // defpackage.eivv
    public final void aa(eivt eivtVar) {
        final eisx a = eivtVar.a();
        ekzz g = eleg.g("AccountChanged: UserConfigurationCommitter.commitOnAccountChange", elad.a);
        final ekgy ekgyVar = this.a;
        try {
            a.getClass();
            ListenableFuture b = ekgyVar.d.b(eldl.c(new erog() { // from class: ekgx
                @Override // defpackage.erog
                public final ListenableFuture a() {
                    final ekgy ekgyVar2 = ekgyVar;
                    eisx eisxVar = eisx.this;
                    if (ffkj.e(eisxVar, ekgyVar2.e)) {
                        return erqt.i(null);
                    }
                    ekgyVar2.e = eisxVar;
                    ekgy.a aVar = (ekgy.a) ekhv.a(ekgyVar2.a, ekgy.a.class, eisxVar);
                    final ListenableFuture c = ekgyVar2.b.c(eisxVar);
                    final List c2 = aVar.fH().c();
                    final List c3 = aVar.fG().c();
                    List b2 = ffdx.b(c);
                    List ad = ffdx.ad(c2, c3);
                    ArrayList arrayList = new ArrayList(ffdx.n(ad, 10));
                    Iterator it = ad.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((ekbm) it.next()).b);
                    }
                    return elfr.a(ffdx.ad(b2, arrayList)).b(eldl.c(new erog() { // from class: ekgv
                        @Override // defpackage.erog
                        public final ListenableFuture a() {
                            enfc<ekbm> b3 = enfc.b(c2, c3);
                            final ArrayList arrayList2 = new ArrayList(ffdx.n(b3, 10));
                            for (ekbm ekbmVar : b3) {
                                ListenableFuture listenableFuture = c;
                                ekgy ekgyVar3 = ekgyVar2;
                                Object q = erqt.q(ekbmVar.b);
                                q.getClass();
                                arrayList2.add(ekgyVar3.a((ecwu) q, ekbmVar.c, ekgyVar3.c.a(((eixn) erqt.q(listenableFuture)).b()), ekbmVar.a));
                            }
                            return elfr.a(arrayList2).b(new erog() { // from class: ekgw
                                @Override // defpackage.erog
                                public final ListenableFuture a() {
                                    return erqt.e(arrayList2);
                                }
                            }, erpp.a);
                        }
                    }), erpp.a);
                }
            }), erpp.a);
            b.getClass();
            g.b(b);
            ffig.a(g, null);
            ejjz.c(b, "Failed to commit to configuration for account %s", a);
        } finally {
        }
    }

    @Override // defpackage.eivv
    public final /* synthetic */ void ab() {
    }

    @Override // defpackage.eivv
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.eivv
    public final void ac(eiup eiupVar) {
    }
}
