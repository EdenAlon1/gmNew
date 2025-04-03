package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qjk extends qje {
    private final qdv j;
    private final qjf k;

    public qjk(qdb qdbVar, qji qjiVar, qjf qjfVar, qci qciVar) {
        super(qdbVar, qjiVar);
        this.k = qjfVar;
        qdv qdvVar = new qdv(qdbVar, this, new qix("__container", qjiVar.a, false), qciVar);
        this.j = qdvVar;
        qdvVar.f(Collections.EMPTY_LIST, Collections.EMPTY_LIST);
    }

    @Override // defpackage.qje, defpackage.qdw
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        super.c(rectF, matrix, z);
        this.j.c(rectF, this.a, z);
    }

    @Override // defpackage.qje
    public final qij i() {
        qij i = super.i();
        return i != null ? i : this.k.i();
    }

    @Override // defpackage.qje
    public final qkd j() {
        qkd j = super.j();
        return j != null ? j : this.k.j();
    }

    @Override // defpackage.qje
    public final void l(Canvas canvas, Matrix matrix, int i) {
        this.j.b(canvas, matrix, i);
    }

    @Override // defpackage.qje
    public final void n(qhq qhqVar, int i, List list, qhq qhqVar2) {
        this.j.e(qhqVar, i, list, qhqVar2);
    }
}
