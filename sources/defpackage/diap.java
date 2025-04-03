package defpackage;

import com.google.android.gms.wearable.internal.MessageEventParcelable;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class diap implements Runnable {
    final /* synthetic */ MessageEventParcelable a;
    final /* synthetic */ diax b;

    public diap(diax diaxVar, MessageEventParcelable messageEventParcelable) {
        this.a = messageEventParcelable;
        this.b = diaxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a.k(this.a);
    }
}
