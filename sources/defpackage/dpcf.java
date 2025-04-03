package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpcf {
    public final boolean a;

    public dpcf() {
        this((byte[]) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dpcf) && this.a == ((dpcf) obj).a;
    }

    public final int hashCode() {
        return this.a ? 1231 : 1237;
    }

    public final String toString() {
        return "AudioFlags(ignoreEmptyAudioOutputAfterRecording=" + this.a + ")";
    }

    public dpcf(boolean z) {
        this.a = z;
    }

    public /* synthetic */ dpcf(byte[] bArr) {
        this(false);
    }
}
