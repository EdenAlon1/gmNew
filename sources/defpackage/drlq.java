package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drlq implements drlw {
    private final String a;

    public drlq(String str) {
        str.getClass();
        this.a = str;
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isLowerCase(str.charAt(i))) {
                throw new IllegalArgumentException("'" + this.a + "' can only contain lowercase characters");
            }
        }
        if (ffpc.J(this.a)) {
            throw new IllegalArgumentException("Media Type cannot be empty");
        }
    }

    @Override // defpackage.drlw
    public final int a() {
        return R.string.arbitrary_format_type;
    }

    @Override // defpackage.drlw
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof drlq) && ffkj.e(this.a, ((drlq) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Arbitrary(value=" + this.a + ")";
    }
}
