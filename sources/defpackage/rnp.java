package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rnp extends rnq {
    float a;
    final float b;
    final RectF c = new RectF();
    final /* synthetic */ rns d;

    public rnp(rns rnsVar, float f, float f2) {
        this.d = rnsVar;
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.rnq
    public final void a(String str) {
        if (this.d.i()) {
            Rect rect = new Rect();
            this.d.d.d.getTextBounds(str, 0, str.length(), rect);
            RectF rectF = new RectF(rect);
            rectF.offset(this.a, this.b);
            this.c.union(rectF);
        }
        this.a += this.d.d.d.measureText(str);
    }

    @Override // defpackage.rnq
    public final boolean b(rna rnaVar) {
        if (!(rnaVar instanceof rnb)) {
            return true;
        }
        rnb rnbVar = (rnb) rnaVar;
        rmp a = rnaVar.t.a(rnbVar.a);
        if (a == null) {
            rns.e("TextPath path reference '%s' not found", rnbVar.a);
            return false;
        }
        rlx rlxVar = (rlx) a;
        Path path = new rnk(rlxVar.a).a;
        Matrix matrix = rlxVar.e;
        if (matrix != null) {
            path.transform(matrix);
        }
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.c.union(rectF);
        return false;
    }
}
