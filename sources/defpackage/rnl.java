package defpackage;

import android.graphics.Path;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rnl extends rnm {
    final /* synthetic */ rns a;
    private final Path e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rnl(rns rnsVar, Path path, float f) {
        super(rnsVar, f, 0.0f);
        this.a = rnsVar;
        this.e = path;
    }

    @Override // defpackage.rnm, defpackage.rnq
    public final void a(String str) {
        if (this.a.i()) {
            rns rnsVar = this.a;
            rno rnoVar = rnsVar.d;
            if (rnoVar.b) {
                rnsVar.a.drawTextOnPath(str, this.e, this.b, this.c, rnoVar.d);
            }
            rns rnsVar2 = this.a;
            rno rnoVar2 = rnsVar2.d;
            if (rnoVar2.c) {
                rnsVar2.a.drawTextOnPath(str, this.e, this.b, this.c, rnoVar2.e);
            }
        }
        this.b += this.a.d.d.measureText(str);
    }
}
