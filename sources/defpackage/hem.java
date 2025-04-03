package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class hem implements hep {
    public final Object a;
    public Object b;
    private final ArrayList c = new ArrayList();

    public hem(Object obj) {
        this.a = obj;
        this.b = obj;
    }

    @Override // defpackage.hep
    public final Object a() {
        return this.b;
    }

    @Override // defpackage.hep
    public final /* synthetic */ void b(ffjm ffjmVar, Object obj) {
        heo.a(this, ffjmVar, obj);
    }

    @Override // defpackage.hep
    public final void c() {
        this.c.clear();
        this.b = this.a;
        e();
    }

    @Override // defpackage.hep
    public final void d(Object obj) {
        this.c.add(this.b);
        this.b = obj;
    }

    protected abstract void e();

    @Override // defpackage.hep
    public /* synthetic */ void g() {
        throw null;
    }

    @Override // defpackage.hep
    public final void h() {
        this.b = hkw.a(this.c);
    }

    @Override // defpackage.hep
    public /* synthetic */ void f() {
    }
}
