package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class coix extends coiy {
    private final cnvv a;

    public coix(cnvv cnvvVar) {
        if (cnvvVar == null) {
            throw new NullPointerException("Null bindData");
        }
        this.a = cnvvVar;
    }

    @Override // defpackage.coiy
    public final cnvv a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof coiy) {
            return this.a.equals(((coiy) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ScheduledMessageData{bindData=" + this.a.toString() + "}";
    }
}
