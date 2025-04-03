package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dulp extends eyct {
    public final Uri a(int i, Uri uri) {
        boolean z;
        dulo duloVar = new dulo();
        duloVar.a.d(eycx.SIZE, Integer.valueOf(i));
        duloVar.a.c(eycx.SIZE);
        try {
            dulm dulmVar = new dulm(uri);
            emxf.b(true, "options is null");
            emxf.b(true, "url is null");
            List j = eyct.j(dulmVar);
            if (!eyct.i(j)) {
                if (!eyct.h(j)) {
                    throw new eycr(dulmVar.toString());
                }
                emxf.b(true, "options is null");
                emxf.b(true, "url is null");
                emxf.b(dulmVar.a() != null, "url path is null");
                ArrayList a = enkr.a(eyct.a.g(dulmVar.a()));
                String c = eyct.c(eyct.e(dulmVar), duloVar.a(), true);
                String str = (String) a.get(0);
                if (!c.isEmpty()) {
                    str = eyct.c.g(str, c, new Object[0]);
                }
                return dulmVar.b(str).a;
            }
            emxf.b(true, "options is null");
            emxf.b(true, "url is null");
            emxf.b(dulmVar.a() != null, "url path is null");
            List g = eyct.g(dulmVar);
            if (g.isEmpty() || !((String) g.get(0)).equals("image")) {
                z = false;
            } else {
                g.remove(0);
                z = true;
            }
            String c2 = eyct.c(eyct.f(g), duloVar.a(), true);
            g.set(4, c2);
            if (c2.isEmpty() && g.size() > 5) {
                g.remove(4);
            }
            if (z) {
                g.add(0, "image");
            }
            return dulmVar.b("/".concat(eyct.b.b(g))).a;
        } catch (eycr e) {
            throw new duln(e);
        }
    }

    public final boolean b(Uri uri) {
        dulm dulmVar = new dulm(uri);
        emxf.a(true);
        String dulmVar2 = dulmVar.toString();
        Pattern pattern = eydg.a;
        if (dulmVar2 != null) {
            return eydg.a.matcher(dulmVar2).find();
        }
        throw new IllegalArgumentException();
    }
}
