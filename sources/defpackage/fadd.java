package defpackage;

import com.google.research.xeno.effect.Effect;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fadd implements faex {
    final /* synthetic */ fadg a;
    final /* synthetic */ facu b;
    final /* synthetic */ String c;

    public fadd(fadg fadgVar, facu facuVar, String str) {
        this.a = fadgVar;
        this.b = facuVar;
        this.c = str;
    }

    @Override // defpackage.faex
    public final void a(long j) {
        if (j == 0) {
            Effect.b(this.a, null, "RemoteAssetManager failed to natively load");
            return;
        }
        facu facuVar = this.b;
        Effect.nativeLoadChoreoWithRemoteAssetManager(facuVar.toByteArray(), j, this.c, new fadc(this.a));
    }
}
