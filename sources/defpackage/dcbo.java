package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dcbo extends dcbx {
    public final String a;

    public dcbo(String str) {
        if (str == null) {
            throw new NullPointerException("Null text");
        }
        this.a = str;
    }

    @Override // defpackage.dcbx, defpackage.dcas
    public final /* synthetic */ CharSequence a() {
        return this.a;
    }

    @Override // defpackage.dcbx
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dcbx) {
            return this.a.equals(((dcbx) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "EmojiContentItem{text=" + this.a + "}";
    }
}
