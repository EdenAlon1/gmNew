package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wrx implements wqq {
    private final wsa a;
    private final ffxx b;
    private final Set c;

    public wrx(wsb wsbVar) {
        wsa a = wsbVar.a(5);
        this.a = a;
        this.b = a.c;
        this.c = a.d;
    }

    @Override // defpackage.wqq
    public final Set a() {
        return this.c;
    }

    @Override // defpackage.wqq
    public final ffxx b() {
        return this.b;
    }
}
