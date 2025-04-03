package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class obw {
    public static final boolean a(nzh nzhVar, int i) {
        Iterator a = nzb.b(nzhVar).a();
        while (a.hasNext()) {
            if (((nzh) a.next()).j == i) {
                return true;
            }
        }
        return false;
    }
}
