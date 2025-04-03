package defpackage;

import android.content.Context;
import android.content.res.Resources;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cndj {
    private final Context a;
    private final Resources b;

    public cndj(Context context) {
        this.a = context;
        this.b = context.getResources();
    }

    public final String a(cmrm cmrmVar, cmrl cmrlVar, cmtb cmtbVar) {
        int ordinal = cmrmVar.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                return String.format(ctid.c(this.a), "\u200a%s\u200a", cmtbVar.b(this.b, cmrlVar));
            }
            if (ordinal != 3) {
                throw new IllegalArgumentException("Can't build reaction fallback text for action=" + cmrmVar.a());
            }
        }
        return String.format(ctid.c(this.a), "\u200a%s\u200a", cmtbVar.a(this.b, cmrlVar));
    }
}
