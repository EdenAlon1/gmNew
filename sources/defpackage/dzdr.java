package defpackage;

import androidx.car.app.hardware.info.EnergyProfile;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzdr {
    /* JADX WARN: Multi-variable type inference failed */
    public static fbhu a(dzjn dzjnVar) {
        fbht fbhtVar = (fbht) fbhu.a.createBuilder();
        h(dzjnVar, fbhtVar);
        switch (dzjnVar.d()) {
            case UNKNOWN:
                throw new IllegalArgumentException("Got unknown action type integer.");
            case SEND_MESSAGE:
                fbjb fbjbVar = (fbjb) fbjc.a.createBuilder();
                String d = dzjnVar.b().d().d();
                fbjbVar.copyOnWrite();
                ((fbjc) fbjbVar.instance).b = d;
                String c = dzjnVar.b().d().c();
                fbjbVar.copyOnWrite();
                ((fbjc) fbjbVar.instance).d = c;
                fbjbVar.copyOnWrite();
                ((fbjc) fbjbVar.instance).c = false;
                fbjc fbjcVar = (fbjc) fbjbVar.build();
                fbhtVar.copyOnWrite();
                fbhu fbhuVar = (fbhu) fbhtVar.instance;
                fbjcVar.getClass();
                fbhuVar.d = fbjcVar;
                fbhuVar.c = EnergyProfile.EVCONNECTOR_TYPE_OTHER;
                break;
            case PREFILL_MESSAGE:
                fbjb fbjbVar2 = (fbjb) fbjc.a.createBuilder();
                String d2 = dzjnVar.b().c().d();
                fbjbVar2.copyOnWrite();
                ((fbjc) fbjbVar2.instance).b = d2;
                String c2 = dzjnVar.b().c().c();
                fbjbVar2.copyOnWrite();
                ((fbjc) fbjbVar2.instance).d = c2;
                fbjbVar2.copyOnWrite();
                ((fbjc) fbjbVar2.instance).c = true;
                fbjc fbjcVar2 = (fbjc) fbjbVar2.build();
                fbhtVar.copyOnWrite();
                fbhu fbhuVar2 = (fbhu) fbhtVar.instance;
                fbjcVar2.getClass();
                fbhuVar2.d = fbjcVar2;
                fbhuVar2.c = EnergyProfile.EVCONNECTOR_TYPE_OTHER;
                break;
            case CUSTOM_ACTION:
                fbhj fbhjVar = (fbhj) fbhk.a.createBuilder();
                String i = dzjnVar.b().i();
                fbhjVar.copyOnWrite();
                ((fbhk) fbhjVar.instance).b = i;
                fbhk fbhkVar = (fbhk) fbhjVar.build();
                fbhtVar.copyOnWrite();
                fbhu fbhuVar3 = (fbhu) fbhtVar.instance;
                fbhkVar.getClass();
                fbhuVar3.d = fbhkVar;
                fbhuVar3.c = 102;
                break;
            case WEB_ACTION:
                fbjn fbjnVar = (fbjn) fbjo.a.createBuilder();
                String k = dzjnVar.b().k();
                fbjnVar.copyOnWrite();
                ((fbjo) fbjnVar.instance).b = k;
                fbjo fbjoVar = (fbjo) fbjnVar.build();
                fbhtVar.copyOnWrite();
                fbhu fbhuVar4 = (fbhu) fbhtVar.instance;
                fbjoVar.getClass();
                fbhuVar4.d = fbjoVar;
                fbhuVar4.c = 103;
                break;
            case OVERLAY_ACTION:
                dzmd dzmdVar = new dzmd();
                dzmdVar.b(dzjnVar.b().f());
                fbiy e = e(dzmdVar.a());
                fbhtVar.copyOnWrite();
                fbhu fbhuVar5 = (fbhu) fbhtVar.instance;
                e.getClass();
                fbhuVar5.d = e;
                fbhuVar5.c = 104;
                break;
            case CALL_ACTION:
                fbhf fbhfVar = (fbhf) fbhg.a.createBuilder();
                String h = dzjnVar.b().h();
                fbhfVar.copyOnWrite();
                ((fbhg) fbhfVar.instance).b = h;
                fbhg fbhgVar = (fbhg) fbhfVar.build();
                fbhtVar.copyOnWrite();
                fbhu fbhuVar6 = (fbhu) fbhtVar.instance;
                fbhgVar.getClass();
                fbhuVar6.d = fbhgVar;
                fbhuVar6.c = 105;
                break;
            case TOMBSTONE_ACTION:
                fbjf fbjfVar = (fbjf) fbjg.a.createBuilder();
                String j = dzjnVar.b().j();
                fbjfVar.copyOnWrite();
                ((fbjg) fbjfVar.instance).b = j;
                fbjg fbjgVar = (fbjg) fbjfVar.build();
                fbhtVar.copyOnWrite();
                fbhu fbhuVar7 = (fbhu) fbhtVar.instance;
                fbjgVar.getClass();
                fbhuVar7.d = fbjgVar;
                fbhuVar7.c = 106;
                break;
            case COMPOSED_OVERLAY_ACTION:
                fbiy e2 = e(dzjnVar.b().b());
                fbhtVar.copyOnWrite();
                fbhu fbhuVar8 = (fbhu) fbhtVar.instance;
                e2.getClass();
                fbhuVar8.d = e2;
                fbhuVar8.c = 104;
                break;
            case URL_ACTION:
                dzsg g = dzjnVar.b().g();
                ArrayList arrayList = new ArrayList();
                engw a = g.a();
                int i2 = ((enou) a).c;
                for (int i3 = 0; i3 < i2; i3++) {
                    dzsf dzsfVar = (dzsf) a.get(i3);
                    fbjl fbjlVar = (fbjl) fbjm.a.createBuilder();
                    String b = dzsfVar.b();
                    fbjlVar.copyOnWrite();
                    ((fbjm) fbjlVar.instance).b = b;
                    int a2 = dzsfVar.a();
                    fbjlVar.copyOnWrite();
                    ((fbjm) fbjlVar.instance).c = a2;
                    arrayList.add((fbjm) fbjlVar.build());
                }
                fbjj fbjjVar = (fbjj) fbjk.a.createBuilder();
                String b2 = g.b();
                fbjjVar.copyOnWrite();
                ((fbjk) fbjjVar.instance).b = b2;
                fbjjVar.copyOnWrite();
                fbjk fbjkVar = (fbjk) fbjjVar.instance;
                eygr eygrVar = fbjkVar.c;
                if (!eygrVar.c()) {
                    fbjkVar.c = eyfy.mutableCopy(eygrVar);
                }
                eydl.addAll(arrayList, fbjkVar.c);
                fbjk fbjkVar2 = (fbjk) fbjjVar.build();
                fbhtVar.copyOnWrite();
                fbhu fbhuVar9 = (fbhu) fbhtVar.instance;
                fbjkVar2.getClass();
                fbhuVar9.d = fbjkVar2;
                fbhuVar9.c = 107;
                break;
            case DECORATION_TRANSITION_ACTION:
                fbhp fbhpVar = (fbhp) fbhq.a.createBuilder();
                fbhn fbhnVar = (fbhn) fbho.a.createBuilder();
                engw a3 = dzjnVar.b().e().a();
                fbhnVar.copyOnWrite();
                fbho fbhoVar = (fbho) fbhnVar.instance;
                eygr eygrVar2 = fbhoVar.b;
                if (!eygrVar2.c()) {
                    fbhoVar.b = eyfy.mutableCopy(eygrVar2);
                }
                eydl.addAll(a3, fbhoVar.b);
                engw b3 = dzjnVar.b().e().b();
                fbhnVar.copyOnWrite();
                fbho fbhoVar2 = (fbho) fbhnVar.instance;
                eygr eygrVar3 = fbhoVar2.c;
                if (!eygrVar3.c()) {
                    fbhoVar2.c = eyfy.mutableCopy(eygrVar3);
                }
                eydl.addAll(b3, fbhoVar2.c);
                fbhpVar.copyOnWrite();
                fbhq fbhqVar = (fbhq) fbhpVar.instance;
                fbho fbhoVar3 = (fbho) fbhnVar.build();
                fbhoVar3.getClass();
                fbhqVar.c = fbhoVar3;
                fbhqVar.b |= 1;
                fbhq fbhqVar2 = (fbhq) fbhpVar.build();
                fbhtVar.copyOnWrite();
                fbhu fbhuVar10 = (fbhu) fbhtVar.instance;
                fbhqVar2.getClass();
                fbhuVar10.d = fbhqVar2;
                fbhuVar10.c = 108;
                break;
        }
        int ordinal = dzjnVar.e().ordinal();
        if (ordinal != 6) {
            if (ordinal != 8) {
                throw new IllegalArgumentException("Got unknown callback failure action type integer: " + dzjnVar.e().m);
            }
            fbjf fbjfVar2 = (fbjf) fbjg.a.createBuilder();
            String j2 = dzjnVar.c().j();
            fbjfVar2.copyOnWrite();
            ((fbjg) fbjfVar2.instance).b = j2;
            fbjg fbjgVar2 = (fbjg) fbjfVar2.build();
            fbhtVar.copyOnWrite();
            fbhu fbhuVar11 = (fbhu) fbhtVar.instance;
            fbjgVar2.getClass();
            fbhuVar11.f = fbjgVar2;
            fbhuVar11.e = BasePaymentResult.ERROR_REQUEST_TIMEOUT;
        }
        return (fbhu) fbhtVar.build();
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0140  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.emxc b(defpackage.fbhu r7, defpackage.emxc r8, defpackage.emxc r9) {
        /*
            Method dump skipped, instructions count: 510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dzdr.b(fbhu, emxc, emxc):emxc");
    }

    public static int c(int i) {
        switch (dzjf.a(i).ordinal()) {
            case 1:
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
            case 9:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 10:
                return 10;
            case 11:
                return 11;
            default:
                return 2;
        }
    }

    private static emxc d(fbja fbjaVar) {
        fbhu fbhuVar = fbjaVar.c;
        if (fbhuVar == null) {
            fbhuVar = fbhu.a;
        }
        int b = fbjr.b(fbhuVar.j);
        if (b == 0 || b != 7) {
            return emux.a;
        }
        dzjg f = dzjn.f();
        fbhu fbhuVar2 = fbjaVar.c;
        if (fbhuVar2 == null) {
            fbhuVar2 = fbhu.a;
        }
        emux emuxVar = emux.a;
        g(f, fbhuVar2, emuxVar, emuxVar);
        f.t();
        dzqn k = dzqo.k();
        k.e(fbjaVar.e);
        k.d(fbjaVar.d);
        k.k(fbjaVar.f);
        k.b(f.a());
        fbii fbiiVar = fbjaVar.g;
        if (fbiiVar == null) {
            fbiiVar = fbii.a;
        }
        k.i(dzeb.a(fbiiVar));
        k.j(fbjaVar.h);
        k.h(fbjaVar.i);
        k.c(fbjaVar.k);
        k.g(fbjaVar.j);
        return emxc.j(k.a());
    }

    private static fbiy e(dzjk dzjkVar) {
        fbix fbixVar = (fbix) fbiy.a.createBuilder();
        if (dzjkVar.a().g()) {
            fbja f = f((dzqo) dzjkVar.a().c());
            fbixVar.copyOnWrite();
            fbiy fbiyVar = (fbiy) fbixVar.instance;
            f.getClass();
            fbiyVar.c = f;
            fbiyVar.b |= 1;
        }
        if (dzjkVar.b().g()) {
            Object c = dzjkVar.b().c();
            fbhl fbhlVar = (fbhl) fbhm.a.createBuilder();
            dzpw dzpwVar = (dzpw) c;
            String b = dzpwVar.b();
            fbhlVar.copyOnWrite();
            ((fbhm) fbhlVar.instance).d = b;
            fbja f2 = f(dzpwVar.a());
            fbhlVar.copyOnWrite();
            fbhm fbhmVar = (fbhm) fbhlVar.instance;
            f2.getClass();
            fbhmVar.c = f2;
            fbhmVar.b |= 1;
            fbixVar.copyOnWrite();
            fbiy fbiyVar2 = (fbiy) fbixVar.instance;
            fbhm fbhmVar2 = (fbhm) fbhlVar.build();
            fbhmVar2.getClass();
            fbiyVar2.d = fbhmVar2;
            fbiyVar2.b |= 2;
        }
        return (fbiy) fbixVar.build();
    }

    private static fbja f(dzqo dzqoVar) {
        fbht fbhtVar = (fbht) fbhu.a.createBuilder();
        if (dzqoVar.c().g()) {
            h((dzjn) dzqoVar.c().c(), fbhtVar);
        }
        fbiz fbizVar = (fbiz) fbja.a.createBuilder();
        int a = dzqoVar.a();
        fbizVar.copyOnWrite();
        ((fbja) fbizVar.instance).h = a;
        if (dzqoVar.d().g()) {
            Object c = dzqoVar.d().c();
            fbizVar.copyOnWrite();
            ((fbja) fbizVar.instance).d = (eyee) c;
        }
        if (dzqoVar.e().g()) {
            Object c2 = dzqoVar.e().c();
            fbizVar.copyOnWrite();
            ((fbja) fbizVar.instance).e = (String) c2;
        }
        fbhtVar.copyOnWrite();
        ((fbhu) fbhtVar.instance).j = fbjr.a(7);
        fbhu fbhuVar = (fbhu) fbhtVar.build();
        fbizVar.copyOnWrite();
        fbja fbjaVar = (fbja) fbizVar.instance;
        fbhuVar.getClass();
        fbjaVar.c = fbhuVar;
        fbjaVar.b |= 1;
        int b = dzqoVar.b();
        fbizVar.copyOnWrite();
        ((fbja) fbizVar.instance).f = b;
        int a2 = dzqoVar.a();
        fbizVar.copyOnWrite();
        ((fbja) fbizVar.instance).h = a2;
        return (fbja) fbizVar.build();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void g(defpackage.dzjg r2, defpackage.fbhu r3, defpackage.emxc r4, defpackage.emxc r5) {
        /*
            long r0 = r3.i
            r2.c(r0)
            java.lang.String r0 = r3.g
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L12
            java.lang.String r0 = r3.g
            r2.j(r0)
        L12:
            fbik r3 = r3.h
            if (r3 != 0) goto L18
            fbik r3 = defpackage.fbik.a
        L18:
            dzpf r0 = defpackage.dzpf.UNKNOWN
            int r0 = r3.b
            int r0 = defpackage.fbjw.b(r0)
            r1 = 1
            if (r0 != 0) goto L24
            r0 = r1
        L24:
            int r0 = r0 + (-2)
            if (r0 == r1) goto L54
            r1 = 2
            if (r0 == r1) goto L54
            r1 = 3
            if (r0 == r1) goto L54
            r1 = 4
            if (r0 == r1) goto L37
            r1 = 5
            if (r0 == r1) goto L54
            emux r3 = defpackage.emux.a
            goto L61
        L37:
            dzip r0 = new dzip
            r0.<init>()
            java.lang.String r1 = r3.c
            r0.c(r1)
            java.lang.String r3 = r3.e
            r0.b(r3)
            dzpn r3 = r0.a()
            dzke r0 = new dzke
            r0.<init>(r3)
            emxc r3 = defpackage.emxc.j(r0)
            goto L61
        L54:
            dzpg r3 = defpackage.dzec.a(r3)
            dzkd r0 = new dzkd
            r0.<init>(r3)
            emxc r3 = defpackage.emxc.j(r0)
        L61:
            boolean r0 = r3.g()
            if (r0 == 0) goto L70
            java.lang.Object r3 = r3.c()
            dzjh r3 = (defpackage.dzjh) r3
            r2.g(r3)
        L70:
            boolean r3 = r4.g()
            if (r3 == 0) goto L7f
            java.lang.Object r3 = r4.c()
            java.lang.String r3 = (java.lang.String) r3
            r2.o(r3)
        L7f:
            boolean r3 = r5.g()
            if (r3 == 0) goto L8e
            java.lang.Object r3 = r5.c()
            java.lang.String r3 = (java.lang.String) r3
            r2.k(r3)
        L8e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dzdr.g(dzjg, fbhu, emxc, emxc):void");
    }

    private static void h(dzjn dzjnVar, fbht fbhtVar) {
        long a = dzjnVar.a();
        fbhtVar.copyOnWrite();
        fbhu fbhuVar = (fbhu) fbhtVar.instance;
        fbhu fbhuVar2 = fbhu.a;
        fbhuVar.i = a;
        if (dzjnVar.h().g()) {
            Object c = dzjnVar.h().c();
            fbhtVar.copyOnWrite();
            ((fbhu) fbhtVar.instance).g = (String) c;
        }
        if (dzjnVar.g().g()) {
            fbik c2 = dzec.c((dzjh) dzjnVar.g().c());
            fbhtVar.copyOnWrite();
            fbhu fbhuVar3 = (fbhu) fbhtVar.instance;
            c2.getClass();
            fbhuVar3.h = c2;
            fbhuVar3.b |= 1;
        }
        int c3 = c(dzjnVar.d().m);
        fbhtVar.copyOnWrite();
        ((fbhu) fbhtVar.instance).j = fbjr.a(c3);
        int ordinal = dzjf.a(dzjnVar.e().m).ordinal();
        int i = ordinal != 6 ? ordinal != 8 ? 1 : 3 : 2;
        fbhtVar.copyOnWrite();
        fbhu fbhuVar4 = (fbhu) fbhtVar.instance;
        if (i == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        fbhuVar4.k = i - 2;
    }
}
