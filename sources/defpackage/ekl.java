package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ekl {
    public cxv a;

    public ekl() {
        dbv dbvVar = dcp.a;
        Float valueOf = Float.valueOf(0.0f);
        this.a = cxw.c(dbvVar, valueOf, valueOf);
    }

    public final float a() {
        return ((Number) this.a.a()).floatValue();
    }

    public final void b(float f, jzn jznVar, ffsk ffskVar) {
        if (f <= jznVar.em(1.0f)) {
            return;
        }
        hrw a = hrv.a();
        ffji k = a != null ? a.k() : null;
        hrw b = hrv.b(a);
        try {
            float floatValue = ((Number) this.a.a()).floatValue();
            cxv cxvVar = this.a;
            if (cxvVar.e) {
                this.a = cxw.d(cxvVar, floatValue - f, 0.0f, 30);
                ffqy.d(ffskVar, null, null, new ekj(this, null), 3);
            } else {
                this.a = new cxv(dcp.a, Float.valueOf(-f), null, 60);
                ffqy.d(ffskVar, null, null, new ekk(this, null), 3);
            }
        } finally {
            hrv.e(a, b, k);
        }
    }
}
