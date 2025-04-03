package com.google.android.apps.messaging.ui.mediapicker.c2o.location;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.mediapicker.c2o.location.LocationContentCategoryView;
import com.google.android.gms.maps.MapView;
import defpackage.cxqk;
import defpackage.dcai;
import defpackage.dcal;
import defpackage.dcjn;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class LocationContentCategoryView extends dcjn implements dcal {
    public dcai a;
    public View b;
    public View c;
    public cxqk d;
    private View e;
    private MapView f;
    private View g;

    public LocationContentCategoryView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // defpackage.dcal
    public final int a() {
        return 5;
    }

    @Override // defpackage.dcal
    public final void b(dcai dcaiVar) {
        this.a = dcaiVar;
    }

    public final void e(boolean z) {
        this.c.setVisibility(true != z ? 0 : 8);
        MapView mapView = this.f;
        int i = true != z ? 8 : 0;
        mapView.setVisibility(i);
        this.e.setVisibility(i);
        this.g.setVisibility(this.f.getVisibility());
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.e = findViewById(R.id.location_content_text_bubble);
        this.b = findViewById(R.id.location_category_permission_view);
        MapView mapView = (MapView) findViewById(R.id.location_content_map_view);
        this.f = mapView;
        mapView.setClickable(false);
        this.c = findViewById(R.id.location_content_map_loading_indicator);
        View findViewById = findViewById(R.id.location_content_map_touch_target);
        this.g = findViewById;
        findViewById.setOnClickListener(this.d.a(new View.OnClickListener() { // from class: dcjw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LocationContentCategoryView locationContentCategoryView = LocationContentCategoryView.this;
                locationContentCategoryView.a.a(locationContentCategoryView);
            }
        }));
        setClipToOutline(true);
    }
}
