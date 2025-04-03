package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffhq implements ffgu {
    public static final ffhq a = new ffhq();

    private ffhq() {
    }

    public final String toString() {
        return "This continuation is already complete";
    }

    @Override // defpackage.ffgu
    public final ffhd u() {
        throw new IllegalStateException("This continuation is already complete");
    }

    @Override // defpackage.ffgu
    public final void w(Object obj) {
        throw new IllegalStateException("This continuation is already complete");
    }
}
