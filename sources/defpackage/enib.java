package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enib extends engh {
    public enoj a;
    public boolean b;
    public boolean c;

    public enib() {
        this(4);
    }

    public final enie a() {
        enoj enojVar = this.a;
        enojVar.getClass();
        if (enojVar.c == 0) {
            return enpc.a;
        }
        if (this.c) {
            this.a = new enoj(enojVar);
            this.c = false;
        }
        this.b = true;
        return new enpc(this.a);
    }

    public final void b(Iterable iterable) {
        enoj enojVar = this.a;
        enojVar.getClass();
        if (!(iterable instanceof enny)) {
            super.e(iterable);
            return;
        }
        enny ennyVar = (enny) iterable;
        enoj enojVar2 = ennyVar instanceof enpc ? ((enpc) ennyVar).b : ennyVar instanceof ench ? ((ench) ennyVar).a : null;
        if (enojVar2 != null) {
            enojVar.j(Math.max(enojVar.c, enojVar2.c));
            for (int a = enojVar2.a(); a >= 0; a = enojVar2.e(a)) {
                d(enojVar2.i(a), enojVar2.c(a));
            }
            return;
        }
        Set j = ennyVar.j();
        enoj enojVar3 = this.a;
        enojVar3.j(Math.max(enojVar3.c, j.size()));
        for (ennx ennxVar : ennyVar.j()) {
            d(ennxVar.b(), ennxVar.a());
        }
    }

    public final void d(Object obj, int i) {
        enoj enojVar = this.a;
        enojVar.getClass();
        if (i == 0) {
            return;
        }
        if (this.b) {
            this.a = new enoj(enojVar);
            this.c = false;
        }
        this.b = false;
        obj.getClass();
        enoj enojVar2 = this.a;
        enojVar2.p(obj, i + enojVar2.b(obj));
    }

    @Override // defpackage.engh
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final void c(Object obj) {
        d(obj, 1);
    }

    public enib(int i) {
        this.b = false;
        this.c = false;
        this.a = new enoj(i);
    }
}
