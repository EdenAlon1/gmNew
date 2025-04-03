package defpackage;

import android.view.View;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eheq implements View.OnClickListener {
    final /* synthetic */ ehes a;

    public eheq(ehes ehesVar) {
        this.a = ehesVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ehes ehesVar = this.a;
        int i = ehesVar.ai;
        if (i == 2) {
            ehesVar.f(1);
            ehesVar.ag.announceForAccessibility(ehesVar.Y(R.string.mtrl_picker_toggled_to_day_selection));
        } else if (i == 1) {
            ehesVar.f(2);
            ehesVar.e.announceForAccessibility(ehesVar.Y(R.string.mtrl_picker_toggled_to_year_selection));
        }
    }
}
