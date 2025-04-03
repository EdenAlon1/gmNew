package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aeqi extends aeqk {
    private final boolean c;
    private final aery d = aery.a;

    public aeqi(boolean z) {
        this.c = z;
    }

    @Override // defpackage.aeqk
    public final /* bridge */ /* synthetic */ aeqn a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, ffji ffjiVar) {
        View findViewById = layoutInflater.inflate(true != z ? R.layout.google_photos_onboarding_eligible_cell : R.layout.google_photos_onboarding_eligible_header, viewGroup, false).findViewById(R.id.gallery_photos_promo_signed_in_container);
        findViewById.getClass();
        aeql aeqlVar = new aeql(findViewById);
        if (aeqlVar.f.getResources().getConfiguration().fontScale > 1.0f) {
            aeqlVar.j.setVisibility(8);
        }
        TextView textView = aeqlVar.h;
        Context context = layoutInflater.getContext();
        context.getClass();
        textView.setText(f(context, R.string.google_photos_onboarding_title, R.string.google_photos_onboarding_title_photos_and_videos));
        ffjiVar.invoke(aeqlVar);
        if (this.c) {
            TextView textView2 = aeqlVar.i;
            textView2.getViewTreeObserver().addOnGlobalLayoutListener(new aeqh(textView2, aeqlVar));
        }
        return aeqlVar;
    }

    @Override // defpackage.aeqk
    public final /* synthetic */ aesa b() {
        return this.d;
    }
}
