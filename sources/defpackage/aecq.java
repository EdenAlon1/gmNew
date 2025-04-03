package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes2.dex */
class aecq implements ejlr<Void, Intent> {
    final /* synthetic */ aedh a;

    public aecq(aedh aedhVar) {
        this.a = aedhVar;
    }

    @Override // defpackage.ejlr
    public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        this.a.b.startActivityForResult((Intent) obj2, 2);
    }

    @Override // defpackage.ejlr
    public final /* bridge */ /* synthetic */ void m(Object obj, Throwable th) {
    }

    @Override // defpackage.ejlr
    public final /* synthetic */ void b(Object obj) {
    }
}
