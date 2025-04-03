package com.google.android.libraries.user.profile.photopicker.art.home.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.user.profile.photopicker.art.home.view.CategoriesSectionView;
import com.google.android.material.textview.MaterialTextView;
import defpackage.dvxi;
import defpackage.dvxy;
import defpackage.dvyc;
import defpackage.efux;
import defpackage.efxp;
import defpackage.egaj;
import defpackage.egal;
import defpackage.egec;
import defpackage.egee;
import defpackage.engw;
import defpackage.fazf;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class CategoriesSectionView extends efxp {
    public egaj a;
    public dvyc b;
    public dvxy c;
    public dvxi d;
    public efux e;

    public CategoriesSectionView(Context context) {
        this(context, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(engw engwVar) {
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.photo_picker_categories_container);
        linearLayout.removeAllViews();
        for (int i = 0; i < engwVar.size(); i++) {
            egec egecVar = (egec) engwVar.get(i);
            ViewGroup viewGroup = null;
            View inflate = inflate(getContext(), R.layout.photo_picker_category_section, null);
            LinearLayout linearLayout2 = (LinearLayout) inflate.findViewById(R.id.photo_picker_collection_container);
            MaterialTextView materialTextView = (MaterialTextView) inflate.findViewById(R.id.photo_picker_category_name);
            materialTextView.setText(egecVar.c());
            if (TextUtils.isEmpty(egecVar.c())) {
                materialTextView.setVisibility(8);
            }
            int i2 = 0;
            while (i2 < egecVar.b().size()) {
                final egee egeeVar = (egee) egecVar.b().get(i2);
                final View inflate2 = inflate(getContext(), R.layout.photo_picker_collection_image, viewGroup);
                ImageView imageView = (ImageView) inflate2.findViewById(R.id.photo_picker_collection_image);
                MaterialTextView materialTextView2 = (MaterialTextView) inflate2.findViewById(R.id.photo_picker_collection_name);
                MaterialTextView materialTextView3 = (MaterialTextView) inflate2.findViewById(R.id.photo_picker_collection_num_images);
                egaj egajVar = this.a;
                Uri parse = Uri.parse(egeeVar.d());
                egal egalVar = new egal();
                egalVar.a();
                egalVar.e();
                egajVar.f(parse, egalVar, imageView);
                materialTextView2.setText(egeeVar.c());
                materialTextView3.setText(String.valueOf(egeeVar.b()));
                this.c.b(inflate2, this.b.a(124726));
                inflate2.setOnClickListener(new View.OnClickListener() { // from class: efxn
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        CategoriesSectionView categoriesSectionView = CategoriesSectionView.this;
                        categoriesSectionView.d.a(dvxh.e(), inflate2);
                        egee egeeVar2 = egeeVar;
                        categoriesSectionView.e.a(egeeVar2.a(), egeeVar2.c());
                    }
                });
                linearLayout2.addView(inflate2);
                i2++;
                viewGroup = null;
            }
            if (i < engwVar.size() - 1) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.setMargins(0, 0, 0, (int) getResources().getDimension(R.dimen.photo_picker_art_category_bottom_margin));
                inflate.setLayoutParams(layoutParams);
            }
            linearLayout.addView(inflate);
        }
    }

    public CategoriesSectionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOrientation(1);
        Object obj = context;
        if (!this.f) {
            while (!(obj instanceof fazf) && (obj instanceof ContextWrapper)) {
                obj = ((ContextWrapper) obj).getBaseContext();
            }
            ((fazf) obj).ab().a(this);
        }
        inflate(getContext(), R.layout.photo_picker_categories_section, this);
        this.c.b(this, this.b.a(124725));
    }
}
