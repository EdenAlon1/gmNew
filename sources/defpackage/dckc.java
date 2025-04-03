package defpackage;

import android.content.Context;
import android.location.LocationManager;
import com.google.android.apps.messaging.ui.mediapicker.c2o.location.picker.LocationAttachmentPickerActivity;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class dckc extends dbxx {
    private boolean K = false;

    public dckc() {
        y(new dckb(this));
    }

    @Override // defpackage.dbya, defpackage.cwqh, defpackage.cwqf
    protected final void B() {
        if (this.K) {
            return;
        }
        this.K = true;
        LocationAttachmentPickerActivity locationAttachmentPickerActivity = (LocationAttachmentPickerActivity) this;
        akgb akgbVar = (akgb) aX();
        locationAttachmentPickerActivity.t = (cqoh) akgbVar.b.cz.b();
        locationAttachmentPickerActivity.u = (cwqc) akgbVar.e.b();
        locationAttachmentPickerActivity.v = akgbVar.g;
        locationAttachmentPickerActivity.w = (bcqg) akgbVar.b.cZ.b();
        locationAttachmentPickerActivity.x = (crjx) akgbVar.b.a.r.b();
        locationAttachmentPickerActivity.y = akgbVar.h;
        akis akisVar = akgbVar.b;
        locationAttachmentPickerActivity.z = akisVar.b.nH;
        akkp akkpVar = akisVar.a;
        locationAttachmentPickerActivity.A = akkpVar.DA;
        locationAttachmentPickerActivity.B = akkpVar.ft;
        locationAttachmentPickerActivity.C = akisVar.cT;
        locationAttachmentPickerActivity.D = akgbVar.j;
        locationAttachmentPickerActivity.E = (elbx) akisVar.aJ.b();
        locationAttachmentPickerActivity.F = akgbVar.e;
        locationAttachmentPickerActivity.I = (alct) akgbVar.bk.b();
        locationAttachmentPickerActivity.J = (cqoh) akgbVar.b.cz.b();
        locationAttachmentPickerActivity.P = (crjx) akgbVar.b.a.r.b();
        locationAttachmentPickerActivity.Q = (akzt) akgbVar.b.a.f.b();
        Context context = (Context) akgbVar.b.q.b();
        LocationManager locationManager = (LocationManager) akgbVar.b.b.hQ.b();
        ctud ctudVar = (ctud) akgbVar.b.cT.b();
        akzt akztVar = (akzt) akgbVar.b.a.f.b();
        Optional of = Optional.of((ctxw) akgbVar.b.a.ri.b());
        errl errlVar = (errl) akgbVar.b.p.b();
        akis akisVar2 = akgbVar.b;
        locationAttachmentPickerActivity.R = new dckt(context, locationManager, ctudVar, akztVar, new ahoz(of, errlVar, akisVar2.b.oy, akisVar2.kh));
        locationAttachmentPickerActivity.T = (bzyb) akgbVar.b.cH.b();
        locationAttachmentPickerActivity.S = (bzqa) akgbVar.b.cI.b();
    }
}
