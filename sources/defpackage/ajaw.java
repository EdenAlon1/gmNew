package defpackage;

import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ajaw extends ffhv implements ffjm {
    final /* synthetic */ ajax a;
    final /* synthetic */ eixz b;
    final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajaw(ajax ajaxVar, eixz eixzVar, String str, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = ajaxVar;
        this.b = eixzVar;
        this.c = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ajaw) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ajbz ajbzVar = (ajbz) this.a.d.b();
        String str = this.b.c;
        str.getClass();
        ewgb ewgbVar = (ewgb) ewge.a.createBuilder();
        ewgc ewgcVar = (ewgc) ewgd.a.createBuilder();
        ewgcVar.copyOnWrite();
        ewgd ewgdVar = (ewgd) ewgcVar.instance;
        ewgdVar.b = 1;
        ewgdVar.c = str;
        ewgd ewgdVar2 = (ewgd) ewgcVar.build();
        ewgbVar.copyOnWrite();
        ewge ewgeVar = (ewge) ewgbVar.instance;
        ewgdVar2.getClass();
        ewgeVar.c = ewgdVar2;
        ewgeVar.b |= 1;
        ewfx ewfxVar = (ewfx) ewfy.a.createBuilder();
        ewgf ewgfVar = (ewgf) ewgg.a.createBuilder();
        ewgfVar.copyOnWrite();
        ewgg ewggVar = (ewgg) ewgfVar.instance;
        ewggVar.c = 629;
        ewggVar.b |= 1;
        ewfxVar.copyOnWrite();
        ewfy ewfyVar = (ewfy) ewfxVar.instance;
        ewgg ewggVar2 = (ewgg) ewgfVar.build();
        ewggVar2.getClass();
        ewfyVar.e = ewggVar2;
        ewfyVar.b |= 4;
        ewfxVar.copyOnWrite();
        ewfy ewfyVar2 = (ewfy) ewfxVar.instance;
        ewge ewgeVar2 = (ewge) ewgbVar.build();
        ewgeVar2.getClass();
        ewfyVar2.c = ewgeVar2;
        ewfyVar2.b |= 1;
        ewfxVar.copyOnWrite();
        ewfy ewfyVar3 = (ewfy) ewfxVar.instance;
        ewge ewgeVar3 = (ewge) ewgbVar.build();
        ewgeVar3.getClass();
        ewfyVar3.d = ewgeVar3;
        ewfyVar3.b |= 2;
        ewgr ewgrVar = (ewgr) ewgs.a.createBuilder();
        evuj evujVar = evuj.im;
        ewgrVar.copyOnWrite();
        ewgs ewgsVar = (ewgs) ewgrVar.instance;
        ewgsVar.c = evujVar.a();
        ewgsVar.b |= 1;
        ewgp ewgpVar = (ewgp) ewgq.a.createBuilder();
        ewgj ewgjVar = (ewgj) ewgk.a.createBuilder();
        ewgn ewgnVar = (ewgn) ewgo.a.createBuilder();
        ewgnVar.copyOnWrite();
        ewgo ewgoVar = (ewgo) ewgnVar.instance;
        ewgoVar.b |= 1;
        ewgoVar.c = R.string.gemini_eea_tos_title;
        ewgh ewghVar = (ewgh) ewgi.a.createBuilder();
        ewghVar.copyOnWrite();
        ewgi ewgiVar = (ewgi) ewghVar.instance;
        ewgiVar.b |= 1;
        ewgiVar.c = "%1$s";
        int a = ajbzVar.c.a();
        ewghVar.copyOnWrite();
        ewgi ewgiVar2 = (ewgi) ewghVar.instance;
        ewgiVar2.b |= 4;
        ewgiVar2.e = a;
        ewgnVar.copyOnWrite();
        ewgo ewgoVar2 = (ewgo) ewgnVar.instance;
        ewgi ewgiVar3 = (ewgi) ewghVar.build();
        ewgiVar3.getClass();
        ewgoVar2.a();
        ewgoVar2.d.add(ewgiVar3);
        ewgjVar.copyOnWrite();
        ewgk ewgkVar = (ewgk) ewgjVar.instance;
        ewgo ewgoVar3 = (ewgo) ewgnVar.build();
        ewgoVar3.getClass();
        ewgkVar.c = ewgoVar3;
        ewgkVar.b |= 1;
        ewgl ewglVar = (ewgl) ewgm.a.createBuilder();
        ewgn ewgnVar2 = (ewgn) ewgo.a.createBuilder();
        ewgnVar2.copyOnWrite();
        ewgo ewgoVar4 = (ewgo) ewgnVar2.instance;
        ewgoVar4.b |= 1;
        ewgoVar4.c = R.string.gemini_tos_preamble;
        ewglVar.copyOnWrite();
        ewgm ewgmVar = (ewgm) ewglVar.instance;
        ewgo ewgoVar5 = (ewgo) ewgnVar2.build();
        ewgoVar5.getClass();
        ewgmVar.c = ewgoVar5;
        ewgmVar.b |= 1;
        ewgl ewglVar2 = (ewgl) ewgm.a.createBuilder();
        ewgn ewgnVar3 = (ewgn) ewgo.a.createBuilder();
        ewgnVar3.copyOnWrite();
        ewgo ewgoVar6 = (ewgo) ewgnVar3.instance;
        ewgoVar6.b |= 1;
        ewgoVar6.c = R.string.gemini_tos_header1;
        ewglVar2.copyOnWrite();
        ewgm ewgmVar2 = (ewgm) ewglVar2.instance;
        ewgo ewgoVar7 = (ewgo) ewgnVar3.build();
        ewgoVar7.getClass();
        ewgmVar2.c = ewgoVar7;
        ewgmVar2.b |= 1;
        ewgn ewgnVar4 = (ewgn) ewgo.a.createBuilder();
        ewgnVar4.copyOnWrite();
        ewgo ewgoVar8 = (ewgo) ewgnVar4.instance;
        ewgoVar8.b |= 1;
        ewgoVar8.c = R.string.gemini_tos_body1_extend;
        ewgh ewghVar2 = (ewgh) ewgi.a.createBuilder();
        ewghVar2.copyOnWrite();
        ewgi ewgiVar4 = (ewgi) ewghVar2.instance;
        ewgiVar4.b |= 1;
        ewgiVar4.c = "%1$s";
        ewghVar2.copyOnWrite();
        ewgi ewgiVar5 = (ewgi) ewghVar2.instance;
        ewgiVar5.b |= 4;
        ewgiVar5.e = R.string.gemini_eea_activity_link_text;
        String string = ajbzVar.b.getString(R.string.penpal_activity_link);
        ewghVar2.copyOnWrite();
        ewgi ewgiVar6 = (ewgi) ewghVar2.instance;
        string.getClass();
        ewgiVar6.b |= 8;
        ewgiVar6.f = string;
        ewgh ewghVar3 = (ewgh) ewgi.a.createBuilder();
        ewghVar3.copyOnWrite();
        ewgi ewgiVar7 = (ewgi) ewghVar3.instance;
        ewgiVar7.b |= 1;
        ewgiVar7.c = "%2$s";
        ewghVar3.copyOnWrite();
        ewgi ewgiVar8 = (ewgi) ewghVar3.instance;
        ewgiVar8.b |= 4;
        ewgiVar8.e = R.string.gemini_tos_how_it_works;
        String string2 = ajbzVar.b.getString(R.string.penpal_privacy_help_hub_link);
        ewghVar3.copyOnWrite();
        ewgi ewgiVar9 = (ewgi) ewghVar3.instance;
        string2.getClass();
        ewgiVar9.b |= 8;
        ewgiVar9.f = string2;
        ewgh ewghVar4 = (ewgh) ewgi.a.createBuilder();
        ewghVar4.copyOnWrite();
        ewgi ewgiVar10 = (ewgi) ewghVar4.instance;
        ewgiVar10.b |= 1;
        ewgiVar10.c = "{3}";
        ewghVar4.copyOnWrite();
        ewgi ewgiVar11 = (ewgi) ewghVar4.instance;
        ewgiVar11.b |= 2;
        ewgiVar11.d = "3";
        ewgh ewghVar5 = (ewgh) ewgi.a.createBuilder();
        ewghVar5.copyOnWrite();
        ewgi ewgiVar12 = (ewgi) ewghVar5.instance;
        ewgiVar12.b |= 1;
        ewgiVar12.c = "{72}";
        ewghVar5.copyOnWrite();
        ewgi ewgiVar13 = (ewgi) ewghVar5.instance;
        ewgiVar13.b |= 2;
        ewgiVar13.d = "72";
        ewgnVar4.a(ffdx.g((ewgi) ewghVar2.build(), (ewgi) ewghVar3.build(), (ewgi) ewghVar4.build(), (ewgi) ewghVar5.build()));
        ewglVar2.copyOnWrite();
        ewgm ewgmVar3 = (ewgm) ewglVar2.instance;
        ewgo ewgoVar9 = (ewgo) ewgnVar4.build();
        ewgoVar9.getClass();
        ewgmVar3.e = ewgoVar9;
        ewgmVar3.b |= 4;
        ewgl ewglVar3 = (ewgl) ewgm.a.createBuilder();
        ewgn ewgnVar5 = (ewgn) ewgo.a.createBuilder();
        ewgnVar5.copyOnWrite();
        ewgo ewgoVar10 = (ewgo) ewgnVar5.instance;
        ewgoVar10.b |= 1;
        ewgoVar10.c = R.string.gemini_tos_footnote;
        ewgh ewghVar6 = (ewgh) ewgi.a.createBuilder();
        ewghVar6.copyOnWrite();
        ewgi ewgiVar14 = (ewgi) ewghVar6.instance;
        ewgiVar14.b |= 1;
        ewgiVar14.c = "%1$s";
        ewghVar6.copyOnWrite();
        ewgi ewgiVar15 = (ewgi) ewghVar6.instance;
        ewgiVar15.b |= 4;
        ewgiVar15.e = R.string.penpal_eea_tos_confirm_button;
        ewgh ewghVar7 = (ewgh) ewgi.a.createBuilder();
        ewghVar7.copyOnWrite();
        ewgi ewgiVar16 = (ewgi) ewghVar7.instance;
        ewgiVar16.b |= 1;
        ewgiVar16.c = "%2$s";
        ewghVar7.copyOnWrite();
        ewgi ewgiVar17 = (ewgi) ewghVar7.instance;
        ewgiVar17.b |= 4;
        ewgiVar17.e = R.string.penpal_tos_link_text;
        String string3 = ajbzVar.b.getString(R.string.penpal_tos_link);
        ewghVar7.copyOnWrite();
        ewgi ewgiVar18 = (ewgi) ewghVar7.instance;
        string3.getClass();
        ewgiVar18.b |= 8;
        ewgiVar18.f = string3;
        ewgh ewghVar8 = (ewgh) ewgi.a.createBuilder();
        ewghVar8.copyOnWrite();
        ewgi ewgiVar19 = (ewgi) ewghVar8.instance;
        ewgiVar19.b |= 1;
        ewgiVar19.c = "%3$s";
        ewghVar8.copyOnWrite();
        ewgi ewgiVar20 = (ewgi) ewghVar8.instance;
        ewgiVar20.b |= 4;
        ewgiVar20.e = R.string.penpal_ai_terms_link_text;
        String string4 = ajbzVar.b.getString(R.string.penpal_ai_terms_link);
        ewghVar8.copyOnWrite();
        ewgi ewgiVar21 = (ewgi) ewghVar8.instance;
        string4.getClass();
        ewgiVar21.b |= 8;
        ewgiVar21.f = string4;
        ewgh ewghVar9 = (ewgh) ewgi.a.createBuilder();
        ewghVar9.copyOnWrite();
        ewgi ewgiVar22 = (ewgi) ewghVar9.instance;
        ewgiVar22.b |= 1;
        ewgiVar22.c = "%4$s";
        ewghVar9.copyOnWrite();
        ewgi ewgiVar23 = (ewgi) ewghVar9.instance;
        ewgiVar23.b |= 4;
        ewgiVar23.e = R.string.penpal_privacy_notice_link_text;
        String string5 = ajbzVar.b.getString(R.string.penpal_privacy_notice_link);
        ewghVar9.copyOnWrite();
        ewgi ewgiVar24 = (ewgi) ewghVar9.instance;
        string5.getClass();
        ewgiVar24.b |= 8;
        ewgiVar24.f = string5;
        ewgnVar5.a(ffdx.g((ewgi) ewghVar6.build(), (ewgi) ewghVar7.build(), (ewgi) ewghVar8.build(), (ewgi) ewghVar9.build()));
        ewglVar3.copyOnWrite();
        ewgm ewgmVar4 = (ewgm) ewglVar3.instance;
        ewgo ewgoVar11 = (ewgo) ewgnVar5.build();
        ewgoVar11.getClass();
        ewgmVar4.d = ewgoVar11;
        ewgmVar4.b |= 2;
        List g = ffdx.g((ewgm) ewglVar.build(), (ewgm) ewglVar2.build(), (ewgm) ewglVar3.build());
        ewgjVar.copyOnWrite();
        ewgk ewgkVar2 = (ewgk) ewgjVar.instance;
        eygr eygrVar = ewgkVar2.d;
        if (!eygrVar.c()) {
            ewgkVar2.d = eyfy.mutableCopy(eygrVar);
        }
        String str2 = this.c;
        eydl.addAll(g, ewgkVar2.d);
        ewgjVar.copyOnWrite();
        ewgk ewgkVar3 = (ewgk) ewgjVar.instance;
        ewgkVar3.b |= 2;
        ewgkVar3.e = R.string.penpal_eea_tos_confirm_button;
        ewgjVar.copyOnWrite();
        ewgk ewgkVar4 = (ewgk) ewgjVar.instance;
        ewgkVar4.b |= 4;
        ewgkVar4.f = R.string.penpal_tos_deny;
        ewgk ewgkVar5 = (ewgk) ewgjVar.build();
        ewgpVar.copyOnWrite();
        ewgq ewgqVar = (ewgq) ewgpVar.instance;
        ewgkVar5.getClass();
        ewgqVar.c = ewgkVar5;
        ewgqVar.b |= 1073741824;
        ewgrVar.copyOnWrite();
        ewgs ewgsVar2 = (ewgs) ewgrVar.instance;
        ewgq ewgqVar2 = (ewgq) ewgpVar.build();
        ewgqVar2.getClass();
        ewgsVar2.d = ewgqVar2;
        ewgsVar2.b |= 8;
        ewfxVar.copyOnWrite();
        ewfy ewfyVar4 = (ewfy) ewfxVar.instance;
        ewgs ewgsVar3 = (ewgs) ewgrVar.build();
        ewgsVar3.getClass();
        ewfyVar4.f = ewgsVar3;
        ewfyVar4.b |= 8;
        eyfy build = ewfxVar.build();
        build.getClass();
        ensk h = ajbz.a.h();
        h.Y(ente.a, "Bugle");
        ((enrr) h.h("com/google/android/apps/messaging/penpal/consent/PenpalTosAriRequestScheduler", "grantGeminiNonEeaTos", 152, "PenpalTosAriRequestScheduler.kt")).q("queue penpal non-eea tos ari request.");
        arbp arbpVar = (arbp) ajbzVar.d.b();
        arbq arbqVar = (arbq) arbr.a.createBuilder();
        arbqVar.copyOnWrite();
        arbr arbrVar = (arbr) arbqVar.instance;
        arbrVar.b |= 1;
        arbrVar.c = str2;
        arbqVar.copyOnWrite();
        arbr arbrVar2 = (arbr) arbqVar.instance;
        arbrVar2.d = (ewfy) build;
        arbrVar2.b |= 2;
        ((cevh) arbpVar.a.b()).a(ceyr.g("ari_work_handler", (arbr) arbqVar.build()));
        ajax ajaxVar = this.a;
        cjeo cjeoVar = ajaxVar.e;
        Object b = ajaxVar.g.b();
        b.getClass();
        cjeoVar.o((eisx) b);
        this.a.c();
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ajaw(this.a, this.b, this.c, ffguVar);
    }
}
