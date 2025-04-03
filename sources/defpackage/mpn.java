package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mpn {
    public static boolean a(Throwable th) {
        return lvf.a == 34 && (th instanceof NoSuchMethodError) && th.getMessage() != null && th.getMessage().contains("Landroid/media/NotProvisionedException;.<init>(");
    }

    public static boolean b(Throwable th) {
        return lvf.a == 34 && (th instanceof NoSuchMethodError) && th.getMessage() != null && th.getMessage().contains("Landroid/media/ResourceBusyException;.<init>(");
    }

    public static byte[] c(lwn lwnVar, String str, byte[] bArr, Map map) {
        Map map2;
        List list;
        lxo lxoVar = new lxo(lwnVar);
        lwu lwuVar = new lwu();
        lwuVar.b(str);
        lwuVar.d = map;
        lwuVar.b = 2;
        lwuVar.c = bArr;
        lwuVar.f = 1;
        lwv a = lwuVar.a();
        int i = 0;
        while (true) {
            try {
                lws lwsVar = new lws(lxoVar, a);
                try {
                    try {
                        return eoej.b(lwsVar);
                    } catch (lxj e) {
                        int i2 = e.c;
                        String str2 = null;
                        if ((i2 == 307 || i2 == 308) && i < 5 && (map2 = e.d) != null && (list = (List) map2.get("Location")) != null && !list.isEmpty()) {
                            str2 = (String) list.get(0);
                        }
                        if (str2 == null) {
                            throw e;
                        }
                        i++;
                        lwu lwuVar2 = new lwu(a);
                        lwuVar2.b(str2);
                        a = lwuVar2.a();
                    }
                } finally {
                    lvf.S(lwsVar);
                }
            } catch (Exception e2) {
                lxoVar.e();
                throw new mpy(e2);
            }
        }
    }
}
