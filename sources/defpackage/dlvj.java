package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlvj implements dlvq {
    public final boolean a;
    public final long b;
    public final ffix c;
    public final dlvo d;
    public final ffix e;
    public final dnwi f;
    public final dmae g;
    private final String h;
    private final dlvp i;
    private final dowd j;
    private final boolean k;
    private final boolean l;
    private final boolean m;
    private final dlvg n;

    public /* synthetic */ dlvj(String str, dlvp dlvpVar, dowd dowdVar, boolean z, boolean z2, boolean z3, boolean z4, long j, ffix ffixVar, dlvo dlvoVar, ffix ffixVar2, dnwi dnwiVar, dmae dmaeVar, dlvg dlvgVar, int i) {
        ffix ffixVar3 = (i & 256) != 0 ? new ffix() { // from class: dlvi
            @Override // defpackage.ffix
            public final Object invoke() {
                return ffcu.a;
            }
        } : ffixVar;
        ffix ffixVar4 = (i & 1024) != 0 ? null : ffixVar2;
        dnwi dnwiVar2 = (i & 2048) != 0 ? null : dnwiVar;
        dmae dmaeVar2 = (i & 4096) != 0 ? null : dmaeVar;
        dlvg dlvgVar2 = (i & 8192) != 0 ? new dlvg(false, false) : dlvgVar;
        int i2 = i & 16;
        int i3 = i & 8;
        int i4 = i & 4;
        int i5 = i & 2;
        boolean z5 = ((i & 32) == 0) & z3;
        boolean z6 = (i2 == 0) & z2;
        boolean z7 = (i3 == 0) & z;
        dowd dowdVar2 = i4 != 0 ? null : dowdVar;
        dlvpVar = i5 != 0 ? null : dlvpVar;
        ffixVar3.getClass();
        dlvgVar2.getClass();
        this.h = str;
        this.i = dlvpVar;
        this.j = dowdVar2;
        this.k = z7;
        this.l = z6;
        this.m = z5;
        this.a = z4;
        this.b = j;
        this.c = ffixVar3;
        this.d = dlvoVar;
        this.e = ffixVar4;
        this.f = dnwiVar2;
        this.g = dmaeVar2;
        this.n = dlvgVar2;
    }

    @Override // defpackage.dlvq
    public final dlvg a() {
        return this.n;
    }

    @Override // defpackage.dlvq
    public final dlvp b() {
        return this.i;
    }

    @Override // defpackage.dlvq
    public final dnwi c() {
        return this.f;
    }

    @Override // defpackage.dlvq
    public final dowd d() {
        return this.j;
    }

    @Override // defpackage.dlwk
    public final String e() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlvj)) {
            return false;
        }
        dlvj dlvjVar = (dlvj) obj;
        return ffkj.e(this.h, dlvjVar.h) && ffkj.e(this.i, dlvjVar.i) && ffkj.e(this.j, dlvjVar.j) && this.k == dlvjVar.k && this.l == dlvjVar.l && this.m == dlvjVar.m && this.a == dlvjVar.a && this.b == dlvjVar.b && ffkj.e(this.c, dlvjVar.c) && ffkj.e(this.d, dlvjVar.d) && ffkj.e(this.e, dlvjVar.e) && ffkj.e(this.f, dlvjVar.f) && ffkj.e(this.g, dlvjVar.g) && ffkj.e(this.n, dlvjVar.n);
    }

    @Override // defpackage.dlvq
    public final boolean f() {
        return this.m;
    }

    @Override // defpackage.dlvq
    public final boolean g() {
        return this.k;
    }

    @Override // defpackage.dlvq
    public final boolean h() {
        return this.l;
    }

    public final int hashCode() {
        int hashCode = this.h.hashCode() * 31;
        dlvp dlvpVar = this.i;
        int hashCode2 = (hashCode + (dlvpVar == null ? 0 : dlvpVar.hashCode())) * 31;
        dowd dowdVar = this.j;
        int hashCode3 = (((((((((hashCode2 + (dowdVar == null ? 0 : dowdVar.hashCode())) * 31) + dlvh.a(this.k)) * 31) + dlvh.a(this.l)) * 31) + dlvh.a(this.m)) * 31) + dlvh.a(this.a)) * 31;
        long j = this.b;
        int hashCode4 = (((((hashCode3 + ((int) (j ^ (j >>> 32)))) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31;
        ffix ffixVar = this.e;
        int hashCode5 = (hashCode4 + (ffixVar == null ? 0 : ffixVar.hashCode())) * 31;
        dnwi dnwiVar = this.f;
        int hashCode6 = (hashCode5 + (dnwiVar == null ? 0 : dnwiVar.hashCode())) * 31;
        dmae dmaeVar = this.g;
        return ((hashCode6 + (dmaeVar != null ? dmaeVar.hashCode() : 0)) * 31) + this.n.hashCode();
    }

    public final String toString() {
        return "Loaded(contentDescription=" + this.h + ", transcript=" + this.i + ", voiceMood=" + this.j + ", isOutgoing=" + this.k + ", isRichType=" + this.l + ", isHighlighted=" + this.m + ", isPlaying=" + this.a + ", displayedTimeInMillis=" + this.b + ", onPlayButtonClick=" + this.c + ", seekbarUiData=" + this.d + ", onDispose=" + this.e + ", statusUiData=" + this.f + ", waveformUiData=" + this.g + ", flags=" + this.n + ")";
    }
}
