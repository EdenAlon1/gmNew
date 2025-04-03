package defpackage;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vfg implements tux {
    private final cmrl a;
    private final int b;

    public vfg(cmrl cmrlVar, int i) {
        cmrlVar.getClass();
        this.a = cmrlVar;
        this.b = i;
    }

    @Override // defpackage.tux
    public final tve a() {
        return tve.REACTION_BADGE;
    }

    @Override // defpackage.tux
    public final /* bridge */ /* synthetic */ void b(wr wrVar) {
        vfk vfkVar = (vfk) wrVar;
        vfkVar.getClass();
        cmrv b = cmrv.b(this.a.e);
        if (b == null) {
            b = cmrv.UNRECOGNIZED;
        }
        int i = this.b;
        Resources resources = vfkVar.a.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.reaction_badge_container_height);
        if (i <= 1) {
            vfkVar.a.setLayoutParams(new ViewGroup.LayoutParams(resources.getDimensionPixelSize(R.dimen.reaction_badge_width), dimensionPixelSize));
        } else {
            vfkVar.a.setLayoutParams(new ViewGroup.LayoutParams(resources.getDimensionPixelSize(R.dimen.reaction_badge_with_count_width), dimensionPixelSize));
        }
        TextView textView = vfkVar.v;
        if (textView != null) {
            if (i <= 1) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
                TextView textView2 = vfkVar.v;
                textView2.setText(String.format(ctid.c(textView2.getContext().getApplicationContext()), "%d", Integer.valueOf(i)));
            }
        }
        if (vfkVar.u) {
            return;
        }
        View view = vfkVar.a;
        Resources resources2 = view.getResources();
        view.setContentDescription(resources2.getQuantityString(R.plurals.reaction_badge_content_description, i, Integer.valueOf(i), vfe.a(resources2, b)));
        vfkVar.s.a(vfkVar.t, b).addOnAttachStateChangeListener(new vfj());
        vfkVar.u = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vfg)) {
            return false;
        }
        vfg vfgVar = (vfg) obj;
        return ffkj.e(this.a, vfgVar.a) && this.b == vfgVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return "ReactionBadgeData(reaction=" + this.a + ", instanceCount=" + this.b + ")";
    }
}
