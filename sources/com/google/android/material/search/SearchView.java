package com.google.android.material.search;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.messaging.R;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.TouchObserverFrameLayout;
import com.google.android.material.search.SearchView;
import defpackage.aak;
import defpackage.ehdr;
import defpackage.ehfz;
import defpackage.ehhv;
import defpackage.ehiz;
import defpackage.ehjb;
import defpackage.ehje;
import defpackage.ehjg;
import defpackage.ehjl;
import defpackage.ehjq;
import defpackage.ehjw;
import defpackage.ehmy;
import defpackage.ehnn;
import defpackage.ehnp;
import defpackage.ehnq;
import defpackage.ehoc;
import defpackage.ehop;
import defpackage.ehoq;
import defpackage.ehua;
import defpackage.kks;
import defpackage.kkt;
import defpackage.kqj;
import defpackage.ku;
import defpackage.kud;
import defpackage.kvd;
import defpackage.kvo;
import defpackage.kw;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class SearchView extends FrameLayout implements kks, ehjl {
    private int A;
    public final View a;
    public final ClippableRoundedCornerLayout b;
    final View c;
    public final View d;
    public final FrameLayout e;
    public final FrameLayout f;
    public final MaterialToolbar g;
    public final Toolbar h;
    public final TextView i;
    public final EditText j;
    public final ImageButton k;
    public final View l;
    public final TouchObserverFrameLayout m;
    public SearchBar n;
    public boolean o;
    public boolean p;
    private final boolean q;
    private final ehoc r;
    private final ehjq s;
    private final boolean t;
    private final ehfz u;
    private final Set v;
    private int w;
    private boolean x;
    private final int y;
    private Map z;

    /* compiled from: PG */
    public static class Behavior extends kkt<SearchView> {
        public Behavior() {
        }

        @Override // defpackage.kkt
        public final /* bridge */ /* synthetic */ void l(CoordinatorLayout coordinatorLayout, View view, View view2) {
            SearchView searchView = (SearchView) view;
            if (searchView.n == null && (view2 instanceof SearchBar)) {
                searchView.k((SearchBar) view2);
            }
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public SearchView(Context context) {
        this(context, null);
    }

    private final void o() {
        float dimension;
        SearchBar searchBar = this.n;
        if (searchBar != null) {
            ehop ehopVar = searchBar.G;
            dimension = ehopVar != null ? ehopVar.u() : searchBar.getElevation();
        } else {
            dimension = getResources().getDimension(R.dimen.m3_searchview_elevation);
        }
        p(dimension);
    }

    private final void p(float f) {
        ehfz ehfzVar = this.u;
        if (ehfzVar == null || this.c == null) {
            return;
        }
        this.c.setBackgroundColor(ehfzVar.b(this.y, f));
    }

    private final void q(ViewGroup viewGroup, boolean z) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt != this) {
                if (childAt.findViewById(this.b.getId()) != null) {
                    q((ViewGroup) childAt, z);
                } else if (z) {
                    this.z.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    childAt.setImportantForAccessibility(4);
                } else {
                    Map map = this.z;
                    if (map != null && map.containsKey(childAt)) {
                        childAt.setImportantForAccessibility(((Integer) this.z.get(childAt)).intValue());
                    }
                }
            }
        }
    }

    private final void r() {
        ImageButton b = ehjb.b(this.g);
        if (b == null) {
            return;
        }
        int i = this.b.getVisibility() == 0 ? 1 : 0;
        Drawable a = kqj.a(b.getDrawable());
        if (a instanceof kw) {
            ((kw) a).setProgress(i);
        }
        if (a instanceof ehhv) {
            ((ehhv) a).a(i);
        }
    }

    private final boolean s() {
        int i = this.A;
        if (i != 0) {
            return i == 2 || i == 1;
        }
        throw null;
    }

    private final void t(int i, boolean z) {
        int i2 = this.A;
        if (i2 == 0) {
            throw null;
        }
        if (i2 == i) {
            return;
        }
        if (z) {
            v(i);
        }
        this.A = i;
        Iterator it = new LinkedHashSet(this.v).iterator();
        while (it.hasNext()) {
            ((ehnq) it.next()).a();
        }
        u(i);
        SearchBar searchBar = this.n;
        if (searchBar == null || i != 2) {
            return;
        }
        searchBar.sendAccessibilityEvent(8);
    }

    private final void u(int i) {
        if (this.n == null || !this.t) {
            return;
        }
        if (i == 0) {
            throw null;
        }
        if (i == 4) {
            this.s.a();
        } else if (i == 2) {
            this.s.b();
        }
    }

    private final void v(int i) {
        if (i == 4) {
            h(true);
        } else if (i == 2) {
            h(false);
        }
    }

    @Override // defpackage.ehjl
    public final void F(aak aakVar) {
        if (s() || this.n == null) {
            return;
        }
        ehoc ehocVar = this.r;
        SearchBar searchBar = ehocVar.g;
        ehjw ehjwVar = ehocVar.e;
        ehjwVar.e = aakVar;
        float f = aakVar.a;
        ehjwVar.g = ehjg.e(ehjwVar.a);
        if (searchBar != null) {
            ehjwVar.h = ehjg.d(ehjwVar.a, searchBar);
        }
        ehjwVar.f = f;
    }

    @Override // defpackage.ehjl
    public final void H(aak aakVar) {
        if (s() || this.n == null || Build.VERSION.SDK_INT < 34) {
            return;
        }
        ehoc ehocVar = this.r;
        if (aakVar.b > 0.0f) {
            ehjw ehjwVar = ehocVar.e;
            SearchBar searchBar = ehocVar.g;
            ehjwVar.h(aakVar, searchBar, searchBar.H());
            AnimatorSet animatorSet = ehocVar.f;
            if (animatorSet != null) {
                animatorSet.setCurrentPlayTime((long) (aakVar.b * animatorSet.getDuration()));
                return;
            }
            SearchView searchView = ehocVar.a;
            if (searchView.m()) {
                searchView.d();
            }
            if (ehocVar.a.o) {
                ehocVar.f = ehocVar.a(false);
                ehocVar.f.start();
                ehocVar.f.pause();
            }
        }
    }

    @Override // defpackage.kks
    public final kkt a() {
        return new Behavior();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.q) {
            this.m.addView(view, i, layoutParams);
        } else {
            super.addView(view, i, layoutParams);
        }
    }

    protected int b() {
        return R.drawable.ic_arrow_back_black_24;
    }

    public final Editable c() {
        return this.j.getText();
    }

    public final void d() {
        this.j.post(new Runnable() { // from class: ehnm
            @Override // java.lang.Runnable
            public final void run() {
                SearchView searchView = SearchView.this;
                searchView.j.clearFocus();
                EditText editText = searchView.j;
                InputMethodManager f = ehjg.f(editText);
                if (f != null) {
                    f.hideSoftInputFromWindow(editText.getWindowToken(), 0);
                }
            }
        });
    }

    public final void e() {
        int i = this.A;
        if (i == 0) {
            throw null;
        }
        if (i == 2 || i == 1) {
            return;
        }
        this.r.e();
    }

    public final void f() {
        this.j.postDelayed(new Runnable() { // from class: ehne
            @Override // java.lang.Runnable
            public final void run() {
                SearchView searchView = SearchView.this;
                if (searchView.j.requestFocus()) {
                    searchView.j.sendAccessibilityEvent(8);
                }
                EditText editText = searchView.j;
                ehjg.f(editText).showSoftInput(editText, 1);
            }
        }, 100L);
    }

    public final void g() {
        if (this.x) {
            f();
        }
    }

    public final void h(boolean z) {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        if (z) {
            this.z = new HashMap(viewGroup.getChildCount());
        }
        q(viewGroup, z);
        if (z) {
            return;
        }
        this.z = null;
    }

    public final void i(int i) {
        if (this.d.getLayoutParams().height != i) {
            this.d.getLayoutParams().height = i;
            this.d.requestLayout();
        }
    }

    public final void j(boolean z) {
        boolean z2 = this.b.getVisibility() == 0;
        this.b.setVisibility(true != z ? 8 : 0);
        r();
        t(z ? 4 : 2, z2 != z);
    }

    public final void k(SearchBar searchBar) {
        this.n = searchBar;
        this.r.g = searchBar;
        if (searchBar != null) {
            searchBar.setOnClickListener(new View.OnClickListener() { // from class: ehnh
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SearchView.this.l();
                }
            });
            if (Build.VERSION.SDK_INT >= 34) {
                try {
                    searchBar.setHandwritingDelegatorCallback(new Runnable() { // from class: ehni
                        @Override // java.lang.Runnable
                        public final void run() {
                            SearchView.this.l();
                        }
                    });
                    this.j.setIsHandwritingDelegate(true);
                } catch (LinkageError unused) {
                }
            }
        }
        MaterialToolbar materialToolbar = this.g;
        if (materialToolbar != null && !(kqj.a(materialToolbar.e()) instanceof kw)) {
            int b = b();
            if (this.n == null) {
                this.g.r(b);
            } else {
                Drawable mutate = ku.a(getContext(), b).mutate();
                Integer num = this.g.D;
                if (num != null) {
                    mutate.setTint(num.intValue());
                }
                mutate.setLayoutDirection(getLayoutDirection());
                this.g.s(new ehhv(this.n.e(), mutate));
                r();
            }
        }
        o();
        u(this.A);
    }

    public final void l() {
        int i = this.A;
        if (i == 0) {
            throw null;
        }
        if (i == 4 || i == 3) {
            return;
        }
        final ehoc ehocVar = this.r;
        if (ehocVar.g == null) {
            final SearchView searchView = ehocVar.a;
            if (searchView.m()) {
                searchView.postDelayed(new Runnable() { // from class: ehnv
                    @Override // java.lang.Runnable
                    public final void run() {
                        SearchView.this.g();
                    }
                }, 150L);
            }
            ehocVar.b.setVisibility(4);
            ehocVar.b.post(new Runnable() { // from class: ehnw
                @Override // java.lang.Runnable
                public final void run() {
                    ehoc ehocVar2 = ehoc.this;
                    ehocVar2.b.setTranslationY(r1.getHeight());
                    AnimatorSet d = ehocVar2.d(true);
                    d.addListener(new ehnz(ehocVar2));
                    d.start();
                }
            });
            return;
        }
        SearchView searchView2 = ehocVar.a;
        if (searchView2.m()) {
            searchView2.g();
        }
        ehocVar.a.n(3);
        Menu h = ehocVar.c.h();
        if (h != null) {
            h.clear();
        }
        int i2 = ehocVar.g.F;
        if (i2 == -1 || !ehocVar.a.p) {
            ehocVar.c.setVisibility(8);
        } else {
            ehocVar.c.o(i2);
            ActionMenuView a = ehjb.a(ehocVar.c);
            if (a != null) {
                for (int i3 = 0; i3 < a.getChildCount(); i3++) {
                    View childAt = a.getChildAt(i3);
                    childAt.setClickable(false);
                    childAt.setFocusable(false);
                    childAt.setFocusableInTouchMode(false);
                }
            }
            ehocVar.c.setVisibility(0);
        }
        ehocVar.d.setText(ehocVar.g.J());
        EditText editText = ehocVar.d;
        editText.setSelection(editText.getText().length());
        ehocVar.b.setVisibility(4);
        ehocVar.b.post(new Runnable() { // from class: ehnt
            @Override // java.lang.Runnable
            public final void run() {
                ehoc ehocVar2 = ehoc.this;
                AnimatorSet c = ehocVar2.c(true);
                c.addListener(new ehnx(ehocVar2));
                c.start();
            }
        });
    }

    public final boolean m() {
        return this.w == 48;
    }

    public final void n(int i) {
        t(i, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ehoq.c(this);
        int i = this.A;
        v(i);
        u(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h(false);
        this.s.b();
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        Activity activity;
        super.onFinishInflate();
        Context context = getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                activity = null;
                break;
            } else {
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        Window window = activity != null ? activity.getWindow() : null;
        if (window != null) {
            this.w = window.getAttributes().softInputMode;
        }
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ehnp)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ehnp ehnpVar = (ehnp) parcelable;
        super.onRestoreInstanceState(ehnpVar.d);
        this.j.setText(ehnpVar.a);
        j(ehnpVar.b == 0);
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        ehnp ehnpVar = new ehnp(super.onSaveInstanceState());
        Editable c = c();
        ehnpVar.a = c == null ? null : c.toString();
        ehnpVar.b = this.b.getVisibility();
        return ehnpVar;
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        p(f);
    }

    @Override // defpackage.ehjl
    public final void x() {
        if (s() || this.n == null || Build.VERSION.SDK_INT < 34) {
            return;
        }
        ehoc ehocVar = this.r;
        ehocVar.e.f(ehocVar.g);
        AnimatorSet animatorSet = ehocVar.f;
        if (animatorSet != null) {
            animatorSet.reverse();
        }
        ehocVar.f = null;
    }

    @Override // defpackage.ehjl
    public final void z() {
        long totalDuration;
        if (s()) {
            return;
        }
        aak c = this.r.e.c();
        if (Build.VERSION.SDK_INT < 34 || this.n == null || c == null) {
            e();
            return;
        }
        ehoc ehocVar = this.r;
        totalDuration = ehocVar.e().getTotalDuration();
        ehjw ehjwVar = ehocVar.e;
        AnimatorSet e = ehjwVar.e(ehocVar.g);
        e.setDuration(totalDuration);
        e.start();
        ehjwVar.g();
        if (ehocVar.f != null) {
            ehocVar.b(false).start();
            ehocVar.f.resume();
        }
        ehocVar.f = null;
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialSearchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i) {
        super(ehua.a(context, attributeSet, i, R.style.Widget_Material3_SearchView), attributeSet, i);
        int i2;
        this.s = new ehjq(this, this);
        this.v = new LinkedHashSet();
        this.w = 16;
        this.A = 2;
        Context context2 = getContext();
        TypedArray a = ehiz.a(context2, attributeSet, ehmy.b, i, R.style.Widget_Material3_SearchView, new int[0]);
        this.y = a.getColor(11, 0);
        int resourceId = a.getResourceId(16, -1);
        int resourceId2 = a.getResourceId(0, -1);
        String string = a.getString(3);
        String string2 = a.getString(4);
        String string3 = a.getString(24);
        boolean z = a.getBoolean(27, false);
        this.o = a.getBoolean(8, true);
        this.p = a.getBoolean(7, true);
        boolean z2 = a.getBoolean(17, false);
        this.x = a.getBoolean(9, true);
        this.t = a.getBoolean(10, true);
        a.recycle();
        LayoutInflater.from(context2).inflate(R.layout.mtrl_search_view, this);
        this.q = true;
        this.a = findViewById(R.id.open_search_view_scrim);
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = (ClippableRoundedCornerLayout) findViewById(R.id.open_search_view_root);
        this.b = clippableRoundedCornerLayout;
        this.c = findViewById(R.id.open_search_view_background);
        View findViewById = findViewById(R.id.open_search_view_status_bar_spacer);
        this.d = findViewById;
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.open_search_view_header_container);
        this.e = frameLayout;
        this.f = (FrameLayout) findViewById(R.id.open_search_view_toolbar_container);
        MaterialToolbar materialToolbar = (MaterialToolbar) findViewById(R.id.open_search_view_toolbar);
        this.g = materialToolbar;
        this.h = (Toolbar) findViewById(R.id.open_search_view_dummy_toolbar);
        TextView textView = (TextView) findViewById(R.id.open_search_view_search_prefix);
        this.i = textView;
        EditText editText = (EditText) findViewById(R.id.open_search_view_edit_text);
        this.j = editText;
        ImageButton imageButton = (ImageButton) findViewById(R.id.open_search_view_clear_button);
        this.k = imageButton;
        View findViewById2 = findViewById(R.id.open_search_view_divider);
        this.l = findViewById2;
        TouchObserverFrameLayout touchObserverFrameLayout = (TouchObserverFrameLayout) findViewById(R.id.open_search_view_content_container);
        this.m = touchObserverFrameLayout;
        this.r = new ehoc(this);
        this.u = new ehfz(context2);
        clippableRoundedCornerLayout.setOnTouchListener(new View.OnTouchListener() { // from class: ehnj
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        });
        o();
        if (resourceId != -1) {
            i2 = 0;
            frameLayout.addView(LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) frameLayout, false));
            frameLayout.setVisibility(0);
        } else {
            i2 = 0;
        }
        textView.setText(string3);
        textView.setVisibility(true != TextUtils.isEmpty(string3) ? i2 : 8);
        if (resourceId2 != -1) {
            editText.setTextAppearance(resourceId2);
        }
        editText.setText(string);
        editText.setHint(string2);
        if (z2) {
            materialToolbar.s(null);
        } else {
            materialToolbar.t(new View.OnClickListener() { // from class: ehnl
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SearchView.this.e();
                }
            });
            if (z) {
                kw kwVar = new kw(getContext());
                kwVar.a(ehdr.b(this, R.attr.colorOnSurface));
                materialToolbar.s(kwVar);
            }
        }
        imageButton.setOnClickListener(new View.OnClickListener() { // from class: ehnd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchView searchView = SearchView.this;
                searchView.j.setText("");
                searchView.g();
            }
        });
        editText.addTextChangedListener(new ehnn(this));
        touchObserverFrameLayout.a = new View.OnTouchListener() { // from class: ehnk
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                SearchView searchView = SearchView.this;
                if (!searchView.m()) {
                    return false;
                }
                searchView.d();
                return false;
            }
        };
        ehjg.i(materialToolbar, new ehje() { // from class: ehnf
            @Override // defpackage.ehje
            public final void a(View view, kxh kxhVar, ehjf ehjfVar) {
                SearchView searchView = SearchView.this;
                boolean k = ehjg.k(searchView.g);
                searchView.g.setPadding((k ? ehjfVar.c : ehjfVar.a) + kxhVar.b(), ehjfVar.b, (k ? ehjfVar.a : ehjfVar.c) + kxhVar.c(), ehjfVar.d);
            }
        });
        final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) findViewById2.getLayoutParams();
        final int i3 = marginLayoutParams.leftMargin;
        final int i4 = marginLayoutParams.rightMargin;
        kud kudVar = new kud() { // from class: ehnc
            @Override // defpackage.kud
            public final kxh ey(View view, kxh kxhVar) {
                int b = i3 + kxhVar.b();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
                marginLayoutParams2.leftMargin = b;
                marginLayoutParams2.rightMargin = i4 + kxhVar.c();
                return kxhVar;
            }
        };
        int[] iArr = kvo.a;
        kvd.k(findViewById2, kudVar);
        int identifier = getResources().getIdentifier("status_bar_height", "dimen", "android");
        i(identifier > 0 ? getResources().getDimensionPixelSize(identifier) : i2);
        kvd.k(findViewById, new kud() { // from class: ehng
            @Override // defpackage.kud
            public final kxh ey(View view, kxh kxhVar) {
                SearchView searchView = SearchView.this;
                int d = kxhVar.d();
                searchView.i(d);
                searchView.d.setVisibility(d <= 0 ? 8 : 0);
                return kxhVar;
            }
        });
    }
}
