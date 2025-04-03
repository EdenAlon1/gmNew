package defpackage;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewyf {
    public static final ewyf a = new ewyf(new efdo(), new efdu());
    public final efbi b;
    private final efbi c;

    public ewyf(efbi efbiVar, efbi efbiVar2) {
        this.c = efbiVar;
        this.b = efbiVar2;
    }

    public final ewwg a(String str, dwns dwnsVar, efbm efbmVar) {
        dwno dwnoVar = null;
        for (dwno dwnoVar2 : dwnsVar.h) {
            if (true == dwnoVar2.c.equals(str)) {
                dwnoVar = dwnoVar2;
            }
        }
        if (dwnoVar != null) {
            return ewwg.a((AssetFileDescriptor) efbmVar.c(Uri.parse(dwnoVar.d), this.c));
        }
        throw new ewyg(a.a(str, "Could not find ", " in MDD file group."));
    }
}
