package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqxz extends dqwo {
    final /* synthetic */ dqya e;
    final /* synthetic */ ffjm f;
    final /* synthetic */ ffji g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqxz(dqya dqyaVar, ffjm ffjmVar, ffji ffjiVar) {
        super(dqyaVar);
        this.e = dqyaVar;
        this.f = ffjmVar;
        this.g = ffjiVar;
    }

    @Override // defpackage.vk
    public final int a() {
        dqqj b = this.e.b();
        if (b != null) {
            return ((Number) this.g.invoke(b)).intValue();
        }
        return 0;
    }

    @Override // defpackage.dqwo
    public final dqof m(int i) {
        dqqj b = this.e.b();
        if (b != null) {
            return (dqof) this.f.a(Integer.valueOf(i), b);
        }
        throw new IllegalStateException("emojiSet is null. Cannot retrieve emoji");
    }
}
