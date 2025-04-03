package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gwo extends ffkk implements ffji {
    final /* synthetic */ gxa a;
    final /* synthetic */ gxo b;
    final /* synthetic */ int c;
    final /* synthetic */ boolean d;
    final /* synthetic */ gwb e;
    final /* synthetic */ idh f;
    final /* synthetic */ boolean g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gwo(gxa gxaVar, gxo gxoVar, int i, boolean z, gwb gwbVar, idh idhVar, boolean z2) {
        super(1);
        this.a = gxaVar;
        this.b = gxoVar;
        this.c = i;
        this.d = z;
        this.e = gwbVar;
        this.f = idhVar;
        this.g = z2;
    }

    @Override // defpackage.ffji
    public final /* synthetic */ Object invoke(Object obj) {
        gxd gxdVar;
        gxd gxdVar2;
        float f;
        gxo gxoVar = this.b;
        idd iddVar = (idd) obj;
        float a = gxoVar.a() + gxoVar.f;
        gxa gxaVar = this.a;
        float j = gxaVar.b.j();
        float c = gxaVar.b.c() * a;
        float a2 = gxk.a(gxoVar, gxaVar.b.j(), gxaVar.b.b());
        float b = this.a.b.b();
        gxo gxoVar2 = this.b;
        float a3 = ((gxoVar2.a() * b) + (gxoVar2.f * (b - 1.0f))) - gxoVar2.e;
        gxo gxoVar3 = this.b;
        float f2 = ((j * a) + c) - a2;
        float c2 = ffmk.c(a3, 0.0f);
        int i = 0;
        gxe b2 = gxoVar3.b(f2, c2, false);
        gxe b3 = gxoVar3.b(f2, c2, true);
        float a4 = gxoVar3.a() + gxoVar3.f;
        float a5 = gxoVar3.a() / 2.0f;
        int a6 = b2.a() - 1;
        float f3 = ((this.c * a4) + a5) - f2;
        if (a6 >= 0) {
            while (true) {
                int i2 = a6 - 1;
                gxdVar = b2.get(a6);
                if (gxdVar.c < f3) {
                    break;
                }
                if (i2 < 0) {
                    break;
                }
                a6 = i2;
            }
        }
        gxdVar = (gxd) ffdx.K(b2);
        int a7 = b2.a();
        while (true) {
            if (i >= a7) {
                gxdVar2 = null;
                break;
            }
            gxdVar2 = b2.get(i);
            if (gxdVar2.c >= f3) {
                break;
            }
            i++;
        }
        if (gxdVar2 == null) {
            gxdVar2 = (gxd) ffdx.P(b2);
        }
        if (ffkj.e(gxdVar, gxdVar2)) {
            f = 1.0f;
        } else {
            float f4 = gxdVar2.c;
            float f5 = gxdVar.c;
            f = (f3 - f5) / (f4 - f5);
        }
        gxd a8 = gxf.a(gxdVar, gxdVar2, f);
        boolean e = ffkj.e(gxdVar, gxdVar2);
        float a9 = (this.d ? iar.a(iddVar.r) : this.b.a()) / 2.0f;
        float a10 = (this.d ? this.b.a() : iar.a(iddVar.r)) / 2.0f;
        float c3 = (this.d ? iar.c(iddVar.r) : a8.a) / 2.0f;
        float a11 = (this.d ? a8.a : iar.a(iddVar.r)) / 2.0f;
        iam iamVar = new iam(a9 - c3, a10 - a11, a9 + c3, a10 + a11);
        this.e.b.i(a8.a);
        gwb gwbVar = this.e;
        Iterator<E> it = b3.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            float f6 = ((gxd) next).a;
            do {
                Object next2 = it.next();
                float f7 = ((gxd) next2).a;
                int compare = Float.compare(f6, f7);
                if (compare > 0) {
                    f6 = f7;
                }
                if (compare > 0) {
                    next = next2;
                }
            } while (it.hasNext());
        }
        gwbVar.c.i(((gxd) next).a);
        this.e.d.i(b3.c().a);
        this.e.a.b(iamVar);
        iddVar.r(!ffkj.e(iamVar, new iam(0.0f, 0.0f, iar.c(iddVar.r), iar.a(iddVar.r))));
        iddVar.A(this.f);
        float f8 = a8.b - f3;
        if (e) {
            f8 += (f3 - a8.c) / a8.a;
        }
        if (this.d) {
            iddVar.E(f8);
        } else {
            if (this.g) {
                f8 = -f8;
            }
            iddVar.D(f8);
        }
        return ffcu.a;
    }
}
