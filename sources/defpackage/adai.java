package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class adai implements Runnable {
    final /* synthetic */ MessageIdType a;
    final /* synthetic */ adaj b;
    final /* synthetic */ String c;

    public adai(MessageIdType messageIdType, adaj adajVar, String str) {
        this.a = messageIdType;
        this.b = adajVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bueg.f(this.a, new adag(this.b, this.c), adah.a);
    }
}
