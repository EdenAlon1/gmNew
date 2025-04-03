package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnuu implements dnux {
    public final ffix a;

    public dnuu(ffix ffixVar) {
        this.a = ffixVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dnuu) && ffkj.e(this.a, ((dnuu) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "NoConnection(onCancelButtonClicked=" + this.a + ")";
    }

    public dnuu() {
        this(new ffix() { // from class: dnut
            @Override // defpackage.ffix
            public final Object invoke() {
                return ffcu.a;
            }
        });
    }
}
