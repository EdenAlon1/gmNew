package defpackage;

import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvzy implements dvzx {
    public final List a;
    public final int b;
    private final int c;

    public dvzy(int i, List list, int i2) {
        this.b = i;
        this.a = DesugarCollections.unmodifiableList(list);
        this.c = i2;
        if (i == 3) {
            emxf.a(i2 == -1);
        } else {
            emxf.a(i2 != -1);
        }
    }

    @Override // defpackage.dvzx
    public final /* synthetic */ dvxr a() {
        return dvzw.a(this);
    }

    @Override // defpackage.dvzx
    public final List b() {
        return this.a;
    }

    public final int c() {
        int i = this.b;
        boolean z = true;
        if (i != 1 && i != 2) {
            z = false;
        }
        emxf.l(z);
        return this.c;
    }
}
