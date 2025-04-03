package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aegj implements coxh {
    public final ffbr a;
    public final ejvb b;
    private final ejvp c;

    public aegj(ffbr ffbrVar, ejvb ejvbVar, ejvp ejvpVar) {
        this.a = ffbrVar;
        this.b = ejvbVar;
        this.c = ejvpVar;
    }

    @Override // defpackage.coxh
    public final void b(boolean z) {
        if (z) {
            this.c.a(erqt.i(null), "IS_FULL_SYNC_IN_PROGRESS");
        }
    }

    @Override // defpackage.coxh
    public final void fE(boolean z) {
        if (z) {
            this.c.a(erqt.i(null), "IS_FULL_SYNC_IN_PROGRESS");
        }
    }
}
