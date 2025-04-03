package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlzl {
    public final dlsf a;
    public final ffix b;
    public final ffix c;
    public final boolean d;

    public dlzl(dlsf dlsfVar, ffix ffixVar, ffix ffixVar2, boolean z) {
        ffixVar.getClass();
        ffixVar2.getClass();
        this.a = dlsfVar;
        this.b = ffixVar;
        this.c = ffixVar2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlzl)) {
            return false;
        }
        dlzl dlzlVar = (dlzl) obj;
        return ffkj.e(this.a, dlzlVar.a) && ffkj.e(this.b, dlzlVar.b) && ffkj.e(this.c, dlzlVar.c) && this.d == dlzlVar.d;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + (true != this.d ? 1237 : 1231);
    }

    public final String toString() {
        return "ComposeAttachmentBubbleUiData(onRemoveCallback=" + this.a + ", onClick=" + this.b + ", onMagicEdit=" + this.c + ", useMagicEdit=" + this.d + ")";
    }
}
