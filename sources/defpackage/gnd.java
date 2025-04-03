package defpackage;

import android.view.KeyEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gnd extends ffkk implements ffji {
    final /* synthetic */ boolean a;
    final /* synthetic */ ffji b;
    final /* synthetic */ boolean c;
    final /* synthetic */ float d;
    final /* synthetic */ ffix e;
    final /* synthetic */ ffmf f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gnd(boolean z, ffji ffjiVar, ffmf ffmfVar, boolean z2, float f, ffix ffixVar) {
        super(1);
        this.a = z;
        this.b = ffjiVar;
        this.f = ffmfVar;
        this.c = z2;
        this.d = f;
        this.e = ffixVar;
    }

    @Override // defpackage.ffji
    public final /* synthetic */ Object invoke(Object obj) {
        KeyEvent keyEvent = ((iix) obj).a;
        boolean z = false;
        if (!this.a || this.b == null) {
            return false;
        }
        int a = iiz.a(keyEvent);
        if (!iiy.a(a, 2)) {
            if (iiy.a(a, 1)) {
                long b = iiz.b(keyEvent);
                if (iiw.a(b, iiw.d) || iiw.a(b, iiw.e) || iiw.a(b, iiw.g) || iiw.a(b, iiw.f) || iiw.a(b, iiw.p) || iiw.a(b, iiw.q) || iiw.a(b, iiw.r) || iiw.a(b, iiw.s)) {
                    ffix ffixVar = this.e;
                    if (ffixVar != null) {
                        ffixVar.invoke();
                    }
                    z = true;
                }
            }
            return Boolean.valueOf(z);
        }
        float abs = Math.abs(((Number) this.f.b()).floatValue() - ((Number) this.f.c()).floatValue()) / 100.0f;
        int i = true != this.c ? 1 : -1;
        long b2 = iiz.b(keyEvent);
        if (iiw.a(b2, iiw.d)) {
            this.b.invoke(ffmk.s(Float.valueOf(this.d + (i * abs)), this.f));
        } else if (iiw.a(b2, iiw.e)) {
            this.b.invoke(ffmk.s(Float.valueOf(this.d - (i * abs)), this.f));
        } else if (iiw.a(b2, iiw.g)) {
            this.b.invoke(ffmk.s(Float.valueOf(this.d + (i * abs)), this.f));
        } else if (iiw.a(b2, iiw.f)) {
            this.b.invoke(ffmk.s(Float.valueOf(this.d - (i * abs)), this.f));
        } else if (iiw.a(b2, iiw.p)) {
            this.b.invoke(this.f.c());
        } else if (iiw.a(b2, iiw.q)) {
            this.b.invoke(this.f.b());
        } else {
            if (!iiw.a(b2, iiw.r)) {
                if (iiw.a(b2, iiw.s)) {
                    this.b.invoke(ffmk.s(Float.valueOf(this.d + (ffmk.i(10, 1, 10) * abs)), this.f));
                }
                return Boolean.valueOf(z);
            }
            this.b.invoke(ffmk.s(Float.valueOf(this.d - (ffmk.i(10, 1, 10) * abs)), this.f));
        }
        z = true;
        return Boolean.valueOf(z);
    }
}
