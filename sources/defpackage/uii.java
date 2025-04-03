package defpackage;

import android.content.Context;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uii implements fbba {
    /* JADX WARN: Type inference failed for: r5v0, types: [dpnk, java.lang.Object] */
    public static dqdf a(Context context, ffhd ffhdVar, lmy lmyVar, Optional optional, sfz sfzVar, ejmh ejmhVar, Optional optional2, Optional optional3, ffbr ffbrVar) {
        context.getClass();
        ffhdVar.getClass();
        lmyVar.getClass();
        sfzVar.getClass();
        ejmhVar.getClass();
        ffbrVar.getClass();
        Object obj = optional.isEmpty() ? null : ((Boolean) uky.h.e()).booleanValue() ? dpng.a : optional.get();
        optional3.isPresent();
        uig uigVar = new uig(ffhdVar, context);
        optional2.isPresent();
        dpnj dpnjVar = new dpnj((dpni) obj, uigVar, optional2.get(), ((asxz) ffbrVar.b()).a());
        if (uih.a(lmyVar) || !context.getPackageManager().hasSystemFeature("android.hardware.camera.any")) {
            dpnjVar = null;
        }
        Object e = uky.j.e();
        e.getClass();
        dqgf dqgfVar = new dqgf(true, ((Boolean) e).booleanValue(), 1);
        ffbz a = uih.a(lmyVar) ? ffca.a(new ffix() { // from class: uie
            @Override // defpackage.ffix
            public final Object invoke() {
                drkw drkwVar = drld.b;
                return drki.a();
            }
        }) : dqdf.a;
        Object e2 = uky.i.e();
        e2.getClass();
        return new dqdf(dqgfVar, dpnjVar, a, ((Boolean) e2).booleanValue(), true, true, true, 3);
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
