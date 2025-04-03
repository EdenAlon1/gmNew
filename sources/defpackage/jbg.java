package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jbg extends ffkk implements ffjm {
    final /* synthetic */ AndroidComposeView a;
    final /* synthetic */ jci b;
    final /* synthetic */ ffjm c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jbg(AndroidComposeView androidComposeView, jci jciVar, ffjm ffjmVar) {
        super(2);
        this.a = androidComposeView;
        this.b = jciVar;
        this.c = ffjmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        int intValue = ((Number) obj2).intValue();
        int i = intValue & 3;
        if (hfdVar.J(i != 2, intValue & 1)) {
            jdr.a(this.a, this.b, this.c, hfdVar, 0);
        } else {
            hfdVar.s();
        }
        return ffcu.a;
    }
}
