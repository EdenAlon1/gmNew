package defpackage;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bpl implements axu {
    final Set a;
    public final bhl e;
    public final bct f;
    public final Set h;
    public final Map i;
    public final bpc j;
    final Map b = new HashMap();
    public final Map c = new HashMap();
    final Map d = new HashMap();
    public final bbt g = new bpk(this);

    public bpl(bct bctVar, Set set, bhl bhlVar, bpf bpfVar) {
        this.f = bctVar;
        this.e = bhlVar;
        this.a = set;
        HashMap hashMap = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            axv axvVar = (axv) it.next();
            hashMap.put(axvVar, axvVar.G(((bbb) bctVar).a, null, axvVar.f(true, bhlVar)));
        }
        this.i = hashMap;
        HashSet hashSet = new HashSet(hashMap.values());
        this.h = hashSet;
        this.j = new bpc(bctVar, hashSet);
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            axv axvVar2 = (axv) it2.next();
            this.d.put(axvVar2, false);
            this.c.put(axvVar2, new bpj(bctVar, this, bpfVar));
        }
    }

    static bdy a(axv axvVar) {
        List f = axvVar instanceof avk ? axvVar.p.f() : axvVar.p.g.e();
        ksw.c(f.size() <= 1);
        if (f.size() == 1) {
            return (bdy) f.get(0);
        }
        return null;
    }

    private final bnr b(axv axvVar) {
        bnr bnrVar = (bnr) this.b.get(axvVar);
        bnrVar.getClass();
        return bnrVar;
    }

    private static void c(bnr bnrVar, bdy bdyVar, bgk bgkVar) {
        bnrVar.i();
        try {
            biw.b();
            bnrVar.f();
            bnq bnqVar = bnrVar.j;
            bnqVar.getClass();
            bnqVar.i(bdyVar, new bni(bnqVar));
        } catch (bdw unused) {
            bge bgeVar = bgkVar.f;
            if (bgeVar != null) {
                bgeVar.a(bgkVar);
            }
        }
    }

    private final boolean d(axv axvVar) {
        Boolean bool = (Boolean) this.d.get(axvVar);
        bool.getClass();
        return bool.booleanValue();
    }

    @Override // defpackage.axu
    public final void u(axv axvVar) {
        biw.b();
        if (d(axvVar)) {
            return;
        }
        this.d.put(axvVar, true);
        bdy a = a(axvVar);
        if (a != null) {
            c(b(axvVar), a, axvVar.p);
        }
    }

    @Override // defpackage.axu
    public final void v(axv axvVar) {
        biw.b();
        if (d(axvVar)) {
            this.d.put(axvVar, false);
            b(axvVar).h();
        }
    }

    @Override // defpackage.axu
    public final void w(axv axvVar) {
        bdy a;
        biw.b();
        bnr b = b(axvVar);
        if (d(axvVar) && (a = a(axvVar)) != null) {
            c(b, a, axvVar.p);
        }
    }

    @Override // defpackage.axu
    public final void x(axv axvVar) {
        biw.b();
        if (d(axvVar)) {
            bnr b = b(axvVar);
            bdy a = a(axvVar);
            if (a != null) {
                c(b, a, axvVar.p);
            } else {
                b.h();
            }
        }
    }
}
