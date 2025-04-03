package defpackage;

import android.util.Base64;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzee {
    public static final /* synthetic */ int a = 0;
    private static final enhk b = enhk.m(fbjt.PHOTO, "photos", fbjt.RICH_CARD, "rich_card");

    public static dyyv a(dzja dzjaVar, fcek fcekVar, List list) {
        dzpt b2 = dzdx.b(fcekVar, dzjaVar);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            fcek fcekVar2 = (fcek) it.next();
            dzpg a2 = dzdx.a(fcekVar2);
            if (a2 != null) {
                arrayList.add(a2);
            } else {
                dyhr.a("MsgProtoConverter", "Failed to convert Id: " + fcekVar2.c + " to ContactId");
            }
        }
        dyzu dyzuVar = new dyzu();
        dyzuVar.b(arrayList);
        return new dyzl(b2, dyzuVar.a());
    }

    public static dzpg b(fblh fblhVar) {
        fbik fbikVar = fblhVar.k;
        if (fbikVar == null) {
            fbikVar = fbik.a;
        }
        return fblhVar.c == 5 ? dzec.a((fbik) fblhVar.d) : dzec.a(fbikVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x018b, code lost:
    
        if ((r2.g == 151 ? (defpackage.fbja) r2.h : defpackage.fbja.a).h == 1) goto L90;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:166:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0557  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x06d2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0240  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.emxc c(defpackage.emxc r17, defpackage.dzja r18, android.content.Context r19, java.util.Map r20, defpackage.dzhn r21) {
        /*
            Method dump skipped, instructions count: 2118
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dzee.c(emxc, dzja, android.content.Context, java.util.Map, dzhn):emxc");
    }

    private static dzbg d(dzqg dzqgVar, fblh fblhVar, dzpg dzpgVar, dzpt dzptVar, dzja dzjaVar, dzhn dzhnVar) {
        HashMap hashMap = new HashMap();
        Map unmodifiableMap = DesugarCollections.unmodifiableMap(fblhVar.o);
        for (String str : unmodifiableMap.keySet()) {
            hashMap.put(str, ((eydq) unmodifiableMap.get(str)).toByteString());
        }
        dzqgVar.l(hashMap);
        dzqgVar.f(fblhVar.m);
        fbik fbikVar = fblhVar.k;
        if (fbikVar == null) {
            fbikVar = fbik.a;
        }
        dzio dzioVar = (dzio) dzptVar;
        boolean z = dzpgVar.equals(dzioVar.a) || dzec.a(fbikVar).equals(dzioVar.a);
        dzqgVar.g((z || fblhVar.q) ? 1 : 0);
        dzqgVar.j(fblhVar.i);
        dznl dznlVar = (dznl) dzqgVar;
        dznlVar.e = true != z ? 1 : 2;
        dzqgVar.k(z ? dzqm.OUTGOING_SENT : dzqm.INCOMING_RECEIVED);
        dzqgVar.o(fblhVar.p);
        dznlVar.a = dzpgVar;
        dzqgVar.e(dzptVar);
        dzqgVar.n(fblhVar.j);
        dzqs a2 = dzqgVar.a();
        dznm dznmVar = (dznm) a2;
        if (dznmVar.j != -1) {
            dzhl r = dzhm.r();
            r.g(10011);
            r.n(dzjaVar.c().f());
            r.o(dzjaVar.d().E());
            r.p(fblhVar.i);
            ((dzhj) r).a = emxc.j(Integer.valueOf(dznmVar.j));
            dzhnVar.b(r.a());
        }
        dzae dzaeVar = new dzae();
        dzaeVar.b = new dyzf(a2);
        dzaeVar.b(z || fblhVar.q);
        return dzaeVar.a();
    }

    private static boolean e(fbjt fbjtVar, dzqg dzqgVar, Map map, fblh fblhVar, dzja dzjaVar) {
        String str = (String) b.get(fbjtVar);
        if (map.containsKey(str)) {
            ((dznl) dzqgVar).b = ((dzdv) map.get(str)).a().a(dzjaVar, fblhVar);
            return true;
        }
        fbgl fbglVar = (fbgl) fbgm.a.createBuilder();
        fbglVar.copyOnWrite();
        fbgm fbgmVar = (fbgm) fbglVar.instance;
        fbgmVar.c = fblhVar;
        fbgmVar.b |= 1;
        dzqgVar.t(eyee.x(Base64.encode(((fbgm) fbglVar.build()).toByteArray(), 8)));
        dzqgVar.c(fblhVar.s);
        return false;
    }
}
