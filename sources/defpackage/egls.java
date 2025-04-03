package defpackage;

import android.content.ContentUris;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.user.profile.photopicker.common.view.SquareImageView;
import com.google.android.material.textview.MaterialTextView;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egls extends vk {
    public final dvxi a;
    public final egjk d;
    public final egll e;
    private engw f;
    private final engw g;
    private final egaj h;
    private final dvyc i;

    public egls(egaj egajVar, dvxi dvxiVar, dvyc dvycVar, egjk egjkVar, egcx egcxVar, egll egllVar) {
        int i = engw.d;
        this.f = enou.a;
        this.h = egajVar;
        this.a = dvxiVar;
        this.i = dvycVar;
        this.d = egjkVar;
        this.e = egllVar;
        engr engrVar = new engr();
        if (!egcxVar.a.queryIntentActivities(new Intent("android.media.action.IMAGE_CAPTURE"), 65536).isEmpty()) {
            engrVar.h(0);
        }
        if (egcxVar.a(new Intent("android.intent.action.GET_CONTENT").setType("image/*"))) {
            engrVar.h(1);
        }
        this.g = engrVar.g();
    }

    @Override // defpackage.vk
    public final int a() {
        return this.f.size() + ((enou) this.g).c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vk
    public final int dE(int i) {
        engw engwVar = this.g;
        if (i < ((enou) engwVar).c) {
            return ((Integer) engwVar.get(i)).intValue();
        }
        return 2;
    }

    @Override // defpackage.vk
    public final wr e(ViewGroup viewGroup, int i) {
        if (i == 0) {
            eglp eglpVar = new eglp(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.photo_picker_button, viewGroup, false));
            MaterialTextView materialTextView = (MaterialTextView) eglpVar.s.findViewById(R.id.photo_picker_button_text);
            materialTextView.setText(R.string.op3_picker_camera);
            materialTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, ku.a(materialTextView.getContext(), R.drawable.quantum_gm_ic_photo_camera_vd_theme_24), (Drawable) null, (Drawable) null);
            this.i.b.a(89730).b(eglpVar.s);
            eglpVar.s.setOnClickListener(new View.OnClickListener() { // from class: eglm
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    egls eglsVar = egls.this;
                    eglsVar.a.a(dvxh.e(), view);
                    egll egllVar = eglsVar.e;
                    if (egjc.b(egllVar.a.z(), "android.permission.CAMERA")) {
                        egllVar.a.an.c("android.permission.CAMERA");
                    } else {
                        egllVar.a.a();
                    }
                }
            });
            return eglpVar;
        }
        if (i != 1) {
            return new eglr(fdrm.l() ? SquareImageView.a(viewGroup.getContext()) : new SquareImageView(viewGroup.getContext()));
        }
        eglq eglqVar = new eglq(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.photo_picker_button, viewGroup, false));
        MaterialTextView materialTextView2 = (MaterialTextView) eglqVar.s.findViewById(R.id.photo_picker_button_text);
        materialTextView2.setText(R.string.op3_picker_gallery);
        materialTextView2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, ku.a(materialTextView2.getContext(), R.drawable.quantum_gm_ic_camera_roll_vd_theme_24), (Drawable) null, (Drawable) null);
        this.i.b.a(89743).b(eglqVar.s);
        eglqVar.s.setOnClickListener(new View.OnClickListener() { // from class: egln
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                egls eglsVar = egls.this;
                eglsVar.a.a(dvxh.e(), view);
                Intent type = new Intent("android.intent.action.GET_CONTENT").setType("image/*");
                egll egllVar = eglsVar.e;
                if (egllVar.a.ak.a(type)) {
                    egllVar.a.ao.c(type);
                }
            }
        });
        return eglqVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vk
    public final void g(wr wrVar, int i) {
        int i2 = ((enou) this.g).c;
        if (i >= i2) {
            eglr eglrVar = (eglr) wrVar;
            eghk eghkVar = (eghk) this.f.get(i - i2);
            int i3 = eglr.t;
            SquareImageView squareImageView = eglrVar.s;
            if (eghkVar.b().g()) {
                squareImageView.setContentDescription(squareImageView.getContext().getString(R.string.op3_picker_accessibility_photo, efzu.a((eyja) eghkVar.b().c())));
            }
            final Uri withAppendedId = ContentUris.withAppendedId(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, eghkVar.a());
            egaj egajVar = this.h;
            egal egalVar = new egal();
            egalVar.a();
            egajVar.g(withAppendedId, egalVar, eglrVar.s);
            this.i.b.a(89756).c(eglrVar.s);
            eglrVar.s.setOnClickListener(new View.OnClickListener() { // from class: eglo
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    egls eglsVar = egls.this;
                    eglsVar.a.a(dvxh.e(), view);
                    eglsVar.d.c = 8;
                    eglsVar.e.a.c.m(withAppendedId);
                }
            });
        }
    }

    @Override // defpackage.vk
    public final void k(wr wrVar) {
        if (wrVar instanceof eglr) {
            dvyc dvycVar = this.i;
            int i = eglr.t;
            dvycVar.b.c(((eglr) wrVar).s);
        }
    }

    public final void m(engw engwVar) {
        this.f = engwVar;
        p();
    }
}
