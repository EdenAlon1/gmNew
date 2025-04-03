package defpackage;

import android.content.Intent;
import android.view.View;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvub implements dvqu {
    public final dvcp a;
    public final errl b;
    public final dvqr c;
    public final ehvz d;
    private final errl e;

    public dvub(ehvz ehvzVar, errl errlVar, dvqr dvqrVar, dvcp dvcpVar, errl errlVar2) {
        this.d = ehvzVar;
        this.e = errlVar;
        this.c = dvqrVar;
        this.a = dvcpVar;
        this.b = errlVar2;
    }

    @Override // defpackage.dvqu
    public final View a(eg egVar, evzd evzdVar) {
        return null;
    }

    @Override // defpackage.dvqu
    public final void b(final eg egVar, View view, final dvdp dvdpVar, evzm evzmVar) {
        dhre dhreVar;
        ehvt ehvtVar = ehwe.a;
        ehwe ehweVar = this.d.a;
        ehvtVar.d("requestInAppReview (%s)", ehweVar.c);
        if (ehweVar.b == null) {
            ehwe.a.b("Play Store app is either not installed or not the official version", new Object[0]);
            dhreVar = dhrt.b(new ehvv());
        } else {
            dhri dhriVar = new dhri();
            ehweVar.b.b(new ehwb(ehweVar, dhriVar, dhriVar), dhriVar);
            dhreVar = dhriVar.a;
        }
        dhreVar.o(this.e, new dhqs() { // from class: dvtz
            @Override // defpackage.dhqs
            public final void a(dhre dhreVar2) {
                dhre dhreVar3;
                final dvub dvubVar = dvub.this;
                final dvdp dvdpVar2 = dvdpVar;
                if (!dhreVar2.m()) {
                    dvubVar.c.b(dvdpVar2, dvqt.FAILED_UNKNOWN);
                    return;
                }
                ehvx ehvxVar = (ehvx) dhreVar2.i();
                evzd evzdVar = dvdpVar2.c().f;
                if (evzdVar == null) {
                    evzdVar = evzd.a;
                }
                if (evzdVar.f) {
                    dvubVar.c.b(dvdpVar2, dvqt.SUCCESS);
                    return;
                }
                dvubVar.a.i(dvdpVar2);
                ehvz ehvzVar = dvubVar.d;
                if (ehvxVar.b()) {
                    dhreVar3 = dhrt.c(null);
                } else {
                    eg egVar2 = egVar;
                    Intent intent = new Intent(egVar2, (Class<?>) PlayCoreDialogWrapperActivity.class);
                    intent.putExtra("confirmation_intent", ehvxVar.a());
                    intent.putExtra("window_flags", egVar2.getWindow().getDecorView().getWindowSystemUiVisibility());
                    dhri dhriVar2 = new dhri();
                    intent.putExtra("result_receiver", new ehvy(ehvzVar.b, dhriVar2));
                    egVar2.startActivity(intent);
                    dhreVar3 = dhriVar2.a;
                }
                dhreVar3.o(erpp.a, new dhqs() { // from class: dvua
                    @Override // defpackage.dhqs
                    public final void a(dhre dhreVar4) {
                        final dvub dvubVar2 = dvub.this;
                        final dvdp dvdpVar3 = dvdpVar2;
                        if (dhreVar4.m()) {
                            erny.g(dvubVar2.c.b(dvdpVar3, dvqt.SUCCESS), new eroh() { // from class: dvty
                                @Override // defpackage.eroh
                                public final ListenableFuture a(Object obj) {
                                    return dvub.this.c.a(dvdpVar3, null);
                                }
                            }, dvubVar2.b);
                        } else {
                            dvubVar2.c.b(dvdpVar3, dvqt.FAILED_UNKNOWN);
                        }
                    }
                });
            }
        });
    }

    @Override // defpackage.dvqu
    public final boolean c(evzc evzcVar) {
        return evzcVar == evzc.UITYPE_RATING_NATIVE_STORE_REVIEW_DIALOG;
    }
}
