package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wni extends ffkk implements ffix {
    final /* synthetic */ hho a;
    final /* synthetic */ kgj b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wni(hho hhoVar, kgj kgjVar) {
        super(0);
        this.a = hhoVar;
        this.b = kgjVar;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        this.a.b(Boolean.valueOf(!((Boolean) this.a.a()).booleanValue()));
        this.b.a();
        return ffcu.a;
    }
}
