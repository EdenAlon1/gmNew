package defpackage;

import android.graphics.PointF;
import android.util.Property;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ozi extends Property {
    public ozi(Class cls) {
        super(cls, "topLeft");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return null;
    }

    @Override // android.util.Property
    public final /* synthetic */ void set(Object obj, Object obj2) {
        ozp ozpVar = (ozp) obj;
        PointF pointF = (PointF) obj2;
        ozpVar.a = Math.round(pointF.x);
        ozpVar.b = Math.round(pointF.y);
        int i = ozpVar.e + 1;
        ozpVar.e = i;
        if (i == ozpVar.f) {
            ozpVar.a();
        }
    }
}
