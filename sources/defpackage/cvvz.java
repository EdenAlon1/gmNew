package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvvz {
    public final boolean a;
    public final ffix b;

    public cvvz() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cvvz)) {
            return false;
        }
        cvvz cvvzVar = (cvvz) obj;
        return this.a == cvvzVar.a && ffkj.e(this.b, cvvzVar.b);
    }

    public final int hashCode() {
        return ((true != this.a ? 1237 : 1231) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "ChatbotDirectoryUiData(shouldDisplay=" + this.a + ", onMessageToBusinessButtonClicked=" + this.b + ")";
    }

    public cvvz(boolean z, ffix ffixVar) {
        this.a = z;
        this.b = ffixVar;
    }

    public /* synthetic */ cvvz(byte[] bArr) {
        this(false, new ffix() { // from class: cvvy
            @Override // defpackage.ffix
            public final Object invoke() {
                return ffcu.a;
            }
        });
    }
}
