package defpackage;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.user.profile.photopicker.common.view.SquareImageView;
import com.google.android.material.textview.MaterialTextView;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egbh extends egbn {
    public final View.OnClickListener a;
    private final boolean h;
    private final dvxy i;

    public egbh(egaj egajVar, dvyc dvycVar, dvxy dvxyVar, dvxi dvxiVar, egbl egblVar, emxc emxcVar, View.OnClickListener onClickListener, boolean z) {
        super(egajVar, dvycVar, dvxiVar, egblVar, emxcVar);
        this.a = onClickListener;
        this.h = z;
        this.i = dvxyVar;
    }

    @Override // defpackage.egbn, defpackage.vk
    public final int a() {
        return this.d.size() + (this.h ? 1 : 0);
    }

    @Override // defpackage.egbn, defpackage.vk
    public final int dE(int i) {
        return i == this.d.size() ? 2 : 1;
    }

    @Override // defpackage.egbn, defpackage.vk
    public final wr e(ViewGroup viewGroup, int i) {
        int max = Math.max((int) (viewGroup.getContext().getResources().getDisplayMetrics().widthPixels / kpp.a(viewGroup.getContext().getResources(), R.dimen.photo_picker_me_photos_single_screen_columns)), (int) viewGroup.getResources().getDimension(R.dimen.photo_picker_random_art_image_minimum_width));
        if (i == 1) {
            SquareImageView squareImageView = (SquareImageView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.photo_picker_grid_item, viewGroup, false).findViewById(R.id.photo_picker_grid_image);
            squareImageView.setLayoutParams(new au(max, max));
            this.i.b(squareImageView, this.e.a(89756));
            return new egbm(squareImageView);
        }
        final View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.photo_picker_button, viewGroup, false);
        inflate.setLayoutParams(new au(max, max));
        inflate.setPadding(0, 0, 0, 0);
        MaterialTextView materialTextView = (MaterialTextView) inflate.findViewById(R.id.photo_picker_button_text);
        materialTextView.setText(viewGroup.getContext().getString(R.string.op3_more));
        materialTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, ku.a(viewGroup.getContext(), R.drawable.quantum_gm_ic_photo_library_vd_theme_24), (Drawable) null, (Drawable) null);
        this.i.b(inflate, this.e.a(90596));
        inflate.setOnClickListener(new View.OnClickListener() { // from class: egbf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                egbh egbhVar = egbh.this;
                egbhVar.f.a(dvxh.e(), inflate);
                egbhVar.a.onClick(view);
            }
        });
        return new egbg(inflate);
    }
}
