package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpff {
    public final Uri a;
    public final eepm b;

    public dpff(Uri uri, eepm eepmVar) {
        uri.getClass();
        eepmVar.getClass();
        this.a = uri;
        this.b = eepmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dpff)) {
            return false;
        }
        dpff dpffVar = (dpff) obj;
        return ffkj.e(this.a, dpffVar.a) && ffkj.e(this.b, dpffVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "FileAudioSourceConfiguration(audioUri=" + this.a + ", sourcePolicy=" + this.b + ")";
    }
}
