package com.google.android.libraries.user.profile.photopicker.art.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TableRow;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.user.profile.photopicker.art.view.ArtImageGridView;
import com.google.android.libraries.user.profile.photopicker.common.view.SquareImageView;
import com.google.android.material.textview.MaterialTextView;
import defpackage.dvxi;
import defpackage.dvxy;
import defpackage.dvyc;
import defpackage.efux;
import defpackage.efzr;
import defpackage.egaj;
import defpackage.egal;
import defpackage.egea;
import defpackage.egjk;
import defpackage.engw;
import defpackage.fazf;
import defpackage.qqe;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class ArtImageGridView extends efzr {
    public egjk a;
    public egaj b;
    public dvyc c;
    public dvxy d;
    public dvxi e;
    public boolean f;
    public efux g;
    private final TableLayout i;
    private int j;

    public ArtImageGridView(Context context) {
        this(context, null);
    }

    private final TableRow.LayoutParams g(boolean z) {
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams();
        int dimension = (int) getResources().getDimension(R.dimen.photo_picker_grid_spacing);
        layoutParams.setMargins(0, 0, 0, 0);
        if (true == z) {
            dimension = 0;
        }
        layoutParams.setMarginEnd(dimension);
        layoutParams.width = 0;
        layoutParams.weight = 1.0f;
        return layoutParams;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(engw engwVar, int i) {
        ArrayList arrayList = new ArrayList();
        int size = engwVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            final egea egeaVar = (egea) engwVar.get(i2);
            final SquareImageView squareImageView = (SquareImageView) LayoutInflater.from(getContext()).inflate(R.layout.photo_picker_grid_item, (ViewGroup) this, false).findViewById(R.id.photo_picker_grid_image);
            this.b.h(Uri.parse(egeaVar.d()), new egal(), squareImageView, this.f ? qqe.HIGH : qqe.NORMAL);
            squareImageView.setContentDescription(egeaVar.b());
            this.d.b(squareImageView, this.c.a(i));
            squareImageView.setOnClickListener(new View.OnClickListener() { // from class: efzj
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ArtImageGridView artImageGridView = ArtImageGridView.this;
                    artImageGridView.e.a(dvxh.e(), squareImageView);
                    artImageGridView.a.c = 15;
                    egea egeaVar2 = egeaVar;
                    artImageGridView.g.c(egeaVar2.a(), egeaVar2.c());
                }
            });
            squareImageView.setTag(R.id.op3_rounded_corner_image_id, Long.valueOf(egeaVar.a()));
            arrayList.add(squareImageView);
        }
        if (this.i.getChildCount() > 0) {
            this.i.removeAllViews();
        }
        if (arrayList.iterator().hasNext()) {
            TableRow tableRow = new TableRow(this.i.getContext());
            Iterator it = arrayList.iterator();
            int i3 = 0;
            while (true) {
                boolean z = true;
                if (!it.hasNext()) {
                    break;
                }
                View view = (View) it.next();
                if (i3 > 0 && i3 % this.j == 0) {
                    this.i.addView(tableRow);
                    tableRow = new TableRow(this.i.getContext());
                }
                i3++;
                if (i3 % this.j != 0) {
                    z = false;
                }
                tableRow.addView(view, g(z));
            }
            this.i.addView(tableRow);
            while (tableRow.getChildCount() < this.j) {
                ImageView imageView = new ImageView(this.i.getContext());
                imageView.setVisibility(4);
                tableRow.addView(imageView, g(tableRow.getChildCount() == this.j + (-1)));
            }
        }
    }

    public final void b(int i, int i2) {
        MaterialTextView materialTextView = (MaterialTextView) findViewById(R.id.photo_picker_art_image_grid_title);
        materialTextView.setText(i);
        materialTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(i2, 0, 0, 0);
    }

    public final void c() {
        this.j = 4;
    }

    public ArtImageGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = false;
        setOrientation(1);
        Object obj = context;
        if (!this.h) {
            while (!(obj instanceof fazf) && (obj instanceof ContextWrapper)) {
                obj = ((ContextWrapper) obj).getBaseContext();
            }
            ((fazf) obj).ab().a(this);
        }
        this.j = 10;
        inflate(getContext(), R.layout.photo_picker_art_image_grid, this);
        this.i = (TableLayout) findViewById(R.id.photo_picker_art_image_grid_content);
    }
}
