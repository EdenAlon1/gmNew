package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtil {
    public final fgdj a;
    public final List b;
    public final boolean c;
    public final fgdj d;

    public dtil() {
        this(null, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dtil)) {
            return false;
        }
        dtil dtilVar = (dtil) obj;
        return ffkj.e(this.a, dtilVar.a) && ffkj.e(this.b, dtilVar.b) && this.c == dtilVar.c && ffkj.e(this.d, dtilVar.d);
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + (true != this.c ? 1237 : 1231)) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "VoiceMoodConfiguration(enabled=" + this.a + ", voiceMoods=" + this.b + ", animateVoiceMoodOptions=" + this.c + ", isAnimationsSettingEnabled=" + this.d + ")";
    }

    public dtil(fgdj fgdjVar, List list, boolean z, fgdj fgdjVar2) {
        fgdjVar.getClass();
        list.getClass();
        this.a = fgdjVar;
        this.b = list;
        this.c = z;
        this.d = fgdjVar2;
    }

    public /* synthetic */ dtil(List list, int i) {
        this((i & 1) != 0 ? fgdm.a(false) : null, (i & 2) != 0 ? ffel.a : list, false, fgdm.a(true));
    }
}
