package defpackage;

import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nol {
    public final int a;
    public final String b;
    public final int c;
    public final List d;
    public final byte[] e;

    public nol(int i, String str, int i2, List list, byte[] bArr) {
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = list == null ? Collections.EMPTY_LIST : DesugarCollections.unmodifiableList(list);
        this.e = bArr;
    }

    public final int a() {
        int i = this.c;
        if (i != 2) {
            return i != 3 ? 0 : 512;
        }
        return 2048;
    }
}
