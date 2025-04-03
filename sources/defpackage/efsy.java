package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.surveys.internal.view.SystemInfoDialogFragment;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efsy extends wc {
    final /* synthetic */ View a;
    final /* synthetic */ SystemInfoDialogFragment b;

    public efsy(SystemInfoDialogFragment systemInfoDialogFragment, View view) {
        this.a = view;
        this.b = systemInfoDialogFragment;
    }

    @Override // defpackage.wc
    public final void a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.canScrollVertically(-1)) {
            this.a.findViewById(R.id.survey_system_info_dialog_title).setElevation(this.b.B().getDimensionPixelSize(R.dimen.survey_system_info_dialog_title_elevation));
        } else {
            this.a.findViewById(R.id.survey_system_info_dialog_title).setElevation(0.0f);
        }
        this.a.findViewById(R.id.survey_system_info_dialog_section_divider).setVisibility(true != recyclerView.canScrollVertically(1) ? 8 : 0);
    }
}
