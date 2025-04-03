package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class htz extends ffkk implements ffix {
    final /* synthetic */ hua a;
    final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public htz(hua huaVar, Object obj) {
        super(0);
        this.a = huaVar;
        this.b = obj;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        hug hugVar;
        List list;
        hfm hfmVar = this.a.b;
        if (!hfmVar.q) {
            return ffel.a;
        }
        Object obj = this.b;
        hjr hjrVar = hfmVar.c;
        hfl hflVar = new hfl(obj);
        hjq c = hjrVar.c();
        try {
            ffkz ffkzVar = new ffkz();
            loop0: while (true) {
                int i = ffkzVar.a;
                hugVar = null;
                if (i >= hjrVar.b) {
                    break;
                }
                if (c.B(i) && ((Boolean) hflVar.invoke(c.o(ffkzVar.a))).booleanValue()) {
                    hug hugVar2 = new hug(ffkzVar.a, null);
                    c.r();
                    hugVar = hugVar2;
                    break;
                }
                int i2 = ffkzVar.a;
                int e = hjt.e(c.b, i2);
                int i3 = i2 + 1;
                int i4 = (i3 < c.c ? c.b[(i3 * 5) + 4] : c.d) - e;
                for (int i5 = 0; i5 < i4; i5++) {
                    if (((Boolean) hflVar.invoke(c.l(ffkzVar.a, i5))).booleanValue()) {
                        hugVar = new hug(ffkzVar.a, Integer.valueOf(i5));
                        break loop0;
                    }
                }
                ffkzVar.a++;
            }
            if (hugVar == null) {
                return ffel.a;
            }
            boolean z = hfmVar.q;
            int i6 = hugVar.a;
            Integer num = hugVar.b;
            if (z) {
                c = hfmVar.c.c();
                try {
                    List b = htu.b(c, i6, num);
                    c.r();
                    list = b;
                } finally {
                }
            } else {
                list = ffel.a;
            }
            return ffdx.ad(list, hfmVar.S());
        } finally {
        }
    }
}
