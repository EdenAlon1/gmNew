package defpackage;

import java.util.ArrayList;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class myj {
    public static final Comparator a = new Comparator() { // from class: myg
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ((myi) obj).a - ((myi) obj2).a;
        }
    };
    public static final Comparator b = new Comparator() { // from class: myh
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Float.compare(((myi) obj).c, ((myi) obj2).c);
        }
    };
    public int f;
    public int g;
    public int h;
    public final myi[] d = new myi[5];
    public final ArrayList c = new ArrayList();
    public int e = -1;
}
