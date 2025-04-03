package defpackage;

import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nmj {
    public static final Comparator a = new Comparator() { // from class: nmi
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Integer.compare(((nmj) obj).b.b, ((nmj) obj2).b.b);
        }
    };
    public final nmk b;
    public final int c;

    public nmj(nmk nmkVar, int i) {
        this.b = nmkVar;
        this.c = i;
    }
}
