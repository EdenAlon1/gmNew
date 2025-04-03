package defpackage;

import android.database.DataSetObserver;
import com.google.android.material.tabs.TabLayout;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehrq extends DataSetObserver {
    final /* synthetic */ TabLayout a;

    public ehrq(TabLayout tabLayout) {
        this.a = tabLayout;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        this.a.j();
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.a.j();
    }
}
