package defpackage;

import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emia {
    public final Pattern a;
    public final Pattern b;
    public final int c;

    public emia(emhe emheVar) {
        Pattern compile = Pattern.compile(emheVar.b, 64);
        this.a = compile;
        int i = emheVar.c;
        this.c = i;
        String str = emheVar.d;
        this.b = !str.isEmpty() ? Pattern.compile(str, 64) : null;
        boolean z = i > 0 && i <= compile.matcher("").groupCount();
        String str2 = emheVar.b;
        if (!z) {
            throw new IllegalStateException(emyk.a("Regex \"%s\" was invalid with \"%s\" capture group", str2, Integer.valueOf(i)));
        }
    }
}
