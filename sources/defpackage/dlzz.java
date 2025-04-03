package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dlzz implements ffji {
    final /* synthetic */ dlzu a;
    final /* synthetic */ long b;
    final /* synthetic */ long c;

    public dlzz(dlzu dlzuVar, long j, long j2) {
        this.a = dlzuVar;
        this.b = j;
        this.c = j2;
    }

    @Override // defpackage.ffji
    public final /* synthetic */ Object invoke(Object obj) {
        return new ibw(((Number) obj).floatValue() <= this.a.a ? this.b : this.c);
    }
}
