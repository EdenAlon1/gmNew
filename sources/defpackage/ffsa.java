package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffsa {
    public static final ffhd a(ffhd ffhdVar, ffhd ffhdVar2) {
        return !e(ffhdVar2) ? ffhdVar.plus(ffhdVar2) : d(ffhdVar, ffhdVar2, false);
    }

    public static final ffhd b(ffsk ffskVar, ffhd ffhdVar) {
        ffhd d = d(ffskVar.hT(), ffhdVar, true);
        ffhd plus = ffso.a ? d.plus(new ffsh(ffso.c.incrementAndGet())) : d;
        return (d == fftc.a || d.get(ffgw.k) != null) ? plus : plus.plus(fftc.a);
    }

    public static final ffvo c(ffgu ffguVar, ffhd ffhdVar, Object obj) {
        ffvo ffvoVar = null;
        if (!(ffguVar instanceof ffhs)) {
            return null;
        }
        if (ffhdVar.get(ffvp.a) != null) {
            ffhs ffhsVar = (ffhs) ffguVar;
            while (true) {
                if ((ffhsVar instanceof ffsy) || (ffhsVar = ffhsVar.dI()) == null) {
                    break;
                }
                if (ffhsVar instanceof ffvo) {
                    ffvoVar = (ffvo) ffhsVar;
                    break;
                }
            }
            if (ffvoVar != null) {
                ffvoVar.d(ffhdVar, obj);
            }
        }
        return ffvoVar;
    }

    private static final ffhd d(ffhd ffhdVar, ffhd ffhdVar2, final boolean z) {
        boolean e = e(ffhdVar);
        boolean e2 = e(ffhdVar2);
        if (!e && !e2) {
            return ffhdVar.plus(ffhdVar2);
        }
        final fflb fflbVar = new fflb();
        fflbVar.a = ffhdVar2;
        ffhd ffhdVar3 = (ffhd) ffhdVar.fold(ffhe.a, new ffjm() { // from class: ffry
            @Override // defpackage.ffjm
            public final Object a(Object obj, Object obj2) {
                ffhd ffhdVar4 = (ffhd) obj;
                ffha ffhaVar = (ffha) obj2;
                if (!(ffhaVar instanceof eled)) {
                    return ffhdVar4.plus(ffhaVar);
                }
                fflb fflbVar2 = fflb.this;
                ffha ffhaVar2 = ((ffhd) fflbVar2.a).get(ffhaVar.getKey());
                if (ffhaVar2 == null) {
                    return ffhdVar4.plus(z ? ((eled) ffhaVar).c() : (eled) ffhaVar);
                }
                fflbVar2.a = ((ffhd) fflbVar2.a).minusKey(ffhaVar.getKey());
                eled eledVar = (eled) ffhaVar;
                eleb elebVar = ekyf.b().e;
                boolean z2 = elebVar != null ? elebVar.b : true;
                boolean f = elebVar != null ? elebVar.f() : false;
                boolean z3 = ekyf.a || eledVar.c;
                boolean z4 = !z2 || f || eledVar.d || eledVar.f.f();
                eled eledVar2 = (eled) ffhaVar2.get(eled.a);
                if (eledVar2 != null) {
                    z3 = z3 || eledVar2.c || eledVar2.e;
                    z4 = (z4 || eledVar2.d) && !eledVar2.e;
                }
                return ffhdVar4.plus(new eled(eledVar.b, z3 || eledVar.e, z4 && !eledVar.e, false));
            }
        });
        if (e2) {
            fflbVar.a = ((ffhd) fflbVar.a).fold(ffhe.a, new ffjm() { // from class: ffrz
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ffhd ffhdVar4 = (ffhd) obj;
                    ffha ffhaVar = (ffha) obj2;
                    return ffhaVar instanceof eled ? ffhdVar4.plus(((eled) ffhaVar).c()) : ffhdVar4.plus(ffhaVar);
                }
            });
        }
        return ffhdVar3.plus((ffhd) fflbVar.a);
    }

    private static final boolean e(ffhd ffhdVar) {
        return ((Boolean) ffhdVar.fold(false, new ffjm() { // from class: ffrx
            @Override // defpackage.ffjm
            public final Object a(Object obj, Object obj2) {
                ffha ffhaVar = (ffha) obj2;
                boolean z = true;
                if (!((Boolean) obj).booleanValue() && !(ffhaVar instanceof eled)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        })).booleanValue();
    }
}
