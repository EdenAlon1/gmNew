package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlzu {
    public final float a;
    public final ffji b;
    public final ffix c;

    public dlzu() {
        this(0.0f, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlzu)) {
            return false;
        }
        dlzu dlzuVar = (dlzu) obj;
        return Float.compare(this.a, dlzuVar.a) == 0 && ffkj.e(this.b, dlzuVar.b) && ffkj.e(this.c, dlzuVar.c);
    }

    public final int hashCode() {
        return (((Float.floatToIntBits(this.a) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "PlaybackUiData(progress=" + this.a + ", onSeek=" + this.b + ", onSeekFinished=" + this.c + ")";
    }

    public dlzu(float f, ffji ffjiVar, ffix ffixVar) {
        ffjiVar.getClass();
        ffixVar.getClass();
        this.a = f;
        this.b = ffjiVar;
        this.c = ffixVar;
    }

    public /* synthetic */ dlzu(float f, int i) {
        this(1 == (i & 1) ? 0.0f : f, new ffji() { // from class: dlzs
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                ((Float) obj).floatValue();
                return ffcu.a;
            }
        }, new ffix() { // from class: dlzt
            @Override // defpackage.ffix
            public final Object invoke() {
                return ffcu.a;
            }
        });
    }
}
