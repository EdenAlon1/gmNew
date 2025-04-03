package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jeg extends ffkk implements ffji {
    final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jeg(int i) {
        super(1);
        this.a = i;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(((View) obj).getId() == this.a);
    }
}
