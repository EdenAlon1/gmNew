package defpackage;

import android.util.Pair;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dypj implements dyiz {
    public static final String a = "dypj";
    public final dyqz b;
    public final dyyt c;
    private final dyim d;

    public dypj(dyqz dyqzVar, dyyt dyytVar, dyim dyimVar) {
        this.b = dyqzVar;
        this.c = dyytVar;
        this.d = dyimVar;
    }

    public static final dzhl c(dzja dzjaVar) {
        dzhl r = dzhm.r();
        r.n(dzjaVar.c().f());
        r.o(dzjaVar.d().E());
        r.g(93);
        return r;
    }

    public final void a(dzja dzjaVar, dyiy dyiyVar, Pair pair) {
        try {
            dzpt dzptVar = (dzpt) pair.first;
            long longValue = ((Long) pair.second).longValue();
            ((cglc) dyiyVar).d.b(dzptVar.c().d());
            ((cgkv) ((cglc) dyiyVar).c.b()).c(longValue);
            this.b.b(dzjaVar).E((dzpt) pair.first);
        } catch (RuntimeException e) {
            dyyt dyytVar = this.c;
            dzhl c = c(dzjaVar);
            c.d((dzpt) pair.first);
            c.f(713);
            dyytVar.b(c.a());
            throw e;
        }
    }

    public final void b(dzja dzjaVar, dyiy dyiyVar, dzpk dzpkVar) {
        dzwo b = this.b.b(dzjaVar);
        emxc w = b.w(dzpkVar.h());
        dzor n = b.n(dzpkVar.h());
        emxc b2 = this.d.b(dzjaVar, emxc.j(dzpkVar));
        emxc a2 = dyjq.a(w);
        try {
            dzpk dzpkVar2 = (dzpk) b2.c();
            boolean a3 = n.a();
            long d = dzpkVar.d();
            amtr amtrVar = (amtr) amts.a.createBuilder();
            String d2 = dzpkVar2.h().c().d();
            amtrVar.copyOnWrite();
            amts amtsVar = (amts) amtrVar.instance;
            amtsVar.b |= 1;
            amtsVar.c = d2;
            String jSONObject = ((JSONObject) dzpkVar2.h().f().c()).toString();
            amtrVar.copyOnWrite();
            amts amtsVar2 = (amts) amtrVar.instance;
            jSONObject.getClass();
            amtsVar2.b |= 2;
            amtsVar2.d = jSONObject;
            String str = (String) dzpkVar2.l().e("");
            amtrVar.copyOnWrite();
            amts amtsVar3 = (amts) amtrVar.instance;
            amtsVar3.b |= 4;
            amtsVar3.e = str;
            String str2 = (String) dzpkVar2.j().e("");
            amtrVar.copyOnWrite();
            amts amtsVar4 = (amts) amtrVar.instance;
            amtsVar4.b |= 16;
            amtsVar4.g = str2;
            long a4 = dzpkVar2.a();
            amtrVar.copyOnWrite();
            amts amtsVar5 = (amts) amtrVar.instance;
            amtsVar5.b |= 512;
            amtsVar5.l = a4;
            amtrVar.copyOnWrite();
            amts amtsVar6 = (amts) amtrVar.instance;
            amtsVar6.b |= 1024;
            amtsVar6.m = d;
            amtrVar.copyOnWrite();
            amts amtsVar7 = (amts) amtrVar.instance;
            amtsVar7.b |= 256;
            amtsVar7.k = a3;
            if (a2.g()) {
                long millis = TimeUnit.MICROSECONDS.toMillis(((dzqs) a2.c()).d());
                amtrVar.copyOnWrite();
                amts amtsVar8 = (amts) amtrVar.instance;
                amtsVar8.b |= 32;
                amtsVar8.h = millis;
                String str3 = (String) ((dzqs) a2.c()).m().e("");
                amtrVar.copyOnWrite();
                amts amtsVar9 = (amts) amtrVar.instance;
                amtsVar9.b |= 8;
                amtsVar9.f = str3;
                boolean z = !((dzqs) a2.c()).i().equals(dzqm.INCOMING_RECEIVED);
                amtrVar.copyOnWrite();
                amts amtsVar10 = (amts) amtrVar.instance;
                amtsVar10.b |= 64;
                amtsVar10.i = z;
                boolean contains = dzqm.n.contains(((dzqs) a2.c()).i());
                amtrVar.copyOnWrite();
                amts amtsVar11 = (amts) amtrVar.instance;
                amtsVar11.b |= 128;
                amtsVar11.j = contains;
            } else {
                amtrVar.copyOnWrite();
                amts amtsVar12 = (amts) amtrVar.instance;
                amtsVar12.b |= 8;
                amtsVar12.f = "";
                amtrVar.copyOnWrite();
                amts amtsVar13 = (amts) amtrVar.instance;
                amtsVar13.b |= 64;
                amtsVar13.i = true;
                amtrVar.copyOnWrite();
                amts amtsVar14 = (amts) amtrVar.instance;
                amtsVar14.b |= 128;
                amtsVar14.j = false;
            }
            ((cglc) dyiyVar).d.a((amts) amtrVar.build());
            ((cgkv) ((cglc) dyiyVar).c.b()).c(d);
        } catch (RuntimeException e) {
            dyyt dyytVar = this.c;
            dzhl c = c(dzjaVar);
            c.d(dzpkVar.h());
            c.f(713);
            dyytVar.b(c.a());
            throw e;
        }
    }
}
