package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class azar extends azat {
    private enhk a;

    @Override // defpackage.azat
    public final azau a() {
        enhk enhkVar = this.a;
        if (enhkVar != null) {
            return new azas(enhkVar);
        }
        throw new IllegalStateException("Missing required properties: capabilities");
    }

    @Override // defpackage.azat
    public final void b(enhk enhkVar) {
        this.a = enhkVar;
    }
}
