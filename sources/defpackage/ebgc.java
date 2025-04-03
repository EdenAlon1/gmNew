package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ebgc extends ebfz {
    public emxc a;
    public emxc b;
    public ebgw c;
    public emxc d;
    public ebgs e;
    public emxc f;
    public emxc g;
    public ebgr h;
    public ebkq i;
    public Runnable j;
    public byte k;
    public int l;
    private emxc m;
    private emxc n;
    private engw o;
    private emxc p;
    private emxc q;
    private emxc r;
    private boolean s;

    public ebgc() {
        emux emuxVar = emux.a;
        this.a = emuxVar;
        this.m = emuxVar;
        this.n = emuxVar;
        this.b = emuxVar;
        this.d = emuxVar;
        this.f = emuxVar;
        this.g = emuxVar;
        this.p = emuxVar;
        this.q = emuxVar;
        this.r = emuxVar;
    }

    @Override // defpackage.ebfz
    public final ebga a() {
        ebgw ebgwVar;
        ebgs ebgsVar;
        engw engwVar;
        ebgr ebgrVar;
        ebkq ebkqVar;
        Runnable runnable;
        if (this.k == 3 && (ebgwVar = this.c) != null && (ebgsVar = this.e) != null && (engwVar = this.o) != null && (ebgrVar = this.h) != null && this.l != 0 && (ebkqVar = this.i) != null && (runnable = this.j) != null) {
            return new ebgd(this.a, this.m, this.n, this.b, ebgwVar, this.d, ebgsVar, this.f, this.g, engwVar, ebgrVar, this.p, this.q, this.r, ebkqVar, this.s, runnable);
        }
        StringBuilder sb = new StringBuilder();
        if (this.c == null) {
            sb.append(" policyFooterCustomizer");
        }
        if (this.e == null) {
            sb.append(" flavorsFeature");
        }
        if (this.o == null) {
            sb.append(" commonActions");
        }
        if (this.h == null) {
            sb.append(" educationManager");
        }
        if ((this.k & 1) == 0) {
            sb.append(" isExperimental");
        }
        if (this.l == 0) {
            sb.append(" largeScreenDialogAlignment");
        }
        if (this.i == null) {
            sb.append(" materialVersion");
        }
        if ((this.k & 2) == 0) {
            sb.append(" enableQuickProfileSwitching");
        }
        if (this.j == null) {
            sb.append(" onSlowAccountSwitchingRunnable");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.ebfz
    public final void b(engw engwVar) {
        if (engwVar == null) {
            throw new NullPointerException("Null commonActions");
        }
        this.o = engwVar;
    }

    @Override // defpackage.ebfz
    public final void c(boolean z) {
        this.s = z;
        this.k = (byte) (this.k | 2);
    }

    public ebgc(ebga ebgaVar) {
        emux emuxVar = emux.a;
        this.a = emuxVar;
        this.m = emuxVar;
        this.n = emuxVar;
        this.b = emuxVar;
        this.d = emuxVar;
        this.f = emuxVar;
        this.g = emuxVar;
        this.p = emuxVar;
        this.q = emuxVar;
        this.r = emuxVar;
        ebgd ebgdVar = (ebgd) ebgaVar;
        this.a = ebgdVar.a;
        this.m = ebgdVar.b;
        this.n = ebgdVar.c;
        this.b = ebgdVar.d;
        this.c = ebgdVar.e;
        this.d = ebgdVar.f;
        this.e = ebgdVar.g;
        this.f = ebgdVar.h;
        this.g = ebgdVar.i;
        this.o = ebgdVar.j;
        this.h = ebgdVar.k;
        this.p = ebgdVar.l;
        this.q = ebgdVar.m;
        this.r = ebgdVar.n;
        this.l = 1;
        this.i = ebgdVar.o;
        this.s = ebgdVar.p;
        this.j = ebgdVar.q;
        this.k = (byte) 3;
    }
}
