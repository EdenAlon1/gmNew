package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfvx extends dfvy {
    final /* synthetic */ Intent a;
    final /* synthetic */ dfti b;

    public dfvx(Intent intent, dfti dftiVar) {
        this.a = intent;
        this.b = dftiVar;
    }

    @Override // defpackage.dfvy
    public final void a() {
        Intent intent = this.a;
        if (intent != null) {
            this.b.startActivityForResult(intent, 2);
        }
    }
}
