package defpackage;

import android.graphics.PointF;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qew extends qey {
    private final qim e;

    public qew(List list) {
        super(list);
        qim qimVar = (qim) ((qlx) list.get(0)).b;
        int length = qimVar != null ? qimVar.b.length : 0;
        this.e = new qim(new float[length], new int[length]);
    }

    @Override // defpackage.qer
    public final /* bridge */ /* synthetic */ Object f(qlx qlxVar, float f) {
        qim qimVar = (qim) qlxVar.b;
        qim qimVar2 = (qim) qlxVar.c;
        int length = qimVar.b.length;
        int length2 = qimVar2.b.length;
        if (length != length2) {
            throw new IllegalArgumentException(a.x(length2, length, "Cannot interpolate between gradients. Lengths vary (", " vs ", ")"));
        }
        for (int i = 0; i < qimVar.b.length; i++) {
            qim qimVar3 = this.e;
            float f2 = qimVar.a[i];
            float f3 = qimVar2.a[i];
            PointF pointF = qlr.a;
            qimVar3.a[i] = f2 + ((f3 - f2) * f);
            qimVar3.b[i] = qln.a(f, qimVar.b[i], qimVar2.b[i]);
        }
        return this.e;
    }
}
