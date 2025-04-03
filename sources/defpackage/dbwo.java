package defpackage;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import com.google.android.apps.messaging.ui.generic.spannedautocomplete.SpannedAutoCompleteList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbwo extends Animation {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ SpannedAutoCompleteList c;

    public dbwo(SpannedAutoCompleteList spannedAutoCompleteList, int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = spannedAutoCompleteList;
    }

    @Override // android.view.animation.Animation
    protected final void applyTransformation(float f, Transformation transformation) {
        this.c.a.getLayoutParams().height = this.a + ((int) (this.b * f));
        this.c.a.requestLayout();
    }

    @Override // android.view.animation.Animation
    public final boolean willChangeBounds() {
        return true;
    }
}
