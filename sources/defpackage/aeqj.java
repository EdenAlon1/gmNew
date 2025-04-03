package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aeqj extends aeqk {
    private final aerz c = aerz.a;

    @Override // defpackage.aeqk
    public final /* bridge */ /* synthetic */ aeqn a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, ffji ffjiVar) {
        View findViewById = layoutInflater.inflate(true != z ? R.layout.google_photos_onboarding_ineligible_cell : R.layout.google_photos_onboarding_ineligible_header, viewGroup, false).findViewById(R.id.gallery_photos_promo_signed_out_container);
        findViewById.getClass();
        aeqm aeqmVar = new aeqm(findViewById);
        TextView textView = aeqmVar.h;
        Context context = layoutInflater.getContext();
        context.getClass();
        textView.setText(f(context, R.string.google_photos_onboarding_signed_out_title, R.string.google_photos_onboarding_signed_in_title_photos_and_videos));
        ffjiVar.invoke(aeqmVar);
        return aeqmVar;
    }

    @Override // defpackage.aeqk
    public final /* synthetic */ aesa b() {
        return this.c;
    }
}
