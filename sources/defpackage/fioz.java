package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fioz {
    private final BitSet a;

    public fioz(fioy fioyVar) {
        this.a = fioyVar.a;
    }

    public static fioy a() {
        return new fioy(new BitSet());
    }

    public final fioy b() {
        return new fioy((BitSet) this.a.clone());
    }

    public final boolean c(char c) {
        return this.a.get(c);
    }
}
