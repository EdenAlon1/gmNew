package defpackage;

import android.content.Context;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ealj implements ealf {
    public static final entd a = entd.c("GnpSdk");
    public final Context b;
    public final Class c;
    public final ears d;
    private final ffhd e;

    public ealj(Context context, ffhd ffhdVar, Class cls, ears earsVar) {
        context.getClass();
        ffhdVar.getClass();
        cls.getClass();
        earsVar.getClass();
        this.b = context;
        this.e = ffhdVar;
        this.c = cls;
        this.d = earsVar;
    }

    @Override // defpackage.ealf
    public final Object a(ealb ealbVar, eagt eagtVar, Bundle bundle, Long l, ffgu ffguVar) {
        return ffra.a(this.e, new eali(ealbVar, this, eagtVar, bundle, l, null), ffguVar);
    }

    @Override // defpackage.ealf
    public final Object b(int i, ffgu ffguVar) {
        Object a2 = ffra.a(this.e, new ealh(this, i, null), ffguVar);
        return a2 == ffhh.a ? a2 : ffcu.a;
    }
}
