package defpackage;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kti implements kth {
    ClipData a;
    final int b;
    int c;
    Uri d;
    Bundle e;

    public kti(ClipData clipData, int i) {
        this.a = clipData;
        this.b = i;
    }

    @Override // defpackage.kth
    public final ktm a() {
        return new ktm(new ktl(this));
    }

    @Override // defpackage.kth
    public final void b(ClipData clipData) {
        this.a = clipData;
    }

    @Override // defpackage.kth
    public final void c(Bundle bundle) {
        this.e = bundle;
    }

    @Override // defpackage.kth
    public final void d(int i) {
        this.c = i;
    }

    @Override // defpackage.kth
    public final void e(Uri uri) {
        this.d = uri;
    }

    public kti(ktm ktmVar) {
        this.a = ktmVar.d();
        this.b = ktmVar.b();
        this.c = ktmVar.a();
        this.d = ktmVar.a.d();
        this.e = ktmVar.a.e();
    }
}
