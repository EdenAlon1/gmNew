package defpackage;

import j$.util.stream.Stream;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddpt {
    private final aelz a;

    public ddpt(aelz aelzVar) {
        this.a = aelzVar;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [android.database.Cursor, bfkf] */
    /* JADX WARN: Type inference failed for: r2v6, types: [android.database.Cursor, bfkf] */
    public final ddpv a(cbpb cbpbVar, String str) {
        engw engwVar;
        ddpn ddpnVar = new ddpn();
        int i = engw.d;
        ddpnVar.d(enou.a);
        ddpnVar.b(enou.a);
        ddpnVar.c(enpd.a);
        Stream.Builder builder = Stream.CC.builder();
        ?? r2 = ((cbmd) cbpbVar.b()).a;
        try {
            r2.dh();
            while (r2.moveToNext()) {
                builder.add(this.a.b(aeki.aj(r2), new HashMap(), ""));
            }
            r2.close();
            ddpnVar.d((engw) builder.build().collect(endq.a));
            if (cbpbVar.a().c()) {
                engwVar = enou.a;
            } else {
                Stream.Builder builder2 = Stream.CC.builder();
                r2 = ((cbmd) cbpbVar.a()).a;
                try {
                    r2.dh();
                    while (r2.moveToNext()) {
                        builder2.add(this.a.b(aeki.aj(r2), new HashMap(), str));
                    }
                    r2.close();
                    engwVar = (engw) builder2.build().collect(endq.a);
                } finally {
                }
            }
            ddpnVar.b(engwVar);
            ddpnVar.c(((cbmd) cbpbVar.a()).b);
            return ddpnVar.a();
        } finally {
        }
    }
}
