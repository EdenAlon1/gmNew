package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class okr extends oil {
    public final List a = new ArrayList();

    @Override // defpackage.oil
    public final void a(int i, int i2) {
        this.a.add(0);
        this.a.add(Integer.valueOf(i));
        this.a.add(Integer.valueOf(i2));
    }

    @Override // defpackage.oil
    public final void b(int i, int i2) {
        this.a.add(1);
        this.a.add(Integer.valueOf(i));
        this.a.add(Integer.valueOf(i2));
    }
}
