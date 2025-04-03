package defpackage;

import android.content.Context;
import android.os.Process;
import android.os.UserManager;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eapo implements eaox {
    public static final entd a = entd.c("GnpSdk");
    private final Context b;
    private final ealr c;

    public eapo(Context context, ealr ealrVar, eaow eaowVar) {
        context.getClass();
        ealrVar.getClass();
        eaowVar.getClass();
        this.b = context;
        this.c = ealrVar;
    }

    @Override // defpackage.eaox
    public final exsv a(eagt eagtVar) {
        String p;
        exsu exsuVar = (exsu) exsv.a.createBuilder();
        exsuVar.getClass();
        String packageName = this.b.getApplicationContext().getPackageName();
        packageName.getClass();
        exsuVar.copyOnWrite();
        exsv exsvVar = (exsv) exsuVar.instance;
        exsvVar.b |= 1;
        exsvVar.e = packageName;
        exss exssVar = (exss) exst.a.createBuilder();
        exssVar.getClass();
        exssVar.copyOnWrite();
        exst exstVar = (exst) exssVar.instance;
        exstVar.c = 3;
        exstVar.b |= 1;
        if (eagtVar != null && (p = eagtVar.p()) != null) {
            exssVar.copyOnWrite();
            exst exstVar2 = (exst) exssVar.instance;
            exstVar2.b |= 8;
            exstVar2.e = p;
        }
        exrj exrjVar = (exrj) exrk.a.createBuilder();
        exrjVar.getClass();
        exru exruVar = (exru) exrv.a.createBuilder();
        exruVar.getClass();
        String packageName2 = this.b.getApplicationContext().getPackageName();
        packageName2.getClass();
        exruVar.copyOnWrite();
        exrv exrvVar = (exrv) exruVar.instance;
        exrvVar.b |= 8;
        exrvVar.f = packageName2;
        Object systemService = this.b.getSystemService("user");
        systemService.getClass();
        long serialNumberForUser = ((UserManager) systemService).getSerialNumberForUser(Process.myUserHandle());
        Long l = null;
        Long valueOf = serialNumberForUser == -1 ? null : Long.valueOf(serialNumberForUser);
        if (valueOf != null) {
            long longValue = valueOf.longValue();
            exruVar.copyOnWrite();
            exrv exrvVar2 = (exrv) exruVar.instance;
            exrvVar2.b |= 16;
            exrvVar2.g = longValue;
        }
        if (fdon.a.get().b() || eagtVar == null) {
            String b = this.c.b();
            if (b != null && b.length() != 0) {
                exruVar.copyOnWrite();
                exrv exrvVar3 = (exrv) exruVar.instance;
                exrvVar3.b |= 1;
                exrvVar3.c = b;
            }
            try {
                long b2 = digu.b(this.b.getContentResolver(), "android_id", -1L);
                Long valueOf2 = b2 == -1 ? null : Long.valueOf(b2);
                if (valueOf2 == null) {
                    ((ensz) a.j()).q("Failed to get android ID.");
                }
                l = valueOf2;
            } catch (SecurityException e) {
                ((ensz) ((ensz) a.i()).g(e)).q("Exception reading GServices key - ANDROID_ID.");
            }
            if (l != null) {
                long longValue2 = l.longValue();
                exruVar.copyOnWrite();
                exrv exrvVar4 = (exrv) exruVar.instance;
                exrvVar4.b |= 4;
                exrvVar4.e = longValue2;
            }
        }
        eyfy build = exruVar.build();
        build.getClass();
        exrl.b((exrv) build, exrjVar);
        exrk a2 = exrl.a(exrjVar);
        exssVar.copyOnWrite();
        exst exstVar3 = (exst) exssVar.instance;
        exstVar3.d = a2;
        exstVar3.b |= 2;
        eyfy build2 = exssVar.build();
        build2.getClass();
        exsuVar.copyOnWrite();
        exsv exsvVar2 = (exsv) exsuVar.instance;
        exsvVar2.d = (exst) build2;
        exsvVar2.c = 1;
        eyfy build3 = exsuVar.build();
        build3.getClass();
        return (exsv) build3;
    }
}
