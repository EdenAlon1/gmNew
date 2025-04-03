package com.google.android.apps.messaging.ui.mediapicker.c2o.location.picker;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.Base64;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowInsets;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.mediapicker.c2o.location.LocationContentItem;
import com.google.android.apps.messaging.ui.mediapicker.c2o.location.picker.LocationAttachmentPickerActivity;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.internal.IMarkerDelegate;
import defpackage.akzt;
import defpackage.bdws;
import defpackage.bdwt;
import defpackage.bzqa;
import defpackage.bzwd;
import defpackage.bzyb;
import defpackage.cazn;
import defpackage.cg;
import defpackage.crjx;
import defpackage.cskc;
import defpackage.dcka;
import defpackage.dckc;
import defpackage.dckg;
import defpackage.dckk;
import defpackage.dckl;
import defpackage.dckm;
import defpackage.dcks;
import defpackage.dckt;
import defpackage.dckw;
import defpackage.dcla;
import defpackage.ddxt;
import defpackage.ddxu;
import defpackage.ddzb;
import defpackage.dhbd;
import defpackage.dhbe;
import defpackage.dhbf;
import defpackage.dhbg;
import defpackage.dhbh;
import defpackage.dhbi;
import defpackage.dhbj;
import defpackage.dhbo;
import defpackage.dhbp;
import defpackage.dhbq;
import defpackage.dhbx;
import defpackage.dhce;
import defpackage.dhcp;
import defpackage.dhcw;
import defpackage.edqc;
import defpackage.ehdr;
import defpackage.enrr;
import defpackage.enru;
import defpackage.eohh;
import defpackage.epto;
import defpackage.epts;
import defpackage.evju;
import defpackage.eyfc;
import defpackage.eyfy;
import defpackage.eygu;
import defpackage.ezom;
import j$.net.URLEncoder;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class LocationAttachmentPickerActivity extends dckc implements dhbq, dcks {
    public static final enru K = enru.c("com/google/android/apps/messaging/ui/mediapicker/c2o/location/picker/LocationAttachmentPickerActivity");
    TextView L;
    TextView M;
    ImageView N;
    View O;
    public crjx P;
    public akzt Q;
    public dckt R;
    public bzqa S;
    public bzyb T;
    private dckw V;
    private dcka W;
    private RecyclerView X;
    private ImageView Y;
    private TextView Z;
    private View aa;
    private View ab;
    private View ac;
    private MenuItem ad;
    private int ae;
    private TextView af;

    private final void aq() {
        MenuItem menuItem = this.ad;
        if (menuItem != null) {
            menuItem.setVisible(false);
            this.ad.setEnabled(false);
        }
        this.aa.setVisibility(0);
        this.ac.setVisibility(8);
        this.X.setVisibility(8);
    }

    @Override // defpackage.dcks
    public final void D() {
        MenuItem menuItem = this.ad;
        if (menuItem == null || !menuItem.isActionViewExpanded()) {
            return;
        }
        this.ad.collapseActionView();
    }

    @Override // defpackage.dcks
    public final void F() {
        if (this.aa.getVisibility() == 0) {
            MenuItem menuItem = this.ad;
            if (menuItem != null) {
                menuItem.setVisible(true);
                this.ad.setEnabled(true);
            }
            this.aa.setVisibility(8);
            this.X.setVisibility(8);
            this.ac.setVisibility(0);
        }
    }

    @Override // defpackage.dcks
    public final void H(cazn caznVar) {
        String format;
        Intent intent = new Intent();
        int i = caznVar.e - 1;
        cskc cskcVar = bdwt.a;
        if (i != 1) {
            if (i == 2) {
                edqc edqcVar = caznVar.b;
                ezom ezomVar = null;
                try {
                    String ac = edqcVar.ac();
                    ac.getClass();
                    ezom ezomVar2 = (ezom) eyfy.parseFrom(ezom.a, Base64.decode(ac, 8), eyfc.a());
                    if (ezomVar2 != null && (ezomVar2.b & 1) != 0) {
                        if (ezomVar2.d.isEmpty()) {
                            ezomVar = ezomVar2;
                        }
                    }
                } catch (eygu unused) {
                    ((enrr) bdwt.a.j().h("com/google/android/apps/messaging/shared/datamodel/data/util/LocationUtils", "getPlaceId", 272, "LocationUtils.java")).t("Unable to parse place id: %s.", edqcVar.ac());
                }
                if (ezomVar != null) {
                    evju evjuVar = ezomVar.c;
                    if (evjuVar == null) {
                        evjuVar = evju.a;
                    }
                    String hexString = Long.toHexString(evjuVar.c);
                    evju evjuVar2 = ezomVar.c;
                    if (evjuVar2 == null) {
                        evjuVar2 = evju.a;
                    }
                    format = String.format(Locale.US, "https://www.google.com/maps/place/@/data=!4m2!3m1!1s0x%1s:0x%2s", hexString, Long.toHexString(evjuVar2.d));
                }
            }
            format = "";
        } else {
            try {
                CharSequence a = caznVar.a();
                if (a != null) {
                    format = String.format(Locale.US, "https://www.google.com/maps/search/?api=1&query=%s", URLEncoder.encode(a.toString().replace(",", " "), StandardCharsets.UTF_8.name()));
                }
            } catch (UnsupportedEncodingException e) {
                bdwt.a.s("Exception getting map website.", e);
            }
            format = "";
        }
        if (TextUtils.isEmpty(format)) {
            LatLng latLng = caznVar.a;
            format = bdws.a(latLng.a, latLng.b);
        }
        intent.putExtra("location_url", format);
        intent.setData(Uri.EMPTY);
        Location location = new Location("Bugler");
        location.setLatitude(caznVar.a.a);
        location.setLongitude(caznVar.a.b);
        intent.putExtra("location_extra", location);
        int i2 = caznVar.f;
        intent.putExtra("location_source_extra", eohh.LOCATION_CURRENT.a());
        setResult(-1, intent);
        finish();
    }

    @Override // defpackage.dbxx
    protected final epts M() {
        return epts.LOCATION;
    }

    @Override // defpackage.dbxx
    protected final Class N() {
        return LocationContentItem.class;
    }

    @Override // defpackage.dcks
    public final void ag() {
        finish();
    }

    @Override // defpackage.dcks
    public final void ah() {
        this.af.setText(R.string.location_attachment_picker_location_error);
    }

    @Override // defpackage.dcks
    public final void ai() {
        dckw dckwVar = this.V;
        if (dckwVar.d != 3) {
            dckwVar.d = 3;
            dckwVar.p();
        }
    }

    @Override // defpackage.dcks
    public final void aj() {
        aq();
        this.ab.setOnClickListener(new View.OnClickListener() { // from class: dckh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LocationAttachmentPickerActivity.this.startActivity(new Intent("com.google.android.gsf.GOOGLE_APPS_LOCATION_SETTINGS"));
            }
        });
    }

    @Override // defpackage.dcks
    public final void ak() {
        dckw dckwVar = this.V;
        if (dckwVar.d != 1) {
            dckwVar.d = 1;
            dckwVar.p();
        }
    }

    @Override // defpackage.dcks
    public final void al() {
        aq();
        this.ab.setOnClickListener(new View.OnClickListener() { // from class: dckd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LocationAttachmentPickerActivity.this.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
            }
        });
    }

    @Override // defpackage.dcks
    public final void am(LatLng latLng) {
        if (this.W != null) {
            dhce dhceVar = new dhce();
            dhceVar.b(latLng);
            dhceVar.a = 17.0f;
            dhceVar.c = 0.0f;
            dhceVar.b = 0.0f;
            try {
                this.W.a.b(new dhbd(dhbe.a().newCameraPosition(dhceVar.a())));
            } catch (RemoteException e) {
                throw new dhcw(e);
            }
        }
    }

    @Override // defpackage.dcks
    public final void an(LatLng latLng) {
        dcka dckaVar = this.W;
        if (dckaVar != null) {
            try {
                dckaVar.a.a.clear();
                MarkerOptions markerOptions = new MarkerOptions();
                if (latLng == null) {
                    throw new IllegalArgumentException("latlng cannot be null - a position is required.");
                }
                markerOptions.a = latLng;
                markerOptions.b = getString(R.string.location_attachment_picker_marker_title);
                try {
                    IMarkerDelegate addMarker = this.W.a.a.addMarker(markerOptions);
                    if (addMarker != null) {
                        if (markerOptions.o == 1) {
                            new dhcp(addMarker);
                        } else {
                            new dhcp(addMarker);
                        }
                    }
                } catch (RemoteException e) {
                    throw new dhcw(e);
                }
            } catch (RemoteException e2) {
                throw new dhcw(e2);
            }
        }
    }

    @Override // defpackage.dcks
    public final void ao(String str, Bitmap bitmap, int i) {
        dckw dckwVar = this.V;
        if (i <= 0 || i >= dckwVar.a.size()) {
            return;
        }
        cazn caznVar = (cazn) dckwVar.a.get(i - 1);
        if (TextUtils.equals(caznVar.b.ac(), str)) {
            caznVar.c = bitmap;
            dckwVar.q(i);
        }
    }

    @Override // defpackage.dcks
    public final void ap(cazn caznVar, boolean z) {
        String string;
        this.af.setText(R.string.location_attachment_picker_send_location);
        ddzb.j(this.M, caznVar.d());
        ddzb.j(this.L, caznVar.c());
        int d = ehdr.d(this, R.attr.colorOnSurfaceVariant, "LocationAttachmentPickerActivity");
        this.Y.setImageResource(R.drawable.quantum_gm_ic_location_on_grey600_24);
        this.Y.setImageTintList(ColorStateList.valueOf(d));
        int i = this.ae;
        ArrayList arrayList = new ArrayList();
        CharSequence d2 = caznVar.d();
        if (!TextUtils.isEmpty(d2)) {
            arrayList.add(d2);
        }
        CharSequence c = caznVar.c();
        if (!TextUtils.isEmpty(c)) {
            arrayList.add(c);
        }
        String join = TextUtils.join(" ", arrayList);
        View view = this.O;
        if (i == 10) {
            string = getString(R.string.location_attachment_picker_send_sms_content_description, new Object[]{join});
        } else if (i != 20) {
            bzyb bzybVar = this.T;
            string = getString(R.string.location_attachment_picker_send_content_description, new Object[]{join});
            if (i == 40 && bzwd.f()) {
                string = bzybVar.a.getString(R.string.location_attachment_picker_send_encrypted_content_description, join);
            }
        } else {
            string = getString(R.string.location_attachment_picker_send_mms_content_description, new Object[]{join});
        }
        view.setContentDescription(string);
        if (z) {
            this.O.sendAccessibilityEvent(8);
        }
    }

    @Override // defpackage.dhbq
    public final void c(dhbj dhbjVar) {
        dcka dckaVar = new dcka(dhbjVar);
        this.W = dckaVar;
        dhbj dhbjVar2 = dckaVar.a;
        try {
            if (this.R == null) {
                dhbjVar2.a.setLocationSource(null);
            } else {
                dhbjVar2.a.setLocationSource(new dhbh());
            }
            try {
                this.W.a.a().a.setCompassEnabled(false);
                try {
                    this.W.a.a().a.setRotateGesturesEnabled(false);
                    this.W.a.a().a();
                    if (this.P.g()) {
                        dcka dckaVar2 = this.W;
                        dckaVar2.a.d(MapStyleOptions.a(this));
                    }
                    try {
                        this.W.a.a.setOnMapClickListener(new dhbi(new dckg(this)));
                        try {
                            this.W.a.a.setOnMarkerDragListener(new dhbg(new dckm(this)));
                            try {
                                this.W.a.a.setOnMarkerClickListener(new dhbf());
                                this.R.g();
                                af(epto.LOADED);
                            } catch (RemoteException e) {
                                throw new dhcw(e);
                            }
                        } catch (RemoteException e2) {
                            throw new dhcw(e2);
                        }
                    } catch (RemoteException e3) {
                        throw new dhcw(e3);
                    }
                } catch (RemoteException e4) {
                    throw new dhcw(e4);
                }
            } catch (RemoteException e5) {
                throw new dhcw(e5);
            }
        } catch (RemoteException e6) {
            throw new dhcw(e6);
        }
    }

    @Override // defpackage.dbxx, defpackage.cwpv, defpackage.cwps, defpackage.cwqf, defpackage.efac, defpackage.eg, defpackage.abe, defpackage.hl, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.ae = getIntent().getIntExtra("message_type", -1);
        setContentView(R.layout.location_attachment_picker_activity_m2_nearby_hidden);
        dckw dckwVar = new dckw(getApplicationContext(), this.R);
        new dcla(this.R);
        this.R.d = new WeakReference(this);
        this.V = dckwVar;
        int i = this.ae;
        this.ac = findViewById(R.id.main_container);
        this.af = (TextView) findViewById(R.id.select_location_bar_label);
        this.L = (TextView) findViewById(R.id.select_location_bar_subtitle);
        this.M = (TextView) findViewById(R.id.select_location_bar_title);
        this.N = (ImageView) findViewById(R.id.my_location_button);
        this.O = findViewById(R.id.select_location_bar_container);
        this.Y = (ImageView) findViewById(R.id.select_location_bar_info_icon);
        TextView textView = (TextView) findViewById(R.id.select_location_bar_send_text);
        this.Z = textView;
        ddzb.j(textView, (i == 10 || i == 11) ? getString(R.string.sms_text) : i != 20 ? "" : getString(R.string.mms_text));
        this.O.setOnClickListener(new View.OnClickListener() { // from class: dcki
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dckt dcktVar = LocationAttachmentPickerActivity.this.R;
                if (dcktVar.f == null) {
                    return;
                }
                dcks dcksVar = (dcks) dcktVar.d.get();
                int i2 = dcktVar.f.f;
                dcktVar.g.c("Bugle.Share.LocationAttachmentPicker.CurrentLocationSent");
                if (dcksVar != null) {
                    dcksVar.H(dcktVar.f);
                }
            }
        });
        this.N.setOnClickListener(new View.OnClickListener() { // from class: dckj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LocationAttachmentPickerActivity.this.R.e();
            }
        });
        this.X = (RecyclerView) findViewById(R.id.search_results_list);
        this.aa = findViewById(R.id.location_permissions_needed_container);
        this.ab = findViewById(R.id.location_permissions_needed_button);
        if (this.S.q()) {
            ((ImageView) findViewById(R.id.select_location_bar_send_icon)).setImageDrawable(i == -2 ? getDrawable(R.drawable.gs_done_vd_theme_24) : this.T.a(i));
        }
        dhbx dhbxVar = new dhbx();
        cg cgVar = new cg(a());
        cgVar.s(R.id.map_container, dhbxVar);
        cgVar.k();
        dhbp.b(getApplicationContext(), dhbo.LATEST, new dckk(this, dhbxVar));
        View findViewById = findViewById(R.id.activity_location_browser);
        findViewById.setSystemUiVisibility(1792);
        findViewById.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: dcke
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                view.setPadding(windowInsets.getSystemWindowInsetLeft(), 0, windowInsets.getSystemWindowInsetRight(), 0);
                return windowInsets;
            }
        });
        this.ac.setOnApplyWindowInsetsListener(new ddxu(new ddxt() { // from class: dckf
            @Override // defpackage.ddxt
            public final void a(View view, WindowInsets windowInsets) {
                view.setPadding(0, windowInsets.getSystemWindowInsetTop(), 0, windowInsets.getSystemWindowInsetBottom());
            }
        }));
        gE().b(this, new dckl(this));
    }

    @Override // defpackage.cwpv, defpackage.efac, android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.location_attachment_picker_menu_m2, menu);
        MenuItem findItem = menu.findItem(R.id.location_attachment_picker_menu_search);
        this.ad = findItem;
        findItem.setVisible(false);
        return true;
    }

    @Override // defpackage.cwqf, defpackage.efac, defpackage.iy, defpackage.eg, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        dckt dcktVar = this.R;
        dcktVar.b.d(dcktVar);
    }

    @Override // defpackage.cwpv, defpackage.cwps, defpackage.efac, defpackage.eg, android.app.Activity
    public final void onPause() {
        super.onPause();
        dckt dcktVar = this.R;
        dcktVar.b.d(dcktVar);
    }

    @Override // defpackage.cwpv, defpackage.cwps, defpackage.efac, defpackage.eg, android.app.Activity
    public final void onResume() {
        super.onResume();
        this.R.g();
    }
}
