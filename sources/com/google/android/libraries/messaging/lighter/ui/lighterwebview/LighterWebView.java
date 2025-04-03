package com.google.android.libraries.messaging.lighter.ui.lighterwebview;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.WebView;
import android.widget.LinearLayout;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.messaging.lighter.ui.lighterwebview.LighterWebView;
import com.google.android.libraries.messaging.lighter.ui.overlay.OverlayView;
import defpackage.dzya;
import defpackage.eabk;
import defpackage.emux;
import defpackage.emxc;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class LighterWebView extends LinearLayout implements dzya {
    public final WebView a;
    public final Toolbar b;
    public final LighterWebViewHeader c;
    public emxc d;
    public emxc e;

    public LighterWebView(Context context) {
        this(context, null);
    }

    @Override // defpackage.dzya
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        throw null;
    }

    public final Boolean b(WebView webView, String str) {
        if (!str.startsWith("tel:")) {
            webView.loadUrl(str);
            return false;
        }
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse(str));
        getContext().startActivity(intent);
        return true;
    }

    public final void c(emxc emxcVar, View view) {
        view.setVisibility(0);
        if (emxcVar.g()) {
            ((OverlayView) emxcVar.c()).setVisibility(0);
        }
        setVisibility(8);
        emux emuxVar = emux.a;
        this.d = emuxVar;
        this.e = emuxVar;
    }

    public final void d(String str, final emxc emxcVar, final View view) {
        this.a.setWebViewClient(new eabk(this, emux.a));
        this.a.loadUrl(str);
        if (emxcVar.g()) {
            ((OverlayView) emxcVar.c()).setVisibility(8);
        }
        view.setVisibility(8);
        this.b.t(new View.OnClickListener() { // from class: eabg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                LighterWebView.this.c(emxcVar, view);
            }
        });
        setVisibility(0);
        this.a.getSettings().setJavaScriptEnabled(true);
        this.c.setVisibility(8);
        this.b.setVisibility(0);
        emux emuxVar = emux.a;
        this.d = emuxVar;
        this.e = emuxVar;
    }

    public LighterWebView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LighterWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        emux emuxVar = emux.a;
        this.d = emuxVar;
        this.e = emuxVar;
        inflate(getContext(), R.layout.web_view_layout, this);
        this.a = (WebView) findViewById(R.id.web_view);
        this.b = (Toolbar) findViewById(R.id.toolbar_web);
        this.c = (LighterWebViewHeader) findViewById(R.id.custom_header);
    }
}
