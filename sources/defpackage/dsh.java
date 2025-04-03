package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dsh extends ffkk implements ffji {
    final /* synthetic */ hkx a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsh(hkx hkxVar) {
        super(1);
        this.a = hkxVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return (Float) ((ffji) this.a.a()).invoke(Float.valueOf(((Number) obj).floatValue()));
    }
}
