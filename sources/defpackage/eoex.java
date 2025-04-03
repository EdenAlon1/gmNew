package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eoex extends eoez {
    final /* synthetic */ char a;

    public eoex(char c) {
        this.a = c;
    }

    @Override // defpackage.eoez
    public final eoey a(String str) {
        int indexOf = str.indexOf(this.a, 0);
        if (indexOf >= 0) {
            return new eoey(str, indexOf, 1, Math.max(1, 1) + indexOf);
        }
        return null;
    }

    public final String toString() {
        return "first('" + this.a + "')";
    }
}
