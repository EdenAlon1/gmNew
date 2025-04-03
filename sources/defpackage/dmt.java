package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dmt extends hvh implements epg, its, isu {
    public dqs a;
    public final dsp b;
    public boolean c;
    public dmk d;
    public ioc f;
    public boolean g;
    public boolean h;
    public boolean j;
    public final dmg e = new dmg();
    public long i = 0;

    public dmt(dqs dqsVar, dsp dspVar, boolean z, dmk dmkVar) {
        this.a = dqsVar;
        this.b = dspVar;
        this.c = z;
        this.d = dmkVar;
    }

    private final dmk n() {
        dmk dmkVar = this.d;
        return dmkVar == null ? (dmk) isv.a(this, dmn.a) : dmkVar;
    }

    public final float a(dmk dmkVar) {
        float f;
        Object obj;
        int compare;
        if (kaf.e(this.i, 0L)) {
            return 0.0f;
        }
        hne hneVar = this.e.a;
        int i = hneVar.b - 1;
        Object[] objArr = hneVar.a;
        if (i < objArr.length) {
            obj = null;
            while (true) {
                if (i < 0) {
                    f = 0.0f;
                    break;
                }
                Object invoke = ((dmo) objArr[i]).a.invoke();
                if (invoke != null) {
                    long b = ((iam) invoke).b();
                    long d = kag.d(this.i);
                    f = 0.0f;
                    int ordinal = this.a.ordinal();
                    if (ordinal == 0) {
                        compare = Float.compare(Float.intBitsToFloat((int) (b & 4294967295L)), Float.intBitsToFloat((int) (d & 4294967295L)));
                    } else {
                        if (ordinal != 1) {
                            throw new ffcd();
                        }
                        compare = Float.compare(Float.intBitsToFloat((int) (b >> 32)), Float.intBitsToFloat((int) (d >> 32)));
                    }
                    if (compare <= 0) {
                        obj = invoke;
                    } else if (obj == null) {
                        obj = invoke;
                    }
                }
                i--;
            }
        } else {
            f = 0.0f;
            obj = null;
        }
        if (obj == null) {
            Object f2 = this.g ? f() : null;
            if (f2 == null) {
                return f;
            }
            obj = f2;
        }
        long d2 = kag.d(this.i);
        int ordinal2 = this.a.ordinal();
        if (ordinal2 == 0) {
            iam iamVar = (iam) obj;
            float f3 = iamVar.c;
            return dmkVar.a(f3, iamVar.e - f3, Float.intBitsToFloat((int) (d2 & 4294967295L)));
        }
        if (ordinal2 != 1) {
            throw new ffcd();
        }
        iam iamVar2 = (iam) obj;
        float f4 = iamVar2.b;
        return dmkVar.a(f4, iamVar2.d - f4, Float.intBitsToFloat((int) (d2 >> 32)));
    }

    public final long b(iam iamVar, long j) {
        long floatToRawIntBits;
        long j2;
        long d = kag.d(j);
        int ordinal = this.a.ordinal();
        if (ordinal == 0) {
            dmk n = n();
            float f = iamVar.c;
            float a = n.a(f, iamVar.e - f, Float.intBitsToFloat((int) (d & 4294967295L)));
            long floatToRawIntBits2 = Float.floatToRawIntBits(0.0f);
            floatToRawIntBits = Float.floatToRawIntBits(a);
            j2 = floatToRawIntBits2 << 32;
        } else {
            if (ordinal != 1) {
                throw new ffcd();
            }
            dmk n2 = n();
            float f2 = iamVar.b;
            long floatToRawIntBits3 = Float.floatToRawIntBits(n2.a(f2, iamVar.d - f2, Float.intBitsToFloat((int) (d >> 32))));
            floatToRawIntBits = Float.floatToRawIntBits(0.0f);
            j2 = floatToRawIntBits3 << 32;
        }
        return j2 | (floatToRawIntBits & 4294967295L);
    }

    @Override // defpackage.hvh
    public final boolean dM() {
        return false;
    }

    public final iam f() {
        if (this.z) {
            ioc b = isx.b(this);
            ioc iocVar = this.f;
            if (iocVar != null) {
                if (true != iocVar.t()) {
                    iocVar = null;
                }
                if (iocVar != null) {
                    return b.n(iocVar, false);
                }
            }
        }
        return null;
    }

    public final void g() {
        dmk n = n();
        if (this.j) {
            dwv.d("launchAnimation called when previous animation was running");
        }
        int i = dmk.a;
        ffqy.d(D(), null, ffsm.d, new dms(this, new dva(dmj.a), n, null), 1);
    }

    @Override // defpackage.its
    public final void i(long j) {
        int a;
        iam f;
        long j2 = this.i;
        this.i = j;
        int ordinal = this.a.ordinal();
        if (ordinal == 0) {
            a = ffkj.a((int) (j & 4294967295L), (int) (4294967295L & j2));
        } else {
            if (ordinal != 1) {
                throw new ffcd();
            }
            a = ffkj.a((int) (j >> 32), (int) (j2 >> 32));
        }
        if (a >= 0 || this.j || this.g || (f = f()) == null || !j(f, j2)) {
            return;
        }
        this.h = true;
    }

    public final boolean j(iam iamVar, long j) {
        long b = b(iamVar, j);
        return Math.abs(Float.intBitsToFloat((int) (b >> 32))) <= 0.5f && Math.abs(Float.intBitsToFloat((int) (b & 4294967295L))) <= 0.5f;
    }

    @Override // defpackage.its
    public final /* synthetic */ void dY(ioc iocVar) {
    }
}
