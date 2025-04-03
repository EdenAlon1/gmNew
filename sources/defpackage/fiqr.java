package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fiqr {
    public final CharSequence a;
    public final fiqf b;

    public fiqr(CharSequence charSequence, fiqf fiqfVar) {
        if (charSequence == null) {
            throw new NullPointerException("content must not be null");
        }
        this.a = charSequence;
        this.b = null;
    }

    public final fiqr a(int i, int i2) {
        return new fiqr(this.a.subSequence(i, i2), null);
    }
}
