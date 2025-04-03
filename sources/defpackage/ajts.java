package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajts {
    public static final ajrt a(ajra ajraVar) {
        ajraVar.getClass();
        ajtm a = ajtn.a(ajraVar);
        if (a != ajtm.b && a != ajtm.c) {
            Objects.toString(a);
            throw new IllegalArgumentException("Using PlainTextContentExtractor on snippet type ".concat(String.valueOf(a)));
        }
        ajrs ajrsVar = (ajrs) ajrt.a.createBuilder();
        ajrsVar.getClass();
        ajru.c(ajraVar.b(), ajrsVar);
        ajrv ajrvVar = (ajrv) ajrw.a.createBuilder();
        ajrvVar.getClass();
        String d = ajraVar.d();
        if (d == null) {
            d = "";
        }
        ajrx.b(d, ajrvVar);
        ajru.b(ajrx.a(ajrvVar), ajrsVar);
        return ajru.a(ajrsVar);
    }
}
