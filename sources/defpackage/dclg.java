package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dclg extends dclf {
    private final eptv c;

    public dclg(eptv eptvVar) {
        if (eptvVar == null) {
            throw new NullPointerException("Null screen");
        }
        this.c = eptvVar;
    }

    @Override // defpackage.dclf
    public final eptv c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dclf) {
            return this.c.equals(((dclf) obj).c());
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "AttachmentScreenOrigin{screen=" + this.c.toString() + "}";
    }
}
