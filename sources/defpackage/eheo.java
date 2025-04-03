package defpackage;

import android.view.View;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eheo extends ktb {
    final /* synthetic */ ehes a;

    public eheo(ehes ehesVar) {
        this.a = ehesVar;
    }

    @Override // defpackage.ktb
    public final void c(View view, kxu kxuVar) {
        super.c(view, kxuVar);
        kxuVar.C(this.a.ah.getVisibility() == 0 ? this.a.Y(R.string.mtrl_picker_toggle_to_year_selection) : this.a.Y(R.string.mtrl_picker_toggle_to_day_selection));
    }
}
