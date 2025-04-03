package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class bapy implements ffji {
    final /* synthetic */ String a;
    final /* synthetic */ int b;

    public bapy(String str, int i) {
        this.a = str;
        this.b = i;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        akni akniVar = (akni) obj;
        akniVar.getClass();
        akniVar.a(Uri.parse(this.a), this.b);
        return ffcu.a;
    }
}
