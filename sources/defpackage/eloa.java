package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eloa extends eloc {
    public Object a;
    public byte b;

    @Override // defpackage.eloc
    public final elod a() {
        if (this.b == 1) {
            return new elob(this.a);
        }
        throw new IllegalStateException("Missing required properties: startDictation");
    }
}
