package com.google.android.libraries.stickers.gallery;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import android.widget.LinearLayout;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.stickers.gallery.StickerGalleryActivity;
import com.google.android.libraries.stickers.packdetails.PackDetailsActivity;
import defpackage.eerf;
import defpackage.eeru;
import defpackage.eerv;
import defpackage.eety;
import defpackage.eeuc;
import defpackage.ewnk;
import defpackage.ewnp;
import defpackage.iy;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class StickerGalleryActivity extends iy implements eety {
    private int n;
    private boolean o;
    private eeuc p;
    private boolean q = false;

    private final void I() {
        if (this.q || eerv.e(this)) {
            return;
        }
        this.q = true;
        runOnUiThread(new Runnable() { // from class: eets
            @Override // java.lang.Runnable
            public final void run() {
                final StickerGalleryActivity stickerGalleryActivity = StickerGalleryActivity.this;
                ehft ehftVar = new ehft(stickerGalleryActivity);
                ehftVar.x(R.string.stickers_no_connection_alert_title);
                ehftVar.m(R.string.stickers_no_connection_alert_message);
                ehftVar.t(R.string.stickers_error_alert_ok, new DialogInterface.OnClickListener() { // from class: eetq
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        StickerGalleryActivity.this.finish();
                    }
                });
                ehftVar.r(new DialogInterface.OnCancelListener() { // from class: eetr
                    @Override // android.content.DialogInterface.OnCancelListener
                    public final void onCancel(DialogInterface dialogInterface) {
                        StickerGalleryActivity.this.finish();
                    }
                });
                ehftVar.create().show();
            }
        });
        Log.e("StickerGalleryActivity", "No internet connection.");
    }

    @Override // defpackage.eety
    public final void B() {
        finish();
    }

    @Override // defpackage.eety
    public final void C() {
        I();
    }

    @Override // defpackage.eety
    public final void D(ewnk ewnkVar) {
        setResult(-1, new Intent().putExtra("sticker", ewnkVar.toByteArray()).putExtra("interaction_source", 3));
        finish();
    }

    @Override // defpackage.eety
    public final void E(ewnp ewnpVar) {
        Intent intent = new Intent(this, (Class<?>) PackDetailsActivity.class);
        intent.putExtra("sticker_pack", ewnpVar.toByteArray());
        intent.putExtra("theme_mode", this.n);
        if (getCallingActivity() != null) {
            startActivityForResult(intent, 1);
        } else {
            startActivity(intent);
        }
    }

    @Override // defpackage.eety
    public final void F() {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("https://play.google.com/store/apps/collection/promotion_30029ba_stickers_apps_gboard"));
        try {
            startActivity(intent);
        } catch (ActivityNotFoundException e) {
            Log.e("StickerGalleryActivity", "Failed to start play store stickers intent: ".concat(intent.toString()), e);
        }
    }

    @Override // defpackage.eety
    public final boolean G() {
        return eeru.a(this.n);
    }

    @Override // defpackage.eety
    public final boolean H() {
        return this.o;
    }

    @Override // defpackage.eg, defpackage.abe, android.app.Activity
    protected final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 1) {
            setResult(-1, intent);
            finish();
        }
    }

    @Override // defpackage.abe, android.app.Activity
    public final void onBackPressed() {
        if (this.p.e()) {
            return;
        }
        super.onBackPressed();
    }

    @Override // defpackage.eg, defpackage.abe, defpackage.hl, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        this.n = getIntent().getIntExtra("theme_mode", 0);
        if (G()) {
            setTheme(R.style.StickerDarkTheme);
        }
        super.onCreate(bundle);
        ((eerf) getApplicationContext()).b();
        int intExtra = getIntent().getIntExtra("starting_page", 0);
        this.o = getIntent().getBooleanExtra("show_back_button", false);
        eeuc eeucVar = new eeuc(this, this);
        this.p = eeucVar;
        setContentView(eeucVar);
        if (intExtra != 0) {
            eeuc eeucVar2 = this.p;
            if (intExtra == 1) {
                eeucVar2.e.k(0);
                eeucVar2.c();
            } else if (intExtra == 2) {
                eeucVar2.e.k(1);
                eeucVar2.c();
            } else if (intExtra == 3) {
                eeucVar2.d();
            }
        }
        if (Build.VERSION.SDK_INT >= 27) {
            ((LinearLayout) findViewById(R.id.action_bar_root).getParent().getParent()).setSystemUiVisibility(1280);
            getWindow().getDecorView().setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: eeto
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    return windowInsets;
                }
            });
            this.p.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: eetp
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    view.setPadding(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), 0);
                    return windowInsets;
                }
            });
        }
        I();
    }
}
