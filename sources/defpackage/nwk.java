package defpackage;

import android.view.View;
import androidx.media3.ui.TrackSelectionView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nwk implements View.OnClickListener {
    final /* synthetic */ TrackSelectionView a;

    public nwk(TrackSelectionView trackSelectionView) {
        this.a = trackSelectionView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        TrackSelectionView trackSelectionView = this.a;
        if (view == trackSelectionView.a) {
            trackSelectionView.e = true;
            trackSelectionView.d.clear();
        } else {
            if (view != trackSelectionView.b) {
                trackSelectionView.e = false;
                Object tag = view.getTag();
                lti.f(tag);
                throw null;
            }
            trackSelectionView.e = false;
            trackSelectionView.d.clear();
        }
        trackSelectionView.a.setChecked(trackSelectionView.e);
        trackSelectionView.b.setChecked(!trackSelectionView.e && trackSelectionView.d.size() == 0);
        throw null;
    }
}
