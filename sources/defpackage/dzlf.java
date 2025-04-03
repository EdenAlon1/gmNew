package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzlf extends dzlh {
    private final int a;

    public dzlf(int i) {
        this.a = i;
    }

    @Override // defpackage.dzrm
    public final dzro a() {
        return dzro.INDENTATION;
    }

    @Override // defpackage.dzlh, defpackage.dzrm
    public final int b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dzrm) {
            dzrm dzrmVar = (dzrm) obj;
            if (dzro.INDENTATION == dzrmVar.a() && this.a == dzrmVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "LineStyle{indentation=" + this.a + "}";
    }
}
