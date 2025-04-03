package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class csm extends ffkk implements ffji {
    final /* synthetic */ hkx a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public csm(hkx hkxVar) {
        super(1);
        this.a = hkxVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ((idd) obj).a(((Number) this.a.a()).floatValue());
        return ffcu.a;
    }
}
