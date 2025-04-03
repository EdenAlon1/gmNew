package defpackage;

import com.google.research.xeno.effect.Effect;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fadb implements faex {
    final /* synthetic */ fadg a;
    final /* synthetic */ fadn b;
    final /* synthetic */ String c;

    public fadb(fadg fadgVar, fadn fadnVar, String str) {
        this.a = fadgVar;
        this.b = fadnVar;
        this.c = str;
    }

    @Override // defpackage.faex
    public final void a(long j) {
        if (j == 0) {
            Effect.b(this.a, null, "RemoteAssetManager failed to natively load");
            return;
        }
        fadn fadnVar = this.b;
        Effect.nativeLoadWithRemoteAssetManager(fadnVar.toByteArray(), j, this.c, new fada(this.a));
    }
}
