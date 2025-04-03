package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ahn {
    public ahm a = null;
    final /* synthetic */ ahu b;

    public ahn(ahu ahuVar) {
        this.b = ahuVar;
    }

    public final void a() {
        ahm ahmVar = this.a;
        if (ahmVar != null) {
            ahmVar.b.set(true);
            ahmVar.a.cancel(true);
        }
        this.a = null;
    }

    public final boolean b() {
        ahm ahmVar = this.a;
        return (ahmVar == null || ahmVar.b.get()) ? false : true;
    }
}
