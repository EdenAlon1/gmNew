package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jku<T> {
    public final String a;
    public final ffjm b;
    public boolean c;

    public jku(String str, ffjm ffjmVar) {
        this.a = str;
        this.b = ffjmVar;
    }

    public final void a(jkv jkvVar, Object obj) {
        jkvVar.e(this, obj);
    }

    public final String toString() {
        return "AccessibilityKey: ".concat(this.a);
    }

    public /* synthetic */ jku(String str) {
        this(str, jkt.a);
    }

    public jku(String str, byte[] bArr) {
        this(str);
        this.c = true;
    }

    public jku(String str, boolean z, ffjm ffjmVar) {
        this(str, ffjmVar);
        this.c = z;
    }
}
