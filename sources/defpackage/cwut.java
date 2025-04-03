package defpackage;

import android.content.Context;
import android.content.Intent;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwut implements ffjm {
    final /* synthetic */ List a;
    final /* synthetic */ Context b;
    final /* synthetic */ Intent c;

    public cwut(List list, Context context, Intent intent) {
        this.a = list;
        this.b = context;
        this.c = intent;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            hfz.b(new hil[0], hpx.d(1927811206, new cwus(this.a, this.b, this.c), hfdVar), hfdVar, 48);
        }
        return ffcu.a;
    }
}
