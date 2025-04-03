package defpackage;

import com.google.android.libraries.onegoogle.accountmenu.viewproviders.MyAccountChip;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ebmz extends eays {
    final /* synthetic */ ebna a;

    public ebmz(ebna ebnaVar) {
        this.a = ebnaVar;
    }

    @Override // defpackage.eays
    public final void b(final Object obj) {
        ebpa.a(new Runnable() { // from class: ebmy
            @Override // java.lang.Runnable
            public final void run() {
                ebmz ebmzVar = ebmz.this;
                ebna ebnaVar = ebmzVar.a;
                ebnaVar.f.m(engw.n(ebll.a(ebnaVar.getContext(), ebnaVar.o, ebnaVar.p)));
                Object obj2 = obj;
                if (obj2 == null) {
                    return;
                }
                MyAccountChip myAccountChip = ebmzVar.a.a;
                ebbg ebbgVar = (ebbg) myAccountChip.b;
                ebbc ebbcVar = ebbgVar.b;
                int i = 8;
                if (ebbcVar.a() != null && ebbgVar.c.g(ebbcVar.a())) {
                    i = 0;
                }
                myAccountChip.setVisibility(i);
                ebmzVar.a.b.k(obj2);
                if (ebmzVar.a.q.g()) {
                    ebmzVar.a.g.a(emux.a);
                }
            }
        });
    }
}
