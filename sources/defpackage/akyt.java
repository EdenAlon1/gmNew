package defpackage;

import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class akyt {
    private final ffbr a;
    public final eole b;
    private final ffbr c;
    private final ffbr d;
    private final ffbr e;
    private final ffbr f;
    private final ffbr g;

    public akyt(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7) {
        eole eoleVar;
        this.e = ffbrVar5;
        ffbrVar4.b();
        this.a = ffbrVar;
        this.c = ffbrVar2;
        this.d = ffbrVar3;
        this.f = ffbrVar6;
        this.g = ffbrVar7;
        if (((ctvs) ffbrVar5.b()).e()) {
            eoleVar = (eole) eoli.a.createBuilder();
            String e = e();
            eoleVar.copyOnWrite();
            eoli eoliVar = (eoli) eoleVar.instance;
            e.getClass();
            eoliVar.b |= 1;
            eoliVar.c = e;
            int f = f();
            eoleVar.copyOnWrite();
            eoli eoliVar2 = (eoli) eoleVar.instance;
            eoliVar2.e = f - 1;
            eoliVar2.b |= 4;
            String d = d();
            eoleVar.copyOnWrite();
            eoli eoliVar3 = (eoli) eoleVar.instance;
            d.getClass();
            eoliVar3.b |= 2;
            eoliVar3.d = d;
            eqwf a = a();
            eoleVar.copyOnWrite();
            eoli eoliVar4 = (eoli) eoleVar.instance;
            eoliVar4.o = a.N;
            eoliVar4.b |= 4096;
            eovw eovwVar = csjc.a;
            eoleVar.copyOnWrite();
            eoli eoliVar5 = (eoli) eoleVar.instance;
            eoliVar5.u = eovwVar.x;
            eoliVar5.b = 262144 | eoliVar5.b;
        } else {
            eoleVar = (eole) eoli.a.createBuilder();
            eoleVar.copyOnWrite();
            eoli eoliVar6 = (eoli) eoleVar.instance;
            eoliVar6.b |= 1;
            eoliVar6.c = "UNKNOWN_SIM_OPERATOR";
            eoleVar.copyOnWrite();
            eoli eoliVar7 = (eoli) eoleVar.instance;
            eoliVar7.e = 0;
            eoliVar7.b |= 4;
            eoleVar.copyOnWrite();
            eoli eoliVar8 = (eoli) eoleVar.instance;
            eoliVar8.b |= 2;
            eoliVar8.d = "UNKNOWN_NETWORK_OPERATOR";
            eovw eovwVar2 = csjc.a;
            eoleVar.copyOnWrite();
            eoli eoliVar9 = (eoli) eoleVar.instance;
            eoliVar9.u = eovwVar2.x;
            eoliVar9.b = 262144 | eoliVar9.b;
        }
        this.b = eoleVar;
    }

    private final eqwf a() {
        if (!((dixf) this.g.b()).a()) {
            return ((ckgv) this.a.b()).a();
        }
        try {
            return ((ckgv) this.a.b()).b(((cosz) ((cort) this.f.b()).f().orElseThrow()).c);
        } catch (coqa | NoSuchElementException unused) {
            return eqwf.BUGLE_LOADING_AVAILABILITY_IN_PROGRESS;
        }
    }

    private final String d() {
        return cuxt.b(((ctwb) this.c.b()).j().q(), "UNKNOWN_NETWORK_OPERATOR");
    }

    private final String e() {
        return cuxt.b(((ctwb) this.c.b()).j().u(), "UNKNOWN_SIM_OPERATOR");
    }

    private final int f() {
        return ((dixf) this.g.b()).a() ? ((cosz) ((cort) this.f.b()).f().orElseThrow()).o ? 2 : 1 : !((dkpp) this.d.b()).t() ? 1 : 2;
    }

    public final eoli b() {
        return (eoli) this.b.build();
    }

    public final void c(int i) {
        ctwi h = ((ctwb) this.c.b()).h(i);
        int[] E = h.E();
        eowp eowpVar = (eowp) eowq.a.createBuilder();
        int i2 = E[0];
        eowpVar.copyOnWrite();
        eowq eowqVar = (eowq) eowpVar.instance;
        eowqVar.b |= 1;
        eowqVar.c = i2;
        int i3 = E[1];
        eowpVar.copyOnWrite();
        eowq eowqVar2 = (eowq) eowpVar.instance;
        eowqVar2.b |= 2;
        eowqVar2.d = i3;
        eowq eowqVar3 = (eowq) eowpVar.build();
        eole eoleVar = this.b;
        eoleVar.copyOnWrite();
        eoli eoliVar = (eoli) eoleVar.instance;
        eoli eoliVar2 = eoli.a;
        eowqVar3.getClass();
        eoliVar.q = eowqVar3;
        eoliVar.b |= 16384;
        String b = cuxt.b(h.u(), e());
        eole eoleVar2 = this.b;
        eoleVar2.copyOnWrite();
        eoli eoliVar3 = (eoli) eoleVar2.instance;
        b.getClass();
        eoliVar3.b |= 1;
        eoliVar3.c = b;
        String b2 = cuxt.b(h.q(), d());
        eole eoleVar3 = this.b;
        eoleVar3.copyOnWrite();
        eoli eoliVar4 = (eoli) eoleVar3.instance;
        b2.getClass();
        eoliVar4.b |= 2;
        eoliVar4.d = b2;
    }
}
