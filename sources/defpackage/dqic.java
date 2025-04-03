package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqic implements mw {
    final /* synthetic */ List a;

    public dqic(List list) {
        this.a = list;
    }

    @Override // defpackage.mw
    public final void a(int i, int i2, Object obj) {
        this.a.add(new dqhu(i, i2, obj));
    }

    @Override // defpackage.mw
    public final void b(int i, int i2) {
        this.a.add(new dqhv(i, i2));
    }

    @Override // defpackage.mw
    public final void c(int i, int i2) {
        this.a.add(new dqhw(i, i2));
    }

    @Override // defpackage.mw
    public final void d(int i, int i2) {
        this.a.add(new dqhx(i, i2));
    }
}
