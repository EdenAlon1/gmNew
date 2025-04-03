package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djbp implements fbbu {
    public final Object a;
    public final errm b;
    public final dlpw c;
    public final fbbm d;
    final fbbf e;
    final fbbf f;
    final fbbf g;
    final fbbf h;
    final fbbf i;
    final fbbm j;
    final fbbf k;
    final fbbm l;
    final fbbf m;
    final fbbm n;
    final fbbf o;
    final fbbf p;
    final fbbm q;
    final fbbf r;
    final fbbm s;
    final fbbf t;
    final fbbm u;
    final fbbf v;
    final fbbm w;
    final fbbm x;
    final fbbm y;
    private final djbp z = this;

    public djbp(Object obj, Context context, Executor executor, djgj djgjVar, dlpw dlpwVar, errm errmVar, clpn clpnVar) {
        this.a = obj;
        this.b = errmVar;
        this.c = dlpwVar;
        fbba a = fbbb.a(executor);
        this.e = a;
        fbbf c = fbaz.c(a);
        this.f = c;
        this.g = fbbb.a(this);
        fbbf c2 = fbaz.c(new djbo(this, 0));
        this.h = c2;
        djbo djboVar = new djbo(this, 1);
        this.i = djboVar;
        fbbm d = fbbz.d(djboVar);
        this.j = d;
        fbba a2 = fbbb.a(context);
        this.k = a2;
        fbbm d2 = fbbz.d(a2);
        this.l = d2;
        fbba a3 = fbbb.a(djgjVar);
        this.m = a3;
        fbbm d3 = fbbz.d(a3);
        this.n = d3;
        this.o = fbbb.a(clpnVar);
        djbo djboVar2 = new djbo(this, 2);
        this.p = djboVar2;
        fbbm d4 = fbbz.d(djboVar2);
        this.q = d4;
        djbo djboVar3 = new djbo(this, 3);
        this.r = djboVar3;
        fbbm d5 = fbbz.d(djboVar3);
        this.s = d5;
        djbo djboVar4 = new djbo(this, 4);
        this.t = djboVar4;
        fbbm d6 = fbbz.d(djboVar4);
        this.u = d6;
        djbo djboVar5 = new djbo(this, 5);
        this.v = djboVar5;
        fbbm d7 = fbbz.d(djboVar5);
        this.w = d7;
        djcy djcyVar = new djcy(c, c2, d, d4, d5, d6, d7);
        this.x = djcyVar;
        djcz djczVar = new djcz(c, c2, d, d2, d3, djcyVar);
        this.y = djczVar;
        this.d = fbbz.b(djczVar, this);
    }

    @Override // defpackage.fbbu
    public final void a(boolean z) {
        fbbz.e(this.y, z);
        fbbz.e(this.x, z);
        fbbz.e(this.w, z);
        fbbz.e(this.u, z);
        fbbz.e(this.s, z);
        fbbz.e(this.q, z);
        fbbz.e(this.n, z);
        fbbz.e(this.l, z);
        fbbz.e(this.j, z);
    }
}
