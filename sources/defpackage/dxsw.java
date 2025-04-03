package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxsw {
    public final dxsy a;
    public final int b;

    public dxsw(dxsy dxsyVar, int i) {
        this.a = dxsyVar;
        this.b = i;
    }

    public final void a(dwso dwsoVar) {
        if (this.b - 1 != 0) {
            c(1113, dwsoVar);
        } else {
            c(1008, dwsoVar);
        }
    }

    public final void b(dwso dwsoVar) {
        if (this.b - 1 != 0) {
            c(1111, dwsoVar);
        } else {
            c(1072, dwsoVar);
        }
    }

    public final void c(int i, dwso dwsoVar) {
        this.a.m(i, dwsoVar.d, dwsoVar.f, dwsoVar.t, dwsoVar.u);
    }
}
