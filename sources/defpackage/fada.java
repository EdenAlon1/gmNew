package defpackage;

import com.google.research.xeno.effect.Effect;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fada implements Effect.NativeLoadCallback {
    final /* synthetic */ fadg a;

    public fada(fadg fadgVar) {
        this.a = fadgVar;
    }

    @Override // com.google.research.xeno.effect.Effect.NativeLoadCallback
    public final void onCompletion(long j, String str) {
        Effect.b(this.a, j != 0 ? new Effect(j) : null, str);
    }
}
