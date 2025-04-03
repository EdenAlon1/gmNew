package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ebtt implements rao {
    public final ebwq a;
    private final Context b;

    public ebtt(Context context, ebwq ebwqVar) {
        this.b = context;
        this.a = ebwqVar;
    }

    @Override // defpackage.rao
    public final /* bridge */ /* synthetic */ ran a(Object obj, int i, int i2, qtu qtuVar) {
        ebtq ebtqVar = (ebtq) obj;
        emxf.b(i == i2, "Width and height must be the same");
        return new ran(ebtqVar, new ebts(this, ebtqVar, i == Integer.MIN_VALUE ? 120 : ebwf.b(this.b, i)));
    }

    @Override // defpackage.rao
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        return ((ebsw) ((ebtq) obj).b()).d;
    }
}
