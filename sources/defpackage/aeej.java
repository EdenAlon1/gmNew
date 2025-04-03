package defpackage;

import android.support.v7.widget.RecyclerView;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aeej extends wc {
    final /* synthetic */ aeek a;

    public aeej(aeek aeekVar) {
        this.a = aeekVar;
    }

    @Override // defpackage.wc
    public final void a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.computeVerticalScrollOffset() == 0 || i2 < -10) {
            if (this.a.j.b()) {
                aedw aedwVar = (aedw) this.a.c.b();
                if (((Boolean) aedwVar.a.c()).booleanValue()) {
                    return;
                }
                aedwVar.a.f(true);
                return;
            }
            ExtendedFloatingActionButton extendedFloatingActionButton = this.a.g;
            if (extendedFloatingActionButton != null) {
                extendedFloatingActionButton.t(3);
                return;
            }
            return;
        }
        if (i2 > 10) {
            if (this.a.j.b()) {
                aedw aedwVar2 = (aedw) this.a.c.b();
                if (((Boolean) aedwVar2.a.c()).booleanValue()) {
                    aedwVar2.a.f(false);
                    return;
                }
                return;
            }
            ExtendedFloatingActionButton extendedFloatingActionButton2 = this.a.g;
            if (extendedFloatingActionButton2 != null) {
                extendedFloatingActionButton2.q();
            }
        }
    }
}
