package defpackage;

import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emmy {
    public final Pattern a;
    public final Pattern b;
    public final int c;

    public emmy(emhm emhmVar) {
        this.a = Pattern.compile(emhmVar.b, 64);
        this.c = emhmVar.c;
        String str = emhmVar.d;
        this.b = !str.isEmpty() ? Pattern.compile(str, 64) : null;
    }
}
