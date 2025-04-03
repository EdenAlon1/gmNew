package defpackage;

import android.database.Cursor;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddpl {
    public static final cskc a = cskc.g("BugleUsageStatistics", "SearchLogger");
    public final ffbr b;
    public final ffbr c;
    public final ffbr d;
    public final errl e;
    public aler f;
    private final cqoh g;

    public ddpl(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, cqoh cqohVar, errl errlVar) {
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = ffbrVar3;
        this.g = cqohVar;
        this.e = errlVar;
    }

    public static int c(int i) {
        switch (i) {
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 11;
            default:
                return 1;
        }
    }

    public final void a() {
        aler alerVar = this.f;
        if (alerVar != null) {
            alerVar.c();
        }
    }

    public final void b(eotg eotgVar) {
        long epochMilli = this.g.f().toEpochMilli();
        eotgVar.copyOnWrite();
        eoti eotiVar = (eoti) eotgVar.instance;
        eoti eotiVar2 = eoti.a;
        eotiVar.b |= 8;
        eotiVar.e = epochMilli;
        if (!((altk) this.b.b()).am()) {
            a.m("Clearcut loggings are disabled.");
            return;
        }
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eolt eoltVar = eolt.BUGLE_SEARCH;
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.j = eoltVar.dk;
        eolvVar.b |= 1;
        eoluVar.copyOnWrite();
        eolv eolvVar2 = (eolv) eoluVar.instance;
        eoti eotiVar3 = (eoti) eotgVar.build();
        eotiVar3.getClass();
        eolvVar2.o = eotiVar3;
        eolvVar2.b |= 32;
        ((akxl) this.c.b()).j(eoluVar);
    }

    public final void d(int i) {
        f(i, 1);
    }

    public final void e(int i, int i2) {
        f(i, c(i2));
    }

    public final void f(final int i, final int i2) {
        elfo.g(new Callable() { // from class: ddpf
            @Override // java.util.concurrent.Callable
            public final Object call() {
                eotg eotgVar = (eotg) eoti.a.createBuilder();
                epii epiiVar = (epii) epik.a.createBuilder();
                epiiVar.copyOnWrite();
                epik epikVar = (epik) epiiVar.instance;
                epikVar.c = i - 1;
                epikVar.b |= 1;
                epiiVar.copyOnWrite();
                epik epikVar2 = (epik) epiiVar.instance;
                epikVar2.d = i2 - 1;
                epikVar2.b |= 2;
                eotgVar.copyOnWrite();
                eoti eotiVar = (eoti) eotgVar.instance;
                epik epikVar3 = (epik) epiiVar.build();
                epikVar3.getClass();
                eotiVar.d = epikVar3;
                eotiVar.c = 5;
                ddpl.this.b(eotgVar);
                return true;
            }
        }, this.e).k(axou.a(new ddpk()), erpp.a);
    }

    public final void g(int i) {
        h(i, cbpb.j().a());
    }

    public final void h(final int i, final cbpb cbpbVar) {
        elfo.g(new Callable() { // from class: ddpg
            @Override // java.util.concurrent.Callable
            public final Object call() {
                eotj eotjVar = (eotj) eotk.a.createBuilder();
                cbpb cbpbVar2 = cbpbVar;
                Cursor cursor = ((cbmd) cbpbVar2.a()).a;
                engw g = cbpbVar2.g();
                engw d = cbpbVar2.d();
                engw h = cbpbVar2.h();
                engw e = cbpbVar2.e();
                engw f = cbpbVar2.f();
                engw c = cbpbVar2.c();
                int count = cursor.getCount();
                int size = g.size();
                int size2 = d.size();
                int size3 = h.size();
                int size4 = e.size();
                int size5 = f.size();
                int size6 = c.size();
                eotjVar.copyOnWrite();
                eotk eotkVar = (eotk) eotjVar.instance;
                eotkVar.b |= 1;
                eotkVar.c = count;
                eotjVar.copyOnWrite();
                eotk eotkVar2 = (eotk) eotjVar.instance;
                eotkVar2.b |= 2;
                eotkVar2.d = size;
                eotjVar.copyOnWrite();
                eotk eotkVar3 = (eotk) eotjVar.instance;
                eotkVar3.b |= 4;
                eotkVar3.e = size2;
                eotjVar.copyOnWrite();
                eotk eotkVar4 = (eotk) eotjVar.instance;
                eotkVar4.b |= 8;
                eotkVar4.f = size3;
                eotjVar.copyOnWrite();
                eotk eotkVar5 = (eotk) eotjVar.instance;
                eotkVar5.b |= 32;
                eotkVar5.h = size4;
                eotjVar.copyOnWrite();
                eotk eotkVar6 = (eotk) eotjVar.instance;
                eotkVar6.b |= 16;
                eotkVar6.g = size5;
                eotjVar.copyOnWrite();
                eotk eotkVar7 = (eotk) eotjVar.instance;
                eotkVar7.b |= 64;
                eotkVar7.i = size6;
                int count2 = ((cbmd) cbpbVar2.b()).a.getCount();
                eotjVar.copyOnWrite();
                eotk eotkVar8 = (eotk) eotjVar.instance;
                eotkVar8.b |= 128;
                eotkVar8.j = count2;
                epin epinVar = (epin) epip.a.createBuilder();
                epinVar.copyOnWrite();
                epip epipVar = (epip) epinVar.instance;
                epipVar.c = i - 1;
                epipVar.b |= 1;
                ddpl ddplVar = ddpl.this;
                epinVar.copyOnWrite();
                epip epipVar2 = (epip) epinVar.instance;
                eotk eotkVar9 = (eotk) eotjVar.build();
                eotkVar9.getClass();
                epipVar2.d = eotkVar9;
                epipVar2.b |= 2;
                epip epipVar3 = (epip) epinVar.build();
                eotg eotgVar = (eotg) eoti.a.createBuilder();
                eotgVar.copyOnWrite();
                eoti eotiVar = (eoti) eotgVar.instance;
                epipVar3.getClass();
                eotiVar.d = epipVar3;
                eotiVar.c = 4;
                ddplVar.b(eotgVar);
                return true;
            }
        }, this.e).k(axou.a(new ddpj()), erpp.a);
    }
}
