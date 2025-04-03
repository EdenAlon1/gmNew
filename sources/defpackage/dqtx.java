package defpackage;

import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.material.tabs.TabLayout;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqtx implements ffxy {
    final /* synthetic */ TabLayout a;
    final /* synthetic */ dqtz b;

    public dqtx(TabLayout tabLayout, dqtz dqtzVar) {
        this.a = tabLayout;
        this.b = dqtzVar;
    }

    @Override // defpackage.ffxy
    public final /* bridge */ /* synthetic */ Object fQ(Object obj, ffgu ffguVar) {
        int intValue = ((Number) obj).intValue();
        ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
        layoutParams.getClass();
        float f = ((kjz) layoutParams).L;
        dqth dqthVar = this.b.aq;
        if (dqthVar == null) {
            ffkj.c("views");
            dqthVar = null;
        }
        ViewGroup.LayoutParams layoutParams2 = dqthVar.d.getLayoutParams();
        layoutParams2.getClass();
        if ((intValue * (f / ((dqtz.e(this.b).f ? ((kjz) layoutParams2).L : 0.0f) + f))) / this.a.b() >= this.a.getResources().getDimensionPixelOffset(R.dimen.emoji_tab_min_width)) {
            this.a.s(1);
            this.a.y();
        } else {
            this.a.s(0);
        }
        return ffcu.a;
    }
}
