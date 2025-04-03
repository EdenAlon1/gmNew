package com.google.android.apps.messaging.ui.appsettings;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.VectorDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.preference.Preference;
import com.google.android.apps.messaging.R;
import defpackage.cxhv;
import defpackage.cxih;
import defpackage.ehdr;
import defpackage.ooi;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class SwipeActionPreference extends Preference {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    private cxhv g;

    public SwipeActionPreference(Context context) {
        super(context);
        this.g = cxhv.ARCHIVE;
    }

    @Override // androidx.preference.Preference
    public final void a(ooi ooiVar) {
        VectorDrawable vectorDrawable;
        ImageView imageView;
        View findViewById;
        View findViewById2;
        int i;
        super.a(ooiVar);
        ooiVar.a.setClickable(true);
        TextView textView = (TextView) ooiVar.a.findViewById(R.id.swipe_action_title);
        if (textView != null) {
            textView.setText(t());
        }
        TextView textView2 = (TextView) ooiVar.a.findViewById(R.id.swipe_action_summary);
        if (textView2 != null) {
            textView2.setText(m());
        }
        ViewStub viewStub = (ViewStub) ooiVar.a.findViewById(R.id.swipe_action_view_stub);
        if (viewStub != null && (i = this.b) > 0) {
            viewStub.setLayoutResource(i);
            viewStub.inflate();
        }
        View view = ooiVar.a;
        cxhv cxhvVar = this.g;
        int i2 = cxhvVar == cxhv.DELETE ? R.drawable.quantum_gm_ic_delete_vd_theme_24 : cxhvVar == cxhv.ARCHIVE ? R.drawable.quantum_gm_ic_archive_vd_theme_24 : cxhvVar == cxhv.MARK_AS_READ_OR_UNREAD ? R.drawable.messages_unread_chat_icon : 0;
        GradientDrawable gradientDrawable = null;
        if (i2 == 0) {
            vectorDrawable = null;
        } else {
            vectorDrawable = (VectorDrawable) view.getContext().getDrawable(i2);
            int b = cxhvVar == cxhv.DELETE ? ehdr.b(view, R.attr.colorOnError) : (cxhvVar == cxhv.ARCHIVE || cxhvVar == cxhv.MARK_AS_READ_OR_UNREAD) ? ehdr.b(view, R.attr.colorOnPrimary) : 0;
            if (vectorDrawable != null && b != 0) {
                vectorDrawable = (VectorDrawable) vectorDrawable.mutate();
                vectorDrawable.setTint(b);
                vectorDrawable.setTintMode(PorterDuff.Mode.SRC_IN);
            }
        }
        View view2 = ooiVar.a;
        cxhv cxhvVar2 = this.g;
        if (this.c != 0) {
            gradientDrawable = (GradientDrawable) view2.getContext().getDrawable(this.c);
            int b2 = cxhvVar2 == cxhv.DELETE ? ehdr.b(view2, R.attr.colorError) : (cxhvVar2 == cxhv.ARCHIVE || cxhvVar2 == cxhv.MARK_AS_READ_OR_UNREAD) ? ehdr.b(view2, R.attr.colorPrimary) : 0;
            if (gradientDrawable != null && b2 != 0) {
                gradientDrawable.setColor(b2);
            }
        }
        int i3 = this.f;
        if (i3 > 0 && (findViewById2 = ooiVar.a.findViewById(i3)) != null) {
            findViewById2.setVisibility(vectorDrawable == null ? 8 : 0);
        }
        int i4 = this.d;
        if (i4 > 0 && (findViewById = ooiVar.a.findViewById(i4)) != null && gradientDrawable != null) {
            findViewById.setBackground(gradientDrawable);
        }
        int i5 = this.e;
        if (i5 <= 0 || (imageView = (ImageView) ooiVar.a.findViewById(i5)) == null || vectorDrawable == null) {
            return;
        }
        imageView.setImageDrawable(vectorDrawable);
    }

    public final void k(cxhv cxhvVar) {
        this.g = cxhvVar;
        d();
    }

    @Override // androidx.preference.Preference
    public final CharSequence m() {
        return cxih.e(this.j, this.g);
    }

    @Override // androidx.preference.Preference
    public final CharSequence t() {
        int i = this.a;
        if (i != 0) {
            return this.j.getString(i);
        }
        return null;
    }

    public SwipeActionPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = cxhv.ARCHIVE;
    }

    public SwipeActionPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.g = cxhv.ARCHIVE;
    }
}
