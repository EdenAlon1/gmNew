package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpaw implements Serializable, dpau {
    private static final long serialVersionUID = -8713434243256937394L;
    private final String a;

    public dpaw(String str) {
        this.a = str;
    }

    private static void c(StringBuilder sb, String str, int i) {
        for (int length = i - str.length(); length > 0; length--) {
            sb.append('0');
        }
        sb.append(str);
    }

    @Override // defpackage.dpau
    public final int a() {
        return 1;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return dpau.class;
    }

    @Override // defpackage.dpau
    public final String b() {
        return this.a;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dpau) {
            dpau dpauVar = (dpau) obj;
            if (this.a.equals(dpauVar.b()) && dpauVar.a() == 1) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.a.hashCode() ^ 428460789) + 1704546089;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        StringBuilder sb = new StringBuilder("@com.google.android.libraries.compose.attachments.serialization.annotations.AttachmentDeserializerKey(");
        sb.append("name=\"");
        int i = 0;
        while (true) {
            String str = this.a;
            if (i >= str.length()) {
                sb.append("\", version=1)");
                return sb.toString();
            }
            char charAt = str.charAt(i);
            if (charAt == '\t') {
                sb.append("\\t");
            } else if (charAt == '\n') {
                sb.append("\\n");
            } else if (charAt == '\r') {
                sb.append("\\r");
            } else if (charAt == '\"' || charAt == '\'' || charAt == '\\') {
                sb.append('\\');
                sb.append(charAt);
            } else if (charAt < ' ') {
                sb.append('\\');
                c(sb, Integer.toOctalString(charAt), 3);
            } else if (charAt < 127 || Character.isLetter(charAt)) {
                sb.append(charAt);
            } else {
                sb.append("\\u");
                c(sb, Integer.toHexString(charAt), 4);
            }
            i++;
        }
    }
}
