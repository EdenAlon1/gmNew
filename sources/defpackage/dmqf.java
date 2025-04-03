package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmqf {
    private final boolean a;

    public dmqf() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmqf)) {
            return false;
        }
        boolean z = ((dmqf) obj).a;
        return true;
    }

    public final int hashCode() {
        return 1231;
    }

    public final String toString() {
        return "EmotiveInputUiData(isEnabled=true)";
    }

    public /* synthetic */ dmqf(byte[] bArr) {
        this.a = true;
    }
}
