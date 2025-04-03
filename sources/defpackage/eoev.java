package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eoev extends eoez {
    final /* synthetic */ eoez a;

    public eoev(eoez eoezVar) {
        this.a = eoezVar;
    }

    @Override // defpackage.eoez
    public final eoey a(String str) {
        eoey a = this.a.a(str);
        if (a == null) {
            return null;
        }
        return new eoey(str, 0, a.b, a.d);
    }

    public final String toString() {
        return "before(" + this.a.toString() + ")";
    }
}
