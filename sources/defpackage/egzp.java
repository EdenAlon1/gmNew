package defpackage;

import android.view.View;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class egzp implements kud {
    final /* synthetic */ egzt a;

    public egzp(egzt egztVar) {
        this.a = egztVar;
    }

    @Override // defpackage.kud
    public final kxh ey(View view, kxh kxhVar) {
        egzt egztVar = this.a;
        kxh kxhVar2 = true != egztVar.getFitsSystemWindows() ? null : kxhVar;
        if (!Objects.equals(egztVar.f, kxhVar2)) {
            egztVar.f = kxhVar2;
            egztVar.requestLayout();
        }
        return kxhVar.m();
    }
}
