package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dzs extends ffkk implements ffji {
    final /* synthetic */ hne a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dzs(hne hneVar) {
        super(1);
        this.a = hneVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        hne hneVar = this.a;
        Object[] objArr = hneVar.a;
        int i = hneVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            ((ipo) objArr[i2]).o();
        }
        return ffcu.a;
    }
}
