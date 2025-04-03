package com.google.android.apps.messaging.ui.mediapicker.c2o.gif;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gif.GifCategoryContentItemView;
import defpackage.cxqk;
import defpackage.dcai;
import defpackage.dciw;
import defpackage.dcjl;
import defpackage.dcjm;
import defpackage.ehdr;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class GifCategoryContentItemView extends dcjl implements dcjm {
    public dcai a;
    public cxqk b;
    private ImageView c;
    private TextView d;
    private dciw e;

    public GifCategoryContentItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // defpackage.dcal
    public final int a() {
        return 1;
    }

    @Override // defpackage.dcal
    public final void b(dcai dcaiVar) {
        this.a = dcaiVar;
    }

    @Override // defpackage.dcjm
    public final dciw c() {
        return this.e;
    }

    @Override // defpackage.dcjm
    public final void d(dciw dciwVar) {
        Resources resources = getContext().getResources();
        boolean z = dciwVar.b == null;
        int i = z ? R.drawable.ic_search_light : R.drawable.ic_insert_gif_white;
        String string = z ? resources.getString(R.string.c2o_gif_search_button_text) : resources.getString(R.string.c2o_gif_category_description, dciwVar.a);
        int i2 = dciwVar.c;
        this.c.setImageResource(i);
        this.c.getDrawable().mutate().setTint(i2);
        this.d.setText(dciwVar.a);
        this.d.setTextColor(i2);
        this.d.setContentDescription(string);
        if (z) {
            ImageView imageView = this.c;
            imageView.setColorFilter(ehdr.d(imageView.getContext(), R.attr.colorOnSurfaceVariant, "IContentItemView"));
        } else {
            this.c.clearColorFilter();
        }
        this.e = dciwVar;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.c = (ImageView) findViewById(R.id.gif_category_icon);
        this.d = (TextView) findViewById(R.id.gif_category_text);
        setOnClickListener(this.b.a(new View.OnClickListener() { // from class: dcix
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GifCategoryContentItemView gifCategoryContentItemView = GifCategoryContentItemView.this;
                dcai dcaiVar = gifCategoryContentItemView.a;
                if (dcaiVar != null) {
                    dcaiVar.a(gifCategoryContentItemView);
                }
            }
        }));
        setClipToOutline(true);
    }
}
