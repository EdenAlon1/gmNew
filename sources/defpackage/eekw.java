package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eekw extends eeku {
    protected int a;

    public eekw() {
        super("Max-Forwards");
    }

    @Override // defpackage.eeku
    public final String a() {
        int i = this.a;
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        return sb.toString();
    }

    public final void b(int i) {
        if (i < 0 || i > 255) {
            throw new IllegalArgumentException(a.h(i, "bad max forwards value "));
        }
        this.a = i;
    }

    @Override // defpackage.eeku
    public final eejd d() {
        return null;
    }
}
