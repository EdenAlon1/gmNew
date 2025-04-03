package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apop implements apos {
    public final int a;
    private final apor b;

    public apop(apor aporVar, int i) {
        this.b = aporVar;
        this.a = i;
    }

    @Override // defpackage.apos
    public final apor a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof apop)) {
            return false;
        }
        apop apopVar = (apop) obj;
        return ffkj.e(this.b, apopVar.b) && this.a == apopVar.a;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BugleVerticalRichCardAttachment(cardAttachmentContent=");
        sb.append(this.b);
        sb.append(", size=");
        int i = this.a;
        sb.append((Object) (i != 1 ? i != 2 ? "TALL" : "MEDIUM" : "SHORT"));
        sb.append(")");
        return sb.toString();
    }
}
