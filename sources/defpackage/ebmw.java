package defpackage;

import android.support.v7.widget.RecyclerView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ebmw extends vm {
    final /* synthetic */ ebds a;
    final /* synthetic */ RecyclerView b;
    final /* synthetic */ ebna c;

    public ebmw(ebna ebnaVar, ebds ebdsVar, RecyclerView recyclerView) {
        this.a = ebdsVar;
        this.b = recyclerView;
        this.c = ebnaVar;
    }

    @Override // defpackage.vm
    public final void a() {
        h();
    }

    @Override // defpackage.vm
    public final void d(int i, int i2) {
        h();
    }

    @Override // defpackage.vm
    public final void e(int i, int i2) {
        h();
    }

    public final void h() {
        int dimensionPixelSize = this.c.getResources().getDimensionPixelSize(R.dimen.og_account_menu_top_cards_top_spacing);
        ebds ebdsVar = this.a;
        mz mzVar = ebdsVar.a;
        if (mzVar.g != 0) {
            emxc m = ebdsVar.m(((Integer) mzVar.e(0)).intValue());
            if (m.g()) {
                if (((ebef) m.c()).equals(ebef.ALWAYS_HIDE_DIVIDER_CARD)) {
                    dimensionPixelSize = 0;
                }
            }
        }
        this.b.setPadding(0, dimensionPixelSize, 0, 0);
    }
}
