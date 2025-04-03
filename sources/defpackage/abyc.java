package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abyc extends abzo {
    private final abzx a;
    private final int b;
    private final int c;

    public abyc(abzx abzxVar, int i, int i2) {
        if (abzxVar == null) {
            throw new NullPointerException("Null messageList");
        }
        this.a = abzxVar;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.abzo
    public final int a() {
        return this.c;
    }

    @Override // defpackage.abzo
    public final int b() {
        return this.b;
    }

    @Override // defpackage.abzo
    public final abzx c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof abzo) {
            abzo abzoVar = (abzo) obj;
            if (this.a.equals(abzoVar.c()) && this.b == abzoVar.b() && this.c == abzoVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c;
    }

    public final String toString() {
        return "EditTextEvent{messageList=" + this.a.toString() + ", messageListIndex=" + this.b + ", messageIndex=" + this.c + "}";
    }
}
