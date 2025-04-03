package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fwz extends ffkk implements ffjm {
    final /* synthetic */ float a = 32.0f;
    final /* synthetic */ ebe b;
    final /* synthetic */ ffjm c;
    final /* synthetic */ ffjm d;
    final /* synthetic */ ffjm e;
    final /* synthetic */ long f;
    final /* synthetic */ ffjm g;
    final /* synthetic */ long h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fwz(float f, ebe ebeVar, ffjm ffjmVar, ffjm ffjmVar2, ffjm ffjmVar3, long j, ffjm ffjmVar4, long j2) {
        super(2);
        this.b = ebeVar;
        this.c = ffjmVar;
        this.d = ffjmVar2;
        this.e = ffjmVar3;
        this.f = j;
        this.g = ffjmVar4;
        this.h = j2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        int i;
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            hvi c = eba.c(ebs.q(hvi.e, 0.0f, 32.0f, 1), this.b);
            Object f = hfdVar.f();
            if (f == hfc.a) {
                f = new fxk();
                hfdVar.y(f);
            }
            ffjm ffjmVar = this.c;
            ffjm ffjmVar2 = this.d;
            ffjm ffjmVar3 = this.e;
            long j = this.f;
            ffjm ffjmVar4 = this.g;
            long j2 = this.h;
            fxk fxkVar = (fxk) f;
            int a = hey.a(hfdVar);
            hgb c2 = hfdVar.c();
            hvi b = huz.b(hfdVar, c);
            int i2 = ist.a;
            ffix ffixVar = iss.a;
            hfdVar.M();
            hfdVar.x();
            if (hfdVar.H()) {
                hfdVar.j(ffixVar);
            } else {
                hfdVar.z();
            }
            hlc.b(hfdVar, fxkVar, iss.e);
            hlc.b(hfdVar, c2, iss.d);
            ffjm ffjmVar5 = iss.f;
            if (hfdVar.H() || !ffkj.e(hfdVar.f(), Integer.valueOf(a))) {
                Integer valueOf = Integer.valueOf(a);
                hfdVar.y(valueOf);
                hfdVar.h(valueOf, ffjmVar5);
            }
            hlc.b(hfdVar, b, iss.c);
            if (ffjmVar == null && ffjmVar2 == null) {
                hfdVar.v(-1432458502);
                hfdVar.o();
                i = 0;
            } else {
                hfdVar.v(-1433110060);
                hvi a2 = ioe.a(hvi.e, "leadingIcon");
                int i3 = huo.a;
                ipn a3 = dyc.a(hum.e, false);
                int a4 = hey.a(hfdVar);
                i = 0;
                hgb c3 = hfdVar.c();
                hvi b2 = huz.b(hfdVar, a2);
                ffix ffixVar2 = iss.a;
                hfdVar.M();
                hfdVar.x();
                if (hfdVar.H()) {
                    hfdVar.j(ffixVar2);
                } else {
                    hfdVar.z();
                }
                hlc.b(hfdVar, a3, iss.e);
                hlc.b(hfdVar, c3, iss.d);
                ffjm ffjmVar6 = iss.f;
                if (hfdVar.H() || !ffkj.e(hfdVar.f(), Integer.valueOf(a4))) {
                    Integer valueOf2 = Integer.valueOf(a4);
                    hfdVar.y(valueOf2);
                    hfdVar.h(valueOf2, ffjmVar6);
                }
                hlc.b(hfdVar, b2, iss.c);
                if (ffjmVar != null) {
                    hfdVar.v(833083251);
                    ffjmVar.a(hfdVar, 0);
                    hfdVar.o();
                } else {
                    hfdVar.v(833191317);
                    hfz.a(fzc.a.c(new ibw(j)), ffjmVar2, hfdVar, 8);
                    hfdVar.o();
                }
                hfdVar.n();
                hfdVar.o();
            }
            hvi a5 = ioe.a(hvi.e, ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LABEL);
            int i4 = fxi.a;
            hvi e = eba.e(a5, 8.0f, 0.0f);
            dxi dxiVar = dxu.a;
            int i5 = huo.a;
            ipn a6 = ebm.a(dxiVar, hum.n, hfdVar, 54);
            int a7 = hey.a(hfdVar);
            hgb c4 = hfdVar.c();
            hvi b3 = huz.b(hfdVar, e);
            ffix ffixVar3 = iss.a;
            hfdVar.M();
            hfdVar.x();
            if (hfdVar.H()) {
                hfdVar.j(ffixVar3);
            } else {
                hfdVar.z();
            }
            hlc.b(hfdVar, a6, iss.e);
            hlc.b(hfdVar, c4, iss.d);
            ffjm ffjmVar7 = iss.f;
            if (hfdVar.H() || !ffkj.e(hfdVar.f(), Integer.valueOf(a7))) {
                Integer valueOf3 = Integer.valueOf(a7);
                hfdVar.y(valueOf3);
                hfdVar.h(valueOf3, ffjmVar7);
            }
            hlc.b(hfdVar, b3, iss.c);
            ffjmVar4.a(hfdVar, Integer.valueOf(i));
            hfdVar.n();
            if (ffjmVar3 != null) {
                hfdVar.v(-1432061640);
                hvi a8 = ioe.a(hvi.e, "trailingIcon");
                ipn a9 = dyc.a(hum.e, i);
                int a10 = hey.a(hfdVar);
                hgb c5 = hfdVar.c();
                hvi b4 = huz.b(hfdVar, a8);
                ffix ffixVar4 = iss.a;
                hfdVar.M();
                hfdVar.x();
                if (hfdVar.H()) {
                    hfdVar.j(ffixVar4);
                } else {
                    hfdVar.z();
                }
                hlc.b(hfdVar, a9, iss.e);
                hlc.b(hfdVar, c5, iss.d);
                ffjm ffjmVar8 = iss.f;
                if (hfdVar.H() || !ffkj.e(hfdVar.f(), Integer.valueOf(a10))) {
                    Integer valueOf4 = Integer.valueOf(a10);
                    hfdVar.y(valueOf4);
                    hfdVar.h(valueOf4, ffjmVar8);
                }
                hlc.b(hfdVar, b4, iss.c);
                hfz.a(fzc.a.c(new ibw(j2)), ffjmVar3, hfdVar, 8);
                hfdVar.n();
                hfdVar.o();
            } else {
                hfdVar.v(-1431598438);
                hfdVar.o();
            }
            hfdVar.n();
        }
        return ffcu.a;
    }
}
