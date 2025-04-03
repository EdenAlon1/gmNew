package defpackage;

import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fiol implements fior {
    private static final Pattern a = Pattern.compile("^[a-zA-Z][a-zA-Z0-9.+-]{1,31}:[^<>\u0000- ]*$");
    private static final Pattern b = Pattern.compile("^([a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*)$");

    @Override // defpackage.fior
    public final fiot a(fios fiosVar) {
        fiow fiowVar = ((finy) fiosVar).a;
        fiowVar.h();
        fiov e = fiowVar.e();
        if (fiowVar.b('>') > 0) {
            fiqs g = fiowVar.g(e, fiowVar.e());
            String a2 = g.a();
            fiowVar.h();
            String concat = a.matcher(a2).matches() ? a2 : b.matcher(a2).matches() ? "mailto:".concat(a2) : null;
            if (concat != null) {
                fipu fipuVar = new fipu(concat, null);
                fiqi fiqiVar = new fiqi(a2);
                fiqiVar.i(g.b());
                fipuVar.g(fiqiVar);
                return new fiou(fipuVar, fiowVar.e());
            }
        }
        return null;
    }
}
