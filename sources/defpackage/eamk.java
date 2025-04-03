package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eamk implements ealz {
    public static final entd a = entd.c("GnpSdk");
    private final Context b;
    private final fazb c;
    private final ealr d;

    public eamk(Context context, fazb fazbVar, ealr ealrVar) {
        context.getClass();
        fazbVar.getClass();
        ealrVar.getClass();
        this.b = context;
        this.c = fazbVar;
        this.d = ealrVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00dd A[Catch: eals -> 0x010f, TryCatch #0 {eals -> 0x010f, blocks: (B:2:0x0000, B:4:0x0049, B:5:0x0058, B:7:0x005f, B:8:0x0073, B:11:0x007b, B:13:0x007e, B:16:0x0085, B:18:0x008b, B:20:0x0091, B:22:0x00a0, B:25:0x00a6, B:28:0x00ec, B:32:0x00ab, B:34:0x00ad, B:41:0x00bb, B:39:0x00dd, B:44:0x00ce), top: B:1:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ defpackage.eafl d(defpackage.eamk r8, boolean r9, boolean r10, boolean r11, int r12) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eamk.d(eamk, boolean, boolean, boolean, int):eafl");
    }

    private final synchronized String e(boolean z) {
        String string = ((SharedPreferences) this.c.b()).getString("fetch_only_id", null);
        if (!TextUtils.isEmpty(string) || !z) {
            return string;
        }
        String uuid = UUID.randomUUID().toString();
        ((SharedPreferences) this.c.b()).edit().putString("fetch_only_id", uuid).apply();
        return uuid;
    }

    @Override // defpackage.ealz
    public final eafl a(ealy ealyVar) {
        return d(this, ealyVar.a, ealyVar.b, ealyVar.c, 8);
    }

    @Override // defpackage.ealz
    public final eafl b(boolean z) {
        eafl d = d(this, false, z, z, 1);
        if (!(d instanceof eafo)) {
            return (eafh) d;
        }
        exrj exrjVar = (exrj) exrk.a.createBuilder();
        exrjVar.getClass();
        extr extrVar = (extr) ((eafo) d).a;
        exue exueVar = extrVar.b == 1 ? (exue) extrVar.c : exue.a;
        exru exruVar = (exru) exrv.a.createBuilder();
        if ((exueVar.b & 1) != 0) {
            String str = exueVar.c;
            exruVar.copyOnWrite();
            exrv exrvVar = (exrv) exruVar.instance;
            str.getClass();
            exrvVar.b = 1 | exrvVar.b;
            exrvVar.c = str;
        }
        if ((exueVar.b & 2) != 0) {
            String str2 = exueVar.d;
            exruVar.copyOnWrite();
            exrv exrvVar2 = (exrv) exruVar.instance;
            str2.getClass();
            exrvVar2.b |= 2;
            exrvVar2.d = str2;
        }
        if ((exueVar.b & 4) != 0) {
            long j = exueVar.e;
            exruVar.copyOnWrite();
            exrv exrvVar3 = (exrv) exruVar.instance;
            exrvVar3.b |= 4;
            exrvVar3.e = j;
        }
        if ((exueVar.b & 8) != 0) {
            String str3 = exueVar.f;
            exruVar.copyOnWrite();
            exrv exrvVar4 = (exrv) exruVar.instance;
            str3.getClass();
            exrvVar4.b |= 8;
            exrvVar4.f = str3;
        }
        if ((exueVar.b & 16) != 0) {
            long j2 = exueVar.g;
            exruVar.copyOnWrite();
            exrv exrvVar5 = (exrv) exruVar.instance;
            exrvVar5.b |= 16;
            exrvVar5.g = j2;
        }
        exrl.b((exrv) exruVar.build(), exrjVar);
        return new eafo(exrl.a(exrjVar));
    }

    @Override // defpackage.ealz
    public final void c() {
        if (TextUtils.isEmpty(((SharedPreferences) this.c.b()).getString("fetch_only_id", null))) {
            return;
        }
        ((SharedPreferences) this.c.b()).edit().putString("fetch_only_id", UUID.randomUUID().toString()).apply();
    }
}
