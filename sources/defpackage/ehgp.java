package defpackage;

import android.util.Property;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehgp extends Property {
    public ehgp(Class cls) {
        super(cls, "paddingStart");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return Float.valueOf(((View) obj).getPaddingStart());
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        View view = (View) obj;
        view.setPaddingRelative(((Float) obj2).intValue(), view.getPaddingTop(), view.getPaddingEnd(), view.getPaddingBottom());
    }
}
