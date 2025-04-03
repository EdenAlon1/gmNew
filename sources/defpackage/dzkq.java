package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzkq extends dzkr {
    public final dzot a;

    public dzkq(dzot dzotVar) {
        this.a = dzotVar;
    }

    @Override // defpackage.dzkr, defpackage.dzqu
    public final dzot a() {
        return this.a;
    }

    @Override // defpackage.dzqu
    public final dzqt b() {
        return dzqt.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dzqu) {
            dzqu dzquVar = (dzqu) obj;
            if (dzqt.a == dzquVar.b() && this.a.equals(dzquVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MessageDecorationContent{buttonPrompt=" + this.a.toString() + "}";
    }
}
