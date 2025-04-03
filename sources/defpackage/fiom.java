package defpackage;

import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fiom implements fior {
    private static final Pattern a = Pattern.compile("^[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]");

    @Override // defpackage.fior
    public final fiot a(fios fiosVar) {
        fiow fiowVar = ((finy) fiosVar).a;
        fiowVar.h();
        char a2 = fiowVar.a();
        if (a2 == '\n') {
            fiowVar.h();
            return new fiou(new fipo(), fiowVar.e());
        }
        if (!a.matcher(String.valueOf(a2)).matches()) {
            return new fiou(new fiqi("\\"), fiowVar.e());
        }
        fiowVar.h();
        return new fiou(new fiqi(String.valueOf(a2)), fiowVar.e());
    }
}
