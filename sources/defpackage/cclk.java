package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cclk implements cctr {
    private static final cskc a = cskc.g("BugleCms", "CmsKeyTriggers");
    private final cctp c;
    private final ashh d;

    public cclk(cctp cctpVar, ashh ashhVar) {
        this.c = cctpVar;
        this.d = ashhVar;
    }

    public static int c(int i) {
        if (i == 1) {
            return 20;
        }
        if (i == 2) {
            return 48;
        }
        if (i == 3) {
            return 24;
        }
        throw new IllegalArgumentException(a.h(i, "Invalid CMS key type: "));
    }

    public static int d(int i) {
        if ((i & 4) == 4) {
            return 1;
        }
        if ((i & 8) == 8) {
            return 3;
        }
        return (i & 32) == 32 ? 2 : 0;
    }

    public static final bqkw e(int i) {
        if (cctq.a(i, 16)) {
            return bqkw.BACKUP_CREATE;
        }
        if (cctq.a(i, 2)) {
            return bqkw.BACKUP_DELETE;
        }
        csjb e = a.e();
        e.I("Failed to parse key operation from flags, returning unknown AbandonedAction");
        e.y("flags", i);
        e.r();
        return bqkw.BACKUP_UNKNOWN_OPERATION;
    }

    private static String f(becg becgVar, int i, int i2, boolean z) {
        Object obj;
        a.q("Creating trigger SQL for operation " + becgVar.name() + " and type " + i);
        bech bechVar = new bech();
        bechVar.c = becgVar;
        bechVar.e = 32;
        bechVar.b = 7;
        bechVar.i = "key_index";
        bechVar.c();
        bechVar.a = a.h(i, "key_type_");
        becg becgVar2 = becg.INSERT;
        StringBuilder sb = new StringBuilder();
        sb.append(becgVar == becgVar2 ? "NEW" : "OLD");
        sb.append(".key_type = ");
        sb.append(i);
        bechVar.b(sb.toString());
        bechVar.g = i2;
        bechVar.h = z;
        obj = cctp.a.get();
        if (((Boolean) ((cfup) obj).e()).booleanValue()) {
            bechVar.b("NEW.cms_id IS NULL");
        }
        return bechVar.a();
    }

    private static String g(String str, int i) {
        String str2 = "DROP TRIGGER IF EXISTS on_cms_" + str.toLowerCase(Locale.US) + "_bkkey_type_" + i;
        a.q("Dropping trigger: ".concat(str2));
        return str2;
    }

    @Override // defpackage.cctr
    public final List a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(f(becg.INSERT, 1, c(1), this.d.a()));
        arrayList.add(f(becg.INSERT, 3, c(3), this.d.a()));
        arrayList.add(f(becg.INSERT, 2, c(2), this.d.a()));
        boolean a2 = this.d.a();
        a.q("Creating trigger SQL for delete object");
        bech bechVar = new bech();
        bechVar.c = becg.DELETE;
        bechVar.e = 32;
        bechVar.b = 7;
        bechVar.i = "cms_id";
        bechVar.c();
        bechVar.g = 2;
        bechVar.b("OLD.cms_id IS NOT NULL");
        bechVar.h = a2;
        arrayList.add(bechVar.a());
        return arrayList;
    }

    @Override // defpackage.cctr
    public final List b() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(g(becg.INSERT.name(), 1));
        arrayList.add(g(becg.INSERT.name(), 3));
        arrayList.add(g(becg.INSERT.name(), 2));
        arrayList.add(this.c.c(7, becg.DELETE));
        return arrayList;
    }
}
