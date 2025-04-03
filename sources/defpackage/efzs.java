package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.user.profile.photopicker.common.view.SquareImageView;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efzs extends efzp {
    public efzs(egaj egajVar, dvyc dvycVar, dvxy dvxyVar, dvxi dvxiVar, egjk egjkVar, efzn efznVar) {
        super(egajVar, dvycVar, dvxyVar, dvxiVar, egjkVar, efznVar);
    }

    @Override // defpackage.efzp, defpackage.vk
    public final wr e(ViewGroup viewGroup, int i) {
        SquareImageView squareImageView = (SquareImageView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.photo_picker_grid_item, viewGroup, false).findViewById(R.id.photo_picker_grid_image);
        int max = Math.max((int) (viewGroup.getContext().getResources().getDisplayMetrics().widthPixels / kpp.a(viewGroup.getContext().getResources(), R.dimen.photo_picker_single_screen_columns)), (int) viewGroup.getResources().getDimension(R.dimen.photo_picker_random_art_image_minimum_width));
        squareImageView.setLayoutParams(new au(max, max));
        return new efzo(squareImageView);
    }
}
