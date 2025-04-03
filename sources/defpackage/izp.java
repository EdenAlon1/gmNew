package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class izp extends ffhr {
    public /* synthetic */ Object a;
    final /* synthetic */ AndroidComposeView b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public izp(AndroidComposeView androidComposeView, ffgu ffguVar) {
        super(ffguVar);
        this.b = androidComposeView;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.o(null, this);
    }
}
