package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eoew extends eoez {
    final /* synthetic */ eoez a;

    public eoew(eoez eoezVar) {
        this.a = eoezVar;
    }

    @Override // defpackage.eoez
    public final eoey a(String str) {
        eoey a = this.a.a(str);
        if (a == null) {
            return null;
        }
        int length = a.a.length() - a.c;
        String str2 = a.a;
        int length2 = str2.length() - length;
        return new eoey(str2, length2, length, Math.max(1, length) + length2);
    }

    public final String toString() {
        return "after(" + this.a.toString() + ")";
    }
}
