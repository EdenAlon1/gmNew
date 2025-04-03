package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afcm extends dtrs {
    private final Runnable a;

    public afcm(Runnable runnable) {
        this.a = runnable;
    }

    @Override // defpackage.dtrs
    public final /* bridge */ /* synthetic */ void gb(dtyq dtyqVar) {
        if (aewg.h()) {
            this.a.run();
        }
    }
}
