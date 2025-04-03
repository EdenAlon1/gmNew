package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajtq {
    public static final ajrt a(ajra ajraVar) {
        ajrw a;
        ajraVar.getClass();
        ajtm a2 = ajtn.a(ajraVar);
        if (a2 != ajtm.g && a2 != ajtm.h && a2 != ajtm.a) {
            Objects.toString(a2);
            throw new IllegalArgumentException("Using FileContentExtractor on snippet type ".concat(String.valueOf(a2)));
        }
        ajrs ajrsVar = (ajrs) ajrt.a.createBuilder();
        ajrsVar.getClass();
        ajru.c(ajraVar.b(), ajrsVar);
        String str = ajraVar.d.d;
        if (str != null) {
            ajrv ajrvVar = (ajrv) ajrw.a.createBuilder();
            ajrvVar.getClass();
            ajrx.b(str, ajrvVar);
            a = ajrx.a(ajrvVar);
        } else {
            ajrv ajrvVar2 = (ajrv) ajrw.a.createBuilder();
            ajrvVar2.getClass();
            ajrx.c(9, ajrvVar2);
            a = ajrx.a(ajrvVar2);
        }
        ajru.b(a, ajrsVar);
        String c = ajraVar.c();
        if (c == null) {
            c = "application/octet-stream";
        }
        ajru.d(ajtp.a(c, null), ajrsVar);
        return ajru.a(ajrsVar);
    }
}
