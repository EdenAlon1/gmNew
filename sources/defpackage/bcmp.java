package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bcmp implements bckb {
    public static final bcmp a = new bcmp();

    private bcmp() {
    }

    @Override // defpackage.bckb
    public final long a() {
        String[] strArr = bumm.a;
        bumh bumhVar = new bumh(bumm.a);
        bumhVar.z("queryTableMaxId");
        return bumhVar.b().k(bumm.c.a);
    }

    @Override // defpackage.bckb
    public final bckn b() {
        return bckf.g;
    }

    @Override // defpackage.bckb
    public final dtvx c() {
        if (!auci.a()) {
            String[] strArr = bumm.a;
            return new dtvx("message_star", "$primary");
        }
        String[] strArr2 = bumm.a;
        dtvx dtvxVar = new dtvx("message_star", "$primary");
        dtvxVar.d = 4;
        return dtvxVar;
    }

    @Override // defpackage.bckb
    public final /* synthetic */ String d() {
        return bcka.a(this);
    }
}
