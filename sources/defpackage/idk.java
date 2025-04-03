package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class idk extends hvh implements itu {
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public long i;
    public idh j;
    public boolean k;
    public long l;
    public long m;
    public int n;
    public int o = 3;
    public final ffji A = new idi(this);

    public idk(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, long j, idh idhVar, boolean z, long j2, long j3, int i) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
        this.g = f7;
        this.h = f8;
        this.i = j;
        this.j = idhVar;
        this.k = z;
        this.l = j2;
        this.m = j3;
        this.n = i;
    }

    @Override // defpackage.itu
    public final ipo b(ipq ipqVar, ipl iplVar, long j) {
        ipo ei;
        iqk e = iplVar.e(j);
        ei = ipqVar.ei(e.a, e.b, ffem.a, new idj(e, this));
        return ei;
    }

    @Override // defpackage.hvh
    public final boolean dM() {
        return false;
    }

    @Override // defpackage.itu
    public final /* synthetic */ int e(iny inyVar, inx inxVar, int i) {
        return itt.a(this, inyVar, inxVar, i);
    }

    @Override // defpackage.itu
    public final /* synthetic */ int f(iny inyVar, inx inxVar, int i) {
        return itt.b(this, inyVar, inxVar, i);
    }

    @Override // defpackage.itu
    public final /* synthetic */ int g(iny inyVar, inx inxVar, int i) {
        return itt.c(this, inyVar, inxVar, i);
    }

    @Override // defpackage.itu
    public final /* synthetic */ int h(iny inyVar, inx inxVar, int i) {
        return itt.d(this, inyVar, inxVar, i);
    }

    public final String toString() {
        return "SimpleGraphicsLayerModifier(scaleX=" + this.a + ", scaleY=" + this.b + ", alpha = " + this.c + ", translationX=" + this.d + ", translationY=" + this.e + ", shadowElevation=" + this.f + ", rotationX=0.0, rotationY=0.0, rotationZ=" + this.g + ", cameraDistance=" + this.h + ", transformOrigin=" + ((Object) idr.c(this.i)) + ", shape=" + this.j + ", clip=" + this.k + ", renderEffect=null, ambientShadowColor=" + ((Object) ibw.g(this.l)) + ", spotShadowColor=" + ((Object) ibw.g(this.m)) + ", compositingStrategy=" + ((Object) icc.a(this.n)) + ", blendMode=" + ((Object) ibk.a(this.o)) + ", colorFilter=null)";
    }
}
