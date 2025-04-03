package com.google.android.gms.maps;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import defpackage.dhbn;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class MapView extends FrameLayout {
    public final dhbn a;

    public MapView(Context context) {
        super(context);
        this.a = new dhbn(this, context, null);
        b();
    }

    private final void b() {
        setClickable(true);
    }

    public final void a() {
        this.a.g();
    }

    public MapView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new dhbn(this, context, GoogleMapOptions.a(context, attributeSet));
        b();
    }

    public MapView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new dhbn(this, context, GoogleMapOptions.a(context, attributeSet));
        b();
    }

    public MapView(Context context, GoogleMapOptions googleMapOptions) {
        super(context);
        this.a = new dhbn(this, context, googleMapOptions);
        b();
    }
}
