package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hxa extends ffkk implements ffji {
    final /* synthetic */ fflb a;
    final /* synthetic */ hxb b;
    final /* synthetic */ hww c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hxa(fflb fflbVar, hxb hxbVar, hww hwwVar) {
        super(1);
        this.a = fflbVar;
        this.b = hxbVar;
        this.c = hwwVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ixv ixvVar = (ixv) obj;
        hxb hxbVar = (hxb) ixvVar;
        if (!((AndroidComposeView) isx.f(this.b)).f.b.contains(hxbVar) || !hxc.b(hxbVar, hxd.a(this.c))) {
            return ixu.a;
        }
        this.a.a = ixvVar;
        return ixu.c;
    }
}
