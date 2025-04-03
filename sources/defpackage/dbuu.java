package defpackage;

import android.graphics.drawable.Drawable;
import android.support.v7.widget.Toolbar;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dbuu extends rip {
    public dbuu(Toolbar toolbar) {
        super(toolbar);
    }

    @Override // defpackage.rix
    public final void a(Drawable drawable) {
        ((Toolbar) this.a).h().findItem(R.id.avatar).setIcon(drawable);
    }

    @Override // defpackage.rix
    public final /* bridge */ /* synthetic */ void c(Object obj, rjh rjhVar) {
        ((Toolbar) this.a).h().findItem(R.id.avatar).setIcon((Drawable) obj);
    }

    @Override // defpackage.rip
    protected final void b(Drawable drawable) {
    }
}
