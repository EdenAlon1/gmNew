package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egot extends egol {
    public dwcu ah;
    public egrf ai;
    public egaj aj;
    public dvyc ak;
    public dvxi al;
    public egad am;
    public egjk an;
    public egdg ao;
    public egcx ap;
    public egrj aq;
    public dwcr ar;
    public emxc as;
    public adg at;
    public adg au;
    public iv av;
    private TextView aw;

    @Override // defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.photo_picker_chooser_fragment, viewGroup, false);
    }

    @Override // defpackage.ea
    public final void ae(Bundle bundle) {
        emxc j;
        super.ae(bundle);
        TextView textView = (TextView) this.Q.findViewById(R.id.photo_picker_chooser_google_photos_title);
        egaj egajVar = this.aj;
        Context z = z();
        Uri parse = Uri.parse(fdrm.f());
        egal egalVar = new egal();
        int dimensionPixelSize = z().getResources().getDimensionPixelSize(R.dimen.photo_picker_placeholder_icon_size);
        ((qqo) egajVar.a(z, parse, egalVar).S(z().getResources().getDrawable(R.drawable.photo_picker_placeholder_icon))).w(new egos(dimensionPixelSize, dimensionPixelSize, textView));
        textView.setOnClickListener(new View.OnClickListener() { // from class: egoo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                egot egotVar = egot.this;
                egotVar.al.a(dvxh.e(), view);
                egotVar.hw();
                egotVar.ai.h();
            }
        });
        ((TextView) this.Q.findViewById(R.id.photo_picker_chooser_device_photos_title)).setOnClickListener(new View.OnClickListener() { // from class: egop
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                egot egotVar = egot.this;
                egotVar.al.a(dvxh.e(), view);
                egotVar.hw();
                egotVar.ai.g();
            }
        });
        this.aw = (TextView) this.Q.findViewById(R.id.photo_picker_chooser_camera_title);
        emxc i = emxc.i(this.am.a("camera_image.jpg"));
        this.as = i;
        if (i.g()) {
            Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
            intent.putExtra("output", (Parcelable) this.as.c());
            j = emxc.j(intent);
        } else {
            if (Log.isLoggable("PhotoSourceChooser", 5)) {
                Log.w("PhotoSourceChooser", "Uri for camera photo camera_image.jpg is not present");
            }
            j = emux.a;
        }
        if (j.g() && this.ap.a((Intent) j.c())) {
            this.aw.setOnClickListener(new View.OnClickListener() { // from class: egoq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    egot egotVar = egot.this;
                    egotVar.al.a(dvxh.e(), view);
                    egotVar.aq.b();
                    if (egjc.b(egotVar.z(), "android.permission.CAMERA")) {
                        egotVar.au.c("android.permission.CAMERA");
                    } else {
                        egotVar.at.c((Uri) egotVar.as.c());
                    }
                }
            });
        } else {
            this.aw.setVisibility(8);
        }
    }

    @Override // defpackage.egol, defpackage.dn, defpackage.ea
    public final void g(Context context) {
        super.g(context);
        if (((egol) this).ag) {
            return;
        }
        fazg.a(this);
    }

    @Override // defpackage.dn, defpackage.ea
    public final void h(Bundle bundle) {
        super.h(bundle);
        this.ar = this.ah.a(this);
        this.av = egjc.a(z());
        this.at = O(new aen(), new adf() { // from class: egor
            @Override // defpackage.adf
            public final void a(Object obj) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                egot egotVar = egot.this;
                if (booleanValue) {
                    egotVar.an.c = 7;
                    egotVar.ai.m((Uri) egotVar.as.c());
                }
                egotVar.hw();
            }
        });
        this.au = O(new aek(), new adf() { // from class: egom
            @Override // defpackage.adf
            public final void a(Object obj) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                egot egotVar = egot.this;
                if (booleanValue) {
                    egdg egdgVar = egotVar.ao;
                    exfm exfmVar = (exfm) exfn.a.createBuilder();
                    exfmVar.copyOnWrite();
                    exfn exfnVar = (exfn) exfmVar.instance;
                    exfnVar.c = 122;
                    exfnVar.b |= 1;
                    egdgVar.a((exfn) exfmVar.build());
                    egotVar.at.c((Uri) egotVar.as.c());
                    return;
                }
                if (egotVar.aN("android.permission.CAMERA")) {
                    egdg egdgVar2 = egotVar.ao;
                    exfm exfmVar2 = (exfm) exfn.a.createBuilder();
                    exfmVar2.copyOnWrite();
                    exfn exfnVar2 = (exfn) exfmVar2.instance;
                    exfnVar2.c = 123;
                    exfnVar2.b |= 1;
                    egdgVar2.a((exfn) exfmVar2.build());
                    return;
                }
                egdg egdgVar3 = egotVar.ao;
                exfm exfmVar3 = (exfm) exfn.a.createBuilder();
                exfmVar3.copyOnWrite();
                exfn exfnVar3 = (exfn) exfmVar3.instance;
                exfnVar3.c = 124;
                exfnVar3.b |= 1;
                egdgVar3.a((exfn) exfmVar3.build());
                egotVar.av.show();
            }
        });
    }

    @Override // defpackage.ehbo, defpackage.kc, defpackage.dn
    public final Dialog hf(Bundle bundle) {
        Dialog hf = super.hf(bundle);
        ehbn ehbnVar = (ehbn) hf;
        ehbnVar.a().D(3);
        ehbnVar.setOnShowListener(new dwcs(this, new DialogInterface.OnShowListener() { // from class: egon
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                egot egotVar = egot.this;
                egotVar.ar.b(109423).a();
                egotVar.ak.b.a(109424).b(egotVar.Q.findViewById(R.id.photo_picker_chooser_google_photos_title));
                egotVar.ak.b.a(109425).b(egotVar.Q.findViewById(R.id.photo_picker_chooser_device_photos_title));
                egotVar.ak.b.a(109426).b(egotVar.Q.findViewById(R.id.photo_picker_chooser_camera_title));
                dwct.c(egotVar);
            }
        }));
        return hf;
    }
}
