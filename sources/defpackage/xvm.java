package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xvm implements ffji {
    final /* synthetic */ xvs a;
    final /* synthetic */ List b;

    public xvm(xvs xvsVar, List list) {
        this.a = xvsVar;
        this.b = list;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        this.a.j.a(this.b, Integer.valueOf(((Number) obj).intValue()));
        return ffcu.a;
    }
}
