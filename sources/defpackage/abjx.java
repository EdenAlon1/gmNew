package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abjx implements abjs, abjp {
    public final comc a;
    public boolean b;
    public ffud c;
    public final fgcm d;
    private final ffhd e;
    private final ffsk f;
    private final cfup g;
    private final cfup h;
    private final fgcm i;
    private final fgcm j;
    private final fgcm k;

    public abjx(ffhd ffhdVar, ffsk ffskVar, ffbr ffbrVar) {
        ffhdVar.getClass();
        ffskVar.getClass();
        ffbrVar.getClass();
        this.e = ffhdVar;
        this.f = ffskVar;
        cfup j = cfvl.j(cfvl.b, "conversation_2_min_pinch_to_zoom_scale", 1.0f);
        this.g = j;
        this.h = cfvl.j(cfvl.b, "conversation_2_max_pinch_to_zoom_scale", 1.6f);
        fgcm a = fgdm.a(false);
        this.i = a;
        fgcm a2 = fgdm.a(j.e());
        this.d = a2;
        comy comyVar = (comy) ffbrVar.b();
        comu c = comv.c();
        c.d(comb.CONVERSATION_SCALE);
        c.f(cymp.a);
        this.a = comyVar.a(c.a());
        axol.k(ffskVar, ffhdVar, new abju(this, null), 2);
        this.j = a;
        this.k = a2;
    }

    @Override // defpackage.abjp
    public final /* synthetic */ fgdj a() {
        return this.j;
    }

    @Override // defpackage.abjp
    public final void b(boolean z) {
        if (this.b) {
            this.j.f(Boolean.valueOf(z));
        }
    }

    @Override // defpackage.abjs
    public final /* synthetic */ fgdj c() {
        return this.k;
    }

    @Override // defpackage.abjs
    public final void d(float f) {
        if (this.b) {
            float floatValue = ((Number) this.d.c()).floatValue() * f;
            Object e = this.g.e();
            e.getClass();
            float floatValue2 = ((Number) e).floatValue();
            Object e2 = this.h.e();
            e2.getClass();
            float e3 = ffmk.e(floatValue, floatValue2, ((Number) e2).floatValue());
            Float f2 = (Float) this.d.c();
            if (f2 == null || e3 != f2.floatValue()) {
                this.d.f(Float.valueOf(e3));
                ffud ffudVar = this.c;
                if (ffudVar != null) {
                    ffudVar.t(null);
                }
                this.c = axol.k(this.f, null, new abjw(this, e3, null), 3);
            }
        }
    }
}
