package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class pcf extends pce {
    protected kpv[] m;
    String n;
    int o;
    int p;

    public pcf() {
        this.m = null;
        this.o = 0;
    }

    public boolean a() {
        return false;
    }

    public kpv[] getPathData() {
        return this.m;
    }

    public String getPathName() {
        return this.n;
    }

    public void setPathData(kpv[] kpvVarArr) {
        int i;
        kpv[] kpvVarArr2 = this.m;
        if (kpvVarArr2 != null && kpvVarArr != null) {
            if (kpvVarArr2.length == kpvVarArr.length) {
                for (0; i < kpvVarArr2.length; i + 1) {
                    kpv kpvVar = kpvVarArr2[i];
                    char c = kpvVar.a;
                    kpv kpvVar2 = kpvVarArr[i];
                    i = (c == kpvVar2.a && kpvVar.b.length == kpvVar2.b.length) ? i + 1 : 0;
                }
                kpv[] kpvVarArr3 = this.m;
                for (int i2 = 0; i2 < kpvVarArr.length; i2++) {
                    kpvVarArr3[i2].a = kpvVarArr[i2].a;
                    int i3 = 0;
                    while (true) {
                        float[] fArr = kpvVarArr[i2].b;
                        if (i3 < fArr.length) {
                            kpvVarArr3[i2].b[i3] = fArr[i3];
                            i3++;
                        }
                    }
                }
                return;
            }
        }
        this.m = kpw.c(kpvVarArr);
    }

    public pcf(pcf pcfVar) {
        this.m = null;
        this.o = 0;
        this.n = pcfVar.n;
        int i = pcfVar.p;
        this.p = 0;
        this.m = kpw.c(pcfVar.m);
    }
}
