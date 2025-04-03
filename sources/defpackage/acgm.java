package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acgm extends acgs {
    public final acew a;
    public final String b;
    public final int c;

    public acgm(int i, acew acewVar, String str) {
        this.c = i;
        this.a = acewVar;
        if (str == null) {
            throw new NullPointerException("Null comment");
        }
        this.b = str;
    }

    @Override // defpackage.acgs
    public final acew a() {
        return this.a;
    }

    @Override // defpackage.acgs
    public final String b() {
        return this.b;
    }

    @Override // defpackage.acgs
    public final int c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        acew acewVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof acgs) {
            acgs acgsVar = (acgs) obj;
            if (this.c == acgsVar.c() && ((acewVar = this.a) != null ? acewVar.equals(acgsVar.a()) : acgsVar.a() == null) && this.b.equals(acgsVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        acew acewVar = this.a;
        return (((acewVar == null ? 0 : acewVar.hashCode()) ^ ((this.c ^ 1000003) * 1000003)) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String str = this.c != 1 ? "ON_CANCEL_BUTTON_CLICKED" : "ON_REPORT_BUTTON_CLICKED";
        acew acewVar = this.a;
        String str2 = this.b;
        return "TakeBugReportRequestData{dialogUserInputType=" + str + ", category=" + String.valueOf(acewVar) + ", comment=" + str2 + "}";
    }
}
