package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ecyw implements dflb {
    public final ecyr a;

    public ecyw(ecyr ecyrVar) {
        this.a = ecyrVar;
    }

    @Override // defpackage.dflb
    public final void a(final dflc dflcVar) {
        if (((dfld) dflcVar.a).e()) {
            return;
        }
        ecyx.b(dflcVar, new emyl() { // from class: ecys
            @Override // defpackage.emyl
            public final Object get() {
                dflc dflcVar2 = dflcVar;
                Set set = (Set) ((ecyx) ecyw.this.a).c.get(new emxd(dflcVar2.k, dflcVar2.j));
                return set != null ? set : enpd.a;
            }
        }, new emwl() { // from class: ecyt
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return (ecyq) ((ecyx) ecyw.this.a).a.get(new emxd((String) obj, dflcVar.j));
            }
        });
        emyl emylVar = new emyl() { // from class: ecyu
            @Override // defpackage.emyl
            public final Object get() {
                Set set = (Set) ((ecyx) ecyw.this.a).d.get(dflcVar.k);
                return set != null ? set : enpd.a;
            }
        };
        final ecyr ecyrVar = this.a;
        ecyx.b(dflcVar, emylVar, new emwl() { // from class: ecyv
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return (ecyq) ((ecyx) ecyr.this).b.get((String) obj);
            }
        });
    }
}
