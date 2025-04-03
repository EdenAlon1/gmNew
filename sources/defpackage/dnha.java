package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnha implements dndt {
    private final int a;

    public dnha() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dnha)) {
            return false;
        }
        int i = ((dnha) obj).a;
        return true;
    }

    public final int hashCode() {
        return 1;
    }

    public final String toString() {
        return "ListItemDividerUiData(thickness=1)";
    }

    public /* synthetic */ dnha(byte[] bArr) {
        this.a = 1;
    }
}
