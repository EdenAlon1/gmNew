package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmrd {
    private final boolean a;

    public dmrd() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmrd)) {
            return false;
        }
        boolean z = ((dmrd) obj).a;
        return true;
    }

    public final int hashCode() {
        return 1231;
    }

    public final String toString() {
        return "ShortcutsInputUiData(isEnabled=true)";
    }

    public /* synthetic */ dmrd(byte[] bArr) {
        this.a = true;
    }
}
