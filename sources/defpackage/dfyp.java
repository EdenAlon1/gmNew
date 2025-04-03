package defpackage;

import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfyp extends entb {
    public static final ensn a = dfyq.a;
    private int d;
    private final int e;

    public dfyp(ento entoVar, int i) {
        super(entoVar);
        this.e = i;
        this.d = -1;
    }

    public static dfyp c(String str, int i) {
        return new dfyp(Cenum.d(str), i);
    }

    @Override // defpackage.enrg
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ensz a(Level level) {
        if (!m(level)) {
            return c;
        }
        int valueOf = this.d != -1 ? 0 : Integer.valueOf(this.e - 2);
        this.d = -1;
        dfyo dfyoVar = new dfyo(this, level);
        dfyoVar.Y(a, valueOf);
        return dfyoVar;
    }
}
