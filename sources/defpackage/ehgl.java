package defpackage;

import android.view.ViewGroup;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehgl implements ehgu {
    final /* synthetic */ ehgu a;
    final /* synthetic */ ehgu b;
    final /* synthetic */ ExtendedFloatingActionButton c;

    public ehgl(ExtendedFloatingActionButton extendedFloatingActionButton, ehgu ehguVar, ehgu ehguVar2) {
        this.a = ehguVar;
        this.b = ehguVar2;
        this.c = extendedFloatingActionButton;
    }

    @Override // defpackage.ehgu
    public final int a() {
        int i = this.c.v;
        return i == -1 ? this.a.a() : (i == 0 || i == -2) ? this.b.a() : i;
    }

    @Override // defpackage.ehgu
    public final int b() {
        return this.c.q;
    }

    @Override // defpackage.ehgu
    public final int c() {
        return this.c.p;
    }

    @Override // defpackage.ehgu
    public final int d() {
        int i = this.c.u;
        return i == -1 ? this.a.d() : (i == 0 || i == -2) ? this.b.d() : i;
    }

    @Override // defpackage.ehgu
    public final ViewGroup.LayoutParams e() {
        ExtendedFloatingActionButton extendedFloatingActionButton = this.c;
        int i = extendedFloatingActionButton.u;
        if (i == 0) {
            i = -2;
        }
        int i2 = extendedFloatingActionButton.v;
        return new ViewGroup.LayoutParams(i, i2 != 0 ? i2 : -2);
    }
}
