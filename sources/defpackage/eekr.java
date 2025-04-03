package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eekr extends eeku {
    protected Integer a;

    public eekr() {
        super("Expires");
    }

    @Override // defpackage.eeku
    public final String a() {
        return this.a.toString();
    }

    public final int b() {
        return this.a.intValue();
    }

    @Override // defpackage.eeku
    public final eejd d() {
        return null;
    }

    public final void e(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(a.h(i, "bad argument "));
        }
        this.a = Integer.valueOf(i);
    }
}
