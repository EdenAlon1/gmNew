package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.apps.messaging.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.google.android.material.textview.MaterialTextView;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egpf extends egpa {
    static final Uri ah = Uri.parse("http://play.google.com/store/apps/details").buildUpon().appendQueryParameter("id", "com.google.android.apps.photos").build();
    public MaterialButton aA;
    public CircularProgressIndicator aB;
    public boolean aC;
    public boolean aD = false;
    private ehbn aE;
    public lmw ai;
    public lmw aj;
    public dwcu ak;
    public dvyc al;
    public egaj am;
    public egdg an;
    public emyg ao;
    public emyg ap;
    public dvxi aq;
    public dwcr ar;
    public View as;
    public View at;
    public View au;
    public MaterialButton av;
    public ImageView aw;
    public ImageView ax;
    public MaterialTextView ay;
    public MaterialTextView az;

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean aZ(egdx egdxVar) {
        engw c = egdxVar.c();
        int size = c.size();
        int i = 0;
        while (i < size) {
            exfw exfwVar = (exfw) c.get(i);
            fapt b = fapt.b((exfwVar.c == 2 ? (exgk) exfwVar.d : exgk.a).c);
            if (b == null) {
                b = fapt.UNKNOWN_RPC;
            }
            i++;
            if (b == fapt.OBAKE_MDI_REMOVE_PHOTO) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.photo_picker_update_fragment, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void aV(engw engwVar) {
        if (!fdrm.r() || this.aD) {
            exgf exgfVar = (exgf) exgg.a.createBuilder();
            exgfVar.copyOnWrite();
            exgg exggVar = (exgg) exgfVar.instance;
            exggVar.c = 7;
            exggVar.b |= 1;
            long a = this.ao.a(TimeUnit.MICROSECONDS);
            exgfVar.copyOnWrite();
            exgg exggVar2 = (exgg) exgfVar.instance;
            exggVar2.b |= 2;
            exggVar2.d = a;
            int size = engwVar.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                exfw exfwVar = (exfw) engwVar.get(i);
                i++;
                if ((exfwVar.b & 2) != 0) {
                    exfu exfuVar = exfwVar.f;
                    if (exfuVar == null) {
                        exfuVar = exfu.a;
                    }
                    exgfVar.copyOnWrite();
                    exgg exggVar3 = (exgg) exgfVar.instance;
                    exfuVar.getClass();
                    exggVar3.e = exfuVar;
                    exggVar3.b |= 4;
                }
            }
            egdg egdgVar = this.an;
            exgb exgbVar = (exgb) exgc.a.createBuilder();
            exfv exfvVar = (exfv) exfw.a.createBuilder();
            long a2 = this.ap.a(TimeUnit.MICROSECONDS);
            exfvVar.copyOnWrite();
            exfw exfwVar2 = (exfw) exfvVar.instance;
            exfwVar2.b |= 1;
            exfwVar2.e = a2;
            exgp exgpVar = (exgp) exgq.a.createBuilder();
            exgpVar.copyOnWrite();
            exgq exgqVar = (exgq) exgpVar.instance;
            exgqVar.d = 5;
            exgqVar.b |= 2;
            exgpVar.copyOnWrite();
            exgq exgqVar2 = (exgq) exgpVar.instance;
            exgqVar2.c = 6;
            exgqVar2.b |= 1;
            exfvVar.copyOnWrite();
            exfw exfwVar3 = (exfw) exfvVar.instance;
            exgq exgqVar3 = (exgq) exgpVar.build();
            exgqVar3.getClass();
            exfwVar3.d = exgqVar3;
            exfwVar3.c = 1;
            exgbVar.b(exfvVar);
            exgbVar.a(engwVar);
            exgbVar.copyOnWrite();
            exgc exgcVar = (exgc) exgbVar.instance;
            exgg exggVar4 = (exgg) exgfVar.build();
            exggVar4.getClass();
            exgcVar.d = exggVar4;
            exgcVar.b |= 1;
            egdgVar.c((exgc) exgbVar.build());
            if (fdrm.r()) {
                this.aD = false;
            }
        }
    }

    public final void aY(boolean z) {
        this.aE.a().w = z;
        this.aE.setCancelable(z);
        this.aE.setCanceledOnTouchOutside(z);
    }

    @Override // defpackage.ea
    public final void ae(Bundle bundle) {
        super.ae(bundle);
        egdg egdgVar = this.an;
        exgd exgdVar = (exgd) exge.a.createBuilder();
        exgdVar.copyOnWrite();
        exge exgeVar = (exge) exgdVar.instance;
        exgeVar.c = 7;
        exgeVar.b |= 1;
        egdgVar.e((exge) exgdVar.build());
        this.aw = (ImageView) this.Q.findViewById(R.id.photo_picker_update_dialog_profile_image);
        this.ax = (ImageView) this.Q.findViewById(R.id.photo_picker_update_upsell_photos_logo);
        this.as = this.Q.findViewById(R.id.photo_picker_update_dialog_notice);
        this.ay = (MaterialTextView) this.Q.findViewById(R.id.photo_picker_update_dialog_title);
        this.az = (MaterialTextView) this.Q.findViewById(R.id.photo_picker_update_dialog_message);
        this.aB = (CircularProgressIndicator) this.Q.findViewById(R.id.photo_picker_update_dialog_loading_indicator);
        this.aA = (MaterialButton) this.Q.findViewById(R.id.photo_picker_update_dialog_accept_button);
        this.av = (MaterialButton) this.Q.findViewById(R.id.photo_picker_update_upsell_photos_download_button);
        this.au = this.Q.findViewById(R.id.photo_picker_update_upsell_notice);
        this.at = this.Q.findViewById(R.id.photo_picker_update_upsell_divider);
        kvo.z(this.ay);
        egpq egpqVar = (egpq) this.ai.a(egpq.class);
        final egpm egpmVar = (egpm) this.aj.a(egpm.class);
        this.aA.setOnClickListener(new View.OnClickListener() { // from class: egpc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                egpf egpfVar = egpf.this;
                if (egpfVar.aC && fdrm.u()) {
                    egpm egpmVar2 = egpmVar;
                    egdg egdgVar2 = egpmVar2.b;
                    exgd exgdVar2 = (exgd) exge.a.createBuilder();
                    exgdVar2.copyOnWrite();
                    exge exgeVar2 = (exge) exgdVar2.instance;
                    exgeVar2.c = 21;
                    exgeVar2.b |= 1;
                    egdgVar2.e((exge) exgdVar2.build());
                    efmq efmqVar = egpmVar2.a;
                    efmq.b(egpmVar2.c);
                }
                egpfVar.hw();
            }
        });
        this.av.setOnClickListener(new View.OnClickListener() { // from class: egpd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                egpf egpfVar = egpf.this;
                egpfVar.aq.a(dvxh.e(), view);
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(egpf.ah);
                egpfVar.aQ(intent);
            }
        });
        egpqVar.a().f(Q(), new llh() { // from class: egpe
            @Override // defpackage.llh
            public final void a(Object obj) {
                egdx egdxVar = (egdx) obj;
                int d = egdxVar.d() - 1;
                egpf egpfVar = egpf.this;
                if (d == 0) {
                    emyg emygVar = egpfVar.ap;
                    emygVar.e();
                    emygVar.f();
                } else if (d != 1 && d != 2) {
                    if (d != 3) {
                        egpfVar.am.c(egpfVar.aw);
                        egpfVar.aw.setVisibility(8);
                        if (egpf.aZ(egdxVar)) {
                            egpfVar.az.setText(R.string.op3_update_remove_failure_message);
                        } else {
                            egpfVar.az.setText(R.string.op3_update_failure_message);
                        }
                        egpfVar.as.setVisibility(0);
                        egpfVar.ay.setText(R.string.op3_something_went_wrong);
                        if (fdrm.k()) {
                            egpfVar.au.setVisibility(8);
                            egpfVar.at.setVisibility(8);
                            egpfVar.av.setVisibility(8);
                        }
                        egpfVar.aB.setVisibility(8);
                        egpfVar.aA.setVisibility(0);
                        egpfVar.aY(true);
                        egpfVar.aV(egdxVar.c());
                        egpfVar.aC = false;
                        return;
                    }
                    egaj egajVar = egpfVar.am;
                    Bitmap a = ((egiw) egdxVar.b().c()).a();
                    egal egalVar = new egal();
                    egalVar.c();
                    egajVar.d(a, egalVar, egpfVar.aw);
                    egpfVar.aw.setVisibility(0);
                    egpfVar.az.setText(R.string.op3_update_message_will_update_soon);
                    egpfVar.ay.setText(R.string.op3_update_will_update_soon);
                    egpfVar.as.setVisibility(0);
                    egpfVar.aB.setVisibility(8);
                    egpfVar.aA.setVisibility(0);
                    egpfVar.aY(true);
                    try {
                        egpfVar.G().getPackageManager().getPackageInfo("com.google.android.apps.photos", 128);
                    } catch (PackageManager.NameNotFoundException unused) {
                        if (!egpf.aZ(egdxVar)) {
                            egpfVar.au.setVisibility(0);
                            egpfVar.at.setVisibility(0);
                            egpfVar.av.setVisibility(0);
                            egpfVar.am.f(Uri.parse(fdrm.f()), new egal(), egpfVar.ax);
                        }
                    }
                    egpfVar.au.setVisibility(8);
                    egpfVar.at.setVisibility(8);
                    egpfVar.av.setVisibility(8);
                    egpfVar.aC = true;
                    egpfVar.aV(egdxVar.c());
                    return;
                }
                if (fdrm.r()) {
                    emyg emygVar2 = egpfVar.ap;
                    emygVar2.e();
                    emygVar2.f();
                    egpfVar.aD = true;
                }
                egpfVar.am.c(egpfVar.aw);
                egpfVar.aw.setVisibility(8);
                egpfVar.ay.setText(R.string.op3_update_saving_changes);
                egpfVar.az.setText("");
                egpfVar.as.setVisibility(8);
                egpfVar.aB.g();
                egpfVar.aA.setVisibility(8);
                egpfVar.au.setVisibility(8);
                egpfVar.at.setVisibility(8);
                egpfVar.av.setVisibility(8);
                egpfVar.aY(false);
                egpfVar.aC = false;
            }
        });
    }

    @Override // defpackage.egpa, defpackage.dn, defpackage.ea
    public final void g(Context context) {
        super.g(context);
        if (((egpa) this).ag) {
            return;
        }
        fazg.a(this);
    }

    @Override // defpackage.dn, defpackage.ea
    public final void h(Bundle bundle) {
        super.h(bundle);
        emyg emygVar = this.ao;
        emygVar.e();
        emygVar.f();
        this.ar = this.ak.a(this);
    }

    @Override // defpackage.ehbo, defpackage.kc, defpackage.dn
    public final Dialog hf(Bundle bundle) {
        ehbn ehbnVar = (ehbn) super.hf(bundle);
        this.aE = ehbnVar;
        ehbnVar.a().D(3);
        this.aE.setOnShowListener(new dwcs(this, new DialogInterface.OnShowListener() { // from class: egpb
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                egpf egpfVar = egpf.this;
                egpfVar.ar.b(89736).a();
                egpfVar.al.b.a(89758).b(egpfVar.Q.findViewById(R.id.photo_picker_update_dialog_notice));
                egpfVar.al.b.a(89744).b(egpfVar.Q.findViewById(R.id.photo_picker_update_upsell_notice));
                dwct.c(egpfVar);
                egpfVar.al.b.a(89745).b(egpfVar.av);
            }
        }));
        return this.aE;
    }
}
