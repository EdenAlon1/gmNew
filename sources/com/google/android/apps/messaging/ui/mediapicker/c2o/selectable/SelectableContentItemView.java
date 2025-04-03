package com.google.android.apps.messaging.ui.mediapicker.c2o.selectable;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.mediapicker.c2o.content.MediaContentItem;
import com.google.android.apps.messaging.ui.mediapicker.c2o.selectable.SelectableContentItemView;
import defpackage.csmj;
import defpackage.dcai;
import defpackage.dcam;
import defpackage.dclp;
import defpackage.ufd;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class SelectableContentItemView extends dclp implements dcam {
    public csmj d;
    public TextView e;
    public View f;
    public MediaContentItem g;
    public ufd h;
    public int i;
    public int j;
    public boolean k;
    public int l;
    public dcai m;
    protected final View.OnClickListener n;

    public SelectableContentItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.n = new View.OnClickListener() { // from class: dclt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SelectableContentItemView selectableContentItemView = SelectableContentItemView.this;
                dcai dcaiVar = selectableContentItemView.m;
                if (dcaiVar != null) {
                    dcaiVar.a(selectableContentItemView);
                }
            }
        };
        this.k = false;
        this.l = -1;
    }

    public int a() {
        return 4;
    }

    @Override // defpackage.dcal
    public final void b(dcai dcaiVar) {
        this.m = dcaiVar;
    }

    @Override // defpackage.dcam
    public final ufd c() {
        return this.h;
    }

    @Override // defpackage.dcam
    public final MediaContentItem d() {
        return this.g;
    }

    @Override // defpackage.dcam
    public final void e(int i, boolean z) {
        this.l = i;
        this.k = z;
        clearAnimation();
        TextView textView = this.e;
        if (textView == null || this.f == null) {
            return;
        }
        if (!this.k) {
            this.d.m(this, 1.0f);
            this.e.setVisibility(8);
            this.f.setBackgroundColor(this.i);
        } else {
            textView.setText(Integer.toString(this.l + 1));
            this.d.m(this, 0.88f);
            this.e.setVisibility(0);
            this.f.setBackgroundColor(this.j);
        }
    }

    @Override // defpackage.dcam
    public final void f(ufd ufdVar) {
        this.h = ufdVar;
    }

    @Override // defpackage.dcam
    public final void g(MediaContentItem mediaContentItem) {
        this.g = mediaContentItem;
    }

    @Override // android.view.View, defpackage.dcam
    public final boolean isSelected() {
        return this.k;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.e = (TextView) findViewById(R.id.content_selected_index_overlay);
        this.f = findViewById(R.id.content_selected_tint);
        this.i = getResources().getColor(R.color.c2o_content_item_tint_start_color);
        this.j = getResources().getColor(R.color.c2o_content_item_tint_end_color);
        setClipToOutline(true);
    }
}
