package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.animation.illustration.IllustrationViewStub;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vfk extends wr implements tvr {
    public final vfc s;
    public final IllustrationViewStub t;
    public boolean u;
    public final TextView v;

    public vfk(vfc vfcVar, View view) {
        super(view);
        this.u = false;
        this.s = vfcVar;
        this.t = (IllustrationViewStub) view.findViewById(R.id.reaction);
        this.v = (TextView) view.findViewById(R.id.reaction_count);
    }

    @Override // defpackage.tvr
    public final tve a() {
        return tve.REACTION_BADGE;
    }

    @Override // defpackage.tvr
    public final void b() {
        IllustrationViewStub illustrationViewStub = this.t;
        View view = illustrationViewStub.e;
        view.getClass();
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        int indexOfChild = viewGroup.indexOfChild(illustrationViewStub.e);
        viewGroup.removeViewInLayout(illustrationViewStub.e);
        ViewGroup.LayoutParams layoutParams = illustrationViewStub.getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(illustrationViewStub, indexOfChild, layoutParams);
        } else {
            viewGroup.addView(illustrationViewStub, indexOfChild);
        }
        illustrationViewStub.e = null;
        this.u = false;
    }
}
