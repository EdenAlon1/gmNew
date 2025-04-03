package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fioy {
    public final BitSet a;

    public fioy(BitSet bitSet) {
        this.a = bitSet;
    }

    public final void a(char c) {
        this.a.set(c);
    }

    public final void b(char c, char c2) {
        while (c <= c2) {
            a(c);
            c = (char) (c + 1);
        }
    }
}
