package defpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ndc {
    private static final Pattern c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int a = -1;
    public int b = -1;

    private final boolean c(String str) {
        Matcher matcher = c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String group = matcher.group(1);
            int i = lvf.a;
            int parseInt = Integer.parseInt(group, 16);
            int parseInt2 = Integer.parseInt(matcher.group(2), 16);
            if (parseInt <= 0 && parseInt2 <= 0) {
                return false;
            }
            this.a = parseInt;
            this.b = parseInt2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public final boolean a() {
        return (this.a == -1 || this.b == -1) ? false : true;
    }

    public final void b(lrb lrbVar) {
        for (int i = 0; i < lrbVar.a(); i++) {
            lra b = lrbVar.b(i);
            if (b instanceof nfy) {
                nfy nfyVar = (nfy) b;
                if ("iTunSMPB".equals(nfyVar.b) && c(nfyVar.c)) {
                    return;
                }
            } else if (b instanceof ngf) {
                ngf ngfVar = (ngf) b;
                if ("com.apple.iTunes".equals(ngfVar.a) && "iTunSMPB".equals(ngfVar.b) && c(ngfVar.c)) {
                    return;
                }
            } else {
                continue;
            }
        }
    }
}
