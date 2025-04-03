package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fanh extends fanj {
    private final String a;

    public fanh(String str) {
        this.a = str;
    }

    @Override // defpackage.fanj
    protected final int a() {
        return c((byte) 96);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        int length;
        int length2;
        fanj fanjVar = (fanj) obj;
        if (a() != fanjVar.a()) {
            length2 = a();
            length = fanjVar.a();
        } else {
            String str = this.a;
            String str2 = ((fanh) fanjVar).a;
            if (str.length() == str2.length()) {
                return str.compareTo(str2);
            }
            length = str2.length();
            length2 = str.length();
        }
        return length2 - length;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.a.equals(((fanh) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(a()), this.a});
    }

    public final String toString() {
        return "\"" + this.a + "\"";
    }
}
