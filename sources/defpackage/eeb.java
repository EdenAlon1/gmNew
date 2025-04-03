package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eeb {
    public static final int a(eea eeaVar) {
        List i = eeaVar.i();
        int size = i.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += ((eei) i.get(i3)).h;
        }
        return (i2 / i.size()) + eeaVar.c();
    }
}
