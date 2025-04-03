package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aifj extends ffkk implements ffji {
    final /* synthetic */ ffji a;
    final /* synthetic */ List b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aifj(ffji ffjiVar, List list) {
        super(1);
        this.a = ffjiVar;
        this.b = list;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return this.a.invoke(this.b.get(((Number) obj).intValue()));
    }
}
