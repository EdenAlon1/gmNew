package defpackage;

import com.google.research.xeno.effect.Effect;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fadf implements faex {
    final /* synthetic */ fadg a;
    final /* synthetic */ facs b;
    final /* synthetic */ String c;

    public fadf(fadg fadgVar, facs facsVar, String str) {
        this.a = fadgVar;
        this.b = facsVar;
        this.c = str;
    }

    @Override // defpackage.faex
    public final void a(long j) {
        if (j == 0) {
            Effect.b(this.a, null, "RemoteAssetManager failed to natively load");
            return;
        }
        facs facsVar = this.b;
        Effect.nativeLoadCapabilityWithRemoteAssetManager(facsVar.toByteArray(), j, this.c, new fade(this.a));
    }
}
