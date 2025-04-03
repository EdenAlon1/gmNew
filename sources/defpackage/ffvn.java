package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffvn extends ffsd {
    public static final ffvn a = new ffvn();

    private ffvn() {
    }

    @Override // defpackage.ffsd
    public final void a(ffhd ffhdVar, Runnable runnable) {
        ffvs ffvsVar = (ffvs) ffhdVar.get(ffvs.a);
        if (ffvsVar == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        ffvsVar.b = true;
    }

    @Override // defpackage.ffsd
    public final boolean ex(ffhd ffhdVar) {
        return false;
    }

    @Override // defpackage.ffsd
    public final ffsd i(int i) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    @Override // defpackage.ffsd
    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}
