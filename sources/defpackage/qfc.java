package defpackage;

import android.graphics.PointF;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qfc extends qey {
    private final PointF e;

    public qfc(List list) {
        super(list);
        this.e = new PointF();
    }

    @Override // defpackage.qer
    public final /* synthetic */ Object f(qlx qlxVar, float f) {
        return g(qlxVar, f, f, f);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.qer
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final PointF g(qlx qlxVar, float f, float f2, float f3) {
        Object obj;
        PointF pointF;
        Object obj2 = qlxVar.b;
        if (obj2 == null || (obj = qlxVar.c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF2 = (PointF) obj2;
        PointF pointF3 = (PointF) obj;
        qlz qlzVar = this.d;
        if (qlzVar != null && (pointF = (PointF) qlzVar.b(qlxVar.g, qlxVar.h.floatValue(), pointF2, pointF3, f, c(), this.c)) != null) {
            return pointF;
        }
        this.e.set(pointF2.x + (f2 * (pointF3.x - pointF2.x)), pointF2.y + (f3 * (pointF3.y - pointF2.y)));
        return this.e;
    }
}
