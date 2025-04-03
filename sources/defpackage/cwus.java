package defpackage;

import android.content.Context;
import android.content.Intent;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwus implements ffjm {
    final /* synthetic */ List a;
    final /* synthetic */ Context b;
    final /* synthetic */ Intent c;

    public cwus(List list, Context context, Intent intent) {
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
            cwvc.b(this.a, this.b, this.c, hfdVar, 0);
        }
        return ffcu.a;
    }
}
