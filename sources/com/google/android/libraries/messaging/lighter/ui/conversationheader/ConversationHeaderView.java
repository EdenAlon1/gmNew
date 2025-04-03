package com.google.android.libraries.messaging.lighter.ui.conversationheader;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.material.appbar.AppBarLayout;
import defpackage.dzxy;
import defpackage.dzyd;
import defpackage.eaaw;
import defpackage.eaax;
import defpackage.eabe;
import defpackage.egzt;
import defpackage.ehdr;
import defpackage.fdql;
import defpackage.kpp;
import defpackage.zd;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class ConversationHeaderView extends egzt implements eaax {
    private final Toolbar g;
    private final dzxy h;
    private final TextView i;
    private final float j;
    private final float k;
    private Integer l;

    public ConversationHeaderView(Context context) {
        this(context, null);
    }

    @Override // defpackage.dzya
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        final eaaw eaawVar = (eaaw) obj;
        this.g.t(fdql.j() ? new View.OnClickListener() { // from class: eabb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                eaaw.this.a();
            }
        } : new View.OnClickListener() { // from class: eabc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                eaaw.this.b();
            }
        });
        this.g.x = new zd() { // from class: eabd
            @Override // defpackage.zd
            public final boolean a(MenuItem menuItem) {
                return true;
            }
        };
    }

    @Override // defpackage.egzt
    public final void fJ(CharSequence charSequence) {
        this.i.setText(charSequence);
    }

    @Override // defpackage.egzj
    public final void hj(AppBarLayout appBarLayout, int i) {
        float f;
        Integer valueOf = Integer.valueOf(appBarLayout.h());
        this.l = valueOf;
        if (valueOf.intValue() > 0) {
            f = (this.l.intValue() + i) / this.l.intValue();
        } else {
            f = 1.0f;
        }
        dzxy dzxyVar = this.h;
        float f2 = this.k;
        dzxyVar.b((int) (f2 + (f * (this.j - f2))));
    }

    public ConversationHeaderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ConversationHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(dzyd.a(context, fdql.i()), attributeSet, i);
        this.l = null;
        inflate(getContext(), R.layout.conversation_header_layout, this);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        this.g = toolbar;
        Drawable f = toolbar.f();
        if (f != null) {
            f.setColorFilter(ehdr.b(this, R.attr.colorOnSurfaceVariant), PorterDuff.Mode.SRC_IN);
        }
        Drawable e = toolbar.e();
        if (e != null) {
            e.setColorFilter(ehdr.b(this, R.attr.colorOnSurfaceVariant), PorterDuff.Mode.SRC_IN);
        }
        findViewById(R.id.avatar_group);
        dzxy dzxyVar = (dzxy) findViewById(R.id.conversation_avatar);
        this.h = dzxyVar;
        TextView textView = (TextView) findViewById(R.id.header_subtitle);
        this.i = textView;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, eabe.a);
        try {
            this.j = obtainStyledAttributes.getDimension(1, getResources().getDimension(R.dimen.default_avatar_expanded_size));
            this.k = obtainStyledAttributes.getDimension(2, getResources().getDimension(R.dimen.default_avatar_minimized_size));
            getResources().getDimension(R.dimen.default_toolbar_button_icon_width);
            getResources().getDimension(R.dimen.default_toolbar_button_icon_height);
            obtainStyledAttributes.recycle();
            setBackgroundColor(ehdr.b(this, R.attr.colorSurface));
            dzxyVar.d();
            findViewById(R.id.header_contents).bringToFront();
            textView.setTypeface(kpp.b(getContext(), R.font.google_sans_text));
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }
}
