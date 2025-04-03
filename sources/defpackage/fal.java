package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class fal implements jvn {
    public fai b;

    @Override // defpackage.jvn
    public /* synthetic */ void b(iam iamVar) {
        throw null;
    }

    @Override // defpackage.jvn
    public /* synthetic */ void c() {
        throw null;
    }

    public abstract void e();

    @Override // defpackage.jvn
    public /* synthetic */ void h(jvu jvuVar, jvj jvjVar, jpg jpgVar, ffji ffjiVar, iam iamVar, iam iamVar2) {
        throw null;
    }

    @Override // defpackage.jvn
    public final void i() {
        jdt a;
        fai faiVar = this.b;
        if (faiVar == null || (a = faiVar.a()) == null) {
            return;
        }
        a.a();
    }

    @Override // defpackage.jvn
    public final void j() {
        jdt a;
        fai faiVar = this.b;
        if (faiVar == null || (a = faiVar.a()) == null) {
            return;
        }
        a.b();
    }

    public final void k(fai faiVar) {
        if (this.b != null) {
            dwv.d("Expected textInputModifierNode to be null");
        }
        this.b = faiVar;
    }

    public final void l(fai faiVar) {
        if (this.b != faiVar) {
            dwv.d("Expected textInputModifierNode to be " + faiVar + " but was " + this.b);
        }
        this.b = null;
    }
}
