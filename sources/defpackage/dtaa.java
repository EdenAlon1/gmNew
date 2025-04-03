package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dtaa extends dslv implements dsyk {
    static final /* synthetic */ ffmx[] aS;
    public boolean aT;
    public dsxk aU;
    public int aV;
    protected dsxd aW;
    private final ffls sL;
    private dsyj sM;

    static {
        ffko ffkoVar = new ffko(dtaa.class, "colors", "getColors()Lcom/google/android/libraries/compose/ui/composable/theme/HugoColors;", 0);
        int i = fflc.a;
        aS = new ffmx[]{ffkoVar};
    }

    public dtaa() {
        this((Integer) null, 3);
    }

    public static final void bO(dsyj dsyjVar, int i) {
        boolean h = dsyjVar.h();
        dsyjVar.f(i);
        if (h) {
            dsyjVar.k(false);
        }
    }

    public static /* synthetic */ void bP(dtaa dtaaVar) {
        dsyj gR = dtaaVar.gR();
        if (gR != null) {
            gR.k(true);
        }
    }

    public final dsxk bK() {
        dsxk dsxkVar = this.aU;
        if (dsxkVar != null) {
            return dsxkVar;
        }
        ffkj.c("renderingStrategy");
        return null;
    }

    public final void bL(dsyj dsyjVar) {
        int i = this.aV;
        if (i != 0) {
            bO(dsyjVar, i);
            this.aV = 0;
        }
    }

    public final void bM(dsjz dsjzVar) {
        this.sL.d(aS[0], dsjzVar);
    }

    public final dsxd bN() {
        dsxd dsxdVar = this.aW;
        if (dsxdVar != null) {
            return dsxdVar;
        }
        ffkj.c("renderingStateHandler");
        return null;
    }

    public final void bQ() {
        this.aT = true;
        dsjz dsjzVar = (dsjz) this.sL.c(aS[0]);
        if (dsjzVar != null) {
            aZ(dsjzVar);
        }
    }

    public dsyj gR() {
        dsyj dsyjVar = this.sM;
        if (dsyjVar == null) {
            dsyjVar = s();
            if (dsyjVar != null) {
                bL(dsyjVar);
            }
            this.sM = dsyjVar;
        }
        return dsyjVar;
    }

    public void gS(dsxi dsxiVar) {
        dsxiVar.getClass();
    }

    public void gT() {
        bP(this);
    }

    public void gU(dsxk dsxkVar, dsxd dsxdVar) {
        dsxkVar.getClass();
        dsxdVar.getClass();
        this.aU = dsxkVar;
        this.aW = dsxdVar;
        bM(dsxkVar.k);
    }

    @Override // defpackage.ea
    public void l() {
        super.l();
        gR();
    }

    public abstract dszr t();

    public dtaa(Integer num) {
        this(num, 2);
    }

    public dtaa(Integer num, dtab dtabVar) {
        super(num, dtabVar);
        this.sL = new dszz(this);
    }

    public /* synthetic */ dtaa(Integer num, int i) {
        this(1 == (i & 1) ? null : num, (dtab) null);
    }

    public void bd() {
    }

    public void be() {
    }

    protected void aZ(dsjz dsjzVar) {
    }
}
