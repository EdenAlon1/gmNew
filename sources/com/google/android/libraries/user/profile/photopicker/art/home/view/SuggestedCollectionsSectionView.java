package com.google.android.libraries.user.profile.photopicker.art.home.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.apps.messaging.R;
import defpackage.dvxi;
import defpackage.dvxy;
import defpackage.dvyc;
import defpackage.efux;
import defpackage.efxr;
import defpackage.egaj;
import defpackage.fazf;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class SuggestedCollectionsSectionView extends efxr {
    public egaj b;
    public dvyc c;
    public dvxy d;
    public dvxi e;
    public final ViewGroup f;
    public efux g;

    public SuggestedCollectionsSectionView(Context context) {
        this(context, null);
    }

    public SuggestedCollectionsSectionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOrientation(1);
        Object obj = context;
        if (!this.a) {
            while (!(obj instanceof fazf) && (obj instanceof ContextWrapper)) {
                obj = ((ContextWrapper) obj).getBaseContext();
            }
            ((fazf) obj).ab().a(this);
        }
        inflate(getContext(), R.layout.photo_picker_suggested_collections_section, this);
        this.d.b(this, this.c.a(124723));
        this.f = (ViewGroup) findViewById(R.id.photo_picker_collections_mixed_grid);
        for (int i = 0; i < this.f.getChildCount(); i++) {
            View childAt = this.f.getChildAt(i);
            if (childAt instanceof FrameLayout) {
                this.d.b(childAt, this.c.a(124724));
            }
        }
    }
}
