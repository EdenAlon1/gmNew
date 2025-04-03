package com.google.android.libraries.user.profile.photopicker.fragment.devicephotos;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.user.profile.photopicker.fragment.devicephotos.DevicePhotosFragment;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textview.MaterialTextView;
import defpackage.adf;
import defpackage.adg;
import defpackage.aek;
import defpackage.ael;
import defpackage.dvxi;
import defpackage.dvxy;
import defpackage.dvyc;
import defpackage.egad;
import defpackage.egaj;
import defpackage.egcx;
import defpackage.egdg;
import defpackage.eghl;
import defpackage.eghm;
import defpackage.egjc;
import defpackage.egjk;
import defpackage.egll;
import defpackage.egls;
import defpackage.eglt;
import defpackage.eglu;
import defpackage.egrf;
import defpackage.emux;
import defpackage.emxc;
import defpackage.emyg;
import defpackage.engw;
import defpackage.enou;
import defpackage.exft;
import defpackage.exfu;
import defpackage.exgb;
import defpackage.exgc;
import defpackage.exgd;
import defpackage.exge;
import defpackage.exgf;
import defpackage.exgg;
import defpackage.fazg;
import defpackage.fdrm;
import defpackage.ffbr;
import defpackage.iv;
import defpackage.koa;
import defpackage.llh;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class DevicePhotosFragment extends eglu {
    public eghm a;
    public dvxi ag;
    public egad ah;
    public egjk ai;
    public egdg aj;
    public egcx ak;
    public ffbr al;
    public emxc am;
    public adg an;
    public adg ao;
    public egls ap;
    public iv aq;
    public emxc ar;
    private adg at;
    private adg au;
    private MaterialTextView av;
    private View aw;
    private MaterialButton ax;
    private RecyclerView ay;
    private boolean az = false;
    public eglt b;
    public egrf c;
    public dvyc d;
    public dvxy e;

    private final void aT(boolean z) {
        if (koa.c(z(), "android.permission.READ_EXTERNAL_STORAGE") == 0) {
            q();
            r(0);
        } else if (aN("android.permission.READ_EXTERNAL_STORAGE")) {
            r(1);
            f(emux.a);
        } else if (z) {
            b();
        } else {
            r(2);
            f(emux.a);
        }
    }

    @Override // defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(true != fdrm.l() ? R.layout.photo_picker_device_photos_fragment : R.layout.photo_picker_device_photos_fragment_art_style, viewGroup, false);
        this.d.b.a(110513).b(inflate);
        return inflate;
    }

    public final void a() {
        emxc j;
        if (this.ar.g()) {
            Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
            intent.putExtra("output", (Parcelable) this.ar.c());
            j = emxc.j(intent);
        } else {
            if (Log.isLoggable("DevicePhotosFragment", 5)) {
                Log.w("DevicePhotosFragment", "Uri for camera photo camera_image.jpg is not present");
            }
            j = emux.a;
        }
        if (j.g()) {
            this.au.c(j.c());
        }
    }

    @Override // defpackage.ea
    public final void ae(Bundle bundle) {
        super.ae(bundle);
        this.ay = (RecyclerView) this.Q.findViewById(R.id.photo_picker_device_photos_grid);
        this.d.b.a(89737).b(this.ay);
        z();
        this.ay.ap(new GridLayoutManager(this.ay.getResources().getInteger(R.integer.photo_picker_num_columns)));
        eglt egltVar = this.b;
        egll egllVar = new egll(this);
        egaj egajVar = (egaj) egltVar.a.b();
        egajVar.getClass();
        dvxi dvxiVar = (dvxi) egltVar.b.b();
        dvxiVar.getClass();
        dvyc dvycVar = (dvyc) egltVar.c.b();
        dvycVar.getClass();
        egjk egjkVar = (egjk) egltVar.d.b();
        egjkVar.getClass();
        egcx egcxVar = (egcx) egltVar.e.b();
        egcxVar.getClass();
        egls eglsVar = new egls(egajVar, dvxiVar, dvycVar, egjkVar, egcxVar, egllVar);
        this.ap = eglsVar;
        this.ay.am(eglsVar);
        egls eglsVar2 = this.ap;
        int i = engw.d;
        eglsVar2.m(enou.a);
        this.av = (MaterialTextView) this.Q.findViewById(R.id.photo_picker_device_photos_permissions_message);
        this.aw = this.Q.findViewById(R.id.photo_picker_device_photos_permission_buttons_container);
        MaterialButton materialButton = (MaterialButton) this.Q.findViewById(R.id.photo_picker_device_photos_permission_button);
        this.ax = materialButton;
        materialButton.setOnClickListener(new View.OnClickListener() { // from class: egli
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DevicePhotosFragment devicePhotosFragment = DevicePhotosFragment.this;
                devicePhotosFragment.ag.a(dvxh.e(), view);
                devicePhotosFragment.b();
            }
        });
        this.d.b.a(89728).b(this.ax);
        this.ar = emxc.i(this.ah.a("camera_image.jpg"));
        emyg emygVar = (emyg) this.al.b();
        emygVar.e();
        emygVar.f();
        this.am = emxc.j(emygVar);
        egdg egdgVar = this.aj;
        exgd exgdVar = (exgd) exge.a.createBuilder();
        exgdVar.copyOnWrite();
        exge exgeVar = (exge) exgdVar.instance;
        exgeVar.c = 22;
        exgeVar.b |= 1;
        egdgVar.e((exge) exgdVar.build());
        final Snackbar q = Snackbar.q(this.Q, R.string.op3_something_went_wrong, -2);
        this.a.a.f(Q(), new llh() { // from class: eglk
            @Override // defpackage.llh
            public final void a(Object obj) {
                eghl eghlVar = (eghl) obj;
                boolean g = eghlVar.a().g();
                DevicePhotosFragment devicePhotosFragment = DevicePhotosFragment.this;
                if (g) {
                    q.i();
                } else {
                    devicePhotosFragment.ap.m(eghlVar.b());
                }
                devicePhotosFragment.f(emxc.j(eghlVar));
            }
        });
    }

    @Override // defpackage.ea
    public final void ao() {
        super.ao();
        boolean z = this.az;
        this.az = false;
        aT(z);
    }

    public final void b() {
        this.at.c("android.permission.READ_EXTERNAL_STORAGE");
    }

    public final void f(emxc emxcVar) {
        if (this.am.g()) {
            exgf exgfVar = (exgf) exgg.a.createBuilder();
            exgfVar.copyOnWrite();
            exgg exggVar = (exgg) exgfVar.instance;
            exggVar.c = 22;
            exggVar.b |= 1;
            long a = ((emyg) this.am.c()).a(TimeUnit.MICROSECONDS);
            exgfVar.copyOnWrite();
            exgg exggVar2 = (exgg) exgfVar.instance;
            exggVar2.b |= 2;
            exggVar2.d = a;
            exgb exgbVar = (exgb) exgc.a.createBuilder();
            if (emxcVar.g()) {
                eghl eghlVar = (eghl) emxcVar.c();
                if (eghlVar.a().g()) {
                    exft exftVar = (exft) exfu.a.createBuilder();
                    exftVar.copyOnWrite();
                    exfu exfuVar = (exfu) exftVar.instance;
                    exfuVar.d = 0;
                    exfuVar.b |= 2;
                    exgfVar.copyOnWrite();
                    exgg exggVar3 = (exgg) exgfVar.instance;
                    exfu exfuVar2 = (exfu) exftVar.build();
                    exfuVar2.getClass();
                    exggVar3.e = exfuVar2;
                    exggVar3.b |= 4;
                }
                exgbVar.c(eghlVar.c());
            }
            exgbVar.copyOnWrite();
            exgc exgcVar = (exgc) exgbVar.instance;
            exgg exggVar4 = (exgg) exgfVar.build();
            exggVar4.getClass();
            exgcVar.d = exggVar4;
            exgcVar.b |= 1;
            this.aj.c((exgc) exgbVar.build());
            ((emyg) this.am.c()).e();
        }
    }

    @Override // defpackage.eglu, defpackage.ea
    public final void g(Context context) {
        super.g(context);
        if (this.as) {
            return;
        }
        fazg.a(this);
    }

    @Override // defpackage.ea
    public final void h(Bundle bundle) {
        super.h(bundle);
        this.aq = egjc.a(z());
        this.at = O(new aek(), new adf() { // from class: eglh
            @Override // defpackage.adf
            public final void a(Object obj) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                DevicePhotosFragment devicePhotosFragment = DevicePhotosFragment.this;
                if (booleanValue) {
                    devicePhotosFragment.r(0);
                    if (fdrm.a.get().w()) {
                        devicePhotosFragment.am = emux.a;
                    }
                    devicePhotosFragment.q();
                    return;
                }
                if (devicePhotosFragment.aN("android.permission.READ_EXTERNAL_STORAGE")) {
                    devicePhotosFragment.r(1);
                } else {
                    devicePhotosFragment.r(2);
                }
            }
        });
        this.an = O(new aek(), new adf() { // from class: eglf
            @Override // defpackage.adf
            public final void a(Object obj) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                DevicePhotosFragment devicePhotosFragment = DevicePhotosFragment.this;
                if (booleanValue) {
                    egdg egdgVar = devicePhotosFragment.aj;
                    exfm exfmVar = (exfm) exfn.a.createBuilder();
                    exfmVar.copyOnWrite();
                    exfn exfnVar = (exfn) exfmVar.instance;
                    exfnVar.c = 122;
                    exfnVar.b |= 1;
                    egdgVar.a((exfn) exfmVar.build());
                    devicePhotosFragment.a();
                    return;
                }
                if (devicePhotosFragment.aN("android.permission.CAMERA")) {
                    egdg egdgVar2 = devicePhotosFragment.aj;
                    exfm exfmVar2 = (exfm) exfn.a.createBuilder();
                    exfmVar2.copyOnWrite();
                    exfn exfnVar2 = (exfn) exfmVar2.instance;
                    exfnVar2.c = 123;
                    exfnVar2.b |= 1;
                    egdgVar2.a((exfn) exfmVar2.build());
                    return;
                }
                egdg egdgVar3 = devicePhotosFragment.aj;
                exfm exfmVar3 = (exfm) exfn.a.createBuilder();
                exfmVar3.copyOnWrite();
                exfn exfnVar3 = (exfn) exfmVar3.instance;
                exfnVar3.c = 124;
                exfnVar3.b |= 1;
                egdgVar3.a((exfn) exfmVar3.build());
                devicePhotosFragment.aq.show();
            }
        });
        this.ao = O(new ael(), new adf() { // from class: eglg
            @Override // defpackage.adf
            public final void a(Object obj) {
                ade adeVar = (ade) obj;
                if (adeVar.a == -1) {
                    if (adeVar.b == null && fdrm.a.get().p()) {
                        return;
                    }
                    DevicePhotosFragment devicePhotosFragment = DevicePhotosFragment.this;
                    devicePhotosFragment.ai.c = 8;
                    devicePhotosFragment.c.m(adeVar.b.getData());
                }
            }
        });
        this.au = O(new ael(), new adf() { // from class: eglj
            @Override // defpackage.adf
            public final void a(Object obj) {
                if (((ade) obj).a == -1) {
                    DevicePhotosFragment devicePhotosFragment = DevicePhotosFragment.this;
                    if (devicePhotosFragment.ar.g()) {
                        devicePhotosFragment.ai.c = 7;
                        devicePhotosFragment.c.m((Uri) devicePhotosFragment.ar.c());
                    }
                }
            }
        });
    }

    public final void p() {
        if (aI()) {
            aT(true);
        } else {
            this.az = true;
        }
    }

    public final void q() {
        this.a.c();
    }

    public final void r(int i) {
        if (i == 0) {
            this.av.setVisibility(8);
            this.aw.setVisibility(8);
            this.ax.setVisibility(8);
            this.ay.setVisibility(0);
            return;
        }
        if (i == 1) {
            this.e.d(this.av, this.d.a(118676));
            this.av.setVisibility(0);
            this.aw.setVisibility(0);
            this.av.setText(R.string.op3_allow_access_to_photos);
            this.ax.setVisibility(0);
            return;
        }
        this.e.d(this.av, this.d.a(118677));
        this.ax.setVisibility(8);
        if (!egjc.b(z(), "android.permission.READ_EXTERNAL_STORAGE")) {
            this.av.setVisibility(8);
            this.aw.setVisibility(8);
        } else {
            this.av.setVisibility(0);
            this.aw.setVisibility(0);
            this.av.setText(R.string.op3_allow_access_to_photos_in_settings);
        }
    }
}
