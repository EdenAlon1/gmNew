package com.google.android.apps.messaging.ui.search;

import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageButton;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.generic.spannedautocomplete.SpannedMultiAutoCompleteTextView;
import com.google.android.apps.messaging.ui.search.ZeroStateSearchBox;
import com.google.android.apps.messaging.ui.search.presenter.SearchFilterDataItem;
import defpackage.cslq;
import defpackage.dbwx;
import defpackage.ddlz;
import defpackage.ddmq;
import defpackage.ddmr;
import defpackage.ddms;
import defpackage.ddmu;
import defpackage.ddnp;
import defpackage.ddnt;
import defpackage.ddpl;
import defpackage.ddqp;
import defpackage.ddqu;
import defpackage.dede;
import defpackage.elbx;
import defpackage.ffbr;
import defpackage.ljn;
import defpackage.lkk;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ZeroStateSearchBox extends ddlz implements ddqp {
    public ImageButton a;
    public ViewPropertyAnimator b;
    public boolean c;
    public SpannedMultiAutoCompleteTextView d;
    public ddqu e;
    public ddmu f;
    public View g;
    public ViewPropertyAnimator h;
    public ffbr i;
    public dede j;
    public ddpl k;
    public elbx l;
    public ffbr m;
    public boolean n;
    public ddnt o;
    private ImageButton p;
    private boolean q;
    private final int r;
    private final AnimatorListenerAdapter s;

    public ZeroStateSearchBox(Context context) {
        super(context);
        this.s = new ddms(this);
        this.r = getResources().getInteger(R.integer.zero_state_fade_in_duration);
    }

    @Override // defpackage.ddqp
    public final SearchFilterDataItem c() {
        ddqu ddquVar = this.e;
        if (ddquVar == null) {
            return null;
        }
        SearchFilterDataItem c = ddquVar.c();
        while (c != null && c.c) {
            c = this.e.c();
        }
        if (c == null) {
            return null;
        }
        Editable editableText = this.d.getEditableText();
        int length = editableText.length();
        editableText.replace(this.d.d.findTokenStart(editableText, length), length, "");
        j(c);
        return c;
    }

    public final void d(boolean z) {
        if (this.q == z || this.g == null) {
            return;
        }
        this.q = z;
        ViewPropertyAnimator viewPropertyAnimator = this.h;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        if (z) {
            this.g.setVisibility(0);
            this.g.setAlpha(0.0f);
        }
        this.h = this.g.animate().alpha(true == z ? 1.0f : 0.0f).setInterpolator(new ljn()).setDuration(this.r).setListener(z ? null : this.s);
    }

    public final void e(final Context context, final View view, final lkk lkkVar) {
        cslq.d(new Runnable() { // from class: ddmn
            @Override // java.lang.Runnable
            public final void run() {
                if (((lkv) lkkVar).c.a(lkj.RESUMED) && view.getVisibility() == 0) {
                    Context context2 = context;
                    ZeroStateSearchBox zeroStateSearchBox = ZeroStateSearchBox.this;
                    zeroStateSearchBox.j.j(context2, zeroStateSearchBox.d);
                }
            }
        }, 100L);
    }

    @Override // defpackage.ddqp
    public final boolean f(SearchFilterDataItem searchFilterDataItem) {
        throw null;
    }

    public final boolean g() {
        if (this.d.m()) {
            this.d.g();
            return true;
        }
        if (this.j.b) {
            return this.j.i(getContext(), this.d);
        }
        boolean z = c() != null;
        if (z) {
            this.k.d(9);
        }
        return z;
    }

    @Override // defpackage.ddqp
    public final void h(SearchFilterDataItem searchFilterDataItem) {
        ddqu ddquVar = this.e;
        if (ddquVar != null && ddquVar.f(searchFilterDataItem)) {
            this.e.b();
            this.d.f(searchFilterDataItem);
        }
    }

    public final void i(Context context, View view) {
        view.requestFocus();
        this.j.i(context, view);
    }

    @Override // defpackage.ddqp
    public final void j(SearchFilterDataItem searchFilterDataItem) {
        Editable editableText = this.d.getEditableText();
        dbwx[] dbwxVarArr = (dbwx[]) editableText.getSpans(0, editableText.length(), dbwx.class);
        if (dbwxVarArr == null || (dbwxVarArr.length) == 0) {
            return;
        }
        for (dbwx dbwxVar : dbwxVarArr) {
            if (searchFilterDataItem.equals(dbwxVar.a)) {
                editableText.replace(editableText.getSpanStart(dbwxVar), editableText.getSpanEnd(dbwxVar), "");
                return;
            }
        }
    }

    public final void k(int i) {
        ddqu ddquVar = this.e;
        if (ddquVar == null) {
            return;
        }
        ddquVar.w(i);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.p = (ImageButton) findViewById(R.id.zero_state_search_box_back_button);
        this.a = (ImageButton) findViewById(R.id.zero_state_search_box_clear_button);
        SpannedMultiAutoCompleteTextView spannedMultiAutoCompleteTextView = (SpannedMultiAutoCompleteTextView) findViewById(R.id.zero_state_search_box_auto_complete);
        this.d = spannedMultiAutoCompleteTextView;
        spannedMultiAutoCompleteTextView.i(new ddnp(getContext(), this.m));
        SpannedMultiAutoCompleteTextView spannedMultiAutoCompleteTextView2 = this.d;
        spannedMultiAutoCompleteTextView2.l = new ddmq(this);
        spannedMultiAutoCompleteTextView2.addTextChangedListener(new ddmr(this));
        this.a.setOnClickListener(new View.OnClickListener() { // from class: ddmf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ZeroStateSearchBox zeroStateSearchBox = ZeroStateSearchBox.this;
                zeroStateSearchBox.k.d(8);
                Editable text = zeroStateSearchBox.d.getText();
                if (text != null) {
                    text.clear();
                }
            }
        });
        this.p.setOnClickListener(new View.OnClickListener() { // from class: ddmg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ddmu ddmuVar;
                ZeroStateSearchBox zeroStateSearchBox = ZeroStateSearchBox.this;
                if (zeroStateSearchBox.d.m()) {
                    zeroStateSearchBox.d.g();
                }
                if (zeroStateSearchBox.j.b) {
                    zeroStateSearchBox.j.i(zeroStateSearchBox.getContext(), zeroStateSearchBox.d);
                }
                if (zeroStateSearchBox.g() || (ddmuVar = zeroStateSearchBox.f) == null) {
                    return;
                }
                ddnj ddnjVar = (ddnj) ddmuVar;
                eg G = ddnjVar.b.G();
                if (G != null) {
                    ZeroStateSearchBox zeroStateSearchBox2 = ddnjVar.z;
                    View view2 = ddnjVar.b.Q;
                    view2.getClass();
                    zeroStateSearchBox2.i(G, view2);
                    G.onBackPressed();
                }
            }
        });
    }

    public ZeroStateSearchBox(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.s = new ddms(this);
        this.r = getResources().getInteger(R.integer.zero_state_fade_in_duration);
    }
}
