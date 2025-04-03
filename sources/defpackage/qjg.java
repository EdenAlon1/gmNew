package defpackage;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qjg extends qje {
    private final Paint j;
    private final Rect k;
    private final Rect l;
    private final qdc m;
    private qer n;
    private qer o;

    public qjg(qdb qdbVar, qji qjiVar) {
        super(qdbVar, qjiVar);
        this.j = new qdq(3);
        this.k = new Rect();
        this.l = new Rect();
        String str = qjiVar.f;
        qci qciVar = qdbVar.a;
        this.m = qciVar == null ? null : (qdc) qciVar.c.get(str);
    }

    @Override // defpackage.qje, defpackage.qhr
    public final void a(Object obj, qlz qlzVar) {
        super.a(obj, qlzVar);
        if (obj == qdg.K) {
            if (qlzVar == null) {
                this.n = null;
                return;
            } else {
                this.n = new qfj(qlzVar);
                return;
            }
        }
        if (obj == qdg.N) {
            if (qlzVar == null) {
                this.o = null;
            } else {
                this.o = new qfj(qlzVar);
            }
        }
    }

    @Override // defpackage.qje, defpackage.qdw
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        super.c(rectF, matrix, z);
        qdc qdcVar = this.m;
        if (qdcVar != null) {
            float f = qdcVar.a;
            float a = qlw.a();
            rectF.set(0.0f, 0.0f, f * a, qdcVar.b * a);
            this.a.mapRect(rectF);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0107  */
    @Override // defpackage.qje
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(android.graphics.Canvas r11, android.graphics.Matrix r12, int r13) {
        /*
            Method dump skipped, instructions count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qjg.l(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }
}
