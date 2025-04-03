package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzoa extends dzrx {
    public dzrw a;

    @Override // defpackage.dzrx
    public final dzry a() {
        dzrw dzrwVar = this.a;
        if (dzrwVar != null) {
            return new dzob(dzrwVar);
        }
        throw new IllegalStateException("Missing required properties: content");
    }
}
