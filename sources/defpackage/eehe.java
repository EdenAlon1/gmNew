package defpackage;

import android.text.TextUtils;
import com.android.vcard.VCardBuilder;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class eehe extends eeha {
    private final String a;

    protected eehe(String str) {
        this.a = str;
    }

    protected final void a(StringBuilder sb) {
        sb.append(this.a);
        sb.append(VCardBuilder.VCARD_END_OF_LINE);
    }

    public final boolean equals(Object obj) {
        return obj != null && (obj instanceof eehe) && TextUtils.equals(this.a, ((eehe) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
