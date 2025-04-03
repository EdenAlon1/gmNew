package defpackage;

import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcqz extends wr implements View.OnAttachStateChangeListener {
    private final int A;
    private RecyclerView B;
    private final wc C;
    public final View s;
    public final TextView t;
    public final int u;
    public final int v;
    public int w;
    public final int x;
    public final int y;
    private final int z;

    public dcqz(View view) {
        super(view);
        this.C = new dcqy(this);
        this.s = view;
        view.setClipToOutline(true);
        this.t = (TextView) view.findViewById(R.id.label);
        int d = ehdr.d(view.getContext(), R.attr.colorOnSurfaceInverseLight, "ModeViewHolder");
        this.u = d;
        this.v = ehdr.d(view.getContext(), R.attr.colorOnBackgroundLight, "ModeViewHolder");
        this.z = view.getContext().getColor(R.color.camera_ui_shadow_color);
        this.A = view.getContext().getColor(R.color.camera_ui_shadow_gone_color);
        this.x = ehdr.d(view.getContext(), R.attr.colorBackgroundLight, "ModeViewHolder");
        this.y = ehdr.d(view.getContext(), R.attr.colorSurfaceInverseLight, "ModeViewHolder");
        this.w = d;
    }

    public final void C(int i) {
        ((GradientDrawable) ((LayerDrawable) this.s.getBackground()).getDrawable(0)).setColor(i);
    }

    public final void D(float f) {
        TextView textView = this.t;
        this.t.setShadowLayer(textView.getShadowRadius(), textView.getShadowDx(), textView.getShadowDy(), kps.e(this.z, this.A, f));
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        if (this.s.getParent() != null) {
            RecyclerView recyclerView = (RecyclerView) this.s.getParent();
            this.B = recyclerView;
            recyclerView.z(this.C);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        RecyclerView recyclerView = this.B;
        if (recyclerView != null) {
            recyclerView.ai(this.C);
        }
    }
}
