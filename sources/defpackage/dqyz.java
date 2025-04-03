package defpackage;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqyz implements dsgb {
    public static final enru a = enru.c("com/google/android/libraries/compose/emotify/controller/EmotifyButtonControllerImpl");
    public final dqze b;
    public final ffsk c;
    public final drau d;
    public adg e;
    public ffix f;
    public float g;
    public boolean h;
    public final adak i;
    public final ajeh j;
    private final ea k;
    private boolean l;
    private final adao m;

    public dqyz(ea eaVar, dqze dqzeVar, ajeh ajehVar, Optional optional, Optional optional2, Optional optional3, ffsk ffskVar) {
        dqzeVar.getClass();
        optional.getClass();
        ffskVar.getClass();
        this.k = eaVar;
        this.b = dqzeVar;
        this.j = ajehVar;
        this.c = ffskVar;
        this.i = (adak) fflm.b(optional);
        this.d = (drau) fflm.b(optional3);
        this.m = (adao) fflm.b(optional2);
    }

    @Override // defpackage.dsgb
    public final void a(View view, boolean z, ffix ffixVar) {
        egyi.a.invoke(view);
        ((iya) view).j();
        ComposeView composeView = (ComposeView) view;
        composeView.a(new hpw(592140713, true, new dqyw(composeView, z, ffixVar, this)));
        ((enrr) a.h().h("com/google/android/libraries/compose/emotify/controller/EmotifyButtonControllerImpl", "addView", 107, "EmotifyButtonControllerImpl.kt")).q("Create Emotify button is created and displayed.");
        drau drauVar = this.d;
        if (drauVar != null) {
            drauVar.c(drav.c);
        }
        adao adaoVar = this.m;
        if (adaoVar != null) {
            adaoVar.a();
        }
        this.l = true;
    }

    @Override // defpackage.dsgb
    public final void b(Object obj, ffix ffixVar) {
        this.f = ffixVar;
        if (obj instanceof Float) {
            this.g = ((Number) obj).floatValue();
        }
        if (obj instanceof Boolean) {
            this.h = ((Boolean) obj).booleanValue();
        }
        if (this.e == null) {
            this.e = this.k.fe().h.b("inputKey", new dqyp(), new dqyx(this));
        }
    }

    @Override // defpackage.dsgb
    public final void c() {
        if (this.l) {
            ((enrr) a.h().h("com/google/android/libraries/compose/emotify/controller/EmotifyButtonControllerImpl", "onDisplayed", 127, "EmotifyButtonControllerImpl.kt")).q("Create Emotify button is displayed without view recreation.");
            drau drauVar = this.d;
            if (drauVar != null) {
                drauVar.c(drav.c);
            }
            adao adaoVar = this.m;
            if (adaoVar != null) {
                adaoVar.a();
            }
        }
    }
}
