package defpackage;

import android.text.SpannableStringBuilder;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acae extends acag {
    public final SpannableStringBuilder a;
    public final abwy b;

    public acae(SpannableStringBuilder spannableStringBuilder, abwy abwyVar) {
        this.a = spannableStringBuilder;
        this.b = abwyVar;
    }

    @Override // defpackage.acag
    public final SpannableStringBuilder a() {
        return this.a;
    }

    @Override // defpackage.acag
    public final abwy b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof acag) {
            acag acagVar = (acag) obj;
            if (this.a.equals(acagVar.a()) && this.b.equals(acagVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        abwy abwyVar = this.b;
        return "RedactedEditResult{editedText=" + this.a.toString() + ", editDistance=" + abwyVar.toString() + "}";
    }
}
