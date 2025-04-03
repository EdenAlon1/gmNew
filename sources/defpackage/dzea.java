package defpackage;

import androidx.car.app.hardware.info.EnergyProfile;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzea {
    public static dzpt a(dzja dzjaVar, fbhy fbhyVar) {
        dzpg f = dzjaVar.c().f();
        int i = fbhyVar.d;
        char c = i != 0 ? i != 1 ? i != 2 ? (char) 0 : (char) 4 : (char) 3 : (char) 2;
        if (c == 0 || c != 4) {
            List g = enkr.g((fbhyVar.b == 101 ? (fbiw) fbhyVar.c : fbiw.a).b, new emwl() { // from class: dzdz
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    return dzec.a((fbik) obj);
                }
            });
            dzin dzinVar = new dzin();
            dzinVar.e((dzpg) enjk.g(g, new emxk(new emxj(f))));
            dzinVar.c(dzjaVar.c().f());
            return dzinVar.a();
        }
        dzin dzinVar2 = new dzin();
        dzip dzipVar = new dzip();
        dzipVar.c((fbhyVar.b == 103 ? (fbhs) fbhyVar.c : fbhs.a).b);
        dzipVar.b((fbhyVar.b == 103 ? (fbhs) fbhyVar.c : fbhs.a).c);
        dzinVar2.d(dzipVar.a());
        dzinVar2.c(f);
        return dzinVar2.a();
    }

    public static fbhy b(dzpt dzptVar) {
        if (dzptVar.e() != dzpq.GROUP) {
            fbik b = dzec.b(dzptVar.a());
            fbik b2 = dzec.b(dzptVar.c());
            fbhx fbhxVar = (fbhx) fbhy.a.createBuilder();
            fbhxVar.copyOnWrite();
            ((fbhy) fbhxVar.instance).d = fbju.a(3);
            fbiv fbivVar = (fbiv) fbiw.a.createBuilder();
            fbivVar.a(b);
            fbivVar.a(b2);
            fbhxVar.copyOnWrite();
            fbhy fbhyVar = (fbhy) fbhxVar.instance;
            fbiw fbiwVar = (fbiw) fbivVar.build();
            fbiwVar.getClass();
            fbhyVar.c = fbiwVar;
            fbhyVar.b = EnergyProfile.EVCONNECTOR_TYPE_OTHER;
            return (fbhy) fbhxVar.build();
        }
        fbhx fbhxVar2 = (fbhx) fbhy.a.createBuilder();
        fbhxVar2.copyOnWrite();
        ((fbhy) fbhxVar2.instance).d = fbju.a(4);
        fbhr fbhrVar = (fbhr) fbhs.a.createBuilder();
        String b3 = dzptVar.d().b();
        fbhrVar.copyOnWrite();
        ((fbhs) fbhrVar.instance).b = b3;
        String a = dzptVar.d().a();
        fbhrVar.copyOnWrite();
        ((fbhs) fbhrVar.instance).c = a;
        fbhxVar2.copyOnWrite();
        fbhy fbhyVar2 = (fbhy) fbhxVar2.instance;
        fbhs fbhsVar = (fbhs) fbhrVar.build();
        fbhsVar.getClass();
        fbhyVar2.c = fbhsVar;
        fbhyVar2.b = 103;
        return (fbhy) fbhxVar2.build();
    }
}
