package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dppy implements ffjn {
    final /* synthetic */ hvi a;
    final /* synthetic */ cxj b;
    final /* synthetic */ float c;
    final /* synthetic */ int d;

    public dppy(hvi hviVar, cxj cxjVar, float f, int i) {
        this.a = hviVar;
        this.b = cxjVar;
        this.c = f;
        this.d = i;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        ((ebq) obj).getClass();
        if ((intValue & 17) == 16 && hfdVar.I()) {
            hfdVar.s();
        } else {
            geq.a(jie.a(R.drawable.ic_camera_switch_24px, hfdVar, 0), jii.a(this.d, hfdVar), ebs.k(hxz.a(this.a, ((Number) this.b.d()).floatValue() + this.c), 42.0f), ibw.d, hfdVar, 3072, 0);
        }
        return ffcu.a;
    }
}
