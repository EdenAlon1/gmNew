package defpackage;

import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjci {
    public static final entd a = entd.c("BugleNotifications");
    public final errl b;
    public final Optional c;
    public final ffbr d;
    public final ffbr e;

    public cjci(errl errlVar, Optional optional, ffbr ffbrVar, ffbr ffbrVar2) {
        this.b = errlVar;
        this.c = optional;
        this.d = ffbrVar;
        this.e = ffbrVar2;
    }

    public static boolean b() {
        return ((Boolean) cjau.a.e()).booleanValue() && ctid.c;
    }

    public static boolean c() {
        return ((Boolean) ctjd.e.e()).booleanValue() && ctid.b;
    }

    public final void a(List list) {
        if (list.isEmpty()) {
            return;
        }
        ((ctqh) this.d.b()).s(list, fbrd.SHOWN);
    }
}
