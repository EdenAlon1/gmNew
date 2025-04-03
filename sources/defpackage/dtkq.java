package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtkq {
    private final boolean a = true;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dtkq)) {
            return false;
        }
        boolean z = ((dtkq) obj).a;
        return true;
    }

    public final int hashCode() {
        return 1231;
    }

    public final String toString() {
        return "VoiceScreenFlags(keepScreenOnDuringVoiceRecording=true)";
    }
}
