package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmae {
    public final List a;
    public final dlzu b;

    public dmae(List list, dlzu dlzuVar) {
        list.getClass();
        this.a = list;
        this.b = dlzuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmae)) {
            return false;
        }
        dmae dmaeVar = (dmae) obj;
        return ffkj.e(this.a, dmaeVar.a) && ffkj.e(this.b, dmaeVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        dlzu dlzuVar = this.b;
        return hashCode + (dlzuVar == null ? 0 : dlzuVar.hashCode());
    }

    public final String toString() {
        return "WaveformUiData(amplitudeList=" + this.a + ", playbackUiData=" + this.b + ")";
    }
}
