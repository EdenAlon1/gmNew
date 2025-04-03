package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apnu implements apos {
    private final apor a;

    public apnu(apor aporVar) {
        this.a = aporVar;
    }

    @Override // defpackage.apos
    public final apor a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof apnu) && ffkj.e(this.a, ((apnu) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "BugleHorizontalRichCardAttachment(cardAttachmentContent=" + this.a + ")";
    }
}
