package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ebto implements rao {
    private final Context a;

    public ebto(Context context) {
        this.a = context.getApplicationContext();
    }

    @Override // defpackage.rao
    public final /* bridge */ /* synthetic */ ran a(Object obj, int i, int i2, qtu qtuVar) {
        ebtq ebtqVar = (ebtq) obj;
        emxf.b(i == i2, "Width and height must be the same");
        ebtf ebtfVar = new ebtf(this.a);
        if (i == Integer.MIN_VALUE) {
            i = 120;
        }
        return new ran(ebtqVar, new ebtp(ebtfVar, ebtqVar, i));
    }

    @Override // defpackage.rao
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        return ebtf.b(((ebtq) obj).b());
    }
}
