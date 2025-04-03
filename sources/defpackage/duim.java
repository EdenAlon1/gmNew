package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class duim extends ernr {
    Object a;

    public duim(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.ernr
    public final String gP() {
        Object obj = this.a;
        return obj == null ? "" : obj.toString();
    }

    @Override // defpackage.ernr
    protected final void gQ() {
        this.a = null;
    }
}
