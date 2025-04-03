package defpackage;

/* compiled from: PG */
@Deprecated
/* loaded from: classes4.dex */
public final class dwcj extends dvxa {
    final /* synthetic */ dwck d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dwcj(dwck dwckVar, dvxd dvxdVar) {
        super(dvxdVar);
        this.d = dwckVar;
    }

    @Deprecated
    public final dvxe a(Object obj) {
        emxf.l(this.d.a.get(obj) == null);
        dvxe e = e(this.d.b.e);
        dwcl dwclVar = new dwcl(e);
        e.f = dwclVar;
        dwclVar.l();
        this.d.a.put(obj, e);
        this.d.b.f.e(e);
        return e;
    }
}
