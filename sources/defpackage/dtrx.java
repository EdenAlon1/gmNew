package defpackage;

import android.content.ContentValues;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtrx extends dtsf {
    private final int a;

    public dtrx(String str, int i) {
        super(str);
        this.a = i;
    }

    @Override // defpackage.duaw
    public final void a(dtzu dtzuVar, StringBuilder sb, List list) {
        b(dtzuVar, sb);
    }

    @Override // defpackage.duaw
    public final void b(dtzu dtzuVar, StringBuilder sb) {
        sb.append('(');
        sb.append(f(dtzuVar.a()));
        sb.append(' ');
        sb.append(g(this.a));
        sb.append(')');
    }

    @Override // defpackage.duaw
    protected final boolean d(String str, ContentValues contentValues) {
        return this.a + (-1) != 4 ? contentValues.get(this.f) == null : contentValues.get(this.f) != null;
    }
}
