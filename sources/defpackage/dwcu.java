package defpackage;

/* compiled from: PG */
@Deprecated
/* loaded from: classes4.dex */
public final class dwcu {
    private final dvyc a;
    private final dvxi b;

    public dwcu(dvyc dvycVar, dvxi dvxiVar) {
        this.a = dvycVar;
        this.b = dvxiVar;
    }

    public final dwcr a(dn dnVar) {
        emxf.m(((lkv) dnVar.P()).c == lkj.INITIALIZED, "Must be called in onCreate");
        return new dwcr(this.a, this.b, dnVar);
    }
}
