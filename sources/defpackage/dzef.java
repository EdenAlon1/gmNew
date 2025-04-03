package defpackage;

import android.content.Context;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzef {
    public static dzav a(dzja dzjaVar, Context context, fbip fbipVar, dzhn dzhnVar, long j) {
        emxc emxcVar;
        emxc j2;
        dyzx dyzxVar = new dyzx();
        dyzxVar.f(fbipVar.c);
        fbim fbimVar = fbipVar.d;
        if (fbimVar == null) {
            fbimVar = fbim.a;
        }
        dyzxVar.b(fbimVar.d);
        dyzxVar.e = emxc.j(Long.valueOf(j));
        if (!fbipVar.k.isEmpty()) {
            dyzxVar.a = emxc.j(fbipVar.k);
        }
        fbim fbimVar2 = fbipVar.d;
        if (fbimVar2 == null) {
            fbimVar2 = fbim.a;
        }
        if ((fbimVar2.b == 2 ? (String) fbimVar2.c : "").isEmpty()) {
            fbim fbimVar3 = fbipVar.d;
            if (fbimVar3 == null) {
                fbimVar3 = fbim.a;
            }
            dyzxVar.g((fbimVar3.b == 1 ? (eyee) fbimVar3.c : eyee.b).I());
        } else {
            fbim fbimVar4 = fbipVar.d;
            if (fbimVar4 == null) {
                fbimVar4 = fbim.a;
            }
            dyzxVar.c(fbimVar4.b == 2 ? (String) fbimVar4.c : "");
        }
        if ((fbipVar.b & 2) != 0) {
            dyzu dyzuVar = new dyzu();
            ArrayList arrayList = new ArrayList();
            fbig fbigVar = fbipVar.e;
            if (fbigVar == null) {
                fbigVar = fbig.a;
            }
            Iterator<E> it = fbigVar.b.iterator();
            while (it.hasNext()) {
                arrayList.add(dzec.a((fbik) it.next()));
            }
            dyzuVar.b(arrayList);
            dyzxVar.b = emxc.j(dyzuVar.a());
        }
        HashMap hashMap = new HashMap();
        Map unmodifiableMap = DesugarCollections.unmodifiableMap(fbipVar.f);
        for (String str : unmodifiableMap.keySet()) {
            hashMap.put(str, ((eydq) unmodifiableMap.get(str)).toByteArray());
        }
        dyzxVar.e(hashMap);
        int i = engw.d;
        engr engrVar = new engr();
        for (fbiu fbiuVar : fbipVar.g) {
            fbhu fbhuVar = fbiuVar.c;
            if (fbhuVar == null) {
                fbhuVar = fbhu.a;
            }
            emux emuxVar = emux.a;
            emxc b = dzdr.b(fbhuVar, emuxVar, emuxVar);
            if (b.g()) {
                dznh dznhVar = new dznh();
                dznhVar.c(fbiuVar.b);
                dznhVar.a = (dzjn) b.c();
                engrVar.h(dznhVar.a());
            }
        }
        dyzxVar.d(engrVar.g());
        fbji fbjiVar = fbipVar.j;
        if (fbjiVar == null) {
            fbjiVar = fbji.a;
        }
        dznj dznjVar = new dznj();
        int i2 = 0;
        dznjVar.b(0);
        dznjVar.c(0);
        if ((fbjiVar.b & 1) != 0) {
            fbhw fbhwVar = fbjiVar.c;
            if (fbhwVar == null) {
                fbhwVar = fbhw.a;
            }
            int i3 = fbhwVar.b;
            int i4 = i3 != 0 ? i3 != 1 ? 0 : 3 : 2;
            if (i4 == 0) {
                i4 = 1;
            }
            if (i4 - 2 != 1) {
                dznjVar.b(0);
            } else {
                dznjVar.b(1);
            }
        }
        int i5 = fbjiVar.d;
        if (i5 == 0) {
            i2 = 2;
        } else if (i5 == 1) {
            i2 = 3;
        }
        if (i2 == 0) {
            i2 = 1;
        }
        if (i2 - 2 != 1) {
            dznjVar.c(1);
        } else {
            dznjVar.c(2);
        }
        dyzxVar.c = emxc.j(dznjVar.a());
        engr engrVar2 = new engr();
        for (fbiu fbiuVar2 : fbipVar.h) {
            emux emuxVar2 = emux.a;
            dznh dznhVar2 = new dznh();
            fbhu fbhuVar2 = fbiuVar2.c;
            if (fbhuVar2 == null) {
                fbhuVar2 = fbhu.a;
            }
            emxc b2 = dzdr.b(fbhuVar2, emuxVar2, emuxVar2);
            if (b2.g()) {
                dznhVar2.c(fbiuVar2.b);
                dznhVar2.a = (dzjn) b2.c();
                if (!fbiuVar2.d.H()) {
                    dznhVar2.b(fbiuVar2.d.I());
                }
                j2 = emxc.j(dznhVar2.a());
            } else {
                j2 = emux.a;
            }
            if (j2.g()) {
                engrVar2.h(j2.c());
            }
        }
        dyzxVar.h(engrVar2.g());
        fbia fbiaVar = fbipVar.i;
        if (fbiaVar == null) {
            fbiaVar = fbia.a;
        }
        int i6 = fbiaVar.b;
        int a = fbjv.a(i6);
        if (a == 0) {
            a = 1;
        }
        if (a - 2 == 1) {
            int a2 = fbjv.a(i6);
            if (a2 != 0 && a2 == 3) {
                try {
                    eydq eydqVar = fbiaVar.c;
                    if (eydqVar == null) {
                        eydqVar = eydq.a;
                    }
                    dzrw a3 = dzeu.a(dzjaVar, context, (fbnn) eyfy.parseFrom(fbnn.a, eydqVar.c, eyfc.a()), "RICH_TEXT_ACCESSORY_VIEW", dzhnVar);
                    dzoa dzoaVar = new dzoa();
                    dzoaVar.a = a3;
                    emxcVar = emxc.j(dzoaVar.a());
                } catch (eygu unused) {
                    dyhr.c("RichTextCustomViewContentProtoConverter", "can not convert proto to RichText");
                    emxcVar = emux.a;
                }
            } else {
                dyhr.c("RichTextCustomViewContentProtoConverter", "This CustomViewContent is not type of RICH_TEXT");
                emxcVar = emux.a;
            }
            if (emxcVar.g()) {
                dyzxVar.d = emxc.j(emxcVar.c());
            }
        }
        return dyzxVar.a();
    }
}
