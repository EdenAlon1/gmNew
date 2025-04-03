package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eekt extends eekd {
    static {
        new eekt();
    }

    public eekt() {
        super("From");
    }

    public final void e(String str) {
        super.k("tag", str);
    }

    @Override // defpackage.eekd, defpackage.eekz, defpackage.eeku
    public final boolean equals(Object obj) {
        if (obj == null || this.a == null) {
            return false;
        }
        if (obj.getClass().equals(getClass())) {
            return super.equals(obj);
        }
        return false;
    }

    @Override // defpackage.eekd, defpackage.eekz, defpackage.eeku
    public final int hashCode() {
        return 5678;
    }
}
