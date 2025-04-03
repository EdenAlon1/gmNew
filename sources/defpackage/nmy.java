package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nmy {
    private final List a;

    public nmy(List list) {
        this.a = list;
    }

    private final List c(nol nolVar) {
        String str;
        int i;
        List list;
        luv luvVar = new luv(nolVar.e);
        List list2 = this.a;
        while (luvVar.b() > 0) {
            int j = luvVar.j();
            int j2 = luvVar.b + luvVar.j();
            if (j == 134) {
                list2 = new ArrayList();
                int j3 = luvVar.j() & 31;
                for (int i2 = 0; i2 < j3; i2++) {
                    String y = luvVar.y(3);
                    int j4 = luvVar.j();
                    boolean z = (j4 & 128) != 0;
                    if (z) {
                        i = j4 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte j5 = (byte) luvVar.j();
                    luvVar.L(1);
                    if (z) {
                        int i3 = j5 & 64;
                        byte[] bArr = lto.a;
                        list = Collections.singletonList(i3 != 0 ? new byte[]{1} : new byte[]{0});
                    } else {
                        list = null;
                    }
                    lqb lqbVar = new lqb();
                    lqbVar.c(str);
                    lqbVar.d = y;
                    lqbVar.H = i;
                    lqbVar.p = list;
                    list2.add(new lqc(lqbVar));
                }
            }
            luvVar.K(j2);
        }
        return list2;
    }

    public final nod a(nol nolVar) {
        return new nod(c(nolVar));
    }

    public final nop b(nol nolVar) {
        return new nop(c(nolVar));
    }

    public nmy() {
        this((byte[]) null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public nmy(byte[] bArr) {
        this(enou.a);
        int i = engw.d;
    }
}
