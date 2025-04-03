package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bcmo implements bckb {
    public static final bcmo a = new bcmo();

    private bcmo() {
    }

    @Override // defpackage.bckb
    public final long a() {
        String[] strArr = bufy.a;
        return new bufs(bufy.a).b().k(bufy.c.a);
    }

    @Override // defpackage.bckb
    public final bckn b() {
        return bckf.j;
    }

    @Override // defpackage.bckb
    public final dtvx c() {
        if (!auci.a()) {
            String[] strArr = bufy.a;
            return new dtvx("message_replies", "$primary");
        }
        String[] strArr2 = bufy.a;
        dtvx dtvxVar = new dtvx("message_replies", "$primary");
        dtvxVar.d = 4;
        return dtvxVar;
    }

    @Override // defpackage.bckb
    public final /* synthetic */ String d() {
        return bcka.a(this);
    }
}
