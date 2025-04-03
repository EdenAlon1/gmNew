package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cyv implements cys {
    private final float a;
    private final float b;
    private final float c;
    private final dab d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public cyv() {
        /*
            r2 = this;
            r0 = 0
            r1 = 7
            r2.<init>(r0, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cyv.<init>():void");
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ dcr a(dbv dbvVar) {
        dcr f;
        f = f();
        return f;
    }

    @Override // defpackage.cys
    public final float b(float f, float f2, float f3) {
        return 0.0f;
    }

    @Override // defpackage.cys
    public final float c(long j, float f, float f2, float f3) {
        dab dabVar = this.d;
        dabVar.a = f2;
        return Float.intBitsToFloat((int) (dabVar.b(f, f3, j / 1000000) >> 32));
    }

    @Override // defpackage.cys
    public final float d(long j, float f, float f2, float f3) {
        dab dabVar = this.d;
        dabVar.a = f2;
        return Float.intBitsToFloat((int) (dabVar.b(f, f3, j / 1000000) & 4294967295L));
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0128  */
    @Override // defpackage.cys
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long e(float r37, float r38, float r39) {
        /*
            Method dump skipped, instructions count: 576
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cyv.e(float, float, float):long");
    }

    @Override // defpackage.cys
    public final /* synthetic */ dcy f() {
        return new dcy(this);
    }

    public cyv(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        dab dabVar = new dab();
        if (f < 0.0f) {
            czx.a("Damping ratio must be non-negative");
        }
        dabVar.c = f;
        if (dabVar.a() <= 0.0f) {
            czx.a("Spring stiffness constant must be positive.");
        }
        dabVar.b = Math.sqrt(f2);
        this.d = dabVar;
    }

    public /* synthetic */ cyv(float f, float f2, int i) {
        this(1 == (i & 1) ? 1.0f : f, (i & 2) != 0 ? 1500.0f : f2, 0.01f);
    }
}
