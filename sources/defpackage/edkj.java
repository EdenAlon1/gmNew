package defpackage;

import android.content.Context;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class edkj implements edko {
    public final edkq a;
    public final Context b;
    final fbbf c;
    public final fbbf d;
    public final fbbf e;
    public final fbbf f;
    final fbbf g;
    final fbbf h;
    public final fbbf i;
    public final fbbf j;
    public final fbbf k;
    public final fbbf l;
    public final fbbf m;
    final fbbf n;
    public final fbbf o;
    public final fbbf p;
    public final fbbf q;
    final fbbf r;
    public final fbbf s;
    public final fbbf t;
    final fbbf u;
    final fbbf v;
    public final fbbf w;
    public final fbbf x;
    private final edtg y;

    public edkj(Context context, edkq edkqVar, edtg edtgVar) {
        this.a = edkqVar;
        this.b = context;
        this.y = edtgVar;
        fbba a = fbbb.a(context);
        this.c = a;
        fbbf c = fbaz.c(new edte(a));
        this.d = c;
        this.e = fbbi.a(dlpx.a);
        this.f = fbaz.c(edkm.a);
        fbbf c2 = fbaz.c(edhj.a);
        this.g = c2;
        fbbf c3 = fbaz.c(new ediy(c2));
        this.h = c3;
        this.i = fbaz.c(new edjf(c2, c3));
        this.j = fbaz.c(new edjd(c2, c3));
        this.k = fbaz.c(edhr.a);
        this.l = fbaz.c(edho.a);
        this.m = fbaz.c(new edhh(c2));
        fbbf c4 = fbaz.c(edit.a);
        this.n = c4;
        this.o = fbaz.c(new ediq(c4));
        this.p = fbaz.c(edja.a);
        this.q = fbaz.c(new edjh(c4));
        edtd edtdVar = new edtd(a);
        this.r = edtdVar;
        fbbf c5 = fbaz.c(edkk.a);
        this.s = c5;
        this.t = fbaz.c(new ediw(edtdVar, c5));
        dwds dwdsVar = new dwds(c);
        this.u = dwdsVar;
        fbba fbbaVar = fbbh.a;
        List b = fbax.b(1);
        List b2 = fbax.b(0);
        b.add(dwdsVar);
        fbbh fbbhVar = new fbbh(b, b2);
        this.v = fbbhVar;
        this.w = new dwdr(fbbhVar);
        this.x = fbaz.c(dwdt.a);
    }

    public final Context a() {
        return edtd.c(this.b);
    }

    public final qoo b() {
        return qpp.a(a());
    }

    public final edga c() {
        detz.b(this.b.getApplicationContext());
        return new edga(new edtl(new dety(detz.a().a).a("LE", new detq(), new dett() { // from class: edtj
            @Override // defpackage.dett
            public final Object a(Object obj) {
                return ((epmz) obj).toByteArray();
            }
        }), (dwdl) this.d.b()), this.y, this.a);
    }

    public final edik d() {
        return new edik(a());
    }
}
