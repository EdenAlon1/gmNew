package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eldi implements emwl {
    final /* synthetic */ elat a;
    final /* synthetic */ emwl b;

    public eldi(elat elatVar, emwl emwlVar) {
        this.a = elatVar;
        this.b = emwlVar;
    }

    @Override // defpackage.emwl
    public final Object apply(Object obj) {
        elat h = ekyf.h(ekyf.b(), this.a);
        try {
            return this.b.apply(obj);
        } finally {
        }
    }

    public final String toString() {
        return "propagating=[" + this.b + "]";
    }
}
