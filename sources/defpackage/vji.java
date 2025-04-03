package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vji {
    public final vjg a;

    public vji(vjg vjgVar) {
        this.a = vjgVar;
    }

    public static vji a(String str, Uri uri, cmrl cmrlVar, boolean z) {
        vjf createBuilder = vjg.a.createBuilder();
        createBuilder.copyOnWrite();
        vjg vjgVar = (vjg) createBuilder.instance;
        str.getClass();
        vjgVar.c = str;
        String uri2 = uri.toString();
        createBuilder.copyOnWrite();
        vjg vjgVar2 = (vjg) createBuilder.instance;
        uri2.getClass();
        vjgVar2.d = uri2;
        createBuilder.copyOnWrite();
        vjg vjgVar3 = (vjg) createBuilder.instance;
        cmrlVar.getClass();
        vjgVar3.e = cmrlVar;
        vjgVar3.b |= 1;
        createBuilder.copyOnWrite();
        ((vjg) createBuilder.instance).f = z;
        return new vji(createBuilder.build());
    }
}
