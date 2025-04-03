package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class durc extends dury {
    private final int a;
    private final int b;
    private final boolean c;
    private final CharSequence d;

    public durc(int i, int i2, boolean z, CharSequence charSequence) {
        this.a = i;
        this.b = i2;
        this.c = z;
        this.d = charSequence;
    }

    @Override // defpackage.dury
    public final int a() {
        return this.b;
    }

    @Override // defpackage.dury
    public final int b() {
        return this.a;
    }

    @Override // defpackage.dury
    public final CharSequence c() {
        return this.d;
    }

    @Override // defpackage.dury
    public final boolean d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dury) {
            dury duryVar = (dury) obj;
            if (this.a == duryVar.b() && this.b == duryVar.a()) {
                duryVar.e();
                duryVar.f();
                duryVar.g();
                if (this.c == duryVar.d()) {
                    duryVar.h();
                    CharSequence charSequence = this.d;
                    if (charSequence != null ? charSequence.equals(duryVar.c()) : duryVar.c() == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        CharSequence charSequence = this.d;
        int hashCode = charSequence == null ? 0 : charSequence.hashCode();
        int i = this.a;
        return hashCode ^ ((((((i ^ 1000003) * 1000003) ^ this.b) * 1525764945) ^ (true != this.c ? 1237 : 1231)) * (-721379959));
    }

    public final String toString() {
        return "EmojiListOptions{rowHeight=" + this.a + ", columns=" + this.b + ", emojiIconBackground=0, emojiPlaceHolderDrawable=0, popupViewController=null, popupWindowFocusable=" + this.c + ", popupWindowBackgroundDrawable=null, selectedEmoji=" + String.valueOf(this.d) + "}";
    }

    @Override // defpackage.dury
    public final void e() {
    }

    @Override // defpackage.dury
    public final void f() {
    }

    @Override // defpackage.dury
    public final void g() {
    }

    @Override // defpackage.dury
    public final void h() {
    }
}
