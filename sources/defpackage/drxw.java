package defpackage;

import com.google.android.material.tabs.TabLayout;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drxw {
    public static final /* synthetic */ ffmx[] a;
    public final ffsk b;
    public final drxb c;
    public List d;
    public final ffls e = new drxv(this);

    static {
        ffko ffkoVar = new ffko(drxw.class, "onTabSelectedListener", "getOnTabSelectedListener()Lcom/google/android/material/tabs/TabLayout$OnTabSelectedListener;", 0);
        int i = fflc.a;
        a = new ffmx[]{ffkoVar};
    }

    public drxw(ffsk ffskVar, drxb drxbVar) {
        this.b = ffskVar;
        this.c = drxbVar;
    }

    public final void a(dszr dszrVar) {
        List list = this.d;
        if (list == null) {
            ffkj.c("tabs");
            list = null;
        }
        Integer valueOf = Integer.valueOf(list.indexOf(dszrVar));
        Integer num = valueOf.intValue() >= 0 ? valueOf : null;
        if (num == null) {
            Objects.toString(dszrVar);
            throw new IllegalStateException("No tab found for category ".concat(dszrVar.toString()));
        }
        drxb drxbVar = this.c;
        int intValue = num.intValue();
        TabLayout tabLayout = drxbVar.i;
        tabLayout.m(tabLayout.d(intValue));
    }

    public final boolean b() {
        return this.c.i.getVisibility() == 0;
    }
}
