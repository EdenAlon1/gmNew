package defpackage;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.Property;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehge extends Property {
    final /* synthetic */ ehgf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ehge(ehgf ehgfVar, Class cls) {
        super(cls, "LABEL_OPACITY_PROPERTY");
        this.a = ehgfVar;
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) obj;
        int alpha = Color.alpha(extendedFloatingActionButton.t.getColorForState(extendedFloatingActionButton.getDrawableState(), this.a.a.t.getDefaultColor()));
        float alpha2 = Color.alpha(extendedFloatingActionButton.getCurrentTextColor());
        TimeInterpolator timeInterpolator = egyv.a;
        return Float.valueOf(((alpha2 / 255.0f) / alpha) + 0.0f);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) obj;
        Float f = (Float) obj2;
        int colorForState = extendedFloatingActionButton.t.getColorForState(extendedFloatingActionButton.getDrawableState(), this.a.a.t.getDefaultColor());
        float alpha = Color.alpha(colorForState);
        float floatValue = f.floatValue();
        TimeInterpolator timeInterpolator = egyv.a;
        ColorStateList valueOf = ColorStateList.valueOf(Color.argb((int) (((floatValue * ((alpha / 255.0f) + 0.0f)) + 0.0f) * 255.0f), Color.red(colorForState), Color.green(colorForState), Color.blue(colorForState)));
        if (f.floatValue() == 1.0f) {
            extendedFloatingActionButton.r(extendedFloatingActionButton.t);
        } else {
            extendedFloatingActionButton.r(valueOf);
        }
    }
}
