package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class rnm extends rnq {
    public float b;
    public float c;
    final /* synthetic */ rns d;

    public rnm(rns rnsVar, float f, float f2) {
        this.d = rnsVar;
        this.b = f;
        this.c = f2;
    }

    @Override // defpackage.rnq
    public void a(String str) {
        if (this.d.i()) {
            rns rnsVar = this.d;
            rno rnoVar = rnsVar.d;
            if (rnoVar.b) {
                rnsVar.a.drawText(str, this.b, this.c, rnoVar.d);
            }
            rns rnsVar2 = this.d;
            rno rnoVar2 = rnsVar2.d;
            if (rnoVar2.c) {
                rnsVar2.a.drawText(str, this.b, this.c, rnoVar2.e);
            }
        }
        this.b += this.d.d.d.measureText(str);
    }
}
