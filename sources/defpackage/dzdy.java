package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzdy {
    public static emxc a(fbge fbgeVar) {
        int i;
        int i2 = fbgeVar.d;
        int a = fbjs.a(i2);
        if (a == 0) {
            a = 1;
        }
        int i3 = a - 2;
        if (i3 != 1) {
            i = 2;
            if (i3 != 2) {
                if (i3 == 3) {
                    i = 3;
                } else if (i3 != 4) {
                    i = 5;
                    if (i3 != 5) {
                        i = 0;
                    }
                } else {
                    i = 4;
                }
            }
        } else {
            i = 1;
        }
        int a2 = fbjs.a(i2);
        int i4 = (a2 != 0 ? a2 : 1) - 2;
        if (i4 != 3 && i4 != 4) {
            return emux.a;
        }
        fbgt fbgtVar = fbgeVar.b == 11 ? (fbgt) fbgeVar.c : fbgt.a;
        int i5 = engw.d;
        engr engrVar = new engr();
        Iterator<E> it = fbgtVar.b.iterator();
        while (it.hasNext()) {
            engrVar.h(dzec.a((fbik) it.next()));
        }
        engw g = engrVar.g();
        if (g != null) {
            return emxc.j(new dzmn(i, (dzou) ((emxn) emxc.j(new dzkk(new dzns(g)))).a));
        }
        throw new NullPointerException("Null contactIds");
    }
}
