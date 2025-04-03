package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bclb implements bckb {
    public static final bclb a = new bclb();

    private bclb() {
    }

    @Override // defpackage.bckb
    public final long a() {
        bsob e = bsom.e();
        e.z("queryTableMaxId");
        return e.b().k(bsom.c.a);
    }

    @Override // defpackage.bckb
    public final bckn b() {
        return bckf.a;
    }

    @Override // defpackage.bckb
    public final dtvx c() {
        String[] strArr = bsom.a;
        return new dtvx("conversations", "$primary");
    }

    @Override // defpackage.bckb
    public final /* synthetic */ String d() {
        return bcka.a(this);
    }
}
