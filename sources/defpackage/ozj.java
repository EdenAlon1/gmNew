package defpackage;

import android.graphics.PointF;
import android.util.Property;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ozj extends Property {
    public ozj(Class cls) {
        super(cls, "bottomRight");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return null;
    }

    @Override // android.util.Property
    public final /* synthetic */ void set(Object obj, Object obj2) {
        ozp ozpVar = (ozp) obj;
        PointF pointF = (PointF) obj2;
        ozpVar.c = Math.round(pointF.x);
        ozpVar.d = Math.round(pointF.y);
        int i = ozpVar.f + 1;
        ozpVar.f = i;
        if (ozpVar.e == i) {
            ozpVar.a();
        }
    }
}
