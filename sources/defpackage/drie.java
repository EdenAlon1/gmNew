package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.apps.messaging.R;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drie extends drhd {
    private static final enru ag = enru.c("com/google/android/libraries/compose/magiccompose/ui/screen/MagicComposeScreen");
    public Optional a;
    private final dszr ah;
    public dqiz b;
    public dqiy c;
    public ComposeView d;
    public esgx e;

    public drie() {
        super(Integer.valueOf(R.layout.magic_compose_screen), new drhe((fgcm) null, 3));
        this.ah = dszr.h;
    }

    public static final /* synthetic */ drhe f(drie drieVar) {
        return (drhe) drieVar.bA();
    }

    @Override // defpackage.ea
    public final void ap(View view, Bundle bundle) {
        view.getClass();
        this.d = (ComposeView) view.findViewById(R.id.screen_content_compose_view);
        by().e("MagicComposeScreen#onViewCreated", new ffix() { // from class: drhw
            @Override // defpackage.ffix
            public final Object invoke() {
                drie drieVar = drie.this;
                return ffqy.d(drieVar.bF(), null, null, new drhz(drieVar, null), 3);
            }
        });
    }

    @Override // defpackage.dtaa
    public final void bd() {
        Object c;
        ((drja) ((drhe) bA()).a.c()).f.invoke();
        fgcm fgcmVar = ((drhe) bA()).a;
        do {
            c = fgcmVar.c();
        } while (!fgcmVar.g(c, drja.a((drja) c, ffel.a, 0, null, null, null, null, null, null, null, null, null, false, null, null, 0, null, 65534)));
    }

    @Override // defpackage.dtaa
    public final void be() {
        ffqy.d(bF(), null, null, new drhx(this, null), 3);
    }

    public final dqiy e() {
        dqiy dqiyVar = this.c;
        if (dqiyVar != null) {
            return dqiyVar;
        }
        ffkj.c("styleUsageProcessor");
        return null;
    }

    @Override // defpackage.drhd, defpackage.dslv, defpackage.ea
    public final void g(Context context) {
        super.g(context);
        dqiz dqizVar = this.b;
        if (dqizVar == null) {
            ffkj.c("styleUsageProcessorFactory");
            dqizVar = null;
        }
        this.c = dqizVar.a(new dqkd(31));
        by().e("MagicComposeScreen#onAttach", new ffix() { // from class: drhv
            @Override // defpackage.ffix
            public final Object invoke() {
                return Boolean.valueOf(drie.this.e().d());
            }
        });
    }

    @Override // defpackage.ea
    public final void m() {
        super.m();
        ((drja) ((drhe) bA()).a.c()).g.invoke();
    }

    public final Optional p() {
        Optional optional = this.a;
        if (optional != null) {
            return optional;
        }
        ffkj.c("magicComposeViewFactory");
        return null;
    }

    public final void q(esgx esgxVar) {
        Object c;
        int D = ffdx.D(((drja) ((drhe) bA()).a.c()).o, esgxVar);
        if (D < 0) {
            ((enrr) ag.j().h("com/google/android/libraries/compose/magiccompose/ui/screen/MagicComposeScreen", "setInitialStyle", 96, "MagicComposeScreen.kt")).t("MagicRewriteStyle '%s' not found", esgxVar);
        }
        fgcm fgcmVar = ((drhe) bA()).a;
        do {
            c = fgcmVar.c();
        } while (!fgcmVar.g(c, drja.a((drja) c, null, 0, null, null, null, null, null, null, null, null, null, false, null, null, Math.max(D, 0), null, 49151)));
    }

    @Override // defpackage.dsyk
    public final dsyj s() {
        return null;
    }

    @Override // defpackage.dtaa
    public final dszr t() {
        return this.ah;
    }
}
