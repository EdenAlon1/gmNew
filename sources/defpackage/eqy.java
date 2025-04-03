package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eqy {
    public static final ffcf a;

    static {
        ffel ffelVar = ffel.a;
        a = new ffcf(ffelVar, ffelVar);
    }

    public static final void a(jlm jlmVar, List list, hfd hfdVar, int i) {
        int i2 = i & 6;
        hfd b = hfdVar.b(-1794596951);
        int i3 = i2 == 0 ? (true != b.D(jlmVar) ? 2 : 4) | i : i;
        if ((i & 48) == 0) {
            i3 |= true != b.F(list) ? 16 : 32;
        }
        if (b.J((i3 & 19) != 18, i3 & 1)) {
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                jlk jlkVar = (jlk) list.get(i4);
                ffjn ffjnVar = (ffjn) jlkVar.a;
                int i5 = jlkVar.b;
                int i6 = jlkVar.c;
                eqw eqwVar = eqw.a;
                hve hveVar = hvi.e;
                int a2 = hey.a(b);
                hfm hfmVar = (hfm) b;
                hqb ai = hfmVar.ai();
                hvi b2 = huz.b(b, hveVar);
                int i7 = ist.a;
                ffix ffixVar = iss.a;
                b.x();
                if (hfmVar.z) {
                    b.j(ffixVar);
                } else {
                    b.z();
                }
                hlc.b(b, eqwVar, iss.e);
                hlc.b(b, ai, iss.d);
                ffjm ffjmVar = iss.f;
                if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a2))) {
                    Integer valueOf = Integer.valueOf(a2);
                    hfmVar.ad(valueOf);
                    b.h(valueOf, ffjmVar);
                }
                hlc.b(b, b2, iss.c);
                ffjnVar.a(jlmVar.subSequence(i5, i6).b, b, 0);
                b.n();
            }
        } else {
            b.s();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new eqx(jlmVar, list, i);
        }
    }
}
