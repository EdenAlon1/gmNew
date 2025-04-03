package defpackage;

import android.content.Context;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvix implements dvhm {
    public static final entd a = entd.c("GnpSdk");
    public final dvhp A;
    public final easq B;
    public final eanl C;
    public final Context b;
    public final dlpw c;
    public final eafv d;
    public final dvmq e;
    public final dvmx f;
    public final dvpf g;
    public final dvby h;
    public final eafv i;
    public final eafv j;
    public final dvgo k;
    public final Set l;
    public final dvbu m;
    public final dvqn n;
    public final dvpl o;
    public final dvht p;
    public final dvcp q;
    public final fazb r;
    public final String s;
    public final dvqv t;
    public final dvdy u;
    public final Map v;
    public final eapp w;
    public final eapp x;
    public final dvcb y;
    public final dvhf z;

    public dvix(Context context, dlpw dlpwVar, eafv eafvVar, dvmq dvmqVar, dvmx dvmxVar, dvpf dvpfVar, eafv eafvVar2, eafv eafvVar3, dvgo dvgoVar, Set set, dvhf dvhfVar, dvbu dvbuVar, dvqn dvqnVar, dvpl dvplVar, dvht dvhtVar, dvcp dvcpVar, fazb fazbVar, String str, dvqv dvqvVar, dvdy dvdyVar, Map map, easq easqVar, eapp eappVar, eapp eappVar2, eanl eanlVar, dvby dvbyVar, dvcb dvcbVar, dvhp dvhpVar) {
        this.b = context;
        this.c = dlpwVar;
        this.d = eafvVar;
        this.e = dvmqVar;
        this.f = dvmxVar;
        this.g = dvpfVar;
        this.i = eafvVar2;
        this.j = eafvVar3;
        this.k = dvgoVar;
        this.l = set;
        this.z = dvhfVar;
        this.m = dvbuVar;
        this.n = dvqnVar;
        this.o = dvplVar;
        this.p = dvhtVar;
        this.q = dvcpVar;
        this.r = fazbVar;
        this.s = str;
        this.t = dvqvVar;
        this.u = dvdyVar;
        this.v = map;
        this.w = eappVar;
        this.x = eappVar2;
        this.C = eanlVar;
        this.B = easqVar;
        this.h = dvbyVar;
        this.y = dvcbVar;
        this.A = dvhpVar;
    }

    public final boolean a(evts evtsVar) {
        eyja eyjaVar = evtsVar.i;
        if (eyjaVar == null) {
            eyjaVar = eyja.a;
        }
        long b = eykm.b(eyjaVar);
        return b > 0 && b < this.c.f().toEpochMilli();
    }
}
