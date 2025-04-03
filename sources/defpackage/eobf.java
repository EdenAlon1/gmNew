package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eobf {
    public static int a(List list, enzy enzyVar) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == enzyVar) {
                return i;
            }
        }
        return -1;
    }
}
