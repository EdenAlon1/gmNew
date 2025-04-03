package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awai {
    public final awam a;
    public final awap b;
    public final int c;
    public awui d;
    public final awcp e = new awcp();
    public final AtomicReference f;

    public awai(awam awamVar, awap awapVar, MessageCoreData messageCoreData, int i) {
        this.a = awamVar;
        this.b = awapVar;
        this.c = i;
        AtomicReference atomicReference = new AtomicReference(null);
        this.f = atomicReference;
        atomicReference.set(messageCoreData);
    }

    public final MessageCoreData a() {
        return (MessageCoreData) this.f.get();
    }
}
