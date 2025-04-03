package com.google.android.libraries.user.profile.photopicker.picker;

import android.os.Bundle;
import android.view.Menu;
import com.google.android.apps.messaging.R;
import defpackage.dvwz;
import defpackage.dvxb;
import defpackage.dvxc;
import defpackage.dvyc;
import defpackage.dwca;
import defpackage.egab;
import defpackage.egjk;
import defpackage.egrb;
import defpackage.egrd;
import defpackage.egrf;
import defpackage.egri;
import defpackage.egrk;
import defpackage.emxf;
import defpackage.enru;
import defpackage.faze;
import defpackage.fazf;
import defpackage.fdrm;
import defpackage.ffbr;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class PhotoPickerActivity extends egrd implements fazf, egri {
    private static final enru w = enru.c("com/google/android/libraries/user/profile/photopicker/picker/PhotoPickerActivity");
    public egrb o;
    public ffbr p;
    public dvyc q;
    public dvxb r;
    public ffbr s;
    public egjk t;
    public dvxc u;
    public faze v;

    @Override // defpackage.egri
    public final egrf E() {
        return (egrf) this.p.b();
    }

    @Override // defpackage.fazf
    public final faze ab() {
        return this.v;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.eg, defpackage.abe, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void onActivityResult(int r11, int r12, android.content.Intent r13) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.user.profile.photopicker.picker.PhotoPickerActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    @Override // defpackage.egrd, defpackage.eg, defpackage.abe, defpackage.hl, android.app.Activity
    public final void onCreate(Bundle bundle) {
        egab.a(this);
        egrk.a(this);
        super.onCreate(bundle);
        if (fdrm.a.get().H()) {
            emxf.b(this.o.a(), "invalid intent params");
        } else if (!this.o.a()) {
            finish();
            return;
        }
        dvwz a = this.q.b.a(89757);
        a.g(this.u);
        a.g(dwca.b());
        a.f(this.r);
        a.d(this);
        ((egrf) this.p.b()).n();
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.photo_picker_common_menu, menu);
        return true;
    }
}
