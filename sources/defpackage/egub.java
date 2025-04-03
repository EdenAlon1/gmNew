package defpackage;

import android.accounts.Account;
import android.content.Intent;
import java.util.Map;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egub extends lml {
    public final egsn a;
    public final ffsk b;
    public final ffsk c;
    public final hho d;
    public final hkx e;
    public final fgcm f;
    public final fgcm g;
    public final efug h;
    private final ffhd i;
    private final ffhd j;
    private final ffsk k;

    public egub(ffhd ffhdVar, ffhd ffhdVar2, ffsk ffskVar, egsn egsnVar, efug efugVar) {
        ffhdVar.getClass();
        ffhdVar2.getClass();
        ffskVar.getClass();
        this.i = ffhdVar;
        this.j = ffhdVar2;
        this.k = ffskVar;
        this.a = egsnVar;
        this.h = efugVar;
        ffsk d = ffsl.d(ffskVar, ffhdVar);
        this.b = d;
        this.c = ffsl.d(ffskVar, ffhdVar2);
        hic hicVar = new hic(egto.a, hla.a);
        this.d = hicVar;
        this.e = hicVar;
        this.f = fgdm.a(null);
        this.g = fgdm.a(null);
        ffqy.d(d, null, null, new egtu(this, null), 3);
    }

    public static final Intent b(Account account, ewom ewomVar, Map map) {
        ewomVar.getClass();
        Intent intent = new Intent();
        intent.setAction("com.google.android.gms.accountsettings.action.VIEW_SETTINGS");
        intent.setPackage("com.google.android.gms");
        intent.putExtra("extra.accountName", account.name);
        intent.putExtra("extra.screenId", ewomVar.qw);
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Objects.toString(key);
            String valueOf = String.valueOf(key);
            intent.putExtra("extra.screen.".concat(valueOf), (String) entry.getValue());
        }
        return intent;
    }

    public final void a(Account account) {
        account.getClass();
        ffqy.d(this.b, null, null, new egtw(this, account, null), 3);
    }
}
