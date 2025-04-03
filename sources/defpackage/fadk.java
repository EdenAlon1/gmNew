package defpackage;

import com.google.research.xeno.effect.Effect;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fadk implements fadg {
    final /* synthetic */ String a;
    final /* synthetic */ fadl b;

    public fadk(fadl fadlVar, String str) {
        this.a = str;
        this.b = fadlVar;
    }

    @Override // defpackage.fadg
    public final void a(Effect effect, String str) {
        this.b.a(this.a, effect, str);
    }
}
