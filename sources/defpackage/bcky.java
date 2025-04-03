package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bcky implements bckb {
    public static final bcky a = new bcky();

    private bcky() {
    }

    @Override // defpackage.bckb
    public final long a() {
        brwp a2 = brww.a();
        a2.z("queryTableMaxId");
        return a2.b().k(brww.c.a);
    }

    @Override // defpackage.bckb
    public final bckn b() {
        return bckf.e;
    }

    @Override // defpackage.bckb
    public final dtvx c() {
        String[] strArr = brww.a;
        return new dtvx("conversation_participants", "$primary");
    }

    @Override // defpackage.bckb
    public final /* synthetic */ String d() {
        return bcka.a(this);
    }
}
