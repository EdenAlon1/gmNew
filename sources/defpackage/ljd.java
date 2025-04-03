package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ljd extends ffkk implements ffjm {
    final /* synthetic */ Class a;
    final /* synthetic */ hvi b;
    final /* synthetic */ ljg c;
    final /* synthetic */ Bundle d;
    final /* synthetic */ ffji e;
    final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ljd(Class cls, hvi hviVar, ljg ljgVar, Bundle bundle, ffji ffjiVar, int i) {
        super(2);
        this.a = cls;
        this.b = hviVar;
        this.c = ljgVar;
        this.d = bundle;
        this.e = ffjiVar;
        this.f = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        lje.a(this.a, this.b, this.c, this.d, this.e, (hfd) obj, hip.a(this.f | 1));
        return ffcu.a;
    }
}
