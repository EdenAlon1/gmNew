package defpackage;

import android.animation.ValueAnimator;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.R;
import com.google.android.material.snackbar.Snackbar;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tfh {
    public static final cskc a = cskc.g("BugleCms", "FiAccountConfirmationFragmentPeer");
    public ValueAnimator A;
    public iv B;
    public final tex b;
    public final eisx c;
    public final ejlq d;
    public final elbx e;
    public final ejwl f;
    public final tgw g;
    public final eixo h;
    public final ffbr i;
    public final ffbr j;
    public final ellq k;
    public final ffbr l;
    public final akzt m;
    public final tfj n;
    public final ffbr o;
    public final ffbr p;
    public final crue r;
    public Snackbar t;
    public ProgressBar w;
    public Button x;
    public Button y;
    public ImageView z;
    public final ejlr u = new ejlr<Void, Boolean>() { // from class: tfh.1
        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void b(Object obj) {
            tfh.this.w.setVisibility(0);
        }

        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            tfh.this.m.c("Bugle.Cms.PrimaryDevice.ExistingPrimaryDeviceCheck.Success.Count");
            if (!((Boolean) obj2).booleanValue()) {
                tfh.a.p("There does not exist another primary device.");
                tfh.this.a();
                return;
            }
            tfh.a.p("There exists another primary device, showing change primary device dialog.");
            final tfh tfhVar = tfh.this;
            AlertDialog create = new AlertDialog.Builder(tfhVar.b.z()).setTitle(tfhVar.b.Y(R.string.fi_account_confirmation_change_primary_device_dialog_title)).setMessage(R.string.fi_account_confirmation_change_primary_device_dialog_message).setNegativeButton(tfhVar.b.Y(R.string.fi_account_confirmation_change_primary_device_dialog_negative), new elbb(tfhVar.e, "FiAccountConfirmationFragmentPeer:changePrimaryDeviceDialog:negative", new DialogInterface.OnClickListener() { // from class: tey
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                    tfh tfhVar2 = tfh.this;
                    tfhVar2.w.setVisibility(8);
                    tfhVar2.x.setEnabled(true);
                    tfhVar2.y.setEnabled(true);
                }
            })).setPositiveButton(tfhVar.b.Y(R.string.fi_account_confirmation_change_primary_device_dialog_positive), new elbb(tfhVar.e, "FiAccountConfirmationFragmentPeer:changePrimaryDeviceDialog:positive", new DialogInterface.OnClickListener() { // from class: tez
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    tfh.this.a();
                    dialogInterface.dismiss();
                }
            })).create();
            create.setCanceledOnTouchOutside(false);
            create.show();
        }

        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void m(Object obj, Throwable th) {
            tfh.this.w.setVisibility(8);
            tfh.this.m.c("Bugle.Cms.PrimaryDevice.ExistingPrimaryDeviceCheck.Failure.Count");
            tfh.a.s("Failed to determine whether exists another primary device.", th);
            tfh.this.a();
        }
    };
    public final ejwd v = new ejwd<eixz>() { // from class: tfh.2
        @Override // defpackage.ejwd
        public final void a(Throwable th) {
            throw new IllegalStateException("Error retrieving AccountInfo for id ".concat(String.valueOf(tfh.this.c.toString())), th);
        }

        @Override // defpackage.ejwd
        public final /* bridge */ /* synthetic */ void b(Object obj) {
            eixz eixzVar = (eixz) obj;
            boolean isEmpty = eixzVar.h.isEmpty();
            tfh tfhVar = tfh.this;
            if (!isEmpty) {
                ekms A = ekmq.b(tfhVar.b).i(eixzVar.h).A();
                riq riqVar = new riq(tfhVar.z);
                riqVar.l();
                A.w(riqVar);
                tfhVar.z.setImageTintList(null);
                return;
            }
            tex texVar = tfhVar.b;
            ekms e = ekmq.b(texVar).e(texVar.B().getDrawable(R.drawable.quantum_ic_account_circle_black_48, null));
            riq riqVar2 = new riq(tfhVar.z);
            riqVar2.l();
            e.w(riqVar2);
            tfhVar.z.setColorFilter(tfhVar.b.z().getColor(R.color.text_color_primary));
        }

        @Override // defpackage.ejwd
        public final /* synthetic */ void hB() {
        }
    };
    public final a q = new a();
    public final ejlr s = new b();

    /* compiled from: PG */
    final class b implements ejlr<Void, Boolean> {
        public b() {
        }

        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void b(Object obj) {
            tfh.this.w.setVisibility(0);
        }

        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            tfh.this.w.setVisibility(8);
            if (((Boolean) csgj.a.e()).booleanValue()) {
                tfh tfhVar = tfh.this;
                int a = eped.a(tfhVar.n.c);
                if (a != 0 && a == 3) {
                    Intent d = ((ayfg) tfhVar.l.b()).d(tfh.this.b.z());
                    d.addFlags(VCardConfig.FLAG_APPEND_TYPE_PARAM);
                    d.putExtra("opted_in_through_growth_kit_flow", true);
                    tfh.this.b.aD(d);
                    return;
                }
            }
            tex texVar = tfh.this.b;
            texVar.aD(tcn.c(texVar.z()));
            ellj.f(new tig(), tfh.this.b);
        }

        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void m(Object obj, Throwable th) {
            tfh.this.w.setVisibility(8);
            tfh.this.x.setEnabled(true);
            tfh.this.y.setEnabled(true);
            tfh.a.s("Failure to restore CMS data.", th);
            if (!(th instanceof cshx)) {
                tfh tfhVar = tfh.this;
                String Y = tfhVar.b.Y(R.string.fi_account_confirmation_error_message);
                if (tfhVar.t == null) {
                    View rootView = tfhVar.b.fe().getWindow().getDecorView().getRootView();
                    if (rootView == null) {
                        csjb e = tfh.a.e();
                        e.I("View from fragment is null in FiAccountConfirmationFragmentPeer callback");
                        e.r();
                        return;
                    } else {
                        tfh tfhVar2 = tfh.this;
                        Snackbar r = Snackbar.r(rootView, Y, -1);
                        r.o();
                        tfhVar2.t = r;
                    }
                }
                if (tfh.this.t.l()) {
                    return;
                }
                tfh.this.t.i();
                return;
            }
            final tfh tfhVar3 = tfh.this;
            if (csgj.a() && ((Boolean) ((cfup) cshy.a.get()).e()).booleanValue() && ((Optional) ((fbbb) tfhVar3.p).a).isPresent()) {
            }
            if (tfhVar3.B == null) {
                tex texVar = tfhVar3.b;
                elbx elbxVar = tfhVar3.e;
                Context z = texVar.z();
                elbb elbbVar = new elbb(elbxVar, "FiAccountConfirmationFragmentPeer:showMutexDialog:negative", new DialogInterface.OnClickListener() { // from class: tff
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                        ellj.f(new tig(), tfh.this.b);
                    }
                });
                elbb elbbVar2 = new elbb(elbxVar, "FiAccountConfirmationFragmentPeer:showMutexDialog:positive", new DialogInterface.OnClickListener() { // from class: tfg
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        tfh tfhVar4 = tfh.this;
                        tfhVar4.d.g(ejlp.b(tfhVar4.r.e(tfhVar4.c)), tfhVar4.q);
                    }
                });
                z.getClass();
                ehft ehftVar = new ehft(z);
                ehftVar.x(R.string.non_bnr_build_mutex_delete_backup_to_use_fi_title);
                ehftVar.m(R.string.non_bnr_build_mutex_delete_backup_to_use_fi_text);
                ehftVar.p(z.getString(R.string.non_bnr_build_mutex_cancel_button_text), elbbVar);
                ehftVar.u(z.getString(R.string.non_bnr_build_mutex_delete_backup_to_use_fi_positive_button_text), elbbVar2);
                ehftVar.j(false);
                iv create = ehftVar.create();
                create.setCanceledOnTouchOutside(false);
                tfhVar3.B = create;
            }
            if (tfhVar3.B.isShowing()) {
                return;
            }
            tfhVar3.B.show();
        }
    }

    public tfh(tfj tfjVar, tex texVar, eisx eisxVar, ejlq ejlqVar, elbx elbxVar, ejwl ejwlVar, tgw tgwVar, eixo eixoVar, ffbr ffbrVar, ffbr ffbrVar2, ellq ellqVar, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, crue crueVar, akzt akztVar) {
        this.n = tfjVar;
        this.b = texVar;
        this.c = eisxVar;
        this.d = ejlqVar;
        this.e = elbxVar;
        this.f = ejwlVar;
        this.g = tgwVar;
        this.h = eixoVar;
        this.i = ffbrVar;
        this.j = ffbrVar2;
        this.k = ellqVar;
        this.l = ffbrVar3;
        this.r = crueVar;
        this.p = ffbrVar5;
        this.o = ffbrVar4;
        this.m = akztVar;
    }

    public final void a() {
        Context z = this.b.z();
        int a2 = eped.a(this.n.c);
        if (a2 == 0) {
            a2 = 1;
        }
        final eisx eisxVar = this.c;
        final tgw tgwVar = this.g;
        boolean z2 = a2 == 3;
        this.d.i(new ejlp((adhu.b() && ((Optional) tgwVar.f.b()).isPresent()) ? tgwVar.e.a(eisxVar, z2, z).i(new eroh() { // from class: tgr
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                tgw tgwVar2 = tgw.this;
                return ((bzjz) ((Optional) tgwVar2.f.b()).get()).b(eisxVar).h(new emwl() { // from class: tgs
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        return true;
                    }
                }, tgwVar2.d);
            }
        }, tgwVar.d) : tgwVar.e.a(eisxVar, z2, z).h(new emwl() { // from class: tgt
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return true;
            }
        }, tgwVar.d)), new ejlm(null), this.s);
    }

    /* compiled from: PG */
    final class a implements ejlr<Void, Void> {
        public a() {
        }

        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            tfh.a.p("Deleted the B&R, close the Fi Account confirmation");
            ellj.f(new tig(), tfh.this.b);
        }

        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void m(Object obj, Throwable th) {
            tfh.a.s("Deleted the B&R failed, close the Fi Account confirmation", th);
            ellj.f(new tig(), tfh.this.b);
        }

        @Override // defpackage.ejlr
        public final /* synthetic */ void b(Object obj) {
        }
    }
}
