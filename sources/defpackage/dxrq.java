package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxrq implements fbba {
    private final fbbf a;
    private final fbbf b;

    public dxrq(fbbf fbbfVar, fbbf fbbfVar2) {
        this.a = fbbfVar;
        this.b = fbbfVar2;
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        Context b = ((dxqe) this.a).b();
        emxc emxcVar = (emxc) this.b.b();
        Pattern pattern = efbs.a;
        efbr efbrVar = new efbr(b);
        efbrVar.f("mdd_pds_config");
        efbrVar.g(dxvb.d("DestSharedFiles", emxcVar));
        Uri a = efbrVar.a();
        a.getClass();
        return a;
    }
}
