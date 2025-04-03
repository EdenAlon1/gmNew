package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rkq extends rkr {
    public volatile boolean a;

    @Override // defpackage.rkr
    public final void a() {
        if (this.a) {
            throw new IllegalStateException("Already released");
        }
    }
}
