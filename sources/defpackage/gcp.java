package defpackage;

import com.google.android.apps.messaging.R;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gcp extends ffkk implements ffjo {
    final /* synthetic */ ffmj a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;
    final /* synthetic */ ffji d;
    final /* synthetic */ fzr e;
    final /* synthetic */ dmug f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gcp(ffmj ffmjVar, int i, int i2, ffji ffjiVar, dmug dmugVar, fzr fzrVar) {
        super(4);
        this.a = ffmjVar;
        this.b = i;
        this.c = i2;
        this.d = ffjiVar;
        this.f = dmugVar;
        this.e = fzrVar;
    }

    @Override // defpackage.ffjo
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        int intValue = ((Number) obj2).intValue();
        hfd hfdVar = (hfd) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 48) == 0) {
            intValue2 |= true != hfdVar.B(intValue) ? 16 : 32;
        }
        if ((intValue2 & 145) == 144 && hfdVar.I()) {
            hfdVar.s();
        } else {
            int i = intValue + this.a.a;
            String a = fwc.a(i, 0, 7);
            hvi i2 = ebs.i(hvi.e, 72.0f, 36.0f);
            boolean z = i == this.b;
            boolean z2 = i == this.c;
            boolean D = hfdVar.D(this.d) | hfdVar.B(i);
            ffji ffjiVar = this.d;
            Object f = hfdVar.f();
            if (D || f == hfc.a) {
                f = new gco(ffjiVar, i);
                hfdVar.y(f);
            }
            ffix ffixVar = (ffix) f;
            boolean b = this.f.b(i);
            String format = String.format(hcb.b(R.string.m3c_date_picker_navigate_to_year_description, hfdVar), Arrays.copyOf(new Object[]{a}, 1));
            format.getClass();
            gcy.g(a, i2, z, z2, ffixVar, b, format, this.e, hfdVar, 48);
        }
        return ffcu.a;
    }
}
