package defpackage;

import androidx.compose.ui.platform.ComposeView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqyu implements ffjn {
    final /* synthetic */ ComposeView a;
    final /* synthetic */ boolean b;
    final /* synthetic */ ffix c;
    final /* synthetic */ dqyz d;

    public dqyu(ComposeView composeView, boolean z, ffix ffixVar, dqyz dqyzVar) {
        this.a = composeView;
        this.b = z;
        this.c = ffixVar;
        this.d = dqyzVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hfd hfdVar = (hfd) obj2;
        ((Number) obj3).intValue();
        ((crw) obj).getClass();
        String string = this.a.getContext().getString(R.string.emotify_create_button);
        string.getClass();
        dmzz dmzzVar = dmzz.dE;
        hfdVar.v(-1190825143);
        boolean D = hfdVar.D(this.c) | hfdVar.F(this.d);
        Object f = hfdVar.f();
        if (D || f == hfc.a) {
            final dqyz dqyzVar = this.d;
            final ffix ffixVar = this.c;
            ffix ffixVar2 = new ffix() { // from class: dqyt
                @Override // defpackage.ffix
                public final Object invoke() {
                    if (!((Boolean) ffix.this.invoke()).booleanValue()) {
                        final dqyz dqyzVar2 = dqyzVar;
                        ((enrr) dqyz.a.h().h("com/google/android/libraries/compose/emotify/controller/EmotifyButtonControllerImpl$addView$1$1$1$2", "invoke$lambda$2$lambda$1", 86, "EmotifyButtonControllerImpl.kt")).q("Create Emotify button clicked.");
                        adak adakVar = dqyzVar2.i;
                        if (adakVar != null) {
                            adakVar.a(drav.c);
                        }
                        ajeh ajehVar = dqyzVar2.j;
                        ffji ffjiVar = new ffji() { // from class: dqys
                            @Override // defpackage.ffji
                            public final Object invoke(Object obj4) {
                                String str = (String) obj4;
                                str.getClass();
                                dqyz dqyzVar3 = dqyz.this;
                                adg adgVar = dqyzVar3.e;
                                if (adgVar == null) {
                                    ffkj.c("launcher");
                                    adgVar = null;
                                }
                                adgVar.a(new dqyq(str, dqyzVar3.g, dqyzVar3.h), null);
                                return ffcu.a;
                            }
                        };
                        fr J = ajehVar.a.J();
                        ea h = J.h("ReactionPickerFragment");
                        if (h != null) {
                            cg cgVar = new cg(J);
                            cgVar.n(h);
                            cgVar.c();
                        }
                        abgv abgvVar = (abgv) abgx.a.createBuilder();
                        abgvVar.getClass();
                        abgy.d(4, abgvVar);
                        abgy.b(ajehVar.a.Y(R.string.select_image_for_photomoji), abgvVar);
                        abgu a = abhi.a(abgy.a(abgvVar));
                        a.t(J, "ReactionPickerFragment");
                        a.H().l = new ffix() { // from class: ajef
                            @Override // defpackage.ffix
                            public final Object invoke() {
                                return ffcu.a;
                            }
                        };
                        a.H().k = new ffix() { // from class: ajeg
                            @Override // defpackage.ffix
                            public final Object invoke() {
                                return ffcu.a;
                            }
                        };
                        a.H().o = ffjiVar;
                    }
                    return ffcu.a;
                }
            };
            hfdVar.y(ffixVar2);
            f = ffixVar2;
        }
        hfdVar.o();
        dmgq.b(new dmgh(string, dmzzVar, false, this.b, (ffix) f), null, hfdVar, 0);
        return ffcu.a;
    }
}
