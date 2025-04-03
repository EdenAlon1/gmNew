package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aakf {
    public final Context a;
    private final ffhd b;
    private final zvo c;

    public aakf(Context context, ffhd ffhdVar, zvo zvoVar) {
        context.getClass();
        ffhdVar.getClass();
        this.a = context;
        this.b = ffhdVar;
        this.c = zvoVar;
    }

    public final axrc a(ffsk ffskVar, final alyu alyuVar, final ffji ffjiVar) {
        if (alyuVar instanceof aqba) {
            return new axqd(new ffix() { // from class: aakb
                @Override // defpackage.ffix
                public final Object invoke() {
                    return new dofn(dofo.a, null);
                }
            });
        }
        if (!(alyuVar instanceof alyp)) {
            throw new ffcd();
        }
        alyp alypVar = (alyp) alyuVar;
        final dofn dofnVar = new dofn(abce.a(alypVar.a(), this.a), new ffix() { // from class: aakc
            @Override // defpackage.ffix
            public final Object invoke() {
                ffji ffjiVar2 = ffji.this;
                if (ffjiVar2 != null) {
                    ffjiVar2.invoke(((alyp) alyuVar).a().b());
                }
                return ffcu.a;
            }
        });
        if (!(alypVar.a().g() instanceof ufr)) {
            return new axqd(new ffix() { // from class: aakd
                @Override // defpackage.ffix
                public final Object invoke() {
                    return dofn.this;
                }
            });
        }
        fgcm a = fgdm.a(dofnVar);
        alxr a2 = alypVar.a();
        axol.k(ffskVar, this.b, new aake(a, this.c.a(((ufr) a2.g()).e()), a2, this, null), 2);
        return axrg.a(a);
    }
}
