package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehoz extends ehpf {
    final /* synthetic */ List a;
    final /* synthetic */ Matrix b;

    public ehoz(List list, Matrix matrix) {
        this.a = list;
        this.b = matrix;
    }

    @Override // defpackage.ehpf
    public final void a(Matrix matrix, ehod ehodVar, int i, Canvas canvas) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ehpf) it.next()).a(this.b, ehodVar, i, canvas);
        }
    }
}
