package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egoz extends egou {
    public lmw ah;
    public dwcu ai;
    public egaj aj;
    public egrf ak;
    public dwcr al;
    public egpq am;
    private iv an;

    @Override // defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = LayoutInflater.from(z()).inflate(R.layout.profile_picture_remove_dialog, viewGroup);
        this.an.a.b(inflate);
        this.an.setTitle(R.string.op3_remove_dialog_title);
        return inflate;
    }

    @Override // defpackage.ea
    public final void ae(Bundle bundle) {
        super.ae(bundle);
        this.am.a().f(Q(), new llh() { // from class: egov
            @Override // defpackage.llh
            public final void a(Object obj) {
                egdx egdxVar = (egdx) obj;
                if (egdxVar.d() == 4) {
                    egoz egozVar = egoz.this;
                    String b = ((egiw) egdxVar.b().c()).b();
                    ImageView imageView = (ImageView) egozVar.Q.findViewById(R.id.photo_picker_remove_monogram);
                    egaj egajVar = egozVar.aj;
                    Uri parse = Uri.parse(b);
                    egal egalVar = new egal();
                    egalVar.a.add(egak.FORCE_MONOGRAM);
                    egalVar.c();
                    egalVar.a();
                    egajVar.f(parse, egalVar, imageView);
                }
            }
        });
    }

    @Override // defpackage.egou, defpackage.dn, defpackage.ea
    public final void g(Context context) {
        super.g(context);
        if (((egou) this).ag) {
            return;
        }
        fazg.a(this);
    }

    @Override // defpackage.dn, defpackage.ea
    public final void h(Bundle bundle) {
        super.h(bundle);
        this.al = this.ai.a(this);
        this.am = (egpq) this.ah.a(egpq.class);
    }

    @Override // defpackage.dn
    public final Dialog hf(Bundle bundle) {
        ehft ehftVar = new ehft(z(), R.style.ThemeOverlay_PhotoPicker_MaterialAlertDialog);
        ehftVar.t(R.string.op3_preview_remove, new DialogInterface.OnClickListener() { // from class: egow
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                egoz egozVar = egoz.this;
                egozVar.al.c(i);
                egiu egiuVar = egozVar.am.b;
                if (egiuVar.g.compareAndSet(false, true)) {
                    egdo egdoVar = (egdo) egiuVar.j;
                    if (egdoVar.b == 4) {
                        emxc emxcVar = egdoVar.a;
                        if (emxcVar.g()) {
                            egiuVar.c(egdx.e((egiw) emxcVar.c()));
                            egiuVar.e(fapt.OBAKE_MDI_REMOVE_PHOTO);
                            egiuVar.i.c(fapt.OBAKE_MDI_DELETE_PERSON_PHOTO_ME);
                            erqt.r(egiuVar.d.a(), new egis(egiuVar), egiuVar.c);
                        }
                    }
                    egiuVar.c(egdx.h());
                    egiuVar.e(fapt.OBAKE_MDI_REMOVE_PHOTO);
                    egiuVar.i.c(fapt.OBAKE_MDI_DELETE_PERSON_PHOTO_ME);
                    erqt.r(egiuVar.d.a(), new egis(egiuVar), egiuVar.c);
                }
                egozVar.ak.o();
            }
        });
        ehftVar.o(R.string.op3_remove_dialog_cancel_button, new DialogInterface.OnClickListener() { // from class: egox
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                egoz egozVar = egoz.this;
                egozVar.al.c(i);
                egozVar.hw();
            }
        });
        iv create = ehftVar.create();
        this.an = create;
        create.setOnShowListener(new dwcs(this, new DialogInterface.OnShowListener() { // from class: egoy
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                egoz egozVar = egoz.this;
                egozVar.al.b(89760).a();
                egozVar.al.a(-1, 89761).a();
                egozVar.al.a(-2, 89762).a();
                dwct.c(egozVar);
            }
        }));
        return this.an;
    }
}
