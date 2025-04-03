package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajtp {
    public static final ajsj a(String str, Uri uri) {
        if (uri != null) {
            ajsi ajsiVar = (ajsi) ajsj.a.createBuilder();
            ajsiVar.getClass();
            ajry ajryVar = (ajry) ajrz.a.createBuilder();
            ajryVar.getClass();
            ajryVar.copyOnWrite();
            ((ajrz) ajryVar.instance).d = str;
            ajsa.b(uri.toString(), ajryVar);
            ajsk.b(ajsa.a(ajryVar), ajsiVar);
            return ajsk.a(ajsiVar);
        }
        ajsi ajsiVar2 = (ajsi) ajsj.a.createBuilder();
        ajsiVar2.getClass();
        ajsf ajsfVar = (ajsf) ajsg.a.createBuilder();
        ajsfVar.getClass();
        ajsh.b(4, ajsfVar);
        ajsd ajsdVar = (ajsd) ajse.a.createBuilder();
        ajsdVar.getClass();
        ajsdVar.copyOnWrite();
        ((ajse) ajsdVar.instance).b = str;
        eyfy build = ajsdVar.build();
        build.getClass();
        ajsfVar.copyOnWrite();
        ajsg ajsgVar = (ajsg) ajsfVar.instance;
        ajsgVar.c = (ajse) build;
        ajsgVar.b = 11;
        ajsk.c(ajsh.a(ajsfVar), ajsiVar2);
        return ajsk.a(ajsiVar2);
    }
}
