package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dpi extends ffkk implements ffji {
    final /* synthetic */ hkx a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpi(hkx hkxVar) {
        super(1);
        this.a = hkxVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ((ffji) this.a.a()).invoke(Float.valueOf(((Number) obj).floatValue()));
        return ffcu.a;
    }
}
