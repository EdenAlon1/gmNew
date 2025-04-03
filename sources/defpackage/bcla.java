package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bcla implements bckb {
    public static final bcla a = new bcla();

    private bcla() {
    }

    @Override // defpackage.bckb
    public final long a() {
        String[] strArr = bsdr.a;
        new bsdm(bsdr.a).z("queryTableMaxId");
        return r0.b().i();
    }

    @Override // defpackage.bckb
    public final bckn b() {
        return bckf.f;
    }

    @Override // defpackage.bckb
    public final dtvx c() {
        String[] strArr = bsdr.a;
        return new dtvx("conversation_to_participants", "$primary");
    }

    @Override // defpackage.bckb
    public final /* synthetic */ String d() {
        return bcka.a(this);
    }
}
