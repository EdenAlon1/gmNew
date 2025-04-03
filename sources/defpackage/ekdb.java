package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekdb {
    public final ffbr a;
    public final ffbr b;
    public final errl c;
    public final ecvo d;
    public final ekcs e;
    private final ffbz f;

    public ekdb(ffbr ffbrVar, ffbr ffbrVar2, errl errlVar, ecvo ecvoVar, ekcs ekcsVar) {
        errlVar.getClass();
        ecvoVar.getClass();
        this.a = ffbrVar;
        this.b = ffbrVar2;
        this.c = errlVar;
        this.d = ecvoVar;
        this.e = ekcsVar;
        this.f = ffca.a(new ffix() { // from class: ekcw
            @Override // defpackage.ffix
            public final Object invoke() {
                return new ConcurrentHashMap(((Map) ekdb.this.b.b()).size(), 0.75f, 4);
            }
        });
    }

    public final ListenableFuture a(String str, ecwu ecwuVar) {
        String str2 = ecwuVar.c;
        str2.getClass();
        if (str2.length() == 0) {
            ecvo ecvoVar = this.d;
            if (!ecvoVar.f.a(this.e.a(str)).d) {
                return erre.a;
            }
        }
        ekda ekdaVar = new ekda(this, str, ecwuVar);
        ekda ekdaVar2 = (ekda) ((ConcurrentHashMap) this.f.a()).put(str, ekdaVar);
        if (ekdaVar2 == null || !ffkj.e(ekdaVar2.b.c, ecwuVar.c)) {
            ekdaVar2 = ekdaVar;
        }
        ekdaVar.c.m(ekdaVar2.d.c());
        return ekdaVar.c;
    }
}
