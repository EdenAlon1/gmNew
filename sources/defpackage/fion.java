package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fion implements fior {
    @Override // defpackage.fior
    public final fiot a(fios fiosVar) {
        fiow fiowVar = ((finy) fiosVar).a;
        fiov e = fiowVar.e();
        int c = fiowVar.c('`');
        fiov e2 = fiowVar.e();
        while (fiowVar.b('`') > 0) {
            fiov e3 = fiowVar.e();
            if (fiowVar.c('`') == c) {
                fipi fipiVar = new fipi();
                String replace = fiowVar.g(e2, e3).a().replace('\n', ' ');
                if (replace.length() >= 3 && replace.charAt(0) == ' ' && replace.charAt(replace.length() - 1) == ' ') {
                    int length = replace.length();
                    if (fipd.c(' ', replace, 0, length) != length) {
                        replace = replace.substring(1, replace.length() - 1);
                    }
                }
                fipiVar.a = replace;
                return new fiou(fipiVar, fiowVar.e());
            }
        }
        return new fiou(new fiqi(fiowVar.g(e, e2).a()), e2);
    }
}
