package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.car.app.model.Alert;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eirf extends vk {
    public View a;
    private final vk d;
    private final vm e;

    public eirf(vk vkVar) {
        eire eireVar = new eire(this);
        this.e = eireVar;
        this.d = vkVar;
        vkVar.A(eireVar);
        B(vkVar.b);
    }

    @Override // defpackage.vk
    public final int a() {
        int a = this.d.a();
        return this.a != null ? a + 1 : a;
    }

    @Override // defpackage.vk
    public final int dE(int i) {
        if (this.a != null) {
            i--;
        }
        return i < 0 ? Alert.DURATION_SHOW_INDEFINITELY : this.d.dE(i);
    }

    @Override // defpackage.vk
    public final wr e(ViewGroup viewGroup, int i) {
        if (i != Integer.MAX_VALUE) {
            return this.d.e(viewGroup, i);
        }
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        return new eirg(frameLayout);
    }

    @Override // defpackage.vk
    public final void g(wr wrVar, int i) {
        View view = this.a;
        if (view != null) {
            i--;
        }
        if (!(wrVar instanceof eirg)) {
            this.d.g(wrVar, i);
        } else {
            if (view == null) {
                throw new IllegalStateException("HeaderViewHolder cannot find mHeader");
            }
            if (view.getParent() != null) {
                ((ViewGroup) this.a.getParent()).removeView(this.a);
            }
            ((FrameLayout) wrVar.a).addView(this.a);
        }
    }

    @Override // defpackage.vk
    public final long hb(int i) {
        if (this.a != null) {
            i--;
        }
        if (i < 0) {
            return Long.MAX_VALUE;
        }
        return this.d.hb(i);
    }
}
