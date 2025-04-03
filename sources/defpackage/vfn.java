package defpackage;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vfn implements tux {
    private final cmrl a;
    private final int b;

    public vfn(cmrl cmrlVar, int i) {
        cmrlVar.getClass();
        this.a = cmrlVar;
        this.b = i;
    }

    @Override // defpackage.tux
    public final tve a() {
        return tve.CUSTOM_REACTION_BADGE;
    }

    @Override // defpackage.tux
    public final /* bridge */ /* synthetic */ void b(wr wrVar) {
        vfo vfoVar = (vfo) wrVar;
        vfoVar.getClass();
        Resources resources = vfoVar.a.getResources();
        resources.getClass();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.reaction_badge_container_height);
        int i = this.b;
        if (i <= 1) {
            vfoVar.a.setLayoutParams(new ViewGroup.LayoutParams(resources.getDimensionPixelSize(R.dimen.reaction_badge_width), dimensionPixelSize));
        } else {
            vfoVar.a.setLayoutParams(new ViewGroup.LayoutParams(resources.getDimensionPixelSize(R.dimen.reaction_badge_with_count_width), dimensionPixelSize));
        }
        if (i <= 1) {
            vfoVar.t.setVisibility(8);
        } else {
            vfoVar.t.setVisibility(0);
            TextView textView = vfoVar.t;
            String format = String.format(ctid.c(textView.getContext().getApplicationContext()), "%d", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
            format.getClass();
            textView.setText(format);
        }
        cmrl cmrlVar = this.a;
        View view = vfoVar.a;
        view.setContentDescription(view.getResources().getQuantityString(R.plurals.reaction_badge_content_description, i, Integer.valueOf(i), cmrlVar.d));
        vfoVar.s.setText(cmrlVar.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vfn)) {
            return false;
        }
        vfn vfnVar = (vfn) obj;
        return ffkj.e(this.a, vfnVar.a) && this.b == vfnVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return "CustomReactionBadgeData(reaction=" + this.a + ", instanceCount=" + this.b + ")";
    }
}
