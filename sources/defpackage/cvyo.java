package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvyo {
    public final ffix a;

    public cvyo(ffix ffixVar) {
        this.a = ffixVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cvyo) && ffkj.e(this.a, ((cvyo) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DuplicateGroupNoticeUiData(onDuplicateGroupLinkClick=" + this.a + ")";
    }

    public cvyo() {
        this(new ffix() { // from class: cvyn
            @Override // defpackage.ffix
            public final Object invoke() {
                return ffcu.a;
            }
        });
    }
}
