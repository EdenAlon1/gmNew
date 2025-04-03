package defpackage;

import android.support.v7.widget.ActivityChooserView;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qh extends tq {
    final /* synthetic */ ActivityChooserView a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qh(ActivityChooserView activityChooserView, View view) {
        super(view);
        this.a = activityChooserView;
    }

    @Override // defpackage.tq
    public final ou a() {
        return this.a.a();
    }

    @Override // defpackage.tq
    protected final boolean b() {
        this.a.e();
        return true;
    }

    @Override // defpackage.tq
    protected final boolean c() {
        this.a.d();
        return true;
    }
}
