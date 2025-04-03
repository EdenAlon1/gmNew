package com.google.android.libraries.messaging.lighter.ui.conversation;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.messaging.lighter.ui.lighterwebview.LighterWebView;
import com.google.android.libraries.messaging.lighter.ui.lighterwebview.LighterWebViewHeader;
import com.google.android.libraries.messaging.lighter.ui.messagelist.MessageListView;
import com.google.android.libraries.messaging.lighter.ui.overlay.OverlayView;
import com.google.android.libraries.messaging.lighter.ui.statusbar.TextStatusBarHolderView;
import com.google.android.material.appbar.AppBarLayout;
import defpackage.dyhr;
import defpackage.dznc;
import defpackage.dzpw;
import defpackage.dzqb;
import defpackage.dzqo;
import defpackage.dzxh;
import defpackage.dzxi;
import defpackage.dzyb;
import defpackage.dzyd;
import defpackage.dzyk;
import defpackage.dzyu;
import defpackage.dzzi;
import defpackage.eaar;
import defpackage.eaax;
import defpackage.eabf;
import defpackage.eabl;
import defpackage.eads;
import defpackage.emux;
import defpackage.emxc;
import defpackage.fdql;
import defpackage.kvo;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class ConversationView extends FrameLayout implements dzzi {
    public final MessageListView a;
    private final LinearLayout b;
    private final AppBarLayout c;
    private eaax d;
    private final dzyu e;
    private final CoordinatorLayout f;
    private final ViewGroup g;
    private final OverlayView h;
    private final LighterWebView i;
    private final int j;
    private dzxh k;
    private dzyb l;
    private String m;
    private String n;
    private final TextStatusBarHolderView o;
    private final TextStatusBarHolderView p;

    public ConversationView(Context context) {
        this(context, null);
    }

    @Override // defpackage.dzya
    public final /* synthetic */ void a(Object obj) {
        this.g.setOnClickListener(new View.OnClickListener() { // from class: eaas
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                view.getContext();
            }
        });
        this.l = ((eaar) obj).e;
    }

    @Override // defpackage.dzzi
    public final View b() {
        return this.c;
    }

    @Override // defpackage.dzzi
    public final View c() {
        return this.b;
    }

    @Override // defpackage.dzzi
    public final dzyu d() {
        return this.e;
    }

    @Override // defpackage.dzzi
    public final eaax e() {
        return this.d;
    }

    @Override // defpackage.dzzi
    public final LighterWebView f() {
        return this.i;
    }

    @Override // defpackage.dzzi
    public final OverlayView g() {
        return this.h;
    }

    @Override // defpackage.dzzi
    public final String h() {
        return this.n;
    }

    @Override // defpackage.dzzi
    public final String i() {
        return this.m;
    }

    @Override // defpackage.dzzi
    public final void j(eads eadsVar) {
        TextStatusBarHolderView textStatusBarHolderView = this.p;
        eads eadsVar2 = textStatusBarHolderView.a;
        if (eadsVar2 != null && eadsVar2.equals(eadsVar) && textStatusBarHolderView.b()) {
            textStatusBarHolderView.removeView((View) textStatusBarHolderView.a);
            textStatusBarHolderView.a = null;
        }
    }

    @Override // defpackage.dzzi
    public final void k() {
        int[] iArr = kvo.a;
        this.b.setImportantForAccessibility(0);
        this.h.setVisibility(8);
    }

    @Override // defpackage.dzzi
    public final void l(dzxh dzxhVar) {
        this.k = dzxhVar;
    }

    @Override // defpackage.dzzi
    public final void m(String str) {
        this.n = str;
    }

    @Override // defpackage.dzzi
    public final void n(String str) {
        this.m = str;
    }

    @Override // defpackage.dzzi
    public final boolean o() {
        return this.p.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v12, types: [emxc] */
    /* JADX WARN: Type inference failed for: r1v15, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r1v26, types: [emxc] */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        String str;
        final emux emuxVar;
        boolean z;
        JSONException jSONException;
        emux emuxVar2;
        emux emuxVar3;
        emux emuxVar4 = emux.a;
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.m = (String) bundle.get("com.google.android.libraries.messaging.lighter.ui.conversation.MESSAGE_CALLBACK_PAYLOAD");
            this.n = (String) bundle.get("com.google.android.libraries.messaging.lighter.ui.conversation.PREFILL_SUGGESTION_TEXT_MESSAGE");
            Parcelable parcelable2 = bundle.getParcelable("com.google.android.libraries.messaging.lighter.ui.conversation.STATE_CONVERSATION_VIEW");
            z = bundle.getBoolean("com.google.android.libraries.messaging.lighter.ui.conversation.WEB_VIEW_VISIBILITY");
            str = bundle.getString("com.google.android.libraries.messaging.lighter.ui.conversation.WEB_VIEW_URL");
            try {
                emux c = bundle.containsKey("com.google.android.libraries.messaging.lighter.ui.conversation.CUSTOMIZED_WEB_VIEW_HEADER") ? dzpw.c(new JSONObject(bundle.getString("com.google.android.libraries.messaging.lighter.ui.conversation.CUSTOMIZED_WEB_VIEW_HEADER"))) : emuxVar4;
                try {
                    emuxVar3 = c;
                    if (bundle.containsKey("com.google.android.libraries.messaging.lighter.ui.conversation.REACTION_OVERLAY_HEADER")) {
                        emuxVar4 = dzqo.l(new JSONObject(bundle.getString("com.google.android.libraries.messaging.lighter.ui.conversation.REACTION_OVERLAY_HEADER")));
                        emuxVar3 = c;
                    }
                } catch (JSONException e) {
                    jSONException = e;
                    emuxVar2 = c;
                    dyhr.d("ConversationView", "Fail to convert customized web view or reaction overlay header to json", jSONException);
                    emuxVar3 = emuxVar2;
                    emuxVar = emuxVar4;
                    parcelable = parcelable2;
                    emuxVar4 = emuxVar3;
                    super.onRestoreInstanceState(parcelable);
                    if (z) {
                        return;
                    } else {
                        return;
                    }
                }
            } catch (JSONException e2) {
                jSONException = e2;
                emuxVar2 = emuxVar4;
            }
            emuxVar = emuxVar4;
            parcelable = parcelable2;
            emuxVar4 = emuxVar3;
        } else {
            str = null;
            emuxVar = emuxVar4;
            z = false;
        }
        super.onRestoreInstanceState(parcelable);
        if (z || str == null) {
            return;
        }
        if (!emuxVar4.g()) {
            this.i.d(str, emux.a, this.b);
            return;
        }
        final LighterWebView lighterWebView = this.i;
        Object c2 = emuxVar4.c();
        final LinearLayout linearLayout = this.b;
        final dzxh dzxhVar = this.k;
        final OverlayView overlayView = this.h;
        final boolean z2 = findViewById(R.id.app_bar).getHeight() == findViewById(R.id.app_bar).getBottom();
        final dzyb dzybVar = this.l;
        lighterWebView.a.setWebViewClient(new eabl(lighterWebView, emxc.i(dzybVar)));
        dznc dzncVar = (dznc) c2;
        lighterWebView.a.loadUrl(dzncVar.b);
        linearLayout.setVisibility(8);
        lighterWebView.setVisibility(0);
        lighterWebView.a.getSettings().setJavaScriptEnabled(true);
        lighterWebView.a.addJavascriptInterface(new eabf(lighterWebView, new Runnable() { // from class: eabj
            @Override // java.lang.Runnable
            public final void run() {
                LighterWebView.this.c(emux.a, linearLayout);
                final emxc emxcVar = emuxVar;
                if (emxcVar.g()) {
                    final OverlayView overlayView2 = overlayView;
                    boolean z3 = z2;
                    final dzxh dzxhVar2 = dzxhVar;
                    overlayView2.b((dzqo) emxcVar.c(), z3);
                    Object c3 = emxcVar.c();
                    View.OnClickListener onClickListener = new View.OnClickListener() { // from class: eabh
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            emxc emxcVar2 = emxc.this;
                            if (((dznr) emxcVar2.c()).a.g()) {
                                dzxhVar2.a((dzjn) ((dznr) emxcVar2.c()).a.c());
                            }
                            overlayView2.setVisibility(8);
                        }
                    };
                    if (OverlayView.c(overlayView2.c)) {
                        overlayView2.c.setOnClickListener(onClickListener);
                    }
                    if (((dznr) c3).h) {
                        overlayView2.setOnClickListener(onClickListener);
                        overlayView2.b.setClickable(false);
                        overlayView2.b.setOnClickListener(null);
                    } else {
                        overlayView2.b.setClickable(false);
                        overlayView2.setOnClickListener(null);
                    }
                    if (((dznr) emxcVar.c()).h) {
                        overlayView2.postDelayed(new Runnable() { // from class: eadj
                            @Override // java.lang.Runnable
                            public final void run() {
                                OverlayView.this.requestFocus();
                            }
                        }, 100L);
                    } else {
                        overlayView2.requestFocus();
                        overlayView2.sendAccessibilityEvent(32768);
                    }
                    overlayView2.postDelayed(new Runnable() { // from class: eabi
                        @Override // java.lang.Runnable
                        public final void run() {
                            OverlayView.this.setVisibility(8);
                        }
                    }, TimeUnit.SECONDS.toMillis(((dznr) emxcVar.c()).e));
                }
                dzyb dzybVar2 = dzybVar;
                if (dzybVar2 != null) {
                    ((eaau) dzybVar2).d(126);
                }
            }
        }), "LighterEmbeddedWebBridge");
        lighterWebView.b.setVisibility(8);
        dzqo dzqoVar = dzncVar.a;
        boolean g = dzqoVar.g().g();
        LighterWebViewHeader lighterWebViewHeader = lighterWebView.c;
        if (g) {
            dzqb dzqbVar = (dzqb) dzqoVar.g().c();
            lighterWebViewHeader.a.setImageBitmap(BitmapFactory.decodeByteArray(dzqbVar.e(), 0, dzqbVar.e().length));
            lighterWebViewHeader.a.setContentDescription(dzqbVar.d());
        }
        if (dzqoVar.e().g()) {
            lighterWebViewHeader.b.setText(dzqoVar.e().c());
        }
        lighterWebViewHeader.setVisibility(0);
        LighterWebViewHeader.a(lighterWebViewHeader.a, dzqoVar.g().g());
        LighterWebViewHeader.a(lighterWebViewHeader.b, dzqoVar.e().g());
        LighterWebViewHeader.a(lighterWebViewHeader.c, dzqoVar.c().g());
        lighterWebView.d = emxc.j(c2);
        lighterWebView.e = emuxVar;
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.libraries.messaging.lighter.ui.conversation.STATE_CONVERSATION_VIEW", onSaveInstanceState);
        bundle.putString("com.google.android.libraries.messaging.lighter.ui.conversation.MESSAGE_CALLBACK_PAYLOAD", this.m);
        bundle.putString("com.google.android.libraries.messaging.lighter.ui.conversation.PREFILL_SUGGESTION_TEXT_MESSAGE", this.n);
        bundle.putBoolean("com.google.android.libraries.messaging.lighter.ui.conversation.WEB_VIEW_VISIBILITY", findViewById(R.id.lighter_web_view_body).getVisibility() == 0);
        bundle.putString("com.google.android.libraries.messaging.lighter.ui.conversation.WEB_VIEW_URL", this.i.a.getUrl());
        if (this.i.d.g()) {
            emxc d = dzpw.d((dzpw) this.i.d.c());
            if (d.g()) {
                bundle.putString("com.google.android.libraries.messaging.lighter.ui.conversation.CUSTOMIZED_WEB_VIEW_HEADER", ((JSONObject) d.c()).toString());
            }
        }
        if (this.i.e.g()) {
            emxc m = ((dzqo) this.i.e.c()).m();
            if (m.g()) {
                bundle.putString("com.google.android.libraries.messaging.lighter.ui.conversation.REACTION_OVERLAY_HEADER", ((JSONObject) m.c()).toString());
            }
        }
        return bundle;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Object obj = this.e;
        int computeVerticalScrollRange = this.a.computeVerticalScrollRange();
        int height = (i2 - ((View) obj).getHeight()) - this.j;
        if (this.o.b()) {
            height -= this.o.getHeight();
        }
        if (o()) {
            height -= this.p.getHeight();
        }
        if (height < computeVerticalScrollRange + dzyk.a(getContext(), 30.0f)) {
            this.c.n(false, true);
            this.a.setNestedScrollingEnabled(true);
        } else {
            this.c.n(true, true);
            this.a.setNestedScrollingEnabled(false);
        }
    }

    @Override // defpackage.dzzi
    public final MessageListView p() {
        return this.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dzzi
    public final void q(eads eadsVar) {
        TextStatusBarHolderView textStatusBarHolderView = this.p;
        if (textStatusBarHolderView.b()) {
            return;
        }
        textStatusBarHolderView.a = eadsVar;
        View view = (View) eadsVar;
        view.setVisibility(0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.weight = 1.0f;
        textStatusBarHolderView.addView(view, layoutParams);
    }

    public ConversationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ConversationView(Context context, AttributeSet attributeSet, int i) {
        super(dzyd.a(context, fdql.i()), attributeSet, i);
        this.k = dzxi.a;
        inflate(getContext(), R.layout.conversation_view_layout, this);
        this.b = (LinearLayout) findViewById(R.id.conversation_body);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) findViewById(R.id.coordinator_body);
        this.f = coordinatorLayout;
        this.d = (eaax) findViewById(R.id.conversation_header);
        this.a = (MessageListView) findViewById(R.id.messages_list);
        AppBarLayout appBarLayout = (AppBarLayout) findViewById(R.id.app_bar);
        this.c = appBarLayout;
        this.o = (TextStatusBarHolderView) findViewById(R.id.top_status_bar_holder);
        this.p = (TextStatusBarHolderView) findViewById(R.id.bottom_status_bar_holder);
        this.e = (dzyu) findViewById(R.id.compose_view);
        this.g = (ViewGroup) findViewById(R.id.composer_entrypoint_view);
        OverlayView overlayView = (OverlayView) findViewById(R.id.conv_overlay_view);
        this.h = overlayView;
        this.j = getResources().getDimensionPixelSize(R.dimen.header_expanded_height);
        coordinatorLayout.setOnTouchListener(new View.OnTouchListener() { // from class: eaat
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        });
        overlayView.setVisibility(8);
        this.i = (LighterWebView) findViewById(R.id.lighter_web_view_body);
        appBarLayout.n(true, false);
        appBarLayout.j(this.d);
    }
}
