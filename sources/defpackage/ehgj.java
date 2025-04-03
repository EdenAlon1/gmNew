package defpackage;

import android.view.ViewGroup;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehgj implements ehgu {
    final /* synthetic */ ExtendedFloatingActionButton a;

    public ehgj(ExtendedFloatingActionButton extendedFloatingActionButton) {
        this.a = extendedFloatingActionButton;
    }

    @Override // defpackage.ehgu
    public final int a() {
        return this.a.getMeasuredHeight();
    }

    @Override // defpackage.ehgu
    public final int b() {
        return this.a.q;
    }

    @Override // defpackage.ehgu
    public final int c() {
        return this.a.p;
    }

    @Override // defpackage.ehgu
    public final int d() {
        ExtendedFloatingActionButton extendedFloatingActionButton = this.a;
        int measuredWidth = extendedFloatingActionButton.getMeasuredWidth();
        int n = extendedFloatingActionButton.n();
        int i = measuredWidth - (n + n);
        ExtendedFloatingActionButton extendedFloatingActionButton2 = this.a;
        return i + extendedFloatingActionButton2.p + extendedFloatingActionButton2.q;
    }

    @Override // defpackage.ehgu
    public final ViewGroup.LayoutParams e() {
        return new ViewGroup.LayoutParams(-2, -2);
    }
}
