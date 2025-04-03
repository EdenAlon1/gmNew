package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cura implements ffji {
    final /* synthetic */ boolean a;

    public cura(boolean z) {
        this.a = z;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        curc curcVar = (curc) ((curd) obj).toBuilder();
        curcVar.copyOnWrite();
        ((curd) curcVar.instance).b = this.a;
        return (curd) curcVar.build();
    }
}
