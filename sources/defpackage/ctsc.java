package defpackage;

import android.text.TextUtils;
import j$.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctsc {
    private static final enru b = enru.c("com/google/android/apps/messaging/shared/util/p2p/reaction/ReactionPattern");
    public final int a;
    private final Pattern c;
    private final int d;
    private final int e;

    private ctsc(emhr emhrVar) {
        int b2 = emhq.b(emhrVar.c);
        emxf.a(b2 == 0 || b2 != 2);
        this.c = Pattern.compile(emhrVar.b, 64);
        int b3 = emhq.b(emhrVar.c);
        int i = 4;
        if (b3 != 0 && b3 == 3) {
            i = 3;
        }
        this.a = i;
        boolean z = emhrVar.d;
        this.d = true != z ? 1 : 2;
        this.e = true == z ? 1 : 2;
    }

    public static Optional b(emhr emhrVar) {
        try {
            ctsc ctscVar = new ctsc(emhrVar);
            if (ctscVar.c.matcher("").groupCount() == 2) {
                return Optional.of(ctscVar);
            }
            ensk i = b.i();
            i.Y(ente.a, "BugleAnnotation");
            ((enrr) ((enrr) i).h("com/google/android/apps/messaging/shared/util/p2p/reaction/ReactionPattern", "parseRegex", 50, "ReactionPattern.java")).q("Incorrect number of capture group in regex.");
            return Optional.empty();
        } catch (PatternSyntaxException e) {
            ensk i2 = b.i();
            i2.Y(ente.a, "BugleAnnotation");
            ((enrr) ((enrr) i2).h("com/google/android/apps/messaging/shared/util/p2p/reaction/ReactionPattern", "parseRegex", 43, "ReactionPattern.java")).t("Pattern %s is not a valid regex.", e.getPattern());
            return Optional.empty();
        } catch (IllegalArgumentException unused) {
            ensk i3 = b.i();
            i3.Y(ente.a, "BugleAnnotation");
            ((enrr) ((enrr) i3).h("com/google/android/apps/messaging/shared/util/p2p/reaction/ReactionPattern", "parseRegex", 46, "ReactionPattern.java")).q("ReactionRegex type is unspecified.");
            return Optional.empty();
        }
    }

    public final Optional a(String str) {
        if (TextUtils.isEmpty(str)) {
            return Optional.empty();
        }
        Matcher matcher = this.c.matcher(str);
        if (!matcher.matches()) {
            return Optional.empty();
        }
        String group = matcher.group(this.e);
        String group2 = matcher.group(this.d);
        return (group == null || group2 == null) ? Optional.empty() : Optional.of(new ctru(group, group2));
    }
}
