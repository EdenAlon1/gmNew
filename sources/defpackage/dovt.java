package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dovt {
    public final String a;
    public final ffix b;
    private final boolean c = false;
    private final boolean d = true;

    public dovt(String str, ffix ffixVar) {
        this.a = str;
        this.b = ffixVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dovt)) {
            return false;
        }
        dovt dovtVar = (dovt) obj;
        boolean z = dovtVar.c;
        if (!ffkj.e(this.a, dovtVar.a)) {
            return false;
        }
        boolean z2 = dovtVar.d;
        return ffkj.e(this.b, dovtVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = str == null ? 0 : str.hashCode();
        int a = dovs.a(false);
        ffix ffixVar = this.b;
        return (((((a * 31) + hashCode) * 31) + dovs.a(true)) * 31) + (ffixVar != null ? ffixVar.hashCode() : 0);
    }

    public final String toString() {
        return "VideoControlsUiData(isPlaying=false, formattedTimeString=" + this.a + ", showPlayPauseButton=true, onPlayButtonClick=" + this.b + ")";
    }
}
