package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class dmvb {
    public static dmvt a(dmvt dmvtVar, boolean z, ffix ffixVar) {
        if (dmvtVar instanceof dmve) {
            dmve dmveVar = (dmve) dmvtVar;
            doas doasVar = dmveVar.g;
            doas a = doas.a(doasVar, null, new dmvr(ffixVar, doasVar), 3);
            doas doasVar2 = dmveVar.h;
            doas a2 = doasVar2 != null ? doas.a(doasVar2, null, new dmvr(ffixVar, doasVar2), 3) : null;
            ffix ffixVar2 = dmveVar.i;
            return new dmve(dmveVar.a, dmveVar.b, dmveVar.c, dmveVar.d, dmveVar.e, dmveVar.f, a, a2, z ? new dmvs(ffixVar, ffixVar2) : ffixVar2);
        }
        if (dmvtVar instanceof dmvk) {
            dmvk dmvkVar = (dmvk) dmvtVar;
            doas doasVar3 = dmvkVar.e;
            doas a3 = doas.a(doasVar3, null, new dmvr(ffixVar, doasVar3), 3);
            doas doasVar4 = dmvkVar.f;
            doas a4 = doasVar4 != null ? doas.a(doasVar4, null, new dmvr(ffixVar, doasVar4), 3) : null;
            ffix ffixVar3 = dmvkVar.g;
            return new dmvk(dmvkVar.a, dmvkVar.b, dmvkVar.c, a3, a4, z ? new dmvs(ffixVar, ffixVar3) : ffixVar3);
        }
        if (dmvtVar instanceof dmvi) {
            dmvi dmviVar = (dmvi) dmvtVar;
            doas doasVar5 = dmviVar.e;
            doas a5 = doasVar5 != null ? doas.a(doasVar5, null, new dmvr(ffixVar, doasVar5), 3) : null;
            doas doasVar6 = dmviVar.f;
            doas a6 = doasVar6 != null ? doas.a(doasVar6, null, new dmvr(ffixVar, doasVar6), 3) : null;
            ffix ffixVar4 = dmviVar.g;
            return dmvi.b(dmviVar, null, null, null, a5, a6, z ? new dmvs(ffixVar, ffixVar4) : ffixVar4, 15);
        }
        if (dmvtVar instanceof dmvg) {
            dmvg dmvgVar = (dmvg) dmvtVar;
            doas doasVar7 = dmvgVar.g;
            doas a7 = doasVar7 != null ? doas.a(doasVar7, null, new dmvr(ffixVar, doasVar7), 3) : null;
            doas doasVar8 = dmvgVar.h;
            doas a8 = doasVar8 != null ? doas.a(doasVar8, null, new dmvr(ffixVar, doasVar8), 3) : null;
            ffix ffixVar5 = dmvgVar.i;
            return new dmvg(dmvgVar.a, dmvgVar.b, dmvgVar.c, dmvgVar.d, dmvgVar.e, dmvgVar.f, a7, a8, z ? new dmvs(ffixVar, ffixVar5) : ffixVar5);
        }
        if (dmvtVar instanceof dmvl) {
            throw null;
        }
        if (!(dmvtVar instanceof dmvq)) {
            if (!(dmvtVar instanceof dmvn)) {
                throw new ffcd();
            }
            dmvn dmvnVar = (dmvn) dmvtVar;
            ffix ffixVar6 = dmvnVar.e;
            return new dmvn(dmvnVar.a, dmvnVar.b, dmvnVar.c, dmvnVar.d, z ? new dmvs(ffixVar, ffixVar6) : ffixVar6);
        }
        dmvq dmvqVar = (dmvq) dmvtVar;
        doas doasVar9 = dmvqVar.d;
        doas a9 = doas.a(doasVar9, null, new dmvr(ffixVar, doasVar9), 3);
        doas doasVar10 = dmvqVar.e;
        doas a10 = doasVar10 != null ? doas.a(doasVar10, null, new dmvr(ffixVar, doasVar10), 3) : null;
        ffix ffixVar7 = dmvqVar.f;
        return new dmvq(dmvqVar.g, dmvqVar.a, dmvqVar.b, dmvqVar.c, a9, a10, z ? new dmvs(ffixVar, ffixVar7) : ffixVar7);
    }
}
