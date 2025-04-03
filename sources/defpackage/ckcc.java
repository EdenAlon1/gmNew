package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class ckcc implements Supplier {
    public static final ckcc a = new ckcc();

    @Override // java.util.function.Supplier
    public final /* synthetic */ Object get() {
        return new IllegalStateException("senderMessagingIdentity expected");
    }
}
