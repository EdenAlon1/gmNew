package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvlw extends dvka {
    static final emwl a = new dvml();
    static final emwl b = new dvmh();
    static final emwl c = new dvlu();
    static final emwl d = new dvlp();
    static final emwl e = new dvlz();
    static final emwl f = new dvlq();

    @Override // defpackage.dvka
    public final void b(eybb eybbVar, evyv evyvVar) {
        int i = true != eybbVar.g ? 2 : 3;
        evyvVar.copyOnWrite();
        evzd evzdVar = (evzd) evyvVar.instance;
        evzd evzdVar2 = evzd.a;
        evzdVar.h = i - 1;
        evzdVar.b |= 16;
    }

    @Override // defpackage.dvka
    public final void c(eybb eybbVar, evyv evyvVar) {
        if (eybbVar.c == 13) {
            Object apply = f.apply((eyal) eybbVar.d);
            evyvVar.copyOnWrite();
            evzd evzdVar = (evzd) evyvVar.instance;
            evzd evzdVar2 = evzd.a;
            apply.getClass();
            evzdVar.d = apply;
            evzdVar.c = 11;
        }
    }

    @Override // defpackage.dvka
    public final void d(eybb eybbVar, evyv evyvVar) {
        eyba b2 = eyba.b(eybbVar.f);
        if (b2 == null) {
            b2 = eyba.UI_THEME_UNSPECIFIED;
        }
        eyba eybaVar = eyba.UI_THEME_GOOGLE_MATERIAL;
        int a2 = eyay.a(eybbVar.c);
        if (a2 == 0) {
            throw null;
        }
        switch (a2 - 1) {
            case 0:
                evzc evzcVar = b2 == eybaVar ? evzc.UITYPE_GM_DIALOG : evzc.UITYPE_DIALOG;
                evyvVar.copyOnWrite();
                evzd evzdVar = (evzd) evyvVar.instance;
                evzd evzdVar2 = evzd.a;
                evzdVar.e = evzcVar.s;
                evzdVar.b |= 2;
                return;
            case 1:
                evzc evzcVar2 = b2 == eybaVar ? evzc.UITYPE_GM_TAP_TARGET : evzc.UITYPE_TAP_TARGET;
                evyvVar.copyOnWrite();
                evzd evzdVar3 = (evzd) evyvVar.instance;
                evzd evzdVar4 = evzd.a;
                evzdVar3.e = evzcVar2.s;
                evzdVar3.b |= 2;
                return;
            case 2:
                evzc evzcVar3 = b2 == eybaVar ? evzc.UITYPE_GM_TOOLTIP : evzc.UITYPE_TOOLTIP;
                evyvVar.copyOnWrite();
                evzd evzdVar5 = (evzd) evyvVar.instance;
                evzd evzdVar6 = evzd.a;
                evzdVar5.e = evzcVar3.s;
                evzdVar5.b |= 2;
                return;
            case 3:
                evzc evzcVar4 = evzc.UITYPE_PERMISSION;
                evyvVar.copyOnWrite();
                evzd evzdVar7 = (evzd) evyvVar.instance;
                evzd evzdVar8 = evzd.a;
                evzdVar7.e = evzcVar4.s;
                evzdVar7.b |= 2;
                return;
            case 4:
                evzc evzcVar5 = evzc.UITYPE_RATING_NATIVE_STORE_REVIEW_DIALOG;
                evyvVar.copyOnWrite();
                evzd evzdVar9 = (evzd) evyvVar.instance;
                evzd evzdVar10 = evzd.a;
                evzdVar9.e = evzcVar5.s;
                evzdVar9.b |= 2;
                return;
            case 5:
                evzc evzcVar6 = evzc.UITYPE_GNP_CUSTOM_UI;
                evyvVar.copyOnWrite();
                evzd evzdVar11 = (evzd) evyvVar.instance;
                evzd evzdVar12 = evzd.a;
                evzdVar11.e = evzcVar6.s;
                evzdVar11.b |= 2;
                return;
            case 6:
                evzc evzcVar7 = evzc.UITYPE_NONE;
                evyvVar.copyOnWrite();
                evzd evzdVar13 = (evzd) evyvVar.instance;
                evzd evzdVar14 = evzd.a;
                evzdVar13.e = evzcVar7.s;
                evzdVar13.b |= 2;
                return;
            default:
                return;
        }
    }

    @Override // defpackage.dvka
    public final void e(eybb eybbVar, evyv evyvVar) {
        if (eybbVar.c == 4) {
            Object apply = e.apply((eybi) eybbVar.d);
            evyvVar.copyOnWrite();
            evzd evzdVar = (evzd) evyvVar.instance;
            evzd evzdVar2 = evzd.a;
            apply.getClass();
            evzdVar.d = apply;
            evzdVar.c = 6;
        }
    }

    @Override // defpackage.dvka
    public final void f(eybb eybbVar, evyv evyvVar) {
        if (eybbVar.c == 1) {
            Object apply = d.apply((eyaj) eybbVar.d);
            evyvVar.copyOnWrite();
            evzd evzdVar = (evzd) evyvVar.instance;
            evzd evzdVar2 = evzd.a;
            apply.getClass();
            evzdVar.d = apply;
            evzdVar.c = 2;
        }
    }

    @Override // defpackage.dvka
    public final void g(eybb eybbVar, evyv evyvVar) {
        if (eybbVar.c == 2) {
            Object apply = c.apply((eyaw) eybbVar.d);
            evyvVar.copyOnWrite();
            evzd evzdVar = (evzd) evyvVar.instance;
            evzd evzdVar2 = evzd.a;
            apply.getClass();
            evzdVar.d = apply;
            evzdVar.c = 3;
        }
    }

    @Override // defpackage.dvka
    public final void h(eybb eybbVar, evyv evyvVar) {
        if (eybbVar.c == 3) {
            Object apply = b.apply((eybm) eybbVar.d);
            evyvVar.copyOnWrite();
            evzd evzdVar = (evzd) evyvVar.instance;
            evzd evzdVar2 = evzd.a;
            apply.getClass();
            evzdVar.d = apply;
            evzdVar.c = 5;
        }
    }
}
