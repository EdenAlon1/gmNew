package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bcmn implements bckb {
    public static final bcmn a = new bcmn();

    private bcmn() {
    }

    @Override // defpackage.bckb
    public final long a() {
        bueb a2 = bueg.a();
        a2.z("queryTableMaxId");
        return a2.b().k(bueg.c.a);
    }

    @Override // defpackage.bckb
    public final bckn b() {
        return bckf.i;
    }

    @Override // defpackage.bckb
    public final dtvx c() {
        if (!auci.a()) {
            String[] strArr = bueg.a;
            return new dtvx("message_reactions", "$primary");
        }
        String[] strArr2 = bueg.a;
        dtvx dtvxVar = new dtvx("message_reactions", "$primary");
        dtvxVar.d = 4;
        return dtvxVar;
    }

    @Override // defpackage.bckb
    public final /* synthetic */ String d() {
        return bcka.a(this);
    }
}
