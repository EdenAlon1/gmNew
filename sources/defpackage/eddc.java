package defpackage;

import java.util.regex.Matcher;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eddc {
    private final eddf a = new eddf();

    public final boolean a(CharSequence charSequence, edcz edczVar) {
        String str = edczVar.a;
        if (str.length() == 0) {
            return false;
        }
        Matcher matcher = this.a.a(str).matcher(charSequence);
        return matcher.lookingAt() && matcher.matches();
    }
}
