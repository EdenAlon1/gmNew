package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jbh extends ffkk implements ffjm {
    final /* synthetic */ AndroidComposeView a;
    final /* synthetic */ ffjm b;
    final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jbh(AndroidComposeView androidComposeView, ffjm ffjmVar, int i) {
        super(2);
        this.a = androidComposeView;
        this.b = ffjmVar;
        this.c = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int a = hip.a(this.c | 1);
        AndroidCompositionLocals_androidKt.a(this.a, this.b, (hfd) obj, a);
        return ffcu.a;
    }
}
