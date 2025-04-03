package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejvu {
    public static final ejvu a = new ejvu(ejvs.LOCAL_STATE_CHANGE);
    public static final ejvu b = new ejvu(ejvs.REMOTE_STATE_CHANGE);
    public final ejvs c;

    private ejvu(ejvs ejvsVar) {
        this.c = ejvsVar;
    }

    public final String toString() {
        return "ResultPropagator.Update for CallReason ".concat(String.valueOf(String.valueOf(this.c)));
    }
}
