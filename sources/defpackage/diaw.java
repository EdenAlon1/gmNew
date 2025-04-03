package defpackage;

import com.google.android.gms.wearable.internal.ChannelEventParcelable;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class diaw implements Runnable {
    final /* synthetic */ ChannelEventParcelable a;
    final /* synthetic */ diax b;

    public diaw(diax diaxVar, ChannelEventParcelable channelEventParcelable) {
        this.a = channelEventParcelable;
        this.b = diaxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a(this.b.a);
        this.a.a(this.b.a.K);
    }
}
