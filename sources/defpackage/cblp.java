package defpackage;

import android.content.Context;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cblp extends cbgg {
    @Override // defpackage.cbgg
    protected final File a(String str, String str2) {
        Context context = getContext();
        if (context == null) {
            return null;
        }
        return cblq.b(context, str, str2);
    }
}
