package com.google.android.libraries.user.profile.photopicker.picker.intentonly.webview;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.apps.messaging.R;
import defpackage.adg;
import defpackage.ael;
import defpackage.dulp;
import defpackage.efzz;
import defpackage.egaj;
import defpackage.egrr;
import defpackage.egrs;
import defpackage.egrt;
import defpackage.egru;
import defpackage.egrv;
import defpackage.enru;
import defpackage.ewom;
import defpackage.ffcf;
import defpackage.ffew;
import defpackage.ffkj;
import defpackage.koc;
import defpackage.rif;
import defpackage.rim;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class PhotoPickerWebViewIntentActivity extends egrr {
    public static final enru o = enru.c("com/google/android/libraries/user/profile/photopicker/picker/intentonly/webview/PhotoPickerWebViewIntentActivity");
    private static final String y = egrs.a("style");
    private static final Map z = ffew.g(new ffcf("com.google.profile.photopicker.HIDE_PAST_PROFILE_PHOTOS", egrs.a("hppp")), new ffcf("com.google.profile.photopicker.HIDE_HELP_CENTER", egrs.a("hhc")));
    private String B;
    public efzz p;
    public egaj q;
    public dulp r;
    public Uri s;
    public boolean u;
    public boolean v;
    private final adg A = v(new ael(), new egrt(this));
    public String t = "UNKNOWN_PICTURE_CHANGE_SOURCE";
    public final rim w = new egru(this);
    public final rif x = new egrv(this);

    @Override // defpackage.egrr, defpackage.eg, defpackage.abe, defpackage.hl, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.progress_circle_view);
        String stringExtra = getIntent().getStringExtra("com.google.profile.photopicker.ACCOUNT");
        if (stringExtra == null) {
            throw new IllegalArgumentException("missing accountName");
        }
        this.B = stringExtra;
        Object a = koc.a(getIntent(), "output", Uri.class);
        if (a == null) {
            throw new IllegalArgumentException("missing uri");
        }
        this.s = (Uri) a;
        this.v = getIntent().getBooleanExtra("com.google.profile.photopicker.FULL_SIZE_PHOTO", false);
    }

    @Override // defpackage.eg, android.app.Activity
    protected final void onResume() {
        super.onResume();
        if (this.u) {
            return;
        }
        adg adgVar = this.A;
        Intent intent = new Intent();
        intent.setAction("com.google.android.gms.accountsettings.action.VIEW_SETTINGS");
        intent.setPackage("com.google.android.gms");
        String str = this.B;
        if (str == null) {
            ffkj.c("accountName");
            str = null;
        }
        intent.putExtra("extra.accountName", str);
        intent.putExtra("extra.screenId", ewom.OBAKE_PICTURE_PICKER_ONLY_SCREEN.qw);
        for (Map.Entry entry : z.entrySet()) {
            if (getIntent().getBooleanExtra((String) entry.getKey(), false)) {
                intent.putExtra((String) entry.getValue(), true);
            }
        }
        if (getIntent().getBooleanExtra("com.google.profile.photopicker.YOUTUBE_STYLE", false)) {
            intent.putExtra(y, "youtube");
        }
        adgVar.c(intent);
    }
}
