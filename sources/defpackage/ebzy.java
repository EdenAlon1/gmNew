package defpackage;

import android.content.res.ColorStateList;
import android.util.Property;
import android.view.View;
import com.google.android.libraries.onegoogle.popovercontainer.ExpandableDialogView;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ebzy extends Property {
    public ebzy(Class cls) {
        super(cls, "elevationProgress");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return Float.valueOf(((ExpandableDialogView) obj).g);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        ExpandableDialogView expandableDialogView = (ExpandableDialogView) obj;
        float floatValue = ((Float) obj2).floatValue();
        expandableDialogView.g = floatValue;
        float f = floatValue * expandableDialogView.f;
        expandableDialogView.e.N(f);
        expandableDialogView.e.O(ColorStateList.valueOf(expandableDialogView.c(f)));
        View view = expandableDialogView.d;
        int[] iArr = kvo.a;
        kvd.j(view, f);
        expandableDialogView.invalidate();
    }
}
