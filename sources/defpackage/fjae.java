package defpackage;

import com.android.vcard.VCardConstants;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fjae extends fiyi {
    public final HashMap f;

    public fjae() {
        super("Type", 2);
        f(VCardConstants.PARAM_TYPE);
        this.f = new HashMap();
    }

    @Override // defpackage.fiyi
    public final void a(int i) {
        fjaf.b(i);
    }

    public final void g(int i, String str, fizg fizgVar) {
        super.d(i, str);
        this.f.put(fiyi.b(i), fizgVar);
    }
}
