package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxnp extends cxmb {
    private final engw a;

    public cxnp(engw engwVar) {
        if (engwVar == null) {
            throw new NullPointerException("Null urisOfAttachmentToDelete");
        }
        this.a = engwVar;
    }

    @Override // defpackage.cxmb
    public final engw a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cxmb) {
            return enkr.h(this.a, ((cxmb) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "AttachmentPreviewCloseButtonEvent{urisOfAttachmentToDelete=" + this.a.toString() + "}";
    }
}
