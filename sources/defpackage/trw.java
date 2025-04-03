package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class trw implements tqz {
    private static final cskc a = cskc.g("BugleCms", "ParticipantEventHandler");
    private final tsc b;

    public trw(tsc tscVar) {
        this.b = tscVar;
    }

    @Override // defpackage.tqz
    public final /* bridge */ /* synthetic */ ListenableFuture a(eszk eszkVar) {
        if (eszkVar.b != 4) {
            csjb e = a.e();
            e.A(cdii.u.a, eszj.a(eszkVar.b));
            e.I("Cannot handle event");
            e.r();
            return elfo.e(null);
        }
        etak etakVar = (etak) eszkVar.c;
        int i = etakVar.b;
        int b = etaj.b(i);
        if (b == 0) {
            b = 1;
        }
        if (b - 2 == 1) {
            tsc tscVar = this.b;
            String str = etakVar.c;
            int b2 = etaj.b(i);
            return tscVar.a(str, etaj.a(b2 != 0 ? b2 : 1));
        }
        csjb a2 = a.a();
        String str2 = cdii.t.a;
        int b3 = etaj.b(etakVar.b);
        a2.A(str2, etaj.a(b3 != 0 ? b3 : 1));
        a2.A(cdii.v.a, "Ignore");
        a2.A(cdii.w.a, etakVar.c);
        a2.A(cdii.x.a, "Not implemented");
        a2.I("ParticipantEvent received");
        a2.r();
        return elfo.e(null);
    }
}
