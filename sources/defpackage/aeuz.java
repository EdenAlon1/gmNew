package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.material.snackbar.Snackbar;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aeuz implements ajhy {
    public static final entd a = entd.c("BugleInAppUpdate");
    public final ffbr b;
    public final errl c;
    public final ffbr d;
    public final ffbr e;
    public final ffbr f;
    public final ffbr g;
    aevw h;
    public final Context i;
    public final errl j;
    public aeux k;
    private ajid l;

    public aeuz(errl errlVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, Context context, ffbr ffbrVar5, errl errlVar2) {
        this.c = errlVar;
        this.b = ffbrVar;
        this.e = ffbrVar2;
        this.d = ffbrVar3;
        this.f = ffbrVar4;
        this.i = context;
        this.g = ffbrVar5;
        this.j = errlVar2;
    }

    @Override // defpackage.ajhy
    public final elfl b() {
        return ((aevc) this.e.b()).b().h(new emwl() { // from class: aeuv
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return Boolean.valueOf(((Optional) obj).isPresent());
            }
        }, this.c);
    }

    @Override // defpackage.ajhy
    public final void c(ajid ajidVar, ViewGroup viewGroup) {
        this.l = ajidVar;
    }

    @Override // defpackage.ajhy
    public final void d() {
        this.l.b();
    }

    @Override // defpackage.ajhy
    public final boolean e(Context context, ViewGroup viewGroup, boolean z) {
        h((eg) context);
        return true;
    }

    @Override // defpackage.ajhy
    public final int f() {
        return 10;
    }

    public final void h(final eg egVar) {
        axnw.h(((aevc) this.e.b()).b().i(new eroh() { // from class: aeuu
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final Optional optional = (Optional) obj;
                if (optional.isEmpty()) {
                    ((ensz) aeuz.a.n().h("com/google/android/apps/messaging/inappupdate/InAppUpdatePresenterImpl", "launchUpdateFlow", 136, "InAppUpdatePresenterImpl.java")).q("Start update flow decision: no update.");
                    return elfo.e(null);
                }
                final eg egVar2 = egVar;
                final aeuz aeuzVar = aeuz.this;
                aeuzVar.h = (aevw) optional.get();
                aevw aevwVar = aeuzVar.h;
                ehun ehunVar = aevwVar.b;
                ehuz ehuzVar = aevwVar.a;
                if (ehunVar.d == 11) {
                    ((ensz) aeuz.a.n().h("com/google/android/apps/messaging/inappupdate/InAppUpdatePresenterImpl", "launchUpdateFlow", 145, "InAppUpdatePresenterImpl.java")).q("Update downloaded. Prompting user to install.");
                    aeuzVar.i(egVar2);
                    return elfo.e(null);
                }
                ehvl ehvlVar = (ehvl) ehuzVar;
                int i = ehvlVar.a ^ 1;
                if (i != 0) {
                    aeuzVar.k = new aeux(aeuzVar, egVar2);
                    ehur ehurVar = (ehur) aeuzVar.b.b();
                    aeux aeuxVar = aeuzVar.k;
                    aeuxVar.getClass();
                    ehurVar.c(aeuxVar);
                }
                boolean z = 1 == i;
                ((ensz) aeuz.a.n().h("com/google/android/apps/messaging/inappupdate/InAppUpdatePresenterImpl", "launchUpdateFlow", 158, "InAppUpdatePresenterImpl.java")).r("Started update flow, flow type: %s", ehvlVar.a);
                if (ehunVar.c == 3) {
                    ((aeva) aeuzVar.d.b()).b(13, z);
                }
                if (((aspb) aeuzVar.f.b()).a()) {
                    int i2 = aeuzVar.h.c;
                    int i3 = i2 == 0 ? 2 : i2 == 1 ? 3 : 4;
                    aeva aevaVar = (aeva) aeuzVar.d.b();
                    epyo epyoVar = (epyo) epys.a.createBuilder();
                    epyoVar.copyOnWrite();
                    epys epysVar = (epys) epyoVar.instance;
                    epysVar.c = 1;
                    epysVar.b |= 1;
                    int i4 = 1 == i ? 2 : 3;
                    epyoVar.copyOnWrite();
                    epys epysVar2 = (epys) epyoVar.instance;
                    epysVar2.d = i4 - 1;
                    epysVar2.b |= 2;
                    epyoVar.copyOnWrite();
                    epys epysVar3 = (epys) epyoVar.instance;
                    epysVar3.f = i3 - 1;
                    epysVar3.b |= 8;
                    aevaVar.a((epys) epyoVar.build());
                } else {
                    ((aeva) aeuzVar.d.b()).b(2, z);
                }
                return elfl.g(duin.a(((ehur) aeuzVar.b.b()).b(ehunVar, egVar2, ehuzVar))).i(new eroh() { // from class: aeuo
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        int i5;
                        aevv aevvVar;
                        int intValue = ((Integer) obj2).intValue();
                        final aeuz aeuzVar2 = aeuz.this;
                        boolean a2 = ((aspb) aeuzVar2.f.b()).a();
                        Optional optional2 = optional;
                        if (a2 && ((aevw) optional2.get()).c == 0) {
                            aeuzVar2.d();
                        }
                        boolean z2 = 1 == (((ehvl) aeuzVar2.h.a).a ^ 1);
                        if (intValue == -1) {
                            ((ensz) aeuz.a.n().h("com/google/android/apps/messaging/inappupdate/InAppUpdatePresenterImpl", "handleUpdateTaskResult", 242, "InAppUpdatePresenterImpl.java")).q("Update prompt accepted.");
                            ((aeva) aeuzVar2.d.b()).b(3, z2);
                        } else {
                            if (intValue == 0) {
                                ((ensz) aeuz.a.n().h("com/google/android/apps/messaging/inappupdate/InAppUpdatePresenterImpl", "handleUpdateTaskResult", 246, "InAppUpdatePresenterImpl.java")).q("Update prompt declined.");
                                aeuzVar2.j();
                                ((aeva) aeuzVar2.d.b()).b(4, z2);
                                if (((aspb) aeuzVar2.f.b()).a() && optional2.isPresent()) {
                                    final eg egVar3 = egVar2;
                                    if (!egVar3.isDestroyed() && (i5 = ((aevw) optional2.get()).c) != 0) {
                                        if (i5 - 1 != 0) {
                                            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: aeus
                                                @Override // android.content.DialogInterface.OnClickListener
                                                public final void onClick(DialogInterface dialogInterface, int i6) {
                                                    elfl c;
                                                    aeuz aeuzVar3 = aeuz.this;
                                                    ((aeva) aeuzVar3.d.b()).b(21, false);
                                                    dialogInterface.dismiss();
                                                    aeuzVar3.d();
                                                    ajyr ajyrVar = (ajyr) aeuzVar3.g.b();
                                                    c = axol.c(ajyrVar.h, ffhe.a, ffsm.a, new ajyj(ajyrVar, null));
                                                    axnw.h(c);
                                                }
                                            };
                                            DialogInterface.OnClickListener onClickListener2 = new DialogInterface.OnClickListener() { // from class: aeut
                                                @Override // android.content.DialogInterface.OnClickListener
                                                public final void onClick(DialogInterface dialogInterface, int i6) {
                                                    aeuz aeuzVar3 = aeuz.this;
                                                    ((aeva) aeuzVar3.d.b()).b(20, false);
                                                    dialogInterface.dismiss();
                                                    aeuzVar3.h(egVar3);
                                                }
                                            };
                                            ((aeva) aeuzVar2.d.b()).b(19, false);
                                            aevvVar = new aevv(aeuzVar2.i.getString(R.string.update_to_restore_backup_warning_reprompt_dialog_title), aeuzVar2.i.getText(R.string.update_to_restore_backup_warning_reprompt_dialog_subtext), aeuzVar2.i.getString(R.string.update_to_restore_backup_warning_dialog_positive_button_caption_v2), aeuzVar2.i.getString(R.string.update_to_restore_backup_warning_reprompt_dialog_negative_button_caption), onClickListener, onClickListener2);
                                        } else {
                                            DialogInterface.OnClickListener onClickListener3 = new DialogInterface.OnClickListener() { // from class: aeuq
                                                @Override // android.content.DialogInterface.OnClickListener
                                                public final void onClick(DialogInterface dialogInterface, int i6) {
                                                    elfl c;
                                                    aeuz aeuzVar3 = aeuz.this;
                                                    ((aeva) aeuzVar3.d.b()).b(18, false);
                                                    dialogInterface.dismiss();
                                                    aeuzVar3.d();
                                                    ajyr ajyrVar = (ajyr) aeuzVar3.g.b();
                                                    c = axol.c(ajyrVar.h, ffhe.a, ffsm.a, new ajyi(ajyrVar, null));
                                                    axnw.h(c);
                                                }
                                            };
                                            DialogInterface.OnClickListener onClickListener4 = new DialogInterface.OnClickListener() { // from class: aeur
                                                @Override // android.content.DialogInterface.OnClickListener
                                                public final void onClick(DialogInterface dialogInterface, int i6) {
                                                    aeuz aeuzVar3 = aeuz.this;
                                                    ((aeva) aeuzVar3.d.b()).b(17, false);
                                                    dialogInterface.dismiss();
                                                    aeuzVar3.h(egVar3);
                                                }
                                            };
                                            ((aeva) aeuzVar2.d.b()).b(16, false);
                                            aevvVar = new aevv(qmn.a(aeuzVar2.i.getString(R.string.update_to_restore_backup_warning_initial_dialog_title_v2), "7", 7), aeuzVar2.i.getText(R.string.update_to_restore_backup_warning_initial_dialog_subtext_v2), aeuzVar2.i.getString(R.string.update_to_restore_backup_warning_dialog_positive_button_caption_v2), aeuzVar2.i.getString(R.string.update_to_restore_backup_warning_initial_dialog_negative_button_caption), onClickListener3, onClickListener4);
                                        }
                                        aeun.a(egVar3, aevvVar);
                                        return ((aevc) aeuzVar2.e.b()).d();
                                    }
                                }
                                return ((aevc) aeuzVar2.e.b()).c(z2);
                            }
                            if (intValue == 1) {
                                ((ensz) ((ensz) aeuz.a.j()).h("com/google/android/apps/messaging/inappupdate/InAppUpdatePresenterImpl", "handleUpdateTaskResult", 267, "InAppUpdatePresenterImpl.java")).q("Update prompt activity failed");
                                aeuzVar2.j();
                                ((aeva) aeuzVar2.d.b()).b(5, z2);
                                return ((aevc) aeuzVar2.e.b()).c(z2);
                            }
                        }
                        return elfo.e(null);
                    }
                }, ((aspb) aeuzVar.f.b()).a() ? aeuzVar.j : aeuzVar.c).e(Throwable.class, new emwl() { // from class: aeup
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        ((ensz) ((ensz) ((ensz) aeuz.a.j()).g((Throwable) obj2)).h("com/google/android/apps/messaging/inappupdate/InAppUpdatePresenterImpl", "launchUpdateFlow", 191, "InAppUpdatePresenterImpl.java")).q("Could not start update flow due to error.");
                        return null;
                    }
                }, aeuzVar.c);
            }
        }, this.c));
        egVar.P().c(new aeuy(this));
    }

    public final void i(eg egVar) {
        Snackbar q = Snackbar.q(egVar.getWindow().getDecorView().getRootView(), R.string.install_update_snackbar_text, -2);
        q.w(R.string.install_update_snackbar_action_text, new View.OnClickListener() { // from class: aeuw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ((ensz) aeuz.a.n().h("com/google/android/apps/messaging/inappupdate/InAppUpdatePresenterImpl", "showInstallUpdateSnackbar", 363, "InAppUpdatePresenterImpl.java")).q("User accepted complete update prompt.");
                aeuz aeuzVar = aeuz.this;
                aeuzVar.j();
                ((aeva) aeuzVar.d.b()).b(15, true);
                ((ehur) aeuzVar.b.b()).e();
            }
        });
        q.i();
    }

    public final void j() {
        if (this.k == null) {
            return;
        }
        ehur ehurVar = (ehur) this.b.b();
        aeux aeuxVar = this.k;
        aeuxVar.getClass();
        ehurVar.d(aeuxVar);
        this.k = null;
    }

    @Override // defpackage.ajhy
    public final /* synthetic */ int n() {
        return ajhx.a();
    }

    @Override // defpackage.ajhy
    public final /* synthetic */ void g() {
    }
}
