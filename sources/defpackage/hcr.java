package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hcr extends ffkk implements ffix {
    final /* synthetic */ hkx a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hcr(hkx hkxVar) {
        super(0);
        this.a = hkxVar;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        return Boolean.valueOf(((Number) this.a.a()).floatValue() > 0.0f);
    }
}
