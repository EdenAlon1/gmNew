package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bckz implements bckb {
    public static final bckz a = new bckz();

    private bckz() {
    }

    @Override // defpackage.bckb
    public final long a() {
        String[] strArr = bryh.a;
        brye bryeVar = new brye(bryh.a);
        bryeVar.z("queryTableMaxId");
        return bryeVar.b().k(bryh.c.a);
    }

    @Override // defpackage.bckb
    public final bckn b() {
        return bckf.h;
    }

    @Override // defpackage.bckb
    public final dtvx c() {
        if (!auci.a()) {
            String[] strArr = bryh.a;
            return new dtvx("conversation_pin", "$primary");
        }
        String[] strArr2 = bryh.a;
        dtvx dtvxVar = new dtvx("conversation_pin", "$primary");
        dtvxVar.d = 4;
        return dtvxVar;
    }

    @Override // defpackage.bckb
    public final /* synthetic */ String d() {
        return bcka.a(this);
    }
}
