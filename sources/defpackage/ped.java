package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ped implements vz {
    @Override // defpackage.vz
    public final void c(View view) {
        vy vyVar = (vy) view.getLayoutParams();
        if (vyVar.width != -1 || vyVar.height != -1) {
            throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
        }
    }

    @Override // defpackage.vz
    public final void d(View view) {
    }
}
