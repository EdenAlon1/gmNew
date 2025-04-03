package com.google.android.libraries.user.profile.photopicker.picker.intentonly;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import com.google.android.apps.messaging.R;
import defpackage.dvwz;
import defpackage.dvxb;
import defpackage.dvxc;
import defpackage.dvyc;
import defpackage.dwca;
import defpackage.ecvo;
import defpackage.efzz;
import defpackage.egab;
import defpackage.egqe;
import defpackage.egqf;
import defpackage.egqg;
import defpackage.egrb;
import defpackage.egrf;
import defpackage.egri;
import defpackage.egrj;
import defpackage.egrk;
import defpackage.egrm;
import defpackage.emux;
import defpackage.emwl;
import defpackage.emxc;
import defpackage.emxf;
import defpackage.enfc;
import defpackage.enrr;
import defpackage.enru;
import defpackage.faze;
import defpackage.fazf;
import defpackage.fdrm;
import defpackage.ffbr;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class PhotoPickerIntentActivity extends egrm implements fazf, egri {
    private static final enru x = enru.c("com/google/android/libraries/user/profile/photopicker/picker/intentonly/PhotoPickerIntentActivity");
    public egrb o;
    public ffbr p;
    public dvyc q;
    public dvxb r;
    public egrj s;
    public efzz t;
    public egqg u;
    public dvxc v;
    public faze w;

    @Override // defpackage.egri
    public final egrf E() {
        return (egrf) this.p.b();
    }

    @Override // defpackage.fazf
    public final faze ab() {
        return this.w;
    }

    @Override // defpackage.eg, defpackage.abe, android.app.Activity
    protected final void onActivityResult(int i, int i2, Intent intent) {
        Uri uri;
        super.onActivityResult(i, i2, intent);
        enru enruVar = x;
        ((enrr) ((enrr) enruVar.e()).h("com/google/android/libraries/user/profile/photopicker/picker/intentonly/PhotoPickerIntentActivity", "onActivityResult", 151, "PhotoPickerIntentActivity.java")).r("onActivityResult with requestCode: %d", i);
        if (i2 == -1 && i == 10000 && intent != null) {
            ((enrr) ((enrr) enruVar.e()).h("com/google/android/libraries/user/profile/photopicker/picker/intentonly/PhotoPickerIntentActivity", "onActivityResult", 158, "PhotoPickerIntentActivity.java")).q("onActivityResult for REQUEST_IMAGE_EDIT");
            Uri data = intent.getData();
            Intent intent2 = getIntent();
            if (intent2 == null || intent2.getExtras() == null) {
                setResult(0);
                finish();
                uri = null;
            } else {
                uri = (Uri) intent2.getExtras().getParcelable("output");
            }
            if (data == null || uri == null) {
                return;
            }
            try {
                Bitmap a = this.t.a(data);
                Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
                FileOutputStream fileOutputStream = new FileOutputStream(uri.getPath());
                try {
                    a.compress(compressFormat, 100, fileOutputStream);
                    fileOutputStream.close();
                    Intent intent3 = new Intent();
                    intent3.setData(uri);
                    setResult(-1, intent3);
                    ((enrr) ((enrr) enruVar.e()).h("com/google/android/libraries/user/profile/photopicker/picker/intentonly/PhotoPickerIntentActivity", "onActivityResult", 168, "PhotoPickerIntentActivity.java")).q("onActivityResult - finish the activity for the Photo Picker Intent variant here.");
                    this.s.a();
                    finish();
                } finally {
                }
            } catch (IOException unused) {
                ((enrr) ((enrr) x.e()).h("com/google/android/libraries/user/profile/photopicker/picker/intentonly/PhotoPickerIntentActivity", "onActivityResult", 173, "PhotoPickerIntentActivity.java")).r("onActivityResult with requestCode: %d", 10000);
            }
        }
    }

    @Override // defpackage.egrm, defpackage.eg, defpackage.abe, defpackage.hl, android.app.Activity
    public final void onCreate(Bundle bundle) {
        if (getIntent().getBooleanExtra("com.google.profile.photopicker.SET_PHENOTYPE_CONTEXT", false)) {
            ecvo.f(this);
        }
        egab.a(this);
        egrk.a(this);
        super.onCreate(bundle);
        emxf.b(this.o.a(), "invalid intent params");
        dvwz a = this.q.b.a(89757);
        a.g(this.v);
        a.g(dwca.b());
        a.f(this.r);
        a.d(this);
        boolean booleanExtra = getIntent().getBooleanExtra("skip_google_photos", false);
        if (!fdrm.q()) {
            if (booleanExtra) {
                ((egrf) this.p.b()).j();
                return;
            } else {
                ((egrf) this.p.b()).g();
                fdrm.y();
                return;
            }
        }
        this.u.b(egqe.GOOGLE_PHOTOS, !booleanExtra);
        if (this.u.a().size() == 1 && egqe.DEVICE_PHOTOS.equals(((egqf) this.u.a().get(0)).e())) {
            ((egrf) this.p.b()).j();
        } else {
            Iterator it = enfc.d(this.u.a()).h().iterator();
            int ordinal = ((egqe) (it.hasNext() ? emxc.j(it.next()) : emux.a).b(new emwl() { // from class: egrn
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    return ((egqf) obj).e();
                }
            }).e(egqe.DEVICE_PHOTOS)).ordinal();
            if (ordinal == 0) {
                ((egrf) this.p.b()).f();
            } else if (ordinal == 1) {
                ((egrf) this.p.b()).h();
            } else if (ordinal == 2) {
                ((egrf) this.p.b()).g();
            } else if (ordinal == 3) {
                ((egrf) this.p.b()).i();
            }
        }
        fdrm.y();
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.photo_picker_common_menu, menu);
        return true;
    }
}
